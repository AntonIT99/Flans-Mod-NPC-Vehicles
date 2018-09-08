// 
// Decompiled by Procyon v0.5.30
// 

package foxz.command;

import java.util.LinkedHashMap;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityHorse;
import foxz.commandhelper.permissions.PlayerOnly;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityGhast;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.List;
import foxz.commandhelper.permissions.ParamCheck;
import foxz.commandhelper.permissions.OpOnly;
import foxz.commandhelper.annotations.SubCommand;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.controllers.PlayerData;
import java.util.Arrays;
import noppes.npcs.controllers.FactionController;
import java.util.Iterator;
import java.util.HashMap;
import net.minecraft.entity.EntityList;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.EntityLivingBase;
import java.util.Map;
import foxz.commandhelper.annotations.Command;
import foxz.commandhelper.ChMcLogger;

@Command(name = "noppes", desc = "noppes root command", sub = { CmdClone.class, CmdScript.class, CmdQuest.class, CmdDialog.class, CmdConfig.class })
public class CmdNoppes extends ChMcLogger
{
    public CmdFaction cmdfaction;
    public CmdNpc cmdnpc;
    public static Map<String, Class<?>> SlayMap;
    
    public CmdNoppes(final Object sender) {
        super(sender);
        this.cmdfaction = new CmdFaction(this.ctorParm);
        this.cmdnpc = new CmdNpc(this.ctorParm);
        CmdNoppes.SlayMap.clear();
        CmdNoppes.SlayMap.put("all", EntityLivingBase.class);
        CmdNoppes.SlayMap.put("mobs", EntityMob.class);
        CmdNoppes.SlayMap.put("animals", EntityAnimal.class);
        CmdNoppes.SlayMap.put("items", EntityItem.class);
        CmdNoppes.SlayMap.put("xporbs", EntityXPOrb.class);
        CmdNoppes.SlayMap.put("npcs", EntityNPCInterface.class);
        final HashMap<String, Class<?>> list = new HashMap<String, Class<?>>(EntityList.stringToClassMapping);
        for (final String name : list.keySet()) {
            final Class<?> cls = list.get(name);
            if (EntityNPCInterface.class.isAssignableFrom(cls)) {
                continue;
            }
            if (!EntityLivingBase.class.isAssignableFrom(cls)) {
                continue;
            }
            CmdNoppes.SlayMap.put(name.toLowerCase(), list.get(name));
        }
        CmdNoppes.SlayMap.remove("monster");
        CmdNoppes.SlayMap.remove("mob");
    }
    
    @SubCommand(name = "faction", desc = "Faction operations", usage = "<player> <faction> <command>", permissions = { OpOnly.class, ParamCheck.class })
    public Boolean faction(String[] args) {
        final String playername = args[0];
        final String factionname = args[1];
        this.cmdfaction.data = this.getPlayersData(playername);
        if (this.cmdfaction.data.isEmpty()) {
            this.sendmessage(String.format("Unknow player '%s'", playername));
            return false;
        }
        try {
            this.cmdfaction.selectedFaction = FactionController.getInstance().getFaction(Integer.parseInt(factionname));
        }
        catch (NumberFormatException e) {
            this.cmdfaction.selectedFaction = FactionController.getInstance().getFactionFromName(factionname);
        }
        if (this.cmdfaction.selectedFaction == null) {
            this.sendmessage(String.format("Unknow facion '%s", factionname));
            return false;
        }
        args = Arrays.copyOfRange(args, 2, args.length);
        this.cmdfaction.processCommand(this.pcParam, args);
        for (final PlayerData playerdata : this.cmdfaction.data) {
            playerdata.saveNBTData(null);
        }
        return true;
    }
    
    @SubCommand(desc = "NPC manipulations", usage = "<npc> <command>", permissions = { OpOnly.class, ParamCheck.class })
    public boolean npc(String[] args) {
        final String npcname = args[0].replace("%", " ");
        args = Arrays.copyOfRange(args, 1, args.length);
        if (args[0].equalsIgnoreCase("create")) {
            this.cmdnpc.processCommand(this.pcParam, new String[] { args[0], npcname });
            return true;
        }
        final int x = this.pcParam.getPlayerCoordinates().posX;
        final int y = this.pcParam.getPlayerCoordinates().posY;
        final int z = this.pcParam.getPlayerCoordinates().posZ;
        final List<EntityNPCInterface> list = this.getNearbeEntityFromPlayer((Class<? extends EntityNPCInterface>)EntityNPCInterface.class, this.pcParam.getEntityWorld(), x, y, z, 80);
        EntityNPCInterface closest = null;
        for (final EntityNPCInterface npc : list) {
            final String name = npc.display.name.replace(" ", "_");
            if (name.equalsIgnoreCase(npcname) && (closest == null || closest.getDistanceSq((double)x, (double)y, (double)z) > npc.getDistanceSq((double)x, (double)y, (double)z))) {
                closest = npc;
            }
        }
        if (closest != null) {
            this.cmdnpc.selectedNpc = closest;
            this.cmdnpc.processCommand(this.pcParam, args);
            this.cmdnpc.selectedNpc = null;
        }
        else {
            this.sendmessage(String.format("NPC '%s' was not found", npcname));
        }
        return true;
    }
    
    @SubCommand(name = "slay", desc = "Kills given entity within range. Also has all, mobs, animal options. Can have multiple types", usage = "<type>.. [range]", permissions = { PlayerOnly.class, OpOnly.class, ParamCheck.class })
    public Boolean slay(final String[] args) {
        final EntityPlayerMP player = (EntityPlayerMP)this.pcParam;
        final ArrayList<Class<?>> toDelete = new ArrayList<Class<?>>();
        boolean deleteNPCs = false;
        for (String delete : args) {
            delete = delete.toLowerCase();
            final Class<?> cls = CmdNoppes.SlayMap.get(delete);
            if (cls != null) {
                toDelete.add(cls);
            }
            if (delete.equals("mobs")) {
                toDelete.add(EntityGhast.class);
                toDelete.add(EntityDragon.class);
            }
            if (delete.equals("npcs")) {
                deleteNPCs = true;
            }
        }
        int count = 0;
        int range = 120;
        try {
            range = Integer.parseInt(args[args.length - 1]);
        }
        catch (NumberFormatException ex) {}
        final AxisAlignedBB box = player.boundingBox.expand((double)range, (double)range, (double)range);
        List<Entity> list = (List<Entity>)player.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, box);
        for (final Entity entity : list) {
            if (entity instanceof EntityPlayer) {
                continue;
            }
            if (entity instanceof EntityTameable && ((EntityTameable)entity).isTamed()) {
                continue;
            }
            if (entity instanceof EntityNPCInterface && !deleteNPCs) {
                continue;
            }
            if (!this.delete(entity, toDelete)) {
                continue;
            }
            ++count;
        }
        if (toDelete.contains(EntityXPOrb.class)) {
            list = (List<Entity>)player.worldObj.getEntitiesWithinAABB((Class)EntityXPOrb.class, box);
            for (final Entity entity : list) {
                entity.isDead = true;
                ++count;
            }
        }
        if (toDelete.contains(EntityItem.class)) {
            list = (List<Entity>)player.worldObj.getEntitiesWithinAABB((Class)EntityItem.class, box);
            for (final Entity entity : list) {
                entity.isDead = true;
                ++count;
            }
        }
        player.addChatMessage((IChatComponent)new ChatComponentTranslation(count + " entities deleted", new Object[0]));
        return true;
    }
    
    private boolean delete(final Entity entity, final ArrayList<Class<?>> toDelete) {
        for (final Class<?> delete : toDelete) {
            if (delete == EntityAnimal.class && entity instanceof EntityHorse) {
                continue;
            }
            if (delete.isAssignableFrom(entity.getClass())) {
                return entity.isDead = true;
            }
        }
        return false;
    }
    
    @Override
    public List addTabCompletion(final ICommandSender par1, final String[] args) {
        if (args[0].equalsIgnoreCase("slay")) {
            return CommandBase.getListOfStringsMatchingLastWord(args, (String[])CmdNoppes.SlayMap.keySet().toArray(new String[CmdNoppes.SlayMap.size()]));
        }
        if (args[0].equalsIgnoreCase("npc") && args.length == 3) {
            return this.cmdnpc.addTabCompletion(par1, Arrays.copyOfRange(args, 1, args.length));
        }
        if (args[0].equalsIgnoreCase("faction") && args.length == 4) {
            return CommandBase.getListOfStringsMatchingLastWord(args, new String[] { "add", "subtract", "set", "reset", "drop", "create" });
        }
        return super.addTabCompletion(par1, args);
    }
    
    static {
        CmdNoppes.SlayMap = new LinkedHashMap<String, Class<?>>();
    }
}
