//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gendarme
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGendarme extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelGendarme() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];
		leftArmModel = new ModelRendererTurbo[15];
		rightArmModel = new ModelRendererTurbo[15];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 90
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 91
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 118
		bodyModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 119
		bodyModel[8] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 135
		bodyModel[9] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 136
		bodyModel[10] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 107
		bodyModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 56
		bodyModel[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 66
		bodyModel[14] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 104
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 105
		bodyModel[16] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 106
		bodyModel[17] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 107
		bodyModel[18] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 108
		bodyModel[19] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 109
		bodyModel[20] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 110
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 111
		bodyModel[22] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 112
		bodyModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 113
		bodyModel[24] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 114
		bodyModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 115
		bodyModel[26] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 116
		bodyModel[27] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 117
		bodyModel[28] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 118
		bodyModel[29] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 119
		bodyModel[30] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 147
		bodyModel[31] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 148
		bodyModel[32] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 149
		bodyModel[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 150
		bodyModel[34] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 151
		bodyModel[35] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 152
		bodyModel[36] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 153

		bodyModel[0].addShapeBox(-1F, 12.5F, -4.5F, 2, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1F, 13F, -4.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 13.5F, -4.5F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 91
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 4F, -2F, 8, 6, 4, 0F,-0.1F, 1F, 0.8F, -3.9F, 0F, 2.3F, -4F, 0.5F, 1.1F, -0.1F, 1F, 1F, 0.9F, -4F, 1F, -3.8F, -2.49F, 2.4F, -4F, -3F, 1.2F, 0.9F, -4F, 0.8F); // Box 27
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 7F, -2F, 8, 6, 4, 0F,0.9F, 1F, 1F, -3.8F, -0.5F, 2.4F, -4F, 0F, 1.2F, 0.9F, 1F, 0.8F, 0.5F, -3.7F, 0.5F, -3.9F, -3.7F, 1.5F, -4F, -4.2F, 0.8F, 0.5F, -4F, 0.4F); // Box 28
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1F, -2F, 8, 6, 4, 0F,-0.2F, 0F, 0.2F, -4F, -0.8F, 1.5F, -4F, -0.5F, 1F, -0.2F, -0.3F, 0.7F, -0.1F, -4F, 0.8F, -3.9F, -3F, 2.3F, -4F, -3.5F, 1.2F, -0.1F, -4F, 1F); // Box 26
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9.5F, -2.5F, 4, 1, 5, 0F,0.2F, -0.3F, -0.1F, 0F, -0.2F, 0.7F, 0F, 0.2F, 0F, 0.1F, -0.3F, -0.1F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, -0.3F, 0.1F, 0F, 0F, 0F); // Box 118
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8.8F, -2.5F, 4, 1, 5, 0F,0.4F, -0.5F, 0F, 0F, -0.5F, 0.9F, 0F, 0F, 0.2F, 0.3F, 0F, -0.1F, 0.35F, 0F, 0F, 0F, 0.1F, 0.8F, 0F, -0.4F, 0.1F, 0.2F, 0F, 0F); // Box 119
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 0F, -2F, 3, 2, 4, 0F,0.5F, 0F, 0F, -0.1F, 0.2F, 0.2F, -0.1F, 0.7F, 0.5F, 0.5F, 0F, 0.2F, -0.3F, -0.8F, 0.1F, -0.2F, 0F, 1.2F, -0.2F, -0.3F, 0.9F, -0.3F, -0.7F, 0.6F); // Box 135
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,0.1F, 0.2F, 0.2F, 0F, 0.4F, 0.3F, 0F, 1F, 0.2F, 0.1F, 0.7F, 0.5F, 0.2F, 0F, 1.2F, 0F, 0F, 1.5F, 0F, -0.4F, 1F, 0.2F, -0.3F, 0.9F); // Box 136
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 1.5F, 0F, 1F, 0F, 0.5F, 1.64F, 0F, 0.5F, 1.8F, 1.5F, 0F, 1F); // Box 107
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5.5F, 12.2F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 1F, 1F, 0F, 1.4F, 1.5F, 0F, 1.6F, -0.2F, 0.5F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.7F, 1.5F, 0F, 1.9F, 0.3F, -0.3F, 1F); // Box 55
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5.6F, 13.2F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.9F, 0.4F, 0F, 1.5F, 1.5F, 0F, 1.7F, 0F, 0.3F, 0.9F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.8F, 1.5F, 0.2F, 2F, 0.3F, 0F, 1.1F); // Box 56
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5.6F, 14.2F, -2F, 4, 1, 1, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 1.6F, 0.2F, 0F, 0.9F, 0.2F, 0F, 2.9F, 0.4F, 1.5F, 1.1F, -0.8F, 1.2F, 1.8F, -1.8F, 1.2F, 1.1F, 0.4F, 1.5F, 0.1F); // Box 66
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-5F, 10F, -3F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0.5F, 0F, 0.5F); // Box 104
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-5F, 11F, -3F, 5, 3, 6, 0F,0.2F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 0.7F, 0.2F, 0F, 0.2F, 1.5F, 0F, 1F, -0.4F, 0F, 2F, -0.4F, 0F, 1.5F, 1.5F, 0F, 1F); // Box 105
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-5F, 14F, -3F, 5, 3, 6, 0F,1.5F, 0F, 1F, -0.4F, 0F, 2F, -0.4F, 0F, 1.5F, 1.5F, 0F, 1F, 2.2F, 0.5F, 1.3F, -1F, 1F, 2.8F, -1F, 1F, 2F, 2.2F, 0.5F, 1.2F); // Box 106
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 2F, -4F, 4, 2, 8, 0F,0F, 1F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, 0F, 1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F); // Box 107
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 4F, -4F, 4, 3, 8, 0F,0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.8F, 1.3F, -1F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 1.3F, -0.5F, -1F); // Box 108
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 7F, -4F, 4, 3, 8, 0F,1.3F, 1F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 1.3F, 0.5F, -1F, 1F, 0.2F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 1F, 0F, -0.8F); // Box 109
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0.4F, 0.3F, 0.1F, 0.2F, 0.2F, 0.1F, 0.7F, 0.5F, 0F, 1F, 0.2F, 0F, 0F, 1.5F, 0.2F, 0F, 1.2F, 0.2F, -0.3F, 0.9F, 0F, -0.4F, 1F); // Box 110
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 1F, -2F, 8, 6, 4, 0F,-4F, -0.8F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, 0.7F, -4F, -0.5F, 1F, -4.1F, -3F, 2.3F, -0.1F, -4F, 0.8F, -0.1F, -4F, 1F, -4F, -3.5F, 1.2F); // Box 111
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 4F, -2F, 8, 6, 4, 0F,-4.1F, 0F, 2.3F, -0.1F, 1F, 0.8F, -0.1F, 1F, 1F, -4F, 0.5F, 1.1F, -4.2F, -2.49F, 2.4F, 0.9F, -4F, 1F, 0.9F, -4F, 0.8F, -4F, -3F, 1.2F); // Box 112
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 7F, -2F, 8, 6, 4, 0F,-4.2F, -0.5F, 2.4F, 0.9F, 1F, 1F, 0.9F, 1F, 0.8F, -4F, 0F, 1.2F, -3.9F, -3.7F, 1.5F, 0.5F, -3.7F, 0.5F, 0.5F, -4F, 0.4F, -4F, -4.2F, 0.8F); // Box 113
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 8.8F, -2.5F, 4, 1, 5, 0F,0F, -0.5F, 0.9F, 0.4F, -0.5F, 0F, 0.3F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0.1F, 0.8F, 0.35F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.4F, 0.1F); // Box 114
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 9.5F, -2.5F, 4, 1, 5, 0F,0F, -0.2F, 0.7F, 0.2F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.1F); // Box 115
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.64F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0.5F, 1.8F); // Box 116
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.5F, 12.2F, -2F, 4, 1, 4, 0F,1F, 0F, 1.4F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, 1.5F, 0F, 1.6F, 0.5F, 0F, 1.7F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 1.5F, 0F, 1.9F); // Box 117
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.4F, 14.2F, -2F, 4, 1, 1, 0F,0.2F, 0F, 1.6F, 0.2F, 0F, 0.9F, 0.2F, 0F, 2.9F, 0.2F, 0F, 0.9F, -0.8F, 1.2F, 1.8F, 0.4F, 1.5F, 1.1F, 0.4F, 1.5F, 0.1F, -1.8F, 1.2F, 1.1F); // Box 118
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1.4F, 13.2F, -2F, 4, 1, 4, 0F,0.4F, 0F, 1.5F, 0F, 0.3F, 0.9F, 0F, 0.3F, 0.9F, 1.5F, 0F, 1.7F, 0.2F, 0.2F, 1.8F, 0.3F, 0F, 1.1F, 0.3F, 0F, 1.1F, 1.5F, 0.2F, 2F); // Box 119
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 0F, -2F, 3, 2, 4, 0F,-0.1F, 0.2F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, -0.1F, 0.7F, 0.5F, -0.2F, 0F, 1.2F, -0.3F, -0.8F, 0.1F, -0.3F, -0.7F, 0.6F, -0.2F, -0.3F, 0.9F); // Box 147
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 2F, -4F, 4, 2, 8, 0F,0F, 0F, -0.3F, 0F, 1F, -1.5F, 0F, 1F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.5F); // Box 148
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0F, 4F, -4F, 4, 3, 8, 0F,0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 1.3F, -1F, -0.5F, 1.3F, -0.5F, -1F, 0F, 0F, -0.3F); // Box 149
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 7F, -4F, 4, 3, 8, 0F,0F, 0F, 0.7F, 1.3F, 1F, -0.5F, 1.3F, 0.5F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 1F, 0.2F, -0.8F, 1F, 0F, -0.8F, 0F, 0F, -0.5F); // Box 150
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 10F, -3F, 5, 1, 6, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 1F); // Box 151
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 11F, -3F, 5, 3, 6, 0F,0F, 0F, 1.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0F, 0F, 0.7F, -0.4F, 0F, 2F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, -0.4F, 0F, 1.5F); // Box 152
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 14F, -3F, 5, 3, 6, 0F,-0.4F, 0F, 2F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, -0.4F, 0F, 1.5F, -1F, 1F, 2.8F, 2.2F, 0.5F, 1.3F, 2.2F, 0.5F, 1.2F, -1F, 1F, 2F); // Box 153
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 132
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 133
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 134
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 135
		leftArmModel[4] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 136
		leftArmModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 137
		leftArmModel[6] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 138
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 139
		leftArmModel[8] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 140
		leftArmModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 141
		leftArmModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 142
		leftArmModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 143
		leftArmModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 144
		leftArmModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 145
		leftArmModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 146

		leftArmModel[0].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.7F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.5F, 0.7F, 0.8F, -0.5F, 1.3F, 1.1F, 0.7F, -0.5F, 0.6F, 0.7F, -0.5F, 0.5F, 0.5F, 3.3F, 1.5F); // Box 132
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -0.5F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, 1.7F, 1F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, 1.7F, 1F); // Box 133
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 0.5F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, 1.5F, 1F, 0.7F, 0.2F, 0.8F, 0.7F, 0.2F, 0.8F, 0.6F, 1.5F, 1F); // Box 134
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 1.5F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, 1.2F, 1F, 0.7F, 0.5F, 0.8F, 0.7F, 0.5F, 0.8F, 0.6F, 1.2F, 1F); // Box 135
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 2.5F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, 1F, 1F, 0.6F, 0.7F, 0.8F, 0.6F, 0.7F, 0.8F, 0.6F, 1F, 1F); // Box 136
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -0.6F, -2F, 4, 7, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 137
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 4.3F, -2.2F, 4, 2, 5, 0F,0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F); // Box 138
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 139
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 140
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-3.41F, -2.1F, -1.99F, 1, 2, 4, 0F,-1.7F, -1.2F, 1F, 1.31F, 0.7F, 0.3F, 2.1F, 0.7F, 0.8F, 1F, -1F, 1.5F, -1.5F, 1F, 1.5F, 2.3F, -0.7F, 0.8F, 2.1F, 3.3F, 1.5F, 0F, 3F, 2F); // Box 141
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-3F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0.5F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0.5F, 0.3F, 1.5F); // Box 142
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-3F, -0.1F, -3F, 2, 2, 1, 0F,0.5F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, 1F, 2F, 0F, 2F, 2F, 0F, 2F, -2.5F, 0F, 1.2F, -2.5F); // Box 143
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0F, 0.2F, -0.5F, 1.5F, -0.6F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 1F, 0.5F, 0F, 1.2F, -1F, 0F, 2F, -2.5F); // Box 144
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(0F, -4.1F, -3.01F, 1, 2, 2, 0F,1F, -2.3F, 1F, -2F, -2.5F, 1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, -0.5F, -2F, 2F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 145
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(0.49F, -4.1F, -1F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.7F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 114
		rightArmModel[1] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 131
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 133
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 134
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 84
		rightArmModel[5] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 85
		rightArmModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 86
		rightArmModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 95
		rightArmModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 96
		rightArmModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 97
		rightArmModel[10] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 145
		rightArmModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 100
		rightArmModel[12] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 101
		rightArmModel[13] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 102
		rightArmModel[14] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 103

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.4F, 1.3F, 0.7F, 0.3F, 0.5F, 0.7F, 0.8F, 0.3F, 0.3F, 0.4F, 0.7F, -0.5F, 0.6F, -0.5F, 1.3F, 1.1F, 0.5F, 3.3F, 1.5F, 0.7F, -0.5F, 0.5F); // Box 114
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -0.6F, -2F, 4, 7, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 131
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 133
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 134
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-1.51F, -4.1F, -1F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.7F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-1F, -4.1F, -3.01F, 1, 2, 2, 0F,-2F, -2.5F, 1.5F, 1F, -2.3F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2F, 2F, 0F, 1F, 2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 85
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(1F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.2F, 0F, 0F, -0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.3F, 1.5F, 0F, -0.5F, 1.5F); // Box 86
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,-0.5F, 1.5F, -0.6F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 2F, 2F, 0F, 2F, -2.5F, 0F, 1.2F, -1F); // Box 95
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 1F, 2F, 0F, 1.2F, -2.5F, 0F, 2F, -2.5F); // Box 96
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(2.59F, -2.1F, -1.99F, 1, 2, 4, 0F,1.31F, 0.7F, 0.3F, -1.7F, -1.2F, 1.3F, 1F, -1F, 1.5F, 2.1F, 0.7F, 0.8F, 2.3F, -0.7F, 0.8F, -1.5F, 1F, 1.2F, 0F, 3F, 2F, 2.1F, 3.3F, 1.5F); // Box 97
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, 4.3F, -2.2F, 4, 2, 5, 0F,0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F); // Box 145
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3F, -0.5F, -2F, 4, 1, 4, 0F,0.2F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.2F, 0.5F, 0.4F, 0.8F, 0F, 0.8F, 0.6F, 1.7F, 1F, 0.6F, 1.7F, 1F, 0.8F, 0F, 0.8F); // Box 100
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3F, 0.5F, -2F, 4, 1, 4, 0F,0.1F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.1F, 0.5F, 0.4F, 0.7F, 0.2F, 0.8F, 0.6F, 1.5F, 1F, 0.6F, 1.5F, 1F, 0.7F, 0.2F, 0.8F); // Box 101
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, 1.5F, -2F, 4, 1, 4, 0F,0.1F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.1F, 0.5F, 0.4F, 0.7F, 0.5F, 0.8F, 0.6F, 1.2F, 1F, 0.6F, 1.2F, 1F, 0.7F, 0.5F, 0.8F); // Box 102
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3F, 2.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.4F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0F, 0.5F, 0.4F, 0.6F, 0.7F, 0.8F, 0.6F, 1F, 1F, 0.6F, 1F, 1F, 0.6F, 0.7F, 0.8F); // Box 103
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 120
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 121
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 122
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 123
		leftLegModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 124
		leftLegModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 125
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 126
		leftLegModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 127
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 128
		leftLegModel[9] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 129
		leftLegModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 130
		leftLegModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 131

		leftLegModel[0].addShapeBox(-1.5F, 1.9F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.1F, 0.8F, 0F, 0.1F, 0.8F, -1.5F, 0.7F, 0.5F, -1.5F, 0.8F, 0.5F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 120
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 121
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 122
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 6.1F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.5F, -1F, 0.6F, 0.5F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F); // Box 123
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 124
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 11.1F, -3.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 125
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 11.1F, -4.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 126
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.5F, 5.5F, -1.2F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 127
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.5F, 6.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 128
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-1.5F, 6F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 129
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(2.5F, 5.5F, -0.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 130
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(2.5F, 6.5F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 131
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 123
		rightLegModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 124
		rightLegModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 125
		rightLegModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 126
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 127
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 128
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 129
		rightLegModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 139
		rightLegModel[8] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 140
		rightLegModel[9] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 141
		rightLegModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 142
		rightLegModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 143

		rightLegModel[0].addShapeBox(-2.5F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F); // Box 123
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 1.9F, -2F, 4, 6, 4, 0F,0.8F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -1.5F, 0.8F, 0.8F, -1.5F, 0.7F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 124
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 125
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 126
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 127
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, 11.1F, -3.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 128
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.5F, 11.1F, -4.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 129
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.5F, 5.5F, -1.2F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 139
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.5F, 6F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 140
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.5F, 6.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 141
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-3.5F, 5.5F, -0.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 142
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-3.5F, 6.5F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 143
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);
	}
}