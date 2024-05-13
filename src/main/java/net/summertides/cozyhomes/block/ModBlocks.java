package net.summertides.cozyhomes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.summertides.cozyhomes.CozyHomes;
import net.summertides.cozyhomes.block.custom.OakChair;

public class ModBlocks {
    public static final Block OAK_TABLE = registerBlock("oak_table",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new OakChair(FabricBlockSettings.create().nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CozyHomes.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CozyHomes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        CozyHomes.LOGGER.info("[" + CozyHomes.MOD_ID + "]" + " Registering Blocks");
    }

}
