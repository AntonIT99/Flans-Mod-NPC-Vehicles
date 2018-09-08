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

public class ModelDC15S extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelDC15S()
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import AngledBody
		gunModel[1] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Barrel
		gunModel[2] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Body
		gunModel[3] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Import UnderBarrelFront
		gunModel[4] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Grip
		gunModel[5] = new ModelRendererTurbo(this, 150, 150, textureX, textureY); // Import SightFront
		gunModel[6] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import SightRear
		gunModel[7] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import BodyBack
		gunModel[8] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import UnderBarrel
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BodySide
		gunModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BodyMag

		gunModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import AngledBody
		gunModel[0].setRotationPoint(1.5F, -3.8F, -1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Import Barrel
		gunModel[1].setRotationPoint(4F, -4.7F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Import Body
		gunModel[2].setRotationPoint(-5F, -5F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Import UnderBarrelFront
		gunModel[3].setRotationPoint(13F, -2.5F, -1F);
		gunModel[3].rotateAngleZ = 3.28121899F;

		gunModel[4].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import Grip
		gunModel[4].setRotationPoint(-1F, -5F, -1F);
		gunModel[4].rotateAngleZ = -0.34906585F;


		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import SightFront
		gunModel[5].setRotationPoint(10F, -5F, -0.5F);
		gunModel[5].rotateAngleZ = 0.52359878F;

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import SightRear
		gunModel[6].setRotationPoint(4F, -5.3F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import BodyBack
		gunModel[7].setRotationPoint(-3F, -3.5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Import UnderBarrel
		gunModel[8].setRotationPoint(1F, -3.5F, -1F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import BodySide
		gunModel[9].setRotationPoint(2F, -4.8F, -1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import BodyMag
		gunModel[10].setRotationPoint(4F, -4.8F, -1.5F);
		
        ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY);
		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Magazine
		ammoModel[0].setRotationPoint(3F, -4.8F, -2.5F);

		
		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}