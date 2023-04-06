//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AshigaruLamellar
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAshigaruLamellar extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAshigaruLamellar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[49];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[5];
		skirtRearModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 289
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 29
		bodyModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 36
		bodyModel[9] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 37
		bodyModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 40
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 72
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 76
		bodyModel[15] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 77
		bodyModel[16] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 79
		bodyModel[17] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 81
		bodyModel[18] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 84
		bodyModel[20] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 86
		bodyModel[21] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 87
		bodyModel[22] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 88
		bodyModel[23] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 92
		bodyModel[24] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 93
		bodyModel[25] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 103
		bodyModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		bodyModel[28] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 92
		bodyModel[29] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[30] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 94
		bodyModel[31] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 97
		bodyModel[32] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 98
		bodyModel[33] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 99
		bodyModel[34] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 100
		bodyModel[35] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 101
		bodyModel[36] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 103
		bodyModel[38] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 104
		bodyModel[39] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 105
		bodyModel[40] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 107
		bodyModel[42] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 109
		bodyModel[44] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 110
		bodyModel[45] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 111
		bodyModel[46] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 112
		bodyModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 113
		bodyModel[48] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 114

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 289
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 3F, -2.1F, 6, 7, 4, 0F,0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.3F, 0.5F, 0.8F, 0.3F, 0.5F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F); // Box 26
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7F, -2F, 1, 3, 4, 0F,0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F); // Box 29
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 5F, -2F, 1, 2, 4, 0F,1F, -0.7F, 0.8F, -0.8F, 0F, 0.8F, -0.8F, 0F, 0.8F, 1F, -0.7F, 0.8F, 0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F); // Box 30
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 31
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 32
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 33
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 34
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(3F, 5F, -2F, 1, 2, 4, 0F,-0.8F, 0F, 0.8F, 1F, -0.7F, 0.8F, 1F, -0.7F, 0.8F, -0.8F, 0F, 0.8F, -0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F); // Box 36
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3F, 7F, -2F, 1, 3, 4, 0F,-0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F); // Box 37
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 10.5F, -2F, 1, 4, 4, 0F,0F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 1F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F, 1F, 0.3F, 1.8F); // Box 40
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 0F, 2F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 72
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2F, 0F, 2F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F); // Box 73
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, 1.6F, 2F, 6, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 75
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 13.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, 1F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F, 1F, -0.1F, 1.5F); // Box 76
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.3F, 12.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, 1F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F, 1F, -0.1F, 1.4F); // Box 77
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.05F, 11.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, 1F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F, 1F, -0.1F, 1.2F); // Box 79
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.8F, 10.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, 1F, -0.1F, 1F, -1.5F, -0.1F, 1F, -1.5F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 81
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2.8F, 10.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, -1.5F, -0.1F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F, -1.5F, -0.1F, 1F); // Box 82
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.05F, 11.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, -1.5F, -0.1F, 1.2F, 1F, -0.1F, 1.2F, 1F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F); // Box 84
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.3F, 12.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, -1.5F, -0.1F, 1.4F, 1F, -0.1F, 1.4F, 1F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F); // Box 86
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.5F, 13.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, -1.5F, -0.1F, 1.5F, 1F, -0.1F, 1.5F, 1F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F); // Box 87
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.5F, 10.5F, -2F, 1, 4, 4, 0F,-0.5F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, -1.5F, 0.3F, 1.8F, 1F, 0.3F, 1.8F, 1F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F); // Box 88
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 6.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 92
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(3F, 6.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 93
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 6.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 97
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 6.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 103
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3F, 2.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 91
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, 1F, -3.2F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 92
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 1F, -3.2F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 2F, 0.3F, 0F); // Box 93
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3F, 2.6F, -3.2F, 6, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F); // Box 94
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3F, 3.3F, -2F, 6, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 97
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 7.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 98
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(3F, 7.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 99
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 7.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 100
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 7.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 101
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4F, 8.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 102
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(3F, 8.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 103
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 8.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 104
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4F, 8.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 105
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 9.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 106
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3F, 9.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 107
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 9.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 108
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 9.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 109
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3F, 4.3F, -2F, 6, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 110
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3F, 3.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 111
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3F, 5.3F, -2F, 6, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 112
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3F, 4.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 113
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3F, 5.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 114
		bodyModel[48].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 11F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 11F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 35
		skirtFrontModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 41
		skirtFrontModel[2] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 42
		skirtFrontModel[3] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 44
		skirtFrontModel[4] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 46

		skirtFrontModel[0].addShapeBox(-3.5F, -1.5F, -3F, 7, 4, 1, 0F,0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, -0.5F, 0.8F, 0.3F, -0.5F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, -1.5F); // Box 35
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4F, 1.5F, -4F, 8, 1, 1, 0F,0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F); // Box 41
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-4F, 0.5F, -3.9F, 8, 1, 1, 0F,0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F); // Box 42
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-4F, -0.5F, -3.7F, 8, 1, 1, 0F,0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F); // Box 44
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-4F, -1.5F, -3.5F, 8, 1, 1, 0F,0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F); // Box 46
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
		skirtRearModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 48
		skirtRearModel[2] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 50
		skirtRearModel[3] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 52
		skirtRearModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 53

		skirtRearModel[0].addShapeBox(-3.5F, -1.5F, 2F, 7, 4, 1, 0F,0.8F, 0.3F, -0.5F, 0.8F, 0.3F, -0.5F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, 1F); // Box 47
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-4F, -1.5F, 2.5F, 8, 1, 1, 0F,0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 48
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-4F, -0.5F, 2.7F, 8, 1, 1, 0F,0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F); // Box 50
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[3].addShapeBox(-4F, 0.5F, 2.9F, 8, 1, 1, 0F,0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F); // Box 52
		skirtRearModel[3].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[4].addShapeBox(-4F, 1.5F, 3F, 8, 1, 1, 0F,0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, 0F); // Box 53
		skirtRearModel[4].setRotationPoint(0F, 0F, 0F);
	}
}