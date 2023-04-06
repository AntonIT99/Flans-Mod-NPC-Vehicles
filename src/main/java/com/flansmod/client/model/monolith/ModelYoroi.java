//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Yoroi
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYoroi extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelYoroi() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];
		leftArmModel = new ModelRendererTurbo[10];
		rightArmModel = new ModelRendererTurbo[10];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];
		skirtFrontModel = new ModelRendererTurbo[7];
		skirtRearModel = new ModelRendererTurbo[7];

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
		bodyModel[1] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 28
		bodyModel[4] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 29
		bodyModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 30
		bodyModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 36
		bodyModel[11] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 72
		bodyModel[14] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 73
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 75
		bodyModel[16] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 76
		bodyModel[17] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 77
		bodyModel[18] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 79
		bodyModel[20] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 80
		bodyModel[21] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 81
		bodyModel[22] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 82
		bodyModel[23] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 84
		bodyModel[25] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 85
		bodyModel[26] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 86
		bodyModel[27] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 106

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 289
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 4F, -2.1F, 6, 6, 4, 0F,0.8F, 0.8F, 1F, 0.8F, 0.8F, 1F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.8F, 0.3F, 1F, 0.8F, 0.3F, 1F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F); // Box 26
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 1.5F, -3.2F, 1, 5, 5, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 27
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, 1.5F, -3.2F, 1, 5, 5, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 28
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 7F, -2F, 1, 3, 4, 0F,0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F); // Box 29
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 5F, -2F, 1, 2, 4, 0F,1F, -0.7F, 0.8F, -0.8F, 0F, 0.8F, -0.8F, 0F, 0.8F, 1F, -0.7F, 0.8F, 0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F); // Box 30
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 31
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 32
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 33
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(2F, 0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(3F, 5F, -2F, 1, 2, 4, 0F,-0.8F, 0F, 0.8F, 1F, -0.7F, 0.8F, 1F, -0.7F, 0.8F, -0.8F, 0F, 0.8F, -0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, -0.8F, -0.3F, 0.8F); // Box 36
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(3F, 7F, -2F, 1, 3, 4, 0F,-0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, 0.8F, 0.3F, 0.8F, -0.8F, 0.3F, 0.8F); // Box 37
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 10.5F, -2F, 1, 7, 4, 0F,0F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 1F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F, 1F, 0.3F, 1.8F); // Box 40
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, 0.5F, 2F, 1, 2, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 72
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2F, 0.5F, 2F, 1, 2, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 1F, 0.3F, 0F); // Box 73
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 3.1F, 2F, 6, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 75
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, 15.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, 1F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F, 1F, -0.1F, 1.5F); // Box 76
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.3F, 14.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, 1F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F, 1F, -0.1F, 1.4F); // Box 77
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.15F, 13.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.2F, -0.5F, -0.1F, 1.2F, -0.5F, -0.1F, 1.2F, 0.8F, -0.1F, 1.2F, 1F, -0.1F, 1.3F, -1.5F, -0.1F, 1.3F, -1.5F, -0.1F, 1.3F, 1F, -0.1F, 1.3F); // Box 78
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.05F, 12.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, 1F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F, 1F, -0.1F, 1.2F); // Box 79
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.9F, 11.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.8F, -0.1F, 1F, 1F, -0.1F, 1.1F, -1.5F, -0.1F, 1.1F, -1.5F, -0.1F, 1.1F, 1F, -0.1F, 1.1F); // Box 80
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.8F, 10.5F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, 1F, -0.1F, 1F, -1.5F, -0.1F, 1F, -1.5F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 81
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.8F, 10.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, 0.8F, -0.1F, 0.9F, -0.5F, -0.1F, 0.9F, -1.5F, -0.1F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F, -1.5F, -0.1F, 1F); // Box 82
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2.9F, 11.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1F, 0.8F, -0.1F, 1F, 0.8F, -0.1F, 1F, -0.5F, -0.1F, 1F, -1.5F, -0.1F, 1.1F, 1F, -0.1F, 1.1F, 1F, -0.1F, 1.1F, -1.5F, -0.1F, 1.1F); // Box 83
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(3.05F, 12.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, 0.8F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, -1.5F, -0.1F, 1.2F, 1F, -0.1F, 1.2F, 1F, -0.1F, 1.2F, -1.5F, -0.1F, 1.2F); // Box 84
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3.25F, 13.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.2F, 0.8F, -0.1F, 1.2F, 0.8F, -0.1F, 1.2F, -0.5F, -0.1F, 1.2F, -1.5F, -0.1F, 1.3F, 1F, -0.1F, 1.3F, 1F, -0.1F, 1.3F, -1.5F, -0.1F, 1.3F); // Box 85
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(3.3F, 14.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, 0.8F, -0.1F, 1.3F, -0.5F, -0.1F, 1.3F, -1.5F, -0.1F, 1.4F, 1F, -0.1F, 1.4F, 1F, -0.1F, 1.4F, -1.5F, -0.1F, 1.4F); // Box 86
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(3.5F, 15.5F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, 0.8F, -0.1F, 1.4F, -0.5F, -0.1F, 1.4F, -1.5F, -0.1F, 1.5F, 1F, -0.1F, 1.5F, 1F, -0.1F, 1.5F, -1.5F, -0.1F, 1.5F); // Box 87
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3.5F, 10.5F, -2F, 1, 7, 4, 0F,-0.5F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, -0.5F, 0.3F, 0.8F, -1.5F, 0.3F, 1.8F, 1F, 0.3F, 1.8F, 1F, 0.3F, 1.8F, -1.5F, 0.3F, 1.8F); // Box 88
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4F, 9.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 89
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4F, 8.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 90
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 7.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 91
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 6.3F, -2F, 1, 1, 4, 0F,0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F); // Box 92
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(3F, 6.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 93
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(3F, 7.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 94
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(3F, 8.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 95
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(3F, 9.3F, -2F, 1, 1, 4, 0F,-0.5F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F, 0.7F, -0.5F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, 1F, -0.1F, 0.7F, -1.5F, -0.1F, 0.7F); // Box 96
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 6.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 97
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 7.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 98
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4F, 8.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 99
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 9.3F, 1F, 8, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 100
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3F, 5.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 101
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, 4.3F, 1F, 6, 1, 1, 0F,0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F); // Box 102
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 6.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 103
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 7.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 104
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 8.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 105
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 9.3F, -2F, 8, 1, 1, 0F,0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, 1F, 0.7F, -0.1F, -1.5F, 0.7F, -0.1F, -1.5F); // Box 106
		bodyModel[46].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 54
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 57
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 58
		leftArmModel[4] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 59
		leftArmModel[5] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 60
		leftArmModel[6] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 61
		leftArmModel[7] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 62
		leftArmModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 63
		leftArmModel[9] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 109

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.8F, -2.5F, -3.5F, 1, 9, 7, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Box 54
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.9F, -0.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 57
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.9F, -1.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 58
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.9F, -2.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 59
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.9F, 0.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 60
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.9F, 1.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 61
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.9F, 2.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 62
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.9F, 3.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 63
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2.9F, 4.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 109
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 64
		rightArmModel[2] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 65
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 66
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 67
		rightArmModel[5] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 68
		rightArmModel[6] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 69
		rightArmModel[7] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 70
		rightArmModel[8] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 71
		rightArmModel[9] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 108

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, 3.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 64
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, -2.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 65
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4F, -1.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 66
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-4F, -0.6F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 67
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4F, 0.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 68
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-4F, 1.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 69
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-4F, 2.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 70
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.9F, -2.5F, -3.5F, 1, 9, 7, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Box 71
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-4F, 4.4F, -3.5F, 1, 1, 7, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.15F, -0.1F, 0F); // Box 108
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 20
		leftLegModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 20
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 21
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		rightLegModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		rightLegModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		rightLegModel[4] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 18
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 19
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 22
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 35
		skirtFrontModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 41
		skirtFrontModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 42
		skirtFrontModel[3] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 43
		skirtFrontModel[4] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 44
		skirtFrontModel[5] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 45
		skirtFrontModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 46

		skirtFrontModel[0].addShapeBox(-3.5F, -1.5F, -3F, 7, 7, 1, 0F,0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, -0.5F, 0.8F, 0.3F, -0.5F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, -1.5F); // Box 35
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4F, 3.5F, -4F, 8, 1, 1, 0F,0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F); // Box 41
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-4F, 2.5F, -3.9F, 8, 1, 1, 0F,0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F); // Box 42
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-4F, 1.5F, -3.8F, 8, 1, 1, 0F,0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, -0.3F); // Box 43
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-4F, 0.5F, -3.7F, 8, 1, 1, 0F,0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F); // Box 44
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[5].addShapeBox(-4F, -0.5F, -3.6F, 8, 1, 1, 0F,0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F); // Box 45
		skirtFrontModel[5].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[6].addShapeBox(-4F, -1.5F, -3.5F, 8, 1, 1, 0F,0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F); // Box 46
		skirtFrontModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 47
		skirtRearModel[1] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 48
		skirtRearModel[2] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 49
		skirtRearModel[3] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 50
		skirtRearModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 51
		skirtRearModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 52
		skirtRearModel[6] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 53

		skirtRearModel[0].addShapeBox(-3.5F, -1.5F, 2F, 7, 7, 1, 0F,0.8F, 0.3F, -0.5F, 0.8F, 0.3F, -0.5F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, -1.5F, 1.8F, 0.3F, 1F, 1.8F, 0.3F, 1F); // Box 47
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-4F, -1.5F, 2.5F, 8, 1, 1, 0F,0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, -0.3F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 48
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-4F, -0.5F, 2.6F, 8, 1, 1, 0F,0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 49
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[3].addShapeBox(-4F, 0.5F, 2.7F, 8, 1, 1, 0F,0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, -0.3F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F); // Box 50
		skirtRearModel[3].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[4].addShapeBox(-4F, 1.5F, 2.8F, 8, 1, 1, 0F,0.7F, -0.1F, -0.3F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, -0.3F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F); // Box 51
		skirtRearModel[4].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[5].addShapeBox(-4F, 2.5F, 2.9F, 8, 1, 1, 0F,0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.2F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, -0.3F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F); // Box 52
		skirtRearModel[5].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[6].addShapeBox(-4F, 3.5F, 3F, 8, 1, 1, 0F,0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.2F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, -0.3F, 0.9F, -0.1F, 0F, 0.9F, -0.1F, 0F); // Box 53
		skirtRearModel[6].setRotationPoint(0F, 0F, 0F);
	}
}