/*
 * GPL v3
 */

package org.kleini.address;

/**
 * {@link Formatter} formats an {@link Address} in the country specific format.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Formatter {

    private Formatter() {
        super();
    }

    public static String format(Address address) throws Exception {
        StringBuilder sb = new StringBuilder();
        switch (address.getCountry()) {
        case CZ:
            addCzech(sb, address);
            break;
        case FI:
            addFinland(sb, address);
            break;
        case GB:
            addUnitedKingdom(sb, address);
            break;
        case TW:
            addTaiwan(sb, address);
            break;
        case US:
            addUSA(sb, address);
            break;
        default:
            throw new Exception("Formatter for country " + address.getCountry().getName() + " missing.");
        }
        return "";
    }

    private static void addName(StringBuilder sb, Address address) {
        sb.append(address.getName()); sb.append('\n');
        sb.append(address.getStreet1()); sb.append('\n');
        if (null != address.getStreet2()) {
            sb.append(address.getStreet2()); sb.append('\n');
        }
    }

    private static void addCountry(StringBuilder sb, Address address) {
        sb.append(address.getCountryName().toUpperCase());
    }

    private static void addStandard(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getPostalCode() + " " + address.getCityName()); sb.append('\n');
        if (null != address.getStateOrProvince()) {
            sb.append(address.getStateOrProvince()); sb.append('\n');
        }
        addCountry(sb, address);
    }

    private static void addCzech(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName());
        if (null != address.getStateOrProvince()) {
            sb.append(", ");
            sb.append(address.getStateOrProvince());
        }
        sb.append('\n');
        sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addFinland(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName());
        if (null != address.getStateOrProvince()) {
            sb.append(", "); sb.append(address.getStateOrProvince());
        }
        sb.append('\n');
        sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addTaiwan(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); sb.append('\n');
        sb.append(address.getStateOrProvince()); sb.append(", "); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addUnitedKingdom(StringBuilder sb, Address address) {
        sb.append(address.getName()); sb.append('\n');
        sb.append(address.getStreet1()); sb.append('\n');
        if (null != address.getStreet2() && null != address.getStateOrProvince()) {
            sb.append(address.getStreet2());
            sb.append(", ");
            sb.append(address.getCityName());
            sb.append(", ");
            sb.append(address.getStateOrProvince());
            sb.append('\n');
        } else {
            if (null != address.getStreet2()) {
                sb.append(address.getStreet2()); sb.append('\n');
            }
            sb.append(address.getCityName());
            if (null != address.getStateOrProvince()) {
                sb.append(", ");
                sb.append(address.getStateOrProvince());
                sb.append('\n');
            }
        }
        sb.append(address.getPostalCode().toUpperCase()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addUSA(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); sb.append(", "); sb.append(address.getStateOrProvince()); sb.append(' '); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }
}
