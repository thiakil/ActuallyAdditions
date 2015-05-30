package ellpeck.actuallyadditions.config.values;

import ellpeck.actuallyadditions.config.ConfigCategories;
import ellpeck.actuallyadditions.config.ConfigValues;

public enum ConfigCrafting{

    COMPOST("Compost", ConfigCategories.BLOCKS_CRAFTING),
    WOOD_CASING("Wood Casing", ConfigCategories.BLOCKS_CRAFTING),
    STONE_CASING("Stone Casing", ConfigCategories.BLOCKS_CRAFTING),
    FISHING_NET("Fishing Net", ConfigCategories.BLOCKS_CRAFTING),
    REPAIRER("Repairer", ConfigCategories.BLOCKS_CRAFTING),
    SOLAR_PANEL("Solar Panel", ConfigCategories.BLOCKS_CRAFTING),
    HEAT_COLLECTOR("Heat Collector", ConfigCategories.BLOCKS_CRAFTING),
    INPUTTER("ESD", ConfigCategories.BLOCKS_CRAFTING),
    CRUSHER("Crusher", ConfigCategories.BLOCKS_CRAFTING),
    DOUBLE_CRUSHER("Double Crusher", ConfigCategories.BLOCKS_CRAFTING),
    DOUBLE_FURNACE("Double Furnace", ConfigCategories.BLOCKS_CRAFTING),
    FEEDER("Feeder", ConfigCategories.BLOCKS_CRAFTING),
    GIANT_CHEST("Storage Crate", ConfigCategories.BLOCKS_CRAFTING),

    GREENHOUSE_GLASS("Greenhouse Glass", ConfigCategories.BLOCKS_CRAFTING),
    BREAKER("Breaker", ConfigCategories.BLOCKS_CRAFTING),
    PLACER("Placer", ConfigCategories.BLOCKS_CRAFTING),
    DROPPER("Dropper", ConfigCategories.BLOCKS_CRAFTING),
    SPEED_UPGRADE("Speed Upgrade", ConfigCategories.BLOCKS_CRAFTING),

    BAGUETTE("Baguette", ConfigCategories.FOOD_CRAFTING),
    PIZZA("Pizza", ConfigCategories.FOOD_CRAFTING),
    HAMBURGER("Hamburger", ConfigCategories.FOOD_CRAFTING),
    BIG_COOKIE("Big Cookie", ConfigCategories.FOOD_CRAFTING),
    SUB("Sub Sandwich", ConfigCategories.FOOD_CRAFTING),
    FRENCH_FRY("French Fry", ConfigCategories.FOOD_CRAFTING),
    FRENCH_FRIES("French Fries", ConfigCategories.FOOD_CRAFTING),
    FISH_N_CHIPS("Fish And Chips", ConfigCategories.FOOD_CRAFTING),
    CHEESE("Cheese", ConfigCategories.FOOD_CRAFTING),
    PUMPKIN_STEW("Pumpkin Stew", ConfigCategories.FOOD_CRAFTING),
    CARROT_JUICE("Carrot Juice", ConfigCategories.FOOD_CRAFTING),
    SPAGHETTI("Spaghetti", ConfigCategories.FOOD_CRAFTING),
    NOODLE("Noodle", ConfigCategories.FOOD_CRAFTING),
    CHOCOLATE("Chocolate", ConfigCategories.FOOD_CRAFTING),
    CHOCOLATE_CAKE("Chocolate Cake", ConfigCategories.FOOD_CRAFTING),
    TOAST("Toast", ConfigCategories.FOOD_CRAFTING),

    LEAF_BLOWER("Leaf Blower", ConfigCategories.ITEMS_CRAFTING),
    LEAF_BLOWER_ADVANCED("Advanced Leaf Blower", ConfigCategories.ITEMS_CRAFTING),
    COIL("Coil", ConfigCategories.ITEMS_CRAFTING),
    ADV_COIL("Advanced Coil", ConfigCategories.ITEMS_CRAFTING),
    KNIFE("Knife", ConfigCategories.ITEMS_CRAFTING),
    STICK_CRAFTER("Crafting Table On A Stick", ConfigCategories.ITEMS_CRAFTING),
    MASHED_FOOD("Mashed Food", ConfigCategories.ITEMS_CRAFTING),

    RING_SPEED("Speed Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_HASTE("Haste Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_STRENGTH("Strength Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_JUMP_BOOST("Jump Boost Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_REGEN("Regen Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_RESISTANCE("Resistance Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_FIRE_RESISTANCE("Fire Resistance Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_WATER_BREATHING("Water Breathing Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_INVISIBILITY("Invisibility Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_NIGHT_VISION("Night Vision Ring", ConfigCategories.POTION_RING_CRAFTING),
    RING_SATURATION("Saturation Ring", ConfigCategories.POTION_RING_CRAFTING, false),

    DOUGH("Dough", ConfigCategories.ITEMS_CRAFTING),
    PAPER_CONE("Paper Cone", ConfigCategories.ITEMS_CRAFTING),
    KNIFE_HANDLE("Knife Handle", ConfigCategories.ITEMS_CRAFTING),
    KNIFE_BLADE("Knife Blade", ConfigCategories.ITEMS_CRAFTING),

    TOOL_EMERALD("Emerald Tools", ConfigCategories.ITEMS_CRAFTING),
    TOOL_OBSIDIAN("Obsidian Tools", ConfigCategories.ITEMS_CRAFTING),
    RICE_BREAD("Rice Bread", ConfigCategories.FOOD_CRAFTING),
    RICE_DOUGH("Rice Dough", ConfigCategories.FOOD_CRAFTING),

    RICE_GADGETS("Rice Gadgets", ConfigCategories.ITEMS_CRAFTING),
    RESONANT_RICE("Resonant Rice", ConfigCategories.ITEMS_CRAFTING),

    CANOLA_PRESS("Canola Press", ConfigCategories.BLOCKS_CRAFTING),
    FERMENTING_BARREL("Fermenting Barrel", ConfigCategories.BLOCKS_CRAFTING),
    COAL_GENERATOR("Coal Generator", ConfigCategories.BLOCKS_CRAFTING),
    OIL_GENERATOR("Oil Generator", ConfigCategories.BLOCKS_CRAFTING),
    PHANTOMFACE("Phantomface", ConfigCategories.BLOCKS_CRAFTING),
    PHANTOM_CONNECTOR("Phantom Connector", ConfigCategories.ITEMS_CRAFTING),

    PHANTOM_ENERGYFACE("Phantom Energyface", ConfigCategories.BLOCKS_CRAFTING),
    PHANTOM_LIQUIFACE("Phantom Liquiface", ConfigCategories.BLOCKS_CRAFTING),
    PHANTOM_PLACER("Phantom Placer", ConfigCategories.BLOCKS_CRAFTING),
    PHANTOM_BREAKER("Phantom Breaker", ConfigCategories.BLOCKS_CRAFTING),
    LIQUID_PLACER("Liquid Placer", ConfigCategories.BLOCKS_CRAFTING),
    LIQUID_BREAKER("Liquid Collector", ConfigCategories.BLOCKS_CRAFTING);

    public final String name;
    public final String category;
    public final boolean defaultValue;

    ConfigCrafting(String name, ConfigCategories category){
        this(name, category, true);
    }

    ConfigCrafting(String name, ConfigCategories category, boolean defaultValue){
        this.name = name;
        this.category = category.name;
        this.defaultValue = defaultValue;
    }

    public boolean isEnabled(){
        return ConfigValues.craftingValues[this.ordinal()];
    }
}
