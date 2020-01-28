package de.melanx.vanillaexcavators.common;

import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.api.ExcavatorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ExcavatorRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VanillaExcavators.MODID);

    public static void registerHammers() {
        for (ExcavatorMaterials type : ExcavatorMaterials.values()) {
            String name = type.getPrefix();
            float attackSpeed = type.getAttackSpeed();
            ITEMS.register(name + "_excavator", () -> new ExcavatorItem(type, 0, attackSpeed));
        }
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
