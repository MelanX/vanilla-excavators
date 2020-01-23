package de.melanx.vanillaexcavators.common;

import de.melanx.vanillaexcavators.VanillaExcavators;
import de.melanx.vanillaexcavators.api.ExcavatorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static de.melanx.vanillaexcavators.common.ExcavatorMaterials.*;

public class ExcavatorRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VanillaExcavators.MODID);

    public static final RegistryObject<Item> WOODEN_EXCAVATOR = register(WOOD);
    public static final RegistryObject<Item> STONE_EXCAVATOR = register(STONE);
    public static final RegistryObject<Item> IRON_EXCAVATOR = register(IRON);
    public static final RegistryObject<Item> GOLD_EXCAVATOR = register(GOLD);
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = register(DIAMOND);
    public static final RegistryObject<Item> EMERALD_EXCAVATOR = register(EMERALD);
    public static final RegistryObject<Item> OBSIDIAN_EXCAVATOR = register(OBSIDIAN);
    public static final RegistryObject<Item> QUARTZ_EXCAVATOR = register(QUARTZ);
    public static final RegistryObject<Item> LAPIS_EXCAVATOR = register(LAPIS);
    public static final RegistryObject<Item> FIERY_EXCAVATOR = register(FIERY);
    public static final RegistryObject<Item> PRISMARINE_EXCAVATOR = register(PRISMARINE);
    public static final RegistryObject<Item> ENDER_EXCAVATOR = register(ENDER);
    public static final RegistryObject<Item> SLIME_EXCAVATOR = register(SLIME);
    public static final RegistryObject<Item> GLOWSTONE_EXCAVATOR = register(GLOWSTONE);
    public static final RegistryObject<Item> NETHER_EXCAVATOR = register(NETHER);

    public static void registerHammers() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static RegistryObject<Item> register(ExcavatorMaterials type) {
        String name = type.getPrefix();
        float attackSpeed = type.getAttackSpeed();
        return ITEMS.register(name + "_excavator", () -> new ExcavatorItem(type, 0, attackSpeed));
    }
}
