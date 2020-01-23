package de.melanx.vanillaexcavators.api;

import net.minecraft.block.BlockState;

public interface BreakValidator {

    boolean canBreak(BlockState state);
}
