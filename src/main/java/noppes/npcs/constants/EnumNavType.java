// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

import java.util.ArrayList;

public enum EnumNavType
{
    Default("aitactics.rush"), 
    Dodge("aitactics.stagger"), 
    Surround("aitactics.orbit"), 
    HitNRun("aitactics.hitandrun"), 
    Ambush("aitactics.ambush"), 
    Stalk("aitactics.stalk"), 
    None("gui.none");
    
    String name;
    
    private EnumNavType(final String name) {
        this.name = name;
    }
    
    public static String[] names() {
        final ArrayList<String> list = new ArrayList<String>();
        for (final EnumNavType e : values()) {
            list.add(e.name);
        }
        return list.toArray(new String[list.size()]);
    }
}
