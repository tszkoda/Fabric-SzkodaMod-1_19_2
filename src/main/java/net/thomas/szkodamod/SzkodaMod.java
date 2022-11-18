package net.thomas.szkodamod;

import net.fabricmc.api.ModInitializer;
import net.thomas.szkodamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SzkodaMod implements ModInitializer {
	public static final String MOD_ID = "szkodamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
