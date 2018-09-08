// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.nbt.NBTBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;

public class MoneyBagContents
{
    private EntityPlayer player;
    private int[] coinData;
    
    public MoneyBagContents(final EntityPlayer player) {
        this.coinData = new int[] { 0, 0, 0, 0, 0, 0, 0 };
        this.player = player;
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.coinData = compound.getIntArray("coins");
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setIntArray("coins", this.coinData);
        return compound;
    }
    
    public void AddCurrency(final CoinType coinType, final byte stackSize, final ItemStack theBag) {
        this.coinData[coinType.ordinal()] += stackSize;
        theBag.stackTagCompound.setTag("contents", (NBTBase)this.writeNBT());
    }
    
    public void WithdrawCurrencyByVal(final CoinType coinType, final short amount, final ItemStack theBag) {
        final int amtAdded = 0;
        this.coinData[coinType.ordinal()] -= amtAdded;
        theBag.stackTagCompound.setTag("contents", (NBTBase)this.writeNBT());
    }
    
    public void WithdrawCurrencyByStack(final CoinType coinType, final byte numStacks, final ItemStack theBag) {
        final int amtAdded = 0;
        this.coinData[coinType.ordinal()] -= amtAdded;
        theBag.stackTagCompound.setTag("contents", (NBTBase)this.writeNBT());
    }
    
    public enum CoinType
    {
        WOOD, 
        STONE, 
        IRON, 
        GOLD, 
        DIAMOND, 
        BRONZE, 
        EMERALD;
    }
}
