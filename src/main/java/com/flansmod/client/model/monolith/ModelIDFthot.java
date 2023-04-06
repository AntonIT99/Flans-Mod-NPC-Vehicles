//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: IDFthot
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIDFthot extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelIDFthot() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];
		bodyModel = new ModelRendererTurbo[55];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
		headModel[1] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 13
		headModel[2] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 14
		headModel[3] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 3
		headModel[5] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 4
		headModel[6] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 5
		headModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 6
		headModel[8] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 15
		headModel[9] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 11
		headModel[15] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 106
		headModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 53

		headModel[0].addShapeBox(-4F, -8.5F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -4.5F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -0.5F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -7.5F, -5F, 10, 3, 10, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -9.5F, -5F, 10, 2, 10, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -2F, -0.25F, -0.3F, -2F, -0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 4
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5.5F, -5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, 0.25F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 5
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 6
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -6F, -5.6F, 10, 1, 1, 0F,-0.1F, -0.5F, -1.02F, -0.1F, -0.5F, -1.02F, -0.1F, -0.5F, 0.02F, -0.1F, -0.5F, 0.02F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, -2F, 0.25F, -0.3F, -2F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.5F, -5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.3F, 0F, 0.75F, -1.3F, 0F, 1F, 0.3F, 0F, -1F, 0.3F, 0F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -5F, 4F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -4F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -4F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -6.5F, -4F, 8, 1, 8, 0F,0.775F, 0.2F, 0.6F, 0.775F, 0.2F, 0.6F, 0.825F, -0.3F, 0.9F, 0.825F, -0.3F, 0.9F, 0.825F, -0.5F, 0.65F, 0.825F, -0.5F, 0.65F, 0.925F, 0F, 1.025F, 0.925F, 0F, 1.025F); // Box 106
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -3.8F, -4.5F, 1, 2, 1, 0F,-0.4F, 0.2F, -0.71F, -0.4F, 0.2F, -0.71F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F); // Box 53
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 40
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 41
		bodyModel[8] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 43
		bodyModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
		bodyModel[12] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import 
		bodyModel[43] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import 
		bodyModel[44] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import 
		bodyModel[45] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import 
		bodyModel[46] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import 
		bodyModel[47] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import 
		bodyModel[48] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import 
		bodyModel[49] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import 
		bodyModel[50] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import 
		bodyModel[51] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import 
		bodyModel[52] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 95

		bodyModel[0].addShapeBox(-4.5F, 7.5F, -3.4F, 9, 1, 5, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.5F, -2.5F, 8, 3, 4, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -2.8F, 0F, -0.7F, -2.8F, 0F, -0.7F, 0.1F, -2F, 1F, 0.1F, -2F, 1F); // Box 20
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 8.5F, -3F, 9, 1, 5, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 2.5F, -3F, 7, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 36
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 7F, -3F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 37
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 0.5F, -2.5F, 7, 2, 4, 0F,-0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 38
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 1F, -2.5F, 3, 2, 1, 0F,-0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 40
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 3.01F, -2.5F, 3, 1, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 41
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0.5F, 3F, -2.5F, 3, 1, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.4F, 0.7F, -0.5F, -0.4F, 0.7F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 43
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.5F, 1.01F, -2.5F, 3, 2, 1, 0F,0F, -0.8F, 0.3F, -0.5F, -0.8F, 0.3F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 44
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 0.1F, -1.5F, 4, 5, 3, 0F,0F, -0.2F, 0F, -1.5F, 0.3F, 0F, -2.5F, 0.3F, 0.5F, 0F, -0.2F, 0.2F, -1.3F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1.3F, 0F, -1F); // Box 34
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 0.1F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.2F, 0.7F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0.7F, 0.7F, 0F, 0F); // Box 35
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 0.1F, -1.5F, 4, 5, 3, 0F,-1.5F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -2.5F, 0.3F, 0.5F, 0F, -1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -1F, -1F, -2F, 0F); // Box 36
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 0.1F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1F, -1F, 0.7F); // Box 37
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, -2.5F, -1.2F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.50000000000001F, 1.75F, -3F, 7, 1, 1, 0F,-0.3F, 0F, 0.0F, -0.3F, 0F, 0.0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.0F, 0.3F, 0.7F, 0.0F, 0.3F, 0.7F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.50000000000001F, 1.85F, -3.5F, 7, 1, 1, 0F,-0.2F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.50000000000001F, 3.45F, -3.6F, 7, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.50000000000001F, 5.05F, -3.3F, 7, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.50000000000001F, 6.65F, -3.4F, 7, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.50000000000001F, 8.25F, -3.4F, 7, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.50000000000001F, 3.35F, -3F, 7, 1, 1, 0F,0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0.5F, 0.3F, -0.2F, 0.5F, 0.3F, -0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F); // Box 61
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4.00000000000001F, -0.2F, -2.5F, 3, 2, 4, 0F,0.0F, 0F, -1F, -1.0F, 0.3F, -1F, -1F, 0.3F, 0.55F, 0.0F, 0F, 0.55F, -0.5F, 0F, 0.3F, 0.0F, 0F, 0.3F, 0.0F, 0F, 0.8F, -0.5F, 0F, 0.8F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(1F, -0.2F, -2.5F, 3, 2, 4, 0F,-1F, 0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0.55F, -1F, 0.3F, 0.55F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 64
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.00000000000001F, 1.81F, -3F, 8, 4, 5, 0F,-0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, 0.3F, -0.5F, 0.0F, 0.3F, -0.3F, 0.0F, 0F, -0.3F, 0.0F, 0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.50000000000001F, 5.34F, -3F, 7, 1, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 66
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.50000000000001F, 6.34F, -3F, 7, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 67
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.00000000000001F, 5.8F, -3F, 8, 4, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, -1F, -0.1F, 0.5F, -1F); // Box 68
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.19999999999998F, 6.75F, -3.8F, 2, 4, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.3F, 0F, 0.0F, 0.3F, 0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.00000000000001F, 6.75F, -3.8F, 2, 4, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.3F, 0F, 0.0F, 0.3F, 0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.2F, 6.75F, -3.8F, 2, 4, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.3F, 0F, 0.0F, 0.3F, 0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.2F, 6.65F, -4F, 2, 2, 1, 0F,0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Import 
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1.00000000000001F, 6.65F, -4F, 2, 2, 1, 0F,0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Import 
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.19999999999998F, 6.65F, -4F, 2, 2, 1, 0F,0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Import 
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.8F, 2.75F, -3.8F, 1, 2, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0.8F, 2.65F, -3.9F, 1, 1, 1, 0F,0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.2F, 0.05F, 0.0F, 0.2F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F); // Import 
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.00000000000001F, 2.7F, -3.5F, 4, 2, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-0.2F, 2.75F, -3.8F, 1, 2, 1, 0F,0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-0.2F, 2.65F, -3.9F, 1, 1, 1, 0F,0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.2F, 0.05F, 0.0F, 0.2F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.3F); // Import 
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.5F, 1F, 1.9F, 5, 1, 3, 0F,0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import 
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2.5F, 2.5F, 1.9F, 5, 3, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F); // Import 
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 1.9F, 1.5F, 7, 1, 3, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.49F, 0.0F, 0.0F, 3.48F, 0.0F, 0.0F, 3.49F, -0.5F, 0.0F, 3.49F, -0.5F); // Import 
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2F, 2.8F, 3.95F, 1, 3, 1, 0F,-0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Import 
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(1F, 2.8F, 3.95F, 1, 3, 1, 0F,-0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Import 
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1F, 0.95F, 3.95F, 1, 1, 1, 0F,-0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F); // Import 
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, 0.95F, 3.95F, 1, 1, 1, 0F,-0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F, -0.1F, 0.05F, 0.0F); // Import 
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2.5F, 5.7F, 1.9F, 5, 3, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F); // Import 
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2F, 8F, 3.8F, 4, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, 3.4F, 3.8F, 4, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 2F, 4.25F, 4, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2F, 5.3F, 3.65F, 4, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2F, 6.8F, 3.7F, 4, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F); // Import 
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.5F, 5.9F, 1.5F, 7, 1, 3, 0F,0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 3.2F, 0F, 0.0F, 3.2F, 0.0F, 0.0F, 3F, 0.0F, 0.0F, 3F, 0.0F); // Box 93
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(1F, 5.8F, 3.95F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F); // Box 94
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2F, 5.8F, 3.95F, 1, 4, 1, 0F,-0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F, -0.1F, 0F, 0.0F); // Box 95
		bodyModel[54].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 31
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 32
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 33

		leftArmModel[0].addShapeBox(-1.5F, -2F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -0.2F, -1F, -0.6F, -0.2F, -1F, -0.6F, 0F, 0F, 0F, -1F, 0F, -0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -1F, 0F, -0.3F); // Box 31
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.55F, 4F, -1F, 2, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 32
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.8F, 0F, -1F, 2, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Box 33
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 29
		rightArmModel[2] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 30

		rightArmModel[0].addShapeBox(-1.5F, -2F, -1.5F, 3, 3, 3, 0F,-0.2F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, -0.6F, -0.2F, 0F, -0.4F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -0.2F, 0F, -0.4F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.2F, 0F, -1F, 2, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 29
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-1.55F, 4F, -1F, 2, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 30
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 18
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		leftLegModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 22
		leftLegModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 23
		leftLegModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 32
		leftLegModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 33
		leftLegModel[8] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 97

		leftLegModel[0].addShapeBox(-1F, 0.4F, 1F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 17
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.7F, 0F, -2F, 4, 6, 4, 0F,-0.4F, 0F, 0.2F, 0.2F, 2.5F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.2F, 0F, 0F); // Box 18
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.7F, 6F, -2F, 3, 6, 4, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 19
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1F, -2.6F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 21
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-3F, 0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F); // Box 22
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-3F, -2.6F, 1F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F); // Box 23
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1F, 0.4F, -2F, 4, 1, 3, 0F,0F, 0.5F, 0F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 32
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1F, -2.6F, -2F, 4, 2, 3, 0F,0F, -0.8F, 0F, -0.5F, 0.1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 33
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.7F, 8F, -2F, 3, 4, 4, 0F,0F, 0.4F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.1F, -0.6F, 0.2F, 0.1F, -0.6F, 0.2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 97
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 24
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 26
		rightLegModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 27
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 28
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		rightLegModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 31
		rightLegModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 35
		rightLegModel[8] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 96

		rightLegModel[0].addShapeBox(1F, -2.6F, 1F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 24
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3F, -2.6F, 1F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(1F, 0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 0F, 0F, -1F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, 0.4F, 1F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.2F, 0F, -2F, 4, 6, 4, 0F,0.2F, 2.5F, 0.5F, -0.4F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-1.2F, 6F, -2F, 3, 6, 4, 0F,0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3F, 0.4F, -2F, 4, 1, 3, 0F,-0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 31
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3F, -2.6F, -2F, 4, 2, 3, 0F,-0.5F, 0.1F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0.5F, -0.5F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 35
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-1.2F, 8F, -2F, 3, 4, 4, 0F,0.2F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 96
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}
}