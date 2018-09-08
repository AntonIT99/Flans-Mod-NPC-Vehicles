//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: E5S
// Model Creator: 
// Created on: 21.10.2016 - 23:25:43
// Last changed on: 21.10.2016 - 23:25:43

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelE5S extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelE5S() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
		gunModel[0] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import ImportAngledBody
		gunModel[1] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import ImportBarrel
		gunModel[2] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import ImportBody
		gunModel[3] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import ImportSightRear
		gunModel[4] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Box14
		gunModel[5] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import Box15
		gunModel[6] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box24
		gunModel[7] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box25
		gunModel[8] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box28
		gunModel[9] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box32
		gunModel[10] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Box36
		gunModel[11] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box37
		gunModel[12] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box38
		gunModel[13] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Box39
		gunModel[14] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box41
		gunModel[15] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import Box42
		gunModel[16] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Import Box43
		gunModel[17] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box44
		gunModel[18] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box45
		gunModel[19] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box46
		gunModel[20] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box47

		gunModel[0].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import ImportAngledBody
		gunModel[0].setRotationPoint(4.5F, -2.5F, -0.1F);
		gunModel[0].rotateAngleZ = -1.57079633F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import ImportBarrel
		gunModel[1].setRotationPoint(5.5F, -3F, 0.4F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Import ImportBody
		gunModel[2].setRotationPoint(-1.5F, -3.5F, -0.1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportSightRear
		gunModel[3].setRotationPoint(20F, -4.5F, 0.4F);

		gunModel[4].addBox(0F, -1F, 0F, 2, 7, 2, 0F); // Import Box14
		gunModel[4].setRotationPoint(-4.4F, 0.77F, -0.1F);
		gunModel[4].rotateAngleZ = 3.14159265F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Import Box15
		gunModel[5].setRotationPoint(21.25F, -3F, 0.4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		gunModel[6].setRotationPoint(2.5F, -4.25F, 1.9F);
		gunModel[6].rotateAngleY = 3.14159265F;

		gunModel[7].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Import Box25
		gunModel[7].setRotationPoint(1.5F, -4.75F, -0.1F);

		gunModel[8].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Box28
		gunModel[8].setRotationPoint(0F, -5.75F, 0.4F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.25F, 0.15F, 0.15F); // Import Box32
		gunModel[9].setRotationPoint(2F, -7.25F, 3.4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Import Box36
		gunModel[10].setRotationPoint(19.5F, -3F, 0.4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		gunModel[11].setRotationPoint(-2.5F, -5.25F, 1.9F);
		gunModel[11].rotateAngleY = 3.14159265F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		gunModel[12].setRotationPoint(-2.5F, 1.75F, 1.9F);
		gunModel[12].rotateAngleY = 3.14159265F;
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Import Box39
		gunModel[13].setRotationPoint(-4.5F, -3.5F, -0.1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box41
		gunModel[14].setRotationPoint(1.5F, 1.75F, 1.9F);
		gunModel[14].rotateAngleY = 3.14159265F;
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addShapeBox(-4F, -1F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box42
		gunModel[15].setRotationPoint(-4.4F, 0.75F, -0.1F);
		gunModel[15].rotateAngleZ = 3.14159265F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		gunModel[16].setRotationPoint(7.5F, -2.5F, -0.1F);
		gunModel[16].rotateAngleZ = -1.57079633F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		gunModel[17].setRotationPoint(10.5F, -4.75F, 1.9F);
		gunModel[17].rotateAngleY = 3.14159265F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		gunModel[18].setRotationPoint(1.5F, -4.75F, 1.9F);
		gunModel[18].rotateAngleY = 3.14159265F;

		gunModel[19].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box46
		gunModel[19].setRotationPoint(20F, -3F, 0.4F);

		gunModel[20].addShapeBox(0F, 1F, -3F, 1, 1, 4, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box47
		gunModel[20].setRotationPoint(2F, -7.5F, 2.4F);
		gunModel[20].rotateAngleX = 0.52359878F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import ImportMagazine

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import ImportMagazine
		ammoModel[0].setRotationPoint(1.5F, -3F, -1.1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}