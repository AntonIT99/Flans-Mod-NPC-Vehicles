// 
// Decompiled by Procyon v0.5.30
// 

package foxz.command;

import foxz.commandhelper.permissions.PlayerOnly;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.Arrays;
import noppes.npcs.controllers.ChunkController;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockVine;
import foxz.commandhelper.permissions.OpOnly;
import foxz.commandhelper.annotations.SubCommand;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.Block;
import noppes.npcs.CustomNpcs;
import foxz.commandhelper.annotations.Command;
import foxz.commandhelper.ChMcLogger;

@Command(name = "config", desc = "Some config things you can set ", usage = "")
public class CmdConfig extends ChMcLogger
{
    public CmdConfig(final Object sender) {
        super(sender);
    }
    
    @SubCommand(desc = "Disable/Enable the natural leaves decay", usage = "<true/false>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean leavesdecay(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("LeavesDecay: " + CustomNpcs.LeavesDecayEnabled);
        }
        else {
            CustomNpcs.LeavesDecayEnabled = Boolean.parseBoolean(args[0]);
            CustomNpcs.Config.updateConfig();
            final Set<String> names = (Set<String>)Block.blockRegistry.getKeys();
            for (final String name : names) {
                final Block block = (Block)Block.blockRegistry.getObject(name);
                if (block instanceof BlockLeavesBase) {
                    block.setTickRandomly(CustomNpcs.LeavesDecayEnabled);
                }
            }
            this.sendmessage("LeavesDecay is now " + CustomNpcs.LeavesDecayEnabled);
        }
        return true;
    }
    
    @SubCommand(desc = "Disable/Enable the vines growing", usage = "<true/false>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean vinegrowth(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("VineGrowth: " + CustomNpcs.VineGrowthEnabled);
        }
        else {
            CustomNpcs.VineGrowthEnabled = Boolean.parseBoolean(args[0]);
            CustomNpcs.Config.updateConfig();
            final Set<String> names = (Set<String>)Block.blockRegistry.getKeys();
            for (final String name : names) {
                final Block block = (Block)Block.blockRegistry.getObject(name);
                if (block instanceof BlockVine) {
                    block.setTickRandomly(CustomNpcs.VineGrowthEnabled);
                }
            }
            this.sendmessage("VineGrowth is now " + CustomNpcs.VineGrowthEnabled);
        }
        return true;
    }
    
    @SubCommand(desc = "Disable/Enable the ice melting", usage = "<true/false>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean icemelts(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("IceMelts: " + CustomNpcs.IceMeltsEnabled);
        }
        else {
            CustomNpcs.IceMeltsEnabled = Boolean.parseBoolean(args[0]);
            CustomNpcs.Config.updateConfig();
            final Set<String> names = (Set<String>)Block.blockRegistry.getKeys();
            for (final String name : names) {
                final Block block = (Block)Block.blockRegistry.getObject(name);
                if (block instanceof BlockIce) {
                    block.setTickRandomly(CustomNpcs.IceMeltsEnabled);
                }
            }
            this.sendmessage("IceMelts is now " + CustomNpcs.IceMeltsEnabled);
        }
        return true;
    }
    
    @SubCommand(desc = "Disable/Enable guns shooting", usage = "<true/false>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean guns(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("GunsEnabled: " + CustomNpcs.GunsEnabled);
        }
        else {
            CustomNpcs.GunsEnabled = Boolean.parseBoolean(args[0]);
            CustomNpcs.Config.updateConfig();
            this.sendmessage("GunsEnabled is now " + CustomNpcs.GunsEnabled);
        }
        return true;
    }
    
    @SubCommand(desc = "Freezes/Unfreezes npcs", usage = "<true/false>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean freezenpcs(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("Frozen NPCs: " + CustomNpcs.FreezeNPCs);
        }
        else {
            CustomNpcs.FreezeNPCs = Boolean.parseBoolean(args[0]);
            this.sendmessage("FrozenNPCs is now " + CustomNpcs.FreezeNPCs);
        }
        return true;
    }
    
    @SubCommand(desc = "Set how many active chunkloaders you can have", usage = "<number>", permissions = { OpOnly.class }, hasEmptyCall = true)
    public boolean chunkloaders(final String[] args) {
        if (args.length == 0) {
            this.sendmessage("ChunkLoaders: " + ChunkController.instance.size() + "/" + CustomNpcs.ChuckLoaders);
        }
        else {
            try {
                CustomNpcs.ChuckLoaders = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException ex) {
                this.sendmessage("Didnt get a number");
                return false;
            }
            CustomNpcs.Config.updateConfig();
            final int size = ChunkController.instance.size();
            if (size > CustomNpcs.ChuckLoaders) {
                ChunkController.instance.unload(size - CustomNpcs.ChuckLoaders);
                this.sendmessage(size - CustomNpcs.ChuckLoaders + " chunksloaders unloaded");
            }
            this.sendmessage("ChunkLoaders: " + ChunkController.instance.size() + "/" + CustomNpcs.ChuckLoaders);
        }
        return true;
    }
    
    @SubCommand(desc = "Get/Set font", usage = "[type] [size]", permissions = { PlayerOnly.class }, hasEmptyCall = true)
    public void font(String[] args) {
        int size = 18;
        if (args.length > 1) {
            try {
                size = Integer.parseInt(args[args.length - 1]);
                args = Arrays.copyOfRange(args, 0, args.length - 1);
            }
            catch (Exception ex) {}
        }
        String font = "";
        for (int i = 0; i < args.length; ++i) {
            font = font + " " + args[i];
        }
        Server.sendData((EntityPlayerMP)this.pcParam, EnumPacketClient.CONFIG, 0, font.trim(), size);
    }
}
