package me.angeschossen.wildregeneration.api.world;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface TrackedWorld {

    void addChunksToQueue(Collection<ChunkKeyPair> chunks);

    @NotNull World getWorld();
}
