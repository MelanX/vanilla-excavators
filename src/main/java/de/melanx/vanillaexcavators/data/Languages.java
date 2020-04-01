package de.melanx.vanillaexcavators.data;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.morevanillalib.util.TranslationHelper;
import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.items.ExcavatorItem;
import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class Languages {

    public static class English extends LanguageProvider {
        public English(DataGenerator generator) {
            super(generator, VanillaExcavators.MODID, "en_us");
        }

        @Override
        protected void addTranslations() {
            for (RegistryObject<Item> object : ExcavatorRegistry.ITEMS.getEntries()) {
                Item item = object.get();
                String material = ((BigBreakMaterials) ((ExcavatorItem) item).getToolMaterial()).getPrefix();
                add(item, TranslationHelper.capitalize(material) + " Excavator");
            }
        }
    }

    public static class German extends LanguageProvider {
        public German(DataGenerator generator) {
            super(generator, VanillaExcavators.MODID, "de_de");
        }

        @Override
        protected void addTranslations() {
            for (RegistryObject<Item> object : ExcavatorRegistry.ITEMS.getEntries()) {
                Item item = object.get();
                String path = item.getRegistryName().getPath();
                add(item, TranslationHelper.getGermanMaterial(path) + "ausgraber");
            }
        }
    }


}
