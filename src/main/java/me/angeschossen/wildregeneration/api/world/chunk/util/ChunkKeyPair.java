package me.angeschossen.wildregeneration.api.world.chunk.util;


/**
 * Stores position of a chunk.
 */
public class ChunkKeyPair {

    public final int x, z;

    /**
     * Create an instance of this position.
     * @param x Chunk X
     * @param z chunk Z
     */
    private ChunkKeyPair(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public static ChunkKeyPair of(int x, int z) {
        return new ChunkKeyPair(x, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ChunkKeyPair)) {
            return false;
        }

        ChunkKeyPair pair = (ChunkKeyPair) obj;
        return pair.x == this.x && pair.z == this.z;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + x;
        hash = hash * 31 + z;
        return hash;
    }

    @Override
    public String toString() {
        return "ChunkKeyPair{" +
                "x=" + x + "," +
                "z=" + z +
                "}";
    }
}
