// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.util;

public class ValueUtil
{
    public static float correctFloat(final float given, final float min, final float max) {
        if (given < min) {
            return min;
        }
        if (given > max) {
            return max;
        }
        return given;
    }
    
    public static int CorrectInt(final int given, final int min, final int max) {
        if (given < min) {
            return min;
        }
        if (given > max) {
            return max;
        }
        return given;
    }
}
