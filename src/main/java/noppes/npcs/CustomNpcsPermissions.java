// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayerMP;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import java.lang.reflect.Method;

public class CustomNpcsPermissions
{
    public static final Permission NPC_DELETE;
    public static final Permission NPC_CREATE;
    public static final Permission NPC_GUI;
    public static final Permission NPC_FREEZE;
    public static final Permission NPC_RESET;
    public static final Permission NPC_AI;
    public static final Permission NPC_ADVANCED;
    public static final Permission NPC_DISPLAY;
    public static final Permission NPC_INVENTORY;
    public static final Permission NPC_STATS;
    public static final Permission NPC_CLONE;
    public static final Permission GLOBAL_LINKED;
    public static final Permission GLOBAL_PLAYERDATA;
    public static final Permission GLOBAL_BANK;
    public static final Permission GLOBAL_DIALOG;
    public static final Permission GLOBAL_QUEST;
    public static final Permission GLOBAL_FACTION;
    public static final Permission GLOBAL_TRANSPORT;
    public static final Permission GLOBAL_RECIPE;
    public static final Permission GLOBAL_NATURALSPAWN;
    public static final Permission SPAWNER_MOB;
    public static final Permission SPAWNER_CREATE;
    public static final Permission TOOL_MOUNTER;
    public static final Permission TOOL_PATHER;
    public static final Permission TOOL_SCRIPTER;
    public static final Permission EDIT_VILLAGER;
    public static final Permission EDIT_BLOCKS;
    public static final Permission SOULSTONE_ALL;
    public static CustomNpcsPermissions Instance;
    private Class<?> bukkit;
    private Method getPlayer;
    private Method hasPermission;
    
    public CustomNpcsPermissions() {
        CustomNpcsPermissions.Instance = this;
        try {
            this.bukkit = Class.forName("org.bukkit.Bukkit");
            this.getPlayer = this.bukkit.getMethod("getPlayer", String.class);
            this.hasPermission = Class.forName("org.bukkit.entity.Player").getMethod("hasPermission", String.class);
            LogManager.getLogger((Class)CustomNpcs.class).info("Bukkit permissions enabled");
            LogManager.getLogger((Class)CustomNpcs.class).info("Permissions available:");
            //Collections.sort(Permission.permissions, (Comparator<? super Object>)String.CASE_INSENSITIVE_ORDER);
            for (final String p : Permission.permissions) {
                LogManager.getLogger((Class)CustomNpcs.class).info(p);
            }
        }
        catch (ClassNotFoundException e3) {}
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }
    
    public static boolean hasPermission(final EntityPlayer player, final Permission permission) {
        return CustomNpcsPermissions.Instance.bukkit == null || CustomNpcsPermissions.Instance.bukkitPermission(player.getCommandSenderName(), permission.name);
    }
    
    private boolean bukkitPermission(final String username, final String permission) {
        try {
            final Object player = this.getPlayer.invoke(null, username);
            return (Boolean) this.hasPermission.invoke(player, permission);
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        return false;
    }
    
    public static boolean hasPermissionString(final EntityPlayerMP player, final String permission) {
        return CustomNpcsPermissions.Instance.bukkit == null || CustomNpcsPermissions.Instance.bukkitPermission(player.getCommandSenderName(), permission);
    }
    
    public static boolean enabled() {
        return CustomNpcsPermissions.Instance.bukkit != null;
    }
    
    static {
        NPC_DELETE = new Permission("customnpcs.npc.delete");
        NPC_CREATE = new Permission("customnpcs.npc.create");
        NPC_GUI = new Permission("customnpcs.npc.gui");
        NPC_FREEZE = new Permission("customnpcs.npc.freeze");
        NPC_RESET = new Permission("customnpcs.npc.reset");
        NPC_AI = new Permission("customnpcs.npc.ai");
        NPC_ADVANCED = new Permission("customnpcs.npc.advanced");
        NPC_DISPLAY = new Permission("customnpcs.npc.display");
        NPC_INVENTORY = new Permission("customnpcs.npc.inventory");
        NPC_STATS = new Permission("customnpcs.npc.stats");
        NPC_CLONE = new Permission("customnpcs.npc.clone");
        GLOBAL_LINKED = new Permission("customnpcs.global.linked");
        GLOBAL_PLAYERDATA = new Permission("customnpcs.global.playerdata");
        GLOBAL_BANK = new Permission("customnpcs.global.bank");
        GLOBAL_DIALOG = new Permission("customnpcs.global.dialog");
        GLOBAL_QUEST = new Permission("customnpcs.global.quest");
        GLOBAL_FACTION = new Permission("customnpcs.global.faction");
        GLOBAL_TRANSPORT = new Permission("customnpcs.global.transport");
        GLOBAL_RECIPE = new Permission("customnpcs.global.recipe");
        GLOBAL_NATURALSPAWN = new Permission("customnpcs.global.naturalspawn");
        SPAWNER_MOB = new Permission("customnpcs.spawner.mob");
        SPAWNER_CREATE = new Permission("customnpcs.spawner.create");
        TOOL_MOUNTER = new Permission("customnpcs.tool.mounter");
        TOOL_PATHER = new Permission("customnpcs.tool.pather");
        TOOL_SCRIPTER = new Permission("customnpcs.tool.scripter");
        EDIT_VILLAGER = new Permission("customnpcs.edit.villager");
        EDIT_BLOCKS = new Permission("customnpcs.edit.blocks");
        SOULSTONE_ALL = new Permission("customnpcs.soulstone.all");
    }
    
    public static class Permission
    {
        private static final List<String> permissions;
        public String name;
        
        public Permission(final String name) {
            this.name = name;
            if (!Permission.permissions.contains(name)) {
                Permission.permissions.add(name);
            }
        }
        
        static {
            permissions = new ArrayList<String>();
        }
    }
}
