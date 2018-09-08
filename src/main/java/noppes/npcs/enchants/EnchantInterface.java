// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.enchants;

import net.minecraft.enchantment.EnchantmentHelper;
import noppes.npcs.LogWriter;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemStack;
import noppes.npcs.CustomNpcs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment;

public abstract class EnchantInterface extends Enchantment
{
    private static EnumEnchantmentType CustomNpcsType;
    public static EnchantInterface Damage;
    public static EnchantInterface Poison;
    public static EnchantInterface Confusion;
    public static EnchantInterface Infinite;
    private Class[] classes;
    
    protected EnchantInterface(final int par2, final Class... obs) {
        super(CustomNpcs.EnchantStartId++, par2, EnchantInterface.CustomNpcsType);
        this.classes = obs;
    }
    
    public boolean canApply(final ItemStack par1ItemStack) {
        if (par1ItemStack.getItem() == null) {
            return false;
        }
        for (final Class cls : this.classes) {
            if (cls.isInstance(par1ItemStack.getItem())) {
                return true;
            }
        }
        return false;
    }
    
    public static void load() {
        if (!CustomNpcs.DisableEnchants) {
            EnchantInterface.CustomNpcsType = EnumHelper.addEnchantmentType("customnpcs_enchants");
            try {
                EnchantInterface.Damage = new EnchantDamage();
                EnchantInterface.Poison = new EnchantPoison();
                EnchantInterface.Confusion = new EnchantConfusion();
                EnchantInterface.Infinite = new EnchantInfinite();
            }
            catch (Exception e) {
                LogWriter.except(e);
            }
        }
    }
    
    public static int getLevel(final EnchantInterface enchant, final ItemStack stack) {
        if (CustomNpcs.DisableEnchants || enchant == null) {
            return 0;
        }
        return EnchantmentHelper.getEnchantmentLevel(enchant.effectId, stack);
    }
}
