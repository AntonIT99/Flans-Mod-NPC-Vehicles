//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gusoku
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGusoku extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelGusoku() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];
		leftArmModel = new ModelRendererTurbo[20];
		rightArmModel = new ModelRendererTurbo[20];
		leftLegModel = new ModelRendererTurbo[14];
		rightLegModel = new ModelRendererTurbo[14];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 47
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 40
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 54
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 56
		bodyModel[9] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 86
		bodyModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 87
		bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 54
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58
		bodyModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 95
		bodyModel[15] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 100
		bodyModel[16] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 103
		bodyModel[17] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
		bodyModel[19] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 110
		bodyModel[20] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 85
		bodyModel[21] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 86
		bodyModel[22] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 87
		bodyModel[23] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 89
		bodyModel[25] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 116
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 117
		bodyModel[27] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 118
		bodyModel[28] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 119
		bodyModel[29] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 120
		bodyModel[30] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 121
		bodyModel[31] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 122
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		bodyModel[33] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 124
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 125
		bodyModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 126
		bodyModel[36] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 127
		bodyModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 129
		bodyModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 130
		bodyModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 131
		bodyModel[41] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 132
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 133
		bodyModel[43] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 134
		bodyModel[44] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 135
		bodyModel[45] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 136
		bodyModel[46] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 137
		bodyModel[47] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 138
		bodyModel[48] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 139
		bodyModel[49] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 140
		bodyModel[50] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 141
		bodyModel[51] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 142
		bodyModel[52] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 143
		bodyModel[53] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 144
		bodyModel[54] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 145
		bodyModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 176
		bodyModel[56] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 177
		bodyModel[57] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 178
		bodyModel[58] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 179
		bodyModel[59] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 180

		bodyModel[0].addShapeBox(-4F, 9.9F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 0.5F, -2.5F, 2, 1, 5, 0F,0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.5F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, -1F, 0.7F, 0.2F, -0.5F, 0.7F, 0.2F); // Box 47
		bodyModel[1].setRotationPoint(0F, -1F, 0F);

		bodyModel[2].addShapeBox(-4F, 2.5F, -2.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 40
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 2.5F, -3F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 5F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 45
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 5F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 46
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.7F, -3.1F, 8, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 54
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 1.4F, -3F, 8, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 55
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 0.4F, -3F, 2, 1, 1, 0F,-0.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 56
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3.8F, 5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 61
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.5F, 0.5F, -2.5F, 2, 1, 5, 0F,-2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -1F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.7F, 0.2F, -1F, 0.7F, 0.2F); // Box 86
		bodyModel[10].setRotationPoint(0F, -1F, 0F);

		bodyModel[11].addShapeBox(2F, 0.4F, -3F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.8F, 5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 54
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5F, 5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 58
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 5F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 95
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, 5F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 100
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 1.25F, 1.8F, 8, 1, 1, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 103
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 1.25F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 106
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 0.4F, 1.9F, 8, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 108
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(4F, 5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 110
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(4F, 10.2F, -3F, 1, 6, 6, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, -0.7F, 0.5F, 1.7F, -0.7F, 0.5F, 1.7F, -0.5F, 0.5F, -1.6F, -0.5F, 0.5F); // Box 85
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(4.5F, 10.2F, -5F, 1, 1, 10, 0F,0F, 0F, -2.4F, -0.2F, 0F, -2.4F, -0.2F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0F, 0F, -2.4F); // Box 86
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(4.9F, 11.45F, -5F, 1, 1, 10, 0F,0F, 0F, -2.3F, -0.2F, 0F, -2.3F, -0.2F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0.2F, 0F, -2.3F, 0.2F, 0F, -2.3F, 0F, 0F, -2.3F); // Box 87
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(5.3F, 12.7F, -5F, 1, 1, 10, 0F,0F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0F, 0F, -2F); // Box 88
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(5.8F, 13.95F, -5F, 1, 1, 10, 0F,0F, 0F, -1.8F, -0.2F, 0F, -1.8F, -0.2F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0.2F, 0F, -1.8F, 0.2F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 89
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.5F, 6.25F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 116
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.5F, 6.25F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 117
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(3.8F, 6.25F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 118
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(4F, 6.25F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 119
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.5F, 6.25F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 120
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.5F, 6.25F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 121
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4.8F, 6.25F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 122
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-5F, 6.25F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 123
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4.5F, 7.5F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 124
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4.5F, 7.5F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 125
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(3.8F, 7.5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 126
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(4F, 7.5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 127
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.5F, 7.5F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.5F, 7.5F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 129
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.8F, 7.5F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 130
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-5F, 7.5F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 131
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.5F, 8.75F, -2.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.5F, 8.75F, -3F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 133
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.8F, 8.75F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 134
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(4F, 8.75F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 135
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.5F, 8.75F, 1.8F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 136
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.5F, 8.75F, 2F, 27, 1, 1, 0F,0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -17.7F, 0F, 0F, -17.7F, 0F, 0F, 0.3F, 0F, 0F); // Box 137
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4.8F, 8.75F, -3F, 1, 1, 6, 0F,0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 138
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5F, 8.75F, -3F, 1, 1, 18, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -12.1F, 0F, 0F, -12.1F); // Box 139
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 2.5F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 140
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4F, 2.5F, 1.8F, 8, 1, 1, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 141
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-4F, 3.75F, -2.8F, 8, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 142
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4F, 3.75F, -3F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 143
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4F, 3.75F, 2F, 24, 1, 1, 0F,-0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -16.1F, 0F, 0F, -16.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 144
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-4F, 3.75F, 1.8F, 8, 1, 1, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 145
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-5F, 10.2F, -3F, 1, 6, 6, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1.7F, -0.7F, 0.5F, -1.6F, -0.7F, 0.5F, -1.6F, -0.5F, 0.5F, 1.7F, -0.5F, 0.5F); // Box 176
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-6.8F, 13.95F, -5F, 1, 1, 10, 0F,-0.2F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, -0.2F, 0F, -1.8F, 0.2F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0.2F, 0F, -1.8F); // Box 177
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-6.3F, 12.7F, -5F, 1, 1, 10, 0F,-0.2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.2F, 0F, -2F, 0.2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.2F, 0F, -2F); // Box 178
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-5.9F, 11.45F, -5F, 1, 1, 10, 0F,-0.2F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, -0.2F, 0F, -2.3F, 0.2F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0.2F, 0F, -2.3F); // Box 179
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-5.5F, 10.2F, -5F, 1, 1, 10, 0F,-0.2F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, -0.2F, 0F, -2.4F, 0.2F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0.2F, 0F, -2.4F); // Box 180
		bodyModel[59].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 104
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 151
		leftArmModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 152
		leftArmModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 153
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 154
		leftArmModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 155
		leftArmModel[6] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 156
		leftArmModel[7] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 157
		leftArmModel[8] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 158
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 159
		leftArmModel[10] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 160
		leftArmModel[11] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 161
		leftArmModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 162
		leftArmModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 163
		leftArmModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 164
		leftArmModel[15] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 165
		leftArmModel[16] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 166
		leftArmModel[17] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 167
		leftArmModel[18] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 195
		leftArmModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 196

		leftArmModel[0].addShapeBox(1.5F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -3.5F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 151
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1.25F, -3F, -3F, 1, 1, 6, 0F,0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F); // Box 152
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1.25F, -3.2F, -3F, 1, 1, 6, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 153
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0F, -3.2F, -3F, 1, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 154
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.2F, -3F, -3F, 1, 1, 6, 0F,0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 155
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.5F, -3F, -3F, 1, 1, 6, 0F,0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F); // Box 156
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.75F, -2F, -3F, 1, 1, 6, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 157
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.75F, -0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 158
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(3F, -2F, -3F, 1, 1, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 159
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(3F, -0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 160
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.75F, 1F, -3F, 1, 1, 6, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 161
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.4F, 3.5F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.4F, 3.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.4F, 3.5F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(0F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 166
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(2.2F, 7F, -2F, 1, 3, 4, 0F,0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Box 167
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(0F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(1.5F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 68
		rightArmModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 69
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 70
		rightArmModel[3] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 71
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 73
		rightArmModel[5] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 74
		rightArmModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 90
		rightArmModel[7] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 94
		rightArmModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 95
		rightArmModel[9] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 97
		rightArmModel[10] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 98
		rightArmModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 99
		rightArmModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 100
		rightArmModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 101
		rightArmModel[14] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 102
		rightArmModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 103
		rightArmModel[16] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 105
		rightArmModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 168
		rightArmModel[18] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 193
		rightArmModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 194

		rightArmModel[0].addShapeBox(-1F, -3F, -3F, 1, 1, 6, 0F,0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 68
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1F, -3.2F, -3F, 1, 1, 6, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 69
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.25F, -3.2F, -3F, 1, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 70
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2.25F, -3F, -3F, 1, 1, 6, 0F,0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.25F, -0.2F, -0.1F); // Box 71
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.5F, -3F, -3F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F); // Box 73
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(0F, -3.5F, -3F, 1, 1, 6, 0F,0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 74
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.75F, -2F, -3F, 1, 1, 6, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 90
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.75F, 1F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 94
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-4F, -2F, -3F, 1, 1, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 95
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.75F, -0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 97
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-4F, -0.5F, -3F, 1, 1, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 98
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.4F, 3.5F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.4F, 3.5F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.4F, 3.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 102
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.2F, 7F, -2F, 1, 3, 4, 0F,0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Box 103
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-2.5F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-1F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-2.5F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-1F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 85
		leftLegModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 87
		leftLegModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 83
		leftLegModel[4] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 84
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 109
		leftLegModel[6] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 51
		leftLegModel[7] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 53
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 115
		leftLegModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 173
		leftLegModel[10] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 182
		leftLegModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 183
		leftLegModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 185
		leftLegModel[13] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 187

		leftLegModel[0].addShapeBox(-1F, -2F, 1.6F, 4, 6, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.2F, -2.1F, 0.7F, -0.4F, -2.1F, 0.7F, -0.4F, 2.2F, -0.2F, -0.2F, 2.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2.3F, -0.75F, 2.6F, 7, 1, 1, 0F,-1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F); // Box 85
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2.3F, -2F, 2F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F); // Box 87
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2.3F, 0.5F, 3.1F, 7, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F); // Box 83
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2.3F, 1.75F, 3.5F, 7, 1, 1, 0F,-1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F); // Box 84
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 0.5F, -3.5F, 10, 10, 1, 0F,0.4F, -0.4F, -0.4F, -5.4F, 0F, -0.4F, -5.4F, 0F, 0F, 0.4F, -0.4F, 0F, 0F, -4.6F, -0.1F, -5F, -5F, -0.1F, -5F, -5F, -0.3F, 0F, -4.6F, -0.3F); // Box 109
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 7.5F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 53
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 115
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-1F, -2F, -2.6F, 4, 6, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.2F, 2.2F, 0.7F, -0.4F, 2.2F, 0.7F, -0.4F, -2.1F, -0.2F, -0.2F, -2.1F); // Box 173
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2.3F, -2F, -3F, 7, 1, 1, 0F,-2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 182
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-2.3F, -0.75F, -3.6F, 7, 1, 1, 0F,-1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F); // Box 183
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-2.3F, 0.5F, -4.1F, 7, 1, 1, 0F,-1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 185
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-2.3F, 1.75F, -4.5F, 7, 1, 1, 0F,-1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 187
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 146
		rightLegModel[1] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 147
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 148
		rightLegModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 149
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 150
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 169
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 170
		rightLegModel[7] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 171
		rightLegModel[8] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 172
		rightLegModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 175
		rightLegModel[10] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 181
		rightLegModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 184
		rightLegModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 186
		rightLegModel[13] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 188

		rightLegModel[0].addShapeBox(-3F, -2F, 1.6F, 4, 6, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, -0.4F, -2.1F, -0.2F, -0.2F, -2.1F, -0.2F, -0.2F, 2.2F, 0.7F, -0.4F, 2.2F); // Box 146
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-4.7F, -2F, 2F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F); // Box 147
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-4.7F, -0.75F, 2.6F, 7, 1, 1, 0F,-1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F); // Box 148
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-4.7F, 0.5F, 3.1F, 7, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F); // Box 149
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-4.7F, 1.75F, 3.5F, 7, 1, 1, 0F,-1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F); // Box 150
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-8.5F, 0.5F, -3.5F, 10, 10, 1, 0F,-5.4F, 0F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.4F, 0F, -5.4F, 0F, 0F, -5F, -5F, -0.1F, 0F, -4.6F, -0.1F, 0F, -4.6F, -0.3F, -5F, -5F, -0.3F); // Box 169
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 170
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 7.5F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 172
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-3F, -2F, -2.6F, 4, 6, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, -0.4F, 2.2F, -0.2F, -0.2F, 2.2F, -0.2F, -0.2F, -2.1F, 0.7F, -0.4F, -2.1F); // Box 175
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-4.7F, -2F, -3F, 7, 1, 1, 0F,-2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 181
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-4.7F, -0.75F, -3.6F, 7, 1, 1, 0F,-1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F); // Box 184
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-4.7F, 0.5F, -4.1F, 7, 1, 1, 0F,-1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 186
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-4.7F, 1.75F, -4.5F, 7, 1, 1, 0F,-1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 188
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 174
		skirtFrontModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 189
		skirtFrontModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 190
		skirtFrontModel[3] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 191
		skirtFrontModel[4] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 192

		skirtFrontModel[0].addShapeBox(-2F, -1.8F, -2.9F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 2.8F, 0.2F, 0F, 2.8F, 0.2F, 0F, -2.7F, 0.2F, 0F, -2.7F); // Box 174
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-3.5F, -1.8F, -3.4F, 7, 1, 1, 0F,-1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 189
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-3.5F, -0.550000000000001F, -4F, 7, 1, 1, 0F,-1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F); // Box 190
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-3.5F, 0.699999999999999F, -4.7F, 7, 1, 1, 0F,-1.6F, 0F, -0.2F, -1.6F, 0F, -0.2F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0.2F, -1.6F, 0F, 0.2F, -1.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 191
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-3.5F, 1.95F, -5.2F, 7, 1, 1, 0F,-1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 192
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 88
		skirtRearModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 89
		skirtRearModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 90
		skirtRearModel[3] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 81
		skirtRearModel[4] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 82

		skirtRearModel[0].addShapeBox(-2F, -1.8F, 1.9F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -2.7F, 0.2F, 0F, -2.7F, 0.2F, 0F, 2.8F, 0.2F, 0F, 2.8F); // Box 88
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-3.5F, -1.8F, 2.4F, 7, 1, 1, 0F,-1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F); // Box 89
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-3.5F, -0.550000000000001F, 3F, 7, 1, 1, 0F,-1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0.2F, -1.7F, 0F, 0.2F); // Box 90
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[3].addShapeBox(-3.5F, 0.699999999999999F, 3.7F, 7, 1, 1, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.2F, -1.6F, 0F, -0.2F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0.2F, -1.6F, 0F, 0.2F); // Box 81
		skirtRearModel[3].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[4].addShapeBox(-3.5F, 1.95F, 4.2F, 7, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F); // Box 82
		skirtRearModel[4].setRotationPoint(0F, 0F, 0F);
	}
}