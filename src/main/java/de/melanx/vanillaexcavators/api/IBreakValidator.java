package de.melanx.vanillaexcavators.api;

import net.minecraft.block.BlockState;

public interface IBreakValidator {

    boolean canBreak(BlockState state);
}
