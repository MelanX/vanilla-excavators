package de.melanx.vanillaexcavators.data.tags;

import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerTags() {
        getBuilder(ModTags.Blocks.STORAGE_BLOCKS_GLOWSTONE).add(Blocks.GLOWSTONE);
        getBuilder(ModTags.Blocks.MAGMA_BLOCK).add(Blocks.MAGMA_BLOCK);
        getBuilder(ModTags.Blocks.NETHER_BRICKS).add(Blocks.NETHER_BRICKS);
        getBuilder(ModTags.Blocks.PRISMARINE).add(Blocks.PRISMARINE);
        getBuilder(ModTags.Blocks.SLIME_BLOCK).add(Blocks.SLIME_BLOCK);
    }
}
