package net.gdDes.ScytheMod.item;

import net.gdDes.ScytheMod.ScytheMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScytheMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCYTHE_TAB = CREATIVE_MODE_TABS.register("scythe_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORRUPT_INGOT.get()))
                    .title(Component.translatable("creativetab.scythe_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CORRUPT_INGOT.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
