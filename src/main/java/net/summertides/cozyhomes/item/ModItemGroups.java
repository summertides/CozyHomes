package net.summertides.cozyhomes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.summertides.cozyhomes.CozyHomes;

public class ModItemGroups {

    public static final ItemGroup COZYHOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CozyHomes.MOD_ID, "cozyhomes"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.cozyhomes"))
                    .icon(() -> new ItemStack(ModItems.NULLTEST))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NULLTEST);

                    }).build());

    public static void registerItemGroups() {
        CozyHomes.LOGGER.info("[" + CozyHomes.MOD_ID + "]" + " Registering Mod Item Groups");
    }
}
