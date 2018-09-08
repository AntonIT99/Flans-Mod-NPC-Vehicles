// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

public enum EnumParticleType
{
    None(""), 
    Smoke("smoke"), 
    Portal("portal"), 
    Redstone("reddust"), 
    Lightning("magicCrit"), 
    LargeSmoke("largesmoke"), 
    Magic("witchMagic"), 
    Enchant("enchantmenttable"), 
    Crit("crit");
    
    public String particleName;
    
    private EnumParticleType(final String name) {
        this.particleName = name;
    }
}
