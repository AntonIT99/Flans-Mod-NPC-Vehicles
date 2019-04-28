package com.wolffsmod;

import com.wolffsmod.entity.EntityPanzerIV;
import com.wolffsmod.entity.EntityT3485;
import com.wolffsmod.model.ModelPanzerIV;
import com.wolffsmod.model.ModelT3485;
import com.wolffsmod.render.RenderPanzerIV;
import com.wolffsmod.render.RenderT3485;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandModelUpdate extends CommandBase {

	@Override
	public String getCommandName() {
		return "npcloadm";
	}
	
	@Override
	public int getRequiredPermissionLevel()
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
	private void updateModels() {
		/*RenderManager.instance.entityRenderMap.put(EntityT3485.class, new RenderT3485(new ModelT3485(), 0));
		Render r = (Render) RenderManager.instance.entityRenderMap.get(EntityT3485.class);
		r.setRenderManager(RenderManager.instance);*/
		
	}

	@Override
	public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_) {
		updateModels();
		
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "npcloadm";
	}

}
