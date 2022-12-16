package me.angeschossen.wildregeneration.api.world;


public class ChunkKeyPair {

    public final int x, z;

    public ChunkKeyPair(int x, int z) {
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
