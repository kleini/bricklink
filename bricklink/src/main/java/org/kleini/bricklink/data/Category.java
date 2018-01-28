/*
 * GPL v3
 */

package org.kleini.bricklink.data;

/**
 * The main category of an item
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Category {

    ANTENNA(1, "Antenna"),
    BASEPLATE(2, "Baseplate"),
    BOAT(3, "Boat"),
    BRACKET(4, "Bracket"),
    BRICK(5, "Brick"),
    BRICK_ARCH(6, "Brick, Arch"),
    BRICK_MODIFIED(7, "Brick, Modified"),
    BRICK_ROUND(8, "Brick, Round"),
    CASTLE(9, "Castle"),
    CONTAINER(10, "Container"),
    CYLINDER(11, "Cylinder"),
    DOOR(12, "Door"),
    FENCE(13, "Fence"),
    MAGNET(14, "Magnet"),
    MINIFIG_HEADGEAR(16, "Minifig, Headgear"),
    MINIFIG_UTENSIL(18, "Minifig, Utensil"),
    MINIFIG_WEAPON(19, "Minifig, Weapon"),
    MINIFIG_BODY_PART(20, "Minifig, Body Part"),
    CONE(21, "Cone"),
    HINGE(22, "Hinge"),
    LEVER(24, "Lever"),
    PLANT(25, "Plant"),
    PLATE(26, "Plate"),
    PLATE_MODIFIED(27, "Plate, Modified"),
    PLATE_ROUND(28, "Plate, Round"),
    PROPELLER(30, "Propeller"),
    SLOPE(31, "Slope"),
    SLOPE_INVERTED(32, "Slope, Inverted"),
    SLOPE_DECORATED(33, "Slope, Decorated"),
    SPACE(34, "Space"),
    TECHNIC(36, "Technic"),
    TILE(37, "Tile"),
    TILE_MODIFIED(38, "Tile, Modified"),
    TILE_DECORATED(39, "Tile, Decorated"),
    TURNTABLE(40, "Turntable"),
    WEDGE(42, "Wedge"),
    WHEEL(43, "Wheel"),
    ARM(45, "Arm"),
    BAR(46, "Bar"),
    BELVILLE(48, "Belville"),
    ADVENTURERS(53, "Adventurers"),
    AQUAZONE(54, "Aquazone"),
    MINDSTORMS(59, "Mindstorms"),
    MODEL_TEAM(60, "Model Team"),
    PIRATES(61, "Pirates"),
    ROCK_RAIDERS(62, "Rock Raiders"),
    SERVICE_PACKS(63, "Service Packs"),
    STAR_WARS(65, "Star Wars"),
    TOWN(67, "Town"),
    WESTERN(69, "Western"),
    VEHICLE(72, "Vehicle"),
    CONVEYOR(73, "Conveyor"),
    CRANE(74, "Crane"),
    FLAG(76, "Flag"),
    VEHICLE_MUDGUARD(77, "Vehicle, Mudguard"),
    FREESTYLE(78, "Freestyle"),
    GARAGE(79, "Garage"),
    GLASS(81, "Glass"),
    HINGE_DECORATED(83, "Hinge, Decorated"),
    WINDOW_DECORATED(84, "Window, Decorated"),
    HOMEMAKER(85, "Homemaker"),
    ANIMAL_ACCESSORY(86, "Animal, Accessory"),
    HOSE(87, "Hose"),
    STRING_REEL_WINCH(88, "String Reel / Winch"),
    LADDER(90, "Ladder"),
    PANEL(91, "Panel"),
    AIRCRAFT(93, "Aircraft"),
    PLANT_TREE(95, "Plant, Tree"),
    ROAD_SIGN(98, "Road Sign"),
    ROCK(99, "Rock"),
    SCALA(102, "Scala"),
    STAIRS(103, "Stairs"),
    SUPPORT(105, "Support"),
    TAIL(106, "Tail"),
    TAP(107, "Tap"),
    TIRE_AND_TREAD(111, "Tire & Tread"),
    HOOK(112, "Hook"),
    WINDOW(113, "Window"),
    WING(114, "Wing"),
    WINDSCREEN(115, "Windscreen"),
    DISH(116, "Dish"),
    TILE_ROUND(117, "Tile, Round"),
    BRICK_DECORATED(118, "Brick, Decorated"),
    ELECTRIC(119, "Electric"),
    ELECTRIC_MOTOR(121, "Electric, Motor"),
    ELECTRIC_TRAIN(122, "Electric, Train"),
    ELECTRIC_LIGHT_AND_SOUND(123, "Electric, Light & Sound"),
    TRAIN(124, "Train"),
    TRAIN_TRACK(128, "Train, Track"),
    BASEPLATE_ROAD(130, "Baseplate, Road"),
    VEHICLE_BASE(131, "Vehicle, Base"),
    GLASS_DECORATED(132, "Glass, Decorated"),
    TECHNIC_CONNECTOR(133, "Technic, Connector"),
    TECHNIC_AXLE(134, "Technic, Axle"),
    TECHNIC_BRICK(135, "Technic, Brick"),
    TECHNIC_GEAR(136, "Technic, Gear"),
    TECHNIC_LIFTARM(137, "Technic, Liftarm"),
    TECHNIC_LINK(138, "Technic, Link"),
    TECHNIC_PIN(139, "Technic, Pin"),
    TECHNIC_PLATE(140, "Technic, Plate"),
    TECHNIC_STEERING(141, "Technic, Steering"),
    MINIFIG_BODY_WEAR(142, "Minifig, Body Wear"),
    OTHER(143, "(Other)"),
    ANIMAL_WATER(145, "Animal, Water"),
    ANIMAL_AIR(146, "Animal, Air"),
    ANIMAL_LAND(147, "Animal, Land"),
    ANIMAL_BODY_PART(148, "Animal, Body Part"),
    DISNEYS_MICKEY_MOUSE(149, "Disney's Mickey Mouse"),
    MINIFIG_TORSO(150, "Minifig, Torso"),
    ZNAP(152, "Znap"),
    FABULAND(153, "Fabuland"),
    TECHNIC_PANEL(154, "Technic, Panel"),
    BASIC(155, "Basic"),
    TIME_CRUISERS(157, "Time Cruisers"),
    PNEUMATIC(159, "Pneumatic"),
    STICKER(160, "Sticker"),
    PLASTIC(161, "Plastic"),
    CLOTH(162, "Cloth"),
    EDUCATIONAL_AND_DACTA(166, "Educational & Dacta"),
    DUPLO(167, "Duplo"),
    SCULPTURES(169, "Sculptures"),
    ALPHA_TEAM(170, "Alpha Team"),
    CREATOR(171, "Creator"),
    STUDIOS(174, "Studios"),
    FOOD_AND_DRINK(175, "Food & Drink"),
    RACERS(179, "Racers"),
    SOFTWARE(180, "Software"),
    DINOSAURS(183, "Dinosaurs"),
    ANIMAL_DINOSAUR(184, "Animal, Dinosaur"),
    RIDING_CYCLE(225, "Riding Cycle"),
    HOBBY_SETS(226, "Hobby Sets"),
    HARRY_POTTER(227, "Harry Potter"),
    RUBBER_BAND_AND_BELT(229, "Rubber Band & Belt"),
    STRING(231, "String"),
    FOAM(234, "Foam"),
    BIONICLE_KANOHI_MASK(235, "Bionicle, Kanohi Mask"),
    MONORAIL(237, "Monorail"),
    MINIFIG_HEAD(238, "Minifig, Head"),
    PEN(241, "Pen"),
    TECHNIC_FIGURE_ACCESSORY(242, "Technic, Figure Accessory"),
    BASEPLATE_RAISED(243, "Baseplate, Raised"),
    PAPER(246, "Paper"),
    GAME(252, "Game"),
    LEARNING_BOOK(254, "Learning Book"),
    BIONICLE(273, "Bionicle"),
    LEGOLAND(277, "Legoland"),
    NINJA(284, "Ninja"),
    VALUE_PACKS(290, "Value Packs"),
    BABY(293, "Baby"),
    PRIMO(294, "Primo"),
    IDEA_BOOK(317, "Idea Book"),
    COMIC_BOOK(331, "Comic Book"),
    INFORMATIONAL_BOOK(332, "Informational Book"),
    GAME_CARD(333, "Game Card"),
    KEY_CHAIN(334, "Key Chain"),
    CLOCK(336, "Clock"),
    YEAR_1965(340, "1965"),
    YEAR_1966(341, "1966"),
    YEAR_1967(342, "1967"),
    YEAR_1968(343, "1968"),
    YEAR_1969(344, "1969"),
    YEAR_1970(345, "1970"),
    YEAR_1971(346, "1971"),
    YEAR_1972(347, "1972"),
    YEAR_1973(348, "1973"),
    YEAR_1974(349, "1974"),
    YEAR_1975(350, "1975"),
    YEAR_1976(351, "1976"),
    YEAR_1977(352, "1977"),
    YEAR_1978(353, "1978"),
    YEAR_1979(354, "1979"),
    YEAR_1980(355, "1980"),
    YEAR_1981(356, "1981"),
    YEAR_1982(357, "1982"),
    YEAR_1983(358, "1983"),
    YEAR_1984(359, "1984"),
    YEAR_1985(360, "1985"),
    YEAR_1986(361, "1986"),
    YEAR_1987(362, "1987"),
    YEAR_1988(363, "1988"),
    YEAR_1989(364, "1989"),
    YEAR_1990(365, "1990"),
    YEAR_1991(366, "1991"),
    YEAR_1992(367, "1992"),
    YEAR_1993(368, "1993"),
    YEAR_1994(369, "1994"),
    YEAR_1995(370, "1995"),
    YEAR_1996(371, "1996"),
    YEAR_1997(372, "1997"),
    YEAR_1998(373, "1998"),
    YEAR_1999(374, "1999"),
    YEAR_2000(375, "2000"),
    YEAR_2001(377, "2001"),
    YEAR_2002(378, "2002"),
    ROOF(379, "Roof"),
    TRADING_CARD(380, "Trading Card"),
    BUILDING_SET_WITH_PEOPLE(388, "Building Set with People"),
    HOLIDAY(390, "Holiday"),
    MINITALIA(394, "Minitalia"),
    SAMSONITE(395, "Samsonite"),
    HUMAN_FURNITURE(398, "Human Furniture"),
    STORAGE(399, "Storage"),
    ELECTRIC_BATTERY_BOX(411, "Electric, Battery Box"),
    BELVILLE_FIGURE_ACCESSORY(412, "Belville, Figure Accessory"),
    SCALA_FIGURE_ACCESSORY(413, "Scala, Figure Accessory"),
    DUPLO_BRICK(417, "Duplo, Brick"),
    MINIFIG_SHIELD(418, "Minifig, Shield"),
    DUPLO_ANIMAL(420, "Duplo, Animal"),
    UNIVERSAL_BUILDING_SET(422, "Universal Building Set"),
    CLASSIC(423, "Classic"),
    HO_1_87_VEHICLES(424, "HO 1:87 Vehicles"),
    JUMBO_BRICKS(429, "Jumbo Bricks"),
    SPYBOTICS(436, "Spybotics"),
    EXPLORE(437, "Explore"),
    SLOPE_CURVED(438, "Slope, Curved"),
    SOFT_BRICKS(439, "Soft Bricks"),
    DUPLO_BRICK_DECORATED(440, "Duplo, Brick, Decorated"),
    DUPLO_TRAIN(441, "Duplo, Train"),
    PUZZLE(443, "Puzzle"),
    GALIDOR(444, "Galidor"),
    PATCH_AND_PIN(445, "Patch & Pin"),
    OFFICE_AND_SCHOOL_SUPPLIES(447, "Office & School Supplies"),
    ISLAND_XTREME_STUNTS(449, "Island Xtreme Stunts"),
    TRACK_SYSTEM(450, "Track System"),
    PANEL_DECORATED(461, "Panel, Decorated"),
    MAGAZINE(462, "Magazine"),
    ELECTRIC_PROGRAMMABLE(463, "Electric, Programmable"),
    BEAD(464, "Bead"),
    SPIDER_MAN(469, "Spider-Man"),
    POSTCARD(472, "Postcard"),
    SPORTS(473, "Sports"),
    BULK_BRICKS(478, "Bulk Bricks"),
    COCKPIT(479, "Cockpit"),
    DISCOVERY(482, "Discovery"),
    TECHNIC_FLEX_CABLE(483, "Technic, Flex Cable"),
    MINIFIG_LEGS_ASSEMBLY(484, "Minifig, Legs Assembly"),
    MINIFIG_TORSO_ASSEMBLY(485, "Minifig, Torso Assembly"),
    DESIGNER_SETS(486, "Designer Sets"),
    DUPLO_PLATE(487, "Duplo, Plate"),
    DUPLO_VEHICLE(488, "Duplo, Vehicle"),
    CLIKITS(490, "Clikits"),
    YEAR_2003(491, "2003"),
    INVENTOR(497, "Inventor"),
    LUGGAGE_AND_LUNCH_BOX(498, "Luggage & Lunch Box"),
    POSTER(503, "Poster"),
    MOTOR_NON_ELECTRIC(504, "Motor, Non-Electric"),
    STORY_BOOK(505, "Story Book"),
    DUPLO_BRICK_PROMOTIONAL(506, "Duplo, Brick, Promotional"),
    PLUSH_TOY(512, "Plush Toy"),
    MEDIA_AUDIO_AND_VIDEO(513, "Media Audio & Video"),
    THROWING_DISK(514, "Throwing Disk"),
    YEAR_2004(515, "2004"),
    FOR_JUNIORS(516, "4 Juniors"),
    WATCH(517, "Watch"),
    PHOTO_FRAME_AND_HOLDER(521, "Photo Frame & Holder"),
    HOSE_RIBBED_7MM_D(522, "Hose, Ribbed 7mm D."),
    DUPLO_TOOLO(524, "Duplo, Toolo"),
    HUMAN_TOILETRIES(525, "Human Toiletries"),
    RETAIL_DISPLAY_FLAG(526, "Retail Display Flag"),
    HOSE_SOFT_AXLE(527, "Hose, Soft Axle"),
    HOSE_RIGID_3MM_D(528, "Hose, Rigid 3mm D."),
    HOSE_SOFT_3MM_D(529, "Hose, Soft 3mm D."),
    HOSE_PNEUMATIC_4MM_D(530, "Hose, Pneumatic 4mm D."),
    WHEEL_AND_TIRE_ASSEMBLY(532, "Wheel & Tire Assembly"),
    BRICK_PROMOTIONAL(534, "Brick, Promotional"),
    BRICK_MODIFIED_DECORATED(535, "Brick, Modified, Decorated"),
    QUATRO(537, "Quatro"),
    DUPLO_TILE_DECORATED(538, "Duplo, Tile, Decorated"),
    RETAIL_DISPLAY(539, "Retail Display"),
    DOOR_FRAME(540, "Door Frame"),
    TECHNIC_SHOCK_ABSORBER(542, "Technic, Shock Absorber"),
    HUMAN_BODY_WEAR(543, "Human Body Wear"),
    YEAR_2005(544, "2005"),
    FIRST_LEGO_LEAGUE(545, "FIRST LEGO League"),
    VIKINGS(548, "Vikings"),
    YEAR_1964(551, "1964"),
    COLORING_BOOK(552, "Coloring Book"),
    YEAR_1963(553, "1963"),
    YEAR_1962(554, "1962"),
    YEAR_1961(555, "1961"),
    YEAR_1960(556, "1960"),
    YEAR_1959(557, "1959"),
    YEAR_1958(558, "1958"),
    YEAR_1957(559, "1957"),
    YEAR_1955(561, "1955"),
    DINO_ATTACK(563, "Dino Attack"),
    COLLECTOR_CARD(564, "Collector Card"),
    YEAR_2006(565, "2006"),
    FACTORY(566, "Factory"),
    DINO_2010(567, "Dino 2010"),
    EXO_FORCE(568, "Exo-Force"),
    LARGE_FIGURE_PART(569, "Large Figure Part"),
    BATMAN_I(570, "Batman I"),
    LEGOLAND_PARKS(572, "Legoland Parks"),
    SPONGEBOB_SQUAREPANTS(573, "SpongeBob SquarePants"),
    AVATAR(574, "Avatar"),
    CLIKITS_ICON(575, "Clikits, Icon"),
    CURRICULUM_ACTIVITY_BOOK(576, "Curriculum Activity Book"),
    WEDGE_DECORATED(578, "Wedge, Decorated"),
    WINDSCREEN_DECORATED(579, "Windscreen, Decorated"),
    YEAR_2007(581, "2007"),
    STICKER_OVER_ASSEMBLY(582, "Sticker Over Assembly"),
    WEDGE_PLATE(583, "Wedge, Plate"),
    DUPLO_FIGURE_WEAR_AND_UTENSIL(585, "Duplo, Figure Wear & Utensil"),
    PLAY_WEAR_AND_WEAPONRY(586, "Play Wear & Weaponry"),
    PUZZLE_BOOK(594, "Puzzle Book"),
    TOWN_PLAN(600, "Town Plan"),
    YEAR_2008(601, "2008"),
    COIN_AND_COIN_BANK(604, "Coin and Coin Bank"),
    INDIANA_JONES(605, "Indiana Jones"),
    MINIFIG_HEAD_MODIFIED(606, "Minifig, Head, Modified"),
    SPEED_RACER(608, "Speed Racer"),
    AGENTS(609, "Agents"),
    DINO(617, "Dino"),
    X_POD(623, "X-Pod"),
    LEGO_BRAND_STORE(625, "Lego Brand Store"),
    YEAR_1950(628, "1950"),
    ARCHITECTURE(629, "Architecture"),
    MINIFIG_HEADGEAR_ACCESSORY(636, "Minifig, Headgear Accessory"),
    TECHNIC_DISK(638, "Technic, Disk"),
    DUPLO_BOAT(639, "Duplo, Boat"),
    DUPLO_AIRCRAFT(640, "Duplo, Aircraft"),
    DUPLO_FURNITURE(641, "Duplo, Furniture"),
    DOOR_DECORATED(642, "Door, Decorated"),
    CONTAINER_DECORATED(643, "Container, Decorated"),
    EARLY_TOY(645, "Early Toy"),
    ELECTRONICS(646, "Electronics"),
    YEAR_2009(647, "2009"),
    BEDDING(648, "Bedding"),
    FAST_FOOD_TOY(679, "Fast Food Toy"),
    GLUED_MODEL(683, "Glued Model"),
    POWER_MINERS(689, "Power Miners"),
    DUPLO_DOLL(707, "Duplo, Doll"),
    MODULAR_BUILDINGS(710, "Modular Buildings"),
    VIDEO_GAME(712, "Video Game"),
    POWER_FUNCTIONS(721, "Power Functions"),
    MODULEX(727, "Modulex"),
    MODULEX_TILE_DECORATED(728, "Modulex, Tile, Decorated"),
    MODULEX_BRICK(729, "Modulex, Brick"),
    MODULEX_WINDOW(730, "Modulex, Window"),
    BEN_10(731, "Ben 10"),
    TOY_STORY(732, "Toy Story"),
    ATLANTIS(733, "Atlantis"),
    PRINCE_OF_PERSIA(734, "Prince of Persia"),
    ELECTRIC_WIRE_AND_CONNECTOR(735, "Electric, Wire & Connector"),
    BRICK_ROUND_DECORATED(736, "Brick, Round, Decorated"),
    FLAG_DECORATED(738, "Flag, Decorated"),
    TECHNIC_PANEL_DECORATED(740, "Technic, Panel, Decorated"),
    TAIL_DECORATED(741, "Tail, Decorated"),
    YEAR_2010(743, "2010"),
    BUILDING_EVENT_INSTRUCTIONS(745, "Building Event Instructions"),
    COLLECTIBLE_MINIFIGURES(746, "Collectible Minifigures"),
    WORLD_RACERS(747, "World Racers"),
    CARS(748, "Cars"),
    HERO_FACTORY(749, "Hero Factory"),
    UNIVERSE(755, "Universe"),
    YEAR_2011(756, "2011"),
    PHARAOHS_QUEST(757, "Pharaoh's Quest"),
    NINJAGO(759, "Ninjago"),
    PIRATES_OF_THE_CARIBBEAN(761, "Pirates of the Caribbean"),
    MASTER_BUILDER_ACADEMY(764, "Master Builder Academy"),
    ACTIVITY_BOOK(766, "Activity Book"),
    YEAR_2012(767, "2012"),
    SUPER_HEROES(768, "Super Heroes"),
    FRIENDS(771, "Friends"),
    DISNEY_PRINCESS(773, "Disney Princess"),
    SLOPE_CURVED_DECORATED(775, "Slope, Curved, Decorated"),
    SLOPE_INVERTED_DECORATED(776, "Slope, Inverted, Decorated"),
    TECHNIC_LIFTARM_DECORATED(777, "Technic, Liftarm, Decorated"),
    TILE_MODIFIED_DECORATED(778, "Tile, Modified, Decorated"),
    DISH_DECORATED(779, "Dish, Decorated"),
    VEHICLE_MUDGUARD_DECORATED(780, "Vehicle, Mudguard, Decorated"),
    MONSTER_FIGHTERS(781, "Monster Fighters"),
    YEAR_2013(786, "2013"),
    LEGENDS_OF_CHIMA(787, "Legends of Chima"),
    THE_HOBBIT_AND_THE_LORD_OF_THE_RINGS(789, "The Hobbit and the Lord of the Rings"),
    TEENAGE_MUTANT_NINJA_TURTLES(790, "Teenage Mutant Ninja Turtles"),
    THE_LONE_RANGER(795, "The Lone Ranger"),
    YEAR_1954(797, "1954"),
    MINECRAFT(801, "Minecraft"),
    MUJI(802, "Muji"),
    THE_LEGO_MOVIE(804, "The Lego Movie"),
    YEAR_2014(805, "2014"),
    THE_SIMPSONS(807, "The Simpsons"),
    MIXELS(808, "Mixels"),
    JUNIORS(809, "Juniors"),
    TILE_ROUND_DECORATED(812, "Tile, Round, Decorated"),
    ULTRA_AGENTS(815, "Ultra Agents"),
    LEGO_IDEAS_AND_CUUSOO(817, "LEGO Ideas &#40;CUUSOO&#41;"),
    FUSION(822, "Fusion"),
    YEAR_2015(826, "2015"),
    SPEED_CHAMPIONS(842, "Speed Champions"),
    ELVES(843, "Elves"),
    DUPLO_CLOTH(845, "Duplo, Cloth"),
    DUPLO_BASEPLATE(846, "Duplo, Baseplate"),
    MINIFIG_HAIR(847, "Minifig, Hair"),
    RETAIL_DISPLAY_CASE(848, "Retail Display Case"),
    JURASSIC_WORLD(850, "Jurassic World"),
    SCOOBY_DOO(856, "Scooby-Doo"),
    DIMENSIONS(860, "Dimensions"),
    NEXO_KNIGHTS(868, "Nexo Knights"),
    YEAR_2016(869, "2016"),
    GHOSTBUSTERS(870, "Ghostbusters"),
    THE_ANGRY_BIRDS_MOVIE(876, "The Angry Birds Movie"),
    DISNEY(878, "Disney"),
    PLATE_DECORATED(885, "Plate, Decorated"),
    PLATE_MODIFIED_DECORATED(890, "Plate, Modified, Decorated"),
    THE_LEGO_BATMAN_MOVIE(892, "The LEGO Batman Movie"),
    DC_SUPER_HERO_GIRLS(893, "DC Super Hero Girls"),
    MOANA(894, "Moana"),
    YEAR_2017(901, "2017"),
    BRICKHEADZ(903, "BrickHeadz"),
    MINI_DOLL_BODY_PART(911, "Mini Doll, Body Part"),
    MINI_DOLL_BODY_WEAR(912, "Mini Doll, Body Wear"),
    MINI_DOLL_HAIR(913, "Mini Doll, Hair"),
    MINI_DOLL_HEAD(914, "Mini Doll, Head"),
    MINI_DOLL_HEADGEAR(915, "Mini Doll, Headgear"),
    MINI_DOLL_LEGS_ASSEMBLY(916, "Mini Doll, Legs Assembly"),
    MINI_DOLL_TORSO_ASSEMBLY(917, "Mini Doll, Torso Assembly"),
    CITIES_OF_WONDERS(919, "Cities of Wonders"),
    THE_LEGO_NINJAGO_MOVIE(920, "The LEGO Ninjago Movie"),
    BOOST(921, "BOOST"),
    CYLINDER_DECORATED(926, "Cylinder, Decorated"),
    BUILDING_BIGGER_THINKING(927, "Building Bigger Thinking"),
    YEAR_2018(930, "2018"),
    BRICKARMS(931, "BrickArms"),
    BRICKARMS_WEAPON_MELEE(932, "BrickArms, Weapon, Melee"),
    BRICKARMS_WEAPON_HISTORICAL(933, "BrickArms, Weapon, Historical"),
    BRICKARMS_WEAPON_WORLD_WAR(934, "BrickArms, Weapon, World War"),
    BRICKARMS_WEAPON_MODERN(935, "BrickArms, Weapon, Modern"),
    BRICKARMS_WEAPON_SCI_FI(936, "BrickArms, Weapon, Sci Fi"),
    BRICKARMS_HEADGEAR(937, "BrickArms, Headgear"),
    BRICKARMS_ACCESSORIES(938, "BrickArms, Accessories"),
    BRICKARMS_BODY_WEAR(941, "BrickArms, Body Wear"),
    BRICKARMS_RELOADED(942, "BrickArms, Reloaded"),
    MINIFIG_UTENSIL_DECORATED(943, "Minifig, Utensil, Decorated");

    private final int identifier;

    private final String name;

    Category(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public static Category byId(int identifier) throws Exception {
        for (Category category : values()) {
            if (category.getIdentifier() == identifier) {
                return category;
            }
        }
        throw new Exception("Unknown category identifier " + identifier + '.');
    }
}
