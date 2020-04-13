package de.lerry;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class FlatLandsChunkGenerator extends ChunkGenerator {
    final int CHUNK_DIMENSION = 16;

    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData chunk = createChunkData(world);

        for (int _x = 0; _x < CHUNK_DIMENSION; _x++) {
            for (int _z = 0; _z < CHUNK_DIMENSION; _z++) {
                int _y = 0;
                while (_y < 1) {
                    chunk.setBlock(_x, _y, _z, Material.BEDROCK);
                    _y++;
                }
                while (_y - 1 < 60) {
                    chunk.setBlock(_x, _y, _z, Material.STONE);
                    _y++;
                }
                while (_y - 61 < 3) {
                    chunk.setBlock(_x, _y, _z, Material.DIRT);
                    _y++;
                }
                while (_y - 64 < 1) {
                    chunk.setBlock(_x, _y, _z, Material.GRASS_BLOCK);
                    _y++;
                }
            }
        }

        return chunk;
    }
}
