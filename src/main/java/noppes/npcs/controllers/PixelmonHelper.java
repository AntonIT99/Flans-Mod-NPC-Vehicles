// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.lang.reflect.Array;
import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.roles.JobSpawner;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import noppes.npcs.LogWriter;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.Loader;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.minecraft.client.entity.EntityPlayerSP;

public class PixelmonHelper
{
    public static boolean Enabled;
    private static Object PokeballManager;
    private static Method getPlayerStorage;
    private static Object ComputerManager;
    private static Method getPlayerComputerStorage;
    private static Constructor attackByID;
    private static Constructor attackByName;
    private static Field baseAttack;
    private static Field getAttackID;
    private static Field getAttackName;
    private static Method getPixelmonModel;
    
    public static void load() {
        if (!(PixelmonHelper.Enabled = Loader.isModLoaded("pixelmon"))) {
            return;
        }
        try {
            Class c = Class.forName("com.pixelmonmod.pixelmon.storage.PixelmonStorage");
            PixelmonHelper.PokeballManager = c.getField("PokeballManager").get(null);
            PixelmonHelper.ComputerManager = c.getField("ComputerManager").get(null);
            PixelmonHelper.getPlayerStorage = PixelmonHelper.PokeballManager.getClass().getMethod("getPlayerStorage", EntityPlayerMP.class);
            PixelmonHelper.getPlayerComputerStorage = PixelmonHelper.ComputerManager.getClass().getMethod("getPlayerStorage", EntityPlayerMP.class);
            c = Class.forName("com.pixelmonmod.pixelmon.battles.attacks.Attack");
            PixelmonHelper.attackByID = c.getConstructor(Integer.TYPE);
            PixelmonHelper.attackByName = c.getConstructor(String.class);
            PixelmonHelper.baseAttack = c.getField("baseAttack");
            c = Class.forName("com.pixelmonmod.pixelmon.battles.attacks.AttackBase");
            PixelmonHelper.getAttackID = c.getField("attackIndex");
            PixelmonHelper.getAttackName = c.getDeclaredField("attackName");
            c = Class.forName("com.pixelmonmod.pixelmon.entities.pixelmon.Entity2HasModel");
            PixelmonHelper.getPixelmonModel = c.getMethod("getModel", (Class[])new Class[0]);
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public static List<String> getPixelmonList() {
        final List<String> list = new ArrayList<String>();
        if (!PixelmonHelper.Enabled) {
            return list;
        }
        try {
            final Class c = Class.forName("com.pixelmonmod.pixelmon.enums.EnumPokemon");
            final Object[] enumConstants;
            final Object[] array = enumConstants = c.getEnumConstants();
            for (final Object ob : enumConstants) {
                list.add(ob.toString());
            }
        }
        catch (Exception e) {
            LogManager.getLogger().error("getPixelmonList", (Throwable)e);
        }
        return list;
    }
    
    public static boolean isPixelmon(final Entity entity) {
        if (!PixelmonHelper.Enabled) {
            return false;
        }
        final String s = EntityList.getEntityString(entity);
        return s != null && s.equals("pixelmon.Pixelmon");
    }
    
    public static void setName(final EntityLivingBase entity, final String name) {
        if (!PixelmonHelper.Enabled || !isPixelmon((Entity)entity)) {
            return;
        }
        try {
            Method m = entity.getClass().getMethod("init", String.class);
            m.invoke(entity, name);
            final Class c = Class.forName("com.pixelmonmod.pixelmon.entities.pixelmon.Entity2HasModel");
            m = c.getDeclaredMethod("loadModel", (Class[])new Class[0]);
            m.setAccessible(true);
            m.invoke(entity, new Object[0]);
        }
        catch (Exception e) {
            LogManager.getLogger().error("setName", (Throwable)e);
        }
    }
    
    public static String getName(final EntityLivingBase entity) {
        if (!PixelmonHelper.Enabled || !isPixelmon((Entity)entity)) {
            return "";
        }
        try {
            final Method m = entity.getClass().getMethod("getName", (Class<?>[])new Class[0]);
            return m.invoke(entity, new Object[0]).toString();
        }
        catch (Exception e) {
            LogManager.getLogger().error("getName", (Throwable)e);
            return "";
        }
    }
    
    public static Object getModel(final EntityLivingBase entity) {
        try {
            return PixelmonHelper.getPixelmonModel.invoke(entity, new Object[0]);
        }
        catch (Exception e) {
            LogManager.getLogger().error("getModel", (Throwable)e);
            return null;
        }
    }
    
    public static void debug(final EntityLivingBase entity) {
        if (!PixelmonHelper.Enabled || !isPixelmon((Entity)entity)) {
            return;
        }
        try {
            final Method m = entity.getClass().getMethod("getModel", (Class<?>[])new Class[0]);
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText((String)m.invoke(entity, new Object[0])));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean isTrainer(final EntityLivingBase entity) {
        if (!PixelmonHelper.Enabled) {
            return false;
        }
        final String s = EntityList.getEntityString((Entity)entity);
        return s != null && s.equals("pixelmon.Trainer");
    }
    
    public static boolean isBattling(final EntityPlayerMP player) {
        if (!PixelmonHelper.Enabled) {
            return false;
        }
        try {
            final Class c = Class.forName("com.pixelmonmod.pixelmon.battles.BattleRegistry");
            final Method m = c.getMethod("getBattle", EntityPlayer.class);
            return m.invoke(null, player) == null;
        }
        catch (Exception e) {
            LogManager.getLogger().error("canBattle", (Throwable)e);
            return false;
        }
    }
    
    public static boolean isBattling(final EntityLivingBase trainer) {
        if (!PixelmonHelper.Enabled || !isTrainer(trainer)) {
            return false;
        }
        try {
            final Field f = trainer.getClass().getField("battleController");
            return f.get(trainer) != null;
        }
        catch (Exception e) {
            LogManager.getLogger().error("canBattle", (Throwable)e);
            return false;
        }
    }
    
    public static boolean canBattle(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (!PixelmonHelper.Enabled || npc.advanced.job != EnumJobType.Spawner || isBattling(player)) {
            return false;
        }
        try {
            final JobSpawner spawner = (JobSpawner)npc.jobInterface;
            if (spawner.isOnCooldown(player.getCommandSenderName())) {
                return false;
            }
            final Object ob = PixelmonHelper.getPlayerStorage.invoke(PixelmonHelper.PokeballManager, player);
            final Method m = ob.getClass().getMethod("countAblePokemon", (Class<?>[])new Class[0]);
            return (Integer)m.invoke(ob, new Object[0]) != 0;
        }
        catch (Exception e) {
            LogManager.getLogger().error("canBattle", (Throwable)e);
            return false;
        }
    }
    
    public static EntityTameable pixelmonFromNBT(final NBTTagCompound compound, final EntityPlayer player) {
        if (!PixelmonHelper.Enabled) {
            return null;
        }
        try {
            final Object ob = PixelmonHelper.getPlayerStorage.invoke(PixelmonHelper.PokeballManager, player);
            return (EntityTameable)ob.getClass().getMethod("sendOut", NBTTagCompound.class, World.class).invoke(ob, compound, player);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static NBTTagCompound getPartySlot(final int i, final EntityPlayer player) {
        if (!PixelmonHelper.Enabled) {
            return null;
        }
        try {
            final Object ob = PixelmonHelper.getPlayerStorage.invoke(PixelmonHelper.PokeballManager, player);
            final NBTTagCompound[] party = (NBTTagCompound[])ob.getClass().getFields()[0].get(ob);
            return party[i];
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean startBattle(final EntityPlayerMP player, final EntityLivingBase trainer) {
        if (!PixelmonHelper.Enabled) {
            return false;
        }
        try {
            final Object ob = PixelmonHelper.getPlayerStorage.invoke(PixelmonHelper.PokeballManager, player);
            Class c = ob.getClass();
            Method m = c.getMethod("getFirstAblePokemon", World.class);
            final Entity pixelmon = (Entity)m.invoke(ob, player.worldObj);
            Class cEntity = Class.forName("com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon");
            m = c.getMethod("EntityAlreadyExists", cEntity);
            if (!(Boolean)m.invoke(ob, pixelmon)) {
                m = cEntity.getMethod("releaseFromPokeball", (Class[])new Class[0]);
                pixelmon.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0f);
            }
            c = Class.forName("com.pixelmonmod.pixelmon.battles.controller.participants.TrainerParticipant");
            final Object parTrainer = c.getConstructor(trainer.getClass(), EntityPlayer.class, Integer.TYPE).newInstance(trainer, player, 1);
            final Object[] pixelmonArray = (Object[])Array.newInstance(cEntity, 1);
            pixelmonArray[0] = pixelmon;
            c = Class.forName("com.pixelmonmod.pixelmon.battles.controller.participants.PlayerParticipant");
            final Object parPlayer = c.getConstructor(EntityPlayerMP.class, pixelmonArray.getClass()).newInstance(player, pixelmonArray);
            cEntity = Class.forName("com.pixelmonmod.pixelmon.entities.pixelmon.Entity6CanBattle");
            c = Class.forName("com.pixelmonmod.pixelmon.battles.controller.participants.BattleParticipant");
            m = cEntity.getMethod("StartBattle", c, c);
            m.invoke(pixelmon, parTrainer, parPlayer);
            return true;
        }
        catch (Exception e) {
            LogManager.getLogger().error("startBattle", (Throwable)e);
            return false;
        }
    }
    
    public static int countPCPixelmon(final EntityPlayerMP player) {
        try {
            final Object ob = PixelmonHelper.getPlayerComputerStorage.invoke(player, new Object[0]);
            return (Integer)ob.getClass().getMethod("count", (Class<?>[])new Class[0]).invoke(ob, new Object[0]);
        }
        catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public static String getAttackName(final int id) {
        try {
            final Object ob = PixelmonHelper.attackByID.newInstance(id);
            if (ob == null) {
                return null;
            }
            return PixelmonHelper.getAttackName.get(PixelmonHelper.baseAttack.get(ob)) + "";
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static int getAttackID(final String name) {
        try {
            final Object ob = PixelmonHelper.attackByName.newInstance(name);
            if (ob == null) {
                return -1;
            }
            return PixelmonHelper.getAttackName.getInt(PixelmonHelper.baseAttack.get(ob));
        }
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    static {
        PixelmonHelper.Enabled = false;
        PixelmonHelper.PokeballManager = null;
        PixelmonHelper.getPlayerStorage = null;
        PixelmonHelper.ComputerManager = null;
        PixelmonHelper.getPlayerComputerStorage = null;
        PixelmonHelper.attackByID = null;
        PixelmonHelper.attackByName = null;
        PixelmonHelper.baseAttack = null;
        PixelmonHelper.getAttackID = null;
        PixelmonHelper.getAttackName = null;
        PixelmonHelper.getPixelmonModel = null;
    }
}
