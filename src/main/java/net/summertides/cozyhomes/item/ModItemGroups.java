package net.summertides.cozyhomes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.summertides.cozyhomes.CozyHomes;
import net.summertides.cozyhomes.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup COZYHOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CozyHomes.MOD_ID, "cozyhomes"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.cozyhomes"))
                    .icon(() -> new ItemStack(ModItems.NULLTEST))
                    .entries((displayContext, entries) -> {

//                      Add all mod items here for Cozy Homes group in creative menu
                        entries.add(ModItems.NULLTEST);
                        entries.add(ModBlocks.OAK_TABLE);
                        entries.add(ModBlocks.OAK_CHAIR);




                    }).build());

    public static void registerItemGroups() {
        CozyHomes.LOGGER.info("[" + CozyHomes.MOD_ID + "]" + " Registering Mod Item Groups");
    }
}
