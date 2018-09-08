// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemNpcBlock extends ItemBlock
{
    public String[] names;
    
    public ItemNpcBlock(final Block block) {
        super(block);
    }
    
    public String getUnlocalizedName(final ItemStack par1ItemStack) {
        if (this.names != null && par1ItemStack.getItemDamage() < this.names.length) {
            return this.names[par1ItemStack.getItemDamage()];
        }
        return this.field_150939_a.getUnlocalizedName();
    }
}
