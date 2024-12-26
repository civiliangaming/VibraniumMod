package com.hpm.vibraniummod.item;

import com.hpm.vibraniummod.VibraniumMod;
import com.hpm.vibraniummod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VibraniumMod.MODID);


    public static final RegistryObject<CreativeModeTab> VIBRANIUM_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("vibranium_tab_items",
                    ()-> CreativeModeTab
                            .builder().icon(() -> new ItemStack(ModItems.VIBRANIUM.get()))
                            .title(Component.translatable("creativetab.vibraniummod.vibranium_items"))
                            .displayItems((ItemDisplayParameters, output) -> {

                              output.accept(ModItems.VIBRANIUM.get());
                              output.accept(ModItems.RAW_VIBRANIUM.get());
                              output.accept(ModItems.VIBRANIUM_CHUNK.get());
                              output.accept(ModItems.ENRICHED_VIBRANIUM.get());

                            })
                            .build());

    public static final RegistryObject<CreativeModeTab> VIBRANIUM_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("vibranium_tab_blocks",
                    ()-> CreativeModeTab
                            .builder().icon(() -> new ItemStack(ModBlocks.VIBRANIUM_BLOCK.get()))
                            .withTabsBefore(VIBRANIUM_ITEMS_TAB.getId())
                            .title(Component.translatable("creativetab.vibraniummod.vibranium_blocks"))
                            .displayItems((ItemDisplayParameters, output) -> {

                                output.accept(ModBlocks.VIBRANIUM_BLOCK.get());
                                output.accept(ModBlocks.RAW_VIBRANIUM_BLOCK.get());

                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
