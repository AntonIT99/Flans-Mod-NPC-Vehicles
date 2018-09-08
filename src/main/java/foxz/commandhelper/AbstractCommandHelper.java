// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.command.PlayerSelector;
import noppes.npcs.controllers.PlayerData;
import net.minecraft.command.CommandBase;
import java.util.ArrayList;
import java.util.List;
import foxz.commandhelper.permissions.AbstractPermission;
import java.util.Arrays;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import foxz.commandhelper.annotations.SubCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import foxz.commandhelper.annotations.Command;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.command.ICommandSender;

public abstract class AbstractCommandHelper extends CommandHelper
{
    public Object ctorParm;
    public ICommandSender pcParam;
    public Object xParam;
    public AbstractCommandHelper parentCmdHelper;
    public AbstractCommandHelper rootCmdHelper;
    public Map<String, CommandHelper> commands;
    public Helper currentHelper;
    
    public AbstractCommandHelper(final Object sender) {
        this.commands = new HashMap<String, CommandHelper>();
        this.ctorParm = sender;
        this.ctor();
    }
    
    public void ctor() {
        this.commandHelper.name = this.getClass().getAnnotation(Command.class).name();
        this.commandHelper.usage = this.getClass().getAnnotation(Command.class).usage();
        this.commandHelper.desc = this.getClass().getAnnotation(Command.class).desc();
        for (final Class c : this.getClass().getAnnotation(Command.class).sub()) {
            try {
                final String name = ((SubCommand) c.getAnnotation(Command.class)).name().toUpperCase();
                final Constructor<AbstractCommandHelper> ctor = c.getConstructor(Object.class);
                ctor.setAccessible(true);
                final AbstractCommandHelper sc = ctor.newInstance(this.ctorParm);
                this.commands.put(name, sc);
            }
            catch (Exception ex) {
                Logger.getLogger(AbstractCommandHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (final Method m : this.getClass().getDeclaredMethods()) {
            final SubCommand sc2 = m.getAnnotation(SubCommand.class);
            if (sc2 != null) {
                String name2 = sc2.name();
                if (name2.equals("")) {
                    name2 = m.getName();
                }
                this.commands.put(name2.toUpperCase(), new MethodSubCmd(this, m));
            }
        }
    }
    
    public abstract void help(final String p0, final String p1, final String p2);
    
    public abstract void cmdError(final String p0);
    
    public abstract void error(final String p0);
    
    public void allHelp() {
        for (final CommandHelper cur : this.commands.values()) {
            this.help(cur.commandHelper.name, cur.commandHelper.desc, "");
        }
    }
    
    public Boolean processCommand(final ICommandSender param, String[] args) {
        this.pcParam = param;
        if (this.parentCmdHelper == null) {
            this.rootCmdHelper = this;
        }
        if (args.length == 0) {
            this.allHelp();
            return true;
        }
        final String cmd = args[0].toUpperCase();
        args = Arrays.copyOfRange(args, 1, args.length);
        if ((cmd.equals("HELP") || args.length == 0) && this.doHelp(param, args, cmd)) {
            return true;
        }
        final CommandHelper ch = this.commands.get(cmd);
        if (ch == null) {
            this.cmdError(cmd);
            return false;
        }
        if (ch instanceof AbstractCommandHelper) {
            final AbstractCommandHelper f = (AbstractCommandHelper)ch;
            f.parentCmdHelper = this;
            f.rootCmdHelper = this.rootCmdHelper;
            return f.processCommand(param, args);
        }
        /*if (ch instanceof MethodSubCmd) {
            final MethodSubCmd m = (MethodSubCmd)ch;
            m.method.setAccessible(true);
            this.currentHelper = ch.commandHelper;
            try {
                for (final AbstractPermission p : m.permissions) {
                    if (!p.delegate(this, args)) {
                        this.error(p.errorMsg());
                        return false;
                    }
                }
                return (Boolean)m.method.invoke(this, args);
            }
            catch (Exception ex) {
                Logger.getLogger(AbstractCommandHelper.class.getName()).log(Level.SEVERE, m.commandHelper.name, ex);
                return true;
            }
        }*/
        this.cmdError(cmd);
        return false;
    }
    
    private boolean doHelp(final ICommandSender param, final String[] args, String cmd) {
        final boolean isHelp = cmd.equals("HELP");
        if (args.length > 0) {
            cmd = args[0];
        }
        final CommandHelper ch = this.commands.get(cmd.toUpperCase());
        if (ch != null) {
            if (ch.commandHelper.hasEmptyCall && !isHelp) {
                return false;
            }
            if (ch instanceof AbstractCommandHelper) {
                ((AbstractCommandHelper)ch).pcParam = param;
                ((AbstractCommandHelper)ch).allHelp();
            }
            else {
                if (ch instanceof MethodSubCmd && ((MethodSubCmd)ch).commandHelper.usage.isEmpty()) {
                    return false;
                }
                this.help(ch.commandHelper.name, ch.commandHelper.desc, ch.commandHelper.usage);
            }
        }
        else {
            this.allHelp();
        }
        return true;
    }
    
    @Override
    public List addTabCompletion(final ICommandSender par1, String[] args) {
        if (args.length <= 1) {
            final List<String> list = new ArrayList<String>();
            for (final String command : this.commands.keySet()) {
                list.add(command.toLowerCase());
            }
            list.add("help");
            return CommandBase.getListOfStringsMatchingLastWord(args, (String[])list.toArray(new String[list.size()]));
        }
        final CommandHelper ch = this.commands.get(args[0].toUpperCase());
        if (ch == null) {
            return null;
        }
        args = Arrays.copyOfRange(args, 1, args.length);
        this.currentHelper = ch.commandHelper;
        return ch.addTabCompletion(par1, args);
    }
    
    public List<PlayerData> getPlayersData(final String username) {
        final ArrayList<PlayerData> list = new ArrayList<PlayerData>();
        final EntityPlayerMP[] players = PlayerSelector.matchPlayers(this.pcParam, username);
        if (players == null || players.length == 0) {
            final PlayerData data = PlayerDataController.instance.getDataFromUsername(username);
            if (data != null) {
                list.add(data);
            }
        }
        else {
            for (final EntityPlayer player : players) {
                list.add(PlayerDataController.instance.getPlayerData(player));
            }
        }
        return list;
    }
    
    public <T> List<T> getNearbeEntityFromPlayer(final Class<? extends T> cls, final World world, final int x, final int y, final int z, final int range) {
        final AxisAlignedBB bb = AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)(x + 1), (double)(y + 1), (double)(z + 1)).expand((double)range, (double)range, (double)range);
        final List<T> list = (List<T>)world.getEntitiesWithinAABB((Class)cls, bb);
        return list;
    }
    
    protected class MethodSubCmd extends CommandHelper
    {
        public List<AbstractPermission> permissions;
        public Method method;
        
        public MethodSubCmd(final AbstractCommandHelper ch, final Method m) {
            this.permissions = new ArrayList<AbstractPermission>();
            final SubCommand s = m.getAnnotation(SubCommand.class);
            this.commandHelper.name = s.name();
            if (this.commandHelper.name.equals("")) {
                this.commandHelper.name = m.getName();
            }
            this.commandHelper.usage = s.usage();
            this.commandHelper.desc = s.desc();
            this.commandHelper.hasEmptyCall = s.hasEmptyCall();
            this.method = m;
            for (final Class c : s.permissions()) {
                try {
                    final Constructor<AbstractPermission> ctor = c.getDeclaredConstructor((Class<?>[])new Class[0]);
                    ctor.setAccessible(true);
                    final AbstractPermission i = ctor.newInstance(new Object[0]);
                    this.permissions.add(i);
                }
                catch (Exception ex) {
                    Logger.getLogger(AbstractCommandHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        @Override
        public List addTabCompletion(final ICommandSender par1, final String[] args) {
            final String[] np = AbstractCommandHelper.this.currentHelper.usage.split(" ");
            if (np.length < args.length) {
                return null;
            }
            final String parameter = np[args.length - 1];
            if (parameter.equals("<player>")) {
                return CommandBase.getListOfStringsMatchingLastWord(args, MinecraftServer.getServer().getAllUsernames());
            }
            return null;
        }
    }
}
