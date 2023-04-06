//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DiosMio
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDiosMio extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelDiosMio() //Same as Filename
	{
		headModel = new ModelRendererTurbo[47];
		bodyModel = new ModelRendererTurbo[32];
		leftArmModel = new ModelRendererTurbo[9];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		headModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 40
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 42
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 43
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 44
		headModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 45
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 66
		headModel[11] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 85
		headModel[12] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 86
		headModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 96
		headModel[14] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 97
		headModel[15] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 98
		headModel[16] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 99
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 113
		headModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 114
		headModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 115
		headModel[21] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
		headModel[22] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 117
		headModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 118
		headModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 119
		headModel[25] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 120
		headModel[26] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 121
		headModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		headModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		headModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 124
		headModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
		headModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 126
		headModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 127
		headModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 128
		headModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 129
		headModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 134
		headModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 135
		headModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 136
		headModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 137
		headModel[39] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 143
		headModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 144
		headModel[41] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 145
		headModel[42] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 146
		headModel[43] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 147
		headModel[44] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 148
		headModel[45] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 149
		headModel[46] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 150

		headModel[0].addShapeBox(-5F, -11F, -4F, 10, 4, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, -0.3F, -1F, 2F, -0.3F, -1F, 2F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 50
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -7F, -6F, 10, 3, 10, 0F,-0.3F, 1F, 0F, -0.3F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 1F, 1F, -0.5F, 1F, 1F); // Box 38
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -4F, -5.5F, 9, 1, 10, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -3F, 0.5F, 8, 2, 4, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, 0F, -5.5F, 8, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -1F, 0.3F, -1F, -1F, 0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -3F, -1F, 1, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.1F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0F, 0.1F, 0.7F, 0F); // Box 42
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -3F, -2.5F, 1, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.05F, 0.9F, -0.5F, -0.3F, 1F, -0.5F, -0.3F, 1F, 0F, 0.05F, 0.9F, 0F); // Box 43
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.6F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 44
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.6F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 45
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 46
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3.5F, -4F, -1.5F, 7, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 66
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-9F, -15F, -4.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-9.7F, -15F, -4.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 86
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.7F, -15F, -4.5F, 1, 1, 15, 0F,-9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-9.7F, -15F, -9F, 1, 1, 15, 0F,-9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.7F, -15F, -9F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 98
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-9F, -15F, 5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 112
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-2F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 113
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-1F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 114
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-2.6F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 115
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.6F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 116
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.6F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 117
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.4F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 118
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(2.4F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 119
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(1.4F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 120
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0.4F, -3F, -5.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 121
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 122
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 123
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(1F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 124
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(0F, -2.5F, -5.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 125
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -2.7F, -4.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 126
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4F, -2.9F, -3.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 127
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-4F, -3.1F, -2.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 128
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4F, -3.3F, -1.2F, 1, 3, 1, 0F,-0.6F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 129
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3F, -3.3F, -1.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 134
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(3F, -3.1F, -2.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 135
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(3F, -2.9F, -3.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 136
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(3F, -2.7F, -4.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 137
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(3F, -3F, -2.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -0.3F, 1F, -0.5F, 0.05F, 0.9F, -0.5F, 0.05F, 0.9F, 0F, -0.3F, 1F, 0F); // Box 143
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(3F, -3F, -1F, 1, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0.8F, 0F, 0.1F, 0.8F, 0F, 0.1F, 0.7F, 0F, -0.5F, 0.7F, 0F); // Box 144
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-4.6F, -3.2F, -4.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 145
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-4.6F, -3.4F, -3.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 146
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-4.6F, -3.6F, -2.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 147
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(3.6F, -3.6F, -2.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 148
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(3.6F, -3.4F, -3.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 149
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(3.6F, -3.2F, -4.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 150
		headModel[46].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 67
		bodyModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 66
		bodyModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 67
		bodyModel[5] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 69
		bodyModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 70
		bodyModel[7] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 71
		bodyModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 72
		bodyModel[9] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 74
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
		bodyModel[11] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 82
		bodyModel[15] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 84
		bodyModel[17] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 92
		bodyModel[18] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 93
		bodyModel[19] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 94
		bodyModel[20] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 100
		bodyModel[21] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 101
		bodyModel[22] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 102
		bodyModel[23] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 103
		bodyModel[24] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 104
		bodyModel[25] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 105
		bodyModel[26] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 106
		bodyModel[27] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 107
		bodyModel[28] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 108
		bodyModel[29] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 109
		bodyModel[30] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 110
		bodyModel[31] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 111

		bodyModel[0].addShapeBox(-6F, 2F, -1.5F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 67
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-7F, 6F, -1.5F, 14, 5, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6F, 15F, -1.5F, 12, 5, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -5.8F, 0F, -1.5F, -5.8F, 0F, -1.5F, -3F, -2F, -2F, -3F, -2F, -2F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 9F, -3F, 1, 2, 1, 0F,0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 66
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 9F, -3F, 1, 2, 1, 0F,-1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 67
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 11F, -3F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 69
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 11F, -3F, 1, 3, 1, 0F,-0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.65F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, -0.65F, 0F, -0.2F); // Box 70
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 9F, -3F, 1, 2, 1, 0F,0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 71
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 9F, -3F, 1, 2, 1, 0F,-1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 72
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(2F, 11F, -3F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 74
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 11F, -3F, 1, 3, 1, 0F,-0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, 0.25F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, 0.25F, 0F, -0.2F); // Box 75
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-7F, 2.5F, -3F, 7, 5, 1, 0F,-0.3F, 0.5F, -1F, -1.2F, -1F, -1F, -1.2F, -1F, 1F, -0.3F, 0.5F, 1.5F, 0.5F, -1F, 0.3F, -0.1F, -1.2F, 0.3F, -1F, -0.2F, 0F, -1F, 1F, 0F); // Box 48
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 2.5F, -3F, 7, 5, 1, 0F,-1.2F, -1F, -1F, -0.3F, 0.5F, -1F, -0.3F, 0.5F, 1.5F, -1.2F, -1F, 1F, -0.1F, -1.2F, 0.3F, 0.5F, -1F, 0.3F, -1F, 1F, 0F, -1F, -0.2F, 0F); // Box 49
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5F, 10F, -1.5F, 10, 4, 6, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 78
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-13F, -6F, 4F, 7, 11, 3, 0F,2F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 2F, -1F, 1F, -2F, -2F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, -2F, -2F, 0F); // Box 82
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-15F, -7F, 5.5F, 9, 11, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F); // Box 83
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-27F, -21F, 6F, 15, 18, 1, 0F,5F, 6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 6F, 0F, -10F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 3F, 0F); // Box 84
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-15F, 3F, 5F, 13, 6, 3, 0F,2F, -1F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -1F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F); // Box 92
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-26F, 4F, 5.5F, 11, 9, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 3F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -3F, 3F, 0F); // Box 93
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-41F, 1F, 6F, 17, 12, 1, 0F,5F, 5F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 5F, 5F, 0F, -10F, 0F, 0F, 3F, 2F, 0F, 4F, 2F, 0F, -10F, 0F, 0F); // Box 94
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(6F, -6F, 4F, 7, 11, 3, 0F,0F, 1F, -1F, 2F, -1F, -1F, 2F, -1F, 1F, 0F, 1F, 1F, 5F, 3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 5F, 3F, 0F); // Box 100
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2F, 3F, 5F, 13, 6, 3, 0F,2F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F, 0F); // Box 101
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(12F, -21F, 6F, 15, 18, 1, 0F,-3F, 0F, 0F, 5F, 6F, 0F, 5F, 6F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, 3F, 0F, 0F); // Box 102
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(6F, -7F, 5.5F, 9, 11, 2, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(15F, 4F, 5.5F, 11, 9, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, 3F, 0F, -3F, 3F, 0F, 1F, -1F, 0F); // Box 104
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(24F, 1F, 6F, 17, 12, 1, 0F,-4F, 1F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, -4F, 1F, 0F, 3F, 2F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 4F, 2F, 0F); // Box 105
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-13F, 10F, 7F, 7, 11, 3, 0F,-2F, -2F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, -2F, -2F, 0F, 2F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 2F, -1F, 1F); // Box 106
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(6F, 10F, 7F, 7, 11, 3, 0F,5F, 3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 5F, 3F, 0F, 0F, 1F, -1F, 2F, -1F, -1F, 2F, -1F, 1F, 0F, 1F, 1F); // Box 107
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(6F, 11F, 8.5F, 9, 11, 2, 0F,0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-15F, 11F, 8.5F, 9, 11, 2, 0F,2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 109
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(12F, 18F, 9F, 15, 18, 1, 0F,3F, 0F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, 3F, 0F, 0F, -9F, -4F, 0F, 8F, -10F, 0F, 8F, -10F, 0F, -9F, -4F, 0F); // Box 110
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-27F, 18F, 9F, 15, 18, 1, 0F,-10F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 3F, 0F, 8F, -10F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 8F, -10F, 0F); // Box 111
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 94
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 95
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 79
		leftArmModel[3] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 80
		leftArmModel[4] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 81
		leftArmModel[5] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 139
		leftArmModel[6] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 140
		leftArmModel[7] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 141
		leftArmModel[8] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 142

		leftArmModel[0].addShapeBox(1.5F, 0.5F, -1F, 3, 7, 3, 0F,1F, 0.5F, 1F, -1F, 0F, 1F, -1F, 1F, 1F, 1F, 1.5F, 1F, -2.5F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 3F, -2.5F, 0F, 3F); // Box 94
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.5F, 7.5F, 1F, 3, 7, 3, 0F,-1.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, -1.5F, 0F, 1F, -3.5F, -0.5F, -1F, 3F, -1F, -1F, 3F, 0F, 0F, -3.5F, 0.5F, 0F); // Box 95
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(5.7F, 13.5F, 2.2F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, -4F, 2F, 0F, -4F); // Box 79
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(6.5F, 13.5F, 2F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 80
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(7.3F, 13.5F, 2.1F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, 4F, 0F, 3F, 4F, 0F, -3F, -4F, 0F, -3F); // Box 81
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(7.3F, 13.7F, 2.9F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 2F, -3F, 0F, 2F); // Box 139
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(5.7F, 13.7F, 3F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F); // Box 140
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(6.5F, 13.5F, 2.8F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 141
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(6.5F, 13.5F, 2.3F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 142
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 75
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 49
		rightArmModel[3] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 50
		rightArmModel[4] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 51
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 52
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 53

		rightArmModel[0].addShapeBox(-6F, 0F, -2F, 4, 8, 4, 0F,1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 1.5F, 0F, 1F, 1F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 2F, 0F, 1F); // Box 74
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-6.5F, 8F, -2F, 4, 9, 4, 0F,1F, 2F, -2F, -0.5F, 2F, -2F, -1.5F, 0F, 1F, 1.5F, 0F, 1F, 2F, -6F, 7F, -2.5F, -5.5F, 7F, -2.5F, -3.5F, -10F, 2F, -4F, -10F); // Box 75
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-7.5F, 12F, -10F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 49
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-7.5F, 12F, -12F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-7.5F, 12.5F, -15F, 1, 1, 3, 0F,1F, -0.7F, 0F, 1F, -0.7F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 51
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-7.5F, 12.5F, -18F, 1, 1, 3, 0F,2.5F, -4.5F, 0F, -3.4F, -4.5F, 0F, 1F, -0.7F, 0F, 1F, -0.7F, 0F, 2.5F, 4.3F, -1F, -3.4F, 4.3F, -1F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 52
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-7.5F, 12.5F, -18F, 1, 1, 3, 0F,-3.4F, -4.5F, 0F, 2.5F, -4.5F, 0F, 1F, -0.7F, 0F, 1F, -0.7F, 0F, -3.4F, 4.3F, -1F, 2.5F, 4.3F, -1F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 53
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 96
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 97
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 138

		leftLegModel[0].addShapeBox(-0.2F, 4.5F, -2.5F, 5, 4, 5, 0F,-1F, 0F, -0.5F, 0F, 2F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 1F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 2F, 1F, 0F, 2F); // Box 96
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-0.7F, 8.5F, -2.5F, 5, 5, 5, 0F,0.5F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0.5F, 0F, -2F); // Box 97
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-0.2F, 13.5F, -3.5F, 4, 12, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 3F, -1F, 0F, 3F); // Box 138
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 71
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 76

		rightLegModel[0].addShapeBox(-4.3F, 8.5F, -2.5F, 5, 5, 5, 0F,1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -2F, -1F, 0F, -2F); // Box 70
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.8F, 13.5F, -3.5F, 4, 12, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 3F, 2F, 0F, 3F); // Box 71
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-4.8F, 4.5F, -2.5F, 5, 4, 5, 0F,0F, 2F, -1F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 1F, 1F, 0.5F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 2F, 0.5F, 0F, 2F); // Box 76
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}