package net.gdDes.ScytheMod.item;

import net.gdDes.ScytheMod.ScytheMod;
import net.gdDes.ScytheMod.item.custom.PaxelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScytheMod.MOD_ID);

    public static final RegistryObject<Item> CORRUPT_INGOT = ITEMS.register("corrupt_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DECREPIT_HANDLE = ITEMS.register("decrepit_handle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCYTHE_HARVEST = ITEMS.register("scythe_harvest",
            () -> new PaxelItem(ModToolTiers.SCYTHE, 5, 0f ,
                    new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
