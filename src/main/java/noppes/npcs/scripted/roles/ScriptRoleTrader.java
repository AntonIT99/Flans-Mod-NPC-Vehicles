// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import foxz.utils.Market;
import noppes.npcs.scripted.ScriptItemStack;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleTrader;

public class ScriptRoleTrader extends ScriptRoleInterface
{
    private RoleTrader role;
    
    public ScriptRoleTrader(final EntityNPCInterface npc) {
        super(npc);
        this.role = (RoleTrader)npc.roleInterface;
    }
    
    public void setSellOption(final int slot, ScriptItemStack currency, final ScriptItemStack currency2, final ScriptItemStack sold) {
        if (sold == null || slot >= 18 || slot < 0) {
            return;
        }
        if (currency == null) {
            currency = currency2;
        }
        if (currency != null) {
            this.role.inventoryCurrency.items.put(slot, currency.getMCItemStack());
        }
        else {
            this.role.inventoryCurrency.items.remove(slot);
        }
        if (currency2 != null) {
            this.role.inventoryCurrency.items.put(slot + 18, currency2.getMCItemStack());
        }
        else {
            this.role.inventoryCurrency.items.remove(slot + 18);
        }
        this.role.inventorySold.items.put(slot, sold.getMCItemStack());
    }
    
    public void setSellOption(final int slot, final ScriptItemStack currency, final ScriptItemStack sold) {
        this.setSellOption(slot, currency, null, sold);
    }
    
    public void removeSellOption(final int slot) {
        if (slot >= 18 || slot < 0) {
            return;
        }
        this.role.inventoryCurrency.items.remove(slot);
        this.role.inventoryCurrency.items.remove(slot + 18);
        this.role.inventorySold.items.remove(slot);
    }
    
    public void setMarket(final String name) {
        this.role.marketName = name;
        Market.load(this.role, name);
    }
    
    public String getMarket() {
        return this.role.marketName;
    }
    
    @Override
    public int getType() {
        return 2;
    }
}
