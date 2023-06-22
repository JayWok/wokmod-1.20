package com.jaywok.wokmod.init;

import com.jaywok.wokmod.WokMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WokMod.MODID);

    // Creates individuals blocks to add to registry above

    //

    // Twig Block
    public static final RegistryObject<Block> TWIG_BLOCK = BLOCKS.register("twig_block",
            () -> new SugarCaneBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .sound(SoundType.WOOD)));


    // Cobblestone Door
    public static final RegistryObject<Block> COBBLESTONE_DOOR = BLOCKS.register("cobblestone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6)
                    , BlockSetType.STONE));


    // Compact Cobblestone 1x
    public static final RegistryObject<Block> COMPACT_COBBLESTONE_1X = BLOCKS.register("compact_cobblestone_1x",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6)));
    // Compact Cobblestone 2x
    public static final RegistryObject<Block> COMPACT_COBBLESTONE_2X = BLOCKS.register("compact_cobblestone_2x",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6)));
    // Compact Cobblestone 3x
    public static final RegistryObject<Block> COMPACT_COBBLESTONE_3X = BLOCKS.register("compact_cobblestone_3x",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(4, 9)));
    // Compact Cobblestone 4x
    public static final RegistryObject<Block> COMPACT_COBBLESTONE_4X = BLOCKS.register("compact_cobblestone_4x",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(8, 9)));
    // Compact Cobblestone 5x
    public static final RegistryObject<Block> COMPACT_COBBLESTONE_5X = BLOCKS.register("compact_cobblestone_5x",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(20, 1200)));


    // Lead Block
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6)));
    // Lead Ore
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6),
                    UniformInt.of(2, 5)));
    // Brass Block
    public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6)));
    // Brass Ore
    public static final RegistryObject<Block> BRASS_ORE = BLOCKS.register("brass_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(2, 6),
                    UniformInt.of(2, 5)));
}
