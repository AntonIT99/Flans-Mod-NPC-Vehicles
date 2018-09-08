// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

public enum EnumNpcToolMaterial
{
    WOOD(0, 59, 2.0f, 0, 15), 
    STONE(1, 131, 4.0f, 1, 5), 
    BRONZE(2, 170, 5.0f, 2, 15), 
    IRON(2, 250, 6.0f, 2, 14), 
    DIA(3, 1561, 8.0f, 3, 10), 
    GOLD(0, 32, 12.0f, 1, 22), 
    EMERALD(3, 1000, 8.0f, 4, 10), 
    DEMONIC(3, 100, 8.0f, 6, 10), 
    FROST(2, 59, 6.0f, 3, 5), 
    MITHRIL(3, 3000, 8.0f, 3, 10);
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;
    
    private EnumNpcToolMaterial(final int par3, final int par4, final float par5, final int par6, final int par7) {
        this.harvestLevel = par3;
        this.maxUses = par4;
        this.efficiencyOnProperMaterial = par5;
        this.damageVsEntity = par6;
        this.enchantability = par7;
    }
    
    public int getMaxUses() {
        return this.maxUses;
    }
    
    public float getEfficiencyOnProperMaterial() {
        return this.efficiencyOnProperMaterial;
    }
    
    public int getDamageVsEntity() {
        return this.damageVsEntity;
    }
    
    public int getHarvestLevel() {
        return this.harvestLevel;
    }
    
    public int getEnchantability() {
        return this.enchantability;
    }
}
