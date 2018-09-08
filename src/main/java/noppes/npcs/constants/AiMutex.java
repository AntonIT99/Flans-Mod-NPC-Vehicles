// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

public class AiMutex
{
    public static byte PASSIVE;
    public static byte LOOK;
    public static byte PATHING;
    
    static {
        AiMutex.PASSIVE = 1;
        AiMutex.LOOK = 2;
        AiMutex.PATHING = 4;
    }
}
