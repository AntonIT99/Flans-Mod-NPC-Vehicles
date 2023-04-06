//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAltayAHT extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 256;

	public ModelAltayAHT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[153];
		turretModel = new ModelRendererTurbo[111];
		barrelModel = new ModelRendererTurbo[23];
		leftTrackWheelModels = new ModelRendererTurbo[54];
		rightTrackWheelModels = new ModelRendererTurbo[54];
		leftTrackModel = new ModelRendererTurbo[9];
		rightTrackModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import CR.RightNoseBridgeAngle
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import CR.Core
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import CR.NoseAngle
		bodyModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import CR.BackCore
		bodyModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import CR.LowerCore
		bodyModel[5] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import CR.LowerBackCore
		bodyModel[6] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 126
		bodyModel[7] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 111
		bodyModel[8] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 112
		bodyModel[9] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 114
		bodyModel[10] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 116
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 122
		bodyModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 181
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 182
		bodyModel[15] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 183
		bodyModel[16] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 184
		bodyModel[17] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 185
		bodyModel[18] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 186
		bodyModel[19] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 187
		bodyModel[20] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 188
		bodyModel[21] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 189
		bodyModel[22] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 190
		bodyModel[23] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 191
		bodyModel[24] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 192
		bodyModel[25] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 193
		bodyModel[26] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 194
		bodyModel[27] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 195
		bodyModel[28] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 196
		bodyModel[29] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 197
		bodyModel[30] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 198
		bodyModel[31] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 156
		bodyModel[32] = new ModelRendererTurbo(this, 283, 231, textureX, textureY); // Box 157
		bodyModel[33] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 158
		bodyModel[34] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 161
		bodyModel[35] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 163
		bodyModel[36] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 164
		bodyModel[37] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 165
		bodyModel[38] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 166
		bodyModel[39] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 168
		bodyModel[40] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 169
		bodyModel[41] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 170
		bodyModel[42] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 171
		bodyModel[43] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 172
		bodyModel[44] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 173
		bodyModel[45] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 175
		bodyModel[47] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 176
		bodyModel[48] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 178
		bodyModel[50] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 188
		bodyModel[52] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 189
		bodyModel[53] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 190
		bodyModel[54] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 239
		bodyModel[55] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 240
		bodyModel[56] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 241
		bodyModel[57] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 242
		bodyModel[58] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 243
		bodyModel[59] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 244
		bodyModel[60] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 245
		bodyModel[61] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 246
		bodyModel[62] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 247
		bodyModel[63] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 248
		bodyModel[64] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 249
		bodyModel[65] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 250
		bodyModel[66] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 251
		bodyModel[67] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 252
		bodyModel[68] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 253
		bodyModel[69] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 254
		bodyModel[70] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 255
		bodyModel[71] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 256
		bodyModel[72] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 257
		bodyModel[73] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 259
		bodyModel[74] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 260
		bodyModel[75] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 261
		bodyModel[76] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 262
		bodyModel[77] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 263
		bodyModel[78] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 264
		bodyModel[79] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 265
		bodyModel[80] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 266
		bodyModel[81] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 267
		bodyModel[82] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 268
		bodyModel[83] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 275
		bodyModel[85] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 276
		bodyModel[86] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 277
		bodyModel[87] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 278
		bodyModel[88] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 3
		bodyModel[89] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 4
		bodyModel[90] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 5
		bodyModel[91] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 6
		bodyModel[92] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 7
		bodyModel[93] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 8
		bodyModel[94] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 9
		bodyModel[95] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 10
		bodyModel[96] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 11
		bodyModel[97] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 12
		bodyModel[98] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 13
		bodyModel[99] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 14
		bodyModel[100] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 21
		bodyModel[101] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 22
		bodyModel[102] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 23
		bodyModel[103] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 8
		bodyModel[104] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 9
		bodyModel[105] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 10
		bodyModel[106] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 4
		bodyModel[107] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 5
		bodyModel[108] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 6
		bodyModel[109] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 7
		bodyModel[110] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 8
		bodyModel[111] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 9
		bodyModel[112] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 19
		bodyModel[113] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 20
		bodyModel[114] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 21
		bodyModel[115] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 22
		bodyModel[116] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 23
		bodyModel[117] = new ModelRendererTurbo(this, 737, 177, textureX, textureY); // Box 24
		bodyModel[118] = new ModelRendererTurbo(this, 625, 201, textureX, textureY); // Box 25
		bodyModel[119] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 26
		bodyModel[120] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 27
		bodyModel[121] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 28
		bodyModel[122] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 29
		bodyModel[123] = new ModelRendererTurbo(this, 673, 201, textureX, textureY); // Box 30
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[127] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 1
		bodyModel[129] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 3
		bodyModel[131] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 4
		bodyModel[132] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 5
		bodyModel[133] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 6
		bodyModel[134] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 7
		bodyModel[135] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 8
		bodyModel[136] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 9
		bodyModel[137] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 10
		bodyModel[138] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 11
		bodyModel[139] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 12
		bodyModel[140] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 13
		bodyModel[141] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 14
		bodyModel[142] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		bodyModel[143] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 16
		bodyModel[144] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 17
		bodyModel[145] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 18
		bodyModel[146] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 19
		bodyModel[147] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 20
		bodyModel[148] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 21
		bodyModel[149] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 22
		bodyModel[150] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 23
		bodyModel[151] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 24
		bodyModel[152] = new ModelRendererTurbo(this, 97, 173, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F); // Import CR.RightNoseBridgeAngle
		bodyModel[0].setRotationPoint(19F, -15.5F, 18F);

		bodyModel[1].addBox(0F, 0F, 0F, 48, 8, 11, 0F); // Import CR.Core
		bodyModel[1].setRotationPoint(-29F, -16.5F, 18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 13, 36, 0F,0F, -0.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import CR.NoseAngle
		bodyModel[2].setRotationPoint(19F, -15.4F, -18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 32, 4, 58, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Import CR.BackCore
		bodyModel[3].setRotationPoint(-60F, -18F, -29F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 82, 16, 36, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR.LowerCore
		bodyModel[4].setRotationPoint(-36F, -11.5F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 28, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import CR.LowerBackCore
		bodyModel[5].setRotationPoint(-62F, -18.5F, -18F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, -4F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.5F, -4F, 0F); // Box 126
		bodyModel[6].setRotationPoint(-55F, -10F, 29F);

		bodyModel[7].addBox(0F, 0F, 0F, 48, 15, 36, 0F); // Box 111
		bodyModel[7].setRotationPoint(-29F, -16.3F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 7, 36, 0F,0F, 0.4F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[8].setRotationPoint(54F, -12F, -18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 5, 36, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, -10F, -1.5F, 0F, -10F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 114
		bodyModel[9].setRotationPoint(46F, -1F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-1F, -0.5F, 0.6F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0F, -1F, -0.5F, 0F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[10].setRotationPoint(58F, -10.8F, 10.9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 119
		bodyModel[11].setRotationPoint(59.2F, -10.3F, 11.6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F); // Box 122
		bodyModel[12].setRotationPoint(59.2F, -10F, 14.6F);

		bodyModel[13].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[13].setRotationPoint(38.5F, 4.5F, 21.8F);
		bodyModel[13].rotateAngleZ = 0.78539816F;

		bodyModel[14].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[14].setRotationPoint(43.5F, -0.5F, 19.8F);
		bodyModel[14].rotateAngleZ = -0.62831853F;

		bodyModel[15].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[15].setRotationPoint(46.5F, 1.5F, 14.8F);

		bodyModel[16].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[16].setRotationPoint(33.5F, 1.5F, 14.8F);

		bodyModel[17].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[17].setRotationPoint(30.5F, -0.5F, 19.8F);
		bodyModel[17].rotateAngleZ = -0.62831853F;

		bodyModel[18].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[18].setRotationPoint(25.5F, 4.5F, 21.8F);
		bodyModel[18].rotateAngleZ = 0.78539816F;

		bodyModel[19].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[19].setRotationPoint(21.5F, 1.5F, 14.8F);

		bodyModel[20].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[20].setRotationPoint(18.5F, -0.5F, 19.8F);
		bodyModel[20].rotateAngleZ = -0.62831853F;

		bodyModel[21].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[21].setRotationPoint(13.5F, 4.5F, 21.8F);
		bodyModel[21].rotateAngleZ = 0.78539816F;

		bodyModel[22].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[22].setRotationPoint(-2.5F, 1.5F, 14.8F);

		bodyModel[23].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[23].setRotationPoint(-5.5F, -0.5F, 19.8F);
		bodyModel[23].rotateAngleZ = -0.62831853F;

		bodyModel[24].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[24].setRotationPoint(-10.5F, 4.5F, 21.8F);
		bodyModel[24].rotateAngleZ = 0.78539816F;

		bodyModel[25].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[25].setRotationPoint(-14.5F, 1.5F, 14.8F);

		bodyModel[26].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[26].setRotationPoint(-17.5F, -0.5F, 19.8F);
		bodyModel[26].rotateAngleZ = -0.62831853F;

		bodyModel[27].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[27].setRotationPoint(-22.5F, 4.5F, 21.8F);
		bodyModel[27].rotateAngleZ = 0.78539816F;

		bodyModel[28].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[28].setRotationPoint(-28.5F, 1.5F, 14.8F);

		bodyModel[29].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[29].setRotationPoint(-31.5F, -0.5F, 19.8F);
		bodyModel[29].rotateAngleZ = -0.62831853F;

		bodyModel[30].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[30].setRotationPoint(-36.5F, 4.5F, 21.8F);
		bodyModel[30].rotateAngleZ = 0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 39, 5, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[31].setRotationPoint(-60F, -14F, -29F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 13F, -7F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 13F, -7F, 0F, 13F); // Box 157
		bodyModel[32].setRotationPoint(-52F, -0.5F, -5F);

		bodyModel[33].addShapeBox(0F, -1.5F, 0F, 4, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[33].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[33].rotateAngleZ = 0.55850536F;

		bodyModel[34].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[34].setRotationPoint(-62F, -11.5F, 14F);
		bodyModel[34].rotateAngleZ = 0.55850536F;

		bodyModel[35].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[35].setRotationPoint(-62F, -11.5F, 5F);
		bodyModel[35].rotateAngleZ = 0.55850536F;

		bodyModel[36].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[36].setRotationPoint(-62F, -11.5F, -5F);
		bodyModel[36].rotateAngleZ = 0.55850536F;

		bodyModel[37].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[37].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[37].rotateAngleZ = 0.55850536F;

		bodyModel[38].addShapeBox(0F, -0.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 166
		bodyModel[38].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[38].rotateAngleZ = 0.55850536F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 168
		bodyModel[39].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[39].rotateAngleZ = 0.55850536F;

		bodyModel[40].addShapeBox(0F, 1F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 169
		bodyModel[40].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[40].rotateAngleZ = 0.55850536F;

		bodyModel[41].addShapeBox(0F, 2F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 170
		bodyModel[41].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[41].rotateAngleZ = 0.55850536F;

		bodyModel[42].addShapeBox(0F, 3F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 171
		bodyModel[42].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[42].rotateAngleZ = 0.55850536F;

		bodyModel[43].addShapeBox(0F, 4F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 172
		bodyModel[43].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[43].rotateAngleZ = 0.55850536F;

		bodyModel[44].addShapeBox(0F, 5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 173
		bodyModel[44].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[44].rotateAngleZ = 0.55850536F;

		bodyModel[45].addShapeBox(0F, 5.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 174
		bodyModel[45].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[45].rotateAngleZ = 0.55850536F;

		bodyModel[46].addShapeBox(0F, 4.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 175
		bodyModel[46].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[46].rotateAngleZ = 0.55850536F;

		bodyModel[47].addShapeBox(0F, 3.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 176
		bodyModel[47].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[47].rotateAngleZ = 0.55850536F;

		bodyModel[48].addShapeBox(0F, 2.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 177
		bodyModel[48].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[48].rotateAngleZ = 0.55850536F;

		bodyModel[49].addShapeBox(0F, 1.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 178
		bodyModel[49].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[49].rotateAngleZ = 0.55850536F;

		bodyModel[50].addShapeBox(0F, 0.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 179
		bodyModel[50].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[50].rotateAngleZ = 0.55850536F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 32, 6, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F); // Box 188
		bodyModel[51].setRotationPoint(19F, -15.5F, -29F);

		bodyModel[52].addBox(0F, 0F, 0F, 48, 8, 11, 0F); // Box 189
		bodyModel[52].setRotationPoint(-29F, -16.5F, -29F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, 0F, 0F, 0.5F); // Box 190
		bodyModel[53].setRotationPoint(51F, -12.5F, -29F);

		bodyModel[54].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[54].setRotationPoint(38.5F, 4.5F, -22.8F);
		bodyModel[54].rotateAngleZ = 0.78539816F;

		bodyModel[55].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[55].setRotationPoint(43.5F, -0.5F, -21.8F);
		bodyModel[55].rotateAngleZ = -0.62831853F;

		bodyModel[56].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[56].setRotationPoint(46.5F, 1.5F, -20.8F);

		bodyModel[57].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[57].setRotationPoint(33.5F, 1.5F, -20.8F);

		bodyModel[58].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[58].setRotationPoint(30.5F, -0.5F, -21.8F);
		bodyModel[58].rotateAngleZ = -0.62831853F;

		bodyModel[59].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[59].setRotationPoint(25.5F, 4.5F, -22.8F);
		bodyModel[59].rotateAngleZ = 0.78539816F;

		bodyModel[60].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[60].setRotationPoint(21.5F, 1.5F, -20.8F);

		bodyModel[61].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[61].setRotationPoint(18.5F, -0.5F, -21.8F);
		bodyModel[61].rotateAngleZ = -0.62831853F;

		bodyModel[62].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[62].setRotationPoint(13.5F, 4.5F, -22.8F);
		bodyModel[62].rotateAngleZ = 0.78539816F;

		bodyModel[63].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[63].setRotationPoint(-2.5F, 1.5F, -20.8F);

		bodyModel[64].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[64].setRotationPoint(-5.5F, -0.5F, -21.8F);
		bodyModel[64].rotateAngleZ = -0.62831853F;

		bodyModel[65].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[65].setRotationPoint(-10.5F, 4.5F, -22.8F);
		bodyModel[65].rotateAngleZ = 0.78539816F;

		bodyModel[66].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[66].setRotationPoint(-14.5F, 1.5F, -20.8F);

		bodyModel[67].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[67].setRotationPoint(-17.5F, -0.5F, -21.8F);
		bodyModel[67].rotateAngleZ = -0.62831853F;

		bodyModel[68].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[68].setRotationPoint(-22.5F, 4.5F, -22.8F);
		bodyModel[68].rotateAngleZ = 0.78539816F;

		bodyModel[69].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[69].setRotationPoint(-28.5F, 1.5F, -20.8F);

		bodyModel[70].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[70].setRotationPoint(-31.5F, -0.5F, -21.8F);
		bodyModel[70].rotateAngleZ = -0.62831853F;

		bodyModel[71].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[71].setRotationPoint(-36.5F, 4.5F, -22.8F);
		bodyModel[71].rotateAngleZ = 0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 73, 10, 1, 0F,-6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Box 257
		bodyModel[72].setRotationPoint(-49F, -16F, -30F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, -4F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.5F, -4F, 0F); // Box 259
		bodyModel[73].setRotationPoint(-55F, -10F, -30F);

		bodyModel[74].addShapeBox(0F, 6.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 260
		bodyModel[74].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[74].rotateAngleZ = 0.55850536F;

		bodyModel[75].addShapeBox(0F, 6F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 261
		bodyModel[75].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[75].rotateAngleZ = 0.55850536F;

		bodyModel[76].addShapeBox(-1F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[76].setRotationPoint(-52F, -6.5F, 18F);
		bodyModel[76].rotateAngleZ = -0.27925268F;

		bodyModel[77].addShapeBox(-1F, 7F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[77].setRotationPoint(-53.2F, -6.9F, 18F);
		bodyModel[77].rotateAngleZ = -0.08726646F;

		bodyModel[78].addShapeBox(-1F, -0.7F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[78].setRotationPoint(-49F, -10.5F, 18F);
		bodyModel[78].rotateAngleZ = -0.62831853F;

		bodyModel[79].addShapeBox(-1F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[79].setRotationPoint(-52F, -6.5F, -28F);
		bodyModel[79].rotateAngleZ = -0.27925268F;

		bodyModel[80].addShapeBox(-1F, 7F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[80].setRotationPoint(-53.2F, -6.9F, -28F);
		bodyModel[80].rotateAngleZ = -0.08726646F;

		bodyModel[81].addShapeBox(-1F, -0.7F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[81].setRotationPoint(-49F, -10.5F, -28F);
		bodyModel[81].rotateAngleZ = -0.62831853F;

		bodyModel[82].addShapeBox(0.5F, 0F, 0F, 3, 5, 31, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 268
		bodyModel[82].setRotationPoint(-64F, -18.3F, -15.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 273
		bodyModel[83].setRotationPoint(-61.8F, -17.8F, 17F);

		bodyModel[84].addShapeBox(-1F, 0.3F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[84].setRotationPoint(-56F, -10.5F, 17.5F);
		bodyModel[84].rotateAngleZ = 0.36651914F;

		bodyModel[85].addShapeBox(-1F, 0.3F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[85].setRotationPoint(-56F, -10.5F, -29.5F);
		bodyModel[85].rotateAngleZ = 0.36651914F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 20, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[86].setRotationPoint(-56F, -18.8F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 20, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[87].setRotationPoint(-56F, -18.8F, -14F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-1F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.6F, -1F, -0.5F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 3
		bodyModel[88].setRotationPoint(58F, -10.8F, -17.9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 4
		bodyModel[89].setRotationPoint(59.2F, -10.3F, -14.6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 5
		bodyModel[90].setRotationPoint(59.2F, -10F, -16.6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 32, 11, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[91].setRotationPoint(19F, -15F, -30F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F,0F, -0.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 0.2F, 0F, 0F, 0.5F); // Box 7
		bodyModel[92].setRotationPoint(56F, -12.5F, -29F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[93].setRotationPoint(51F, -12.5F, 18F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 73, 10, 1, 0F,-6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Box 9
		bodyModel[94].setRotationPoint(-49F, -16F, 29F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 32, 11, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[95].setRotationPoint(19F, -15F, 29F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F,0F, -0.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.2F, 2F, 0F, 1F, 0F, 0F, 0F); // Box 11
		bodyModel[96].setRotationPoint(56F, -12.5F, 18F);

		bodyModel[97].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[97].setRotationPoint(8.5F, 1.5F, 14.8F);

		bodyModel[98].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[98].setRotationPoint(5.5F, -0.5F, 19.8F);
		bodyModel[98].rotateAngleZ = -0.62831853F;

		bodyModel[99].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[99].setRotationPoint(0.5F, 4.5F, 21.8F);
		bodyModel[99].rotateAngleZ = 0.78539816F;

		bodyModel[100].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[100].setRotationPoint(5.5F, -0.5F, -21.8F);
		bodyModel[100].rotateAngleZ = -0.62831853F;

		bodyModel[101].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[101].setRotationPoint(0.5F, 4.5F, -22.8F);
		bodyModel[101].rotateAngleZ = 0.78539816F;

		bodyModel[102].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[102].setRotationPoint(8.5F, 1.5F, -20.8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 8
		bodyModel[103].setRotationPoint(-61.8F, -17.8F, -28F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[104].setRotationPoint(-62.5F, -17.5F, 20.6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[105].setRotationPoint(-62.5F, -17.5F, -27.6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 36, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[106].setRotationPoint(-17F, -16F, -33F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 36, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 5
		bodyModel[107].setRotationPoint(-17F, -16F, -38F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 37, 16, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[108].setRotationPoint(19F, -16F, -35F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 37, 14, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 7
		bodyModel[109].setRotationPoint(19F, -16F, -38F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F,0F, 0F, 0F, -3F, -0.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, -2F); // Box 8
		bodyModel[110].setRotationPoint(56F, -12F, -38F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F,0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[111].setRotationPoint(56F, -12F, -33F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 36, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[112].setRotationPoint(-17F, -16F, 30F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 36, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[113].setRotationPoint(-17F, -16F, 33F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 37, 16, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[114].setRotationPoint(19F, -16F, 29F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 37, 14, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[115].setRotationPoint(19F, -16F, 35F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F,0F, 0F, 0F, 1F, -1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, -1F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[116].setRotationPoint(56F, -12F, 33F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F,0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[117].setRotationPoint(56F, -12F, 29F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 2, 36, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[118].setRotationPoint(57F, -11.8F, -18F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 4, 36, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 26
		bodyModel[119].setRotationPoint(56.4F, -7.8F, -18F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 15, 6, 36, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -4F); // Box 27
		bodyModel[120].setRotationPoint(45.9F, -3.8F, -18F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 28
		bodyModel[121].setRotationPoint(59F, -9.8F, -1.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 10, 18, 0F,-12F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -12F, 0F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F); // Box 29
		bodyModel[122].setRotationPoint(45.9F, -5.8F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[123].setRotationPoint(61.9F, -0.8F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 8, 80, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[124].setRotationPoint(70.9F, -1.8F, -40F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 8, 80, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[125].setRotationPoint(70.9F, 6.2F, -40F);
		bodyModel[125].rotateAngleZ = 0.76794487F;

		bodyModel[126].addShapeBox(0F, -4F, 0F, 3, 4, 80, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[126].setRotationPoint(70.9F, -1.8F, -40F);
		bodyModel[126].rotateAngleZ = -0.2268928F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[127].setRotationPoint(-70F, -15.5F, -34.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[128].setRotationPoint(-70F, -12.5F, -34.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[129].setRotationPoint(-70F, -6.5F, -34.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[130].setRotationPoint(-70F, -9.5F, -34.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[131].setRotationPoint(-70F, -3.5F, -34.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[132].setRotationPoint(-43F, -15.5F, -34.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[133].setRotationPoint(-56F, -15.5F, -34.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[134].setRotationPoint(-70F, -15.5F, -34.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[135].setRotationPoint(-30F, -15.5F, -34.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[136].setRotationPoint(-70F, -1.5F, -34.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[137].setRotationPoint(-70F, -15.5F, 33.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[138].setRotationPoint(-70F, -12.5F, 33.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[139].setRotationPoint(-70F, -6.5F, 33.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[140].setRotationPoint(-70F, -9.5F, 33.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[141].setRotationPoint(-70F, -3.5F, 33.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[142].setRotationPoint(-43F, -15.5F, 33.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[143].setRotationPoint(-56F, -15.5F, 33.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[144].setRotationPoint(-70F, -15.5F, 33.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[145].setRotationPoint(-30F, -15.5F, 33.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[146].setRotationPoint(-70F, -1.5F, 33.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 20
		bodyModel[147].setRotationPoint(-70F, -15.5F, -29F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 21
		bodyModel[148].setRotationPoint(-70F, -12.5F, -29F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 22
		bodyModel[149].setRotationPoint(-70F, -9.5F, -29F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 23
		bodyModel[150].setRotationPoint(-70F, -6.5F, -29F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 24
		bodyModel[151].setRotationPoint(-70F, -3.5F, -29F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 25
		bodyModel[152].setRotationPoint(-70F, -1.5F, -29F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import TR.Center
		turretModel[1] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import TR.CommanderHatch
		turretModel[3] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 2
		turretModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		turretModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 134
		turretModel[6] = new ModelRendererTurbo(this, 839, 41, textureX, textureY); // Box 136
		turretModel[7] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 140
		turretModel[8] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 143
		turretModel[9] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 144
		turretModel[10] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 145
		turretModel[11] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 146
		turretModel[12] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 149
		turretModel[13] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 150
		turretModel[14] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 151
		turretModel[15] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 152
		turretModel[16] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 153
		turretModel[17] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 156
		turretModel[18] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 157
		turretModel[19] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 158
		turretModel[20] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 159
		turretModel[21] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 160
		turretModel[22] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 279
		turretModel[23] = new ModelRendererTurbo(this, 737, 177, textureX, textureY); // Box 281
		turretModel[24] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 293
		turretModel[25] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 350
		turretModel[26] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 351
		turretModel[27] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 377
		turretModel[28] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 378
		turretModel[29] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 379
		turretModel[30] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 380
		turretModel[31] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 382
		turretModel[32] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 387
		turretModel[33] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 389
		turretModel[34] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 391
		turretModel[35] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 399
		turretModel[36] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 4
		turretModel[37] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 5
		turretModel[38] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 6
		turretModel[39] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 7
		turretModel[40] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Box 11
		turretModel[41] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 12
		turretModel[42] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 21
		turretModel[43] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 22
		turretModel[44] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 23
		turretModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 24
		turretModel[46] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 25
		turretModel[47] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 26
		turretModel[48] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 27
		turretModel[49] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 28
		turretModel[50] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 29
		turretModel[51] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 30
		turretModel[52] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 31
		turretModel[53] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 32
		turretModel[54] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 33
		turretModel[55] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 34
		turretModel[56] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 35
		turretModel[57] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 36
		turretModel[58] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 37
		turretModel[59] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 38
		turretModel[60] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 40
		turretModel[61] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 41
		turretModel[62] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 42
		turretModel[63] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 43
		turretModel[64] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 44
		turretModel[65] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 45
		turretModel[66] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 46
		turretModel[67] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 47
		turretModel[68] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 48
		turretModel[69] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 50
		turretModel[70] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 51
		turretModel[71] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 52
		turretModel[72] = new ModelRendererTurbo(this, 641, 177, textureX, textureY); // Box 58
		turretModel[73] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 0
		turretModel[74] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 1
		turretModel[75] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 2
		turretModel[76] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 4
		turretModel[77] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 297
		turretModel[78] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 20
		turretModel[79] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 21
		turretModel[80] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 22
		turretModel[81] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 23
		turretModel[82] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 0
		turretModel[83] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 1
		turretModel[84] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 2
		turretModel[85] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 3
		turretModel[86] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 10
		turretModel[87] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 12
		turretModel[88] = new ModelRendererTurbo(this, 705, 177, textureX, textureY); // Box 13
		turretModel[89] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 14
		turretModel[90] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 15
		turretModel[91] = new ModelRendererTurbo(this, 841, 43, textureX, textureY); // Box 16
		turretModel[92] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Box 17
		turretModel[93] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 18
		turretModel[94] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 34
		turretModel[95] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 35
		turretModel[96] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 36
		turretModel[97] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 37
		turretModel[98] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 38
		turretModel[99] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 39
		turretModel[100] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 40
		turretModel[101] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 41
		turretModel[102] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 42
		turretModel[103] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 43
		turretModel[104] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 44
		turretModel[105] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 45
		turretModel[106] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 46
		turretModel[107] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 47
		turretModel[108] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 48
		turretModel[109] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 49
		turretModel[110] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 50

		turretModel[0].addShapeBox(-3F, -2F, 2F, 2, 12, 28, 0F,0F, -1F, -9F, 8F, -1.4F, -9F, 8F, -3F, -7.2F, 0F, -1.5F, -7F, 0F, 3F, -9F, 8F, 3F, -9F, 8F, 2F, -5.2F, 0F, 2F, -5F); // Import TR.Center
		turretModel[0].setRotationPoint(19F, -30F, 0F);

		turretModel[1].addShapeBox(-35F, 0F, 0F, 29, 8, 24, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.5F, 0F); // Import TR.ConverttobasketArea
		turretModel[1].setRotationPoint(-3F, -30.2F, -12F);

		turretModel[2].addShapeBox(4F, 0F, -17F, 3, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Import TR.CommanderHatch
		turretModel[2].setRotationPoint(2F, -33F, 0F);

		turretModel[3].addShapeBox(-2F, 0F, -17F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 2
		turretModel[3].setRotationPoint(0F, -33F, 0F);

		turretModel[4].addBox(-5F, 0F, -10F, 0, 0, 0, 0F); // Box 3
		turretModel[4].setRotationPoint(0F, -31F, 0F);

		turretModel[5].addShapeBox(-3F, -2F, 0F, 2, 12, 32, 0F,0F, -1.5F, -7F, 8F, -4F, -7.2F, 8F, -4F, -7F, 0F, -1.5F, -7F, 0F, 2.5F, -5F, 8F, 2.5F, -5.2F, 8F, 3.5F, -7F, 0F, 3F, -7F); // Box 134
		turretModel[5].setRotationPoint(19F, -30F, -30F);

		turretModel[6].addShapeBox(21F, -2F, 0F, 11, 12, 32, 0F,0F, -5F, -7.2F, -1F, -8F, -7.5F, 1.5F, -8.2F, -7F, 0F, -5F, -7F, 0F, 3.5F, -5.2F, 1F, 1F, -6.5F, 3.5F, 1.5F, -7F, 0F, 4.5F, -7F); // Box 136
		turretModel[6].setRotationPoint(5F, -31F, -30F);

		turretModel[7].addShapeBox(17F, 0F, -17F, 4, 6, 5, 0F,1F, 0.2F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0.2F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F); // Box 140
		turretModel[7].setRotationPoint(2F, -34.5F, 0.5F);

		turretModel[8].addShapeBox(-41.5F, -1F, 30.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		turretModel[8].setRotationPoint(1F, -29F, -13F);
		turretModel[8].rotateAngleZ = -0.03490659F;

		turretModel[9].addShapeBox(-41.5F, -1F, -7.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[9].setRotationPoint(1F, -29F, -15F);
		turretModel[9].rotateAngleZ = -0.03490659F;

		turretModel[10].addShapeBox(-42F, -1F, -8.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 145
		turretModel[10].setRotationPoint(1F, -32F, -15.5F);
		turretModel[10].rotateAngleZ = -0.03490659F;

		turretModel[11].addShapeBox(-42F, -1F, 34.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 146
		turretModel[11].setRotationPoint(1F, -32F, -15.5F);
		turretModel[11].rotateAngleZ = -0.03490659F;

		turretModel[12].addShapeBox(-5F, -1F, -20F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 149
		turretModel[12].setRotationPoint(1F, -32.5F, 0F);

		turretModel[13].addShapeBox(-5F, -3F, -16.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 150
		turretModel[13].setRotationPoint(1F, -32.5F, 0F);
		turretModel[13].rotateAngleZ = 0.2268928F;

		turretModel[14].addShapeBox(-5F, -3F, -23.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 151
		turretModel[14].setRotationPoint(1F, -32.5F, 0F);
		turretModel[14].rotateAngleZ = 0.2268928F;

		turretModel[15].addShapeBox(-5F, -6F, -20F, 2, 2, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 152
		turretModel[15].setRotationPoint(1F, -32.5F, 0F);
		turretModel[15].rotateAngleZ = 0.2268928F;

		turretModel[16].addShapeBox(-5F, -12F, -20F, 2, 2, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 153
		turretModel[16].setRotationPoint(1F, -32.5F, 0F);
		turretModel[16].rotateAngleZ = 0.2268928F;

		turretModel[17].addShapeBox(-3F, 2F, 7F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 156
		turretModel[17].setRotationPoint(-3F, -34.5F, 0F);

		turretModel[18].addShapeBox(-3F, 0F, 10.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 157
		turretModel[18].setRotationPoint(-3F, -34.5F, 0F);
		turretModel[18].rotateAngleZ = 0.2268928F;

		turretModel[19].addShapeBox(-3F, 0F, 3.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 158
		turretModel[19].setRotationPoint(-3F, -34.5F, 0F);
		turretModel[19].rotateAngleZ = 0.2268928F;

		turretModel[20].addShapeBox(-3F, -1F, 7F, 2, 1, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 159
		turretModel[20].setRotationPoint(-3F, -34.5F, 0F);
		turretModel[20].rotateAngleZ = 0.2268928F;

		turretModel[21].addShapeBox(-3F, -11F, 7F, 2, 1, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 160
		turretModel[21].setRotationPoint(-3F, -34.5F, 0F);
		turretModel[21].rotateAngleZ = 0.2268928F;

		turretModel[22].addShapeBox(-35F, 0F, -22F, 14, 1, 44, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F); // Box 279
		turretModel[22].setRotationPoint(12F, -20.3F, 0F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 31, 10, 20, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 281
		turretModel[23].setRotationPoint(-9F, -32.2F, -9F);
		turretModel[23].rotateAngleZ = -0.04363323F;

		turretModel[24].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, -0.5F, -1.5F, -1F, -1F, -2.2F, -1F, -1F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F); // Box 293
		turretModel[24].setRotationPoint(-39F, -32F, -25.2F);

		turretModel[25].addShapeBox(-42F, -1F, -8.5F, 2, 24, 5, 0F,-1F, 40F, -2.5F, -1F, 40F, -2.5F, -1F, 40F, -2.5F, -1F, 40F, -2.5F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F); // Box 350
		turretModel[25].setRotationPoint(1F, -57F, -15.5F);

		turretModel[26].addShapeBox(-42F, -1F, 6.5F, 2, 24, 5, 0F,-1F, 40F, -2.5F, -1F, 40F, -2.5F, -1F, 40F, -2.5F, -1F, 40F, -2.5F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F); // Box 351
		turretModel[26].setRotationPoint(1F, -57F, 12.5F);

		turretModel[27].addShapeBox(17F, 0F, -17F, 7, 1, 10, 0F,0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		turretModel[27].setRotationPoint(1F, -35.5F, -2F);

		turretModel[28].addShapeBox(17F, 0F, -17F, 4, 6, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 378
		turretModel[28].setRotationPoint(6F, -34.5F, -2F);

		turretModel[29].addShapeBox(17F, 0F, -17F, 4, 6, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 379
		turretModel[29].setRotationPoint(6F, -34.5F, 7F);

		turretModel[30].addShapeBox(-3F, -8F, 7F, 2, 3, 15, 0F,-0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 380
		turretModel[30].setRotationPoint(-3F, -34.5F, 0F);
		turretModel[30].rotateAngleZ = 0.2268928F;

		turretModel[31].addShapeBox(4F, 0F, -17F, 5, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 382
		turretModel[31].setRotationPoint(-3F, -33F, 0F);

		turretModel[32].addShapeBox(10F, 2F, -16F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		turretModel[32].setRotationPoint(1F, -30F, 2F);

		turretModel[33].addShapeBox(-28F, 0F, -3F, 8, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 389
		turretModel[33].setRotationPoint(47F, -40.5F, 16F);

		turretModel[34].addShapeBox(-7.5F, -10.2F, -1F, 4, 4, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 391
		turretModel[34].setRotationPoint(30F, -23F, -3F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 27, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 399
		turretModel[35].setRotationPoint(-9F, -27.2F, -5F);

		turretModel[36].addShapeBox(4F, 0F, 10F, 3, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Box 4
		turretModel[36].setRotationPoint(2F, -33F, 0F);

		turretModel[37].addShapeBox(4F, 0F, 10F, 5, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 5
		turretModel[37].setRotationPoint(-3F, -33F, 0F);

		turretModel[38].addShapeBox(-2F, 0F, 10F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 6
		turretModel[38].setRotationPoint(0F, -33F, 0F);

		turretModel[39].addShapeBox(-20F, 0F, 7F, 25, 12, 17, 0F,1F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 7
		turretModel[39].setRotationPoint(11F, -30F, 0F);

		turretModel[40].addShapeBox(-20F, 0F, 7F, 25, 12, 17, 0F,1F, 1F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 2F, 1F, 1F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 11
		turretModel[40].setRotationPoint(11F, -30F, -31F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 12
		turretModel[41].setRotationPoint(-38F, -33F, -25F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 21
		turretModel[42].setRotationPoint(-35.5F, -33F, -25F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 22
		turretModel[43].setRotationPoint(-33F, -33F, -25F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 23
		turretModel[44].setRotationPoint(-30.5F, -33F, -25F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 24
		turretModel[45].setRotationPoint(-20.5F, -33F, -25F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 25
		turretModel[46].setRotationPoint(-28F, -33F, -25F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 26
		turretModel[47].setRotationPoint(-25.5F, -33F, -25F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 27
		turretModel[48].setRotationPoint(-23F, -33F, -25F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[49].setRotationPoint(-20.5F, -33F, 23F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[50].setRotationPoint(-23F, -33F, 23F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[51].setRotationPoint(-25.5F, -33F, 23F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[52].setRotationPoint(-28F, -33F, 23F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[53].setRotationPoint(-30.5F, -33F, 23F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[54].setRotationPoint(-33F, -33F, 23F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[55].setRotationPoint(-35.5F, -33F, 23F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[56].setRotationPoint(-38F, -33F, 23F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[57].setRotationPoint(-48F, -26.7F, -29F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[58].setRotationPoint(-48F, -24F, -29F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[59].setRotationPoint(-47F, -21.5F, -29F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F); // Box 40
		turretModel[60].setRotationPoint(-47F, -29.5F, -17F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F); // Box 41
		turretModel[61].setRotationPoint(-47F, -29.5F, 16F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 42
		turretModel[62].setRotationPoint(-47F, -23.5F, 16F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 43
		turretModel[63].setRotationPoint(-47F, -23.5F, -17F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F); // Box 44
		turretModel[64].setRotationPoint(-47F, -29.5F, -0.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 45
		turretModel[65].setRotationPoint(-47F, -23.5F, -0.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 46
		turretModel[66].setRotationPoint(-48F, -26.5F, -0.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 47
		turretModel[67].setRotationPoint(-48F, -26.5F, -17F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 48
		turretModel[68].setRotationPoint(-48F, -26.5F, 16F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[69].setRotationPoint(-47F, -21.5F, -29F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[70].setRotationPoint(-47F, -26.7F, -29F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[71].setRotationPoint(-47F, -24F, -29F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 30, 18, 1, 0F,0.7F, 0F, -0.4F, -9.3F, 1F, -0.4F, -9.3F, 1F, -0.4F, 0.7F, 0F, -0.4F, -0.3F, -7F, -0.4F, -9.3F, -8F, -0.4F, -9.3F, -8F, -0.4F, -0.3F, -7F, -0.4F); // Box 58
		turretModel[72].setRotationPoint(-60.5F, -90.5F, 21F);

		turretModel[73].addShapeBox(-20F, 0F, 0F, 28, 12, 7, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		turretModel[73].setRotationPoint(8F, -30F, -31F);

		turretModel[74].addShapeBox(-3F, -2F, 0F, 2, 12, 8, 0F,0F, -3F, 0F, 8F, -4F, 0F, 8F, -4F, 0.2F, 0F, -1.5F, 0F, 0F, 2.5F, 1F, 8F, 1F, 1F, 8F, 3F, 0F, 0F, 3.5F, 0F); // Box 1
		turretModel[74].setRotationPoint(19F, -30F, -31F);

		turretModel[75].addShapeBox(21F, -2F, 0F, 11, 12, 8, 0F,0F, -5F, 0F, -2F, -7.5F, -4F, -1F, -8F, 0.5F, 0F, -5F, 0.2F, 0F, 2F, 1F, -2F, 0.8F, -2F, 1F, 1F, -0.5F, 0F, 4F, 0F); // Box 2
		turretModel[75].setRotationPoint(5F, -31F, -31F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 30, 11, 13, 0F,0F, -0.5F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -2.2F, 0F, -0.5F, -1.5F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F); // Box 4
		turretModel[76].setRotationPoint(-39F, -32F, 12.2F);

		turretModel[77].addShapeBox(-2.5F, -2F, 4F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[77].setRotationPoint(21F, -41F, 14F);

		turretModel[78].addShapeBox(-30F, 1F, -4F, 6, 3, 9, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 2.2F, 0.2F, 0F, 2.2F); // Box 20
		turretModel[78].setRotationPoint(47F, -40.5F, 14F);

		turretModel[79].addShapeBox(-30F, 1F, -6F, 6, 5, 13, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 21
		turretModel[79].setRotationPoint(47F, -37.5F, 14F);

		turretModel[80].addShapeBox(-31F, -4F, -4.5F, 8, 10, 1, 0F,-0.8F, -1F, 0.2F, 2.2F, -5F, 0.2F, 2.2F, -5F, 0.2F, -0.8F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 22
		turretModel[80].setRotationPoint(47F, -40.5F, 16F);

		turretModel[81].addShapeBox(-31F, -4F, -4.5F, 8, 10, 1, 0F,-0.8F, -1F, 0.2F, 2.2F, -5F, 0.2F, 2.2F, -5F, 0.2F, -0.8F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		turretModel[81].setRotationPoint(47F, -40.5F, 21F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[82].setRotationPoint(-46F, -29.2F, -29F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[83].setRotationPoint(-47F, -29.2F, -29F);

		turretModel[84].addShapeBox(-20F, 0F, 0F, 6, 12, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		turretModel[84].setRotationPoint(2F, -30F, -31F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[85].setRotationPoint(-31F, -29.2F, -29F);

		turretModel[86].addShapeBox(21F, -2F, 0F, 11, 9, 4, 0F,0F, -5.5F, 0F, -1F, -7.2F, 0F, -0.5F, -7.2F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0.8F, 2.2F, 0F, 1.5F, 2.2F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[86].setRotationPoint(5F, -34F, -9F);

		turretModel[87].addShapeBox(-20F, 0F, 0F, 28, 12, 7, 0F,0F, 1F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		turretModel[87].setRotationPoint(8F, -30F, 24F);

		turretModel[88].addShapeBox(-3F, -2F, 0F, 2, 12, 8, 0F,0F, -1.5F, 0F, 8F, -3F, 0.2F, 8F, -4F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 8F, 3F, 0F, 8F, 0.5F, 1F, 0F, 2F, 1F); // Box 13
		turretModel[88].setRotationPoint(19F, -30F, 23F);

		turretModel[89].addShapeBox(21F, -2F, 0F, 11, 12, 8, 0F,0F, -4F, 0.2F, -1F, -7.5F, 0.5F, -2F, -7.5F, -4F, 0F, -5F, 0F, 0F, 4F, 0F, 1F, 1F, -0.5F, -2F, 0.8F, -2F, 0F, 1.5F, 1F); // Box 14
		turretModel[89].setRotationPoint(5F, -31F, 23F);

		turretModel[90].addShapeBox(-20F, 0F, 0F, 6, 12, 7, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F); // Box 15
		turretModel[90].setRotationPoint(2F, -30F, 24F);

		turretModel[91].addShapeBox(21F, -2F, 0F, 11, 12, 30, 0F,0F, -5F, -7F, 1.5F, -8.2F, -7F, -1F, -7.5F, -7.5F, 0F, -5F, -7.2F, 0F, 4F, -7F, 3.5F, 1.5F, -7F, 1F, 1F, -6.5F, 0F, 3F, -5.2F); // Box 16
		turretModel[91].setRotationPoint(5F, -31F, 0F);

		turretModel[92].addShapeBox(21F, -2F, 0F, 11, 9, 4, 0F,0.1F, -5.4F, 0F, -0.5F, -7.2F, 0F, -2F, -8.2F, 0F, 0.1F, -5.4F, 0F, 0F, 0F, 0F, 1.5F, 2.2F, 0F, 0.85F, 2.15F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[92].setRotationPoint(5F, -34F, 7F);

		turretModel[93].addShapeBox(21F, -2F, 0F, 10, 2, 12, 0F,0F, 0F, 0F, -1F, -2.8F, 0F, 0F, -5.1F, -0.5F, 0F, -1.5F, -0.2F, 0F, 0F, 0F, 1.85F, 3.6F, 0F, 0F, 3.2F, -0.5F, 0F, 0F, -0.2F); // Box 18
		turretModel[93].setRotationPoint(5F, -28.6F, 11F);

		turretModel[94].addShapeBox(0F, 0F, 0F, 3, 27, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[94].setRotationPoint(-24F, -57F, -21.2F);

		turretModel[95].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 35
		turretModel[95].setRotationPoint(-24F, -63F, -21.2F);

		turretModel[96].addShapeBox(-7.5F, -10.2F, -1F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[96].setRotationPoint(-2F, -25F, 0.5F);

		turretModel[97].addShapeBox(-7.5F, -10.2F, -1F, 8, 4, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[97].setRotationPoint(-4F, -28F, -2F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		turretModel[98].setRotationPoint(-4F, -39F, -2.5F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 39
		turretModel[99].setRotationPoint(-4F, -39F, 3.5F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		turretModel[100].setRotationPoint(-4F, -39F, 1.5F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 41
		turretModel[101].setRotationPoint(-4F, -39F, -0.5F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		turretModel[102].setRotationPoint(-7.5F, -40F, -5F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
		turretModel[103].setRotationPoint(-10F, -40F, -5F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		turretModel[104].setRotationPoint(-7.5F, -40F, 5F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		turretModel[105].setRotationPoint(-10F, -40F, 5F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 46
		turretModel[106].setRotationPoint(-47F, -21.5F, 28F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[107].setRotationPoint(-47F, -26.7F, 28F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[108].setRotationPoint(-47F, -24F, 28F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[109].setRotationPoint(-46F, -29.2F, 28F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[110].setRotationPoint(-31F, -29.2F, 28F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import BL.MiddleyPart
		barrelModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import BL.End
		barrelModel[2] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 123
		barrelModel[3] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 129
		barrelModel[4] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 130
		barrelModel[5] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 393
		barrelModel[6] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 394
		barrelModel[7] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 395
		barrelModel[8] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 396
		barrelModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 397
		barrelModel[10] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 398
		barrelModel[11] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 3
		barrelModel[12] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 9
		barrelModel[13] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 10
		barrelModel[14] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 288
		barrelModel[15] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 289
		barrelModel[16] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 290
		barrelModel[17] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 291
		barrelModel[18] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 292
		barrelModel[19] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 293
		barrelModel[20] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 294
		barrelModel[21] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 299
		barrelModel[22] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 11

		barrelModel[0].addShapeBox(5F, -2F, 1F, 66, 1, 4, 0F,0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Import BL.MiddleyPart
		barrelModel[0].setRotationPoint(30F, -21F, -2F);

		barrelModel[1].addShapeBox(81F, -1.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import BL.End
		barrelModel[1].setRotationPoint(30F, -21F, -2F);

		barrelModel[2].addShapeBox(20F, -3F, 0.5F, 12, 3, 5, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 123
		barrelModel[2].setRotationPoint(30F, -21F, -2F);

		barrelModel[3].addShapeBox(-4.6F, -1F, 0.75F, 12, 3, 5, 0F,6F, 0.5F, 2.7F, -0.5F, 2F, 2.7F, -0.5F, 2F, 4.2F, 6F, 0.5F, 4.7F, 10F, 0.5F, 2.7F, 0F, -1.5F, 2.7F, 0F, -1.5F, 4.2F, 10F, 0.5F, 4.7F); // Box 129
		barrelModel[3].setRotationPoint(30F, -23F, -3F);

		barrelModel[4].addShapeBox(-4.6F, -9F, 0.75F, 12, 8, 5, 0F,1F, -1.5F, 2.7F, -1F, -3F, 2.7F, -1F, -3F, 4.2F, 1F, -1.5F, 4.2F, 2F, 1.5F, 2.7F, -0.5F, -2F, 2.7F, -0.5F, -2F, 4.2F, 2F, 0.5F, 4.7F); // Box 130
		barrelModel[4].setRotationPoint(30F, -23F, -3F);

		barrelModel[5].addShapeBox(5F, -1F, 1F, 66, 2, 4, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 393
		barrelModel[5].setRotationPoint(30F, -21F, -2F);

		barrelModel[6].addShapeBox(5F, 1F, 1F, 66, 1, 4, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, -1F); // Box 394
		barrelModel[6].setRotationPoint(30F, -21F, -2F);

		barrelModel[7].addShapeBox(81F, -0.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		barrelModel[7].setRotationPoint(30F, -21F, -2F);

		barrelModel[8].addShapeBox(81F, 0.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 396
		barrelModel[8].setRotationPoint(30F, -21F, -2F);

		barrelModel[9].addShapeBox(81F, -0.5F, 0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		barrelModel[9].setRotationPoint(30F, -21F, -2F);

		barrelModel[10].addShapeBox(20F, 1F, 0.5F, 12, 1, 5, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 398
		barrelModel[10].setRotationPoint(30F, -21F, -2F);

		barrelModel[11].addShapeBox(-4.6F, 2.5F, 0.75F, 12, 2, 5, 0F,6F, 0.5F, 2.7F, 0F, 2F, 2.7F, 0F, 2F, 4.2F, 6F, 0.5F, 4.7F, 10F, 1.5F, 2.7F, -3F, 0.5F, 2.7F, -3F, 0.5F, 4.2F, 10F, 1.5F, 4.7F); // Box 3
		barrelModel[11].setRotationPoint(30F, -23F, -3F);

		barrelModel[12].addShapeBox(3.4F, -9F, 5F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		barrelModel[12].setRotationPoint(30F, -22F, -3F);

		barrelModel[13].addShapeBox(-3.6F, -5.5F, 7.75F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		barrelModel[13].setRotationPoint(30F, -22F, -3F);

		barrelModel[14].addShapeBox(-4.5F, -2.5F, -0.5F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		barrelModel[14].setRotationPoint(21F, -41F, 14F);

		barrelModel[15].addShapeBox(-8.5F, -2.5F, -0.5F, 4, 2, 2, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 289
		barrelModel[15].setRotationPoint(21F, -41F, 14F);

		barrelModel[16].addShapeBox(-10.5F, -3F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		barrelModel[16].setRotationPoint(21F, -41F, 14F);

		barrelModel[17].addShapeBox(-10.5F, -3F, 1.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		barrelModel[17].setRotationPoint(21F, -41F, 14F);

		barrelModel[18].addShapeBox(4.5F, -2F, 0F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 292
		barrelModel[18].setRotationPoint(21F, -41F, 14F);

		barrelModel[19].addShapeBox(9.5F, -2F, 0F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		barrelModel[19].setRotationPoint(21F, -41F, 14F);

		barrelModel[20].addShapeBox(-1.5F, -2.3F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		barrelModel[20].setRotationPoint(21F, -41F, 14F);

		barrelModel[21].addShapeBox(7.5F, -1.3F, -1F, 1, 1, 2, 0F,0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[21].setRotationPoint(21F, -41F, 14F);

		barrelModel[22].addShapeBox(6.4F, -6F, -2F, 4, 9, 12, 0F,0F, 0F, 0F, -1.6F, -4F, 0F, -1.6F, -4F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 2F, 0F); // Box 11
		barrelModel[22].setRotationPoint(30F, -23F, -3F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 191
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 192
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 193
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 194
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 195
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 196
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 197
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 198
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 199
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 200
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 201
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 202
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 203
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 204
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 205
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 206
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 207
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 208
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 209
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 210
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 211
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 212
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 213
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 214
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 215
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 216
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 217
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 218
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 219
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 220
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 221
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 222
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 223
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 224
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 225
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 226
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 227
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 228
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 229
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 230
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 231
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 232
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 233
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 234
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 235
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 236
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 237
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 238
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 24
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Box 25
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Box 26
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 27
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 28
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 29

		leftTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 191
		leftTrackWheelModels[0].setRotationPoint(39F, 4.5F, -26F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 192
		leftTrackWheelModels[1].setRotationPoint(39F, 4.5F, -26F);

		leftTrackWheelModels[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 193
		leftTrackWheelModels[2].setRotationPoint(39F, 4.5F, -26F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 194
		leftTrackWheelModels[3].setRotationPoint(39F, 4.5F, -21.5F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 195
		leftTrackWheelModels[4].setRotationPoint(39F, 4.5F, -21.5F);

		leftTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 196
		leftTrackWheelModels[5].setRotationPoint(39F, 4.5F, -21.5F);

		leftTrackWheelModels[6].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 197
		leftTrackWheelModels[6].setRotationPoint(27F, 4.5F, -26F);

		leftTrackWheelModels[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 198
		leftTrackWheelModels[7].setRotationPoint(27F, 4.5F, -26F);

		leftTrackWheelModels[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 199
		leftTrackWheelModels[8].setRotationPoint(27F, 4.5F, -26F);

		leftTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 200
		leftTrackWheelModels[9].setRotationPoint(27F, 4.5F, -21.5F);

		leftTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 201
		leftTrackWheelModels[10].setRotationPoint(27F, 4.5F, -21.5F);

		leftTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 202
		leftTrackWheelModels[11].setRotationPoint(27F, 4.5F, -21.5F);

		leftTrackWheelModels[12].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 203
		leftTrackWheelModels[12].setRotationPoint(15F, 4.5F, -26F);

		leftTrackWheelModels[13].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 204
		leftTrackWheelModels[13].setRotationPoint(15F, 4.5F, -26F);

		leftTrackWheelModels[14].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 205
		leftTrackWheelModels[14].setRotationPoint(15F, 4.5F, -26F);

		leftTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 206
		leftTrackWheelModels[15].setRotationPoint(15F, 4.5F, -21.5F);

		leftTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 207
		leftTrackWheelModels[16].setRotationPoint(15F, 4.5F, -21.5F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 208
		leftTrackWheelModels[17].setRotationPoint(15F, 4.5F, -21.5F);

		leftTrackWheelModels[18].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 209
		leftTrackWheelModels[18].setRotationPoint(-10F, 4.5F, -26F);

		leftTrackWheelModels[19].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 210
		leftTrackWheelModels[19].setRotationPoint(-10F, 4.5F, -26F);

		leftTrackWheelModels[20].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 211
		leftTrackWheelModels[20].setRotationPoint(-10F, 4.5F, -26F);

		leftTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 212
		leftTrackWheelModels[21].setRotationPoint(-10F, 4.5F, -21.5F);

		leftTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 213
		leftTrackWheelModels[22].setRotationPoint(-10F, 4.5F, -21.5F);

		leftTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 214
		leftTrackWheelModels[23].setRotationPoint(-10F, 4.5F, -21.5F);

		leftTrackWheelModels[24].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 215
		leftTrackWheelModels[24].setRotationPoint(-22F, 4.5F, -26F);

		leftTrackWheelModels[25].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 216
		leftTrackWheelModels[25].setRotationPoint(-22F, 4.5F, -26F);

		leftTrackWheelModels[26].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 217
		leftTrackWheelModels[26].setRotationPoint(-22F, 4.5F, -26F);

		leftTrackWheelModels[27].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 218
		leftTrackWheelModels[27].setRotationPoint(-22F, 4.5F, -21.5F);

		leftTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 219
		leftTrackWheelModels[28].setRotationPoint(-22F, 4.5F, -21.5F);

		leftTrackWheelModels[29].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 220
		leftTrackWheelModels[29].setRotationPoint(-22F, 4.5F, -21.5F);

		leftTrackWheelModels[30].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 221
		leftTrackWheelModels[30].setRotationPoint(-35F, 4.5F, -26F);

		leftTrackWheelModels[31].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 222
		leftTrackWheelModels[31].setRotationPoint(-35F, 4.5F, -26F);

		leftTrackWheelModels[32].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 223
		leftTrackWheelModels[32].setRotationPoint(-35F, 4.5F, -26F);

		leftTrackWheelModels[33].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 224
		leftTrackWheelModels[33].setRotationPoint(-35F, 4.5F, -21.5F);

		leftTrackWheelModels[34].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 225
		leftTrackWheelModels[34].setRotationPoint(-35F, 4.5F, -21.5F);

		leftTrackWheelModels[35].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 226
		leftTrackWheelModels[35].setRotationPoint(-35F, 4.5F, -21.5F);

		leftTrackWheelModels[36].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 227
		leftTrackWheelModels[36].setRotationPoint(52F, -1.5F, -26F);

		leftTrackWheelModels[37].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 228
		leftTrackWheelModels[37].setRotationPoint(52F, -1.5F, -26F);

		leftTrackWheelModels[38].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 229
		leftTrackWheelModels[38].setRotationPoint(52F, -1.5F, -21.5F);

		leftTrackWheelModels[39].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 230
		leftTrackWheelModels[39].setRotationPoint(52F, -1.5F, -21.5F);

		leftTrackWheelModels[40].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 231
		leftTrackWheelModels[40].setRotationPoint(52F, -1.5F, -21.5F);

		leftTrackWheelModels[41].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 232
		leftTrackWheelModels[41].setRotationPoint(52F, -1.5F, -26F);

		leftTrackWheelModels[42].addShapeBox(-4.5F, -1.75F, 0F, 9, 4, 3, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 233
		leftTrackWheelModels[42].setRotationPoint(-46F, -2.5F, -26.5F);

		leftTrackWheelModels[43].addShapeBox(-4.5F, -4.75F, 0F, 9, 3, 3, 0F,-3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 234
		leftTrackWheelModels[43].setRotationPoint(-46F, -2.5F, -26.5F);

		leftTrackWheelModels[44].addShapeBox(-4.5F, 2.25F, 0F, 9, 3, 3, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F); // Box 235
		leftTrackWheelModels[44].setRotationPoint(-46F, -2.5F, -26.5F);

		leftTrackWheelModels[45].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 9, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 236
		leftTrackWheelModels[45].setRotationPoint(-46F, -2.5F, -24F);

		leftTrackWheelModels[46].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 237
		leftTrackWheelModels[46].setRotationPoint(-46F, -2.5F, -24F);

		leftTrackWheelModels[47].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 238
		leftTrackWheelModels[47].setRotationPoint(-46F, -2.5F, -24F);

		leftTrackWheelModels[48].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 24
		leftTrackWheelModels[48].setRotationPoint(2F, 4.5F, -21.5F);

		leftTrackWheelModels[49].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 25
		leftTrackWheelModels[49].setRotationPoint(2F, 4.5F, -26F);

		leftTrackWheelModels[50].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 26
		leftTrackWheelModels[50].setRotationPoint(2F, 4.5F, -21.5F);

		leftTrackWheelModels[51].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 27
		leftTrackWheelModels[51].setRotationPoint(2F, 4.5F, -26F);

		leftTrackWheelModels[52].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 28
		leftTrackWheelModels[52].setRotationPoint(2F, 4.5F, -21.5F);

		leftTrackWheelModels[53].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 29
		leftTrackWheelModels[53].setRotationPoint(2F, 4.5F, -26F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 123
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 124
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 125
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 129
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 130
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 131
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 132
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 133
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 134
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 135
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 136
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 137
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 138
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 139
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 140
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 141
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 142
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 143
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 144
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 145
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 146
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 147
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 148
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 149
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 150
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 151
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 152
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 153
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 154
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 155
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 156
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 157
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 158
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 159
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 160
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 161
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 162
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 163
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 164
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 165
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 166
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 167
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 168
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 169
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 170
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 171
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 172
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 173
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 15
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 16
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 17
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 18
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Box 19
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 20

		rightTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 123
		rightTrackWheelModels[0].setRotationPoint(39F, 4.5F, 23F);

		rightTrackWheelModels[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 124
		rightTrackWheelModels[1].setRotationPoint(39F, 4.5F, 23F);

		rightTrackWheelModels[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 125
		rightTrackWheelModels[2].setRotationPoint(39F, 4.5F, 23F);

		rightTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 129
		rightTrackWheelModels[3].setRotationPoint(39F, 4.5F, 18.5F);

		rightTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 130
		rightTrackWheelModels[4].setRotationPoint(39F, 4.5F, 18.5F);

		rightTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 131
		rightTrackWheelModels[5].setRotationPoint(39F, 4.5F, 18.5F);

		rightTrackWheelModels[6].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 132
		rightTrackWheelModels[6].setRotationPoint(27F, 4.5F, 23F);

		rightTrackWheelModels[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 133
		rightTrackWheelModels[7].setRotationPoint(27F, 4.5F, 23F);

		rightTrackWheelModels[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 134
		rightTrackWheelModels[8].setRotationPoint(27F, 4.5F, 23F);

		rightTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 135
		rightTrackWheelModels[9].setRotationPoint(27F, 4.5F, 18.5F);

		rightTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 136
		rightTrackWheelModels[10].setRotationPoint(27F, 4.5F, 18.5F);

		rightTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 137
		rightTrackWheelModels[11].setRotationPoint(27F, 4.5F, 18.5F);

		rightTrackWheelModels[12].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 138
		rightTrackWheelModels[12].setRotationPoint(15F, 4.5F, 23F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 139
		rightTrackWheelModels[13].setRotationPoint(15F, 4.5F, 23F);

		rightTrackWheelModels[14].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 140
		rightTrackWheelModels[14].setRotationPoint(15F, 4.5F, 23F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 141
		rightTrackWheelModels[15].setRotationPoint(15F, 4.5F, 18.5F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 142
		rightTrackWheelModels[16].setRotationPoint(15F, 4.5F, 18.5F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 143
		rightTrackWheelModels[17].setRotationPoint(15F, 4.5F, 18.5F);

		rightTrackWheelModels[18].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 144
		rightTrackWheelModels[18].setRotationPoint(-10F, 4.5F, 23F);

		rightTrackWheelModels[19].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 145
		rightTrackWheelModels[19].setRotationPoint(-10F, 4.5F, 23F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 146
		rightTrackWheelModels[20].setRotationPoint(-10F, 4.5F, 23F);

		rightTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 147
		rightTrackWheelModels[21].setRotationPoint(-10F, 4.5F, 18.5F);

		rightTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 148
		rightTrackWheelModels[22].setRotationPoint(-10F, 4.5F, 18.5F);

		rightTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 149
		rightTrackWheelModels[23].setRotationPoint(-10F, 4.5F, 18.5F);

		rightTrackWheelModels[24].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 150
		rightTrackWheelModels[24].setRotationPoint(-22F, 4.5F, 23F);

		rightTrackWheelModels[25].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 151
		rightTrackWheelModels[25].setRotationPoint(-22F, 4.5F, 23F);

		rightTrackWheelModels[26].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 152
		rightTrackWheelModels[26].setRotationPoint(-22F, 4.5F, 23F);

		rightTrackWheelModels[27].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 153
		rightTrackWheelModels[27].setRotationPoint(-22F, 4.5F, 18.5F);

		rightTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 154
		rightTrackWheelModels[28].setRotationPoint(-22F, 4.5F, 18.5F);

		rightTrackWheelModels[29].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 155
		rightTrackWheelModels[29].setRotationPoint(-22F, 4.5F, 18.5F);

		rightTrackWheelModels[30].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 156
		rightTrackWheelModels[30].setRotationPoint(-35F, 4.5F, 23F);

		rightTrackWheelModels[31].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 157
		rightTrackWheelModels[31].setRotationPoint(-35F, 4.5F, 23F);

		rightTrackWheelModels[32].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 158
		rightTrackWheelModels[32].setRotationPoint(-35F, 4.5F, 23F);

		rightTrackWheelModels[33].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 159
		rightTrackWheelModels[33].setRotationPoint(-35F, 4.5F, 18.5F);

		rightTrackWheelModels[34].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 160
		rightTrackWheelModels[34].setRotationPoint(-35F, 4.5F, 18.5F);

		rightTrackWheelModels[35].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 161
		rightTrackWheelModels[35].setRotationPoint(-35F, 4.5F, 18.5F);

		rightTrackWheelModels[36].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 162
		rightTrackWheelModels[36].setRotationPoint(52F, -1.5F, 23F);

		rightTrackWheelModels[37].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 163
		rightTrackWheelModels[37].setRotationPoint(52F, -1.5F, 23F);

		rightTrackWheelModels[38].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 164
		rightTrackWheelModels[38].setRotationPoint(52F, -1.5F, 18.5F);

		rightTrackWheelModels[39].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 165
		rightTrackWheelModels[39].setRotationPoint(52F, -1.5F, 18.5F);

		rightTrackWheelModels[40].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 166
		rightTrackWheelModels[40].setRotationPoint(52F, -1.5F, 18.5F);

		rightTrackWheelModels[41].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 167
		rightTrackWheelModels[41].setRotationPoint(52F, -1.5F, 23F);

		rightTrackWheelModels[42].addShapeBox(-4.5F, -1.75F, 0F, 9, 4, 3, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 168
		rightTrackWheelModels[42].setRotationPoint(-46F, -2.5F, 23.5F);

		rightTrackWheelModels[43].addShapeBox(-4.5F, -4.75F, 0F, 9, 3, 3, 0F,-3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 169
		rightTrackWheelModels[43].setRotationPoint(-46F, -2.5F, 23.5F);

		rightTrackWheelModels[44].addShapeBox(-4.5F, 2.25F, 0F, 9, 3, 3, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F, -3F, 0.4F, 0.2F); // Box 170
		rightTrackWheelModels[44].setRotationPoint(-46F, -2.5F, 23.5F);

		rightTrackWheelModels[45].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 9, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 171
		rightTrackWheelModels[45].setRotationPoint(-46F, -2.5F, 15F);

		rightTrackWheelModels[46].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 172
		rightTrackWheelModels[46].setRotationPoint(-46F, -2.5F, 15F);

		rightTrackWheelModels[47].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 173
		rightTrackWheelModels[47].setRotationPoint(-46F, -2.5F, 15F);

		rightTrackWheelModels[48].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 15
		rightTrackWheelModels[48].setRotationPoint(2F, 4.5F, 18.5F);

		rightTrackWheelModels[49].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 16
		rightTrackWheelModels[49].setRotationPoint(2F, 4.5F, 18.5F);

		rightTrackWheelModels[50].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 17
		rightTrackWheelModels[50].setRotationPoint(2F, 4.5F, 23F);

		rightTrackWheelModels[51].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		rightTrackWheelModels[51].setRotationPoint(2F, 4.5F, 23F);

		rightTrackWheelModels[52].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 19
		rightTrackWheelModels[52].setRotationPoint(2F, 4.5F, 18.5F);

		rightTrackWheelModels[53].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 20
		rightTrackWheelModels[53].setRotationPoint(2F, 4.5F, 23F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 180
		leftTrackModel[1] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 181
		leftTrackModel[2] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 182
		leftTrackModel[3] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 183
		leftTrackModel[4] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 184
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 185
		leftTrackModel[6] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 186
		leftTrackModel[7] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 187
		leftTrackModel[8] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 1

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		leftTrackModel[0].setRotationPoint(56.5F, -5F, -29F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, -0.1F, -0.6F, 1.5F, -0.1F, -0.6F, 1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 181
		leftTrackModel[1].setRotationPoint(56.5F, 0F, -29F);
		leftTrackModel[1].rotateAngleZ = -0.78539816F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 75, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftTrackModel[2].setRotationPoint(-36.5F, 9F, -29F);

		leftTrackModel[3].addShapeBox(0F, -2F, 0F, 18, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[3].setRotationPoint(38.5F, 11F, -29F);
		leftTrackModel[3].rotateAngleZ = 0.38397244F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftTrackModel[4].setRotationPoint(-47.5F, 3F, -29F);
		leftTrackModel[4].rotateAngleZ = -0.47996554F;

		leftTrackModel[5].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 185
		leftTrackModel[5].setRotationPoint(-50.5F, -0.5F, -29F);
		leftTrackModel[5].rotateAngleZ = 0.73303829F;

		leftTrackModel[6].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftTrackModel[6].setRotationPoint(-50.2F, -4.5F, -29F);

		leftTrackModel[7].addShapeBox(0F, -8F, 0F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[7].setRotationPoint(-52.2F, -4.5F, -29F);
		leftTrackModel[7].rotateAngleZ = -0.78539816F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 1
		leftTrackModel[8].setRotationPoint(53.5F, -7F, -29F);
		leftTrackModel[8].rotateAngleZ = 0.78539816F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import RT.BackTrack
		rightTrackModel[1] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 174
		rightTrackModel[2] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 175
		rightTrackModel[3] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 176
		rightTrackModel[4] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 177
		rightTrackModel[5] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 178
		rightTrackModel[6] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 179
		rightTrackModel[7] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 180
		rightTrackModel[8] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 2

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import RT.BackTrack
		rightTrackModel[0].setRotationPoint(56.5F, -5F, 19F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, -0.1F, -0.6F, 1.5F, -0.1F, -0.6F, 1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		rightTrackModel[1].setRotationPoint(56.5F, 0F, 19F);
		rightTrackModel[1].rotateAngleZ = -0.78539816F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 75, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackModel[2].setRotationPoint(-36.5F, 9F, 19F);

		rightTrackModel[3].addShapeBox(0F, -2F, 0F, 18, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightTrackModel[3].setRotationPoint(38.5F, 11F, 19F);
		rightTrackModel[3].rotateAngleZ = 0.38397244F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightTrackModel[4].setRotationPoint(-47.5F, 3F, 19F);
		rightTrackModel[4].rotateAngleZ = -0.47996554F;

		rightTrackModel[5].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 178
		rightTrackModel[5].setRotationPoint(-50.5F, -0.5F, 19F);
		rightTrackModel[5].rotateAngleZ = 0.73303829F;

		rightTrackModel[6].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightTrackModel[6].setRotationPoint(-50.2F, -4.5F, 19F);

		rightTrackModel[7].addShapeBox(0F, -8F, 0F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rightTrackModel[7].setRotationPoint(-52.2F, -4.5F, 19F);
		rightTrackModel[7].rotateAngleZ = -0.78539816F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 2
		rightTrackModel[8].setRotationPoint(53.5F, -7F, 19F);
		rightTrackModel[8].rotateAngleZ = 0.78539816F;
	}
}