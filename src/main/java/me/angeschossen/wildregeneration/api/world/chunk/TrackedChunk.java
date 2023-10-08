package me.angeschossen.wildregeneration.api.world.chunk;

import me.angeschossen.wildregeneration.api.world.TrackedWorld;
import me.angeschossen.wildregeneration.api.world.chunk.util.ChunkType;
import org.jetbrains.annotations.NotNull;

import java.sql.Timestamp;

/**
 * Stores information about a chunk that is tracked.
 * A chunk gets tracked at the first time a player interacts with it.
 * Upon regeneration the chunk gets untracked again.
 */
public interface TrackedChunk {
    /**
     * Get the world.
     * @return world in which the chunk is in
     */
    @NotNull TrackedWorld getWorld();

    /**
     * Get the time of last interaction.
     * @return timestamp of last player interaction
     */
    @NotNull
    Timestamp getLastInteraction();

    /**
     * Get reason of tracking.
     * @return reason why this chunk is tracked
     */
    @NotNull ChunkType getType();

    /**
     * Get chunk X.
     * @return chunk x
     */
    int getX();

    /**
     * Get chunk Z.
     * @return chunk z
     */
    int getZ();
}
