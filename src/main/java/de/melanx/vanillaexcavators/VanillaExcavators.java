package de.melanx.vanillaexcavators;

import de.melanx.vanillaexcavators.common.ExcavatorRegistry;
import de.melanx.vanillaexcavators.config.VanillaHammersConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VanillaExcavators.MODID)
public class VanillaExcavators {
	public static final String MODID = "vanillaexcavators";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static VanillaHammers instance;

	public VanillaHammers() {
		instance = this;
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, VanillaHammersConfig.SERVER_CONFIG);
		VanillaExcavatorsConfig.loadConfig(VanillaExcavatorsConfig.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-server.toml"));
		ExcavatorRegistry.registerHammers();
		MinecraftForge.EVENT_BUS.register(this);
	}
}