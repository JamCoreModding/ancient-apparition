package io.github.jamalam360.ancient_apparition.fabric;

import io.github.jamalam360.ancient_apparition.AncientApparition;
import net.fabricmc.api.ModInitializer;

public class AncientApparitionFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        AncientApparition.init();
    }
}
