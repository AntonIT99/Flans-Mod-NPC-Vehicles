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

public class ModelDC15A extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelDC15A()
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import AngledBody
		gunModel[1] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Barrel
		gunModel[2] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Body
		gunModel[3] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Import UnderBarrelFront
		gunModel[4] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Grip
		gunModel[5] = new ModelRendererTurbo(this, 150, 150, textureX, textureY); // Import SightFront
		gunModel[6] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import SightRear
		gunModel[7] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import UnderBarrel
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BodySide
		gunModel[9] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 27

		gunModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import AngledBody
		gunModel[0].setRotationPoint(1.5F, -3.5F, -1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Import Barrel
		gunModel[1].setRotationPoint(4F, -4.7F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Import Body
		gunModel[2].setRotationPoint(-4F, -4.5F, -1F);

		gunModel[3].addBox(0F, 3F, 0F, 7, 1, 1, 0F); // Import UnderBarrelFront
		gunModel[3].setRotationPoint(13F, 0.75F, -0.5F);
		gunModel[3].rotateAngleZ = 3.14159265F;

		gunModel[4].addBox(0F, 1F, 0F, 2, 4, 2, 0F); // Import Grip
		gunModel[4].setRotationPoint(-1F, -5F, -1F);
		gunModel[4].rotateAngleZ = -0.34906585F;

		gunModel[5].addBox(-1F, 0F, 0F, 3, 2, 1, 0F); // Import SightFront
		gunModel[5].setRotationPoint(8F, -5F, -0.5F);
		gunModel[5].rotateAngleZ = 0.6981317F;

		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import SightRear
		gunModel[6].setRotationPoint(4F, -5.25F, -0.5F);

		gunModel[7].addBox(8F, 0F, 0F, 8, 1, 1, 0F); // Import UnderBarrel
		gunModel[7].setRotationPoint(2F, -5.25F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import BodySide
		gunModel[8].setRotationPoint(2F, -4.8F, -1.5F);

		gunModel[9].addBox(0.05F, 0F, 0F, 5, 2, 2, 0F); // Box 12
		gunModel[9].setRotationPoint(-4F, -2.5F, -1F);
		gunModel[9].rotateAngleZ = 3.45575192F;

		gunModel[10].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 13
		gunModel[10].setRotationPoint(-4F, -2.5F, -1F);
		gunModel[10].rotateAngleZ = 2.89724656F;

		gunModel[11].addBox(0F, -1F, 0F, 1, 5, 2, 0F); // Box 14
		gunModel[11].setRotationPoint(-8.9F, -1.9F, -1F);
		gunModel[11].rotateAngleZ = 3.24631241F;

		gunModel[12].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 15
		gunModel[12].setRotationPoint(-6.9F, -1.9F, -1F);
		gunModel[12].rotateAngleZ = 3.24631241F;

		gunModel[13].addBox(8F, 0F, 0F, 1, 1, 1, 0F); // Box 15
		gunModel[13].setRotationPoint(9.75F, -4F, -0.5F);

		gunModel[14].addShapeBox(8F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(7.25F, -5.5F, -0.5F);

		gunModel[15].addBox(0F, 3F, 0F, 1, 1, 1, 0F); // Box 17
		gunModel[15].setRotationPoint(9.5F, 1.75F, -0.5F);
		gunModel[15].rotateAngleZ = 3.14159265F;

		gunModel[16].addShapeBox(3F, 3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[16].setRotationPoint(10.75F, 2F, -0.5F);
		gunModel[16].rotateAngleZ = 3.14159265F;

		gunModel[17].addShapeBox(3F, 3F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F); // Box 20
		gunModel[17].setRotationPoint(11.5F, 2F, -0.5F);
		gunModel[17].rotateAngleZ = 3.14159265F;

		gunModel[18].addShapeBox(-1F, 3F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 23
		gunModel[18].setRotationPoint(9.5F, 2F, -0.5F);
		gunModel[18].rotateAngleZ = 3.14159265F;

		gunModel[19].addBox(0F, 3F, 0F, 1, 1, 1, 0F); // Box 24
		gunModel[19].setRotationPoint(10.8F, 2F, -0.5F);
		gunModel[19].rotateAngleZ = 3.14159265F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 25
		gunModel[20].setRotationPoint(10F, -4.7F, -1.5F);

		gunModel[21].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 26
		gunModel[21].setRotationPoint(-1F, -3.2F, -1F);
		gunModel[21].rotateAngleZ = -1.57079633F;

		gunModel[22].addShapeBox(0F, 3F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 27
		gunModel[22].setRotationPoint(12.3F, 1.25F, -0.5F);
		gunModel[22].rotateAngleZ = 3.14159265F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Magazine

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Magazine
		ammoModel[0].setRotationPoint(10F, -4.7F, -2.25F);



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