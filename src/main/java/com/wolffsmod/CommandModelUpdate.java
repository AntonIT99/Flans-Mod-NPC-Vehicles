package com.wolffsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;

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
		for (Object entityClass: RenderManager.instance.entityRenderMap.keySet())
		{
			if (entityClass instanceof Class)
			{
				RenderManager.instance.entityRenderMap.put(entityClass, RenderManager.instance.entityRenderMap.get(entityClass));
				Render r = (Render) RenderManager.instance.entityRenderMap.get(entityClass);
				r.setRenderManager(RenderManager.instance);
			}
		}
		getCommandSenderAsPlayer(commandSender).addChatComponentMessage(new ChatComponentText("Models reloaded"));
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
