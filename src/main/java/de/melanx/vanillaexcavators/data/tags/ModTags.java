package de.melanx.vanillaexcavators.data.tags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static class Blocks {
        public static final Tag<Block> STORAGE_BLOCKS_GLOWSTONE = tag("storage_blocks/glowstone");
        public static final Tag<Block> MAGMA_BLOCK = tag("magma_block");
        public static final Tag<Block> NETHER_BRICKS = tag("netherbricks");
        public static final Tag<Block> PRISMARINE = tag("prismarine");
        public static final Tag<Block> SLIME_BLOCK = tag("slime_block");

        private static Tag<Block> tag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tag<Item> STORAGE_BLOCKS_GLOWSTONE = tag("storage_blocks/glowstone");
        public static final Tag<Item> MAGMA_BLOCK = tag("magma_block");
        public static final Tag<Item> NETHER_BRICKS = tag("netherbricks");
        public static final Tag<Item> PRISMARINE = tag("prismarine");
        public static final Tag<Item> SLIME_BLOCK = tag("slime_block");

        public static final Tag<Item> HEADS = tag("heads");

        public static final Tag<Item> CREEPER_HEAD = tag("heads/creeper_head");
        public static final Tag<Item> DRAGON_HEAD = tag("heads/dragon_head");
        public static final Tag<Item> PLAYER_HEAD = tag("heads/player_head");
        public static final Tag<Item> ZOMBIE_HEAD = tag("heads/zombie_head");
        public static final Tag<Item> MAGMA_CREAM = tag("magma_cream");

        private static Tag<Item> tag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation("forge", name));
        }
    }

}
