// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles.companion;

import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class CompanionTrader extends CompanionJobInterface
{
    @Override
    public NBTTagCompound getNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        return compound;
    }
    
    @Override
    public void setNBT(final NBTTagCompound compound) {
    }
    
    public void interact(final EntityPlayer player) {
        NoppesUtilServer.sendOpenGui(player, EnumGuiType.CompanionTrader, this.npc);
    }
}
