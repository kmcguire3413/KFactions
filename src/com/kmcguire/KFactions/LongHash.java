package com.kmcguire.KFactions;

import org.bukkit.Bukkit;

public class LongHash {
    public static long toLong(int h, int l) {
        return ((long)h << 32) | ((long)l & 0xFFFFFFFFL);
    }
    
    public static int msw(long k) {
        return (int)(k >> 32);
    }
    
    public static int lsw(long k) {
        return (int)(k & 0xffffffff);
    }
}
