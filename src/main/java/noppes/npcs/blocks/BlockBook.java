// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.Server;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import noppes.npcs.CustomNpcsPermissions;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.tiles.TileBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BlockBook extends BlockRotated
{
    public BlockBook() {
        super(Blocks.planks);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.2f, 1.0f);
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        if (par1World.isRemote) {
            return true;
        }
        final TileEntity tile = par1World.getTileEntity(i, j, k);
        if (!(tile instanceof TileBook)) {
            return false;
        }
        final ItemStack currentItem = player.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() == CustomItems.wand && CustomNpcsPermissions.hasPermission(player, CustomNpcsPermissions.EDIT_BLOCKS)) {
            ((TileBook)tile).book.func_150996_a(Items.writable_book);
        }
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.OPEN_BOOK, i, j, k, ((TileBook)tile).book.writeToNBT(new NBTTagCompound()));
        return true;
    }
    
    public String getUnlocalizedName() {
        return "item.book";
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileBook();
    }
}
