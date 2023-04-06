//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMuscleCuirassGeneral extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMuscleCuirassGeneral() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[53];
		leftArmModel = new ModelRendererTurbo[22];
		rightArmModel = new ModelRendererTurbo[22];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 97
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 4
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 201
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 202
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 207
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 208
		bodyModel[14] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 213
		bodyModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 214
		bodyModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 215
		bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 216
		bodyModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 224
		bodyModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 231
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 248
		bodyModel[21] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 254
		bodyModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 261
		bodyModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 262
		bodyModel[24] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 264
		bodyModel[25] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 265
		bodyModel[26] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 23
		bodyModel[28] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 25
		bodyModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		bodyModel[30] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 27
		bodyModel[31] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 85
		bodyModel[43] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 87
		bodyModel[45] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 88
		bodyModel[46] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 89
		bodyModel[47] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 90
		bodyModel[48] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 91
		bodyModel[49] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 92
		bodyModel[50] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 93
		bodyModel[51] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 94
		bodyModel[52] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 95

		bodyModel[0].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1F, 0.5F, -1F, 0.6F, 0.1F, -1F, 0.7F, 0F, 0F, 1.2F, 0F, 0.51F, 1F, 0.1F, 1F, 0.6F, 0.2F, 0F, 0.4F, 0F, 0F, 0.8F); // Box 96
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 6.5F, -2F, 4, 4, 4, 0F,0F, -0.5F, 1F, 0.1F, -1F, 0.6F, 0.2F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.15F, -0.4F, 0.4F, 0.15F, -0.4F, 0.2F, 0F, -0.3F, 0.4F); // Box 97
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 1.8F, -2.3F, 4, 2, 1, 0F,0.2F, 0F, 0.8F, -0.4F, 0.2F, 0.5F, -0.2F, 1.5F, -0.3F, 0.2F, 0.5F, -1.5F, -0.2F, 0.3F, 1.2F, 0.4F, 0.3F, 1F, 0.4F, 1.8F, -0.5F, 0.1F, 1.3F, -1F); // Box 15
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 7.5F, -3.2F, 4, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, -1.3F, -0.2F, -0.5F, -1.3F, -0.2F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F); // Box 16
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 5.5F, -3.2F, 4, 2, 1, 0F,-0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 17
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 9.8F, -2F, 8, 6, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 19
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 6.5F, -2F, 4, 4, 4, 0F,0.1F, -1F, 0.6F, 0F, -0.5F, 1F, 0F, 0F, 0.8F, 0.2F, 0F, 0.5F, 0.15F, -0.4F, 0.4F, 0F, 0F, 0.6F, 0F, -0.3F, 0.4F, 0.15F, -0.4F, 0.2F); // Box 2
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, -1F, 0.6F, 0F, 0F, 1F, 0F, 0F, 1.2F, 0.1F, -1F, 0.7F, 0.1F, 1F, 0.6F, 0F, 0.51F, 1F, 0F, 0F, 0.8F, 0.2F, 0F, 0.4F); // Box 3
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0.5F, 1.2F, 0.2F, 0.5F, 0.5F, 0.5F, 1F, 0.6F, 0F, 0F, 1F, 0F, 0F, 1.2F, 0.1F, 1F, 0.7F); // Box 4
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, -1F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, 0F, -0.3F, 0.5F, 0.2F, 0F, 0.7F, -0.5F, 0F, 1F, 0F, 0F, 1.2F, 0.2F, 0F, 0.5F); // Box 5
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 10.2F, -2.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 201
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, 10.2F, -2.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 202
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 10.2F, 1.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 207
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 10.2F, 1.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 208
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.2F, 10.2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 213
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.2F, 10.2F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 214
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(3.2F, 10.2F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 215
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3.2F, 10.2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 216
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 224
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 231
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-2.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 248
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 254
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.2F, 10.5F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 261
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3.2F, 10.5F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 262
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.2F, 10.5F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 264
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.2F, 10.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 265
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 3.5F, -2F, 4, 1, 1, 0F,0F, -0.5F, 1.4F, 0.5F, -1F, 0.8F, 0.1F, -1F, 0.7F, 0F, 0F, 1.2F, 0F, 1F, 1F, 0.1F, 1.7F, 0.8F, 0.2F, 0F, 0.4F, 0F, 0F, 0.8F); // Box 22
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 1.8F, -2.3F, 4, 2, 1, 0F,-0.4F, 0.2F, 0.5F, 0.2F, 0F, 0.8F, 0.2F, 0.5F, -1.5F, -0.2F, 1.5F, -0.3F, 0.4F, 0.3F, 1F, -0.2F, 0.3F, 1.2F, 0.1F, 1.3F, -1F, 0.4F, 1.8F, -0.5F); // Box 23
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 3.5F, -2F, 4, 1, 1, 0F,0.5F, -1F, 0.8F, 0F, -0.5F, 1.4F, 0F, 0F, 1.2F, 0.1F, -1F, 0.7F, 0.1F, 1.7F, 0.8F, 0F, 1F, 1F, 0F, 0F, 0.8F, 0.2F, 0F, 0.4F); // Box 25
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0F, -1F, -2F, 4, 2, 4, 0F,-1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, -0.5F, 0F, 1F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0F, 0F, 1.2F); // Box 26
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 1F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 1.2F, 0F, 0F, 1F, 0.5F, 1F, 0.6F, 0.1F, 1F, 0.7F, 0F, 0F, 1.2F); // Box 27
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.5F, 10.2F, -2.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 72
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2.5F, 10.2F, -2.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 73
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.5F, 10.2F, 1.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 74
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.5F, 10.2F, 1.2F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 75
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.2F, 10.5F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 76
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.2F, 10.5F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 77
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 79
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-0.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 80
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-1.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 81
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 82
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 10.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 83
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3.2F, 10.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 85
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.2F, 10.5F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 86
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(3.2F, 10.5F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 87
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-1.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 88
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-0.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 89
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(0.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 90
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 91
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 92
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(3.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, 0.1F, 1F, 0.5F, 0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 93
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-4.5F, 10.5F, -2.2F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, 0.1F, 1F, -0.5F); // Box 94
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4.2F, 10.5F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 95
		bodyModel[52].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 18
		leftArmModel[2] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 19
		leftArmModel[3] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 20
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 21
		leftArmModel[5] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 22
		leftArmModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 23
		leftArmModel[7] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 24
		leftArmModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 25
		leftArmModel[9] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 26
		leftArmModel[10] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 27
		leftArmModel[11] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 28
		leftArmModel[12] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 29
		leftArmModel[13] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 30
		leftArmModel[14] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 31
		leftArmModel[15] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 32
		leftArmModel[16] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 33
		leftArmModel[17] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 34
		leftArmModel[18] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 35
		leftArmModel[19] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 66
		leftArmModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 67
		leftArmModel[21] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 68

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 18
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 19
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(0.5F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 20
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0.5F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 21
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 22
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 23
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 24
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 25
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0.5F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 26
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(0.5F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 27
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-1F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 28
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 29
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.4F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 30
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.4F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 31
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(2.4F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 32
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(2.4F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 33
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(2.4F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 34
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(2.4F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 35
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(-1F, -2.6F, -2.1F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 66
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-1F, -2.6F, 1.1F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 67
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(-1F, -2.6F, -0.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 68
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 3
		rightArmModel[3] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 6
		rightArmModel[4] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 7
		rightArmModel[5] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 10
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		rightArmModel[7] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 12
		rightArmModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		rightArmModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 14
		rightArmModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 15
		rightArmModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 16
		rightArmModel[12] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 17
		rightArmModel[13] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 36
		rightArmModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 37
		rightArmModel[15] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 38
		rightArmModel[16] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 39
		rightArmModel[17] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 40
		rightArmModel[18] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 41
		rightArmModel[19] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 69
		rightArmModel[20] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 70
		rightArmModel[21] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 71

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 3
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(0F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 6
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(0F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 7
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-1.5F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 10
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-1.5F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 11
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 12
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 13
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1.5F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 14
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-1.5F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 15
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(0F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 16
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(0F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 17
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.5F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 36
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.5F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 37
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.5F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 38
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3.5F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 39
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.5F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 40
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.5F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 41
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3F, -2.6F, -2.1F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 69
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-3F, -2.6F, -0.5F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 70
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-3F, -2.6F, 1.1F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 71
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 1

		leftLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.5F, -2F, 2, 2, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.5F, -2F, 2, 5, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.9F, 0.1F, 0F, -0.9F); // Box 1
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 75
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 26

		rightLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.5F, -2F, 2, 2, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F); // Box 75
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.5F, -2F, 2, 5, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.9F, 0.1F, 0F, -0.9F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}