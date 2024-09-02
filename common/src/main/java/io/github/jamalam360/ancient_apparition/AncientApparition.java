package io.github.jamalam360.ancient_apparition;

import io.github.jamalam360.jamlib.JamLib;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientApparition {
	public static final String MOD_ID = "ancient_apparition";
	public static final String MOD_NAME = "Ancient Apparition";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static void init() {
		JamLib.checkForJarRenaming(AncientApparition.class);
	}
}
