package me.mouren.better_loading_screen;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NeoForge port of Better Loading Screen (originally a Fabric mod by HuaMouRen).
 * The only loader-specific code is the mod entry point; all rendering logic lives
 * in the LevelLoadingScreenMixin, which targets standard 1.21.1 APIs and is
 * loader-agnostic.
 */
@Mod(BetterLoadingScreen.MOD_ID)
public class BetterLoadingScreen {
	public static final String MOD_ID = "betterloadingscreen";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public BetterLoadingScreen(IEventBus modEventBus) {
		modEventBus.addListener(this::onCommonSetup);
	}

	private void onCommonSetup(final FMLCommonSetupEvent event) {
		LOGGER.info("Initializing...");
	}
}
