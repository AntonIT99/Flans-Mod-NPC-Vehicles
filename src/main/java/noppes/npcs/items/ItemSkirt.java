// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import noppes.npcs.CustomNpcs;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.ItemArmor;

public class ItemSkirt extends ItemArmor
{
    private String texture;
    
    public ItemSkirt(final ItemArmor.ArmorMaterial par2EnumArmorMaterial, final String texture) {
        super(par2EnumArmorMaterial, 0, 2);
        this.texture = texture;
        this.setCreativeTab((CreativeTabs)CustomItems.tabArmor);
        this.setMaxStackSize(1);
    }
    
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        int j = this.getColor(par1ItemStack);
        if (j < 0) {
            j = 16777215;
        }
        return j;
    }
    
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (type != null && type.equals("overlay")) {
            return null;
        }
        return this.texture;
    }
    
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(final EntityLivingBase entityLiving, final ItemStack itemStack, final int armorSlot) {
        return CustomNpcs.proxy.getSkirtModel();
    }
    
    public Item setUnlocalizedName(final String name) {
        GameRegistry.registerItem((Item)this, name);
        return super.setUnlocalizedName(name);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(final int par1, final int par2) {
        return super.getIconFromDamage(par1);
    }
}
