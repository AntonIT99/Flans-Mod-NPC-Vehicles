package com.wolffsmod.mixin;

import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.wolffsmod.customnpc.IMixinDataInventory;
import kamkeel.npcs.network.PacketClient;
import kamkeel.npcs.network.packets.request.mainmenu.MainmenuAdvancedSavePacket;
import kamkeel.npcs.network.packets.request.mainmenu.MainmenuStatsSavePacket;
import noppes.npcs.client.gui.mainmenu.GuiNPCInv;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface2;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;

@Mixin(value = GuiNPCInv.class)
public abstract class MixinGuiNPCInv extends GuiContainerNPCInterface2 implements IGuiData, ITextfieldListener
{
    @Unique private boolean wolffsmod$statsImportPending;
    @Unique private boolean wolffsmod$advancedImportPending;

    private MixinGuiNPCInv(EntityNPCInterface npc, Container cont)
    {
        super(npc, cont);
    }

    @Inject(method = "func_73866_w_", at = @At(value = "TAIL"), remap = false)
    private void onInitGui(CallbackInfo callbackInfo)
    {
        addLabel(new GuiNpcLabel(70,"Melee", guiLeft + 371, guiTop + 60));
        addButton(new GuiNpcButton(71,guiLeft + 375, guiTop + 70, 30, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataInventory)npc.inventory).getUseWeaponMeleeStats() ? 1:0));

        addLabel(new GuiNpcLabel(72,"Ranged", guiLeft + 371, guiTop + 100));
        addButton(new GuiNpcButton(73,guiLeft + 375, guiTop + 110, 30, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataInventory)npc.inventory).getUseWeaponRangedStats() ? 1:0));

        addLabel(new GuiNpcLabel(74,"Armor", guiLeft + 371, guiTop + 140));
        addButton(new GuiNpcButton(75,guiLeft + 375, guiTop + 150, 30, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataInventory)npc.inventory).getUseArmorStats() ? 1:0));

        addLabel(new GuiNpcLabel(76,"Vehicle", guiLeft + 371, guiTop + 180));
        addButton(new GuiNpcButton(77,guiLeft + 375, guiTop + 190, 30, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataInventory)npc.inventory).getUseDriveableStats() ? 1:0));
    }

    @Inject(method = "func_146284_a", at = @At(value = "TAIL"), remap = false)
    private void onActionPerformed(GuiButton guibutton, CallbackInfo callbackInfo)
    {
        if (guibutton.id == 71)
        {
            IMixinDataInventory inv = (IMixinDataInventory)npc.inventory;
            boolean enabled = ((GuiNpcButton)guibutton).getValue() == 1;
            inv.setUseWeaponMeleeStats(enabled);
            if (enabled) { inv.importWeaponMeleeStats(); wolffsmod$statsImportPending = true; }
            save();
        }
        else if (guibutton.id == 73)
        {
            IMixinDataInventory inv = (IMixinDataInventory)npc.inventory;
            boolean enabled = ((GuiNpcButton)guibutton).getValue() == 1;
            inv.setUseWeaponRangedStats(enabled);
            if (enabled) { inv.importWeaponRangedStats(); wolffsmod$statsImportPending = true; }
            save();
        }
        else if (guibutton.id == 75)
        {
            IMixinDataInventory inv = (IMixinDataInventory)npc.inventory;
            boolean enabled = ((GuiNpcButton)guibutton).getValue() == 1;
            inv.setUseArmorStats(enabled);
            if (enabled) { inv.importArmorStats(); wolffsmod$statsImportPending = true; }
            save();
        }
        else if (guibutton.id == 77)
        {
            IMixinDataInventory inv = (IMixinDataInventory)npc.inventory;
            boolean enabled = ((GuiNpcButton)guibutton).getValue() == 1;
            inv.setUseDriveableStats(enabled);
            if (enabled)
            {
                inv.importDriveableStats();
                wolffsmod$statsImportPending = true;
                wolffsmod$advancedImportPending = readSoundsFromDriveableItem();
            }
            save();
        }
    }

    @Inject(method = "save", at = @At(value = "TAIL"), remap = false)
    private void onSave(CallbackInfo callbackInfo)
    {
        if (wolffsmod$statsImportPending)
        {
            PacketClient.sendClient(new MainmenuStatsSavePacket(npc.stats.writeToNBT(new NBTTagCompound())));
            if (wolffsmod$advancedImportPending)
                PacketClient.sendClient(new MainmenuAdvancedSavePacket(npc.advanced.writeToNBT(new NBTTagCompound())));
            wolffsmod$statsImportPending = false;
            wolffsmod$advancedImportPending = false;
        }
    }

    private boolean readSoundsFromDriveableItem()
    {
        return ((IMixinDataInventory)npc.inventory).getUseDriveableStats() && npc.inventory.getWeapon() != null
                && (npc.inventory.getWeapon().getItem() instanceof ItemPlane || npc.inventory.getWeapon().getItem() instanceof ItemVehicle);
    }
}
