package com.hfr.command;

import java.util.ArrayList;
import java.util.List;

import com.hfr.data.MarketData;
import com.hfr.data.MarketData.Offer;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandXShop extends CommandBase {

	private final List aliases;
	
	public CommandXShop() {
		aliases = new ArrayList();
		aliases.add("xshop");
	}
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "xshop";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/xshop [add|delete|help]";
	}

	@Override
	public List getCommandAliases() {
		return aliases;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		
        MinecraftServer minecraftserver = MinecraftServer.getServer();
        EntityPlayer player = getCommandSenderAsPlayer(sender);
		
		if(args.length > 0) {
			
			if(args[0].equals("help") || args[0].equals("man")) {

				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[add]: first item in hotbar is sold item, next three items are the currency"));
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[add]: optionally, add a number as the parameter to determine the daily stock"));
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[delete]: deletes the offer at the given index"));
			}
			
			if(args[0].equals("add")) {
				
				if(args.length < 2) {
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "This command requires a shop name!"));
					return;
				}
				
				ItemStack[] offer = new ItemStack[4];
				
				for(int i = 0; i < 4; i++) {
					ItemStack stack = player.inventory.getStackInSlot(i);
					
					if(stack == null) {
						
						if(i == 0) {
							sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "No offer item found!"));
							return;
						}
						if(i == 1) {
							sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "No currency items found!"));
							return;
						}
						
						break;
						
					} else {
						offer[i] = stack.copy();
					}
				}
				
				//if 2 and 3 match, squeeze them together
				if(offer[3] != null && offer[2].getItem() == offer[3].getItem() && offer[2].getItemDamage() == offer[3].getItemDamage()) {
					offer[2].stackSize += offer[3].stackSize;
					offer[3] = null;
				}
				
				//if 1 and 2 matchm squeeze them together
				if(offer[2] != null && offer[1].getItem() == offer[2].getItem() && offer[1].getItemDamage() == offer[2].getItemDamage()) {
					offer[1].stackSize += offer[2].stackSize;
					offer[2] = offer[3];
					offer[3] = null;
				}
				
				MarketData data = MarketData.getData(player.worldObj);
				
				List<Offer> offers = data.offers.get(args[1]);
				
				if(offers == null)
					offers = new ArrayList();
				
				int capacity = 0;
				
				if(args.length > 2) {
					capacity = this.parseInt(sender, args[2]);
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Offer capacity is set to " + capacity + "!"));
				} else {
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Offer capacity is set to infinite!"));
				}
				
				offers.add(new Offer(offer, capacity));
				data.offers.put(args[1], offers);
				data.markDirty();
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Offer has been added to shop " + args[1] + " with index " + (offers.size() - 1) + "!"));
			}
			
			if(args[0].equals("delete")) {
				
				if(args.length < 3) {
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "This command requires an offer number and a shop!"));
					return;
				}

				MarketData data = MarketData.getData(player.worldObj);
				int offer = this.parseInt(sender, args[1]);
				
				List<Offer> offers = data.offers.get(args[2]);
				
				if(offers == null) {
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Shop " + args[2] + " has no offers!"));
					return;
				}
				
				if(offer >= offers.size() || offer < 0) {
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Index must be within the range of the offers!"));
					return;
				}
				
				offers.remove(offer);
				data.offers.put(args[2], offers);
				data.markDirty();
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Offer has been removed!"));
			}
			
		} else {
			
			sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + getCommandUsage(sender)));
		}
	}
	
    public int getRequiredPermissionLevel()
    {
        return 3;
    }
    
    public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
    {
        return p_71516_2_.length >= 1 ? getListOfStringsMatchingLastWord(p_71516_2_, MinecraftServer.getServer().getAllUsernames()) : null;
    }
}
