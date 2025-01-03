package com.hpm.vibraniummod.item;

import com.hpm.vibraniummod.VibraniumMod;
import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VibraniumMod.MODID);



    public static final RegistryObject<Item> VIBRANIUM = ITEMS.register("vibranium",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> VIBRANIUM_CHUNK = ITEMS.register("vibranium_chunk",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> ENRICHED_VIBRANIUM = ITEMS.register("enriched_vibranium",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> RAW_VIBRANIUM = ITEMS.register("raw_vibranium",
            () -> new Item(new Item.Properties())
    );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
