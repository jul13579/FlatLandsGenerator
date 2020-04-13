package de.lerry;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class FlatLandsGenerator extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info(getDescription().getFullName() + " has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getFullName() + " has been disabled");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new FlatLandsChunkGenerator();
    }
}
