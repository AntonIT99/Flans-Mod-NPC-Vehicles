// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

import java.util.ArrayList;

public enum EnumMovingType
{
    Standing("ai.standing"), 
    Wandering("ai.wandering"), 
    MovingPath("ai.movingpath");
    
    String name;
    
    private EnumMovingType(final String name) {
        this.name = name;
    }
    
    public static String[] names() {
        final ArrayList<String> list = new ArrayList<String>();
        for (final EnumMovingType e : values()) {
            list.add(e.name);
        }
        return list.toArray(new String[list.size()]);
    }
}
