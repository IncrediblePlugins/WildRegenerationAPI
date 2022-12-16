package me.angeschossen.wildregeneration.api.manager;

import me.angeschossen.wildregeneration.api.WildRegenerationAPI;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class APIHandler {

    private static APIHandler instance;
    private final WildRegenerationAPI api;

    @NotNull
    public WildRegenerationAPI getAPI() {
        return api;
    }

    private APIHandler(@NotNull WildRegenerationAPI api) {
        this.api = api;
    }

    public static APIHandler getInstance() {
        return instance;
    }

    public static void init(@NotNull WildRegenerationAPI api) {
        Objects.requireNonNull(api);
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }

        instance = new APIHandler(api);
    }


}
