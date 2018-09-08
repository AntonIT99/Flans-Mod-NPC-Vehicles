// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.PixelmonHelper;
import net.minecraft.entity.player.EntityPlayerMP;

public class ScriptPixelmonPlayerData
{
    private EntityPlayerMP player;
    
    public ScriptPixelmonPlayerData(final EntityPlayerMP player) {
        this.player = player;
    }
    
    public ScriptPixelmon getPartySlot(final int slot) {
        final NBTTagCompound compound = PixelmonHelper.getPartySlot(slot, (EntityPlayer)this.player);
        if (compound == null) {
            return null;
        }
        final EntityTameable pixelmon = PixelmonHelper.pixelmonFromNBT(compound, (EntityPlayer)this.player);
        return new ScriptPixelmon(pixelmon, compound);
    }
    
    public int countPCPixelmon() {
        return PixelmonHelper.countPCPixelmon(this.player);
    }
}
