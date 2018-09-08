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

public class ModelDC15X extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelDC15X()
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import AngledBody
		gunModel[1] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Barrel
		gunModel[2] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Body
		gunModel[3] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Grip
		gunModel[4] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import SightRear
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import BodySide
		gunModel[6] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Box 26
		gunModel[12] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 24
		gunModel[13] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 25
		gunModel[14] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 26
		gunModel[15] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 27
		gunModel[16] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 28
		gunModel[17] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 29
		gunModel[18] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 30
		gunModel[19] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 31
		gunModel[20] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Box 32
		gunModel[21] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Box 34
		gunModel[22] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Box 36

		gunModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import AngledBody
		gunModel[0].setRotationPoint(1F, -3.5F, -1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Barrel
		gunModel[1].setRotationPoint(4F, -4F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Import Body
		gunModel[2].setRotationPoint(-4F, -4.5F, -1F);

		gunModel[3].addBox(0F, 1F, 0F, 2, 4, 2, 0F); // Import Grip
		gunModel[3].setRotationPoint(-1F, -5F, -1F);
		gunModel[3].rotateAngleZ = -0.34906585F;

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import SightRear
		gunModel[4].setRotationPoint(6F, -5.25F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import BodySide
		gunModel[5].setRotationPoint(2F, -4F, -1.5F);

		gunModel[6].addBox(0.05F, 0F, 0F, 5, 2, 2, 0F); // Box 12
		gunModel[6].setRotationPoint(-4F, -2.5F, -1F);
		gunModel[6].rotateAngleZ = 3.45575192F;

		gunModel[7].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 13
		gunModel[7].setRotationPoint(-4F, -2.5F, -1F);
		gunModel[7].rotateAngleZ = 2.89724656F;

		gunModel[8].addBox(0F, -1F, 0F, 1, 5, 2, 0F); // Box 14
		gunModel[8].setRotationPoint(-8.9F, -1.9F, -1F);
		gunModel[8].rotateAngleZ = 3.24631241F;

		gunModel[9].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 15
		gunModel[9].setRotationPoint(-6.9F, -1.9F, -1F);
		gunModel[9].rotateAngleZ = 3.24631241F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F); // Box 15
		gunModel[10].setRotationPoint(19.75F, -4F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 26
		gunModel[11].setRotationPoint(-1F, -3.2F, -1F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[12].setRotationPoint(-5F, -5.25F, -1F);

		gunModel[13].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 25
		gunModel[13].setRotationPoint(-0.25F, -5.25F, -1F);

		gunModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 26
		gunModel[14].setRotationPoint(0.5F, -6.25F, -0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		gunModel[15].setRotationPoint(3F, -6.25F, -0.5F);

		gunModel[16].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
		gunModel[16].setRotationPoint(0.5F, -7.25F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 29
		gunModel[17].setRotationPoint(4.5F, -7.25F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 30
		gunModel[18].setRotationPoint(5.5F, -7.25F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 31
		gunModel[19].setRotationPoint(-0.5F, -7.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F); // Box 32
		gunModel[20].setRotationPoint(-1.5F, -7.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.25F, 0.25F); // Box 34
		gunModel[21].setRotationPoint(18F, -4F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 36
		gunModel[22].setRotationPoint(19F, -4F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import Magazine

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Magazine
		ammoModel[0].setRotationPoint(2F, -4F, -2.25F);



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