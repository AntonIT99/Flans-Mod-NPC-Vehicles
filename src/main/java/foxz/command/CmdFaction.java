// 
// Decompiled by Procyon v0.5.30
// 

package foxz.command;

import foxz.commandhelper.permissions.ParamCheck;
import foxz.commandhelper.permissions.OpOnly;
import foxz.commandhelper.annotations.SubCommand;
import noppes.npcs.controllers.PlayerFactionData;
import java.util.Iterator;
import noppes.npcs.controllers.PlayerData;
import java.util.List;
import noppes.npcs.controllers.Faction;
import foxz.commandhelper.annotations.Command;
import foxz.commandhelper.ChMcLogger;

@Command(name = "faction", desc = "operations about relationship between player and faction")
public class CmdFaction extends ChMcLogger
{
    public String playername;
    public Faction selectedFaction;
    public List<PlayerData> data;
    
    public CmdFaction(final Object sender) {
        super(sender);
    }
    
    @SubCommand(desc = "Add points", usage = "<points>", permissions = { OpOnly.class, ParamCheck.class })
    public Boolean add(final String[] args) {
        int points;
        try {
            points = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("Must be an integer");
            return false;
        }
        final int factionid = this.selectedFaction.id;
        for (final PlayerData playerdata : this.data) {
            final PlayerFactionData playerfactiondata = playerdata.factionData;
            playerfactiondata.increasePoints(factionid, points);
        }
        return true;
    }
    
    @SubCommand(desc = "Substract points", usage = "<points>", permissions = { OpOnly.class, ParamCheck.class })
    public Boolean subtract(final String[] args) {
        int points;
        try {
            points = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("Must be an integer");
            return false;
        }
        final int factionid = this.selectedFaction.id;
        for (final PlayerData playerdata : this.data) {
            final PlayerFactionData playerfactiondata = playerdata.factionData;
            playerfactiondata.increasePoints(factionid, -points);
        }
        return true;
    }
    
    @SubCommand(desc = "Reset points to default", usage = "", permissions = { OpOnly.class })
    public Boolean reset(final String[] args) {
        for (final PlayerData playerdata : this.data) {
            playerdata.factionData.factionData.put(this.selectedFaction.id, this.selectedFaction.defaultPoints);
        }
        return true;
    }
    
    @SubCommand(desc = "Set points", usage = "<points>", permissions = { OpOnly.class, ParamCheck.class })
    public Boolean set(final String[] args) {
        int points;
        try {
            points = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            this.sendmessage("Must be an integer");
            return false;
        }
        for (final PlayerData playerdata : this.data) {
            final PlayerFactionData playerfactiondata = playerdata.factionData;
            playerfactiondata.factionData.put(this.selectedFaction.id, points);
        }
        return true;
    }
    
    @SubCommand(desc = "Drop relationship", usage = "", permissions = { OpOnly.class })
    public Boolean drop(final String[] args) {
        for (final PlayerData playerdata : this.data) {
            playerdata.factionData.factionData.remove(this.selectedFaction.id);
        }
        return true;
    }
}
