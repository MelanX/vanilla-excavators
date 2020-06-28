package de.melanx.vanillaexcavators.data;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.morevanillalib.data.ModTags;
import de.melanx.vanillaexcavators.items.ExcavatorItem;
import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator, BlockTagsProvider blockTags) {
        super(generator, blockTags);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Item> registryObject : ExcavatorRegistry.ITEMS.getEntries()) {
            Item item = registryObject.get();
            BigBreakMaterials itemTier = (BigBreakMaterials) ((ExcavatorItem) item).getToolMaterial();
            switch (itemTier) {
                case WOOD:
                    func_240522_a_(ModTags.Items.WOOD_TOOLS).func_240534_a_(item);
                    break;
                case STONE:
                    func_240522_a_(ModTags.Items.STONE_TOOLS).func_240534_a_(item);
                    break;
                case IRON:
                    func_240522_a_(ModTags.Items.IRON_TOOLS).func_240534_a_(item);
                    break;
                case GOLD:
                    func_240522_a_(ModTags.Items.GOLD_TOOLS).func_240534_a_(item);
                    break;
                case DIAMOND:
                    func_240522_a_(ModTags.Items.DIAMOND_TOOLS).func_240534_a_(item);
                    break;
                case BONE:
                    func_240522_a_(ModTags.Items.BONE_TOOLS).func_240534_a_(item);
                    break;
                case COAL:
                    func_240522_a_(ModTags.Items.COAL_TOOLS).func_240534_a_(item);
                    break;
                case EMERALD:
                    func_240522_a_(ModTags.Items.EMERALD_TOOLS).func_240534_a_(item);
                    break;
                case ENDER:
                    func_240522_a_(ModTags.Items.ENDER_TOOLS).func_240534_a_(item);
                    break;
                case FIERY:
                    func_240522_a_(ModTags.Items.FIERY_TOOLS).func_240534_a_(item);
                    break;
                case GLOWSTONE:
                    func_240522_a_(ModTags.Items.GLOWSTONE_TOOLS).func_240534_a_(item);
                    break;
                case LAPIS:
                    func_240522_a_(ModTags.Items.LAPIS_TOOLS).func_240534_a_(item);
                    break;
                case NETHER:
                    func_240522_a_(ModTags.Items.NETHER_TOOLS).func_240534_a_(item);
                    break;
                case OBSIDIAN:
                    func_240522_a_(ModTags.Items.OBSIDIAN_TOOLS).func_240534_a_(item);
                    break;
                case PAPER:
                    func_240522_a_(ModTags.Items.PAPER_TOOLS).func_240534_a_(item);
                    break;
                case PRISMARINE:
                    func_240522_a_(ModTags.Items.PRISMARINE_TOOLS).func_240534_a_(item);
                    break;
                case QUARTZ:
                    func_240522_a_(ModTags.Items.QUARTZ_TOOLS).func_240534_a_(item);
                    break;
                case REDSTONE:
                    func_240522_a_(ModTags.Items.REDSTONE_TOOLS).func_240534_a_(item);
                    break;
                case SLIME:
                    func_240522_a_(ModTags.Items.SLIME_TOOLS).func_240534_a_(item);
                    break;
            }
        }
    }
}
