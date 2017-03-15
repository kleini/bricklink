
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.dhl.onlinefrankierung.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShoppingCartOpenRequest_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/2.0/popws", "ShoppingCartOpenRequest");
    private final static QName _ShoppingCartOpenResponse_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/2.0/popws", "ShoppingCartOpenResponse");
    private final static QName _LoadBuyedShoppingCartRequest_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "LoadBuyedShoppingCartRequest");
    private final static QName _ProductInfoRequest_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", "ProductInfoRequest");
    private final static QName _ShoppingCartValidateRequest_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "ShoppingCartValidateRequest");
    private final static QName _ShoppingCartCheckoutViaPaymentResponse_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "ShoppingCartCheckoutViaPaymentResponse");
    private final static QName _ProductInfoResponse_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", "ProductInfoResponse");
    private final static QName _LoadBuyedShoppingCartResponse_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "LoadBuyedShoppingCartResponse");
    private final static QName _DirectLabelInfo_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "DirectLabelInfo");
    private final static QName _ShoppingCartCheckoutViaPaymentRequest_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "ShoppingCartCheckoutViaPaymentRequest");
    private final static QName _ShoppingCartValidateResponse_QNAME = new QName("https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", "ShoppingCartValidateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.dhl.onlinefrankierung.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShoppingCartOpenRequestType }
     * 
     */
    public ShoppingCartOpenRequestType createShoppingCartOpenRequestType() {
        return new ShoppingCartOpenRequestType();
    }

    /**
     * Create an instance of {@link ShoppingCartOpenResponseType }
     * 
     */
    public ShoppingCartOpenResponseType createShoppingCartOpenResponseType() {
        return new ShoppingCartOpenResponseType();
    }

    /**
     * Create an instance of {@link PositionsType }
     * 
     */
    public PositionsType createPositionsType() {
        return new PositionsType();
    }

    /**
     * Create an instance of {@link ItemCancelErrorType }
     * 
     */
    public ItemCancelErrorType createItemCancelErrorType() {
        return new ItemCancelErrorType();
    }

    /**
     * Create an instance of {@link PickupTimeType }
     * 
     */
    public PickupTimeType createPickupTimeType() {
        return new PickupTimeType();
    }

    /**
     * Create an instance of {@link LabelItemType }
     * 
     */
    public LabelItemType createLabelItemType() {
        return new LabelItemType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link PaymentBaseType }
     * 
     */
    public PaymentBaseType createPaymentBaseType() {
        return new PaymentBaseType();
    }

    /**
     * Create an instance of {@link PickupItemType }
     * 
     */
    public PickupItemType createPickupItemType() {
        return new PickupItemType();
    }

    /**
     * Create an instance of {@link PaymentDHLCheckoutType }
     * 
     */
    public PaymentDHLCheckoutType createPaymentDHLCheckoutType() {
        return new PaymentDHLCheckoutType();
    }

    /**
     * Create an instance of {@link DownloadShoppingCartType }
     * 
     */
    public DownloadShoppingCartType createDownloadShoppingCartType() {
        return new DownloadShoppingCartType();
    }

    /**
     * Create an instance of {@link Cn2223LineType }
     * 
     */
    public Cn2223LineType createCn2223LineType() {
        return new Cn2223LineType();
    }

    /**
     * Create an instance of {@link PaymentNullpayType }
     * 
     */
    public PaymentNullpayType createPaymentNullpayType() {
        return new PaymentNullpayType();
    }

    /**
     * Create an instance of {@link PaymentPostpayType }
     * 
     */
    public PaymentPostpayType createPaymentPostpayType() {
        return new PaymentPostpayType();
    }

    /**
     * Create an instance of {@link ItemBaseType }
     * 
     */
    public ItemBaseType createItemBaseType() {
        return new ItemBaseType();
    }

    /**
     * Create an instance of {@link PaymentResultsType }
     * 
     */
    public PaymentResultsType createPaymentResultsType() {
        return new PaymentResultsType();
    }

    /**
     * Create an instance of {@link PaymentPaypalType }
     * 
     */
    public PaymentPaypalType createPaymentPaypalType() {
        return new PaymentPaypalType();
    }

    /**
     * Create an instance of {@link CouponSetItemType }
     * 
     */
    public CouponSetItemType createCouponSetItemType() {
        return new CouponSetItemType();
    }

    /**
     * Create an instance of {@link ItemErrorType }
     * 
     */
    public ItemErrorType createItemErrorType() {
        return new ItemErrorType();
    }

    /**
     * Create an instance of {@link PaymentResultType }
     * 
     */
    public PaymentResultType createPaymentResultType() {
        return new PaymentResultType();
    }

    /**
     * Create an instance of {@link PartnerBackLinksType }
     * 
     */
    public PartnerBackLinksType createPartnerBackLinksType() {
        return new PartnerBackLinksType();
    }

    /**
     * Create an instance of {@link MTItemType }
     * 
     */
    public MTItemType createMTItemType() {
        return new MTItemType();
    }

    /**
     * Create an instance of {@link ShoppingCartBaseType }
     * 
     */
    public ShoppingCartBaseType createShoppingCartBaseType() {
        return new ShoppingCartBaseType();
    }

    /**
     * Create an instance of {@link BuyShoppingCartType }
     * 
     */
    public BuyShoppingCartType createBuyShoppingCartType() {
        return new BuyShoppingCartType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link PaymentGiropayType }
     * 
     */
    public PaymentGiropayType createPaymentGiropayType() {
        return new PaymentGiropayType();
    }

    /**
     * Create an instance of {@link DirectLabelType }
     * 
     */
    public DirectLabelType createDirectLabelType() {
        return new DirectLabelType();
    }

    /**
     * Create an instance of {@link BaseLabelAddressType }
     * 
     */
    public BaseLabelAddressType createBaseLabelAddressType() {
        return new BaseLabelAddressType();
    }

    /**
     * Create an instance of {@link ItemPriceType }
     * 
     */
    public ItemPriceType createItemPriceType() {
        return new ItemPriceType();
    }

    /**
     * Create an instance of {@link PaymentForwardShoppingCartType }
     * 
     */
    public PaymentForwardShoppingCartType createPaymentForwardShoppingCartType() {
        return new PaymentForwardShoppingCartType();
    }

    /**
     * Create an instance of {@link ItemErrorsType }
     * 
     */
    public ItemErrorsType createItemErrorsType() {
        return new ItemErrorsType();
    }

    /**
     * Create an instance of {@link Base64LabelType }
     * 
     */
    public Base64LabelType createBase64LabelType() {
        return new Base64LabelType();
    }

    /**
     * Create an instance of {@link Cn22Type }
     * 
     */
    public Cn22Type createCn22Type() {
        return new Cn22Type();
    }

    /**
     * Create an instance of {@link ShipmentItemType }
     * 
     */
    public ShipmentItemType createShipmentItemType() {
        return new ShipmentItemType();
    }

    /**
     * Create an instance of {@link PaymentPartnerpayType }
     * 
     */
    public PaymentPartnerpayType createPaymentPartnerpayType() {
        return new PaymentPartnerpayType();
    }

    /**
     * Create an instance of {@link PaymentCreditcardType }
     * 
     */
    public PaymentCreditcardType createPaymentCreditcardType() {
        return new PaymentCreditcardType();
    }

    /**
     * Create an instance of {@link ShoppingCartIdentificationType }
     * 
     */
    public ShoppingCartIdentificationType createShoppingCartIdentificationType() {
        return new ShoppingCartIdentificationType();
    }

    /**
     * Create an instance of {@link CouponInfoType }
     * 
     */
    public CouponInfoType createCouponInfoType() {
        return new CouponInfoType();
    }

    /**
     * Create an instance of {@link CouponSetChunkInfoType }
     * 
     */
    public CouponSetChunkInfoType createCouponSetChunkInfoType() {
        return new CouponSetChunkInfoType();
    }

    /**
     * Create an instance of {@link CouponSetInfoType }
     * 
     */
    public CouponSetInfoType createCouponSetInfoType() {
        return new CouponSetInfoType();
    }

    /**
     * Create an instance of {@link MapEntryType }
     * 
     */
    public MapEntryType createMapEntryType() {
        return new MapEntryType();
    }

    /**
     * Create an instance of {@link MapType }
     * 
     */
    public MapType createMapType() {
        return new MapType();
    }

    /**
     * Create an instance of {@link PriceComponentType }
     * 
     */
    public PriceComponentType createPriceComponentType() {
        return new PriceComponentType();
    }

    /**
     * Create an instance of {@link ShipmentDimensionType }
     * 
     */
    public ShipmentDimensionType createShipmentDimensionType() {
        return new ShipmentDimensionType();
    }

    /**
     * Create an instance of {@link LoadBuyedShoppingCartResponseType }
     * 
     */
    public LoadBuyedShoppingCartResponseType createLoadBuyedShoppingCartResponseType() {
        return new LoadBuyedShoppingCartResponseType();
    }

    /**
     * Create an instance of {@link DirectLabelInfoType }
     * 
     */
    public DirectLabelInfoType createDirectLabelInfoType() {
        return new DirectLabelInfoType();
    }

    /**
     * Create an instance of {@link ShoppingCartCheckoutViaPaymentRequestType }
     * 
     */
    public ShoppingCartCheckoutViaPaymentRequestType createShoppingCartCheckoutViaPaymentRequestType() {
        return new ShoppingCartCheckoutViaPaymentRequestType();
    }

    /**
     * Create an instance of {@link ShoppingCartValidateResponseType }
     * 
     */
    public ShoppingCartValidateResponseType createShoppingCartValidateResponseType() {
        return new ShoppingCartValidateResponseType();
    }

    /**
     * Create an instance of {@link LoadBuyedShoppingCartRequestType }
     * 
     */
    public LoadBuyedShoppingCartRequestType createLoadBuyedShoppingCartRequestType() {
        return new LoadBuyedShoppingCartRequestType();
    }

    /**
     * Create an instance of {@link ShoppingCartValidateRequestType }
     * 
     */
    public ShoppingCartValidateRequestType createShoppingCartValidateRequestType() {
        return new ShoppingCartValidateRequestType();
    }

    /**
     * Create an instance of {@link ShoppingCartCheckoutViaPaymentResponseType }
     * 
     */
    public ShoppingCartCheckoutViaPaymentResponseType createShoppingCartCheckoutViaPaymentResponseType() {
        return new ShoppingCartCheckoutViaPaymentResponseType();
    }

    /**
     * Create an instance of {@link WsResponseStatus }
     * 
     */
    public WsResponseStatus createWsResponseStatus() {
        return new WsResponseStatus();
    }

    /**
     * Create an instance of {@link AuthType }
     * 
     */
    public AuthType createAuthType() {
        return new AuthType();
    }

    /**
     * Create an instance of {@link ShoppingCartCheckoutBaseRequestType }
     * 
     */
    public ShoppingCartCheckoutBaseRequestType createShoppingCartCheckoutBaseRequestType() {
        return new ShoppingCartCheckoutBaseRequestType();
    }

    /**
     * Create an instance of {@link ProductInfoRequestType }
     * 
     */
    public ProductInfoRequestType createProductInfoRequestType() {
        return new ProductInfoRequestType();
    }

    /**
     * Create an instance of {@link ProductInfoResponseType }
     * 
     */
    public ProductInfoResponseType createProductInfoResponseType() {
        return new ProductInfoResponseType();
    }

    /**
     * Create an instance of {@link ProductInfoFilterType }
     * 
     */
    public ProductInfoFilterType createProductInfoFilterType() {
        return new ProductInfoFilterType();
    }

    /**
     * Create an instance of {@link CountryProductsType }
     * 
     */
    public CountryProductsType createCountryProductsType() {
        return new CountryProductsType();
    }

    /**
     * Create an instance of {@link PricesType }
     * 
     */
    public PricesType createPricesType() {
        return new PricesType();
    }

    /**
     * Create an instance of {@link NamedReferenceType }
     * 
     */
    public NamedReferenceType createNamedReferenceType() {
        return new NamedReferenceType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link BaseProductDescType }
     * 
     */
    public BaseProductDescType createBaseProductDescType() {
        return new BaseProductDescType();
    }

    /**
     * Create an instance of {@link CollectionDescType }
     * 
     */
    public CollectionDescType createCollectionDescType() {
        return new CollectionDescType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link ProductDescType }
     * 
     */
    public ProductDescType createProductDescType() {
        return new ProductDescType();
    }

    /**
     * Create an instance of {@link ProductGroupType }
     * 
     */
    public ProductGroupType createProductGroupType() {
        return new ProductGroupType();
    }

    /**
     * Create an instance of {@link ServiceDescType }
     * 
     */
    public ServiceDescType createServiceDescType() {
        return new ServiceDescType();
    }

    /**
     * Create an instance of {@link ProductServiceDescBaseType }
     * 
     */
    public ProductServiceDescBaseType createProductServiceDescBaseType() {
        return new ProductServiceDescBaseType();
    }

    /**
     * Create an instance of {@link BaseProductType }
     * 
     */
    public BaseProductType createBaseProductType() {
        return new BaseProductType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link MarketplaceProductsType }
     * 
     */
    public MarketplaceProductsType createMarketplaceProductsType() {
        return new MarketplaceProductsType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartOpenRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/popws", name = "ShoppingCartOpenRequest")
    public JAXBElement<ShoppingCartOpenRequestType> createShoppingCartOpenRequest(ShoppingCartOpenRequestType value) {
        return new JAXBElement<ShoppingCartOpenRequestType>(_ShoppingCartOpenRequest_QNAME, ShoppingCartOpenRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartOpenResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/popws", name = "ShoppingCartOpenResponse")
    public JAXBElement<ShoppingCartOpenResponseType> createShoppingCartOpenResponse(ShoppingCartOpenResponseType value) {
        return new JAXBElement<ShoppingCartOpenResponseType>(_ShoppingCartOpenResponse_QNAME, ShoppingCartOpenResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuyedShoppingCartRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "LoadBuyedShoppingCartRequest")
    public JAXBElement<LoadBuyedShoppingCartRequestType> createLoadBuyedShoppingCartRequest(LoadBuyedShoppingCartRequestType value) {
        return new JAXBElement<LoadBuyedShoppingCartRequestType>(_LoadBuyedShoppingCartRequest_QNAME, LoadBuyedShoppingCartRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", name = "ProductInfoRequest")
    public JAXBElement<ProductInfoRequestType> createProductInfoRequest(ProductInfoRequestType value) {
        return new JAXBElement<ProductInfoRequestType>(_ProductInfoRequest_QNAME, ProductInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartValidateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "ShoppingCartValidateRequest")
    public JAXBElement<ShoppingCartValidateRequestType> createShoppingCartValidateRequest(ShoppingCartValidateRequestType value) {
        return new JAXBElement<ShoppingCartValidateRequestType>(_ShoppingCartValidateRequest_QNAME, ShoppingCartValidateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartCheckoutViaPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "ShoppingCartCheckoutViaPaymentResponse")
    public JAXBElement<ShoppingCartCheckoutViaPaymentResponseType> createShoppingCartCheckoutViaPaymentResponse(ShoppingCartCheckoutViaPaymentResponseType value) {
        return new JAXBElement<ShoppingCartCheckoutViaPaymentResponseType>(_ShoppingCartCheckoutViaPaymentResponse_QNAME, ShoppingCartCheckoutViaPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/2.0/poppdb", name = "ProductInfoResponse")
    public JAXBElement<ProductInfoResponseType> createProductInfoResponse(ProductInfoResponseType value) {
        return new JAXBElement<ProductInfoResponseType>(_ProductInfoResponse_QNAME, ProductInfoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuyedShoppingCartResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "LoadBuyedShoppingCartResponse")
    public JAXBElement<LoadBuyedShoppingCartResponseType> createLoadBuyedShoppingCartResponse(LoadBuyedShoppingCartResponseType value) {
        return new JAXBElement<LoadBuyedShoppingCartResponseType>(_LoadBuyedShoppingCartResponse_QNAME, LoadBuyedShoppingCartResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectLabelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "DirectLabelInfo")
    public JAXBElement<DirectLabelInfoType> createDirectLabelInfo(DirectLabelInfoType value) {
        return new JAXBElement<DirectLabelInfoType>(_DirectLabelInfo_QNAME, DirectLabelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartCheckoutViaPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "ShoppingCartCheckoutViaPaymentRequest")
    public JAXBElement<ShoppingCartCheckoutViaPaymentRequestType> createShoppingCartCheckoutViaPaymentRequest(ShoppingCartCheckoutViaPaymentRequestType value) {
        return new JAXBElement<ShoppingCartCheckoutViaPaymentRequestType>(_ShoppingCartCheckoutViaPaymentRequest_QNAME, ShoppingCartCheckoutViaPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingCartValidateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.dhl.de/popweb/gw/ws/schema/1.0/popws", name = "ShoppingCartValidateResponse")
    public JAXBElement<ShoppingCartValidateResponseType> createShoppingCartValidateResponse(ShoppingCartValidateResponseType value) {
        return new JAXBElement<ShoppingCartValidateResponseType>(_ShoppingCartValidateResponse_QNAME, ShoppingCartValidateResponseType.class, null, value);
    }

}
