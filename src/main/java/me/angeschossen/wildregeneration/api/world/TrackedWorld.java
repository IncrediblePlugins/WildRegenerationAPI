package me.angeschossen.wildregeneration.api.world;

import me.angeschossen.wildregeneration.api.world.chunk.util.ChunkKeyPair;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface TrackedWorld {

    void addChunksToQueue(@NotNull Collection<ChunkKeyPair> chunks);

    @NotNull World getWorld();
}
