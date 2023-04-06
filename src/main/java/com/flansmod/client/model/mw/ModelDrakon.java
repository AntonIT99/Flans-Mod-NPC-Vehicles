package com.flansmod.client.model.mw;

import org.lwjgl.opengl.GL11;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDrakon extends ModelBullet 
{
public ModelRendererTurbo[] tailModel;

	
	
	public ModelDrakon()
	{
		int textureX = 64;
		int textureY = 32;
		
		tailModel = new ModelRendererTurbo[17];
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		tailModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		tailModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		tailModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 18
		tailModel[4] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 20
		tailModel[5] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 21
		tailModel[6] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Box 30
		tailModel[7] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Box 32
		tailModel[8] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Box 33
		tailModel[9] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 22
		tailModel[10] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 23
		tailModel[11] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 24
		tailModel[12] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 25
		tailModel[13] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 26
		tailModel[14] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 27
		tailModel[15] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 28
		tailModel[16] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 29

		tailModel[0].addShapeBox(-9.5F, 1F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		tailModel[0].rotateAngleZ = -1.57079633F;

		tailModel[1].addShapeBox(-9.5F, 0F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[1].rotateAngleZ = -1.57079633F;

		tailModel[2].addShapeBox(-9.5F, -1F, -1.5F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[2].rotateAngleZ = -1.57079633F;

		tailModel[3].addShapeBox(7.5F, -1F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F); // Box 18
		tailModel[3].rotateAngleZ = -1.57079633F;

		tailModel[4].addShapeBox(7.5F, 0F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F); // Box 20
		tailModel[4].rotateAngleZ = -1.57079633F;

		tailModel[5].addShapeBox(7.5F, 1F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F); // Box 21
		tailModel[5].rotateAngleZ = -1.57079633F;

		tailModel[6].addShapeBox(9.5F, 0F, -1.5F, 1, 1, 3, 0F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F); // Box 30
		tailModel[6].rotateAngleZ = -1.57079633F;

		tailModel[7].addShapeBox(9.5F, -1F, -1.5F, 1, 1, 3, 0F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F); // Box 32
		tailModel[7].rotateAngleZ = -1.57079633F;

		tailModel[8].addShapeBox(9.5F, 1F, -1.5F, 1, 1, 3, 0F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F); // Box 33
		tailModel[8].rotateAngleZ = -1.57079633F;

		tailModel[9].addShapeBox(-8F, 0F, -6.5F, 3, 1, 5, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 22
		tailModel[9].rotateAngleX = 0.78539816F;
		tailModel[9].rotateAngleZ = -1.57079633F;

		tailModel[10].addShapeBox(-8F, 0F, 0.5F, 3, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F); // Box 23
		tailModel[10].rotateAngleX = 0.78539816F;
		tailModel[10].rotateAngleZ = -1.57079633F;

		tailModel[11].addShapeBox(-8F, 0F, 1.5F, 3, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F); // Box 24
		tailModel[11].rotateAngleX = -0.78539816F;
		tailModel[11].rotateAngleZ = -1.57079633F;

		tailModel[12].addShapeBox(-8F, 0F, -5.5F, 3, 1, 5, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 25
		tailModel[12].rotateAngleX = -0.78539816F;
		tailModel[12].rotateAngleZ = -1.57079633F;

		tailModel[13].addShapeBox(2F, 0F, -4.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 26
		tailModel[13].rotateAngleX = 0.78539816F;
		tailModel[13].rotateAngleZ = -1.57079633F;

		tailModel[14].addShapeBox(2F, 0F, 1.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 27
		tailModel[14].rotateAngleX = 0.78539816F;
		tailModel[14].rotateAngleZ = -1.57079633F;

		tailModel[15].addShapeBox(2F, 0F, 1.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 28
		tailModel[15].rotateAngleX = -0.78539816F;
		tailModel[15].rotateAngleZ = -1.57079633F;

		tailModel[16].addShapeBox(2F, 0F, -3.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 29
		tailModel[16].rotateAngleX = -0.78539816F;
		tailModel[16].rotateAngleZ = -1.57079633F;

		for(int i = 0; i < 17; i++)
			tailModel[i].rotateAngleZ = (float)Math.PI / 2F;
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 1, 0);
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : tailModel)
			mrt.render(f5);
		GL11.glPopMatrix();
	}
}
