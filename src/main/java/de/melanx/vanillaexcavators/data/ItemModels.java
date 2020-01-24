package de.melanx.vanillaexcavators.data;

import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.common.ExcavatorRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.fml.RegistryObject;

public class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, VanillaExcavators.MODID, helper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> item : ExcavatorRegistry.ITEMS.getEntries())
            generateItem(item.get());
    }

    private void generateItem(Item item) {
        String path = item.getRegistryName().getPath();
        getBuilder(path).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/" + path);
    }

    @Override
    public String getName() {
        return VanillaExcavators.MODID + " item models";
    }
}

