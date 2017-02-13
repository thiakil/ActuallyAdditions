/*
 * This file ("InitItems.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import de.ellpeck.actuallyadditions.mod.blocks.InitBlocks;
import de.ellpeck.actuallyadditions.mod.items.base.*;
import de.ellpeck.actuallyadditions.mod.items.lens.ItemLens;
import de.ellpeck.actuallyadditions.mod.items.metalists.TheCrystals;
import de.ellpeck.actuallyadditions.mod.items.metalists.TheFoods;
import de.ellpeck.actuallyadditions.mod.items.metalists.TheMiscItems;
import de.ellpeck.actuallyadditions.mod.material.InitArmorMaterials;
import de.ellpeck.actuallyadditions.mod.material.InitToolMaterials;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityGiantChest;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityGiantChestMedium;
import de.ellpeck.actuallyadditions.mod.util.ModUtil;
import de.ellpeck.actuallyadditions.mod.util.Util;
import de.ellpeck.actuallyadditions.mod.util.compat.CompatUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityChest;

public final class InitItems{

    public static Item itemBooklet;
    public static Item itemFertilizer;
    public static Item itemMisc;
    public static Item itemFoods;
    public static Item itemJams;
    public static Item itemKnife;
    public static Item itemCrafterOnAStick;
    public static Item itemDust;
    public static Item itemSolidifiedExperience;
    public static Item itemLeafBlower;
    public static Item itemLeafBlowerAdvanced;
    public static Item itemPotionRing;
    public static Item itemPotionRingAdvanced;
    public static Item itemPickaxeEmerald;
    public static Item itemAxeEmerald;
    public static Item itemShovelEmerald;
    public static Item itemSwordEmerald;
    public static Item itemHoeEmerald;
    public static Item itemHelmEmerald;
    public static Item itemChestEmerald;
    public static Item itemPantsEmerald;
    public static Item itemBootsEmerald;
    public static Item itemPickaxeObsidian;
    public static Item itemAxeObsidian;
    public static Item itemShovelObsidian;
    public static Item itemSwordObsidian;
    public static Item itemHoeObsidian;
    public static Item itemPickaxeQuartz;
    public static Item itemAxeQuartz;
    public static Item itemShovelQuartz;
    public static Item itemSwordQuartz;
    public static Item itemHoeQuartz;
    public static Item itemHelmObsidian;
    public static Item itemChestObsidian;
    public static Item itemPantsObsidian;
    public static Item itemBootsObsidian;
    public static Item itemHelmQuartz;
    public static Item itemChestQuartz;
    public static Item itemPantsQuartz;
    public static Item itemBootsQuartz;
    public static Item itemHairyBall;
    public static Item itemRiceSeed;
    public static Item itemCanolaSeed;
    public static Item itemFlaxSeed;
    public static Item itemCoffeeSeed;
    public static Item itemResonantRice;
    public static Item itemPhantomConnector;
    public static Item itemCoffeeBean;
    public static Item itemCoffee;
    public static Item woodenPaxel;
    public static Item stonePaxel;
    public static Item ironPaxel;
    public static Item diamondPaxel;
    public static Item goldPaxel;
    public static Item emeraldPaxel;
    public static Item obsidianPaxel;
    public static Item quartzPaxel;
    public static Item itemDrill;
    public static Item itemDrillUpgradeSpeed;
    public static Item itemDrillUpgradeSpeedII;
    public static Item itemDrillUpgradeSpeedIII;
    public static Item itemDrillUpgradeSilkTouch;
    public static Item itemDrillUpgradeFortune;
    public static Item itemDrillUpgradeFortuneII;
    public static Item itemDrillUpgradeThreeByThree;
    public static Item itemDrillUpgradeFiveByFive;
    public static Item itemDrillUpgradeBlockPlacing;
    public static Item itemBattery;
    public static Item itemBatteryDouble;
    public static Item itemBatteryTriple;
    public static Item itemBatteryQuadruple;
    public static Item itemBatteryQuintuple;
    public static Item itemTeleStaff;
    public static Item itemWingsOfTheBats;
    public static Item itemGrowthRing;
    public static Item itemMagnetRing;
    public static Item itemWaterRemovalRing;
    public static Item itemChestToCrateUpgrade;
    public static Item itemSmallToMediumCrateUpgrade;
    public static Item itemMediumToLargeCrateUpgrade;
    public static Item itemCrateKeeper;
    public static Item itemSpawnerChanger;
    public static Item itemLaserWrench;
    public static Item itemCrystal;
    public static Item itemCrystalEmpowered;
    public static Item itemColorLens;
    public static Item itemExplosionLens;
    public static Item itemDamageLens;
    public static Item itemMoreDamageLens;
    public static Item itemDisenchantingLens;
    public static Item itemMiningLens;
    public static Item itemPickaxeCrystalRed;
    public static Item itemAxeCrystalRed;
    public static Item itemShovelCrystalRed;
    public static Item itemSwordCrystalRed;
    public static Item itemHoeCrystalRed;
    public static Item itemHelmCrystalRed;
    public static Item itemChestCrystalRed;
    public static Item itemPantsCrystalRed;
    public static Item itemBootsCrystalRed;
    public static Item itemPaxelCrystalRed;
    public static Item itemPickaxeCrystalBlue;
    public static Item itemAxeCrystalBlue;
    public static Item itemShovelCrystalBlue;
    public static Item itemSwordCrystalBlue;
    public static Item itemHoeCrystalBlue;
    public static Item itemHelmCrystalBlue;
    public static Item itemChestCrystalBlue;
    public static Item itemPantsCrystalBlue;
    public static Item itemBootsCrystalBlue;
    public static Item itemPaxelCrystalBlue;
    public static Item itemPickaxeCrystalLightBlue;
    public static Item itemAxeCrystalLightBlue;
    public static Item itemShovelCrystalLightBlue;
    public static Item itemSwordCrystalLightBlue;
    public static Item itemHoeCrystalLightBlue;
    public static Item itemHelmCrystalLightBlue;
    public static Item itemChestCrystalLightBlue;
    public static Item itemPantsCrystalLightBlue;
    public static Item itemBootsCrystalLightBlue;
    public static Item itemPaxelCrystalLightBlue;
    public static Item itemPickaxeCrystalBlack;
    public static Item itemAxeCrystalBlack;
    public static Item itemShovelCrystalBlack;
    public static Item itemSwordCrystalBlack;
    public static Item itemHoeCrystalBlack;
    public static Item itemHelmCrystalBlack;
    public static Item itemChestCrystalBlack;
    public static Item itemPantsCrystalBlack;
    public static Item itemBootsCrystalBlack;
    public static Item itemPaxelCrystalBlack;
    public static Item itemPickaxeCrystalGreen;
    public static Item itemAxeCrystalGreen;
    public static Item itemShovelCrystalGreen;
    public static Item itemSwordCrystalGreen;
    public static Item itemHoeCrystalGreen;
    public static Item itemHelmCrystalGreen;
    public static Item itemChestCrystalGreen;
    public static Item itemPantsCrystalGreen;
    public static Item itemBootsCrystalGreen;
    public static Item itemPaxelCrystalGreen;
    public static Item itemPickaxeCrystalWhite;
    public static Item itemAxeCrystalWhite;
    public static Item itemShovelCrystalWhite;
    public static Item itemSwordCrystalWhite;
    public static Item itemHoeCrystalWhite;
    public static Item itemHelmCrystalWhite;
    public static Item itemChestCrystalWhite;
    public static Item itemPantsCrystalWhite;
    public static Item itemBootsCrystalWhite;
    public static Item itemPaxelCrystalWhite;
    public static Item itemWaterBowl;
    public static Item itemFilter;
    public static Item itemPlayerProbe;
    public static Item itemWorm;
    public static Item itemBag;
    public static Item itemVoidBag;
    public static Item itemFillingWand;
    public static Item itemLaserUpgradeInvisibility;
    public static Item itemLaserUpgradeRange;
    public static Item itemInfraredGoggles;

    public static void init(){
        ModUtil.LOGGER.info("Initializing Items...");

        itemInfraredGoggles = new ItemInfraredGoggles("item_infrared_goggles");
        itemLaserUpgradeRange = new ItemLaserRelayUpgrade("item_laser_upgrade_range");
        itemLaserUpgradeInvisibility = new ItemLaserRelayUpgrade("item_laser_upgrade_invisibility");
        itemFillingWand = new ItemFillingWand("item_filling_wand");
        itemBag = new ItemBag("item_bag", false);
        itemVoidBag = new ItemBag("item_void_bag", true);
        itemWorm = new ItemWorm("item_worm");
        itemPlayerProbe = new ItemPlayerProbe("item_player_probe");
        itemFilter = new ItemFilter("item_filter");
        itemWaterBowl = new ItemWaterBowl("item_water_bowl");
        itemSpawnerChanger = new ItemSpawnerChanger("item_spawner_changer");
        itemMisc = new ItemMisc("item_misc");
        itemCrateKeeper = new ItemGeneric("item_crate_keeper").setMaxStackSize(1);
        itemColorLens = new ItemLens("item_color_lens", ActuallyAdditionsAPI.lensColor);
        itemExplosionLens = new ItemLens("item_explosion_lens", ActuallyAdditionsAPI.lensDetonation);
        itemDamageLens = new ItemLens("item_damage_lens", ActuallyAdditionsAPI.lensDeath);
        itemMoreDamageLens = new ItemLens("item_more_damage_lens", ActuallyAdditionsAPI.lensEvenMoarDeath);
        itemDisenchantingLens = new ItemLens("item_disenchanting_lens", ActuallyAdditionsAPI.lensDisenchanting);
        itemMiningLens = new ItemLens("item_mining_lens", ActuallyAdditionsAPI.lensMining);
        itemCrystal = new ItemCrystal("item_crystal", false);
        itemCrystalEmpowered = new ItemCrystal("item_crystal_empowered", true);
        itemLaserWrench = new ItemLaserWrench("item_laser_wrench");
        itemChestToCrateUpgrade = new ItemChestToCrateUpgrade("item_chest_to_crate_upgrade", TileEntityChest.class, InitBlocks.blockGiantChest.getDefaultState());
        itemSmallToMediumCrateUpgrade = new ItemChestToCrateUpgrade("item_small_to_medium_crate_upgrade", TileEntityGiantChest.class, InitBlocks.blockGiantChestMedium.getDefaultState());
        itemMediumToLargeCrateUpgrade = new ItemChestToCrateUpgrade("item_medium_to_large_crate_upgrade", TileEntityGiantChestMedium.class, InitBlocks.blockGiantChestLarge.getDefaultState());
        itemBooklet = new ItemBooklet("item_booklet");
        itemGrowthRing = new ItemGrowthRing("item_growth_ring");
        itemMagnetRing = new ItemMagnetRing("item_suction_ring");
        itemWaterRemovalRing = new ItemWaterRemovalRing("item_water_removal_ring");
        itemHelmEmerald = new ItemArmorAA("item_helm_emerald", InitArmorMaterials.armorMaterialEmerald, 0, new ItemStack(Items.EMERALD));
        itemChestEmerald = new ItemArmorAA("item_chest_emerald", InitArmorMaterials.armorMaterialEmerald, 1, new ItemStack(Items.EMERALD));
        itemPantsEmerald = new ItemArmorAA("item_pants_emerald", InitArmorMaterials.armorMaterialEmerald, 2, new ItemStack(Items.EMERALD));
        itemBootsEmerald = new ItemArmorAA("item_boots_emerald", InitArmorMaterials.armorMaterialEmerald, 3, new ItemStack(Items.EMERALD));
        itemHelmObsidian = new ItemArmorAA("item_helm_obsidian", InitArmorMaterials.armorMaterialObsidian, 0, new ItemStack(Blocks.OBSIDIAN));
        itemChestObsidian = new ItemArmorAA("item_chest_obsidian", InitArmorMaterials.armorMaterialObsidian, 1, new ItemStack(Blocks.OBSIDIAN));
        itemPantsObsidian = new ItemArmorAA("item_pants_obsidian", InitArmorMaterials.armorMaterialObsidian, 2, new ItemStack(Blocks.OBSIDIAN));
        itemBootsObsidian = new ItemArmorAA("item_boots_obsidian", InitArmorMaterials.armorMaterialObsidian, 3, new ItemStack(Blocks.OBSIDIAN));
        itemHelmQuartz = new ItemArmorAA("item_helm_quartz", InitArmorMaterials.armorMaterialQuartz, 0, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()));
        itemChestQuartz = new ItemArmorAA("item_chest_quartz", InitArmorMaterials.armorMaterialQuartz, 1, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()));
        itemPantsQuartz = new ItemArmorAA("item_pants_quartz", InitArmorMaterials.armorMaterialQuartz, 2, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()));
        itemBootsQuartz = new ItemArmorAA("item_boots_quartz", InitArmorMaterials.armorMaterialQuartz, 3, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()));
        itemTeleStaff = new ItemTeleStaff("item_tele_staff");
        itemWingsOfTheBats = new ItemWingsOfTheBats("item_wings_of_the_bats");
        itemDrill = new ItemDrill("item_drill");
        itemBattery = new ItemBattery("item_battery", 200000, 1000);
        itemBatteryDouble = new ItemBattery("item_battery_double", 350000, 5000);
        itemBatteryTriple = new ItemBattery("item_battery_triple", 600000, 10000);
        itemBatteryQuadruple = new ItemBattery("item_battery_quadruple", 1000000, 30000);
        itemBatteryQuintuple = new ItemBattery("item_battery_quintuple", 2000000, 100000);
        itemDrillUpgradeSpeed = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.SPEED, "item_drill_upgrade_speed");
        itemDrillUpgradeSpeedII = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.SPEED_II, "item_drill_upgrade_speed_ii");
        itemDrillUpgradeSpeedIII = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.SPEED_III, "item_drill_upgrade_speed_iii");
        itemDrillUpgradeSilkTouch = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.SILK_TOUCH, "item_drill_upgrade_silk_touch");
        itemDrillUpgradeFortune = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.FORTUNE, "item_drill_upgrade_fortune");
        itemDrillUpgradeFortuneII = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.FORTUNE_II, "item_drill_upgrade_fortune_ii");
        itemDrillUpgradeThreeByThree = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.THREE_BY_THREE, "item_drill_upgrade_three_by_three");
        itemDrillUpgradeFiveByFive = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.FIVE_BY_FIVE, "item_drill_upgrade_five_by_five");
        itemDrillUpgradeBlockPlacing = new ItemDrillUpgrade(ItemDrillUpgrade.UpgradeType.PLACER, "item_drill_upgrade_block_placing");
        itemFertilizer = new ItemFertilizer("item_fertilizer");
        itemCoffee = new ItemCoffee("item_coffee");
        itemPhantomConnector = new ItemPhantomConnector("item_phantom_connector");
        itemResonantRice = new ItemResonantRice("item_resonant_rice");
        itemFoods = new ItemFoods("item_food");
        itemJams = new ItemJams("item_jam");
        itemKnife = new ItemKnife("item_knife");
        itemCrafterOnAStick = new ItemCrafterOnAStick("item_crafter_on_a_stick");
        itemDust = new ItemDust("item_dust");
        itemSolidifiedExperience = new ItemSolidifiedExperience("item_solidified_experience");
        itemLeafBlower = new ItemLeafBlower(false, "item_leaf_blower");
        itemLeafBlowerAdvanced = new ItemLeafBlower(true, "item_leaf_blower_advanced");
        itemPotionRing = new ItemPotionRing(false, "item_potion_ring");
        itemPotionRingAdvanced = new ItemPotionRing(true, "item_potion_ring_advanced");
        itemHairyBall = new ItemHairyBall("item_hairy_ball");
        itemCoffeeBean = new ItemCoffeeBean("item_coffee_beans");
        itemRiceSeed = new ItemSeed("item_rice_seed", "seedRice", InitBlocks.blockRice, itemFoods, TheFoods.RICE.ordinal());
        CompatUtil.registerMFRSeed(itemRiceSeed, InitBlocks.blockRice);
        itemCanolaSeed = new ItemFoodSeed("item_canola_seed", "seedCanola", InitBlocks.blockCanola, itemMisc, TheMiscItems.CANOLA.ordinal(), 1, 0.01F, 10).setPotionEffect(new PotionEffect(MobEffects.NAUSEA, 1000, 0), 0.2F);
        CompatUtil.registerMFRSeed(itemCanolaSeed, InitBlocks.blockCanola);
        itemFlaxSeed = new ItemSeed("item_flax_seed", "seedFlax", InitBlocks.blockFlax, Items.STRING, 0);
        CompatUtil.registerMFRSeed(itemFlaxSeed, InitBlocks.blockFlax);
        itemCoffeeSeed = new ItemSeed("item_coffee_seed", "seedCoffeeBeans", InitBlocks.blockCoffee, itemCoffeeBean, 0);
        CompatUtil.registerMFRSeed(itemCoffeeSeed, InitBlocks.blockCoffee);
        itemPickaxeEmerald = new ItemPickaxeAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "item_pickaxe_emerald", EnumRarity.EPIC);
        itemAxeEmerald = new ItemAxeAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "item_axe_emerald", EnumRarity.EPIC);
        itemShovelEmerald = new ItemShovelAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "item_shovel_emerald", EnumRarity.EPIC);
        itemSwordEmerald = new ItemSwordAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "item_sword_emerald", EnumRarity.EPIC);
        itemHoeEmerald = new ItemHoeAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "item_hoe_emerald", EnumRarity.EPIC);
        itemPickaxeObsidian = new ItemPickaxeAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "item_pickaxe_obsidian", EnumRarity.UNCOMMON);
        itemAxeObsidian = new ItemAxeAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "item_axe_obsidian", EnumRarity.UNCOMMON);
        itemShovelObsidian = new ItemShovelAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "item_shovel_obsidian", EnumRarity.UNCOMMON);
        itemSwordObsidian = new ItemSwordAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "item_sword_obsidian", EnumRarity.UNCOMMON);
        itemHoeObsidian = new ItemHoeAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "item_hoe_obsidian", EnumRarity.UNCOMMON);
        itemPickaxeQuartz = new ItemPickaxeAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "item_pickaxe_quartz", EnumRarity.RARE);
        itemAxeQuartz = new ItemAxeAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "item_axe_quartz", EnumRarity.RARE);
        itemShovelQuartz = new ItemShovelAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "item_shovel_quartz", EnumRarity.RARE);
        itemSwordQuartz = new ItemSwordAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "item_sword_quartz", EnumRarity.RARE);
        itemHoeQuartz = new ItemHoeAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "item_hoe_quartz", EnumRarity.RARE);
        woodenPaxel = new ItemAllToolAA(Item.ToolMaterial.WOOD, "plank_wood", "wooden_paxel", EnumRarity.UNCOMMON, 5192733);
        stonePaxel = new ItemAllToolAA(Item.ToolMaterial.STONE, new ItemStack(Blocks.COBBLESTONE), "stone_paxel", EnumRarity.UNCOMMON, 7040621);
        ironPaxel = new ItemAllToolAA(Item.ToolMaterial.IRON, new ItemStack(Items.IRON_INGOT), "iron_paxel", EnumRarity.RARE, 10920613);
        goldPaxel = new ItemAllToolAA(Item.ToolMaterial.GOLD, new ItemStack(Items.GOLD_INGOT), "gold_paxel", EnumRarity.RARE, 16770048);
        diamondPaxel = new ItemAllToolAA(Item.ToolMaterial.DIAMOND, new ItemStack(Items.DIAMOND), "diamond_paxel", EnumRarity.EPIC, 3250376);
        emeraldPaxel = new ItemAllToolAA(InitToolMaterials.toolMaterialEmerald, new ItemStack(Items.EMERALD), "emerald_paxel", EnumRarity.EPIC, 7723338);
        obsidianPaxel = new ItemAllToolAA(InitToolMaterials.toolMaterialObsidian, new ItemStack(Blocks.OBSIDIAN), "obsidian_paxel", EnumRarity.EPIC, 4166);
        quartzPaxel = new ItemAllToolAA(InitToolMaterials.toolMaterialQuartz, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), "quartz_paxel", EnumRarity.RARE, 1710103);

        itemPickaxeCrystalRed = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_pickaxe_crystal_red", Util.CRYSTAL_RED_RARITY);
        itemAxeCrystalRed = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_axe_crystal_red", Util.CRYSTAL_RED_RARITY);
        itemShovelCrystalRed = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_shovel_crystal_red", Util.CRYSTAL_RED_RARITY);
        itemSwordCrystalRed = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_sword_crystal_red", Util.CRYSTAL_RED_RARITY);
        itemHoeCrystalRed = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_hoe_crystal_red", Util.CRYSTAL_RED_RARITY);
        itemHelmCrystalRed = new ItemArmorAA("item_helm_crystal_red", InitArmorMaterials.armorMaterialCrystalRed, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), Util.CRYSTAL_RED_RARITY);
        itemChestCrystalRed = new ItemArmorAA("item_chest_crystal_red", InitArmorMaterials.armorMaterialCrystalRed, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), Util.CRYSTAL_RED_RARITY);
        itemPantsCrystalRed = new ItemArmorAA("item_pants_crystal_red", InitArmorMaterials.armorMaterialCrystalRed, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), Util.CRYSTAL_RED_RARITY);
        itemBootsCrystalRed = new ItemArmorAA("item_boots_crystal_red", InitArmorMaterials.armorMaterialCrystalRed, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), Util.CRYSTAL_RED_RARITY);
        itemPaxelCrystalRed = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalRed, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), "item_paxel_crystal_red", Util.CRYSTAL_RED_RARITY, 16711689);

        itemPickaxeCrystalBlue = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_pickaxe_crystal_blue", Util.CRYSTAL_BLUE_RARITY);
        itemAxeCrystalBlue = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_axe_crystal_blue", Util.CRYSTAL_BLUE_RARITY);
        itemShovelCrystalBlue = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_shovel_crystal_blue", Util.CRYSTAL_BLUE_RARITY);
        itemSwordCrystalBlue = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_sword_crystal_blue", Util.CRYSTAL_BLUE_RARITY);
        itemHoeCrystalBlue = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_hoe_crystal_blue", Util.CRYSTAL_BLUE_RARITY);
        itemHelmCrystalBlue = new ItemArmorAA("item_helm_crystal_blue", InitArmorMaterials.armorMaterialCrystalBlue, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), Util.CRYSTAL_BLUE_RARITY);
        itemChestCrystalBlue = new ItemArmorAA("item_chest_crystal_blue", InitArmorMaterials.armorMaterialCrystalBlue, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), Util.CRYSTAL_BLUE_RARITY);
        itemPantsCrystalBlue = new ItemArmorAA("item_pants_crystal_blue", InitArmorMaterials.armorMaterialCrystalBlue, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), Util.CRYSTAL_BLUE_RARITY);
        itemBootsCrystalBlue = new ItemArmorAA("item_boots_crystal_blue", InitArmorMaterials.armorMaterialCrystalBlue, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), Util.CRYSTAL_BLUE_RARITY);
        itemPaxelCrystalBlue = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), "item_paxel_crystal_blue", Util.CRYSTAL_BLUE_RARITY, 3014911);

        itemPickaxeCrystalLightBlue = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_pickaxe_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemAxeCrystalLightBlue = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_axe_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemShovelCrystalLightBlue = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_shovel_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemSwordCrystalLightBlue = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_sword_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemHoeCrystalLightBlue = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_hoe_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemHelmCrystalLightBlue = new ItemArmorAA("item_helm_crystal_light_blue", InitArmorMaterials.armorMaterialCrystalLightBlue, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemChestCrystalLightBlue = new ItemArmorAA("item_chest_crystal_light_blue", InitArmorMaterials.armorMaterialCrystalLightBlue, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemPantsCrystalLightBlue = new ItemArmorAA("item_pants_crystal_light_blue", InitArmorMaterials.armorMaterialCrystalLightBlue, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemBootsCrystalLightBlue = new ItemArmorAA("item_boots_crystal_light_blue", InitArmorMaterials.armorMaterialCrystalLightBlue, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), Util.CRYSTAL_LIGHT_BLUE_RARITY);
        itemPaxelCrystalLightBlue = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalLightBlue, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), "item_paxel_crystal_light_blue", Util.CRYSTAL_LIGHT_BLUE_RARITY, 4093108);

        itemPickaxeCrystalBlack = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_pickaxe_crystal_black", Util.CRYSTAL_BLACK_RARITY);
        itemAxeCrystalBlack = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_axe_crystal_black", Util.CRYSTAL_BLACK_RARITY);
        itemShovelCrystalBlack = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_shovel_crystal_black", Util.CRYSTAL_BLACK_RARITY);
        itemSwordCrystalBlack = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_sword_crystal_black", Util.CRYSTAL_BLACK_RARITY);
        itemHoeCrystalBlack = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_hoe_crystal_black", Util.CRYSTAL_BLACK_RARITY);
        itemHelmCrystalBlack = new ItemArmorAA("item_helm_crystal_black", InitArmorMaterials.armorMaterialCrystalBlack, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), Util.CRYSTAL_BLACK_RARITY);
        itemChestCrystalBlack = new ItemArmorAA("item_chest_crystal_black", InitArmorMaterials.armorMaterialCrystalBlack, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), Util.CRYSTAL_BLACK_RARITY);
        itemPantsCrystalBlack = new ItemArmorAA("item_pants_crystal_black", InitArmorMaterials.armorMaterialCrystalBlack, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), Util.CRYSTAL_BLACK_RARITY);
        itemBootsCrystalBlack = new ItemArmorAA("item_boots_crystal_black", InitArmorMaterials.armorMaterialCrystalBlack, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), Util.CRYSTAL_BLACK_RARITY);
        itemPaxelCrystalBlack = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalBlack, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), "item_paxel_crystal_black", Util.CRYSTAL_BLACK_RARITY, 2631982);

        itemPickaxeCrystalGreen = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_pickaxe_crystal_green", Util.CRYSTAL_GREEN_RARITY);
        itemAxeCrystalGreen = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_axe_crystal_green", Util.CRYSTAL_GREEN_RARITY);
        itemShovelCrystalGreen = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_shovel_crystal_green", Util.CRYSTAL_GREEN_RARITY);
        itemSwordCrystalGreen = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_sword_crystal_green", Util.CRYSTAL_GREEN_RARITY);
        itemHoeCrystalGreen = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_hoe_crystal_green", Util.CRYSTAL_GREEN_RARITY);
        itemHelmCrystalGreen = new ItemArmorAA("item_helm_crystal_green", InitArmorMaterials.armorMaterialCrystalGreen, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), Util.CRYSTAL_GREEN_RARITY);
        itemChestCrystalGreen = new ItemArmorAA("item_chest_crystal_green", InitArmorMaterials.armorMaterialCrystalGreen, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), Util.CRYSTAL_GREEN_RARITY);
        itemPantsCrystalGreen = new ItemArmorAA("item_pants_crystal_green", InitArmorMaterials.armorMaterialCrystalGreen, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), Util.CRYSTAL_GREEN_RARITY);
        itemBootsCrystalGreen = new ItemArmorAA("item_boots_crystal_green", InitArmorMaterials.armorMaterialCrystalGreen, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), Util.CRYSTAL_GREEN_RARITY);
        itemPaxelCrystalGreen = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalGreen, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.EMERALD.ordinal()), "item_paxel_crystal_green", Util.CRYSTAL_GREEN_RARITY, 46848);

        itemPickaxeCrystalWhite = new ItemPickaxeAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_pickaxe_crystal_white", Util.CRYSTAL_WHITE_RARITY);
        itemAxeCrystalWhite = new ItemAxeAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_axe_crystal_white", Util.CRYSTAL_WHITE_RARITY);
        itemShovelCrystalWhite = new ItemShovelAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_shovel_crystal_white", Util.CRYSTAL_WHITE_RARITY);
        itemSwordCrystalWhite = new ItemSwordAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_sword_crystal_white", Util.CRYSTAL_WHITE_RARITY);
        itemHoeCrystalWhite = new ItemHoeAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_hoe_crystal_white", Util.CRYSTAL_WHITE_RARITY);
        itemHelmCrystalWhite = new ItemArmorAA("item_helm_crystal_white", InitArmorMaterials.armorMaterialCrystalWhite, 0, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), Util.CRYSTAL_WHITE_RARITY);
        itemChestCrystalWhite = new ItemArmorAA("item_chest_crystal_white", InitArmorMaterials.armorMaterialCrystalWhite, 1, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), Util.CRYSTAL_WHITE_RARITY);
        itemPantsCrystalWhite = new ItemArmorAA("item_pants_crystal_white", InitArmorMaterials.armorMaterialCrystalWhite, 2, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), Util.CRYSTAL_WHITE_RARITY);
        itemBootsCrystalWhite = new ItemArmorAA("item_boots_crystal_white", InitArmorMaterials.armorMaterialCrystalWhite, 3, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), Util.CRYSTAL_WHITE_RARITY);
        itemPaxelCrystalWhite = new ItemAllToolAA(InitToolMaterials.toolMaterialCrystalWhite, new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), "item_paxel_crystal_white", Util.CRYSTAL_WHITE_RARITY, 14606302);
    }
}
