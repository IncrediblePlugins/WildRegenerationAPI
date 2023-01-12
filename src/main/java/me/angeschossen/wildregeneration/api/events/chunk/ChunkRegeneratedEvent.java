package me.angeschossen.wildregeneration.api.events.chunk;

import me.angeschossen.wildregeneration.api.world.chunk.TrackedChunk;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ChunkRegeneratedEvent extends Event {

    public static HandlerList handlerList = new HandlerList();
    private final TrackedChunk trackedChunk;

    public ChunkRegeneratedEvent(TrackedChunk chunk) {
        this.trackedChunk = chunk;
    }

    @NotNull
    public TrackedChunk getChunk() {
        return trackedChunk;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}