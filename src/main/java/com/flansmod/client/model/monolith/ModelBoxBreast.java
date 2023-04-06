//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BoxBreast
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBoxBreast extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBoxBreast() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];
		leftArmModel = new ModelRendererTurbo[8];
		rightArmModel = new ModelRendererTurbo[8];
		leftLegModel = new ModelRendererTurbo[12];
		rightLegModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 201
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 202
		bodyModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 105
		bodyModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 84
		bodyModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 85
		bodyModel[5] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 87
		bodyModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 48
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 85
		bodyModel[10] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 107
		bodyModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108
		bodyModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 109
		bodyModel[13] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 110
		bodyModel[14] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 111
		bodyModel[15] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 112
		bodyModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 114
		bodyModel[17] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 115
		bodyModel[18] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 116
		bodyModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 117
		bodyModel[20] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 118
		bodyModel[21] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 119
		bodyModel[22] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 120
		bodyModel[23] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 121
		bodyModel[24] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 122
		bodyModel[25] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 123
		bodyModel[26] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 124
		bodyModel[27] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 125
		bodyModel[28] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 127
		bodyModel[29] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 129
		bodyModel[31] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 130
		bodyModel[32] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 131
		bodyModel[33] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 132
		bodyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 138
		bodyModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 142
		bodyModel[39] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 143
		bodyModel[40] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 144
		bodyModel[41] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 145
		bodyModel[42] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 146
		bodyModel[43] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 147
		bodyModel[44] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 148
		bodyModel[45] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 150
		bodyModel[47] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 151
		bodyModel[48] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 152
		bodyModel[49] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 153
		bodyModel[50] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 154
		bodyModel[51] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 155
		bodyModel[52] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 74
		bodyModel[54] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 75
		bodyModel[55] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 165
		bodyModel[56] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 166
		bodyModel[57] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 167

		bodyModel[0].addShapeBox(2F, 4F, -2F, 6, 4, 2, 0F,-0.6F, 0F, 1.7F, -3.2F, 0F, 1.6F, -3.2F, -1F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 2.8F, -3.2F, -0.6F, 2.7F, -3.2F, -0.6F, 0F, -0.5F, -0.6F, 0F); // Box 201
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(1F, 0F, -2F, 2, 4, 1, 0F,0F, -0.5F, 0.6F, -0.5F, 0.2F, 0.4F, -0.5F, 0.7F, -0.2F, 0F, -0.5F, -0.3F, -0.6F, 0F, 1.7F, -0.4F, 0F, 1.7F, -0.5F, 0F, -1.2F, 0F, -0.5F, -1.2F); // Box 202
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 8.7F, -3.5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 105
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 4F, -2.2F, 7, 4, 1, 0F,-0.9F, 0F, 1.5F, -0.9F, 0F, 1.5F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 2.6F, -0.9F, -0.6F, 2.6F, -0.9F, -0.6F, -0.2F, -0.9F, -0.6F, 0F); // Box 84
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.5F, 0F, -2.2F, 5, 4, 1, 0F,-1.5F, -0.5F, 0.4F, -1.5F, -0.5F, 0.4F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.9F, 0F, 1.5F, -0.9F, 0F, 1.5F, -0.9F, 0F, 0F, -0.9F, 0F, 0F); // Box 85
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.5F, 6.8F, -2.2F, 5, 3, 1, 0F,0.1F, -0.6F, 2.6F, 0.1F, -0.6F, 2.6F, 0.1F, -0.6F, -0.2F, 0.1F, -0.6F, 0F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F, 1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 87
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 4.8F, -2.5F, 9, 6, 5, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F); // Box 48
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 5, 5, 0F,-0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 42
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2F, 8.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, -0.7F); // Box 35
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 8.7F, -3.5F, 2, 1, 7, 0F,0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.25F, 0F, -1F, 0.15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.15F, 0F, -1F); // Box 85
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 6.8F, -2F, 6, 3, 2, 0F,-0.6F, -0.6F, 2.8F, -3.2F, -0.6F, 2.7F, -3.2F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.2F, -0.5F, 1.7F, -3.6F, -0.5F, 0.6F, -3.6F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 107
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 0F, -2F, 6, 4, 1, 0F,-0.5F, 0.2F, 0.4F, -3.4F, 0F, 0.3F, -3.4F, 0.5F, -0.2F, -0.5F, 0.7F, -0.2F, -0.6F, 0F, 1.7F, -3.2F, 0F, 1.6F, -3.2F, 0.5F, -2F, -0.5F, 0.5F, -2F); // Box 108
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 0.2F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1.5F, 0F, 0.4F, 0.1F, 0F, 0.6F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F); // Box 109
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, -0.5F, 1F, 9, 5, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F); // Box 110
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2F, 9.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0.3F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0F, 0F, -0.1F, 0F, -0.5F, 0.1F, 0.3F, -0.5F, -0.9F, 0.3F, -0.5F, -0.9F, 0F, -0.5F, -0.3F); // Box 111
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 9.7F, -3.5F, 4, 1, 7, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 112
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2F, 10.2F, -3.5F, 4, 1, 7, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 10.2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0.6F, 0.8F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, -0.5F, 0.4F, 0.6F, -0.5F, -0.6F, 0.6F, -0.5F, -0.6F, 0F, -0.5F, 0F); // Box 115
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, 10.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0.9F, 1.1F, 0F, -0.1F, 1.1F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.7F, 0.9F, -0.5F, -0.3F, 0.9F, -0.5F, -0.3F, 0F, -0.5F, 0.3F); // Box 116
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 10.7F, -3.5F, 4, 1, 7, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 117
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 11.2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 1.1F, 1.4F, 0F, 0.1F, 1.4F, 0F, 0.1F, 0F, 0F, 0.7F, 0F, -0.25F, 0.9F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, 0.5F); // Box 118
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 11.2F, -3.5F, 4, 1, 7, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 119
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 11.95F, -3.5F, 2, 1, 7, 0F,0F, 0F, 1.3F, 1.7F, 0F, 0.3F, 1.7F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, -0.25F, 1.1F, 1.5F, -0.25F, 0.1F, 1.5F, -0.25F, 0.1F, 0F, -0.25F, 1.1F); // Box 120
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, 11.95F, -3.5F, 4, 1, 7, 0F,0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -0.25F, 1.1F, 0F, -0.25F, 1.1F, 0F, -0.25F, 0.7F, 0F, -0.25F, 0.7F); // Box 121
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2F, 12.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 1.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 1.1F, 0F, 0F, 1.3F, 1.8F, 0F, 0.3F, 1.8F, 0F, 0.3F, 0F, 0F, 1.3F); // Box 122
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2F, 12.7F, -3.5F, 4, 1, 7, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 123
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 13.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 1.7F, 2.3F, 0F, 0.7F, 2.3F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0.5F, 1.5F, 2.2F, 0.5F, 0.5F, 2.2F, 0.5F, 0.5F, 0F, 0.5F, 1.5F); // Box 124
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 13.7F, -3.5F, 4, 1, 7, 0F,0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.1F, 0F, 0.5F, 1.1F); // Box 125
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2F, 15.2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 1.9F, 2.6F, 0F, 0.9F, 2.6F, 0F, 0.9F, 0F, 0F, 1.5F, 0F, 0.5F, 1.7F, 2.6F, 0.5F, 0.7F, 2.6F, 0.5F, 0.7F, 0F, 0.5F, 1.7F); // Box 127
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 16.7F, -3.5F, 2, 1, 7, 0F,0F, 0F, 2.1F, 2.8F, 0F, 1.1F, 2.8F, 0F, 1.1F, 0F, 0F, 1.7F, 0F, 0.5F, 1.9F, 3F, 0.2F, 1.1F, 3F, 0.2F, 1.1F, 0F, 0.5F, 1.9F); // Box 128
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 16.7F, -3.5F, 1, 1, 7, 0F,0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, -0.5F, 0F, 1.9F, 0F, 0.5F, 1.9F, 0F, 0.5F, 1.5F, -0.5F, 0F, 1.5F); // Box 129
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1F, 15.2F, -3.5F, 1, 1, 7, 0F,1F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 0F, 0.5F, 1.7F, 0F, 0.5F, 1.7F, 0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F); // Box 130
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0F, 4F, 0F, 5, 4, 2, 0F,0F, -0.5F, 0F, -0.2F, -1F, 0F, -0.3F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.5F, -0.6F, 1.6F, 0F, -0.6F, 1.6F); // Box 131
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 6.8F, 0F, 5, 3, 2, 0F,0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.5F, -0.6F, 1.6F, 0F, -0.6F, 1.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -1F, -0.6F, 1F, 0F, -0.8F, 1.2F); // Box 132
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-8F, 0F, -2F, 6, 4, 1, 0F,-3.4F, 0F, 0.3F, -0.5F, 0.2F, 0.4F, -0.5F, 0.7F, -0.2F, -3.4F, 0.5F, -0.2F, -3.2F, 0F, 1.6F, -0.6F, 0F, 1.7F, -0.5F, 0.5F, -2F, -3.2F, 0.5F, -2F); // Box 138
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.5F, -0.5F, -1F, 2, 1, 2, 0F,0.1F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0F, 0.6F, 1.5F, 0F, 0.4F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 139
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-8F, 4F, -2F, 6, 4, 2, 0F,-3.2F, 0F, 1.6F, -0.6F, 0F, 1.7F, -0.5F, -0.5F, 0F, -3.2F, -1F, 0F, -3.2F, -0.6F, 2.7F, -0.6F, -0.6F, 2.8F, -0.5F, -0.6F, 0F, -3.2F, -0.6F, 0F); // Box 140
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-8F, 6.8F, -2F, 6, 3, 2, 0F,-3.2F, -0.6F, 2.7F, -0.6F, -0.6F, 2.8F, -0.5F, -0.6F, 0F, -3.2F, -0.6F, 0F, -3.6F, -0.5F, 0.6F, -0.2F, -0.5F, 1.7F, -0.5F, -0.2F, 0F, -3.6F, -0.2F, 0F); // Box 141
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3F, 0F, -2F, 2, 4, 1, 0F,-0.5F, 0.2F, 0.4F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.3F, -0.5F, 0.7F, -0.2F, -0.4F, 0F, 1.7F, -0.6F, 0F, 1.7F, 0F, -0.5F, -1.2F, -0.5F, 0F, -1.2F); // Box 142
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-5F, 6.8F, 0F, 5, 3, 2, 0F,-0.2F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 1.6F, -0.5F, -0.6F, 1.6F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 1.2F, -1F, -0.6F, 1F); // Box 143
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-5F, 4F, 0F, 5, 4, 2, 0F,-0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, -0.3F, -0.5F, 2F, -0.2F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 1.6F, -0.5F, -0.6F, 1.6F); // Box 144
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, 9.7F, -3.5F, 2, 1, 7, 0F,0.5F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, 0.5F, 0F, -0.7F, 0.3F, -0.5F, -0.9F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.3F, 0.3F, -0.5F, -0.9F); // Box 145
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 10.2F, -3.5F, 2, 1, 7, 0F,0.8F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0.8F, 0F, -0.4F, 0.6F, -0.5F, -0.6F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0F, 0.6F, -0.5F, -0.6F); // Box 146
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 10.7F, -3.5F, 2, 1, 7, 0F,1.1F, 0F, -0.1F, 0F, 0F, 0.9F, 0F, 0F, 0.5F, 1.1F, 0F, -0.1F, 0.9F, -0.5F, -0.3F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.3F, 0.9F, -0.5F, -0.3F); // Box 147
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 11.2F, -3.5F, 2, 1, 7, 0F,1.4F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 0.7F, 1.4F, 0F, 0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.5F, 1.2F, -0.25F, -0.1F); // Box 148
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, 11.95F, -3.5F, 2, 1, 7, 0F,1.7F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 0.9F, 1.7F, 0F, 0.3F, 1.5F, -0.25F, 0.1F, 0F, -0.25F, 1.1F, 0F, -0.25F, 1.1F, 1.5F, -0.25F, 0.1F); // Box 149
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 12.7F, -3.5F, 2, 1, 7, 0F,2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.1F, 2F, 0F, 0.5F, 1.8F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 1.8F, 0F, 0.3F); // Box 150
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 13.7F, -3.5F, 2, 1, 7, 0F,2.3F, 0F, 0.7F, 0F, 0F, 1.7F, 0F, 0F, 1.3F, 2.3F, 0F, 0.7F, 2.2F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 2.2F, 0.5F, 0.5F); // Box 151
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 15.2F, -3.5F, 2, 1, 7, 0F,2.6F, 0F, 0.9F, 0F, 0F, 1.9F, 0F, 0F, 1.5F, 2.6F, 0F, 0.9F, 2.6F, 0.5F, 0.7F, 0F, 0.5F, 1.7F, 0F, 0.5F, 1.7F, 2.6F, 0.5F, 0.7F); // Box 152
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 16.7F, -3.5F, 2, 1, 7, 0F,2.8F, 0F, 1.1F, 0F, 0F, 2.1F, 0F, 0F, 1.7F, 2.8F, 0F, 1.1F, 3F, 0.2F, 1.1F, 0F, 0.5F, 1.9F, 0F, 0.5F, 1.9F, 3F, 0.2F, 1.1F); // Box 153
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2F, 15.2F, -3.5F, 1, 1, 7, 0F,0F, 0F, 1.9F, 1F, 0F, 1.9F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 1.7F, 0F, 0.5F, 1.7F, 0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F); // Box 154
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2F, 16.7F, -3.5F, 1, 1, 7, 0F,0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0.5F, 1.9F, -0.5F, 0F, 1.9F, -0.5F, 0F, 1.5F, 0F, 0.5F, 1.5F); // Box 155
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-6F, 1F, -4.4F, 3, 1, 1, 0F,-1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 73
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-6F, 3F, -4.4F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F); // Box 74
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-6F, 2F, -4.4F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 75
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3F, 1F, -4.4F, 3, 1, 1, 0F,-1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 165
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(3F, 2F, -4.4F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 166
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(3F, 3F, -4.4F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.6F, -1F, 0F, -0.8F, -1F, 0F, 0.4F, -1F, 0F, 0.2F); // Box 167
		bodyModel[57].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 62
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		leftArmModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 99
		leftArmModel[5] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 56
		leftArmModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 168
		leftArmModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 170

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -1.6F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 62
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 3.9F, -1.8F, 4, 2, 4, 0F,0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 99
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 56
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, -1.9F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 168
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, -2F, -2F, 4, 4, 4, 0F,0.43F, 0.3F, 0.2F, 0.23F, 0.23F, 0.2F, 0.23F, 0.23F, 0.2F, 0.43F, 0.3F, 0.2F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 170
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 156
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 157
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 158
		rightArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 159
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 160
		rightArmModel[5] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 161
		rightArmModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 169
		rightArmModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 171

		rightArmModel[0].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 156
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 157
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -1.6F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F); // Box 158
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 159
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 3.9F, -1.8F, 4, 2, 4, 0F,0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 160
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 161
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -1.9F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 169
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, -2F, -2F, 4, 4, 4, 0F,0.23F, 0.22F, 0.2F, 0.43F, 0.3F, 0.2F, 0.43F, 0.3F, 0.2F, 0.23F, 0.22F, 0.2F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F); // Box 171
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 84
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 86
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 87
		leftLegModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 88
		leftLegModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 89
		leftLegModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 90
		leftLegModel[8] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 45
		leftLegModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 133
		leftLegModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 134
		leftLegModel[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 136

		leftLegModel[0].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.8F, 5F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F); // Box 85
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 1.8F, -2F, 4, 5, 3, 0F,0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, -1.5F, 0.2F, 0.5F, -1.5F, -0.7F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, 0.3F, 0F, -1.2F); // Box 86
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.8F, 6F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 87
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(2F, 6.4F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2F, 5.4F, -1.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 11.1F, -2.5F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 1F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 45
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 11.1F, -3F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-2F, 11.1F, -4F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 172
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 173
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 174
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 175
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 176
		rightLegModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 177
		rightLegModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 178
		rightLegModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 179
		rightLegModel[8] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 180
		rightLegModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 181
		rightLegModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 182
		rightLegModel[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 183

		rightLegModel[0].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 172
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.2F, 5F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 173
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.2F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 174
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.2F, 1.8F, -2F, 4, 5, 3, 0F,0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1.5F, -0.7F, 0.8F, -1.5F, 0.2F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.3F, 0F, -1.2F, 0.3F, 0F, -0.9F); // Box 175
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.2F, 6F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 176
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-3F, 6.4F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 177
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3F, 5.4F, -1.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 178
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 11.1F, -2.5F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 0.999999999999998F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 180
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 11.1F, -3F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2F, 11.1F, -4F, 4, 1, 1, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);
	}
}