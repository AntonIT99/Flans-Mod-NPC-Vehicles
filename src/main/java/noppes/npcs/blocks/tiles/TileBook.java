// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TileBook extends TileColorable
{
    public ItemStack book;
    
    public TileBook() {
        this.book = new ItemStack(Items.writable_book);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.book = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("Items"));
        if (this.book == null) {
            this.book = new ItemStack(Items.writable_book);
        }
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setTag("Items", (NBTBase)this.book.writeToNBT(new NBTTagCompound()));
    }
}
