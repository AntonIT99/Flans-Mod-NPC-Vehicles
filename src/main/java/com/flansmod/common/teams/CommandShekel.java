package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandException;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;

public class CommandShekel extends CommandBase
{

	
	  @Override
	    public boolean canCommandSenderUseCommand(ICommandSender sender) {
	    	return true;
	    } 
    
    

	@Override
	public String getCommandName()
	{
		return "shekel";
	}

	


    
	@Override
	public void processCommand(ICommandSender sender, String[] split)
	{
		
		if(split == null || split.length == 0 || split[0].equals("help") || split[0].equals("?"))
		{
			if(split.length == 2)
				sendHelpInformation(sender, Integer.parseInt(split[1]));
			else sendHelpInformation(sender, 1);
			return;
		}
		
			
			if(split[0].equals("withdraw"))
			{
				EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
				if(player != null)
				{
					if(PlayerHandler.getPlayerData(player).shekels>9)
					{
					player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					sender.addChatMessage(new ChatComponentText("\u00a72Use this to buy shit from NPCs."));
					sender.addChatMessage(new ChatComponentText("\u00a77Each Physical Shekel Represents 10 Shekels"));
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					}
					else if(PlayerHandler.getPlayerData(player).shekels<10)
						sender.addChatMessage(new ChatComponentText("\u00a77You need 10 Shekels to withdraw a physical Shekel"));
				}
				return;
			}
			
			if(split[0].equals("balance"))
			{
				EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
				if(player != null)
				{
		
					sender.addChatMessage(new ChatComponentText("\u00a72You have " + PlayerHandler.getPlayerData(player).shekels + " shekels"));
					
					
				}
				return;
			}
			
			
			if(split[0].equals("bloodletting"))
			{
				EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
				if(player != null)
				{
					PlayerHandler.getPlayerData(player).minorBleed=10;
					sender.addChatMessage(new ChatComponentText("\u00a72You are bleeding out now!"));
					
					
				}
				return;
			}
			
			if(split[0].equals("Seppuku"))
			{
				EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
				if(player != null)
				{
					PlayerHandler.getPlayerData(player).minorBleed=50;
					sender.addChatMessage(new ChatComponentText("\u00a72You are seriously bleeding out now!"));
					
					
				}
				return;
			}
			
			
			
			if(split[0].equals("withdraw5"))
			{
				EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
				if(player != null)
				{
					if(PlayerHandler.getPlayerData(player).shekels>49)
					{player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
					sender.addChatMessage(new ChatComponentText("\u00a72Use this to buy shit from NPCs"));
					sender.addChatMessage(new ChatComponentText("\u00a77Each Physical Shekel Represents 10 Shekels"));
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;
					PlayerHandler.getPlayerData(player).shekels--;}
					
					else if(PlayerHandler.getPlayerData(player).shekels<50)
						sender.addChatMessage(new ChatComponentText("\u00a77You need 50 Shekels to withdraw 5 at once"));
				}
				return;
			}
		
	


	sender.addChatMessage(new ChatComponentText(split[0] + " is not a valid teams command. Try /shekel help"));
}
	public List addTabCompletionOptions(ICommandSender sender, String[] prm)
	{
		if(prm.length <= 1)
		{
			return getListOfStringsMatchingLastWord(prm, new String[] {
					"help",
					"vehiclesCanZoom"
			});
		}
		
		return null;
	}

	public void sendHelpInformation(ICommandSender sender, int page)
	{
		if(page > 2 || page < 1)
		{
			ChatComponentText text = new ChatComponentText("Invalid help page, should be in the range (1-2)");
			text.getChatStyle().setColor(EnumChatFormatting.RED);
			sender.addChatMessage(text);
			return;
		}

		sender.addChatMessage(new ChatComponentText("\u00a72Listing teams non op commands \u00a7f[Page " + page + " of 2]"));
		switch(page)
		{
		case 1 :
		{
			sender.addChatMessage(new ChatComponentText("/shekel help"));
			sender.addChatMessage(new ChatComponentText("/shekel withdraw to withdraw 10 points as a physical item"));
			sender.addChatMessage(new ChatComponentText("/shekel withdraw5 to withdraw 50 points as 5 physical items"));
			sender.addChatMessage(new ChatComponentText("/shekel balance to see your shekel count"));
			sender.addChatMessage(new ChatComponentText("Check if there are unlockable features for this map at Spectator Spawn"));
		//	sender.addChatMessage(new ChatComponentText("/teams off"));
			break;
		}
		case 2 :
		{
			sender.addChatMessage(new ChatComponentText("No extra commands here"));
			sender.addChatMessage(new ChatComponentText("Ahem, despite being only 13% of the population, African Americans are responsible for over 50% of violent crimes"));
			sender.addChatMessage(new ChatComponentText("yet they are only 40 something% of the prison population. If you calculate tax income vs government program spending,"));
			sender.addChatMessage(new ChatComponentText("in the year 2014, black people created a deficit of at least 300 billion dollars, while Whites created a surplus."));
		//	sender.addChatMessage(new ChatComponentText("/teams off"));
			break;
		}
		
		}
	}

	public EntityPlayerMP getPlayer(String name)
	{
		return MinecraftServer.getServer().getConfigurationManager().func_152612_a(name);
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return "/shekel <help/withdraw/withdraw5>";
	}
}
