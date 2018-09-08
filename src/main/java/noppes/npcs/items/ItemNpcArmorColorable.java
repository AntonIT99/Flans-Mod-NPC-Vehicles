// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.ItemArmor;

public class ItemNpcArmorColorable extends ItemArmor
{
    private String texture;
    
    public ItemNpcArmorColorable(final int par1, final ItemArmor.ArmorMaterial par2EnumArmorMaterial, final int par4, final String texture) {
        super(par2EnumArmorMaterial, 0, par4);
        this.texture = texture;
        this.setCreativeTab((CreativeTabs)CustomItems.tabArmor);
    }
    
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (type != null) {
            return "customnpcs:textures/gui/invisible.png";
        }
        if (this.armorType == 2) {
            return "customnpcs:textures/armor/" + this.texture + "_2.png";
        }
        return "customnpcs:textures/armor/" + this.texture + "_1.png";
    }
    
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        final int j = this.getColor(par1ItemStack);
        if (j < 0) {
            return 16777215;
        }
        return j;
    }
    
    public int getColor(final ItemStack par1ItemStack) {
        final NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            return 10511680;
        }
        final NBTTagCompound nbttagcompound2 = nbttagcompound.getCompoundTag("display");
        return (nbttagcompound2 == null) ? 10511680 : (nbttagcompound2.hasKey("color", 3) ? nbttagcompound2.getInteger("color") : 10511680);
    }
    
    public void removeColor(final ItemStack par1ItemStack) {
        final NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound != null) {
            final NBTTagCompound nbttagcompound2 = nbttagcompound.getCompoundTag("display");
            if (nbttagcompound2.hasKey("color")) {
                nbttagcompound2.removeTag("color");
            }
        }
    }
    
    public void func_82813_b(final ItemStack par1ItemStack, final int par2) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            nbttagcompound = new NBTTagCompound();
            par1ItemStack.setTagCompound(nbttagcompound);
        }
        final NBTTagCompound nbttagcompound2 = nbttagcompound.getCompoundTag("display");
        if (!nbttagcompound.hasKey("display", 10)) {
            nbttagcompound.setTag("display", (NBTBase)nbttagcompound2);
        }
        nbttagcompound2.setInteger("color", par2);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(final int par1, final int par2) {
        return this.getIconFromDamage(par1);
    }
    
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(this.getIconString());
    }
    
    public boolean hasColor(final ItemStack par1ItemStack) {
        return par1ItemStack.hasTagCompound() && par1ItemStack.getTagCompound().hasKey("display", 10) && par1ItemStack.getTagCompound().getCompoundTag("display").hasKey("color", 3);
    }
    
    public Item setUnlocalizedName(final String name) {
        GameRegistry.registerItem((Item)this, name);
        return super.setUnlocalizedName(name);
    }
}
