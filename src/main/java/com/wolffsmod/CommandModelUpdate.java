package com.wolffsmod;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;






public class CommandModelUpdate extends CommandBase {

	@Override
	public String getCommandName() {
		return "npcreloadmodels";
	}
	
	@Override
	public int getRequiredPermissionLevel()
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
	private void updateModels() {
		/*RenderManager.instance.entityRenderMap.put(EntityT34.class, new RenderT34(new ModelT34(), 0));
		Render r = (Render) RenderManager.instance.entityRenderMap.get(EntityT34.class);
		r.setRenderManager(RenderManager.instance);*/
		
	}



	
	
	
	@Override
	public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_) {
		updateModels();
		
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "npcreloadmodels";
	}

}
