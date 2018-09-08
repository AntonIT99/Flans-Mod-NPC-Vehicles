// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import noppes.npcs.controllers.PlayerQuestData;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.StatCollector;
import noppes.npcs.quests.QuestLocation;
import noppes.npcs.constants.EnumQuestType;
import noppes.npcs.controllers.QuestData;
import noppes.npcs.controllers.PlayerDataController;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.tileentity.TileEntity;

public class TileWaypoint extends TileEntity
{
    public String name;
    private int ticks;
    private List<EntityPlayer> recentlyChecked;
    private List<EntityPlayer> toCheck;
    public int range;
    
    public TileWaypoint() {
        this.name = "";
        this.ticks = 10;
        this.recentlyChecked = new ArrayList<EntityPlayer>();
        this.range = 10;
    }
    
    public void updateEntity() {
        if (this.worldObj.isRemote || this.name.isEmpty()) {
            return;
        }
        --this.ticks;
        if (this.ticks > 0) {
            return;
        }
        this.ticks = 10;
        (this.toCheck = this.getPlayerList(this.range, this.range, this.range)).removeAll(this.recentlyChecked);
        final List<EntityPlayer> listMax = this.getPlayerList(this.range + 10, this.range + 10, this.range + 10);
        this.recentlyChecked.retainAll(listMax);
        this.recentlyChecked.addAll(this.toCheck);
        if (this.toCheck.isEmpty()) {
            return;
        }
        for (final EntityPlayer player : this.toCheck) {
            final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData(player).questData;
            for (final QuestData data : playerdata.activeQuests.values()) {
                if (data.quest.type != EnumQuestType.Location) {
                    continue;
                }
                final QuestLocation quest = (QuestLocation)data.quest.questInterface;
                if (!quest.setFound(data, this.name)) {
                    continue;
                }
                player.addChatMessage((IChatComponent)new ChatComponentTranslation(this.name + " " + StatCollector.translateToLocal("quest.found"), new Object[0]));
                playerdata.checkQuestCompletion(player, EnumQuestType.Location);
            }
        }
    }
    
    private List<EntityPlayer> getPlayerList(final int x, final int y, final int z) {
        return (List<EntityPlayer>)this.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand((double)x, (double)y, (double)z));
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.name = compound.getString("LocationName");
        this.range = compound.getInteger("LocationRange");
        if (this.range < 2) {
            this.range = 2;
        }
    }
    
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        if (!this.name.isEmpty()) {
            compound.setString("LocationName", this.name);
        }
        compound.setInteger("LocationRange", this.range);
    }
}
