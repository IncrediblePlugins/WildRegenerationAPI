package me.angeschossen.wildregeneration.api.world.chunk.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum ChunkType {
    TRACKED, UNCLAIM;

    @NotNull
    public static ChunkType getByValue(@Nullable String input) {
        try {
            return valueOf(input);
        } catch (NullPointerException | IllegalArgumentException ex) {
            return TRACKED;
        }
    }
}
