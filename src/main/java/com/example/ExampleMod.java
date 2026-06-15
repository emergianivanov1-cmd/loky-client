package dev.lokyclient;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LokyClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("lokyclient");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Loky Client loaded. In memory of Loky.");
    }
}
