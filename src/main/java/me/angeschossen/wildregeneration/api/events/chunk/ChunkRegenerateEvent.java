package me.angeschossen.wildregeneration.api.events.chunk;

import com.github.angeschossen.pluginframework.api.utils.Checks;
import me.angeschossen.wildregeneration.api.world.chunk.TrackedChunk;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called whenever a chunk is about to get regenerated.
 */
public class ChunkRegenerateEvent extends Event implements Cancellable {

    private boolean cancelled;
    public static HandlerList handlerList = new HandlerList();
    private final @NotNull TrackedChunk trackedChunk;

    /**
     * Create an instance of this event
     * @param chunk the chunk that is going to be regenerated
     */
    public ChunkRegenerateEvent(@NotNull TrackedChunk chunk) {
        Checks.requireNonNull(chunk, "chunk");

        this.trackedChunk = chunk;
    }

    /**
     * Get the chunk.
     * @return chunk that is going to be regenerated
     */
    @NotNull
    public TrackedChunk getChunk() {
        return trackedChunk;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}