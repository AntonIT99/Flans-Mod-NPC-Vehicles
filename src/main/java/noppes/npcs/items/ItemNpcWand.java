// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.texture.IIconRegister;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.CustomNpcsPermissions;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.server.MinecraftServer;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.Item;

public class ItemNpcWand extends Item
{
    public ItemNpcWand() {
        this.maxStackSize = 1;
        this.setCreativeTab((CreativeTabs)CustomItems.tab);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (!par2World.isRemote) {
            return par1ItemStack;
        }
        CustomNpcs.proxy.openGui(0, 0, 0, EnumGuiType.NpcRemote, par3EntityPlayer);
        return par1ItemStack;
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer player, final World par3World, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
        if (par3World.isRemote) {
            return true;
        }
        if (CustomNpcs.OpsOnly && !MinecraftServer.getServer().getConfigurationManager().func_152596_g(player.getGameProfile())) {
            player.addChatMessage((IChatComponent)new ChatComponentTranslation("availability.permission", new Object[0]));
        }
        else {
            final CustomNpcsPermissions instance = CustomNpcsPermissions.Instance;
            if (CustomNpcsPermissions.hasPermission(player, CustomNpcsPermissions.NPC_CREATE)) {
                final EntityCustomNpc npc = new EntityCustomNpc(par3World);
                npc.ai.startPos = new int[] { par4, par5, par6 };
                npc.setLocationAndAngles((double)(par4 + 0.5f), npc.getStartYPos(), (double)(par6 + 0.5f), player.rotationYaw, player.rotationPitch);
                par3World.spawnEntityInWorld((Entity)npc);
                npc.setHealth(npc.getMaxHealth());
                NoppesUtilServer.sendOpenGui(player, EnumGuiType.MainMenuDisplay, npc);
            }
            else {
                player.addChatMessage((IChatComponent)new ChatComponentTranslation("availability.permission", new Object[0]));
            }
        }
        return true;
    }
    
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return 9127187;
    }
    
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.itemIcon = Items.iron_hoe.getIconFromDamage(0);
    }
    
    public Item setUnlocalizedName(final String name) {
        GameRegistry.registerItem((Item)this, name);
        return super.setUnlocalizedName(name);
    }
}
