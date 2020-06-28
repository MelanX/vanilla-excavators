package de.melanx.vanillaexcavators.items;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.vanillaexcavators.VanillaExcavators;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ExcavatorRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExcavators.MODID);

    public static void registerHammers() {
        for (BigBreakMaterials type : BigBreakMaterials.values()) {
            String name = type.getPrefix();
            float attackSpeed = type.getAttackSpeed();
            ITEMS.register(name + "_excavator", () -> new ExcavatorItem(type, attackSpeed));
        }
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
