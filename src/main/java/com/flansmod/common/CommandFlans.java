package com.flansmod.common;

import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

@SuppressWarnings("rawtypes")
public class CommandFlans extends CommandBase {

    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender) {
        return true;
    }

    @Override
    public String getCommandName() {
        return "flans";
    }


    @Override
    public void processCommand(ICommandSender sender, String[] split) {
        if (split.length == 0 || split[0].equals("help") || split[0].equals("?")) {
//            if (split.length == 2)
//                sendHelpInformation(sender, Integer.parseInt(split[1]));
//            else sendHelpInformation(sender, 1);
            sendHelpInformation(sender, 1);
            return;
        }

        //Get a list of available attachments
        if (split[0].equals("allowedAttachments")) {
            EntityPlayer player = getPlayer(sender.getCommandSenderName());
            if (player != null && player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemGun) {
                ItemGun itemGun = (ItemGun) player.getHeldItem().getItem();
                int counter = 0;
//
                sender.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "" + itemGun.type.allowedAttachments.size() + " attachments are available for " + itemGun.type.name));
                for (AttachmentType attachmentType : itemGun.type.allowedAttachments) {
                    counter++;
                    sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "" + counter + ". " + EnumChatFormatting.GREEN + attachmentType.name + EnumChatFormatting.GOLD + " | " + EnumChatFormatting.LIGHT_PURPLE + "Item ID " + Item.getIdFromItem(attachmentType.item)));
                }
                counter = 0;
            } else {
                sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "ERROR: " + EnumChatFormatting.AQUA + "Put the weapon in your hands!"));
            }
            return;
        }
        sender.addChatMessage(new ChatComponentText(split[0] + " is not a valid flans command. Try /flans help"));
    }

    public List addTabCompletionOptions(ICommandSender sender, String[] prm) {
        if (prm.length <= 1) {
            return getListOfStringsMatchingLastWord(prm, "help",
                    "allowedAttachments");
        }

        return null;
    }

    private void sendHelpInformation(ICommandSender sender, int page) {
        if (page > 4 || page < 1) {
            ChatComponentText text = new ChatComponentText("Invalid help page, should be in the range (1-4)");
            text.getChatStyle().setColor(EnumChatFormatting.RED);
            sender.addChatMessage(text);
            return;
        }

        sender.addChatMessage(new ChatComponentText("\u00a72Listing flans commands \u00a7f[Page " + page + " of 1]"));
        switch (page) {
            case 1: {
                sender.addChatMessage(new ChatComponentText("/flans help [page]"));
                sender.addChatMessage(new ChatComponentText("/flans allowedAttachments"));
                sender.addChatMessage(new ChatComponentText("/flans stats {Work in progress}"));
                sender.addChatMessage(new ChatComponentText("/flans leaderboard {Work in progress}"));
                break;
            }
        }
    }

    private EntityPlayerMP getPlayer(String name) {
        return MinecraftServer.getServer().getConfigurationManager().func_152612_a(name);
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        return "Try \"/flans help\"";
    }
}
