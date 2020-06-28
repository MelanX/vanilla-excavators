package de.melanx.vanillaexcavators.data;

import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class ItemModels extends de.melanx.morevanillalib.data.ItemModels {
    public ItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, VanillaExcavators.MODID, helper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> item : ExcavatorRegistry.ITEMS.getEntries())
            this.generateItem(item.get());
    }

    @Override
    public String getName() {
        return VanillaExcavators.MODID + " item models";
    }
}

