// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import java.util.HashMap;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.command.ICommandSender;
import noppes.npcs.controllers.ServerCloneController;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTBase;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import noppes.npcs.blocks.tiles.TileBigSign;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.WorldServer;
import java.util.Map;

public class ScriptWorld
{
    private static Map<String, Object> tempData;
    protected WorldServer world;
    
    public ScriptWorld(final WorldServer world) {
        this.world = world;
    }
    
    public long getTime() {
        return this.world.getWorldTime();
    }
    
    public long getTotalTime() {
        return this.world.getTotalWorldTime();
    }
    
    public ScriptItemStack getBlock(final int x, final int y, final int z) {
        final Block block = this.world.getBlock(x, y, z);
        if (block == null || block.isAir((IBlockAccess)this.world, x, y, z)) {
            return null;
        }
        return new ScriptItemStack(new ItemStack(block, 1, this.world.getBlockMetadata(x, y, z)));
    }
    
    public String getSignText(final int x, final int y, final int z) {
        final TileEntity tile = this.world.getTileEntity(x, y, z);
        if (tile instanceof TileBigSign) {
            return ((TileBigSign)tile).getText();
        }
        if (tile instanceof TileEntitySign) {
            final TileEntitySign tileSign = (TileEntitySign)tile;
            String s = tileSign.signText[0] + "\n";
            s = s + tileSign.signText[1] + "\n";
            s = s + tileSign.signText[2] + "\n";
            s += tileSign.signText[3];
            return s;
        }
        return null;
    }
    
    public void setBlock(final int x, final int y, final int z, final ScriptItemStack item) {
        if (item == null) {
            this.removeBlock(x, y, z);
            return;
        }
        final Block block = Block.getBlockFromItem(item.item.getItem());
        if (block == null || block == Blocks.air) {
            return;
        }
        this.world.setBlock(x, y, z, block);
    }
    
    public void removeBlock(final int x, final int y, final int z) {
        this.world.setBlock(x, y, z, Blocks.air);
    }
    
    public ScriptPlayer getPlayer(final String name) {
        final EntityPlayer player = this.world.getPlayerEntityByName(name);
        if (player == null) {
            return null;
        }
        return (ScriptPlayer)ScriptController.Instance.getScriptForEntity((Entity)player);
    }
    
    public void setTime(final long time) {
        this.world.setWorldTime(time);
    }
    
    public boolean isDay() {
        return this.world.getWorldTime() % 24000L < 12000L;
    }
    
    public boolean isRaining() {
        return this.world.getWorldInfo().isRaining();
    }
    
    public void setRaining(final boolean bo) {
        this.world.getWorldInfo().setRaining(bo);
    }
    
    public void thunderStrike(final double x, final double y, final double z) {
        this.world.addWeatherEffect((Entity)new EntityLightningBolt((World)this.world, x, y, z));
    }
    
    public void spawnParticle(final String particle, final double x, final double y, final double z, final double dx, final double dy, final double dz, final double speed, final int count) {
        this.world.func_147487_a(particle, x, y, z, count, dx, dy, dz, speed);
    }
    
    public ScriptItemStack createItem(final String id, final int damage, final int size) {
        final Item item = (Item)Item.itemRegistry.getObject(id);
        if (item == null) {
            return null;
        }
        return new ScriptItemStack(new ItemStack(item, size, damage));
    }
    
    public Object getTempData(final String key) {
        return ScriptWorld.tempData.get(key);
    }
    
    public void setTempData(final String key, final Object value) {
        ScriptWorld.tempData.put(key, value);
    }
    
    public boolean hasTempData(final String key) {
        return ScriptWorld.tempData.containsKey(key);
    }
    
    public void removeTempData(final String key) {
        ScriptWorld.tempData.remove(key);
    }
    
    public void clearTempData() {
        ScriptWorld.tempData.clear();
    }
    
    public Object getStoredData(final String key) {
        final NBTTagCompound compound = ScriptController.Instance.compound;
        if (!compound.hasKey(key)) {
            return null;
        }
        final NBTBase base = compound.getTag(key);
        if (base instanceof NBTBase.NBTPrimitive) {
            return ((NBTBase.NBTPrimitive)base).func_150286_g();
        }
        return ((NBTTagString)base).func_150285_a_();
    }
    
    public void setStoredData(final String key, final Object value) {
        final NBTTagCompound compound = ScriptController.Instance.compound;
        if (value instanceof Number) {
            compound.setDouble(key, ((Number)value).doubleValue());
        }
        else if (value instanceof String) {
            compound.setString(key, (String)value);
        }
        ScriptController.Instance.shouldSave = true;
    }
    
    public boolean hasStoredData(final String key) {
        return ScriptController.Instance.compound.hasKey(key);
    }
    
    public void removeStoredData(final String key) {
        ScriptController.Instance.compound.removeTag(key);
        ScriptController.Instance.shouldSave = true;
    }
    
    public void clearStoredData() {
        ScriptController.Instance.compound = new NBTTagCompound();
        ScriptController.Instance.shouldSave = true;
    }
    
    public void explode(final double x, final double y, final double z, final float range, final boolean fire, final boolean grief) {
        this.world.newExplosion((Entity)null, x, y, z, range, fire, grief);
    }
    
    public ScriptPlayer[] getAllServerPlayers() {
        final List<EntityPlayer> list = (List<EntityPlayer>)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        final ScriptPlayer[] arr = new ScriptPlayer[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            arr[i] = (ScriptPlayer)ScriptController.Instance.getScriptForEntity((Entity)list.get(i));
        }
        return arr;
    }
    
    public String getBiomeName(final int x, final int z) {
        return this.world.getBiomeGenForCoords(x, z).biomeName;
    }
    
    public ScriptEntity spawnClone(final int x, final int y, final int z, final int tab, final String name) {
        final NBTTagCompound compound = ServerCloneController.Instance.getCloneData(null, name, tab);
        if (compound == null) {
            return null;
        }
        final Entity entity = NoppesUtilServer.spawnClone(compound, x, y, z, (World)this.world);
        if (entity == null) {
            return null;
        }
        return ScriptController.Instance.getScriptForEntity(entity);
    }
    
    public ScriptScoreboard getScoreboard() {
        return new ScriptScoreboard();
    }
    
    public World getMCWorld() {
        return (World)this.world;
    }
    
    static {
        ScriptWorld.tempData = new HashMap<String, Object>();
    }
}
