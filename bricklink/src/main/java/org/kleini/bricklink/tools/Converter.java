/*
 * GPL v3
 */

package org.kleini.bricklink.tools;
import org.kleini.address.Country;
import org.kleini.bricklink.data.Inventory;
import org.kleini.brickstore.data.Item;

/**
 * Converts data types
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Converter {

    private Converter() {
        super();
    }

    public static Item convert(Inventory inventory) {
        Item retval = new Item();
        retval.setBulk(inventory.getBulk());
        retval.setCategoryID(inventory.getItem().getCategory().getIdentifier());
        retval.setCategoryName(inventory.getItem().getCategory().getName());
        retval.setColorID(inventory.getColor().getIdentifier());
        retval.setColorName(inventory.getColor().getName());
        retval.setCondition(inventory.getCondition().name());
        retval.setItemID(inventory.getItem().getIdentifier());
        retval.setItemName(inventory.getItem().getName());
        retval.setItemTypeID(inventory.getItem().getType().getId());
        retval.setItemTypeName(inventory.getItem().getType().name());
        retval.setLotID(inventory.getIdentifier());
        retval.setPrice(inventory.getPrice());
        retval.setQty(inventory.getQuantity());
        retval.setRemarks(inventory.getRemarks());
        retval.setStatus("I");
        return retval;
    }

    public static org.kleini.address.Address convert(final org.kleini.bricklink.data.Address address) throws Exception {
        if (address.getName().getFirst() == null) {
            throw new Exception("Can not convert address.");
        }
        return new org.kleini.address.Address() {
            @Override
            public String getName() {
                return address.getName().getFull();
            }
            @Override
            public String getStreet1() {
                return address.getAddress1();
            }
            @Override
            public String getStreet2() {
                return address.getAddress2();
            }
            @Override
            public String getCityName() {
                return address.getCity();
            }
            @Override
            public String getStateOrProvince() {
                return address.getState();
            }
            @Override
            public Country getCountry() {
                return address.getCountry();
            }
            @Override
            public String getCountryName() {
                return address.getCountry().getName();
            }
            @Override
            public String getPostalCode() {
                return address.getPostalCode();
            }
        };
    }

    public static String replaceSpecialBLAddressCharacters(String fullAddress) {
        return fullAddress.
                replace("&#39;", "'").
                replace("&#40;", "(").
                replace("&#41;", ")").
                replace("&#45;", "-");
    }
}
