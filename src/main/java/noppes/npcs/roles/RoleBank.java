// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import noppes.npcs.controllers.BankController;
import noppes.npcs.controllers.Bank;
import noppes.npcs.controllers.BankData;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;

public class RoleBank extends RoleInterface
{
    public int bankId;
    
    public RoleBank(final EntityNPCInterface npc) {
        super(npc);
        this.bankId = -1;
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("RoleBankID", this.bankId);
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.bankId = nbttagcompound.getInteger("RoleBankID");
    }
    
    @Override
    public void interact(final EntityPlayer player) {
        final BankData data = PlayerDataController.instance.getBankData(player, this.bankId).getBankOrDefault(this.bankId);
        data.openBankGui(player, this.npc, this.bankId, 0);
        this.npc.say(player, this.npc.advanced.getInteractLine());
    }
    
    public Bank getBank() {
        final Bank bank = BankController.getInstance().banks.get(this.bankId);
        if (bank != null) {
            return bank;
        }
        return BankController.getInstance().banks.values().iterator().next();
    }
}
