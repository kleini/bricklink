/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * {@link Color}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Color {

    NOT_APPLICABLE(0, "(Not Applicable)"),
    WHITE(1, "White"),
    TAN(2, "Tan"),
    YELLOW(3, "Yellow"),
    ORANGE(4, "Orange"),
    RED(5, "Red"),
    GREEN(6, "Green"),
    BLUE(7, "Blue"),
    BROWN(8, "Brown"),
    LIGHT_GRAY(9, "Light Gray"),
    DARK_GRAY(10, "Dark Gray"),
    BLACK(11, "Black"),
    TRANS_CLEAR(12, "Trans-Clear"),
    TRANS_BLACK(13, "Trans-Black"),
    TRANS_DARK_BLUE(14, "Trans-Dark Blue"),
    TRANS_LIGHT_BLUE(15, "Trans-Light Blue"),
    TRANS_NEON_GREEN(16, "Trans-Neon Green"),
    TRANS_RED(17, "Trans-Red"),
    TRANS_NEON_ORANGE(18, "Trans-Neon Orange"),
    TRANS_YELLOW(19, "Trans-Yellow"),
    TRANS_GREEN(20, "Trans-Green"),
    CHROME_GOLD(21, "Chrome Gold"),
    CHROME_SILVER(22, "Chrome Silver"),
    PINK(23, "Pink"),
    PURPLE(24, "Purple"),
    SALMON(25, "Salmon"),
    LIGHT_SALMON(26, "Light Salmon"),
    RUST(27, "Rust"),
    FLESH(28, "Flesh"),
    EARTH_ORANGE(29, "Earth Orange"),
    MEDIUM_ORANGE(31, "Medium Orange"),
    LIGHT_ORANGE(32, "Light Orange"),
    LIGHT_YELLOW(33, "Light Yellow"),
    LIME(34, "Lime"),
    LIGHT_LIME(35, "Light Lime"),
    BRIGHT_GREEN(36, "Bright Green"),
    MEDIUM_GREEN(37, "Medium Green"),
    LIGHT_GREEN(38, "Light Green"),
    DARK_TURQUOISE(39, "Dark Turquoise"),
    LIGHT_TURQUOISE(40, "Light Turquoise"),
    AQUA(41, "Aqua"),
    MEDIUM_BLUE(42, "Medium Blue"),
    VIOLET(43, "Violet"),
    LIGHT_VIOLET(44, "Light Violet"),
    GLOW_IN_DARK_OPAQUE(46, "Glow In Dark Opaque"),
    DARK_PINK(47, "Dark Pink"),
    SAND_GREEN(48, "Sand Green"),
    VERY_LIGHT_GRAY(49, "Very Light Gray"),
    TRANS_DARK_PINK(50, "Trans-Dark Pink"),
    TRANS_PURPLE(51, "Trans-Purple"),
    CHROME_BLUE(52, "Chrome Blue"),
    SAND_PURPLE(54, "Sand Purple"),
    SAND_BLUE(55, "Sand Blue"),
    LIGHT_PINK(56, "Light Pink"),
    CHROME_ANTIQUE_BRASS(57, "Chrome Antique Brass"),
    SAND_RED(58, "Sand Red"),
    DARK_RED(59, "Dark Red"),
    MILKY_WHITE(60, "Milky White"),
    PEARL_LIGHT_GOLD(61, "Pearl Light Gold"),
    LIGHT_BLUE(62, "Light Blue"),
    DARK_BLUE(63, "Dark Blue"),
    CHROME_GREEN(64, "Chrome Green"),
    METALLIC_GOLD(65, "Metallic Gold"),
    PEARL_LIGHT_GRAY(66, "Pearl Light Gray"),
    METALLIC_SILVER(67, "Metallic Silver"),
    DARK_ORANGE(68, "Dark Orange"),
    DARK_TAN(69, "Dark Tan"),
    METALLIC_GREEN(70, "Metallic Green"),
    MAGENTA(71, "Magenta"),
    MAERSK_BLUE(72, "Maersk Blue"),
    MEDIUM_VIOLET(73, "Medium Violet"),
    TRANS_MEDIUM_BLUE(74, "Trans-Medium Blue"),
    MEDIUM_LIME(76, "Medium Lime"),
    PEARL_DARK_GRAY(77, "Pearl Dark Gray"),
    METAL_BLUE(78, "Metal Blue"),
    DARK_GREEN(80, "Dark Green"),
    FLAT_DARK_GOLD(81, "Flat Dark Gold"),
    CHROME_PINK(82, "Chrome Pink"),
    PEARL_WHITE(83, "Pearl White"),
    COPPER(84, "Copper"),
    DARK_BLUISH_GRAY(85, "Dark Bluish Gray"),
    LIGHT_BLUISH_GRAY(86, "Light Bluish Gray"),
    SKY_BLUE(87, "Sky Blue"),
    REDDISH_BROWN(88, "Reddish Brown"),
    DARK_PURPLE(89, "Dark Purple"),
    LIGHT_FLESH(90, "Light Flesh"),
    DARK_FLESH(91, "Dark Flesh"),
    LIGHT_PURPLE(93, "Light Purple"),
    MEDIUM_DARK_PINK(94, "Medium Dark Pink"),
    FLAT_SILVER(95, "Flat Silver"),
    VERY_LIGHT_ORANGE(96, "Very Light Orange"),
    BLUE_VIOLET(97, "Blue-Violet"),
    TRANS_ORANGE(98, "Trans-Orange"),
    VERY_LIGHT_BLUISH_GRAY(99, "Very Light Bluish Gray"),
    GLITTER_TRANS_DARK_PINK(100, "Glitter Trans-Dark Pink"),
    GLITTER_TRANS_CLEAR(101, "Glitter Trans-Clear"),
    GLITTER_TRANS_PURPLE(102, "Glitter Trans-Purple"),
    BRIGHT_LIGHT_YELLOW(103, "Bright Light Yellow"),
    BRIGHT_PINK(104, "Bright Pink"),
    BRIGHT_LIGHT_BLUE(105, "Bright Light Blue"),
    FABULAND_BROWN(106, "Fabuland Brown"),
    TRANS_PINK(107, "Trans-Pink"),
    TRANS_BRIGHT_GREEN(108, "Trans-Bright Green"),
    DARK_BLUE_VIOLET(109, "Dark Blue-Violet"),
    BRIGHT_LIGHT_ORANGE(110, "Bright Light Orange"),
    SPECKLE_BLACK_SILVER(111, "Speckle Black-Silver"),
    TRANS_VERY_LT_BLUE(113, "Trans-Very Lt Blue"),
    TRANS_LIGHT_PURPLE(114, "Trans-Light Purple"),
    PEARL_GOLD(115, "Pearl Gold"),
    SPECKLE_BLACK_COPPER(116, "Speckle Black-Copper"),
    SPECKLE_DBGRAY_SILVER(117, "Speckle DBGray-Silver"),
    GLOW_IN_DARK_TRANS(118, "Glow In Dark Trans"),
    PEARL_VERY_LIGHT_GRAY(119, "Pearl Very Light Gray"),
    DARK_BROWN(120, "Dark Brown"),
    TRANS_NEON_YELLOW(121, "Trans-Neon Yellow"),
    CHROME_BLACK(122, "Chrome Black"),
    MX_WHITE(123, "Mx White"),
    MX_LIGHT_BLUISH_GRAY(124, "Mx Light Bluish Gray"),
    MX_LIGHT_GRAY(125, "Mx Light Gray"),
    MX_CHARCOAL_GRAY(126, "Mx Charcoal Gray"),
    MX_TILE_GRAY(127, "Mx Tile Gray"),
    MX_BLACK(128, "Mx Black"),
    MX_RED(129, "Mx Red"),
    MX_PINK_RED(130, "Mx Pink Red"),
    MX_TILE_BROWN(131, "Mx Tile Brown"),
    MX_BROWN(132, "Mx Brown"),
    MX_BUFF(133, "Mx Buff"),
    MX_TERRACOTTA(134, "Mx Terracotta"),
    MX_ORANGE(135, "Mx Orange"),
    MX_LIGHT_ORANGE(136, "Mx Light Orange"),
    MX_LIGHT_YELLOW(137, "Mx Light Yellow"),
    MX_OCHRE_YELLOW(138, "Mx Ochre Yellow"),
    MX_LEMON(139, "Mx Lemon"),
    MX_OLIVE_GREEN(140, "Mx Olive Green"),
    MX_PASTEL_GREEN(141, "Mx Pastel Green"),
    MX_AQUA_GREEN(142, "Mx Aqua Green"),
    MX_TILE_BLUE(143, "Mx Tile Blue"),
    MX_MEDIUM_BLUE(144, "Mx Medium Blue"),
    MX_PASTEL_BLUE(145, "Mx Pastel Blue"),
    MX_TEAL_BLUE(146, "Mx Teal Blue"),
    MX_VIOLET(147, "Mx Violet"),
    MX_PINK(148, "Mx Pink"),
    MX_CLEAR(149, "Mx Clear"),
    MEDIUM_DARK_FLESH(150, "Medium Dark Flesh"),
    SPECKLE_BLACK_GOLD(151, "Speckle Black-Gold"),
    LIGHT_AQUA(152, "Light Aqua"),
    DARK_AZURE(153, "Dark Azure"),
    LAVENDER(154, "Lavender"),
    OLIVE_GREEN(155, "Olive Green"),
    MEDIUM_AZURE(156, "Medium Azure"),
    MEDIUM_LAVENDER(157, "Medium Lavender"),
    YELLOWISH_GREEN(158, "Yellowish Green"),
    GLOW_IN_DARK_WHITE(159, "Glow In Dark White"),
    FABULAND_ORANGE(160, "Fabuland Orange"),
    DARK_YELLOW(161, "Dark Yellow"),
    GLITTER_TRANS_LIGHT_BLUE(162, "Glitter Trans-Light Blue"),
    GLITTER_TRANS_NEON_GREEN(163, "Glitter Trans-Neon Green"),
    TRANS_LIGHT_ORANGE(164, "Trans-Light Orange");

    private final int identifier;

    private final String name;

    Color(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public static Color byId(int identifier) throws Exception {
        for (Color color : values()) {
            if (color.getIdentifier() == identifier) {
                return color;
            }
        }
        throw new Exception("Unknown color identifier " + identifier + '.');
    }

    public static Color byName(String name) throws Exception {
        for (Color color : values()) {
            if (color.getName().equals(name)) {
                return color;
            }
        }
        throw new Exception("Unknown color name " + name + '.');
    }

    @Override
    public String toString() {
        return name;
    }
}
