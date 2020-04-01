package de.melanx.vanillaexcavators;

import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VanillaExcavators.MODID)
public class VanillaExcavators {
    public static final String MODID = "vanillaexcavators";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static VanillaExcavators instance;

    public VanillaExcavators() {
        instance = this;
        ExcavatorRegistry.registerHammers();
        MinecraftForge.EVENT_BUS.register(this);
    }
}