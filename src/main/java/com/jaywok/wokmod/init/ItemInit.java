package com.jaywok.wokmod.init;

import com.jaywok.wokmod.WokMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jaywok.wokmod.init.CreativeTabInit.addToTab;

public class ItemInit
{
    // Creates ITEM type registry using "wokmod" MOD ID
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WokMod.MODID);

    // Creates individuals items to add to registry above

    //

    // Cobblestone Door
    public static final RegistryObject<BlockItem> COBBLESTONE_DOOR_ITEM = addToTab(ITEMS.register("cobblestone_door",
            () -> new BlockItem(BlockInit.COBBLESTONE_DOOR.get(), new Item.Properties())));

    // Compact Cobblestone 1x
    public static final RegistryObject<BlockItem> COMPACT_COBBLESTONE_1X_ITEM = addToTab(ITEMS.register("compact_cobblestone_1x",
            () -> new BlockItem(BlockInit.COMPACT_COBBLESTONE_1X.get(), new Item.Properties())));
    // Compact Cobblestone 2x
    public static final RegistryObject<BlockItem> COMPACT_COBBLESTONE_2X_ITEM = addToTab(ITEMS.register("compact_cobblestone_2x",
            () -> new BlockItem(BlockInit.COMPACT_COBBLESTONE_2X.get(), new Item.Properties())));
    // Compact Cobblestone 3x
    public static final RegistryObject<BlockItem> COMPACT_COBBLESTONE_3X_ITEM = addToTab(ITEMS.register("compact_cobblestone_3x",
            () -> new BlockItem(BlockInit.COMPACT_COBBLESTONE_3X.get(), new Item.Properties())));
    // Compact Cobblestone 4x
    public static final RegistryObject<BlockItem> COMPACT_COBBLESTONE_4X_ITEM = addToTab(ITEMS.register("compact_cobblestone_4x",
            () -> new BlockItem(BlockInit.COMPACT_COBBLESTONE_4X.get(), new Item.Properties())));
    // Compact Cobblestone 5x
    public static final RegistryObject<BlockItem> COMPACT_COBBLESTONE_5X_ITEM = addToTab(ITEMS.register("compact_cobblestone_5x",
            () -> new BlockItem(BlockInit.COMPACT_COBBLESTONE_5X.get(), new Item.Properties())));

    // Banana
    public static final RegistryObject<Item> BANANA = addToTab(ITEMS.register("banana",
            () -> new Item(new Item.Properties()
                    .food(Foods.FRUITS))));
    // Kiwi
    public static final RegistryObject<Item> KIWI = addToTab(ITEMS.register("kiwi",
            () -> new Item(new Item.Properties()
                    .food(Foods.FRUITS))));
    // Orange
    public static final RegistryObject<Item> ORANGE = addToTab(ITEMS.register("orange",
            () -> new Item(new Item.Properties()
                    .food(Foods.FRUITS))));
    // Strawberry
    public static final RegistryObject<Item> STRAWBERRY = addToTab(ITEMS.register("strawberry",
            () -> new Item(new Item.Properties()
                    .food(Foods.FRUITS))));

    // Rocks
    public static final RegistryObject<Item> ROCKS = addToTab(ITEMS.register("rocks",
            () -> new Item(new Item.Properties())));
    // Twig
    public static final RegistryObject<Item> TWIG = addToTab(ITEMS.register("twig",
            () -> new Item(new Item.Properties())));
    // Twig Block
    public static final RegistryObject<BlockItem> TWIG_BLOCK_ITEM = addToTab(ITEMS.register("twig_block",
            () -> new BlockItem(BlockInit.TWIG_BLOCK.get(), new Item.Properties())));

    // Brass Ore
    public static final RegistryObject<Item> BRASS_ORE_ITEM = addToTab(ITEMS.register("brass_ore",
            () -> new BlockItem(BlockInit.BRASS_ORE.get(), new Item.Properties())));
    // Raw Brass
    public static final RegistryObject<Item> RAW_BRASS = addToTab(ITEMS.register("raw_brass",
            () -> new Item(new Item.Properties())));
    // Brass Ingot
    public static final RegistryObject<Item> BRASS_INGOT = addToTab(ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties())));
    // Brass Block
    public static final RegistryObject<Item> BRASS_BLOCK_ITEM = addToTab(ITEMS.register("brass_block",
            () -> new BlockItem(BlockInit.BRASS_BLOCK.get(), new Item.Properties())));
    // Brass Sword
    public static final RegistryObject<SwordItem> BRASS_SWORD = addToTab(ITEMS.register("brass_sword",
            () -> new SwordItem(
                    TierInit.BRASS,
                    1, // Attack Damage
                    -2.4f, // Attack Speed
                    new Item.Properties()
            )));
    // Brass Pickaxe
    public static final RegistryObject<PickaxeItem> BRASS_PICKAXE = addToTab(ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(
                    TierInit.BRASS,
                    -1, // Attack Damage
                    -2.8f, // Attack Speed
                    new Item.Properties()
            )));
    // Brass Axe
    public static final RegistryObject<AxeItem> BRASS_AXE = addToTab(ITEMS.register("brass_axe",
            () -> new AxeItem(
                    TierInit.BRASS,
                    3, // Attack Damage
                    -3f, // Attack Speed
                    new Item.Properties()
            )));
    // Brass Shovel
    public static final RegistryObject<ShovelItem> BRASS_SHOVEL = addToTab(ITEMS.register("brass_shovel",
            () -> new ShovelItem(
                    TierInit.BRASS,
                    0, // Attack Damage
                    -3f, // Attack Speed
                    new Item.Properties()
            )));
    // Brass Hoe
    public static final RegistryObject<HoeItem> BRASS_HOE = addToTab(ITEMS.register("brass_hoe",
            () -> new HoeItem(
                    TierInit.BRASS,
                    -4, // Attack Damage
                    -1f, // Attack Speed
                    new Item.Properties()
            )));

    // Lead Ore
    public static final RegistryObject<Item> LEAD_ORE_ITEM = addToTab(ITEMS.register("lead_ore",
            () -> new BlockItem(BlockInit.LEAD_ORE.get(), new Item.Properties())));
    // Raw Lead
    public static final RegistryObject<Item> RAW_LEAD = addToTab(ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties())));
    // Lead Ingot
    public static final RegistryObject<Item> LEAD_INGOT = addToTab(ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties())));
    // Lead Block
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = addToTab(ITEMS.register("lead_block",
            () -> new BlockItem(BlockInit.LEAD_BLOCK.get(), new Item.Properties())));

    // Empty Casings
    public static final RegistryObject<Item> EMPTY_CASINGS = addToTab(ITEMS.register("empty_casings",
            () -> new Item(new Item.Properties())));

    //
    // Properties
    //

    // Foods
    public static class Foods {
        public static final FoodProperties FRUITS = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(2.4f)
                .build();
    }
}
