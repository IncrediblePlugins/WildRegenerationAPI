package me.angeschossen.wildregeneration.api.world;

import me.angeschossen.wildregeneration.api.world.chunk.util.ChunkKeyPair;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/**
 * A world holds all tracked chunks.
 */
public interface TrackedWorld {

    /**
     * Add chunks to the regeneration queue.
     * @param chunks chunks to be regenerated
     */
    void addChunksToRegenerationQueue(@NotNull Collection<ChunkKeyPair> chunks);

    /**
     * Get the Bukkit world.
     * @return Bukkit world
     */
    @NotNull World getWorld();
}
