package de.melanx.vanillaexcavators.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import de.melanx.vanillaexcavators.VanillaExcavators;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class VanillaExcavatorsConfig {

    public static final ForgeConfigSpec SERVER_CONFIG;
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec.BooleanValue extraExcavators;

    static {
        init(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static void init(ForgeConfigSpec.Builder builder) {
        extraExcavators = builder.comment("If set true, extra hammer types will be loaded")
                .define("extraExcavators", true);
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        VanillaExcavators.LOGGER.debug("Loading config file {}", path);

        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();

        configData.load();

        spec.setConfig(configData);
    }
}
