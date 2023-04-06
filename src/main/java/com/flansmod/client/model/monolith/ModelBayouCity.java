//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BayouCity
// Model Creator: 
// Created on: 21.06.2022 - 18:11:13
// Last changed on: 21.06.2022 - 18:11:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBayouCity extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBayouCity() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];
		frontWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initfrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 37
		bodyModel[19] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 81
		bodyModel[20] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 82
		bodyModel[21] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 83
		bodyModel[22] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 84
		bodyModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 85
		bodyModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 90
		bodyModel[29] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 91
		bodyModel[30] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 92
		bodyModel[31] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 93
		bodyModel[32] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 94
		bodyModel[33] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 107
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		bodyModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		bodyModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 120
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 124
		bodyModel[58] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 125
		bodyModel[59] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 126
		bodyModel[60] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 127

		bodyModel[0].addShapeBox(0F, 0F, 0F, 82, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(-37.5F, 2.8F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 28, 0F,0F, 0F, 0F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 7
		bodyModel[1].setRotationPoint(44.5F, 2.8F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 24, 0F,0F, 0.3F, 0F, 0F, 0.6F, -9F, 0F, 0.6F, -9F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(55.5F, 2.8F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[3].setRotationPoint(-43.5F, 2.8F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 24, 0F,0F, 1.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 10
		bodyModel[4].setRotationPoint(-53.5F, 2.8F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 11
		bodyModel[5].setRotationPoint(-56.5F, 1.8F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1.9F, -3.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -1.9F, -3.5F); // Box 12
		bodyModel[6].setRotationPoint(-56.5F, 3.8F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 3, 28, 0F,30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0.5F, -10F, 30F, 0.5F, -10F, 30F, 0.5F, -10F, 30F, 0.5F, -10F); // Box 13
		bodyModel[7].setRotationPoint(-7.5F, 3.8F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0F, -11F); // Box 14
		bodyModel[8].setRotationPoint(-43.5F, 3.8F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 3, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -10.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1.5F, -10.5F); // Box 15
		bodyModel[9].setRotationPoint(-53.5F, 3.8F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-56.5F, 3.3F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -12F, 0F, 0.5F, -12F, 0F, 0.5F, -10F); // Box 19
		bodyModel[11].setRotationPoint(44.5F, 3.8F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 24, 0F,0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, 0F, 0F, 0F, 0F, -0.5F, -10F, -1.9F, -1.7F, -11.5F, -1.9F, -1.7F, -11.5F, 0F, -0.5F, -10F); // Box 20
		bodyModel[12].setRotationPoint(55.5F, 3.8F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(30.5F, -6F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 16, 4, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F); // Box 22
		bodyModel[14].setRotationPoint(30.5F, -31F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-22.5F, -9.2F, -14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-19.5F, -10.2F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 27
		bodyModel[17].setRotationPoint(50F, -24.2F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F); // Box 37
		bodyModel[18].setRotationPoint(-19.5F, -11.2F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 81
		bodyModel[19].setRotationPoint(-24.5F, -7.2F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 35, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[20].setRotationPoint(-32.5F, -5.2F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 87, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[21].setRotationPoint(-37.5F, -4.2F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 24, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 84
		bodyModel[22].setRotationPoint(-43.5F, -4.2F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 85
		bodyModel[23].setRotationPoint(-53.5F, -4.2F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Box 86
		bodyModel[24].setRotationPoint(-56.5F, -4.2F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 70, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[25].setRotationPoint(-41.5F, -11.2F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 64, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[26].setRotationPoint(-38.5F, -10.2F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 58, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[27].setRotationPoint(-35.5F, -13.2F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 60, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[28].setRotationPoint(-36.5F, -14.2F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 6, 14, 0F,0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F); // Box 91
		bodyModel[29].setRotationPoint(-51.5F, -3.2F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 6, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 92
		bodyModel[30].setRotationPoint(-43.5F, -3.2F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[31].setRotationPoint(-37.5F, -3.2F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 42, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[32].setRotationPoint(2.5F, -3.2F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[33].setRotationPoint(36F, -10F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[34].setRotationPoint(36.5F, -18F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[35].setRotationPoint(36F, -19F, -4.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 98
		bodyModel[36].setRotationPoint(-16F, -45.2F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[37].setRotationPoint(-37.5F, -3.2F, -11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[38].setRotationPoint(-43.5F, -3.2F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[39].setRotationPoint(-49.5F, -3.2F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[40].setRotationPoint(-37.5F, -3.2F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[41].setRotationPoint(-43.5F, -3.2F, 8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[42].setRotationPoint(-49.5F, -3.2F, 4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[43].setRotationPoint(48F, -3.2F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[44].setRotationPoint(48F, -3.2F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[45].setRotationPoint(39F, -3.2F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[46].setRotationPoint(30F, -3.2F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[47].setRotationPoint(20F, -3.2F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[48].setRotationPoint(10F, -3.2F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[49].setRotationPoint(39F, -3.2F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[50].setRotationPoint(30F, -3.2F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[51].setRotationPoint(20F, -3.2F, 10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[52].setRotationPoint(10F, -3.2F, 10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[53].setRotationPoint(48F, -3.2F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[54].setRotationPoint(48F, -3.2F, 3.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 122
		bodyModel[55].setRotationPoint(-22.5F, -9.2F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 123
		bodyModel[56].setRotationPoint(-19.5F, -10.2F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F); // Box 124
		bodyModel[57].setRotationPoint(-19.5F, -11.2F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 17, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 125
		bodyModel[58].setRotationPoint(-24.5F, -7.2F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 35, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[59].setRotationPoint(-32.5F, -5.2F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 127
		bodyModel[60].setRotationPoint(-57F, -24.2F, -0.5F);
	}

	private void initfrontWheelModel_1()
	{
		frontWheelModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		frontWheelModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18

		frontWheelModel[0].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		frontWheelModel[0].setRotationPoint(-61.5F, 3.3F, 0F);

		frontWheelModel[1].addShapeBox(0F, 0F, -0.5F, 5, 2, 1, 0F,-4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		frontWheelModel[1].setRotationPoint(-61.5F, 1.3F, 0F);
	}
}