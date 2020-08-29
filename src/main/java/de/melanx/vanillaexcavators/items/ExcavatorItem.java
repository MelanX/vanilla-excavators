package de.melanx.vanillaexcavators.items;

import com.google.common.collect.ImmutableSet;
import de.melanx.morevanillalib.api.BigBreakItem;
import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraftforge.common.ToolType;

public class ExcavatorItem extends BigBreakItem {

    public ExcavatorItem(IItemTier toolMaterial, float attackSpeed) {
        super(toolMaterial, attackSpeed, ImmutableSet.of(), ToolType.SHOVEL);
    }

    @Override
    public boolean canHarvestBlock(BlockState state) {
        return state.getHarvestTool() == ToolType.SHOVEL;
    }
}

