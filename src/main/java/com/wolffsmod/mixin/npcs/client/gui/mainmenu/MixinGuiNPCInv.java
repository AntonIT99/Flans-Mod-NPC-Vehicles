package com.wolffsmod.mixin.npcs.client.gui.mainmenu;

import com.wolffsmod.mixin.npcs.IMixinDataInventory;
import noppes.npcs.client.gui.mainmenu.GuiNPCInv;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface2;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.inventory.Container;

@Mixin(value = GuiNPCInv.class)
public abstract class MixinGuiNPCInv extends GuiContainerNPCInterface2
{
    private MixinGuiNPCInv(EntityNPCInterface npc, Container cont)
    {
        super(npc, cont);
    }

    @Inject(method = "initGui", at = @At(value = "TAIL"))
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

    @Inject(method = "actionPerformed", at = @At(value = "TAIL"))
    private void onActionPerformed(GuiButton guibutton, CallbackInfo callbackInfo)
    {
        if(guibutton.id == 71)
        {
            ((IMixinDataInventory)npc.inventory).setUseWeaponMeleeStats(((GuiNpcButton)guibutton).getValue() == 1);
            if (((IMixinDataInventory)npc.inventory).getUseWeaponMeleeStats())
                npc.inventory.setWeapons(npc.inventory.getWeapons());
            save();
        }
        if(guibutton.id == 73)
        {
            ((IMixinDataInventory)npc.inventory).setUseWeaponRangedStats(((GuiNpcButton)guibutton).getValue() == 1);
            if (((IMixinDataInventory)npc.inventory).getUseWeaponRangedStats())
                npc.inventory.setWeapons(npc.inventory.getWeapons());
            save();
        }
        if(guibutton.id == 75)
        {
            ((IMixinDataInventory)npc.inventory).setUseArmorStats(((GuiNpcButton)guibutton).getValue() == 1);
            if (((IMixinDataInventory)npc.inventory).getUseArmorStats())
                npc.inventory.setArmor(npc.inventory.getArmor());
            save();
        }
        if(guibutton.id == 77)
        {
            ((IMixinDataInventory)npc.inventory).setUseDriveableStats(((GuiNpcButton)guibutton).getValue() == 1);
            if (((IMixinDataInventory)npc.inventory).getUseDriveableStats())
                npc.inventory.setWeapons(npc.inventory.getWeapons());
            save();
        }
    }
}