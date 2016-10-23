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
        case CA:
            addCanada(sb, address);
            break;
        case CN:
            addChina(sb, address);
            break;
        case CZ:
            addCzech(sb, address);
            break;
        case FI:
            addFinland(sb, address);
            break;
        case GB:
            addUnitedKingdom(sb, address);
            break;
        case SG:
            addSingapore(sb, address);
            break;
        case RU:
            addRussia(sb, address);
            break;
        case TH:
            addThailand(sb, address);
            break;
        case TW:
            addTaiwan(sb, address);
            break;
        case AT:
        case BE:
        case CH:
        case ES:
        case FR:
        case HK:
        case IT:
        case NL:
        case NO:
            addStandard(sb, address);
            break;
        case AU:
        case KR:
        case US:
            addStandard2(sb, address);
            break;
        default:
            throw new Exception("Formatter for country " + address.getCountry().getName() + " missing.");
        }
        return sb.toString();
    }

    private static void addName(StringBuilder sb, Address address) {
        sb.append(address.getName()); lb(sb);
        sb.append(address.getStreet1()); sb.append('\n');
        if (null != address.getStreet2()) {
            sb.append(address.getStreet2()); sb.append('\n');
        }
    }

    private static void addCountry(StringBuilder sb, Address address) {
        sb.append(address.getCountryName().toUpperCase());
    }

    private static void lb(StringBuilder sb) {
        sb.append('\n');
    }

    private static void appendNotNull(StringBuilder sb, String text, String spacer) {
        if (null != text) {
            sb.append(text);
        }
        if (null != spacer) {
            sb.append(spacer);
        }
    }

    private static void appendNotNull(StringBuilder sb, String text) {
        appendNotNull(sb, text, null);
    }

    private static void addStandard(StringBuilder sb, Address address) {
        addName(sb, address);
        if (null != address.getPostalCode()) {
            sb.append(address.getPostalCode());
            sb.append(' ');
        }
        if (null != address.getCityName()) {
            sb.append(address.getCityName());
        }
        if (null != address.getPostalCode() && null != address.getCityName()) {
            sb.append('\n');
        }
        if (null != address.getStateOrProvince()) {
            sb.append(address.getStateOrProvince()); sb.append('\n');
        }
        addCountry(sb, address);
    }

    private static void addStandard2(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); sb.append(", "); sb.append(address.getStateOrProvince()); sb.append(' '); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addCanada(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); sb.append(' '); sb.append(address.getStateOrProvince()); sb.append(' '); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addChina(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); lb(sb);
        sb.append(address.getStateOrProvince()); sb.append(", "); sb.append(address.getPostalCode()); lb(sb);
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

    private static void addRussia(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); lb(sb);
        sb.append(address.getStateOrProvince()); sb.append(", "); sb.append(address.getPostalCode()); lb(sb);
        addCountry(sb, address);
    }

    private static void addSingapore(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getCityName()); sb.append(' '); sb.append(address.getPostalCode()); lb(sb);
        appendNotNull(sb, address.getStateOrProvince()); addCountry(sb, address);
    }

    private static void addTaiwan(StringBuilder sb, Address address) {
        addName(sb, address);
        sb.append(address.getStateOrProvince()); sb.append('\n');
        sb.append(address.getCityName()); sb.append(", "); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addThailand(StringBuilder sb, Address address) {
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
}
