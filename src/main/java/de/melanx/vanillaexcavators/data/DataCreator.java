package de.melanx.vanillaexcavators.data;

import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.data.tags.BlockTags;
import de.melanx.vanillaexcavators.data.tags.ItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = VanillaExcavators.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataCreator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new BlockTags(generator));
            generator.addProvider(new ItemTags(generator));
            generator.addProvider(new Recipes(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new ItemModels(generator, helper));
        }
    }

}
