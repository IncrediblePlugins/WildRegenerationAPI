package me.angeschossen.wildregeneration.api.world;

import java.sql.Timestamp;

public interface TrackedChunk {
    Timestamp getLastInteraction();
}
