package net.summertides.cozyhomes;

import net.fabricmc.api.ModInitializer;

import net.summertides.cozyhomes.item.ModItemGroups;
import net.summertides.cozyhomes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyHomes implements ModInitializer {
	public static final String MOD_ID = "cozyhomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}