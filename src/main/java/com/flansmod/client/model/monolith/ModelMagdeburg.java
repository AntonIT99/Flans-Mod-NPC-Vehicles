//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Magdeburg
// Model Creator: 
// Created on: 21.07.2020 - 08:39:43
// Last changed on: 21.07.2020 - 08:39:43

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMagdeburg extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelMagdeburg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];
		trailerModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		inittrailerModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 56
		bodyModel[47] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 90
		bodyModel[53] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 98
		bodyModel[57] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 99
		bodyModel[58] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 102
		bodyModel[59] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 103
		bodyModel[60] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 129
		bodyModel[63] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 132
		bodyModel[66] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 133
		bodyModel[67] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 134
		bodyModel[68] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 135
		bodyModel[69] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 137
		bodyModel[71] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 144
		bodyModel[78] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 145
		bodyModel[79] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 146
		bodyModel[80] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 147
		bodyModel[81] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 148
		bodyModel[82] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 149
		bodyModel[83] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 150
		bodyModel[84] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 151
		bodyModel[85] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 152
		bodyModel[86] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 153
		bodyModel[87] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 154
		bodyModel[88] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 155
		bodyModel[89] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 156
		bodyModel[90] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 157
		bodyModel[91] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 158
		bodyModel[92] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 159
		bodyModel[93] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 160
		bodyModel[94] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 161
		bodyModel[95] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 162
		bodyModel[96] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 163
		bodyModel[97] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 167
		bodyModel[98] = new ModelRendererTurbo(this, 479, 104, textureX, textureY); // Box 168

		bodyModel[0].addShapeBox(0F, 0F, 0F, 92, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-43F, 5.5F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 42, 9, 22, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 2
		bodyModel[1].setRotationPoint(49F, 1F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 10, 16, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(91F, 0F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 11, 10, 0F,0F, 0F, 0F, 0F, 1F, -4.2F, 0F, 1F, -4.2F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, -4.2F, -3F, 0.5F, -4.2F, 0F, 0.5F, 0F); // Box 4
		bodyModel[3].setRotationPoint(105F, -1F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 39, 5, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(-82F, 5.5F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 28, 5, 18, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 6
		bodyModel[5].setRotationPoint(-110F, 5.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F); // Box 7
		bodyModel[6].setRotationPoint(-114F, 4.5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(34F, 1F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(30F, 1F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 56, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-26F, 1F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 11
		bodyModel[10].setRotationPoint(-29F, 1F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-46F, 1F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-49F, 1F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 31, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-80F, 1F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -3F); // Box 15
		bodyModel[14].setRotationPoint(49F, 10.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -3F); // Box 16
		bodyModel[15].setRotationPoint(91F, 10.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -2F, -4.2F, -1F, -2F, -4.2F, 0F, 0F, -3F); // Box 17
		bodyModel[16].setRotationPoint(105F, 10.5F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 92, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 18
		bodyModel[17].setRotationPoint(-43F, 10.5F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 39, 9, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -8F); // Box 19
		bodyModel[18].setRotationPoint(-82F, 10.5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 28, 5, 18, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -7F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -3F, -7F); // Box 20
		bodyModel[19].setRotationPoint(-110F, 10.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F, -2.7F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, -2.7F, -1F, -4F); // Box 21
		bodyModel[20].setRotationPoint(-114F, 10.5F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(34F, -18F, -2.5F);
		bodyModel[21].rotateAngleZ = 0.03490659F;

		bodyModel[22].addShapeBox(4F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(34F, -18F, -2.5F);
		bodyModel[22].rotateAngleZ = 0.03490659F;

		bodyModel[23].addShapeBox(-1F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[23].setRotationPoint(34F, -18F, -2.5F);
		bodyModel[23].rotateAngleZ = 0.03490659F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 34
		bodyModel[24].setRotationPoint(50F, -43F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F); // Box 35
		bodyModel[25].setRotationPoint(49F, -59F, -0.5F);

		bodyModel[26].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(50.2F, -40F, 0F);

		bodyModel[27].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-52.8F, -40F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F, -0.2F, 16F, -0.2F); // Box 38
		bodyModel[28].setRotationPoint(-55F, -59F, -0.5F);
		bodyModel[28].rotateAngleZ = 0.06981317F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 39
		bodyModel[29].setRotationPoint(-53F, -43F, -0.5F);
		bodyModel[29].rotateAngleZ = 0.03490659F;

		bodyModel[30].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-52.8F, -40F, 0F);
		bodyModel[30].rotateAngleY = -0.78539816F;

		bodyModel[31].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(50.2F, -40F, 0F);
		bodyModel[31].rotateAngleY = -0.78539816F;

		bodyModel[32].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[32].setRotationPoint(-52.8F, -40F, 0F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[33].setRotationPoint(50.2F, -40F, 0F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[34].setRotationPoint(-52.8F, -40F, 0F);
		bodyModel[34].rotateAngleY = -2.35619449F;

		bodyModel[35].addShapeBox(-0.5F, 0F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[35].setRotationPoint(50.2F, -40F, 0F);
		bodyModel[35].rotateAngleY = -2.35619449F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[36].setRotationPoint(52F, -8F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 47
		bodyModel[37].setRotationPoint(58F, -8F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F); // Box 48
		bodyModel[38].setRotationPoint(55F, -8.1F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[39].setRotationPoint(52F, -7F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 50
		bodyModel[40].setRotationPoint(52F, -7F, 4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F); // Box 51
		bodyModel[41].setRotationPoint(55F, -4.1F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 52
		bodyModel[42].setRotationPoint(46F, -4.1F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[43].setRotationPoint(65.5F, -4.5F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 54
		bodyModel[44].setRotationPoint(46F, -4F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 55
		bodyModel[45].setRotationPoint(46F, -4F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 56
		bodyModel[46].setRotationPoint(52F, -4F, 3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 57
		bodyModel[47].setRotationPoint(52F, -4F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 58
		bodyModel[48].setRotationPoint(56F, -4F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 59
		bodyModel[49].setRotationPoint(56F, -4F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 60
		bodyModel[50].setRotationPoint(60F, -4F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F); // Box 61
		bodyModel[51].setRotationPoint(60F, -4F, 1F);

		bodyModel[52].addShapeBox(-0.5F, 1F, -1.5F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 90
		bodyModel[52].setRotationPoint(-5.5F, 3.5F, -9F);

		bodyModel[53].addShapeBox(-0.5F, 0F, -7F, 1, 2, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[53].setRotationPoint(-5.5F, 2.5F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, -7F, 1, 2, 9, 0F,-0.5F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 92
		bodyModel[54].setRotationPoint(-5.5F, 2.5F, -10F);

		bodyModel[55].addShapeBox(-1F, 0F, -7F, 1, 2, 9, 0F,0F, -0.5F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[55].setRotationPoint(-5.5F, 2.5F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[56].setRotationPoint(-30F, 3.5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[57].setRotationPoint(-3F, 3.5F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[58].setRotationPoint(-28F, -1.5F, -10.5F);

		bodyModel[59].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[59].setRotationPoint(-28F, -1.5F, -10.5F);
		bodyModel[59].rotateAngleX = -1.22173048F;

		bodyModel[60].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[60].setRotationPoint(-28F, -0.5F, 10F);
		bodyModel[60].rotateAngleX = 1.22173048F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[61].setRotationPoint(-28F, -1.5F, 9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[62].setRotationPoint(-30F, 3.5F, 9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[63].setRotationPoint(-3F, 3.5F, 9F);

		bodyModel[64].addShapeBox(-1F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
		bodyModel[64].setRotationPoint(16F, -18F, -2.5F);
		bodyModel[64].rotateAngleZ = 0.03490659F;

		bodyModel[65].addShapeBox(4F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 132
		bodyModel[65].setRotationPoint(16F, -18F, -2.5F);
		bodyModel[65].rotateAngleZ = 0.03490659F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[66].setRotationPoint(16F, -18F, -2.5F);
		bodyModel[66].rotateAngleZ = 0.03490659F;

		bodyModel[67].addShapeBox(-1F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 134
		bodyModel[67].setRotationPoint(-2F, -18F, -2.5F);
		bodyModel[67].rotateAngleZ = 0.03490659F;

		bodyModel[68].addShapeBox(4F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 135
		bodyModel[68].setRotationPoint(-2F, -18F, -2.5F);
		bodyModel[68].rotateAngleZ = 0.03490659F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[69].setRotationPoint(-2F, -18F, -2.5F);
		bodyModel[69].rotateAngleZ = 0.03490659F;

		bodyModel[70].addShapeBox(-1F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 137
		bodyModel[70].setRotationPoint(-20F, -18F, -2.5F);
		bodyModel[70].rotateAngleZ = 0.03490659F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[71].setRotationPoint(-20F, -18F, -2.5F);
		bodyModel[71].rotateAngleZ = 0.03490659F;

		bodyModel[72].addShapeBox(4F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		bodyModel[72].setRotationPoint(-20F, -18F, -2.5F);
		bodyModel[72].rotateAngleZ = 0.03490659F;

		bodyModel[73].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[73].setRotationPoint(-20F, -1.5F, -10.5F);
		bodyModel[73].rotateAngleX = -1.22173048F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[74].setRotationPoint(-20F, -1.5F, -10.5F);

		bodyModel[75].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[75].setRotationPoint(-20F, -0.5F, 10F);
		bodyModel[75].rotateAngleX = 1.22173048F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[76].setRotationPoint(-20F, -1.5F, 9.5F);

		bodyModel[77].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[77].setRotationPoint(6F, -1.5F, -10.5F);
		bodyModel[77].rotateAngleX = -1.22173048F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[78].setRotationPoint(6F, -1.5F, -10.5F);

		bodyModel[79].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[79].setRotationPoint(6F, -0.5F, 10F);
		bodyModel[79].rotateAngleX = 1.22173048F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[80].setRotationPoint(6F, -1.5F, 9.5F);

		bodyModel[81].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[81].setRotationPoint(-2F, -1.5F, -10.5F);
		bodyModel[81].rotateAngleX = -1.22173048F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[82].setRotationPoint(-2F, -1.5F, -10.5F);

		bodyModel[83].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[83].setRotationPoint(-2F, -0.5F, 10F);
		bodyModel[83].rotateAngleX = 1.22173048F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[84].setRotationPoint(-2F, -1.5F, 9.5F);

		bodyModel[85].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[85].setRotationPoint(31F, -1.5F, -10.5F);
		bodyModel[85].rotateAngleX = -1.22173048F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[86].setRotationPoint(31F, -1.5F, -10.5F);

		bodyModel[87].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[87].setRotationPoint(31F, -0.5F, 10F);
		bodyModel[87].rotateAngleX = 1.22173048F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[88].setRotationPoint(31F, -1.5F, 9.5F);

		bodyModel[89].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[89].setRotationPoint(23F, -1.5F, -10.5F);
		bodyModel[89].rotateAngleX = -1.22173048F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[90].setRotationPoint(23F, -1.5F, -10.5F);

		bodyModel[91].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[91].setRotationPoint(23F, -0.5F, 10F);
		bodyModel[91].rotateAngleX = 1.22173048F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[92].setRotationPoint(23F, -1.5F, 9.5F);

		bodyModel[93].addShapeBox(-0.5F, 1F, -1.5F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 160
		bodyModel[93].setRotationPoint(-5.5F, 3.5F, 10.5F);

		bodyModel[94].addShapeBox(0F, 0F, -7F, 1, 2, 9, 0F,-0.5F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[94].setRotationPoint(-5.5F, 2.5F, 9.5F);
		bodyModel[94].rotateAngleY = -3.14159265F;

		bodyModel[95].addShapeBox(-0.5F, 0F, -7F, 1, 2, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[95].setRotationPoint(-5.5F, 2.5F, 9.5F);
		bodyModel[95].rotateAngleY = -3.14159265F;

		bodyModel[96].addShapeBox(-1F, 0F, -7F, 1, 2, 9, 0F,0F, -0.5F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 163
		bodyModel[96].setRotationPoint(-5.5F, 2.5F, 9.5F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 7F, -0.2F, -0.2F, 7F, -0.2F, -0.2F, 7F, -0.2F, -0.2F, 7F, -0.2F); // Box 167
		bodyModel[97].setRotationPoint(-114F, -7F, -0.5F);
		bodyModel[97].rotateAngleZ = 0.03490659F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F,-7.7F, -3F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -7.7F, -3F, -0.4F, -8.2F, -4F, -0.4F, -0.2F, -6F, -0.4F, -0.2F, -6F, -0.4F, -8.2F, -4F, -0.4F); // Box 168
		bodyModel[98].setRotationPoint(-128.5F, -6F, -0.5F);
		bodyModel[98].rotateAngleZ = 0.03490659F;
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 63
		trailerModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 66
		trailerModel[2] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 71
		trailerModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		trailerModel[4] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 80
		trailerModel[5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 83
		trailerModel[6] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 86
		trailerModel[7] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 126
		trailerModel[8] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 127
		trailerModel[9] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 128
		trailerModel[10] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 164
		trailerModel[11] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 165
		trailerModel[12] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 166

		trailerModel[0].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		trailerModel[0].setRotationPoint(74.5F, -1.5F, 0F);

		trailerModel[1].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		trailerModel[1].setRotationPoint(52.5F, -1.5F, -8F);

		trailerModel[2].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		trailerModel[2].setRotationPoint(-38.5F, 3.5F, -8F);

		trailerModel[3].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		trailerModel[3].setRotationPoint(52.5F, -1.5F, 8F);

		trailerModel[4].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		trailerModel[4].setRotationPoint(-38.5F, 3.5F, 8F);

		trailerModel[5].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		trailerModel[5].setRotationPoint(-76.5F, -1.5F, 0F);

		trailerModel[6].addShapeBox(-1.5F, 1F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		trailerModel[6].setRotationPoint(-87.5F, 3.5F, 0F);

		trailerModel[7].addShapeBox(-3F, -2F, -2F, 3, 3, 4, 0F,0F, 1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.4F, 0F, 0.8F, 0.4F, 0F, 0.8F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 126
		trailerModel[7].setRotationPoint(38.5F, -1.5F, -7.7F);
		trailerModel[7].rotateAngleY = -0.40142573F;

		trailerModel[8].addShapeBox(-1F, 1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		trailerModel[8].setRotationPoint(37.5F, -1.5F, -7.5F);
		trailerModel[8].rotateAngleY = -0.01745329F;

		trailerModel[9].addShapeBox(-0.5F, -1.2F, -0.5F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 128
		trailerModel[9].setRotationPoint(37.5F, -2.5F, -7.2F);
		trailerModel[9].rotateAngleY = -0.40142573F;
		trailerModel[9].rotateAngleZ = 0.64577182F;

		trailerModel[10].addShapeBox(-1F, 1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		trailerModel[10].setRotationPoint(37.5F, -1.5F, 7.5F);
		trailerModel[10].rotateAngleY = -0.01745329F;

		trailerModel[11].addShapeBox(-3F, -2F, -2F, 3, 3, 4, 0F,0F, 1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.4F, 0F, 0.8F, 0.4F, 0F, 0.8F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 165
		trailerModel[11].setRotationPoint(38.5F, -1.5F, 7.8F);
		trailerModel[11].rotateAngleY = 0.40142573F;

		trailerModel[12].addShapeBox(-0.5F, -1.2F, -0.5F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 166
		trailerModel[12].setRotationPoint(37.5F, -2.5F, 7.3F);
		trailerModel[12].rotateAngleY = 0.40142573F;
		trailerModel[12].rotateAngleZ = 0.64577182F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[2];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_1_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_1_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(74.5F, -1.5F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[2];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_2_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_2_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(52.5F, -1.5F, -8F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[2];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_3_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_3_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(52.5F, -1.5F, 8F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[2];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_4_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_4_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-38.5F, 3.5F, -8F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[2];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_5_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_5_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-38.5F, 3.5F, 8F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[2];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_6_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_6_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-76.5F, -1.5F, 0F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[2];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 62
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		gun_7_Model[0][0].addShapeBox(-3F, -2F, -2F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 62

		gun_7_Model[0][1].addShapeBox(-0.5F, -1.2F, -0.5F, 10, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-87.5F, 3.5F, 0F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[0];

		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);
	}
}