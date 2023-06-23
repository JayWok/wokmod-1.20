package com.jaywok.wokmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit
{
    // Tier Info:
    // Level: 0=Wood&Gold 1=Stone 2=Iron 3=Diamond 4=Netherite
    // Uses: 32=Gold 59=Wood 131=Stone 250=Iron 1561=Diamond 2031=Netherite
    // Enchantment Value: 5=Stone 10=Diamond 14=Iron 15=Wood&Netherite 22=Gold
    public static final ForgeTier BRASS = new ForgeTier(
            2,
            500,
            0.2f,
            4,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemInit.BRASS_INGOT::get)
    );
}
