//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.6
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMG42 extends ModelGun
{
	int textureX = 128;
	int textureY = 32;

	public ModelMG42()
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY); // Import Import
		gunModel[1] = new ModelRendererTurbo(this, 99, 0, textureX, textureY); // Import Import
		gunModel[2] = new ModelRendererTurbo(this, 85, 0, textureX, textureY); // Import Import
		gunModel[3] = new ModelRendererTurbo(this, 99, 3, textureX, textureY); // Import Import
		gunModel[4] = new ModelRendererTurbo(this, 99, 6, textureX, textureY); // Import Import
		gunModel[5] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Import Import
		gunModel[6] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Import Import
		gunModel[7] = new ModelRendererTurbo(this, 74, 1, textureX, textureY); // Import Import
		gunModel[8] = new ModelRendererTurbo(this, 52, 1, textureX, textureY); // Import Import
		gunModel[9] = new ModelRendererTurbo(this, 89, 0, textureX, textureY); // Import Import
		gunModel[10] = new ModelRendererTurbo(this, 89, 4, textureX, textureY); // Import Import
		gunModel[11] = new ModelRendererTurbo(this, 89, 4, textureX, textureY); // Import Import
		gunModel[12] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Import Import
		gunModel[13] = new ModelRendererTurbo(this, 63, 0, textureX, textureY); // Import Import
		gunModel[14] = new ModelRendererTurbo(this, 63, 4, textureX, textureY); // Import Import
		gunModel[15] = new ModelRendererTurbo(this, 51, 0, textureX, textureY); // Import Import
		gunModel[16] = new ModelRendererTurbo(this, 49, 0, textureX, textureY); // Import Import
		gunModel[17] = new ModelRendererTurbo(this, 55, 5, textureX, textureY); // Import Import
		gunModel[18] = new ModelRendererTurbo(this, 112, 0, textureX, textureY); // Import Import
		gunModel[19] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // Import Import
		gunModel[20] = new ModelRendererTurbo(this, 120, 4, textureX, textureY); // Import Import
		gunModel[21] = new ModelRendererTurbo(this, 39, 3, textureX, textureY); // Import Import
		gunModel[22] = new ModelRendererTurbo(this, 44, 3, textureX, textureY); // Import Import

		gunModel[0].addShapeBox(-0.5F, -7F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F); // Import Import
		gunModel[0].setRotationPoint(13F, 4F, 0F);
		gunModel[0].rotateAngleY = -1.57079633F;

		gunModel[1].addShapeBox(-0.5F, 3F, 15F, 1, 1, 1, 0F,-0.05F, -0.05F, 0.0F,-0.05F, -0.05F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F,-0.05F, -0.05F, 0.0F,-0.05F, -0.05F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F); // Import Import
		gunModel[1].setRotationPoint(0F, -6F, 0F);
		gunModel[1].rotateAngleY = -1.57079633F;

		gunModel[2].addShapeBox(-0.5F, 3F, 4F, 1, 1, 11, 0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F,-0.2F, -0.2F, 0.0F); // Import Import
		gunModel[2].setRotationPoint(0F, -6F, 0F);
		gunModel[2].rotateAngleY = -1.57079633F;

		gunModel[3].addShapeBox(-0.5F, -2F, 0F, 1, 2, 1, 0F,-0.4F, 0.0F, -0.4F,-0.4F, 0.0F, -0.4F,-0.4F, 0.0F, -0.4F,-0.4F, 0.0F, -0.4F,-0.3F, 0.0F, -0.2F,-0.3F, 0.0F, -0.2F,-0.3F, 0.0F, -0.3F,-0.3F, 0.0F, -0.3F); // Import Import
		gunModel[3].setRotationPoint(13F, -2F, 0F);
		gunModel[3].rotateAngleY = -1.57079633F;

		gunModel[4].addShapeBox(-0.5F, -2F, -8F, 1, 1, 2, 0F,-0.4F, -0.3F, -0.2F,-0.4F, -0.3F, -0.2F,-0.4F, -0.3F, -1.0F,-0.4F, -0.3F, -1.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F); // Import Import
		gunModel[4].setRotationPoint(13F, -2F, 0F);
		gunModel[4].rotateAngleY = -1.57079633F;

		gunModel[5].addShapeBox(-0.5F, 3F, 4F, 1, 1, 11, 0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F); // Import Import
		gunModel[5].setRotationPoint(0F, -6F, 0F);
		gunModel[5].rotateAngleY = -1.57079633F;

		gunModel[6].addShapeBox(-0.5F, 3F, 4F, 1, 1, 11, 0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.1F, -0.1F, 0.0F,-0.1F, -0.1F, 0.0F); // Import Import
		gunModel[6].setRotationPoint(0F, -6F, 0F);
		gunModel[6].rotateAngleY = -1.57079633F;

		gunModel[7].addBox(-0.5F, 3F, -4F, 1, 1, 8, 0F); // Import Import
		gunModel[7].setRotationPoint(0F, -6F, 0F);
		gunModel[7].rotateAngleY = -1.57079633F;

		gunModel[8].addShapeBox(-0.5F, 2F, -4F, 1, 1, 8, 0F,0.0F, -0.6F, -5.0F,0.0F, -0.6F, -5.0F,0.0F, -0.6F, -0.4F,0.0F, -0.6F, -0.4F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F); // Import Import
		gunModel[8].setRotationPoint(0F, -6F, 0F);
		gunModel[8].rotateAngleY = -1.57079633F;

		gunModel[9].addShapeBox(-0.6F, 2.8F, 1.6F, 1, 1, 2, 0F,0.2F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.2F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F); // Import Import
		gunModel[9].setRotationPoint(0F, -6F, 0F);
		gunModel[9].rotateAngleY = -1.57079633F;

		gunModel[10].addShapeBox(-0.5F, 4F, -0.5F, 1, 1, 2, 0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, -0.3F,-0.3F, 0.0F, -0.3F); // Import Import
		gunModel[10].setRotationPoint(0F, -6F, 0F);
		gunModel[10].rotateAngleY = -1.57079633F;

		gunModel[11].addShapeBox(-0.5F, 4F, -0.5F, 1, 1, 2, 0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, 0.0F,-0.3F, 0.0F, -0.3F,-0.3F, 0.0F, -0.3F); // Import Import
		gunModel[11].setRotationPoint(0F, -6F, 0F);
		gunModel[11].rotateAngleY = -1.57079633F;

		gunModel[12].addShapeBox(-0.5F, 4F, -0.5F, 1, 3, 1, 0F,-0.2F, 0.0F, 0.0F,-0.2F, 0.0F, 0.0F,-0.2F, 0.0F, 0.0F,-0.2F, 0.0F, 0.0F,-0.2F, -0.8F, 1.0F,-0.2F, -0.8F, 1.0F,-0.2F, -0.5F, -1.0F,-0.2F, -0.5F, -1.0F); // Import Import
		gunModel[12].setRotationPoint(0F, -6F, 0F);
		gunModel[12].rotateAngleY = -1.57079633F;

		gunModel[13].addShapeBox(-0.5F, 2F, -7F, 1, 1, 2, 0F,-0.25F, -0.5F, 0.5F,-0.25F, -0.5F, 0.5F,-0.2F, -0.5F, -2.0F,-0.2F, -0.5F, -2.0F,-0.25F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,-0.08F, 0.0F, 0.0F,-0.08F, 0.0F, 0.0F); // Import Import
		gunModel[13].setRotationPoint(0F, -6F, 0F);
		gunModel[13].rotateAngleY = -1.57079633F;

		gunModel[14].addShapeBox(-0.5F, 3F, -7F, 1, 1, 3, 0F,-0.25F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F); // Import Import
		gunModel[14].setRotationPoint(0F, -6F, 0F);
		gunModel[14].rotateAngleY = -1.57079633F;

		gunModel[15].addShapeBox(-0.5F, 4F, -7F, 1, 1, 3, 0F,-0.25F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,-0.25F, 0.0F, 0.0F,0.0F, -0.9F, -0.3F,0.0F, -0.9F, -0.3F); // Import Import
		gunModel[15].setRotationPoint(0F, -6F, 0F);
		gunModel[15].rotateAngleY = -1.57079633F;

		gunModel[16].addShapeBox(0.3F, 3F, 0.8F, 1, 1, 1, 0F,0.0F, -0.25F, 0.0F,0.0F, -0.25F, -0.4F,0.0F, -0.25F, -0.1F,0.0F, -0.25F, 0.0F,0.0F, -0.25F, 0.0F,0.0F, -0.25F, -0.4F,0.0F, -0.25F, -0.1F,0.0F, -0.25F, 0.0F); // Import Import
		gunModel[16].setRotationPoint(0F, -6F, 0F);
		gunModel[16].rotateAngleY = -1.57079633F;

		gunModel[17].addShapeBox(0.5F, 2.5F, 1F, 1, 2, 1, 0F,-0.5F, 0.0F, -0.5F,0.0F, 0.0F, -0.5F,0.0F, 0.0F, 0.0F,-0.5F, 0.0F, 0.0F,-0.5F, 0.0F, -0.5F,0.0F, 0.0F, -0.5F,0.0F, 0.0F, 0.0F,-0.5F, 0.0F, 0.0F); // Import Import
		gunModel[17].setRotationPoint(0F, -6F, 0F);
		gunModel[17].rotateAngleY = -1.57079633F;

		gunModel[18].addTrapezoid(0F, 4F, 13F, 1, 1, 1, 0F, -0.2F, 5); // Import Import
		gunModel[18].setRotationPoint(0F, -6.25F, 0.5F);
		gunModel[18].rotateAngleY = -1.57079633F;

		gunModel[19].addShapeBox(0F, 4F, 13F, 1, 1, 2, 0F,0.0F, 0.0F, -0.4F,0.0F, 0.0F, -0.4F,0.0F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F); // Import Import
		gunModel[19].setRotationPoint(-0.5F, -0.5F, -4.5F);
		gunModel[19].rotateAngleY = -1.57079633F;

		gunModel[20].addShapeBox(0F, 4F, 13F, 1, 1, 2, 0F,0.0F, 0.0F, -0.4F,0.0F, 0.0F, -0.4F,0.0F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F,0.0F, -0.5F, 0.0F); // Import Import
		gunModel[20].setRotationPoint(-0.5F, -0.5F, 5.5F);
		gunModel[20].rotateAngleY = -1.57079633F;

		gunModel[21].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0.0F, 0.0F, 0.0F,-0.6F, 0.0F, -0.4F,-0.6F, 0.0F, -0.2F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.6F, 0.0F, -0.4F,-0.6F, 0.0F, -0.2F,0.0F, 0.0F, 0.0F); // Import Import
		gunModel[21].setRotationPoint(13.5F, -2F, 0F);
		gunModel[21].rotateAngleY = -1.57079633F;
		gunModel[21].rotateAngleZ = -0.75049158F;

		gunModel[22].addShapeBox(-1F, 0F, -0.5F, 1, 8, 1, 0F,-0.6F, 0.0F, -0.4F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.6F, 0.0F, -0.2F,-0.6F, 0.0F, -0.4F,0.0F, 0.0F, 0.0F,0.0F, 0.0F, 0.0F,-0.6F, 0.0F, -0.2F); // Import Import
		gunModel[22].setRotationPoint(13.5F, -2F, 0F);
		gunModel[22].rotateAngleY = -1.57079633F;
		gunModel[22].rotateAngleZ = 0.75049158F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Import Import
		ammoModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(-1F, 3.3F, 1.6F, 1, 5, 2, 0F,0F, 0.0F, -0.2F,-0.8F, 0.0F, -0.2F,-0.8F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F,-0.8F, 0.0F, -0.2F,-0.8F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F); // Import Import
		ammoModel[0].setRotationPoint(0F, -6F, 0F);
		ammoModel[0].rotateAngleY = -1.57079633F;

		ammoModel[1].addShapeBox(-1F, 3.3F, 1.6F, 2, 1, 2, 0F,0F, 0.0F, -0.2F,-0.8F, 0F, -0.2F,-0.8F, 0.0F, -0.2F,0.0F, 0.0F, -0.2F,0.0F, -0.8F, -0.2F,-0.8F, -0.8F, -0.2F,-0.8F, -0.8F, -0.2F,0.0F, -0.8F, -0.2F); // Import Box0
		ammoModel[1].setRotationPoint(0F, -6F, 0F);
		ammoModel[1].rotateAngleY = -1.57079633F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(2F /16F, -4F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.SIDE_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}