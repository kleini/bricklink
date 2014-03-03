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

    WHITE(1, "White"),
    VERY_LIGHT_GRAY(49, "Very Light Gray"),
    VERY_LIGHT_BLUISH_GRAY(99, "Very Light Bluish Gray"),
    LIGHT_BLUISH_GRAY(86, "Light Bluish Gray"),
    LIGHT_GRAY(9, "Light Gray"),
    DARK_GRAY(10, "Dark Gray"),
    DARK_BLUISH_GRAY(85, "Dark Bluish Gray"),
    BLACK(11, "Black"),
    DARK_RED(59, "Dark Red"),
    RED(5, "Red"),
    RUST(27, "Rust"),
    SALMON(25, "Salmon"),
    LIGHT_SALMON(26, "Light Salmon"),
    SAND_RED(58, "Sand Red"),
    REDDISH_BROWN(88, "Reddish Brown"),
    BROWN(8, "Brown"),
    DARK_BROWN(120, "Dark Brown"),
    DARK_TAN(69, "Dark Tan"),
    TAN(2, "Tan"),
    LIGHT_FLESH(90, "Light Flesh"),
    FLESH(28, "Flesh"),
    MEDIUM_DARK_FLESH(150, "Medium Dark Flesh"),
    DARK_FLESH(91, "Dark Flesh"),
    FABULAND_BROWN(106, "Fabuland Brown"),
    FABULAND_ORANGE(160, "Fabuland Orange"),
    EARTH_ORANGE(29, "Earth Orange"),
    DARK_ORANGE(68, "Dark Orange"),
    ORANGE(4, "Orange"),
    MEDIUM_ORANGE(31, "Medium Orange"),
    BRIGHT_LIGHT_ORANGE(110, "Bright Light Orange"),
    LIGHT_ORANGE(32, "Light Orange"),
    VERY_LIGHT_ORANGE(96, "Very Light Orange"),
    YELLOW(3, "Yellow"),
    BRIGHT_LIGHT_YELLOW(103, "Bright Light Yellow"),
    LIGHT_YELLOW(33, "Light Yellow"),
    LIGHT_LIME(35, "Light Lime"),
    YELLOWISH_GREEN(158, "Yellowish Green"),
    MEDIUM_LIME(76, "Medium Lime"),
    LIME(34, "Lime"),
    OLIVE_GREEN(155, "Olive Green"),
    DARK_GREEN(80, "Dark Green"),
    GREEN(6, "Green"),
    BRIGHT_GREEN(36, "Bright Green"),
    MEDIUM_GREEN(37, "Medium Green"),
    LIGHT_GREEN(38, "Light Green"),
    SAND_GREEN(48, "Sand Green"),
    DARK_TURQUOISE(39, "Dark Turquoise"),
    LIGHT_TURQUOISE(40, "Light Turquoise"),
    AQUA(41, "Aqua"),
    LIGHT_AQUA(152, "Light Aqua"),
    DARK_BLUE(63, "Dark Blue"),
    BLUE(7, "Blue"),
    DARK_AZURE(153, "Dark Azure"),
    MEDIUM_AZURE(156, "Medium Azure"),
    MEDIUM_BLUE(42, "Medium Blue"),
    MAERSK_BLUE(72, "Maersk Blue"),
    BRIGHT_LIGHT_BLUE(105, "Bright Light Blue"),
    LIGHT_BLUE(62, "Light Blue"),
    SKY_BLUE(87, "Sky Blue"),
    SAND_BLUE(55, "Sand Blue"),
    BLUE_VIOLET(97, "Blue-Violet"),
    DARK_BLUE_VIOLET(109, "Dark Blue-Violet"),
    VIOLET(43, "Violet"),
    MEDIUM_VIOLET(73, "Medium Violet"),
    LIGHT_VIOLET(44, "Light Violet"),
    DARK_PURPLE(89, "Dark Purple"),
    PURPLE(24, "Purple"),
    LIGHT_PURPLE(93, "Light Purple"),
    MEDIUM_LAVENDER(157, "Medium Lavender"),
    LAVENDER(154, "Lavender"),
    SAND_PURPLE(54, "Sand Purple"),
    MAGENTA(71, "Magenta"),
    DARK_PINK(47, "Dark Pink"),
    MEDIUM_DARK_PINK(94, "Medium Dark Pink"),
    BRIGHT_PINK(104, "Bright Pink"),
    PINK(23, "Pink"),
    LIGHT_PINK(56, "Light Pink"),
    TRANS_CLEAR(12, "Trans-Clear"),
    TRANS_BLACK(13, "Trans-Black"),
    TRANS_RED(17, "Trans-Red"),
    TRANS_NEON_ORANGE(18, "Trans-Neon Orange"),
    TRANS_ORANGE(98, "Trans-Orange"),
    TRANS_NEON_YELLOW(121, "Trans-Neon Yellow"),
    TRANS_YELLOW(19, "Trans-Yellow"),
    TRANS_NEON_GREEN(16, "Trans-Neon Green"),
    TRANS_BRIGHT_GREEN(108, "Trans-Bright Green"),
    TRANS_GREEN(20, "Trans-Green"),
    TRANS_DARK_BLUE(14, "Trans-Dark Blue"),
    TRANS_MEDIUM_BLUE(74, "Trans-Medium Blue"),
    TRANS_LIGHT_BLUE(15, "Trans-Light Blue"),
    TRANS_VERY_LIGHTT_BLUE(113, "Trans-Very Lt Blue"),
    TRANS_LIGHT_PURPLE(114, "Trans-Light Purple"),
    TRANS_PURPLE(51, "Trans-Purple"),
    TRANS_DARK_PINK(50, "Trans-Dark Pink"),
    TRANS_PINK(107, "Trans-Pink"),
    CHROME_GOLD(21, "Chrome Gold"),
    CHROME_SILVER(22, "Chrome Silver"),
    CHROME_ANTIQUE_BRASS(57, "Chrome Antique Brass"),
    CHROME_BLACK(122, "Chrome Black"),
    CHROME_BLUE(52, "Chrome Blue"),
    CHROME_GREEN(64, "Chrome Green"),
    CHROME_PINK(82, "Chrome Pink"),
    PEARL_WHITE(83, "Pearl White"),
    PEARL_VERY_LIGHT_GRAY(119, "Pearl Very Light Gray"),
    PEARL_LIGHT_GRAY(66, "Pearl Light Gray"),
    FLAT_SILVER(95, "Flat Silver"),
    PEARL_DARK_GRAY(77, "Pearl Dark Gray"),
    METAL_BLUE(78, "Metal Blue"),
    PEARL_LIGHT_GOLD(61, "Pearl Light Gold"),
    PEARL_GOLD(115, "Pearl Gold"),
    FLAT_DARK_GOLD(81, "Flat Dark Gold"),
    COPPER(84, "Copper"),
    METALLIC_SILVER(67, "Metallic Silver"),
    METALLIC_GREEN(70, "Metallic Green"),
    METALLIC_GOLD(65, "Metallic Gold"),
    MILKY_WHITE(60, "Milky White"),
    GLOW_IN_DARK_WHITE(159, "Glow in Dark White"),
    GLOW_IN_DARK_OPAQUE(46, "Glow In Dark Opaque"),
    GLOW_IN_DARK_TRANS(118, "Glow In Dark Trans"),
    GLITTER_TRANS_CLEAR(101, "Glitter Trans-Clear"),
    GLITTER_TRANS_PURPLE(102, "Glitter Trans-Purple"),
    GLITTER_TRANS_DARK_PINK(100, "Glitter Trans-Dark Pink"),
    SPECKLE_BLACK_SILVER(111, "Speckle Black-Silver"),
    SPECKLE_BLACK_GOLD(151, "Speckle Black-Gold"),
    SPECKLE_BLACK_COPPER(116, "Speckle Black-Copper"),
    SPECKLE_DBGRAY_SILVER(117, "Speckle DBGray-Silver"),
    MX_WHITE(123, "Mx White"),
    MX_LIGHT_BLUISH_GRAY(124, "Mx Light Bluish Gray"),
    MX_LIGHT_GRAY(125, "Mx Light Gray"),
    MX_CHARCOAL_GRAY(126, "Mx Charcoal Gray"),
    MX_TILE_GRAY(127, "Mx Tile Gray"),
    MX_BLACK(128, "Mx Black"),
    MX_TILE_BROWN(131, "Mx Tile Brown"),
    MX_TERRACOTTA(134, "Mx Terracotta"),
    MX_BROWN(132, "Mx Brown"),
    MX_BUFF(133, "Mx Buff"),
    MX_RED(129, "Mx Red"),
    MX_PINK_RED(130, "Mx Pink Red"),
    MX_ORANGE(135, "Mx Orange"),
    MX_LIGHT_ORANGE(136, "Mx Light Orange"),
    MX_LIGHT_YELLOW(137, "Mx Light Yellow"),
    MX_OCHRE_YELLOW(138, "Mx Ochre Yellow"),
    MX_LEMON(139, "Mx Lemon"),
    MX_PASTEL_GREEN(141, "Mx Pastel Green"),
    MX_OLIVE_GREEN(140, "Mx Olive Green"),
    MX_AQUA_GREEN(142, "Mx Aqua Green"),
    MX_TEAL_BLUE(146, "Mx Teal Blue"),
    MX_TILE_BLUE(143, "Mx Tile Blue"),
    MX_MEDIUM_BLUE(144, "Mx Medium Blue"),
    MX_PASTEL_BLUE(145, "Mx Pastel Blue"),
    MX_VIOLET(147, "Mx Violet"),
    MX_PINK(148, "Mx Pink"),
    MX_CLEAR(149, "Mx Clear");

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
}
