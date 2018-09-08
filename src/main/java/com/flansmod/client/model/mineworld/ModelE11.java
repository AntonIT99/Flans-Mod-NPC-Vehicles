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

public class ModelE11 extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelE11()
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportAngledBody
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBarrel
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBody
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportUnderBarrelFront
		gunModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import ImportGrip
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportSightFront
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportSightRear
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBodyBack
		gunModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportUnderBarrel
		gunModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportBodySide
		gunModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import ImportBodyMag
		gunModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box13
		gunModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box14
		gunModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box15
		gunModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box16
		gunModel[15] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box17
		gunModel[16] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box18
		gunModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box22
		gunModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box23

		gunModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import ImportAngledBody
		gunModel[0].setRotationPoint(1.5F, -3.5F, -1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import ImportBarrel
		gunModel[1].setRotationPoint(4F, -4.7F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportBody
		gunModel[2].setRotationPoint(-6F, -5F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Import ImportUnderBarrelFront
		gunModel[3].setRotationPoint(13F, -2.25F, -1F);
		gunModel[3].rotateAngleZ = 3.28121899F;

		gunModel[4].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import ImportGrip
		gunModel[4].setRotationPoint(-1F, -5F, -1F);
		gunModel[4].rotateAngleZ = -0.34906585F;

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportSightFront
		gunModel[5].setRotationPoint(10F, -5F, -0.5F);
		gunModel[5].rotateAngleZ = 0.6981317F;

		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import ImportSightRear
		gunModel[6].setRotationPoint(3F, -5.4F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import ImportBodyBack
		gunModel[7].setRotationPoint(-2.5F, -3.5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Import ImportUnderBarrel
		gunModel[8].setRotationPoint(1F, -3.25F, -1F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import ImportBodySide
		gunModel[9].setRotationPoint(2F, -4.8F, -1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportBodyMag
		gunModel[10].setRotationPoint(4F, -4.8F, -1.5F);

		gunModel[11].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Box13
		gunModel[11].setRotationPoint(-5F, -5.5F, -1F);

		gunModel[12].addShapeBox(-1F, -7F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		gunModel[12].setRotationPoint(-1F, 0.2F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		gunModel[13].setRotationPoint(-2F, -5.9F, -0.3F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		gunModel[14].setRotationPoint(-2F, -5.9F, -1.5F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addShapeBox(-1F, -7F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		gunModel[15].setRotationPoint(-1F, -0.8F, -0.5F);

		gunModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box18
		gunModel[16].setRotationPoint(-1.5F, -6F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Import Box22
		gunModel[17].setRotationPoint(0.5F, -6F, -0.5F);
		gunModel[17].rotateAngleX = 1.57079633F;
		gunModel[17].rotateAngleY = 1.57079633F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Import Box23
		gunModel[18].setRotationPoint(0.5F, -5.9F, -0.5F);
		gunModel[18].rotateAngleX = 1.57079633F;
		gunModel[18].rotateAngleY = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import ImportMagazine

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import ImportMagazine
		ammoModel[0].setRotationPoint(3F, -4.8F, -2.5F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}