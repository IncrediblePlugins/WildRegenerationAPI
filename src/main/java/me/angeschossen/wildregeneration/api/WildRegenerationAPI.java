package me.angeschossen.wildregeneration.api;

import me.angeschossen.wildregeneration.api.manager.APIHandler;
import me.angeschossen.wildregeneration.api.world.TrackedWorld;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface WildRegenerationAPI {

    static WildRegenerationAPI getInstance() {
        return APIHandler.getInstance().getAPI();
    }

    /**
     * Get a world that tracks chunks for inactivity.
     *
     * @param world World
     * @return null, if this world doesn't use WildRegeneration.
     */
    @Nullable
    TrackedWorld getWorld(@NotNull World world);
}
