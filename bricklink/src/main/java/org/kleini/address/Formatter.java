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
        case CL:
            addChile(sb, address);
            break;
        case CN:
            addChina(sb, address);
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
        case DE:
        case ES:
        case FR:
        case HK:
        case HU:
        case IT:
        case NL:
        case NO:
        case SE:
            // fullname
            // street1
            // (street2)
            // (postalCode )(city)
            // (stateOrProvince)
            // COUNTRY
            addStandard(sb, address);
            break;
        case AE:
        case AU:
        case JP:
        case KR:
        case MX:
        case MY:
        case US:
        case ZA:
            // fullname
            // street1
            // (street2)
            // city, (stateOrProvince) (postalCode)
            // COUNTRY
            addStandard2(sb, address);
            break;
        case CZ:
        case RO:
            addStandard3(sb, address);
            break;
        default:
            throw new Exception("Formatter for country " + address.getCountry().getName() + " missing.");
        }
        return sb.toString();
    }

    public static void format(Address address, LineFormat format) throws Exception {
        switch (address.getCountry()) {
        case BE:
        case DE:
            formatStandard(address, format);
            break;
        default:
            throw new Exception("Formatter for country " + address.getCountry().getName() + " missing.");
        }
        compare(format, format(address));
    }

    private static void compare(LineFormat format, String test) {
        StringBuilder sb = new StringBuilder();
        // FIXME Auto-generated method stub
    }

    /**
     * fullname
     * street1
     * (street2)
     */
    private static void addNameAndStreet(StringBuilder sb, Address address) {
        sb.append(address.getName()); lb(sb);
        sb.append(address.getStreet1()); lb(sb);
        if (null != address.getStreet2() && address.getStreet2().length() > 0) {
            sb.append(address.getStreet2()); lb(sb);
        }
    }

    /**
     * fullname
     * street1
     * (street2)
     */
    private static void formatNameAndStreet(Address address, LineFormat format) {
        format.setLine1(address.getName());
        format.setLine2(address.getStreet1());
        if (null != address.getStreet2() && address.getStreet2().length() > 0) {
            format.setLine3(address.getStreet2());
        }
    }

    private static void addCountry(StringBuilder sb, Address address) {
        sb.append(address.getCountryName().toUpperCase());
    }

    private static void formatCountry(Address address, LineFormat format) {
        format.setCountry(address.getCountryName().toUpperCase());
    }

    private static void lb(StringBuilder sb) {
        sb.append('\n');
    }

    private static void space(StringBuilder sb) {
        sb.append(' ');
    }

    private static void appendNotNull(StringBuilder sb, String text, String spacer) {
        if (null != text && text.length() > 0) {
            sb.append(text);
            if (null != spacer && spacer.length() > 0) {
                sb.append(spacer);
            }
        }
    }

    private static void appendNotNull(StringBuilder sb, String text) {
        appendNotNull(sb, text, null);
    }

    /**
     * fullname
     * street1
     * (street2)
     * (postalCode )(city)
     * (stateOrProvince)
     * COUNTRY
     */
    private static void addStandard(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        if (null != address.getPostalCode()) {
            sb.append(address.getPostalCode());
            space(sb);
        }
        if (null != address.getCityName()) {
            sb.append(address.getCityName());
        }
        if (Country.DE == address.getCountry()) {
            return;
        }
        if (null != address.getPostalCode() && null != address.getCityName()) {
            lb(sb);
        }
        if (null != address.getStateOrProvince()) {
            sb.append(address.getStateOrProvince()); lb(sb);
        }
        addCountry(sb, address);
    }

    /**
     * fullname
     * street1
     * (street2)
     * (postalCode )(city)
     * (stateOrProvince)
     * COUNTRY
     */
    private static void formatStandard(Address address, LineFormat format) {
        formatNameAndStreet(address, format);
        if (null != address.getPostalCode()) {
            format.setZip(address.getPostalCode());
        }
        if (null != address.getCityName()) {
            format.setLine4(address.getCityName());
        }
        if (Country.DE == address.getCountry()) {
            return;
        }
        if (null != address.getStateOrProvince()) {
            throw new UnsupportedOperationException("state or province is currently not implemented");
        }
        formatCountry(address, format);
    }

    /**
     * fullname
     * street1
     * (street2)
     * city, (stateOrProvince) (postalCode)
     * COUNTRY
     */
    private static void addStandard2(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); sb.append(", ");
        appendNotNull(sb, address.getStateOrProvince(), " ");
        appendNotNull(sb, address.getPostalCode()); lb(sb);
        addCountry(sb, address);
    }

    private static void addCanada(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); sb.append(' '); sb.append(address.getStateOrProvince()); sb.append(' '); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addChina(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); lb(sb);
        sb.append(address.getStateOrProvince()); sb.append(", "); sb.append(address.getPostalCode()); lb(sb);
        addCountry(sb, address);
    }

    private static void addChile(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName());
        if (null != address.getStateOrProvince()) {
            sb.append(", ");
            sb.append(address.getStateOrProvince());
        }
        if (null != address.getPostalCode()) {
            sb.append(", ");
            sb.append(address.getPostalCode());
        }
        sb.append('\n');
        addCountry(sb, address);
    }

    private static void addStandard3(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
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
        addNameAndStreet(sb, address);
        sb.append(address.getCityName());
        if (null != address.getStateOrProvince()) {
            sb.append(", "); sb.append(address.getStateOrProvince());
        }
        sb.append('\n');
        sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addRussia(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); lb(sb);
        appendNotNull(sb, address.getStateOrProvince(), ", ");
        sb.append(address.getPostalCode()); lb(sb);
        addCountry(sb, address);
    }

    private static void addSingapore(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); sb.append(' '); sb.append(address.getPostalCode()); lb(sb);
        appendNotNull(sb, address.getStateOrProvince()); addCountry(sb, address);
    }

    private static void addTaiwan(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getStateOrProvince()); sb.append('\n');
        sb.append(address.getCityName()); sb.append(", "); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addThailand(StringBuilder sb, Address address) {
        addNameAndStreet(sb, address);
        sb.append(address.getCityName()); sb.append('\n');
        sb.append(address.getStateOrProvince()); sb.append(", "); sb.append(address.getPostalCode()); sb.append('\n');
        addCountry(sb, address);
    }

    private static void addUnitedKingdom(StringBuilder sb, Address address) {
        sb.append(address.getName()); lb(sb);
        sb.append(address.getStreet1()); lb(sb);
        if (null != address.getStreet2() && null != address.getStateOrProvince()) {
            sb.append(address.getStreet2());
            sb.append(", ");
            sb.append(address.getCityName());
            sb.append(", ");
            sb.append(address.getStateOrProvince());
            lb(sb);
        } else {
            if (null != address.getStreet2()) {
                sb.append(address.getStreet2()); sb.append('\n');
            }
            sb.append(address.getCityName());
            if (null != address.getStateOrProvince()) {
                sb.append(", ");
                sb.append(address.getStateOrProvince());
            }
            lb(sb);
        }
        sb.append(address.getPostalCode().toUpperCase()); lb(sb);
        addCountry(sb, address);
    }
}
