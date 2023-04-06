//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Scorpio
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelScorpio extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelScorpio() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		barrelModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 49
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 51
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53

		bodyModel[0].addBox(-0.5F, 0F, -0.5F, 1, 15, 1, 0F); // Box 47
		bodyModel[0].setRotationPoint(0F, -5F, 0F);

		bodyModel[1].addBox(-0.5F, 0F, -0.5F, 13, 1, 1, 0F); // Box 48
		bodyModel[1].setRotationPoint(-6F, 9F, 0F);

		bodyModel[2].addBox(-0.5F, 0F, -0.5F, 1, 1, 13, 0F); // Box 49
		bodyModel[2].setRotationPoint(0F, 9F, -6F);

		bodyModel[3].addShapeBox(-0.5F, 0F, 0.5F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 50
		bodyModel[3].setRotationPoint(0F, 3F, 0F);
		bodyModel[3].rotateAngleX = -0.80285146F;

		bodyModel[4].addShapeBox(-0.5F, 0F, 0.5F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 51
		bodyModel[4].setRotationPoint(0F, 3F, 0F);
		bodyModel[4].rotateAngleX = -0.80285146F;
		bodyModel[4].rotateAngleY = -1.57079633F;

		bodyModel[5].addShapeBox(-0.5F, 0F, 0.5F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 52
		bodyModel[5].setRotationPoint(0F, 3F, 0F);
		bodyModel[5].rotateAngleX = -0.80285146F;
		bodyModel[5].rotateAngleY = -3.14159265F;

		bodyModel[6].addShapeBox(-0.5F, 0F, 0.5F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 53
		bodyModel[6].setRotationPoint(0F, 3F, 0F);
		bodyModel[6].rotateAngleX = -0.80285146F;
		bodyModel[6].rotateAngleY = -4.71238898F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 54
		barrelModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 55
		barrelModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 56
		barrelModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
		barrelModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 58
		barrelModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 59
		barrelModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 60
		barrelModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 61
		barrelModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 62
		barrelModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 63
		barrelModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 64
		barrelModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 65
		barrelModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		barrelModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 67
		barrelModel[14] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 68

		barrelModel[0].addBox(-22.5F, -3F, -1F, 32, 3, 2, 0F); // Box 54
		barrelModel[0].setRotationPoint(0F, -5F, 0F);

		barrelModel[1].addShapeBox(4.5F, -11F, 7F, 2, 13, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 55
		barrelModel[1].setRotationPoint(0F, -5F, 0F);

		barrelModel[2].addShapeBox(4.5F, -11F, -9F, 2, 13, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 56
		barrelModel[2].setRotationPoint(0F, -5F, 0F);

		barrelModel[3].addShapeBox(4F, -1.5F, 0F, 3, 2, 10, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F); // Box 57
		barrelModel[3].setRotationPoint(0F, -5F, 0F);

		barrelModel[4].addShapeBox(4F, -1.5F, -10F, 3, 2, 10, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 58
		barrelModel[4].setRotationPoint(0F, -5F, 0F);

		barrelModel[5].addShapeBox(4.5F, -3.5F, 7.5F, 1, 1, 11, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -5.8F, 0F, 0.2F, 6.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -5.8F, 0F, 0.2F, 6.2F, 0F, 0.2F); // Box 59
		barrelModel[5].setRotationPoint(0F, -5F, 0F);

		barrelModel[6].addShapeBox(4.5F, -3.5F, -18.5F, 1, 1, 11, 0F,6.2F, 0F, 0.2F, -5.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 6.2F, 0F, 0.2F, -5.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 60
		barrelModel[6].setRotationPoint(0F, -5F, 0F);

		barrelModel[7].addShapeBox(5F, -7.5F, 2F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		barrelModel[7].setRotationPoint(0F, -5F, 0F);

		barrelModel[8].addShapeBox(5F, -7.5F, -8F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		barrelModel[8].setRotationPoint(0F, -5F, 0F);

		barrelModel[9].addShapeBox(5F, -9.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		barrelModel[9].setRotationPoint(0F, -5F, 0F);

		barrelModel[10].addShapeBox(5F, -8.5F, -2.99F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		barrelModel[10].setRotationPoint(0F, -5F, 0F);

		barrelModel[11].addShapeBox(5F, -8.5F, 2.01F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[11].setRotationPoint(0F, -5F, 0F);

		barrelModel[12].addBox(-21.5F, -3.5F, -3F, 4, 4, 2, 0F); // Box 66
		barrelModel[12].setRotationPoint(0F, -5F, 0F);

		barrelModel[13].addBox(-20F, -8.5F, -2.5F, 1, 14, 1, 0F); // Box 67
		barrelModel[13].setRotationPoint(0F, -5F, 0F);

		barrelModel[14].addBox(-26.5F, -2F, -2.5F, 14, 1, 1, 0F); // Box 68
		barrelModel[14].setRotationPoint(0F, -5F, 0F);
	}
}