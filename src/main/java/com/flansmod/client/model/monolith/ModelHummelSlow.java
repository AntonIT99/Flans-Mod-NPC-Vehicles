//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: hummelSlow
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHummelSlow extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHummelSlow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[46];
		barrelModel = new ModelRendererTurbo[56];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 24
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		bodyModel[2] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 75
		bodyModel[3] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 76
		bodyModel[4] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 77
		bodyModel[5] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 78
		bodyModel[6] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 87
		bodyModel[7] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 88
		bodyModel[8] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 81
		bodyModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 112
		bodyModel[10] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 113
		bodyModel[11] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 115
		bodyModel[13] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 116
		bodyModel[14] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 118
		bodyModel[15] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 119
		bodyModel[16] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 120
		bodyModel[17] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 121
		bodyModel[18] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 122
		bodyModel[19] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 123
		bodyModel[20] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 136
		bodyModel[22] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 137
		bodyModel[23] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 138
		bodyModel[24] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 139
		bodyModel[25] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 140
		bodyModel[26] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 141
		bodyModel[27] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 142
		bodyModel[28] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 143
		bodyModel[29] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 144
		bodyModel[30] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 145
		bodyModel[31] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 146
		bodyModel[32] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 147
		bodyModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 148
		bodyModel[34] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 149
		bodyModel[35] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 150
		bodyModel[36] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 151
		bodyModel[37] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 152
		bodyModel[38] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 153
		bodyModel[39] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 154
		bodyModel[40] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 156
		bodyModel[41] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 157
		bodyModel[42] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 158
		bodyModel[43] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 159
		bodyModel[44] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 160
		bodyModel[45] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 161

		bodyModel[0].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[0].setRotationPoint(-32.25F, -30.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 34, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 74
		bodyModel[1].setRotationPoint(-34.5F, -1F, 21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 34, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[2].setRotationPoint(-34.5F, -13F, 21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 34, 11, 6, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[3].setRotationPoint(-34.5F, -24F, 21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 26, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 77
		bodyModel[4].setRotationPoint(-30.5F, -11F, 27F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 24, 7, 2, 0F,-7F, 2F, 0F, -7F, 2F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 78
		bodyModel[5].setRotationPoint(-29.5F, -18F, 27F);

		bodyModel[6].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 20, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[6].setRotationPoint(-32.25F, -30.5F, -10F);

		bodyModel[7].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		bodyModel[7].setRotationPoint(-32.25F, -28.5F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 24, 7, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, -7F, -5F, 0F, -7F, -5F, 0F); // Box 81
		bodyModel[8].setRotationPoint(-29.5F, -3F, 27F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[9].setRotationPoint(-32F, -15F, -16F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[10].setRotationPoint(-34F, -30F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[11].setRotationPoint(-34F, -16F, -9F);

		bodyModel[12].addShapeBox(-95F, -0.5F, -2.5F, 35, 12, 5, 0F,0F, -16F, 0F, 60F, -2F, 0F, 60F, -2F, 0F, 0F, -16F, 0F, 0F, 9F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 0F, 9F, 0F); // Box 115
		bodyModel[12].setRotationPoint(-32F, -15F, -13.5F);
		bodyModel[12].rotateAngleY = 0.55850536F;

		bodyModel[13].addShapeBox(-101F, 15.5F, -3F, 6, 7, 6, 0F,2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.5F); // Box 116
		bodyModel[13].setRotationPoint(-32F, -15.5F, -13.5F);
		bodyModel[13].rotateAngleY = 0.55850536F;

		bodyModel[14].addShapeBox(7F, -4.7F, -6F, 6, 3, 1, 0F,0F, 0F, 0.5F, -0.5F, 1.8F, 0F, -0.5F, 1.8F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 1.5F, 0.5F); // Box 118
		bodyModel[14].setRotationPoint(-17.25F, -13.25F, -1F);

		bodyModel[15].addShapeBox(-0.5F, 0F, -0.5F, 1, 22, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 119
		bodyModel[15].setRotationPoint(-21.25F, -34.25F, -6.5F);
		bodyModel[15].rotateAngleZ = 0.76794487F;

		bodyModel[16].addShapeBox(-3F, 3F, -1.5F, 6, 16, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 120
		bodyModel[16].setRotationPoint(-21.25F, -34.25F, -6.5F);
		bodyModel[16].rotateAngleZ = 0.76794487F;

		bodyModel[17].addShapeBox(-3F, 3F, -3.5F, 6, 16, 2, 0F,-2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 121
		bodyModel[17].setRotationPoint(-21.25F, -34.25F, -6.5F);
		bodyModel[17].rotateAngleZ = 0.76794487F;

		bodyModel[18].addShapeBox(-3F, 3F, 0.5F, 6, 16, 2, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F); // Box 122
		bodyModel[18].setRotationPoint(-21.25F, -34.25F, -6.5F);
		bodyModel[18].rotateAngleZ = 0.76794487F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[19].setRotationPoint(-32F, -15F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 14, 2, 0F,1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[20].setRotationPoint(-34F, -30F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 34, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 136
		bodyModel[21].setRotationPoint(-34.5F, -1F, -27F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 34, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[22].setRotationPoint(-34.5F, -13F, -27F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 34, 11, 6, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[23].setRotationPoint(-34.5F, -24F, -27F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 26, 8, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[24].setRotationPoint(-30.5F, -11F, -29F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 24, 7, 2, 0F,-7F, -5F, 0F, -7F, -5F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 140
		bodyModel[25].setRotationPoint(-29.5F, -18F, -29F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 24, 7, 2, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, -7F, 2F, 0F, -7F, 2F, 0F); // Box 141
		bodyModel[26].setRotationPoint(-29.5F, -3F, -29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 142
		bodyModel[27].setRotationPoint(-22F, -12F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[28].setRotationPoint(-19F, -9F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[29].setRotationPoint(-22F, -12F, 16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[30].setRotationPoint(-15F, -7F, -11F);
		bodyModel[30].rotateAngleZ = -0.19198622F;

		bodyModel[31].addShapeBox(4F, 0F, 0F, 1, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[31].setRotationPoint(-15F, -3F, -16F);
		bodyModel[31].rotateAngleZ = -0.19198622F;

		bodyModel[32].addShapeBox(0F, 1F, 0F, 3, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[32].setRotationPoint(-15F, -7F, -15F);
		bodyModel[32].rotateAngleZ = -0.19198622F;

		bodyModel[33].addShapeBox(-2F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[33].setRotationPoint(-15F, -6.5F, -16F);
		bodyModel[33].rotateAngleZ = -0.78539816F;

		bodyModel[34].addShapeBox(-2F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[34].setRotationPoint(-15F, -6.5F, 15F);
		bodyModel[34].rotateAngleZ = -0.78539816F;

		bodyModel[35].addShapeBox(7F, -4.7F, 5.5F, 6, 3, 1, 0F,0F, 0F, 0.5F, -0.5F, 1.8F, 0F, -0.5F, 1.8F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 1.5F, 0.5F); // Box 150
		bodyModel[35].setRotationPoint(-17.25F, -13.25F, 0F);

		bodyModel[36].addShapeBox(-0.5F, 0F, 0F, 1, 22, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 151
		bodyModel[36].setRotationPoint(-21.25F, -34.25F, 5.5F);
		bodyModel[36].rotateAngleZ = 0.76794487F;

		bodyModel[37].addShapeBox(-3F, 3F, 0.5F, 6, 16, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 152
		bodyModel[37].setRotationPoint(-21.25F, -34.25F, 4.5F);
		bodyModel[37].rotateAngleZ = 0.76794487F;

		bodyModel[38].addShapeBox(-3F, 3F, 2.5F, 6, 16, 2, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F); // Box 153
		bodyModel[38].setRotationPoint(-21.25F, -34.25F, 4.5F);
		bodyModel[38].rotateAngleZ = 0.76794487F;

		bodyModel[39].addShapeBox(-3F, 3F, -1.5F, 6, 16, 2, 0F,-2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -2.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 154
		bodyModel[39].setRotationPoint(-21.25F, -34.25F, 4.5F);
		bodyModel[39].rotateAngleZ = 0.76794487F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[40].setRotationPoint(-23F, -12F, -7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 157
		bodyModel[41].setRotationPoint(-18F, -12F, -7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 158
		bodyModel[42].setRotationPoint(-28F, -12F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[43].setRotationPoint(-35F, -7F, -11F);

		bodyModel[44].addShapeBox(-95F, -0.5F, -2.5F, 35, 12, 5, 0F,0F, -16F, 0F, 60F, -2F, 0F, 60F, -2F, 0F, 0F, -16F, 0F, 0F, 9F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 0F, 9F, 0F); // Box 160
		bodyModel[44].setRotationPoint(-32F, -15F, 13.5F);
		bodyModel[44].rotateAngleY = -0.55850536F;

		bodyModel[45].addShapeBox(-101F, 15.5F, -3F, 6, 7, 6, 0F,2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.5F); // Box 161
		bodyModel[45].setRotationPoint(-32F, -15.5F, 13.5F);
		bodyModel[45].rotateAngleY = -0.55850536F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		barrelModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		barrelModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		barrelModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 16
		barrelModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		barrelModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 48
		barrelModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 49
		barrelModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 50
		barrelModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 51
		barrelModel[9] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 78
		barrelModel[10] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 79
		barrelModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 80
		barrelModel[12] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 86
		barrelModel[13] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 77
		barrelModel[14] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 78
		barrelModel[15] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 79
		barrelModel[16] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 80
		barrelModel[17] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 83
		barrelModel[18] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 84
		barrelModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 85
		barrelModel[20] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 86
		barrelModel[21] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 87
		barrelModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 88
		barrelModel[23] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 89
		barrelModel[24] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 90
		barrelModel[25] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 91
		barrelModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 92
		barrelModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 93
		barrelModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
		barrelModel[29] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 95
		barrelModel[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 96
		barrelModel[31] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 97
		barrelModel[32] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 98
		barrelModel[33] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 99
		barrelModel[34] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 100
		barrelModel[35] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 101
		barrelModel[36] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 102
		barrelModel[37] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 103
		barrelModel[38] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 104
		barrelModel[39] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 105
		barrelModel[40] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 108
		barrelModel[41] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 109
		barrelModel[42] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 110
		barrelModel[43] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 111
		barrelModel[44] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 117
		barrelModel[45] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 124
		barrelModel[46] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 125
		barrelModel[47] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 126
		barrelModel[48] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 128
		barrelModel[49] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 129
		barrelModel[50] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 130
		barrelModel[51] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 131
		barrelModel[52] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 132
		barrelModel[53] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 133
		barrelModel[54] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 134
		barrelModel[55] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 155

		barrelModel[0].addShapeBox(63F, -3.75F, -1.5F, 45, 7, 3, 0F,0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, -0.3F); // Box 2
		barrelModel[0].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[1].addShapeBox(63F, -3.75F, 1.2F, 45, 7, 2, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -2.5F, -0.2F, 0F, -2.3F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -2.5F, -0.2F, 0F, -2.3F, 0F); // Box 4
		barrelModel[1].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[2].addShapeBox(9.5F, -10.5F, -3F, 23, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[2].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[3].addShapeBox(9.5F, -12.5F, -3F, 23, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[3].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[4].addShapeBox(9.5F, -8.5F, -3F, 23, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 17
		barrelModel[4].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[5].addShapeBox(-13.5F, 1.25F, -2.5F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[5].setRotationPoint(-32.25F, -30.25F, 10F);

		barrelModel[6].addShapeBox(-13.5F, -1.75F, -2.5F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[6].setRotationPoint(-32.25F, -30.25F, 10F);

		barrelModel[7].addShapeBox(-13.5F, 4.25F, -2.5F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 50
		barrelModel[7].setRotationPoint(-32.25F, -30.25F, 10F);

		barrelModel[8].addShapeBox(-9.5F, 2.25F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[8].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[9].addShapeBox(37F, -3.65F, -3F, 26, 2, 6, 0F,0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 78
		barrelModel[9].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[10].addShapeBox(37F, -1.25F, -3F, 26, 2, 6, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 79
		barrelModel[10].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[11].addShapeBox(37F, 1.15F, -3F, 26, 2, 6, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F); // Box 80
		barrelModel[11].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[12].addShapeBox(-22F, 5.5F, 2F, 42, 4, 1, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 86
		barrelModel[12].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[13].addShapeBox(63F, -3.75F, -3.2F, 45, 7, 2, 0F,0F, -2.3F, 0F, 0F, -2.5F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, -2.5F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 77
		barrelModel[13].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[14].addShapeBox(7F, -1.7F, -3.5F, 30, 3, 7, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 78
		barrelModel[14].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[15].addShapeBox(7F, -4.7F, -3.5F, 30, 3, 7, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 79
		barrelModel[15].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[16].addShapeBox(7F, 1.3F, -3.5F, 30, 3, 7, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 80
		barrelModel[16].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[17].addShapeBox(-22F, 5.5F, -3F, 42, 4, 1, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 83
		barrelModel[17].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[18].addShapeBox(-22F, 9.5F, -3F, 42, 2, 6, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 84
		barrelModel[18].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[19].addShapeBox(-44F, 5.5F, -3F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[19].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[20].addShapeBox(40F, 5.5F, -3F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		barrelModel[20].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[21].addShapeBox(44F, 5.5F, -3F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // Box 87
		barrelModel[21].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[22].addShapeBox(-12F, -4.7F, -4F, 19, 7, 8, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 88
		barrelModel[22].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[23].addShapeBox(-14F, 2.3F, -4F, 21, 2, 8, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F); // Box 89
		barrelModel[23].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[24].addShapeBox(-14F, -4.7F, -4F, 2, 1, 8, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 90
		barrelModel[24].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[25].addShapeBox(-14F, -3.7F, -4F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 91
		barrelModel[25].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[26].addShapeBox(-14F, -3.7F, 3F, 2, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 92
		barrelModel[26].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[27].addShapeBox(-14F, 0.3F, 3F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 93
		barrelModel[27].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[28].addShapeBox(-14F, 0.3F, -4F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 94
		barrelModel[28].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[29].addShapeBox(-14F, -1.7F, -4F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		barrelModel[29].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[30].addShapeBox(32F, -10F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		barrelModel[30].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[31].addShapeBox(34F, -10F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F); // Box 97
		barrelModel[31].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[32].addShapeBox(8.5F, -11F, -3.5F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		barrelModel[32].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[33].addShapeBox(8.5F, -8F, -3.5F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 99
		barrelModel[33].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[34].addShapeBox(8.5F, -13F, -3.5F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		barrelModel[34].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[35].addShapeBox(-0.5F, -12.5F, -3F, 9, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[35].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[36].addShapeBox(-0.5F, -10.5F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[36].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[37].addShapeBox(-0.5F, -8.5F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 103
		barrelModel[37].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[38].addShapeBox(-1F, -4.7F, -7F, 7, 9, 2, 0F,0F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, 0.5F, 3F, 0F, 0.5F); // Box 104
		barrelModel[38].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[39].addShapeBox(-4F, 4.3F, -6.5F, 11, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 105
		barrelModel[39].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[40].addShapeBox(-0.5F, -9.5F, 0.5F, 1, 5, 5, 0F,-0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 108
		barrelModel[40].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[41].addShapeBox(6F, -9F, 0.5F, 1, 5, 5, 0F,-0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.1F, -3F, 0F, -0.1F, -3F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 109
		barrelModel[41].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[42].addShapeBox(-0.5F, -9.5F, -5.5F, 1, 5, 5, 0F,-0.1F, -3F, 0F, -0.1F, -3F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F); // Box 110
		barrelModel[42].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[43].addShapeBox(6F, -9F, -5.5F, 1, 5, 5, 0F,-0.1F, -3F, 0F, -0.1F, -3F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F); // Box 111
		barrelModel[43].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[44].addShapeBox(7F, -4.7F, -6F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 117
		barrelModel[44].setRotationPoint(-32.25F, -30.25F, -1F);

		barrelModel[45].addShapeBox(-4F, 4.3F, 4.5F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 124
		barrelModel[45].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[46].addShapeBox(-1F, -4.7F, 5F, 7, 9, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 3F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.2F, 3F, 0F, -0.2F); // Box 125
		barrelModel[46].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[47].addShapeBox(0.5F, -9.5F, -5.5F, 6, 5, 5, 0F,-0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F); // Box 126
		barrelModel[47].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[48].addShapeBox(0.5F, -9.5F, 0.5F, 6, 5, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 128
		barrelModel[48].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[49].addShapeBox(-6.5F, -10.5F, -3F, 6, 2, 6, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 129
		barrelModel[49].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[50].addShapeBox(-6.5F, -12.3F, -3F, 6, 2, 6, 0F,0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 130
		barrelModel[50].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[51].addShapeBox(-6.5F, -8.7F, -3F, 6, 2, 6, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F); // Box 131
		barrelModel[51].setRotationPoint(-32.25F, -30.25F, 0F);

		barrelModel[52].addShapeBox(-12F, -5.7F, -3F, 13, 1, 6, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 132
		barrelModel[52].setRotationPoint(-34.25F, -30.25F, 0F);

		barrelModel[53].addShapeBox(-8F, -10.7F, -3F, 2, 5, 6, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 133
		barrelModel[53].setRotationPoint(-34.25F, -30.25F, 0F);

		barrelModel[54].addShapeBox(-10F, -10.3F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 134
		barrelModel[54].setRotationPoint(-34.25F, -30.25F, 0F);

		barrelModel[55].addShapeBox(7F, -4.7F, 6F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 155
		barrelModel[55].setRotationPoint(-32.25F, -30.25F, 0F);
	}
}