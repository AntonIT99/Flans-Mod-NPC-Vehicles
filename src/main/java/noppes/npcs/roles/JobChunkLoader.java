// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import java.util.Iterator;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraft.util.MathHelper;
import noppes.npcs.controllers.ChunkController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.List;

public class JobChunkLoader extends JobInterface
{
    private List<ChunkCoordIntPair> chunks;
    private int ticks;
    private long playerLastSeen;
    
    public JobChunkLoader(final EntityNPCInterface npc) {
        super(npc);
        this.chunks = new ArrayList<ChunkCoordIntPair>();
        this.ticks = 20;
        this.playerLastSeen = 0L;
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setLong("ChunkPlayerLastSeen", this.playerLastSeen);
        return compound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        this.playerLastSeen = compound.getLong("ChunkPlayerLastSeen");
    }
    
    @Override
    public boolean aiShouldExecute() {
        --this.ticks;
        if (this.ticks > 0) {
            return false;
        }
        this.ticks = 20;
        final List players = this.npc.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, this.npc.boundingBox.expand(48.0, 48.0, 48.0));
        if (!players.isEmpty()) {
            this.playerLastSeen = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > this.playerLastSeen + 600000L) {
            ChunkController.instance.deleteNPC(this.npc);
            this.chunks.clear();
            return false;
        }
        final ForgeChunkManager.Ticket ticket = ChunkController.instance.getTicket(this.npc);
        if (ticket == null) {
            return false;
        }
        final double x = this.npc.posX / 16.0;
        final double z = this.npc.posZ / 16.0;
        final List<ChunkCoordIntPair> list = new ArrayList<ChunkCoordIntPair>();
        list.add(new ChunkCoordIntPair(MathHelper.floor_double(x), MathHelper.floor_double(z)));
        list.add(new ChunkCoordIntPair(MathHelper.ceiling_double_int(x), MathHelper.ceiling_double_int(z)));
        list.add(new ChunkCoordIntPair(MathHelper.floor_double(x), MathHelper.ceiling_double_int(z)));
        list.add(new ChunkCoordIntPair(MathHelper.ceiling_double_int(x), MathHelper.floor_double(z)));
        for (final ChunkCoordIntPair chunk : list) {
            if (!this.chunks.contains(chunk)) {
                ForgeChunkManager.forceChunk(ticket, chunk);
            }
            else {
                this.chunks.remove(chunk);
            }
        }
        for (final ChunkCoordIntPair chunk : this.chunks) {
            ForgeChunkManager.unforceChunk(ticket, chunk);
        }
        this.chunks = list;
        return false;
    }
    
    @Override
    public void reset() {
        ChunkController.instance.deleteNPC(this.npc);
        this.chunks.clear();
        this.playerLastSeen = 0L;
    }
    
    @Override
    public void delete() {
    }
}
