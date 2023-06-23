package com.jaywok.wokmod.init;

import com.jaywok.wokmod.WokMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit
{
    public static final TagKey<Block> NEEDS_BRASS_TOOL = tag("needs_brass_tool");

    // tag() function
    public static TagKey<Block> tag(String name)
    {
        return BlockTags.create(new ResourceLocation(WokMod.MODID, name));
    }
}
