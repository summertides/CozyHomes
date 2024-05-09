package net.summertides.cozyhomes.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.summertides.cozyhomes.CozyHomes;

public class ModItems {
    public static final Item NULLTEST = registerItem("nulltest", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CozyHomes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyHomes.LOGGER.info("[" + CozyHomes.MOD_ID + "]" + " Registering Mod Items");
    }


}


