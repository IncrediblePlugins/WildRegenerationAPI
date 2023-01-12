package me.angeschossen.wildregeneration.api.world.chunk;

import me.angeschossen.wildregeneration.api.world.TrackedWorld;
import me.angeschossen.wildregeneration.api.world.chunk.util.ChunkType;
import org.jetbrains.annotations.NotNull;

import java.sql.Timestamp;

public interface TrackedChunk {
    @NotNull TrackedWorld getWorld();

    @NotNull
    Timestamp getLastInteraction();

    @NotNull ChunkType getType();

    int getX();

    int getZ();
}
