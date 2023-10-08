package me.angeschossen.wildregeneration.api.world.chunk.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Identifies reason for regeneration.
 */
public enum ChunkType {
    /**
     * Is tracked because of normal player interaction.
     */
    TRACKED,
    /**
     * Is tracked because the chunk got unclaimed recently.
     */
    UNCLAIM;

    @NotNull
    public static ChunkType getByValue(@Nullable String input) {
        try {
            return valueOf(input);
        } catch (NullPointerException | IllegalArgumentException ex) {
            return TRACKED;
        }
    }
}
