//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TurbanHelm2
// Model Creator: 
// Created on: 03.04.2022 - 17:24:15
// Last changed on: 03.04.2022 - 17:24:15

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTurbanHelm2 extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelTurbanHelm2() //Same as Filename
	{
		headModel = new ModelRendererTurbo[98];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 8, 7, textureX, textureY); // Box 30
		headModel[1] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 31
		headModel[2] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 35
		headModel[3] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 36
		headModel[4] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 37
		headModel[5] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 38
		headModel[6] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 46
		headModel[7] = new ModelRendererTurbo(this, 9, 8, textureX, textureY); // Box 47
		headModel[8] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 103
		headModel[9] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 107
		headModel[10] = new ModelRendererTurbo(this, 9, 10, textureX, textureY); // Box 109
		headModel[11] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 110
		headModel[12] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 112
		headModel[13] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 113
		headModel[14] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 114
		headModel[15] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 115
		headModel[16] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 116
		headModel[17] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 117
		headModel[18] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 119
		headModel[19] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 120
		headModel[20] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 121
		headModel[21] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 122
		headModel[22] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 126
		headModel[23] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 127
		headModel[24] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 128
		headModel[25] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 129
		headModel[26] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // Box 131
		headModel[27] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 132
		headModel[28] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 133
		headModel[29] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 134
		headModel[30] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 135
		headModel[31] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 136
		headModel[32] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 137
		headModel[33] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 138
		headModel[34] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 139
		headModel[35] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 140
		headModel[36] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 141
		headModel[37] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 144
		headModel[38] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 145
		headModel[39] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 146
		headModel[40] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 147
		headModel[41] = new ModelRendererTurbo(this, 6, 7, textureX, textureY); // Box 148
		headModel[42] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 157
		headModel[43] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 159
		headModel[44] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 160
		headModel[45] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 182
		headModel[46] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 183
		headModel[47] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 184
		headModel[48] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 186
		headModel[49] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 188
		headModel[50] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 189
		headModel[51] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 190
		headModel[52] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 191
		headModel[53] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 193
		headModel[54] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 194
		headModel[55] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 195
		headModel[56] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 196
		headModel[57] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 197
		headModel[58] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 198
		headModel[59] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 199
		headModel[60] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 200
		headModel[61] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 201
		headModel[62] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 202
		headModel[63] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 203
		headModel[64] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 207
		headModel[65] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 121
		headModel[66] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 122
		headModel[67] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 123
		headModel[68] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 124
		headModel[69] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 125
		headModel[70] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 126
		headModel[71] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 127
		headModel[72] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 128
		headModel[73] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 129
		headModel[74] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 130
		headModel[75] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 131
		headModel[76] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 132
		headModel[77] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 133
		headModel[78] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 134
		headModel[79] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 135
		headModel[80] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 137
		headModel[81] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 139
		headModel[82] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 140
		headModel[83] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 141
		headModel[84] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 142
		headModel[85] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 143
		headModel[86] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 144
		headModel[87] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 145
		headModel[88] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 146
		headModel[89] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 149
		headModel[90] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 154
		headModel[91] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 145
		headModel[92] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 146
		headModel[93] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 148
		headModel[94] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 149
		headModel[95] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 150
		headModel[96] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 151
		headModel[97] = new ModelRendererTurbo(this, 9, 24, textureX, textureY); // Box 152

		headModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[0].setRotationPoint(-1F, -7F, -4.25F);

		headModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, 0.75F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, 0.75F, -0.75F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		headModel[1].setRotationPoint(-2F, -7F, -4.25F);

		headModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 1F, 0F, 0F, 0F, 0.75F, 0.75F, -0.5F); // Box 35
		headModel[2].setRotationPoint(-4F, -7F, -4F);

		headModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.25F, 0F, 0.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 36
		headModel[3].setRotationPoint(-4F, -8F, -4F);

		headModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0.5F, -0.75F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		headModel[4].setRotationPoint(-2F, -8F, -4.25F);

		headModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		headModel[5].setRotationPoint(-1F, -8F, -4.25F);

		headModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, -1.75F, -0.25F, -1F, -1.5F, 0F, -1F, 2.75F, -2F, -1F, 2.75F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		headModel[6].setRotationPoint(-2F, -11F, -4F);

		headModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.75F, -1F, -1.5F, -0.75F, -1F, -1.5F, -1F, -1F, 2.75F, -1F, -1F, 2.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		headModel[7].setRotationPoint(-1F, -11F, -4F);

		headModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-2F, -1F, -1.75F, 0F, -1F, -1.75F, 2F, -1F, -0.25F, -1.75F, -1F, -0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 103
		headModel[8].setRotationPoint(-4F, -11F, -4F);

		headModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 1F, 0.5F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		headModel[9].setRotationPoint(0F, -7F, -4.25F);

		headModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		headModel[10].setRotationPoint(0F, -8F, -4.25F);

		headModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.75F, 1F, 0.5F, 0.75F, 0.5F, 0.75F, 0.75F, -0.5F, 0F, 0F, 0F); // Box 110
		headModel[11].setRotationPoint(2F, -7F, -4F);

		headModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0.75F, 0.25F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F); // Box 112
		headModel[12].setRotationPoint(2F, -8F, -4F);

		headModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 113
		headModel[13].setRotationPoint(-1F, -4.25F, -4.25F);

		headModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.75F, 1F, 0.5F, 0.75F, 0.5F, 0.75F, 0.75F, -0.5F, 0F, 0F, 0F); // Box 114
		headModel[14].setRotationPoint(2F, -4.25F, -4F);

		headModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0.75F, 0.5F, -1F, 0.75F, 1F, 0F, 0F, 0F, 0.75F, 0.75F, -0.5F); // Box 115
		headModel[15].setRotationPoint(-4F, -4.25F, -4F);

		headModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0.25F, 0F, 0.25F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 0.5F); // Box 116
		headModel[16].setRotationPoint(-4F, -8F, 0F);

		headModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.75F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0.75F, 1F, 0.5F, 0.75F, 0.5F); // Box 117
		headModel[17].setRotationPoint(-4F, -7F, 0F);

		headModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, -0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 1F, -0.75F, 0F, 1F); // Box 119
		headModel[18].setRotationPoint(-0.75F, -11F, -2.25F);

		headModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, -1.5F, 0F, 0.25F, -1.25F, 0.25F, 0.25F, 1.25F, -1.25F, 0.25F, 1.25F, 0.75F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 1F, -0.75F, 0F, 1F); // Box 120
		headModel[19].setRotationPoint(-1.25F, -11F, -2.25F);

		headModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, -2F, -0.5F, 0.25F, -1.5F, 0.25F, 0.25F, 1.25F, -1.25F, 0.25F, 1.25F, 1F, 0F, -2F, -1.75F, 0F, 0F, -0.25F, 0F, 1F, -0.75F, 0F, 1F); // Box 121
		headModel[20].setRotationPoint(-1.25F, -11F, -2.25F);

		headModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-2F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -2F, 0.25F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F); // Box 122
		headModel[21].setRotationPoint(-3F, -11F, -0.5F);

		headModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, -0.5F, 0.25F, -1.5F, -0.25F, 0.25F, -2F, -0.75F, 0F, 1F, -0.25F, 0F, 1F, -1.75F, 0F, -0.25F, 1F, 0F, -2F); // Box 126
		headModel[22].setRotationPoint(-1.25F, -11F, 1.25F);

		headModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.75F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0.75F, 0F, -0.25F); // Box 127
		headModel[23].setRotationPoint(-1.25F, -11F, 1.25F);

		headModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.25F, 1.25F, -0.25F, 0.25F, 1.25F, 0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.75F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		headModel[24].setRotationPoint(-0.75F, -11F, 1.25F);

		headModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1.75F, -1F, -0.25F, 2F, -1F, -0.25F, 0F, -1F, -2F, -2F, -1F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0.25F, 0F, 0.25F); // Box 129
		headModel[25].setRotationPoint(-4F, -11F, 0F);

		headModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		headModel[26].setRotationPoint(-1F, -12.25F, -1F);

		headModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 132
		headModel[27].setRotationPoint(-1.5F, -12.25F, -1F);

		headModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0499999999999999F, 0.25F, 0.05F, -0.95F, 0.25F, 0.05F, -0.95F, 0.25F, -0.95F, 0.05F, 0.25F, -0.95F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 133
		headModel[28].setRotationPoint(0F, -13.25F, 0F);

		headModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F); // Box 134
		headModel[29].setRotationPoint(0.5F, -12.25F, -1F);

		headModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 135
		headModel[30].setRotationPoint(-1.5F, -12.25F, 0F);

		headModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 136
		headModel[31].setRotationPoint(-1F, -12.25F, -1F);

		headModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -1.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.25F, 0F, 1F); // Box 137
		headModel[32].setRotationPoint(0.25F, -11F, -2.25F);

		headModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, -1.5F, -0.25F, 0.25F, -2F, -1.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, -1.75F, 0F, 0F, 1F, 0F, -2F, -0.75F, 0F, 1F, -0.25F, 0F, 1F); // Box 138
		headModel[33].setRotationPoint(0.25F, -11F, -2.25F);

		headModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, -1F, -1.5F, 0F, -1F, -1.75F, -2F, -1F, 2.75F, 0F, -1F, 2.75F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		headModel[34].setRotationPoint(0F, -11F, -4F);

		headModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, -1.75F, -2F, -1F, -1.75F, -1.75F, -1F, -0.25F, 2F, -1F, -0.25F, -0.5F, 0F, 0.75F, 0.25F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 140
		headModel[35].setRotationPoint(2F, -11F, -4F);

		headModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 1.25F, -1.25F, 0.25F, 1.25F, -0.5F, 0.25F, -1.5F, 0F, 0.25F, -1.25F, -0.25F, 0F, 1F, -0.75F, 0F, 1F, 0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 141
		headModel[36].setRotationPoint(0.25F, -11F, 1.25F);

		headModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 1.25F, -1.25F, 0.25F, 1.25F, -0.25F, 0.25F, -2F, -0.5F, 0.25F, -1.5F, -0.25F, 0F, 1F, -0.75F, 0F, 1F, 1F, 0F, -2F, -1.75F, 0F, -0.25F); // Box 144
		headModel[37].setRotationPoint(0.25F, -11F, 1.25F);

		headModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, -2F, 0.25F, -0.25F, -2F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 145
		headModel[38].setRotationPoint(0F, -11F, -0.5F);

		headModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, 0F); // Box 146
		headModel[39].setRotationPoint(0.5F, -12.25F, 0F);

		headModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 147
		headModel[40].setRotationPoint(0F, -12.25F, -1F);

		headModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 148
		headModel[41].setRotationPoint(-1F, -12.25F, 0F);

		headModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-3F, 1F, -0.25F, 0F, 1F, -0.5F, 0F, 0.25F, -0.5F, -3F, 1F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F); // Box 157
		headModel[42].setRotationPoint(-5.25F, -9F, -0.5F);

		headModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		headModel[43].setRotationPoint(-4.75F, -6.5F, -0.5F);

		headModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		headModel[44].setRotationPoint(-4.75F, -8F, -0.5F);

		headModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.4F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0.65F, 0F, -0.5F, 0.4F, 0.75F, 0.5F, -0.5F, 0.75F, 1F, 0F, 0F, 0F, 0.65F, 0.75F, -0.5F); // Box 182
		headModel[45].setRotationPoint(-4F, -2.5F, -4F);

		headModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, 0.75F, -0.75F, 0F, 1.25F, -0.75F, 0F, -2F, 0.5F, 0F, -1.5F, 0.5F, 0.75F, 0.75F, -0.75F, 0.75F, 1.25F, -0.75F, 0.75F, -2F, 0.5F, 0.75F, -1.5F); // Box 183
		headModel[46].setRotationPoint(-2F, -2.5F, -4.25F);

		headModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, -1.75F, -0.25F, 0.75F, -1.75F); // Box 184
		headModel[47].setRotationPoint(-1F, -2.5F, -4.5F);

		headModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, 0.75F, -0.75F, 0F, 1.25F, -0.75F, 0F, -2F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F); // Box 186
		headModel[48].setRotationPoint(-2F, 0.25F, -4.25F);

		headModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.75F, 0.75F, -0.25F, 0.75F, 0.75F); // Box 188
		headModel[49].setRotationPoint(-1F, 0.25F, -4.5F);

		headModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 1.25F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1.5F, -0.75F, 0F, -2F, -0.75F, 0.75F, 1.25F, 0.5F, 0.75F, 0.75F, 0.5F, 0.75F, -1.5F, -0.75F, 0.75F, -2F); // Box 189
		headModel[50].setRotationPoint(0F, -2.5F, -4.25F);

		headModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 1F, 0.4F, 0F, 0.5F, 0.65F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.75F, 1F, 0.4F, 0.75F, 0.5F, 0.65F, 0.75F, -0.5F, 0F, 0F, 0F); // Box 190
		headModel[51].setRotationPoint(2F, -2.5F, -4F);

		headModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 1.25F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1.5F, -0.75F, 0F, -2F, -0.75F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.75F, 0.5F, -0.75F, 0.75F, 0.5F); // Box 191
		headModel[52].setRotationPoint(0F, 0.25F, -4.25F);

		headModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.65F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.9F, 0.4F, 0F, 0.4F, 0.65F, 0.75F, -0.5F, 0F, 0F, 0F, -0.5F, 0.75F, 0.9F, 0.4F, 0.75F, 0.4F); // Box 193
		headModel[53].setRotationPoint(-4F, -2.5F, 0F);

		headModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 194
		headModel[54].setRotationPoint(-4.65F, -2F, -0.5F);

		headModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1,2, 0F,-0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 195
		headModel[55].setRotationPoint(-0.75F, -9F, -5.7F);

		headModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, -0.5F, -0.45F, -0.5F, -0.5F, -0.45F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, -0.45F, 0F, -0.5F); // Box 196
		headModel[56].setRotationPoint(-0.75F, -6F, -5.5F);

		headModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1,2, 0F,-0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.75F, -0.5F, 0.25F); // Box 197
		headModel[57].setRotationPoint(-0.75F, -5.5F, -5.7F);

		headModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1,2, 0F,-0.4F, -0.5F, -0.3F, 0.1F, -0.5F, -0.3F, 0.0999999999999999F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 198
		headModel[58].setRotationPoint(-0.75F, -2.75F, -5.95F);

		headModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1,2, 0F,-0.5F, -0.25F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.25F, -0.25F); // Box 199
		headModel[59].setRotationPoint(-0.75F, -9.5F, -5.7F);

		headModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1,2, 0F,-0.25F, -1F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.5F, -0.25F, -1F, -0.5F, -0.5F, 0F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.5F, -0.5F, 0F); // Box 200
		headModel[60].setRotationPoint(-0.25F, -9.5F, -5.7F);

		headModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1,2, 0F,-0.25F, -1F, -0.3F, -1F, -0.25F, -0.3F, -1F, -0.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.5F, -0.25F, 0F); // Box 201
		headModel[61].setRotationPoint(-0.25F, -9.5F, -5.7F);

		headModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1,2, 0F,-0.25F, 0F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.3F, -1F, -0.25F, -0.3F, -1F, -0.25F, -0.5F, -0.25F, -1F); // Box 202
		headModel[62].setRotationPoint(-0.25F, -10F, -5.7F);

		headModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, -0.75F, 0F, -0.15F, -0.75F, 1.75F, 0F, 0F, -1.75F, 0.25F, -0.75F, -1.75F, -0.25F, 0.25F, 0F, -0.15F, 0.25F, 2.25F, 0F, 0F, -1.5F, 0.25F, 0.25F, -1.75F); // Box 203
		headModel[63].setRotationPoint(-5.25F, -1F, -2.25F);

		headModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.15F, -0.75F, 1.75F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, -1.75F, 0F, 0F, -1.75F, -0.15F, 0.25F, 2.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, -1.75F, 0F, 0F, -1.5F); // Box 207
		headModel[64].setRotationPoint(4.25F, -1F, -2.25F);

		headModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		headModel[65].setRotationPoint(3.75F, -6.5F, -0.5F);

		headModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0.75F, 0.5F, -0.5F, 0.5F, 0.75F, 0.5F, -0.5F, 0.75F, 1F); // Box 122
		headModel[66].setRotationPoint(2F, -7F, 0F);

		headModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 1F); // Box 123
		headModel[67].setRotationPoint(2F, -8F, 0F);

		headModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		headModel[68].setRotationPoint(3.75F, -8F, -0.5F);

		headModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,2F, -1F, -0.25F, -1.75F, -1F, -0.25F, -2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.75F); // Box 125
		headModel[69].setRotationPoint(2F, -11F, 0F);

		headModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, -0.5F, -3F, 1F, -0.25F, -3F, 1F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F); // Box 126
		headModel[70].setRotationPoint(2.25F, -9F, -0.5F);

		headModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, -1F, 2.75F, 0F, -1F, 2.75F, -0.25F, -1F, -1.75F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F); // Box 127
		headModel[71].setRotationPoint(-2F, -11F, 3F);

		headModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, -1F, 2.75F, -1F, -1F, 2.75F, -0.75F, -1F, -1.75F, -0.75F, -1F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 128
		headModel[72].setRotationPoint(-1F, -11F, 3F);

		headModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 2.75F, -2F, -1F, 2.75F, 0F, -1F, -2F, -0.25F, -1F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F); // Box 129
		headModel[73].setRotationPoint(0F, -11F, 3F);

		headModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.75F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F); // Box 130
		headModel[74].setRotationPoint(0F, -8F, 3.25F);

		headModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 131
		headModel[75].setRotationPoint(-1F, -8F, 3.25F);

		headModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F); // Box 132
		headModel[76].setRotationPoint(-2F, -8F, 3.25F);

		headModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 1F, 0.5F, 0.75F, 0.75F); // Box 133
		headModel[77].setRotationPoint(-2F, -7F, 3.25F);

		headModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, 0.75F, -0.75F, 0.75F, 1F); // Box 134
		headModel[78].setRotationPoint(0F, -7F, 3.25F);

		headModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, 1F); // Box 135
		headModel[79].setRotationPoint(-1F, -7F, 3.25F);

		headModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0.65F, 0F, -0.5F, 0.4F, 0F, 0.4F, -0.5F, 0F, 0.9F, 0F, 0F, 0F, 0.65F, 0.75F, -0.5F, 0.4F, 0.75F, 0.4F, -0.5F, 0.75F, 0.9F); // Box 137
		headModel[80].setRotationPoint(2F, -2.5F, 0F);

		headModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 139
		headModel[81].setRotationPoint(3.65F, -2F, -0.5F);

		headModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, -1.5F, -0.75F, 0F, -1.75F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0.5F, 0.75F, -1.5F, -0.75F, 0.75F, -1.75F, -0.75F, 0.75F, 1F, 0.5F, 0.75F, 0.75F); // Box 140
		headModel[82].setRotationPoint(-2F, -2.5F, 3.15F);

		headModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, -1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F, -0.75F, 0.75F, -1.75F, 0.5F, 0.75F, -1.5F, 0.5F, 0.75F, 0.75F, -0.75F, 0.75F, 1F); // Box 141
		headModel[83].setRotationPoint(0F, -2.5F, 3.15F);

		headModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.75F, -1.75F, -0.25F, 0.75F, -1.75F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, 1F); // Box 142
		headModel[84].setRotationPoint(-1F, -2.5F, 3.15F);

		headModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,1F, 0F, -2.35F, -0.5F, 0F, -4.75F, -0.5F, 0F, 1F, 0.4F, 0F, 0.5F, 0.75F, 0.5F, -0.55F, -0.5F, 0.75F, -2.75F, -0.5F, -0.5F, 0.25F, -0.1F, -0.5F, -0.25F); // Box 143
		headModel[85].setRotationPoint(-4F, 0.25F, -0.0999999999999996F);

		headModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, -1.5F, -0.75F, 0F, -2F, -0.75F, 0F, 1F, 0.5F, 0F, 0.75F, 0.5F, 0.75F, 0.5F, -0.75F, 0.75F, 0.5F, -0.75F, -0.5F, 0.25F, 0.5F, -0.5F, 0F); // Box 144
		headModel[86].setRotationPoint(-2F, 0.25F, 3.15F);

		headModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 145
		headModel[87].setRotationPoint(-1F, 0.25F, 3.15F);

		headModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, -2F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.75F, -0.75F, 0F, 1F, -0.75F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -0.5F, 0F, -0.75F, -0.5F, 0.25F); // Box 146
		headModel[88].setRotationPoint(0F, 0.25F, 3.15F);

		headModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, -0.75F, -1.75F, 0F, 0F, -1.75F, -0.15F, -0.75F, 1.75F, -0.25F, -0.75F, 0F, 0.25F, 0.25F, -1.75F, 0F, 0F, -1.5F, -0.15F, 0.25F, 2.25F, -0.25F, 0.25F, 0F); // Box 149
		headModel[89].setRotationPoint(-5.25F, -1F, -1.75F);

		headModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1.75F, 0.25F, -0.75F, -1.75F, -0.25F, -0.75F, 0F, -0.15F, -0.75F, 1.75F, 0F, 0F, -1.5F, 0.25F, 0.25F, -1.75F, -0.25F, 0.25F, 0F, -0.15F, 0.25F, 2.25F); // Box 154
		headModel[90].setRotationPoint(4.25F, -1F, -1.75F);

		headModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, -0.75F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, -0.5F); // Box 145
		headModel[91].setRotationPoint(-5.5F, 0.25F, 0F);

		headModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F); // Box 146
		headModel[92].setRotationPoint(-5.5F, 0.25F, -1F);

		headModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.4F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, -4.75F, 1F, 0F, -2.25F, -0.1F, -0.5F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.75F, -2.75F, 0.75F, 0.5F, -0.5F); // Box 148
		headModel[93].setRotationPoint(-4F, 0.25F, -4F);

		headModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, -4.75F, 1F, 0F, -2.35F, 0.4F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0.75F, -2.75F, 0.75F, 0.5F, -0.55F, -0.1F, -0.5F, -0.25F, -0.5F, -0.5F, 0.25F); // Box 149
		headModel[94].setRotationPoint(2F, 0.25F, -0.0999999999999996F);

		headModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F, -0.75F, 1.5F, -0.5F, 0F, 0F, 0F); // Box 150
		headModel[95].setRotationPoint(4.5F, 0.25F, 0F);

		headModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, -0.5F, -0.75F, 1.5F, 0F, 0F, 0F, 0F); // Box 151
		headModel[96].setRotationPoint(4.5F, 0.25F, -1F);

		headModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 1F, 0.4F, 0F, 0.5F, 1F, 0F, -2.25F, -0.5F, 0F, -4.75F, -0.5F, -0.5F, 0.25F, -0.1F, -0.5F, -0.25F, 0.75F, 0.5F, -0.5F, -0.5F, 0.75F, -2.75F); // Box 152
		headModel[97].setRotationPoint(2F, 0.25F, -4F);
	}
}