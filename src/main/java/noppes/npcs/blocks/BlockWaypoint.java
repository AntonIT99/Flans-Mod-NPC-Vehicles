// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import noppes.npcs.blocks.tiles.TileWaypoint;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.CustomNpcsPermissions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockContainer;

public class BlockWaypoint extends BlockContainer
{
    public BlockWaypoint() {
        super(Material.iron);
        this.setCreativeTab((CreativeTabs)CustomItems.tab);
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        if (par1World.isRemote) {
            return false;
        }
        final ItemStack currentItem = player.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() == CustomItems.wand && CustomNpcsPermissions.hasPermission(player, CustomNpcsPermissions.EDIT_BLOCKS)) {
            final TileEntity tile = par1World.getTileEntity(i, j, k);
            final NBTTagCompound compound = new NBTTagCompound();
            tile.writeToNBT(compound);
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.GUI_WAYPOINT, compound);
            return true;
        }
        return false;
    }
    
    public void onBlockPlacedBy(final World world, final int i, final int j, final int k, final EntityLivingBase entityliving, final ItemStack item) {
        if (entityliving instanceof EntityPlayer && world.isRemote) {
            CustomNpcs.proxy.openGui(i, j, k, EnumGuiType.Waypoint, (EntityPlayer)entityliving);
        }
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileWaypoint();
    }
}
