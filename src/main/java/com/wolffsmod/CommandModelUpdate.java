package com.wolffsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandModelUpdate extends CommandBase {

	private static final String COMMAND_NAME = "npcreloadmodels";

	@Override
	public String getCommandName() {
		return COMMAND_NAME;
	}
	
	@Override
	public int getRequiredPermissionLevel()
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
	private void updateModels(ICommandSender commandSender)
	{
		/*
		RenderManager.instance.entityRenderMap.put(EntityT34.class, new RenderT34(new ModelT34(), 0));
		Render r = (Render) RenderManager.instance.entityRenderMap.get(EntityT34.class);
		r.setRenderManager(RenderManager.instance);
		getCommandSenderAsPlayer(commandSender).addChatComponentMessage(new ChatComponentText("Flan's NPC models reloaded"));
		*/
	}

	@Override
	public void processCommand(ICommandSender commandSender, String[] p_71515_2_)
	{
		updateModels(commandSender);
	}

	@Override
	public String getCommandUsage(ICommandSender commandSender)
	{
		return COMMAND_NAME;
	}
}
