// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import com.google.common.collect.Sets;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.event.ForgeEventFactory;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityList;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.Random;
import net.minecraft.world.chunk.Chunk;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.Entity;
import noppes.npcs.controllers.SpawnData;
import net.minecraft.block.Block;
import net.minecraft.world.ChunkPosition;
import java.util.Iterator;
import net.minecraft.block.material.Material;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.SpawnController;
import net.minecraft.world.WorldServer;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Set;

public class NPCSpawning
{
    private static Set<ChunkCoordIntPair> eligibleChunksForSpawning;
    
    public static void findChunksForSpawning(final WorldServer world) {
        if (SpawnController.instance.data.isEmpty() || world.getWorldInfo().getWorldTotalTime() % 400L != 0L) {
            return;
        }
        NPCSpawning.eligibleChunksForSpawning.clear();
        for (int i = 0; i < world.playerEntities.size(); ++i) {
            final EntityPlayer entityplayer = (EntityPlayer) world.playerEntities.get(i);
            final int j = MathHelper.floor_double(entityplayer.posX / 16.0);
            final int k = MathHelper.floor_double(entityplayer.posZ / 16.0);
            final byte size = 7;
            for (int x = -size; x <= size; ++x) {
                for (int z = -size; z <= size; ++z) {
                    final ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(x + j, z + k);
                    if (!NPCSpawning.eligibleChunksForSpawning.contains(chunkcoordintpair)) {
                        NPCSpawning.eligibleChunksForSpawning.add(chunkcoordintpair);
                    }
                }
            }
        }
        if (countNPCs((World)world) > NPCSpawning.eligibleChunksForSpawning.size() / 16) {
            return;
        }
        final ArrayList<ChunkCoordIntPair> tmp = new ArrayList<ChunkCoordIntPair>(NPCSpawning.eligibleChunksForSpawning);
        Collections.shuffle(tmp);
        for (final ChunkCoordIntPair chunkcoordintpair2 : tmp) {
            final ChunkPosition chunkposition = getChunk((World)world, chunkcoordintpair2.chunkXPos, chunkcoordintpair2.chunkZPos);
            final int j2 = chunkposition.chunkPosX;
            final int k2 = chunkposition.chunkPosY;
            final int l1 = chunkposition.chunkPosZ;
            for (int m = 0; m < 3; ++m) {
                int x2 = j2;
                int y = k2;
                int z2 = l1;
                final byte b1 = 6;
                x2 += world.rand.nextInt(b1) - world.rand.nextInt(b1);
                y += world.rand.nextInt(1) - world.rand.nextInt(1);
                z2 += world.rand.nextInt(b1) - world.rand.nextInt(b1);
                final Block block = world.getBlock(x2, y, z2);
                final String name = world.getBiomeGenForCoords(x2, z2).biomeName;
                final SpawnData data = SpawnController.instance.getRandomSpawnData(name, block.getMaterial() == Material.air);
                if (data != null && canCreatureTypeSpawnAtLocation(data, (World)world, x2, y, z2)) {
                    if (world.getClosestPlayer((double)x2, (double)y, (double)z2, 24.0) == null) {
                        spawnData(data, (World)world, x2, y, z2);
                    }
                }
            }
        }
    }
    
    public static int countNPCs(final World world) {
        int count = 0;
        final List<Entity> list = (List<Entity>)world.loadedEntityList;
        for (final Entity entity : list) {
            if (entity instanceof EntityNPCInterface) {
                ++count;
            }
        }
        return count;
    }
    
    protected static ChunkPosition getChunk(final World world, final int x, final int z) {
        final Chunk chunk = world.getChunkFromChunkCoords(x, z);
        final int k = x * 16 + world.rand.nextInt(16);
        final int l = z * 16 + world.rand.nextInt(16);
        final int i1 = world.rand.nextInt((chunk == null) ? world.getActualHeight() : (chunk.getTopFilledSegment() + 16 - 1));
        return new ChunkPosition(k, i1, l);
    }
    
    public static void performWorldGenSpawning(final World world, final int x, final int z, final Random rand) {
        final BiomeGenBase biome = world.getBiomeGenForCoords(x + 8, z + 8);
        while (rand.nextFloat() < biome.getSpawningChance()) {
            final SpawnData data = SpawnController.instance.getRandomSpawnData(biome.biomeName, true);
            if (data == null) {
                continue;
            }
            final int size = 16;
            int j1 = x + rand.nextInt(size);
            int k1 = z + rand.nextInt(size);
            final int l1 = j1;
            final int i2 = k1;
            for (int k2 = 0; k2 < 4; ++k2) {
                final int l2 = world.getTopSolidOrLiquidBlock(j1, k1);
                if (!canCreatureTypeSpawnAtLocation(data, world, j1, l2, k1)) {
                    for (j1 += rand.nextInt(5) - rand.nextInt(5), k1 += rand.nextInt(5) - rand.nextInt(5); j1 < x || j1 >= x + size || k1 < z || k1 >= z + size; j1 = l1 + rand.nextInt(5) - rand.nextInt(5), k1 = i2 + rand.nextInt(5) - rand.nextInt(5)) {}
                }
                else if (spawnData(data, world, j1, l2, k1)) {
                    break;
                }
            }
        }
    }
    
    private static boolean spawnData(final SpawnData data, final World world, final int x, final int y, final int z) {
        EntityLiving entityliving;
        try {
            final Entity entity = EntityList.createEntityFromNBT(data.compound1, world);
            if (entity == null || !(entity instanceof EntityLiving)) {
                return false;
            }
            entityliving = (EntityLiving)entity;
            if (entity instanceof EntityCustomNpc) {
                final EntityCustomNpc npc = (EntityCustomNpc)entity;
                npc.stats.spawnCycle = 3;
                npc.ai.returnToStart = false;
                npc.ai.startPos = new int[] { x, y, z };
            }
            entity.setLocationAndAngles(x + 0.5, (double)y, z + 0.5, world.rand.nextFloat() * 360.0f, 0.0f);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        final Event.Result canSpawn = ForgeEventFactory.canEntitySpawn(entityliving, world, x + 0.5f, (float)y, z + 0.5f);
        if (canSpawn == Event.Result.DENY || (canSpawn == Event.Result.DEFAULT && !entityliving.getCanSpawnHere())) {
            return false;
        }
        world.spawnEntityInWorld((Entity)entityliving);
        return true;
    }
    
    public static boolean canCreatureTypeSpawnAtLocation(final SpawnData data, final World world, final int x, final int y, final int z) {
        if (data.liquid) {
            return world.getBlock(x, y, z).getMaterial().isLiquid() && world.getBlock(x, y - 1, z).getMaterial().isLiquid() && !world.getBlock(x, y + 1, z).isNormalCube();
        }
        if (!World.doesBlockHaveSolidTopSurface((IBlockAccess)world, x, y - 1, z)) {
            return false;
        }
        final Block block = world.getBlock(x, y - 1, z);
        final boolean spawnBlock = block.canCreatureSpawn(EnumCreatureType.creature, (IBlockAccess)world, x, y - 1, z);
        return spawnBlock && !world.getBlock(x, y, z).isNormalCube() && !world.getBlock(x, y, z).getMaterial().isLiquid() && !world.getBlock(x, y + 1, z).isNormalCube();
    }
    
    static {
        NPCSpawning.eligibleChunksForSpawning = Sets.newHashSet();
    }
}
