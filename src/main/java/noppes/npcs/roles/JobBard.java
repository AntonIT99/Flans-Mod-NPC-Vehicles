// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import java.util.List;
import net.minecraft.entity.Entity;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.controllers.MusicController;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import noppes.npcs.CustomItems;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.constants.EnumBardInstrument;

public class JobBard extends JobInterface
{
    public int minRange;
    public int maxRange;
    public boolean isStreamer;
    public boolean hasOffRange;
    public String song;
    private EnumBardInstrument instrument;
    private long ticks;
    
    public JobBard(final EntityNPCInterface npc) {
        super(npc);
        this.minRange = 2;
        this.maxRange = 64;
        this.isStreamer = true;
        this.hasOffRange = true;
        this.song = "";
        this.instrument = EnumBardInstrument.Banjo;
        this.ticks = 0L;
        if (CustomItems.banjo != null) {
            this.mainhand = new ItemStack(CustomItems.banjo);
            final boolean b = true;
            this.overrideOffHand = b;
            this.overrideMainHand = b;
        }
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setString("BardSong", this.song);
        nbttagcompound.setInteger("BardMinRange", this.minRange);
        nbttagcompound.setInteger("BardMaxRange", this.maxRange);
        nbttagcompound.setInteger("BardInstrument", this.instrument.ordinal());
        nbttagcompound.setBoolean("BardStreamer", this.isStreamer);
        nbttagcompound.setBoolean("BardHasOff", this.hasOffRange);
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.song = nbttagcompound.getString("BardSong");
        this.minRange = nbttagcompound.getInteger("BardMinRange");
        this.maxRange = nbttagcompound.getInteger("BardMaxRange");
        this.setInstrument(nbttagcompound.getInteger("BardInstrument"));
        this.isStreamer = nbttagcompound.getBoolean("BardStreamer");
        this.hasOffRange = nbttagcompound.getBoolean("BardHasOff");
    }
    
    public void setInstrument(final int i) {
        if (CustomItems.banjo == null) {
            return;
        }
        this.instrument = EnumBardInstrument.values()[i];
        final boolean b = this.instrument != EnumBardInstrument.None;
        this.overrideOffHand = b;
        this.overrideMainHand = b;
        switch (this.instrument) {
            case None: {
                this.mainhand = null;
                this.offhand = null;
                break;
            }
            case Banjo: {
                this.mainhand = new ItemStack(CustomItems.banjo);
                this.offhand = null;
                break;
            }
            case Violin: {
                this.mainhand = new ItemStack(CustomItems.violin);
                this.offhand = new ItemStack(CustomItems.violinbow);
                break;
            }
            case Guitar: {
                this.mainhand = new ItemStack(CustomItems.guitar);
                this.offhand = null;
                break;
            }
            case Harp: {
                this.mainhand = new ItemStack(CustomItems.harp);
                this.offhand = null;
                break;
            }
            case FrenchHorn: {
                this.mainhand = new ItemStack(CustomItems.frenchHorn);
                this.offhand = null;
                break;
            }
        }
    }
    
    public EnumBardInstrument getInstrument() {
        return this.instrument;
    }
    
    public void onLivingUpdate() {
        if (!this.npc.isRemote()) {
            return;
        }
        ++this.ticks;
        if (this.ticks % 10L != 0L) {
            return;
        }
        if (this.song.isEmpty()) {
            return;
        }
        if (!MusicController.Instance.isPlaying(this.song)) {
            final List<EntityPlayer> list = (List<EntityPlayer>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.npc.boundingBox.expand((double)this.minRange, (double)(this.minRange / 2), (double)this.minRange));
            if (!list.contains(CustomNpcs.proxy.getPlayer())) {
                return;
            }
            if (this.isStreamer) {
                MusicController.Instance.playStreaming(this.song, (Entity)this.npc);
            }
            else {
                MusicController.Instance.playMusic(this.song, (Entity)this.npc);
            }
        }
        else if (MusicController.Instance.playingEntity != this.npc) {
            final EntityPlayer player = CustomNpcs.proxy.getPlayer();
            if (this.npc.getDistanceSqToEntity((Entity)player) < MusicController.Instance.playingEntity.getDistanceSqToEntity((Entity)player)) {
                MusicController.Instance.playingEntity = (Entity)this.npc;
            }
        }
        else if (this.hasOffRange) {
            final List<EntityPlayer> list = (List<EntityPlayer>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.npc.boundingBox.expand((double)this.maxRange, (double)(this.maxRange / 2), (double)this.maxRange));
            if (!list.contains(CustomNpcs.proxy.getPlayer())) {
                MusicController.Instance.stopMusic();
            }
        }
    }
    
    @Override
    public void killed() {
        this.delete();
    }
    
    @Override
    public void delete() {
        if (this.npc.worldObj.isRemote && this.hasOffRange && MusicController.Instance.isPlaying(this.song)) {
            MusicController.Instance.stopMusic();
        }
    }
}
