// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.server.MinecraftServer;
import java.util.Iterator;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.util.NBTJsonUtil;
import noppes.npcs.LogWriter;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.CustomNpcs;
import java.io.File;

public class PlayerDataController
{
    public static PlayerDataController instance;
    
    public PlayerDataController() {
        PlayerDataController.instance = this;
    }
    
    public File getSaveDir() {
        try {
            final File file = new File(CustomNpcs.getWorldSaveDirectory(), "playerdata");
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public NBTTagCompound loadPlayerDataOld(final String player) {
        final File saveDir = this.getSaveDir();
        String filename = player;
        if (filename.isEmpty()) {
            filename = "noplayername";
        }
        filename += ".dat";
        try {
            File file = new File(saveDir, filename);
            if (file.exists()) {
                final NBTTagCompound comp = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
                file.delete();
                file = new File(saveDir, filename + "_old");
                if (file.exists()) {
                    file.delete();
                }
                return comp;
            }
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
        try {
            final File file = new File(saveDir, filename + "_old");
            if (file.exists()) {
                return CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
            }
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
        return new NBTTagCompound();
    }
    
    public NBTTagCompound loadPlayerData(final String player) {
        final File saveDir = this.getSaveDir();
        String filename = player;
        if (filename.isEmpty()) {
            filename = "noplayername";
        }
        filename += ".json";
        try {
            final File file = new File(saveDir, filename);
            if (file.exists()) {
                return NBTJsonUtil.LoadFile(file);
            }
        }
        catch (Exception e) {
            LogWriter.error("Error loading: " + filename, e);
        }
        return new NBTTagCompound();
    }
    
    public void savePlayerData(final PlayerData data) {
        final NBTTagCompound compound = data.getNBT();
        final String filename = data.uuid + ".json";
        try {
            final File saveDir = this.getSaveDir();
            final File file = new File(saveDir, filename + "_new");
            final File file2 = new File(saveDir, filename);
            NBTJsonUtil.SaveFile(file, compound);
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public PlayerBankData getBankData(final EntityPlayer player, final int bankId) {
        final Bank bank = BankController.getInstance().getBank(bankId);
        final PlayerBankData data = this.getPlayerData(player).bankData;
        if (!data.hasBank(bank.id)) {
            data.loadNew(bank.id);
        }
        return data;
    }
    
    public PlayerData getPlayerData(final EntityPlayer player) {
        PlayerData data = (PlayerData)player.getExtendedProperties("CustomNpcsData");
        if (data == null) {
            player.registerExtendedProperties("CustomNpcsData", (IExtendedEntityProperties)(data = new PlayerData()));
            data.player = player;
            data.loadNBTData(null);
        }
        data.player = player;
        return data;
    }
    
    public String hasPlayer(final String username) {
        for (final String name : this.getUsernameData().keySet()) {
            if (name.equalsIgnoreCase(username)) {
                return name;
            }
        }
        return "";
    }
    
    public PlayerData getDataFromUsername(final String username) {
        final EntityPlayer player = (EntityPlayer)MinecraftServer.getServer().getConfigurationManager().func_152612_a(username);
        PlayerData data = null;
        if (player == null) {
            final Map<String, NBTTagCompound> map = this.getUsernameData();
            for (final String name : map.keySet()) {
                if (name.equalsIgnoreCase(username)) {
                    data = new PlayerData();
                    data.setNBT(map.get(name));
                    break;
                }
            }
        }
        else {
            data = this.getPlayerData(player);
        }
        return data;
    }
    
    public void addPlayerMessage(final String username, final PlayerMail mail) {
        mail.time = System.currentTimeMillis();
        final EntityPlayer player = (EntityPlayer)MinecraftServer.getServer().getConfigurationManager().func_152612_a(username);
        final PlayerData data = this.getDataFromUsername(username);
        data.mailData.playermail.add(mail.copy());
        this.savePlayerData(data);
    }
    
    public Map<String, NBTTagCompound> getUsernameData() {
        final Map<String, NBTTagCompound> map = new HashMap<String, NBTTagCompound>();
        for (final File file : this.getSaveDir().listFiles()) {
            if (!file.isDirectory()) {
                if (file.getName().endsWith(".json")) {
                    try {
                        final NBTTagCompound compound = NBTJsonUtil.LoadFile(file);
                        if (compound.hasKey("PlayerName")) {
                            map.put(compound.getString("PlayerName"), compound);
                        }
                    }
                    catch (Exception e) {
                        LogWriter.error("Error loading: " + file.getAbsolutePath(), e);
                    }
                }
            }
        }
        return map;
    }
    
    public boolean hasMail(final EntityPlayer player) {
        return this.getPlayerData(player).mailData.hasMail();
    }
}
