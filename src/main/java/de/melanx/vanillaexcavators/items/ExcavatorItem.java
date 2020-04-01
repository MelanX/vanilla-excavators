package de.melanx.vanillaexcavators.items;

import de.melanx.morevanillalib.api.BigBreakItem;
import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraftforge.common.ToolType;

public class ExcavatorItem extends BigBreakItem {

    public ExcavatorItem(IItemTier toolMaterial, float attackSpeed) {
        super(toolMaterial, attackSpeed);
    }

    @Override
    public boolean canHarvestBlock(BlockState state) {
        return state.getHarvestTool() == ToolType.SHOVEL;
    }
}

