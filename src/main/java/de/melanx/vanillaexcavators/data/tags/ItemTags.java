package de.melanx.vanillaexcavators.data.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerTags() {
        getBuilder(ModTags.Items.HEADS).add(ModTags.Items.CREEPER_HEAD, ModTags.Items.DRAGON_HEAD, ModTags.Items.PLAYER_HEAD, ModTags.Items.ZOMBIE_HEAD);
        getBuilder(ModTags.Items.CREEPER_HEAD).add(Items.CREEPER_HEAD);
        getBuilder(ModTags.Items.DRAGON_HEAD).add(Items.DRAGON_HEAD);
        getBuilder(ModTags.Items.PLAYER_HEAD).add(Items.PLAYER_HEAD);
        getBuilder(ModTags.Items.ZOMBIE_HEAD).add(Items.ZOMBIE_HEAD);
        getBuilder(ModTags.Items.MAGMA_CREAM).add(Items.MAGMA_CREAM);

        copy(ModTags.Blocks.STORAGE_BLOCKS_GLOWSTONE, ModTags.Items.STORAGE_BLOCKS_GLOWSTONE);
        copy(ModTags.Blocks.MAGMA_BLOCK, ModTags.Items.MAGMA_BLOCK);
        copy(ModTags.Blocks.NETHER_BRICKS, ModTags.Items.NETHER_BRICKS);
        copy(ModTags.Blocks.PRISMARINE, ModTags.Items.PRISMARINE);
        copy(ModTags.Blocks.SLIME_BLOCK, ModTags.Items.SLIME_BLOCK);
    }
}
