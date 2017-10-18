/*
 * GPL v3
 */

package org.kleini.dpdhl;

import java.math.BigInteger;
import java.util.List;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import org.kleini.bricklink.api.Configuration;
import de.deutschepost.dpdhl.wsprovider.dataobjects.AdditionalProductType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.BasicProductType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.CountryGroupType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.CountryType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.CurrencyAmountType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.DestinationAreaType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.ExternIdentifierType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListRequestType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListResponseType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListResponseType.AdditionalProductList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListResponseType.BasicProductList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListResponseType.ShortSalesProductList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.GetProductListResponseType.SpecialServiceList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.InternationalDestinationAreaType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.InternationalDestinationAreaType.CountryGroupList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.InternationalDestinationAreaType.CountryList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.InternationalDestinationAreaType.CountryNegativList;
import de.deutschepost.dpdhl.wsprovider.dataobjects.NationalDestinationAreaType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.NationalZipCodeGroupType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.NationalZipCodeListType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.NumericValueType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.PriceDefinitionType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.PriceType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.ProdWSPortType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.ProdWSService;
import de.deutschepost.dpdhl.wsprovider.dataobjects.SalesProductType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.ShortSalesProductType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.SpecialServiceType;
import de.deutschepost.dpdhl.wsprovider.dataobjects.WSSUsernameTokenSecurityHandler;

/**
 * {@link ListStamps} lists available stamps from DP DHL.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ListStamps {

    private final Configuration configuration;
    private final ProdWSService service;
    private final ProdWSPortType port;

    public ListStamps(Configuration configuration) {
        super();
        this.configuration = configuration;
        service = new ProdWSService();
        port = service.getProdWSPort();

        Binding binding = ((BindingProvider) port).getBinding();
        @SuppressWarnings("rawtypes")
        List<Handler> chain = binding.getHandlerChain();
        chain.add(new WSSUsernameTokenSecurityHandler(configuration.getProperty("org.kleini.prodws.login"), configuration.getProperty("org.kleini.prodws.password")));
//        chain.add(new SOAPLoggingHandler());
        binding.setHandlerChain(chain);
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        new ListStamps(configuration).printProducts();
    }

    private void printProducts() {
        GetProductListRequestType prodListType = new GetProductListRequestType();
        prodListType.setDedicatedProducts(true);
        prodListType.setMandantID(configuration.getProperty("org.kleini.prodws.mandantId"));
        prodListType.setResponseMode(new BigInteger("0"));
        // complete list if not defined
        // prodListType.setOnlyChanges(false);
//        prodListType.setReferenceDate(value);

        GetProductListResponseType response = port.getProductList(prodListType).getResponse();
        System.out.println("Basisprodukte");
        BasicProductList basicProductList = response.getBasicProductList();
        if (null != basicProductList) {
            for (BasicProductType product : basicProductList.getBasicProduct()) {
                NumericValueType weight = product.getWeight();
                for (ExternIdentifierType externIdentifierType : product.getExtendedIdentifier().getExternIdentifier()) {
                    System.out.print(externIdentifierType.getId() + " ");
                }
                System.out.println();
                System.out.println(product.getExtendedIdentifier().getName());
                if (null != weight) {
                    System.out.println("  Weight: " + product.getWeight().getMaxValue() + product.getWeight().getUnit() + " ");
                }
                System.out.println("  Preis: " + product.getPriceDefinition().getNetPrice().getValue() + product.getPriceDefinition().getNetPrice().getCurrency() + " " +
                    product.getPriceDefinition().getGrossPrice().getValue() + product.getPriceDefinition().getNetPrice().getCurrency());
                printDestination(product.getDestinationArea());
            }
        }
        System.out.println("Verkaufsprodukte");
        for (SalesProductType product : response.getSalesProductList().getSalesProduct()) {
            for (ExternIdentifierType externIdentifierType : product.getExtendedIdentifier().getExternIdentifier()) {
                System.out.print(externIdentifierType.getId() + " ");
            }
            System.out.println();
            NumericValueType weight = product.getWeight();
            System.out.println(product.getExtendedIdentifier().getName());
            if (null != weight) {
                System.out.println("  Weight: " + product.getWeight().getMaxValue() + product.getWeight().getUnit() + " ");
            }
            PriceDefinitionType priceDefinition = product.getPriceDefinition();
            System.out.print("  Preis: ");
            printPriceType(priceDefinition.getPrice());
            printPriceType(priceDefinition.getMinimalPrice());
            System.out.println(priceDefinition.getPriceFormula());
            printDestination(product.getDestinationArea());
        }
        System.out.println("Zusatzleistungen");
        AdditionalProductList additionalProductList = response.getAdditionalProductList();
        if (null != additionalProductList) {
            for (AdditionalProductType product : additionalProductList.getAdditionalProduct()) {
                System.out.println(product.getExtendedIdentifier().getName());
            }
        }
        System.out.println("Verkaufsprodukte flach");
        ShortSalesProductList shortSalesProductList = response.getShortSalesProductList();
        if (null != shortSalesProductList) {
            for (ShortSalesProductType product : shortSalesProductList.getShortSalesProduct()) {
                System.out.println(product.getName());
            }
        }
        System.out.println("Sonstige Services");
        SpecialServiceList specialServiceList = response.getSpecialServiceList();
        if (null != specialServiceList) {
            for (SpecialServiceType sservice : specialServiceList.getSpecialService()) {
                System.out.println(sservice.getExtendedIdentifier().getName());
            }
        }
    }

    private static void printPriceType(PriceType price) {
        if (null == price) {
            return;
        }
        printPrice(price.getCalculatedGrossPrice());
        printPrice(price.getCalculatedNetPrice());
        printPrice(price.getCommercialBalance());
        printPrice(price.getCommercialGrossPrice());
    }

    private static void printPrice(CurrencyAmountType currency) {
        if (null == currency) {
            return;
        }
        System.out.print(currency.getValue() + currency.getCurrency() + ",");
    }

    private static void printDestination(DestinationAreaType destination) {
        if (null == destination) {
            return;
        }
        System.out.println("  Dest: ");
        InternationalDestinationAreaType intArea = destination.getInternationalDestinationArea();
        if (null != intArea) {
            System.out.print("    Int: ");
            CountryGroupList groupList = intArea.getCountryGroupList();
            if (null != groupList) {
                System.out.print("Group: ");
                for (CountryGroupType group : groupList.getCountryGroup()) {
                    System.out.print(group.getName() + ",");
                }
            }
            CountryList countryList = intArea.getCountryList();
            if (null != countryList) {
                System.out.print("Country: ");
                for (CountryType country : countryList.getCountry()) {
                    System.out.print(country.getName() + ",");
                }
            }
            CountryNegativList negativList = intArea.getCountryNegativList();
            if (null != negativList) {
                System.out.print("Negativ: ");
                for (CountryType country : negativList.getCountry()) {
                    System.out.print(country.getName() + ",");
                }
            }
            System.out.println();
        }
        NationalDestinationAreaType natArea = destination.getNationalDestinationArea();
        if (null != natArea) {
            System.out.print("   Nat: ");
            for (NationalZipCodeGroupType group : natArea.getNationalZipCodeGroup()) {
                System.out.print(group.getName() + ",");
            }
            for (NationalZipCodeListType code : natArea.getNationalZipCodeList()) {
                System.out.print(code.getName() + ",");
            }
        }
    }
}
