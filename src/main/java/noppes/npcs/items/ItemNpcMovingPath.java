// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import java.util.List;
import noppes.npcs.CustomNpcs;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcsPermissions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.Item;

public class ItemNpcMovingPath extends Item
{
    public ItemNpcMovingPath() {
        this.maxStackSize = 1;
        this.setCreativeTab((CreativeTabs)CustomItems.tab);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (!par2World.isRemote) {
            final CustomNpcsPermissions instance = CustomNpcsPermissions.Instance;
            if (CustomNpcsPermissions.hasPermission(par3EntityPlayer, CustomNpcsPermissions.TOOL_MOUNTER)) {
                final EntityNPCInterface npc = this.getNpc(par1ItemStack, par2World);
                if (npc != null) {
                    NoppesUtilServer.sendOpenGui(par3EntityPlayer, EnumGuiType.MovingPath, npc);
                }
                return par1ItemStack;
            }
        }
        return par1ItemStack;
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer player, final World par3World, final int x, final int y, final int z, final int par7, final float par8, final float par9, final float par10) {
        if (!par3World.isRemote) {
            final CustomNpcsPermissions instance = CustomNpcsPermissions.Instance;
            if (CustomNpcsPermissions.hasPermission(player, CustomNpcsPermissions.TOOL_MOUNTER)) {
                final EntityNPCInterface npc = this.getNpc(par1ItemStack, par3World);
                if (npc == null) {
                    return true;
                }
                final List<int[]> list = npc.ai.getMovingPath();
                final int[] pos = list.get(list.size() - 1);
                list.add(new int[] { x, y, z });
                final double d3 = x - pos[0];
                final double d4 = y - pos[1];
                final double d5 = z - pos[2];
                final double distance = MathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
                player.addChatMessage((IChatComponent)new ChatComponentText("Added point x:" + x + " y:" + y + " z:" + z + " to npc " + npc.getCommandSenderName()));
                if (distance > CustomNpcs.NpcNavRange) {
                    player.addChatMessage((IChatComponent)new ChatComponentText("Warning: point is too far away from previous point. Max block walk distance = " + CustomNpcs.NpcNavRange));
                }
                return true;
            }
        }
        return false;
    }
    
    private EntityNPCInterface getNpc(final ItemStack item, final World world) {
        if (world.isRemote || item.stackTagCompound == null) {
            return null;
        }
        final Entity entity = world.getEntityByID(item.stackTagCompound.getInteger("NPCID"));
        if (entity == null || !(entity instanceof EntityNPCInterface)) {
            return null;
        }
        return (EntityNPCInterface)entity;
    }
    
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return 9127187;
    }
    
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.itemIcon = Items.iron_sword.getIconFromDamage(0);
    }
    
    public Item setUnlocalizedName(final String name) {
        GameRegistry.registerItem((Item)this, name);
        return super.setUnlocalizedName(name);
    }
}
