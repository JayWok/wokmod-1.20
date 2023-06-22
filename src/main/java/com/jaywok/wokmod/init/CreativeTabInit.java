package com.jaywok.wokmod.init;

import com.jaywok.wokmod.WokMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = WokMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit
{
    // Create creative tab named WOKTAB
    public static final DeferredRegister<CreativeModeTab> WOKTAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WokMod.MODID);

    // Create list of items to add
    public static final List<Supplier<? extends ItemLike>> WOK_TAB_ITEMS = new ArrayList<>();

    // Register WOKTAB as an actual creative tab
    public static final RegistryObject<CreativeModeTab> WOK_TAB = WOKTAB.register("wok_tab",
            () -> CreativeModeTab.builder()
                    // Set name of tab to display
                    .title(Component.translatable("itemGroup.wok_tab"))
                    // Set icon of creative tab
                    .icon(ItemInit.TWIG.get()::getDefaultInstance)
                    // Add all mod items to tab
                    .displayItems((displayParams, output) ->
                            // Loop through list and add items
                            WOK_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    // Add to tab from ItemInit
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike)
    {
        WOK_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ItemInit.BRASS_INGOT);
            event.accept(ItemInit.LEAD_INGOT);
            event.accept(ItemInit.RAW_BRASS);
            event.accept(ItemInit.RAW_LEAD);
            event.accept(ItemInit.ROCKS);
            event.accept(ItemInit.TWIG);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ItemInit.BRASS_BLOCK_ITEM);
            event.accept(ItemInit.BRASS_ORE_ITEM);
            event.accept(ItemInit.COBBLESTONE_DOOR_ITEM);
            event.accept(ItemInit.COMPACT_COBBLESTONE_1X_ITEM);
            event.accept(ItemInit.COMPACT_COBBLESTONE_2X_ITEM);
            event.accept(ItemInit.COMPACT_COBBLESTONE_3X_ITEM);
            event.accept(ItemInit.COMPACT_COBBLESTONE_4X_ITEM);
            event.accept(ItemInit.COMPACT_COBBLESTONE_5X_ITEM);
            event.accept(ItemInit.LEAD_BLOCK_ITEM);
            event.accept(ItemInit.LEAD_ORE_ITEM);
            event.accept(ItemInit.TWIG_BLOCK_ITEM);
        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(ItemInit.BANANA);
            event.accept(ItemInit.KIWI);
            event.accept(ItemInit.ORANGE);
            event.accept(ItemInit.STRAWBERRY);
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS)
        {
            event.accept(ItemInit.COBBLESTONE_DOOR_ITEM);
        }
    }
}
