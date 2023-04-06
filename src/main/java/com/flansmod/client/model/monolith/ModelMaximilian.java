//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Maximilian
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMaximilian extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 90;

	public ModelMaximilian() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];
		leftArmModel = new ModelRendererTurbo[37];
		rightArmModel = new ModelRendererTurbo[40];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 89
		bodyModel[3] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 105
		bodyModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 106
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 54
		bodyModel[9] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 56
		bodyModel[10] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 57
		bodyModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 58
		bodyModel[12] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 107
		bodyModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 108
		bodyModel[18] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 66
		bodyModel[21] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 68
		bodyModel[22] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 71
		bodyModel[24] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 76
		bodyModel[25] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 71
		bodyModel[26] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 89
		bodyModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 90
		bodyModel[28] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 91
		bodyModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 125
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 127
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 129
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 131
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 132
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 135
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 137
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 138
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 139
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 140
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 141
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 142
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 143
		bodyModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 144
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 145
		bodyModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 146
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 147
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 149
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 150
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 151
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 152
		bodyModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		bodyModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 155
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 156
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 157
		bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 158
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 159
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 160
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 161
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 163
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 165
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 167
		bodyModel[69] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 168
		bodyModel[70] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 169
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 171
		bodyModel[72] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 172
		bodyModel[73] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 173
		bodyModel[74] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 174
		bodyModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 175
		bodyModel[76] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 176
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 177
		bodyModel[78] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 178
		bodyModel[79] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 179
		bodyModel[80] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		bodyModel[81] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 181
		bodyModel[82] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 182
		bodyModel[83] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 183
		bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 184
		bodyModel[85] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 185
		bodyModel[86] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		bodyModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 187
		bodyModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 188
		bodyModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 189
		bodyModel[90] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		bodyModel[91] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 191
		bodyModel[92] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 192
		bodyModel[93] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 193
		bodyModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 194
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 195
		bodyModel[96] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 196
		bodyModel[97] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 197
		bodyModel[98] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 198
		bodyModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 199
		bodyModel[100] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 200

		bodyModel[0].addShapeBox(-4F, 1.4F, -2F, 8, 12, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 6.5F, -2F, 4, 2, 4, 0F,0.8F, -1F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.9F, -1F, 0.6F, 0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.4F, 0.3F, 0.5F, 0.15F); // Box 15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 5.5F, -2F, 4, 1, 4, 0F,1.1F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 1.2F, 0F, 0.9F, 0.8F, 1F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.9F, 1F, 0.6F); // Box 89
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 9.2F, -2F, 8, 1, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 105
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.6F, -0.4F, 0.6F, 0.6F, -0.4F, 0.6F, 0.6F, -0.4F, 0.6F, 0.6F, -0.4F, 0.6F); // Box 106
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 3.5F, -2F, 4, 2, 4, 0F,0.9F, 0F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 1.2F, 0F, 0.8F, 1.1F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 1.2F, 0F, 0.9F); // Box 50
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9.5F, -2F, 4, 1, 4, 0F,0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.4F, 0.3F, 0.5F, 0.15F, 0.15F, -1F, 0.15F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0.15F, -1F, 0.15F); // Box 52
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 9.2F, -2F, 1, 1, 1, 0F,0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F); // Box 53
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 0.2F, 1F, 0.3F, 0.9F, 0F, 1.2F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 1.2F, 0F, 0.8F); // Box 54
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, -0.5F, -2F, 2, 1, 4, 0F,-0.6F, 0F, -0.5F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, -0.5F, 0F, -0.5F, 0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 0.2F, 1F, 0.3F); // Box 56
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0.5F, -2F, 8, 1, 4, 0F,0F, -0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.9F, 0.6F, 0F, -0.9F, 0.6F); // Box 57
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, -0.5F, -2F, 2, 1, 4, 0F,0F, 0.8F, -0.1F, -0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.8F, -0.1F, 0F, 0.5F, 0.4F, 0.1F, 0.5F, 0.2F, 0.2F, 1F, 0.3F, 0F, 1F, 0.4F); // Box 58
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.4F, 0.1F, 0.5F, 0.2F, 0.2F, 1F, 0.3F, 0F, 1F, 0.4F, 0F, 0F, 2.2F, 0.9F, 0F, 1.2F, 1.2F, 0F, 0.8F, 0F, 0F, 1.2F); // Box 59
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 3.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.2F, 0.9F, 0F, 1.2F, 1.2F, 0F, 0.8F, 0F, 0F, 1.2F, 0F, 0F, 2.5F, 1.1F, 0F, 1.5F, 1.2F, 0F, 0.9F, 0F, 0F, 1.3F); // Box 60
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 5.5F, -2F, 4, 1, 4, 0F,0F, 0F, 2.5F, 1.1F, 0F, 1.5F, 1.2F, 0F, 0.9F, 0F, 0F, 1.3F, 0F, 0F, 2.2F, 0.8F, 1F, 1.2F, 0.9F, 1F, 0.6F, 0F, 0F, 1.2F); // Box 61
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 6.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.2F, 0.8F, -1F, 1.2F, 0.9F, -1F, 0.6F, 0F, 0F, 1.2F, 0F, 0.5F, 0.7F, 0.25F, 0.5F, 0.3F, 0.3F, 0.5F, 0.15F, 0F, 0.5F, 0.4F); // Box 62
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 1.5F, 0F, 1F, 0F, 0.5F, 1.64F, 0F, 0.5F, 1.8F, 1.5F, 0F, 1F); // Box 107
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0.5F, 1.8F); // Box 108
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5.5F, 12.2F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 1F, 1F, 0F, 1.4F, 1.5F, 0F, 1.6F, -0.2F, 0.5F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.7F, 1.5F, 0F, 1.9F, 0.3F, -0.3F, 1F); // Box 55
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5.6F, 13.2F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.9F, 0.4F, 0F, 1.5F, 1.5F, 0F, 1.7F, 0F, 0.3F, 0.9F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.8F, 1.5F, 0.2F, 2F, 0.3F, 0F, 1.1F); // Box 56
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5.6F, 14.2F, -2F, 4, 1, 1, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 1.6F, 0.2F, 0F, 0.9F, 0.2F, 0F, 2.9F, 0.4F, 1.5F, 1.1F, -0.8F, 1.2F, 1.8F, -1.8F, 1.2F, 1.1F, 0.4F, 1.5F, 0.1F); // Box 66
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.5F, 12.2F, -2F, 4, 1, 4, 0F,1F, 0F, 1.4F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, 1.5F, 0F, 1.6F, 0.5F, 0F, 1.7F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 1.5F, 0F, 1.9F); // Box 68
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.6F, 13.2F, -2F, 4, 1, 4, 0F,0.4F, 0F, 1.5F, 0F, 0.3F, 0.9F, 0F, 0.3F, 0.9F, 1.5F, 0F, 1.7F, 0.2F, 0.2F, 1.8F, 0.3F, 0F, 1.1F, 0.3F, 0F, 1.1F, 1.5F, 0.2F, 2F); // Box 69
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(1.6F, 14.2F, -2F, 4, 1, 1, 0F,0.2F, 0F, 1.6F, 0.2F, 0F, 0.9F, 0.2F, 0F, 2.9F, 0.2F, 0F, 0.9F, -0.8F, 1F, 1.8F, 0.4F, 1.5F, 1.1F, 0.4F, 1.5F, 0.1F, -1.8F, 1F, 1.1F); // Box 71
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 9.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.7F, 0.25F, 0.5F, 0.3F, 0.3F, 0.5F, 0.15F, 0F, 0.5F, 0.4F, 0F, -1F, 0.2F, 0.15F, -1F, 0.15F, 0.15F, -1F, 0.15F, 0F, -1F, 0.2F); // Box 76
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2F, -0.5F, -2F, 4, 1, 4, 0F,0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.3F); // Box 71
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 12.5F, -4.5F, 2, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1F, 13F, -4.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1F, 13.5F, -4.5F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 91
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1F, 1.5F, -3.4F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 125
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1F, 3.5F, -4.7F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 127
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1F, 5.5F, -5F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 128
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.2F, 1.5F, -3.4F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 129
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.2F, 3.5F, -4.7F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 130
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.2F, 5.5F, -5F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 131
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.2F, 1.5F, -3.3F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 132
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.2F, 3.5F, -4.6F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 133
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.2F, 5.5F, -4.9F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 134
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-2F, 1.5F, -3.3F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 135
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2F, 3.5F, -4.6F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 136
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2F, 5.5F, -4.9F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 137
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3F, 1.5F, -3.1F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 138
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, 3.5F, -4.4F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 139
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3F, 5.5F, -4.7F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 140
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2.2F, 1.5F, -3.1F, 1, 2, 1, 0F,0F, 0.3F, -0.75F, -0.6F, 0.3F, -0.3F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.2F, 0F, 0F, 0.35F, -0.6F, 0F, 1F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.3F); // Box 141
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2.2F, 3.5F, -4.4F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0F, -0.65F, -0.6F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F); // Box 142
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2.2F, 5.5F, -4.7F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, 0.5F, -2.65F, -0.6F, 0.5F, -2F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.7F); // Box 143
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-1F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 144
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-1F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 145
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-1F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 146
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0.2F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 147
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0.2F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 148
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0.2F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 149
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(1.2F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 150
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(1.2F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 151
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1.2F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 152
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(2.2F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 153
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(2.2F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 154
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(2.2F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 155
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 156
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-2F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 157
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 158
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-3F, 1.5F, 2F, 1, 2, 1, 0F,-0.3F, 1F, 0.2F, -0.3F, 1F, -0.1F, -0.6F, 1F, -0.3F, 0F, 1F, -0.75F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.1F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F); // Box 159
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-3F, 3.5F, 2.8F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 160
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-3F, 5.5F, 2.8F, 1, 3, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.6F, 0.5F, -1.1F, 0F, 0.5F, -1.55F); // Box 161
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-1.5F, 10.5F, -3.1F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.2F, 0.35F, -0.6F, -0.2F, 1F, -0.3F, -0.2F, -1.6F, -0.3F, -0.2F, -1.3F); // Box 163
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-3F, 10.5F, -3.2F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.5F, 0.05F, -0.6F, -0.5F, 0.7F, -0.3F, -0.5F, -1.3F, -0.3F, -0.5F, -1F); // Box 164
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.5F, 10.5F, -3.2F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.6F, -0.25F, -0.6F, -0.6F, 0.4F, -0.3F, -0.6F, -1F, -0.3F, -0.6F, -0.7F); // Box 165
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(0.7F, 10.5F, -3.1F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.2F, 0.35F, -0.6F, -0.2F, 1F, -0.3F, -0.2F, -1.6F, -0.3F, -0.2F, -1.3F); // Box 167
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2.2F, 10.5F, -3.2F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.5F, 0.05F, -0.6F, -0.5F, 0.7F, -0.3F, -0.5F, -1.3F, -0.3F, -0.5F, -1F); // Box 168
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(3.7F, 10.5F, -3.2F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, 0F, -0.6F, -0.25F, -0.6F, -0.6F, 0.4F, -0.3F, -0.6F, -1F, -0.3F, -0.6F, -0.7F); // Box 169
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-3F, 12.2F, -3.2F, 1, 1, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F); // Box 171
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4.5F, 12.2F, -3.1F, 1, 1, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, -0.2F, 0.05F, -0.6F, -0.2F, 0.7F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1F); // Box 172
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-3.2F, 13.3F, -3.2F, 1, 1, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F); // Box 173
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4.7F, 13.3F, -3.1F, 1, 1, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, -0.2F, 0.05F, -0.6F, -0.2F, 0.7F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1F); // Box 174
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3.4F, 14.5F, -3.2F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F); // Box 175
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-4.9F, 14.5F, -3.1F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0F, 0.05F, -0.6F, 0F, 0.7F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1F); // Box 176
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(2F, 12.2F, -3.2F, 1, 1, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F); // Box 177
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(3.5F, 12.2F, -3.1F, 1, 1, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, -0.2F, 0.7F, 0F, -0.2F, 0.05F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1.3F); // Box 178
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2.2F, 13.3F, -3.2F, 1, 1, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F); // Box 179
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(3.7F, 13.3F, -3.1F, 1, 1, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, -0.2F, 0.7F, 0F, -0.2F, 0.05F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1.3F); // Box 180
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3.9F, 14.5F, -3.1F, 1, 2, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0F, 0.7F, 0F, 0F, 0.05F, -0.3F, 0F, -1F, -0.3F, 0F, -1.3F); // Box 181
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(2.4F, 14.5F, -3.2F, 1, 2, 1, 0F,-0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F); // Box 182
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-1.5F, 10.5F, 2.1F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1.6F, -0.6F, -0.2F, 1F, 0F, -0.2F, 0.35F); // Box 183
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-3F, 10.5F, 2F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, -1.3F, -0.6F, -0.5F, 0.7F, 0F, -0.5F, 0.05F); // Box 184
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-4.5F, 10.5F, 2F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -1F, -0.6F, -0.6F, 0.4F, 0F, -0.6F, -0.25F); // Box 185
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(0.7F, 10.5F, 2.1F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1.6F, -0.6F, -0.2F, 1F, 0F, -0.2F, 0.35F); // Box 186
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(2.2F, 10.5F, 2F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, -1.3F, -0.6F, -0.5F, 0.7F, 0F, -0.5F, 0.05F); // Box 187
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(3.7F, 10.5F, 2F, 1, 2, 1, 0F,-0.3F, 0F, 0.2F, -0.3F, 0F, -0.1F, -0.6F, 0F, -0.3F, 0F, 0F, -0.75F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -1F, -0.6F, -0.6F, 0.4F, 0F, -0.6F, -0.25F); // Box 188
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-3F, 12.2F, 2.2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F); // Box 189
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-4.5F, 12.2F, 2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1.3F, -0.6F, -0.2F, 0.7F, 0F, -0.2F, 0.05F); // Box 190
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-3.2F, 13.3F, 2.2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F); // Box 191
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-4.7F, 13.3F, 2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1.3F, -0.6F, -0.2F, 0.7F, 0F, -0.2F, 0.05F); // Box 192
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(2F, 12.2F, 2.2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F); // Box 193
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(3.5F, 12.2F, 2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1F, 0F, -0.2F, 0.05F, -0.6F, -0.2F, 0.7F); // Box 194
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(2.2F, 13.3F, 2.2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F); // Box 195
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(3.7F, 13.3F, 2F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1F, 0F, -0.2F, 0.05F, -0.6F, -0.2F, 0.7F); // Box 196
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(0.5F, 12.4F, 2.5F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F); // Box 197
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(0.700000000000003F, 13.5F, 2.5F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0.4F, -0.3F, -0.1F, -1.3F, -0.3F, -0.1F, -1F, 0F, -0.1F, 0.05F, -0.6F, -0.1F, 0.7F); // Box 198
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-1.5F, 12.4F, 2.5F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F); // Box 199
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-1.7F, 13.5F, 2.5F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.6F, 0.2F, 0.4F, 0F, 0.2F, 0F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1.3F, -0.6F, -0.1F, 0.7F, 0F, -0.1F, 0.05F); // Box 200
		bodyModel[100].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 57
		leftArmModel[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 58
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 60
		leftArmModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 62
		leftArmModel[5] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 101
		leftArmModel[6] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 102
		leftArmModel[7] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 103
		leftArmModel[8] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 104
		leftArmModel[9] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 57
		leftArmModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 58
		leftArmModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 60
		leftArmModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 67
		leftArmModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 68
		leftArmModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 72
		leftArmModel[15] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 77
		leftArmModel[16] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 95
		leftArmModel[17] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 96
		leftArmModel[18] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 97
		leftArmModel[19] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 98
		leftArmModel[20] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 99
		leftArmModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		leftArmModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 110
		leftArmModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		leftArmModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		leftArmModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 113
		leftArmModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114
		leftArmModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		leftArmModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		leftArmModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		leftArmModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		leftArmModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		leftArmModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 120
		leftArmModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 121
		leftArmModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		leftArmModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 123
		leftArmModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 124

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 58
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 5.9F, -2F, 4, 1, 4, 0F,-1.5F, 0.7F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -1.5F, 0.7F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 1.4F, -2F, 2, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 62
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.51F, -4.1F, -1F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.7F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 102
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0F, -0.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 103
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0F, 0.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 104
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.7F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.7F, 1.3F, -0.5F, 1.3F, 1.1F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 3.3F, 2F); // Box 57
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(0F, -4.1F, -3.01F, 1, 2, 2, 0F,1F, -2.3F, 1F, -2F, -2.5F, 1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, -0.5F, -2F, 2F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-3F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0.5F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0.5F, 0.3F, 1.5F); // Box 60
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -0.1F, -3.2F, 2, 2, 1, 0F,0F, 0F, 0.2F, -0.5F, 1.5F, -0.8F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 1F, 0.5F, 0F, 1.2F, -1F, 0F, 2F, -2.5F); // Box 67
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-3F, -0.1F, -3.2F, 2, 2, 1, 0F,0.5F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, 1F, 2F, 0F, 2F, 2F, 0F, 2F, -2.5F, 0F, 1.2F, -2.5F); // Box 68
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-3.59F, -2.1F, -1.99F, 1, 2, 4, 0F,-1.7F, -1.2F, 1.3F, 1.31F, 0.7F, 0.3F, 2.1F, 0.7F, 1.3F, 1F, -1F, 1.5F, -1.5F, 1F, 1.5F, 3.3F, 1.3F, 0.8F, 2.1F, 3.3F, 2F, -0.5F, 3F, 1.8F); // Box 72
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-1F, 6.7F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(3.9F, 1.9F, -2F, 1, 1, 4, 0F,-0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 95
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(3.3F, 2.9F, -2F, 1, 2, 4, 0F,-0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F); // Box 96
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(3.3F, 4.9F, -2F, 1, 2, 4, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F); // Box 97
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(3.9F, 6.9F, -2F, 1, 1, 4, 0F,0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 98
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(0.5F, 3.9F, -2F, 3, 2, 4, 0F,0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F); // Box 99
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2.3F, 1.1F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 109
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(2.3F, 1.1F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 110
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(2.3F, 1.1F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 111
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(2.3F, 1.1F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 112
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(2.3F, 0.1F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 113
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(2.3F, 0.1F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 114
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(2.3F, 0.1F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 115
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(2.3F, 0.1F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 116
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(2.3F, -0.9F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 117
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(2.3F, -0.9F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 118
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(2.3F, -0.9F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 119
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(2.3F, -0.9F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 120
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(2.5F, -2.4F, 1F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 121
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(2.5F, -2.4F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 122
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(2.5F, -2.4F, -1F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 123
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(2.5F, -2.4F, -2F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.3F, 0.4F, -0.6F, 0F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.9F, 0.4F, 0F); // Box 124
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 43
		rightArmModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 44
		rightArmModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 45
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		rightArmModel[5] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 56
		rightArmModel[6] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 59
		rightArmModel[7] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 61
		rightArmModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 63
		rightArmModel[9] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 61
		rightArmModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 62
		rightArmModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
		rightArmModel[12] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 65
		rightArmModel[13] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 66
		rightArmModel[14] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 69
		rightArmModel[15] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 70
		rightArmModel[16] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 73
		rightArmModel[17] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 74
		rightArmModel[18] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 75
		rightArmModel[19] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 76
		rightArmModel[20] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 91
		rightArmModel[21] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 92
		rightArmModel[22] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 93
		rightArmModel[23] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 94
		rightArmModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 93
		rightArmModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 94
		rightArmModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 95
		rightArmModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		rightArmModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 97
		rightArmModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 98
		rightArmModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 99
		rightArmModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		rightArmModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		rightArmModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		rightArmModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		rightArmModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		rightArmModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		rightArmModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		rightArmModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 107
		rightArmModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -1.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 43
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -0.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 44
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 0.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 45
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 55
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 56
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 5.9F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, -1.5F, 0.7F, 0.2F, -1.5F, 0.7F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 59
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 1.4F, -2F, 2, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.5F, 3.9F, -2F, 3, 2, 4, 0F,0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F); // Box 63
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1.51F, -4.1F, -1F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.7F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-1F, -4.1F, -3.01F, 1, 2, 2, 0F,-2F, -2.5F, 1.5F, 1F, -2.3F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2F, 2F, 0F, 1F, 2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 62
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(1F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.2F, 0F, 0F, -0.5F, -2F, 0.5F, 0F, -1.5F, 0.5F, -0.2F, 1F, 0F, -0.5F, 1.5F); // Box 63
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(2.59F, -2.1F, -1.99F, 1, 2, 4, 0F,1.31F, 0.7F, 0.3F, -1.7F, -1.2F, 1.3F, 1F, -1F, 1.5F, 2.1F, 0.7F, 1.3F, 3.3F, 1.3F, 0.8F, -1.5F, 1F, 1.5F, -0.5F, 3F, 1.8F, 2.1F, 3.3F, 2F); // Box 65
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.7F, 0.3F, 0.5F, 0.7F, 1.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0F, 0.3F, -0.9F, 1.5F, 1.3F, 0.5F, 3.3F, 2F, 0.5F, 0F, 0.3F); // Box 66
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(1F, -0.1F, -3F, 2, 1, 1, 0F,0F, 0F, 0.2F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 0.3F, 1F, 0F, 0.5F, -1.5F, 0F, 1F, -1.5F); // Box 69
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-1F, -0.1F, -3F, 2, 1, 1, 0F,-0.5F, 1.5F, -0.6F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, -0.3F, -0.5F); // Box 70
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-2F, 0.9F, -4.6F, 3, 1, 1, 0F,-1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 73
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-2F, 2.9F, -4.6F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.6F, -1F, 0F, 0.2F, -1F, 0F, 0.4F); // Box 74
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-2F, 1.9F, -4.6F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F); // Box 75
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3F, 6.7F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 76
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-4.2F, 2.9F, -2F, 1, 2, 4, 0F,0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F); // Box 91
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-4.2F, 4.9F, -2F, 1, 2, 4, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 92
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-4.8F, 1.9F, -2F, 1, 1, 4, 0F,-0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F); // Box 93
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-4.8F, 6.9F, -2F, 1, 1, 4, 0F,-0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 94
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-3.5F, -2.4F, 1F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 93
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-3.5F, -2.4F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 94
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-3.5F, -2.4F, -1F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 95
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-3.5F, -2.4F, -2F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 96
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-3.3F, -0.9F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 97
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-3.3F, -0.9F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 98
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-3.3F, -0.9F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 99
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-3.3F, -0.9F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 100
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-3.3F, 0.1F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 101
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-3.3F, 0.1F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 102
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-3.3F, 0.1F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 103
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-3.3F, 0.1F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 104
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-3.3F, 1.1F, -2F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 105
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-3.3F, 1.1F, -1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 106
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(-3.3F, 1.1F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 107
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-3.3F, 1.1F, 1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, -0.3F, 0.4F, -0.6F, -0.9F, 0.4F, 0F, 0.3F, 0.4F, -0.3F); // Box 108
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 83
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 84
		leftLegModel[3] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 85
		leftLegModel[4] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 86
		leftLegModel[5] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 87
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 88
		leftLegModel[7] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 89
		leftLegModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 90

		leftLegModel[0].addShapeBox(-1.5F, 11.1F, -1.3F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 0.0999999999999996F, -2F, 4, 5, 4, 0F,0.4F, 0F, 0.6F, 0.8F, 0.5F, 0.6F, 0.8F, 0.5F, 0.5F, -2F, 0F, 0.5F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, -1F, 0.2F, -2F, -1F, 0.2F); // Box 83
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 6.1F, -2F, 4, 4, 4, 0F,0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1F, 0.6F, 0.7F, -1F, 0.6F, 0.6F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F); // Box 85
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 0.9F, -2F, 4, 8, 4, 0F,0.6F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, 0.6F, 0F, 0.1F); // Box 86
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 87
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2.5F, 6.1F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(2.5F, 5.1F, -0.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.5F, 11.1F, -3.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 90
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 20
		rightLegModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 21
		rightLegModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 29
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 98
		rightLegModel[5] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 78
		rightLegModel[6] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 79
		rightLegModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 80
		rightLegModel[8] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 81

		rightLegModel[0].addShapeBox(-2.5F, 11.1F, -1.3F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 0.0999999999999996F, -2F, 4, 5, 4, 0F,0.8F, 0.5F, 0.6F, 0.4F, 0F, 0.6F, -2F, 0F, 0.5F, 0.8F, 0.5F, 0.5F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, -2F, -1F, 0.2F, 0.2F, -1F, 0.2F); // Box 20
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 21
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 6.1F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, -1F, 0.6F, 0.2F, -1F, 0.6F, 0.1F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 29
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, 0.9F, -2F, 4, 8, 4, 0F,-0.4F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.1F, -0.4F, 0F, 0.1F); // Box 98
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 78
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3.5F, 6.1F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 79
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3.5F, 5.1F, -0.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 80
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.5F, 11.1F, -3.3F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 81
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}
}