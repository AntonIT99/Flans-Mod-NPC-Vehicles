//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: K2
// Model Creator: 
// Created on: 18.12.2016 - 22:36:39
// Last changed on: 18.12.2016 - 22:36:39

package com.wolffsmod.model.monolith; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelK2overdrive extends ModelFlanVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelK2overdrive() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[102];
		turretModel = new ModelRendererTurbo[187];
		barrelModel = new ModelRendererTurbo[43];
		leftTrackWheelModels = new ModelRendererTurbo[48];
		rightTrackWheelModels = new ModelRendererTurbo[48];
		leftTrackModel = new ModelRendererTurbo[8];
		rightTrackModel = new ModelRendererTurbo[8];

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
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import CR.RightUpperSidePlate
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import CR.Core
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import CR.NoseAngle
		bodyModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import CR.BackCore
		bodyModel[5] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import CR.LowerCore
		bodyModel[6] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import CR.LowerBackCore
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 105
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 107
		bodyModel[9] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 126
		bodyModel[10] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 111
		bodyModel[11] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 112
		bodyModel[12] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 113
		bodyModel[13] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 114
		bodyModel[14] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 115
		bodyModel[15] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 116
		bodyModel[16] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 117
		bodyModel[17] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 119
		bodyModel[18] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 120
		bodyModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 121
		bodyModel[20] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 122
		bodyModel[21] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 181
		bodyModel[22] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 182
		bodyModel[23] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 183
		bodyModel[24] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 184
		bodyModel[25] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 185
		bodyModel[26] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 186
		bodyModel[27] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 187
		bodyModel[28] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 188
		bodyModel[29] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 189
		bodyModel[30] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 190
		bodyModel[31] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 191
		bodyModel[32] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 192
		bodyModel[33] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 193
		bodyModel[34] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 194
		bodyModel[35] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 195
		bodyModel[36] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 196
		bodyModel[37] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 197
		bodyModel[38] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 198
		bodyModel[39] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 156
		bodyModel[40] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 157
		bodyModel[41] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 158
		bodyModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 161
		bodyModel[43] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 163
		bodyModel[44] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 164
		bodyModel[45] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 165
		bodyModel[46] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 166
		bodyModel[47] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 168
		bodyModel[48] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 169
		bodyModel[49] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 170
		bodyModel[50] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 171
		bodyModel[51] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 172
		bodyModel[52] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 173
		bodyModel[53] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 174
		bodyModel[54] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 175
		bodyModel[55] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 176
		bodyModel[56] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 177
		bodyModel[57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 178
		bodyModel[58] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 179
		bodyModel[59] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 189
		bodyModel[61] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 239
		bodyModel[63] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 240
		bodyModel[64] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 241
		bodyModel[65] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 242
		bodyModel[66] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 243
		bodyModel[67] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 244
		bodyModel[68] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 245
		bodyModel[69] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 246
		bodyModel[70] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 247
		bodyModel[71] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 248
		bodyModel[72] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 249
		bodyModel[73] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 250
		bodyModel[74] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 251
		bodyModel[75] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 252
		bodyModel[76] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 253
		bodyModel[77] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 254
		bodyModel[78] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 255
		bodyModel[79] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 256
		bodyModel[80] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 257
		bodyModel[81] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 258
		bodyModel[82] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 259
		bodyModel[83] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 260
		bodyModel[84] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 261
		bodyModel[85] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 262
		bodyModel[86] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 263
		bodyModel[87] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 264
		bodyModel[88] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 265
		bodyModel[89] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 266
		bodyModel[90] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 267
		bodyModel[91] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 268
		bodyModel[92] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 269
		bodyModel[93] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 270
		bodyModel[94] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 271
		bodyModel[95] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 272
		bodyModel[96] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 273
		bodyModel[97] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 274
		bodyModel[98] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 275
		bodyModel[99] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 276
		bodyModel[100] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 277
		bodyModel[101] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Box 278

		bodyModel[0].addShapeBox(0F, 0F, 0F, 32, 5, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F); // Import CR.RightNoseBridgeAngle
		bodyModel[0].setRotationPoint(19F, -14.5F, 16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 99, 8, 1, 0F,-6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Import CR.RightUpperSidePlate
		bodyModel[1].setRotationPoint(-48F, -11F, 27F);

		bodyModel[2].addBox(0F, 0F, 0F, 40, 6, 11, 0F); // Import CR.Core
		bodyModel[2].setRotationPoint(-21F, -14.5F, 16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 12, 32, 0F,0F, -0.1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR.NoseAngle
		bodyModel[3].setRotationPoint(19F, -14.4F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 32, 3, 54, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Import CR.BackCore
		bodyModel[4].setRotationPoint(-60F, -17F, -27F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 82, 16, 32, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CR.LowerCore
		bodyModel[5].setRotationPoint(-36F, -11.5F, -16F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 18, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import CR.LowerBackCore
		bodyModel[6].setRotationPoint(-62F, -17.5F, -16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0.5F, 4F, 0F, 0.2F, 4F, 0F, 1F, -4F, 3F, 0F); // Box 105
		bodyModel[7].setRotationPoint(51F, -11.5F, 16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 5F, 2F, 0F); // Box 107
		bodyModel[8].setRotationPoint(51F, -11F, 27F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, -4F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.5F, -4F, 0F); // Box 126
		bodyModel[9].setRotationPoint(-55F, -11F, 27F);

		bodyModel[10].addBox(0F, 0F, 0F, 40, 13, 32, 0F); // Box 111
		bodyModel[10].setRotationPoint(-21F, -14.3F, -16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 32, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[11].setRotationPoint(54F, -11F, -16F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[12].setRotationPoint(54F, -8F, -16F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -12F, 0.5F, 0F, -12F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 114
		bodyModel[13].setRotationPoint(46F, -3F, -16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[14].setRotationPoint(54F, -11F, -15.9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, -0.5F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[15].setRotationPoint(54F, -11F, 7.9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 117
		bodyModel[16].setRotationPoint(54.2F, -10.2F, -13.4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 119
		bodyModel[17].setRotationPoint(54.2F, -10.2F, 8.6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F); // Box 120
		bodyModel[18].setRotationPoint(54.2F, -10.2F, -15.4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 121
		bodyModel[19].setRotationPoint(54.2F, -10.2F, 13.6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F); // Box 122
		bodyModel[20].setRotationPoint(54.2F, -10.2F, 11.6F);

		bodyModel[21].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[21].setRotationPoint(36.5F, 4.5F, 21.8F);
		bodyModel[21].rotateAngleZ = 0.78539816F;

		bodyModel[22].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[22].setRotationPoint(41.5F, -0.5F, 19.8F);
		bodyModel[22].rotateAngleZ = -0.62831853F;

		bodyModel[23].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[23].setRotationPoint(44.5F, 1.5F, 14.8F);

		bodyModel[24].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[24].setRotationPoint(29.5F, 1.5F, 14.8F);

		bodyModel[25].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[25].setRotationPoint(26.5F, -0.5F, 19.8F);
		bodyModel[25].rotateAngleZ = -0.62831853F;

		bodyModel[26].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[26].setRotationPoint(21.5F, 4.5F, 21.8F);
		bodyModel[26].rotateAngleZ = 0.78539816F;

		bodyModel[27].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[27].setRotationPoint(15.5F, 1.5F, 14.8F);

		bodyModel[28].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[28].setRotationPoint(12.5F, -0.5F, 19.8F);
		bodyModel[28].rotateAngleZ = -0.62831853F;

		bodyModel[29].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[29].setRotationPoint(7.5F, 4.5F, 21.8F);
		bodyModel[29].rotateAngleZ = 0.78539816F;

		bodyModel[30].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[30].setRotationPoint(1.5F, 1.5F, 14.8F);

		bodyModel[31].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[31].setRotationPoint(-1.5F, -0.5F, 19.8F);
		bodyModel[31].rotateAngleZ = -0.62831853F;

		bodyModel[32].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[32].setRotationPoint(-6.5F, 4.5F, 21.8F);
		bodyModel[32].rotateAngleZ = 0.78539816F;

		bodyModel[33].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[33].setRotationPoint(-13.5F, 1.5F, 14.8F);

		bodyModel[34].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[34].setRotationPoint(-16.5F, -0.5F, 19.8F);
		bodyModel[34].rotateAngleZ = -0.62831853F;

		bodyModel[35].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[35].setRotationPoint(-21.5F, 4.5F, 21.8F);
		bodyModel[35].rotateAngleZ = 0.78539816F;

		bodyModel[36].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[36].setRotationPoint(-28.5F, 1.5F, 14.8F);

		bodyModel[37].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[37].setRotationPoint(-31.5F, -0.5F, 19.8F);
		bodyModel[37].rotateAngleZ = -0.62831853F;

		bodyModel[38].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[38].setRotationPoint(-36.5F, 4.5F, 21.8F);
		bodyModel[38].rotateAngleZ = 0.78539816F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 39, 3, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[39].setRotationPoint(-60F, -14F, -27F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 157
		bodyModel[40].setRotationPoint(-52F, 0.5F, -16F);

		bodyModel[41].addShapeBox(0F, -1.5F, 0F, 4, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[41].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[41].rotateAngleZ = 0.55850536F;

		bodyModel[42].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[42].setRotationPoint(-62F, -11.5F, 14F);
		bodyModel[42].rotateAngleZ = 0.55850536F;

		bodyModel[43].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[43].setRotationPoint(-62F, -11.5F, 5F);
		bodyModel[43].rotateAngleZ = 0.55850536F;

		bodyModel[44].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[44].setRotationPoint(-62F, -11.5F, -5F);
		bodyModel[44].rotateAngleZ = 0.55850536F;

		bodyModel[45].addShapeBox(0F, -0.5F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[45].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[45].rotateAngleZ = 0.55850536F;

		bodyModel[46].addShapeBox(0F, -0.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 166
		bodyModel[46].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[46].rotateAngleZ = 0.55850536F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 168
		bodyModel[47].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[47].rotateAngleZ = 0.55850536F;

		bodyModel[48].addShapeBox(0F, 1F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 169
		bodyModel[48].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[48].rotateAngleZ = 0.55850536F;

		bodyModel[49].addShapeBox(0F, 2F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 170
		bodyModel[49].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[49].rotateAngleZ = 0.55850536F;

		bodyModel[50].addShapeBox(0F, 3F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 171
		bodyModel[50].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[50].rotateAngleZ = 0.55850536F;

		bodyModel[51].addShapeBox(0F, 4F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 172
		bodyModel[51].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[51].rotateAngleZ = 0.55850536F;

		bodyModel[52].addShapeBox(0F, 5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 173
		bodyModel[52].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[52].rotateAngleZ = 0.55850536F;

		bodyModel[53].addShapeBox(0F, 5.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 174
		bodyModel[53].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[53].rotateAngleZ = 0.55850536F;

		bodyModel[54].addShapeBox(0F, 4.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 175
		bodyModel[54].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[54].rotateAngleZ = 0.55850536F;

		bodyModel[55].addShapeBox(0F, 3.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 176
		bodyModel[55].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[55].rotateAngleZ = 0.55850536F;

		bodyModel[56].addShapeBox(0F, 2.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 177
		bodyModel[56].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[56].rotateAngleZ = 0.55850536F;

		bodyModel[57].addShapeBox(0F, 1.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 178
		bodyModel[57].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[57].rotateAngleZ = 0.55850536F;

		bodyModel[58].addShapeBox(0F, 0.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 179
		bodyModel[58].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[58].rotateAngleZ = 0.55850536F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 32, 5, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F); // Box 188
		bodyModel[59].setRotationPoint(19F, -14.5F, -27F);

		bodyModel[60].addBox(0F, 0F, 0F, 40, 6, 11, 0F); // Box 189
		bodyModel[60].setRotationPoint(-21F, -14.5F, -27F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 4F, 0F, 1F, 4F, 0F, 0.2F, -4F, 2F, 0.5F); // Box 190
		bodyModel[61].setRotationPoint(51F, -11.5F, -27F);

		bodyModel[62].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[62].setRotationPoint(36.5F, 4.5F, -22.8F);
		bodyModel[62].rotateAngleZ = 0.78539816F;

		bodyModel[63].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[63].setRotationPoint(41.5F, -0.5F, -21.8F);
		bodyModel[63].rotateAngleZ = -0.62831853F;

		bodyModel[64].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[64].setRotationPoint(44.5F, 1.5F, -20.8F);

		bodyModel[65].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[65].setRotationPoint(29.5F, 1.5F, -20.8F);

		bodyModel[66].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[66].setRotationPoint(26.5F, -0.5F, -21.8F);
		bodyModel[66].rotateAngleZ = -0.62831853F;

		bodyModel[67].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[67].setRotationPoint(21.5F, 4.5F, -22.8F);
		bodyModel[67].rotateAngleZ = 0.78539816F;

		bodyModel[68].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[68].setRotationPoint(15.5F, 1.5F, -20.8F);

		bodyModel[69].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[69].setRotationPoint(12.5F, -0.5F, -21.8F);
		bodyModel[69].rotateAngleZ = -0.62831853F;

		bodyModel[70].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[70].setRotationPoint(7.5F, 4.5F, -22.8F);
		bodyModel[70].rotateAngleZ = 0.78539816F;

		bodyModel[71].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[71].setRotationPoint(1.5F, 1.5F, -20.8F);

		bodyModel[72].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[72].setRotationPoint(-1.5F, -0.5F, -21.8F);
		bodyModel[72].rotateAngleZ = -0.62831853F;

		bodyModel[73].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[73].setRotationPoint(-6.5F, 4.5F, -22.8F);
		bodyModel[73].rotateAngleZ = 0.78539816F;

		bodyModel[74].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[74].setRotationPoint(-13.5F, 1.5F, -20.8F);

		bodyModel[75].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[75].setRotationPoint(-16.5F, -0.5F, -21.8F);
		bodyModel[75].rotateAngleZ = -0.62831853F;

		bodyModel[76].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[76].setRotationPoint(-21.5F, 4.5F, -22.8F);
		bodyModel[76].rotateAngleZ = 0.78539816F;

		bodyModel[77].addShapeBox(-1F, -1F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[77].setRotationPoint(-28.5F, 1.5F, -20.8F);

		bodyModel[78].addShapeBox(-1F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[78].setRotationPoint(-31.5F, -0.5F, -21.8F);
		bodyModel[78].rotateAngleZ = -0.62831853F;

		bodyModel[79].addShapeBox(0F, -1F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[79].setRotationPoint(-36.5F, 4.5F, -22.8F);
		bodyModel[79].rotateAngleZ = 0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 99, 8, 1, 0F,-6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 2F, 0F); // Box 257
		bodyModel[80].setRotationPoint(-48F, -11F, -28F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 5F, 2F, 0F); // Box 258
		bodyModel[81].setRotationPoint(51F, -11F, -28F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, -4F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.5F, -4F, 0F); // Box 259
		bodyModel[82].setRotationPoint(-55F, -11F, -28F);

		bodyModel[83].addShapeBox(0F, 6.5F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 260
		bodyModel[83].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[83].rotateAngleZ = 0.55850536F;

		bodyModel[84].addShapeBox(0F, 6F, 0F, 4, 1, 30, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 261
		bodyModel[84].setRotationPoint(-62F, -11.5F, -15F);
		bodyModel[84].rotateAngleZ = 0.55850536F;

		bodyModel[85].addShapeBox(-1F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[85].setRotationPoint(-52F, -6.5F, 16F);
		bodyModel[85].rotateAngleZ = -0.27925268F;

		bodyModel[86].addShapeBox(-1F, 7F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[86].setRotationPoint(-53.2F, -6.9F, 16F);
		bodyModel[86].rotateAngleZ = -0.08726646F;

		bodyModel[87].addShapeBox(-1F, -0.7F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[87].setRotationPoint(-49F, -10.5F, 16F);
		bodyModel[87].rotateAngleZ = -0.62831853F;

		bodyModel[88].addShapeBox(-1F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[88].setRotationPoint(-52F, -6.5F, -26F);
		bodyModel[88].rotateAngleZ = -0.27925268F;

		bodyModel[89].addShapeBox(-1F, 7F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[89].setRotationPoint(-53.2F, -6.9F, -26F);
		bodyModel[89].rotateAngleZ = -0.08726646F;

		bodyModel[90].addShapeBox(-1F, -0.7F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[90].setRotationPoint(-49F, -10.5F, -26F);
		bodyModel[90].rotateAngleZ = -0.62831853F;

		bodyModel[91].addShapeBox(0.5F, -4.8F, 0F, 3, 3, 3, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 268
		bodyModel[91].setRotationPoint(-62F, -11.3F, -1.5F);
		bodyModel[91].rotateAngleZ = 0.55850536F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 269
		bodyModel[92].setRotationPoint(-62.8F, -15.3F, 21.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F); // Box 270
		bodyModel[93].setRotationPoint(-61.8F, -16.8F, 21.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 271
		bodyModel[94].setRotationPoint(-62.8F, -15.3F, -24.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F); // Box 272
		bodyModel[95].setRotationPoint(-61.8F, -16.8F, -24.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 273
		bodyModel[96].setRotationPoint(-61.8F, -16F, 17F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 47, 0F,-0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 274
		bodyModel[97].setRotationPoint(-60.8F, -16.8F, -23.5F);

		bodyModel[98].addShapeBox(-1F, 0.3F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[98].setRotationPoint(-56F, -11.5F, 15.5F);
		bodyModel[98].rotateAngleZ = 0.36651914F;

		bodyModel[99].addShapeBox(-1F, 0.3F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[99].setRotationPoint(-56F, -11.5F, -27.5F);
		bodyModel[99].rotateAngleZ = 0.36651914F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 20, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[100].setRotationPoint(-56F, -17.8F, 1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 20, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[101].setRotationPoint(-56F, -17.8F, -14F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import TR.Center
		turretModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import TR.ConverttobasketArea
		turretModel[2] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import TR.BackCamera?Stand
		turretModel[3] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import TR.CommanderHatch
		turretModel[4] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 2
		turretModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		turretModel[6] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 133
		turretModel[7] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 134
		turretModel[8] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 135
		turretModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 136
		turretModel[10] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 137
		turretModel[11] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 138
		turretModel[12] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 140
		turretModel[13] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 143
		turretModel[14] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 144
		turretModel[15] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 145
		turretModel[16] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 146
		turretModel[17] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 149
		turretModel[18] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 150
		turretModel[19] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 151
		turretModel[20] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 152
		turretModel[21] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 153
		turretModel[22] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 154
		turretModel[23] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 155
		turretModel[24] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 156
		turretModel[25] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 157
		turretModel[26] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 158
		turretModel[27] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 159
		turretModel[28] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 160
		turretModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 165
		turretModel[30] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 166
		turretModel[31] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 279
		turretModel[32] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 281
		turretModel[33] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 282
		turretModel[34] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 284
		turretModel[35] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 285
		turretModel[36] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 286
		turretModel[37] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 287
		turretModel[38] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 288
		turretModel[39] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 289
		turretModel[40] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Box 290
		turretModel[41] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 291
		turretModel[42] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 292
		turretModel[43] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 294
		turretModel[44] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 295
		turretModel[45] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 296
		turretModel[46] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 297
		turretModel[47] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 298
		turretModel[48] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 299
		turretModel[49] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 300
		turretModel[50] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 301
		turretModel[51] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 302
		turretModel[52] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 303
		turretModel[53] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 287
		turretModel[54] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 290
		turretModel[55] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 292
		turretModel[56] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 293
		turretModel[57] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 294
		turretModel[58] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 295
		turretModel[59] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 296
		turretModel[60] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 297
		turretModel[61] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 298
		turretModel[62] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 299
		turretModel[63] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 300
		turretModel[64] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 301
		turretModel[65] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 302
		turretModel[66] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 303
		turretModel[67] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 304
		turretModel[68] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 305
		turretModel[69] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 306
		turretModel[70] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 307
		turretModel[71] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 308
		turretModel[72] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 309
		turretModel[73] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 310
		turretModel[74] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 311
		turretModel[75] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 312
		turretModel[76] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 313
		turretModel[77] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 314
		turretModel[78] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 315
		turretModel[79] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 316
		turretModel[80] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 317
		turretModel[81] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 318
		turretModel[82] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 319
		turretModel[83] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 320
		turretModel[84] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 321
		turretModel[85] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 322
		turretModel[86] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 323
		turretModel[87] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 324
		turretModel[88] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 325
		turretModel[89] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 326
		turretModel[90] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 327
		turretModel[91] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 328
		turretModel[92] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 329
		turretModel[93] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 330
		turretModel[94] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 331
		turretModel[95] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 332
		turretModel[96] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 333
		turretModel[97] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 334
		turretModel[98] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 336
		turretModel[99] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 337
		turretModel[100] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 338
		turretModel[101] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 339
		turretModel[102] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 340
		turretModel[103] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 341
		turretModel[104] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 342
		turretModel[105] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 343
		turretModel[106] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 344
		turretModel[107] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 345
		turretModel[108] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 346
		turretModel[109] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 347
		turretModel[110] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 348
		turretModel[111] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 349
		turretModel[112] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 350
		turretModel[113] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 351
		turretModel[114] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 377
		turretModel[115] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 378
		turretModel[116] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 379
		turretModel[117] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 380
		turretModel[118] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 381
		turretModel[119] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Box 382
		turretModel[120] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 383
		turretModel[121] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 384
		turretModel[122] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 385
		turretModel[123] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 386
		turretModel[124] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 387
		turretModel[125] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 388
		turretModel[126] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 389
		turretModel[127] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 390
		turretModel[128] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 399
		turretModel[129] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 403
		turretModel[130] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 406
		turretModel[131] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 407
		turretModel[132] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 408
		turretModel[133] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 409
		turretModel[134] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 410
		turretModel[135] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 411
		turretModel[136] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 412
		turretModel[137] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 413
		turretModel[138] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 414
		turretModel[139] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 415
		turretModel[140] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 416
		turretModel[141] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 417
		turretModel[142] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 418
		turretModel[143] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 419
		turretModel[144] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 420
		turretModel[145] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 421
		turretModel[146] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 422
		turretModel[147] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 423
		turretModel[148] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 424
		turretModel[149] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 425
		turretModel[150] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 426
		turretModel[151] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 427
		turretModel[152] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 428
		turretModel[153] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 429
		turretModel[154] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 430
		turretModel[155] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 431
		turretModel[156] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 432
		turretModel[157] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 433
		turretModel[158] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 434
		turretModel[159] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 435
		turretModel[160] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 436
		turretModel[161] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 437
		turretModel[162] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 438
		turretModel[163] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 439
		turretModel[164] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 440
		turretModel[165] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 441
		turretModel[166] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 442
		turretModel[167] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 443
		turretModel[168] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 444
		turretModel[169] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 445
		turretModel[170] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 446
		turretModel[171] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 447
		turretModel[172] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 448
		turretModel[173] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 449
		turretModel[174] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 450
		turretModel[175] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 451
		turretModel[176] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 452
		turretModel[177] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 453
		turretModel[178] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 454
		turretModel[179] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 455
		turretModel[180] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 456
		turretModel[181] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 457
		turretModel[182] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 458
		turretModel[183] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 459
		turretModel[184] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 460
		turretModel[185] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 461
		turretModel[186] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 462

		turretModel[0].addShapeBox(-3F, -2F, -2F, 16, 11, 27, 0F,0F, -1.5F, -9F, 8F, -5F, -9F, 8F, -5.5F, -6.2F, 0F, -1.5F, -6F, 0F, 4F, -9F, 8F, 4F, -9F, 8F, 2F, -6.2F, 0F, 2F, -6F); // Import TR.Center
		turretModel[0].setRotationPoint(-6F, -27F, 0F);

		turretModel[1].addShapeBox(-35F, 0F, 0F, 29, 6, 24, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.5F, 0F); // Import TR.ConverttobasketArea
		turretModel[1].setRotationPoint(-3F, -26.2F, -12F);

		turretModel[2].addShapeBox(10F, 2F, -16F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TR.BackCamera?Stand
		turretModel[2].setRotationPoint(0F, -34F, 1F);

		turretModel[3].addShapeBox(4F, 0F, -17F, 3, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Import TR.CommanderHatch
		turretModel[3].setRotationPoint(2F, -29F, 0F);

		turretModel[4].addShapeBox(-2F, 0F, -17F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 2
		turretModel[4].setRotationPoint(0F, -29F, 0F);

		turretModel[5].addBox(-5F, 0F, -10F, 0, 0, 0, 0F); // Box 3
		turretModel[5].setRotationPoint(0F, -29F, 0F);

		turretModel[6].addShapeBox(-3F, -2F, -15F, 22, 10, 30, 0F,0F, -1F, -10F, 14F, -2F, -10F, 14F, -2F, -8F, 0F, -1F, -8F, 0F, 0F, -10F, 14F, 0F, -10F, 14F, 0F, -8F, 0F, 0F, -8F); // Box 133
		turretModel[6].setRotationPoint(-6F, -27F, 0F);

		turretModel[7].addShapeBox(-3F, -2F, 2F, 16, 11, 27, 0F,0F, -1.5F, -6F, 8F, -5.5F, -6.2F, 8F, -5F, -7F, 0F, -1.5F, -7F, 0F, 2F, -6F, 8F, 2F, -6.2F, 8F, 4F, -7F, 0F, 4F, -7F); // Box 134
		turretModel[7].setRotationPoint(-6F, -27F, -27F);

		turretModel[8].addShapeBox(21F, -2F, -2F, 22, 11, 27, 0F,0F, -5F, -9F, -0.5F, -8.2F, -9F, -1F, -8.2F, -6.5F, 0F, -5.5F, -6.2F, 0F, 4F, -9F, -0.5F, 1.8F, -9F, -1F, 1.8F, -6.5F, 0F, 2F, -6.2F); // Box 135
		turretModel[8].setRotationPoint(-6F, -27F, 0F);

		turretModel[9].addShapeBox(21F, -2F, 2F, 22, 11, 27, 0F,0F, -5.5F, -6.2F, -1F, -8.2F, -6.5F, -0.5F, -8.2F, -7F, 0F, -5F, -7F, 0F, 2F, -6.2F, -1F, 1.8F, -6.5F, -0.5F, 1.8F, -7F, 0F, 4F, -7F); // Box 136
		turretModel[9].setRotationPoint(-6F, -27F, -27F);

		turretModel[10].addShapeBox(-3F, -2F, -15F, 22, 10, 18, 0F,0F, -1F, -9F, 23.5F, -3.5F, -9F, 23.5F, -3F, -8F, 0F, -1F, -8F, 0F, 0F, -8F, 23.5F, -1.8F, -8F, 23.5F, -1.8F, -8F, 0F, 0F, -8F); // Box 137
		turretModel[10].setRotationPoint(-6F, -27F, 0F);

		turretModel[11].addShapeBox(-3F, -2F, 17F, 22, 10, 18, 0F,0F, -1F, -8F, 23.5F, -3F, -8F, 23.5F, -3.5F, -9F, 0F, -1F, -9F, 0F, 0F, -8F, 23.5F, -1.8F, -8F, 23.5F, -1.8F, -8F, 0F, 0F, -8F); // Box 138
		turretModel[11].setRotationPoint(-6F, -27F, -18F);

		turretModel[12].addShapeBox(11F, 0F, 11F, 4, 3, 5, 0F,1F, 0.2F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0.2F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F); // Box 140
		turretModel[12].setRotationPoint(2F, -26.5F, 0.5F);

		turretModel[13].addShapeBox(-39F, -1F, 24.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		turretModel[13].setRotationPoint(1F, -27F, -13F);
		turretModel[13].rotateAngleZ = -0.03490659F;

		turretModel[14].addShapeBox(-39F, -1F, -1.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[14].setRotationPoint(1F, -27F, -15F);
		turretModel[14].rotateAngleZ = -0.03490659F;

		turretModel[15].addShapeBox(-39F, -1F, -2.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 145
		turretModel[15].setRotationPoint(1F, -30F, -12.5F);
		turretModel[15].rotateAngleZ = -0.03490659F;

		turretModel[16].addShapeBox(-39F, -1F, 25.5F, 2, 3, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 146
		turretModel[16].setRotationPoint(1F, -30F, -15.5F);
		turretModel[16].rotateAngleZ = -0.03490659F;

		turretModel[17].addShapeBox(-5F, -1F, -20F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 149
		turretModel[17].setRotationPoint(1F, -28.5F, 0F);

		turretModel[18].addShapeBox(-5F, -3F, -16.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 150
		turretModel[18].setRotationPoint(1F, -28.5F, 0F);
		turretModel[18].rotateAngleZ = 0.2268928F;

		turretModel[19].addShapeBox(-5F, -3F, -23.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 151
		turretModel[19].setRotationPoint(1F, -28.5F, 0F);
		turretModel[19].rotateAngleZ = 0.2268928F;

		turretModel[20].addShapeBox(-5F, -6F, -20F, 2, 2, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 152
		turretModel[20].setRotationPoint(1F, -28.5F, 0F);
		turretModel[20].rotateAngleZ = 0.2268928F;

		turretModel[21].addShapeBox(-5F, -12F, -20F, 2, 2, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 153
		turretModel[21].setRotationPoint(1F, -28.5F, 0F);
		turretModel[21].rotateAngleZ = 0.2268928F;

		turretModel[22].addShapeBox(4F, 1F, 12F, 3, 3, 5, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Box 154
		turretModel[22].setRotationPoint(1F, -28F, 0F);

		turretModel[23].addShapeBox(0F, 1F, 12F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 155
		turretModel[23].setRotationPoint(-1F, -28F, 0F);

		turretModel[24].addShapeBox(-3F, 2F, 7F, 2, 2, 15, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 156
		turretModel[24].setRotationPoint(-3F, -29.5F, 0F);

		turretModel[25].addShapeBox(-3F, 0F, 10.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 157
		turretModel[25].setRotationPoint(-3F, -29.5F, 0F);
		turretModel[25].rotateAngleZ = 0.2268928F;

		turretModel[26].addShapeBox(-3F, 0F, 3.5F, 2, 2, 15, 0F,-0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 2F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, -7F); // Box 158
		turretModel[26].setRotationPoint(-3F, -29.5F, 0F);
		turretModel[26].rotateAngleZ = 0.2268928F;

		turretModel[27].addShapeBox(-3F, -1F, 7F, 2, 1, 15, 0F,-0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F); // Box 159
		turretModel[27].setRotationPoint(-3F, -29.5F, 0F);
		turretModel[27].rotateAngleZ = 0.2268928F;

		turretModel[28].addShapeBox(-3F, -11F, 7F, 2, 1, 15, 0F,-0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 160
		turretModel[28].setRotationPoint(-3F, -29.5F, 0F);
		turretModel[28].rotateAngleZ = 0.2268928F;

		turretModel[29].addShapeBox(-30F, 0F, -3F, 8, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		turretModel[29].setRotationPoint(-5F, -33.5F, 2F);

		turretModel[30].addShapeBox(-30F, -10F, -3F, 3, 3, 2, 0F,0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 166
		turretModel[30].setRotationPoint(1F, -34.5F, 3F);
		turretModel[30].rotateAngleZ = 0.20943951F;

		turretModel[31].addShapeBox(-35F, 0F, -22F, 16, 1, 44, 0F,12F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 12F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 279
		turretModel[31].setRotationPoint(16F, -18.3F, 0F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 30, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		turretModel[32].setRotationPoint(-9F, -29.2F, -2F);
		turretModel[32].rotateAngleZ = -0.04363323F;

		turretModel[33].addShapeBox(0F, 0F, 0F, 39, 11, 4, 0F,0F, 0.4F, -0.2F, 0F, -5.5F, 0.2F, 0F, -5.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		turretModel[33].setRotationPoint(-9F, -27F, 19F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-0.2F, -0.5F, 0.4F, 0.5F, -1.2F, 0F, -1.9F, -1.4F, -0.9F, -0.2F, -0.5F, 0F, -0.2F, -0.1F, 0.4F, 0.5F, -0.2F, 0F, -1.7F, -0.5F, -0.5F, -0.2F, 0F, 0F); // Box 284
		turretModel[34].setRotationPoint(30F, -22F, 18F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-4.2F, -1F, 3F, 2F, -1.4F, -1.5F, 0.5F, -1.2F, 0F, -0.2F, -0.5F, 0.4F, -4.2F, -0.1F, 3F, 2F, -0.3F, -1.5F, 0.5F, -0.2F, 0F, -0.2F, -0.1F, 0.4F); // Box 285
		turretModel[35].setRotationPoint(30F, -22F, 13F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 0F, 0F, -2.7F, 0F, -2.4F, -3.7F, 0F, -0.7F, 2.5F, 0F, 0.2F, 0F, 0F, 0F, -2F, 0F, -2F, -3.5F, 0F, 0F, 2.8F, 0F, 1F); // Box 286
		turretModel[36].setRotationPoint(37.7F, -21F, 15F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 39, 11, 4, 0F,0F, 0.4F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.2F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F); // Box 287
		turretModel[37].setRotationPoint(-9F, -27F, -23F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-0.2F, -0.5F, 0F, -1.9F, -1.4F, -0.9F, 0.5F, -1.2F, 0F, -0.2F, -0.5F, 0.4F, -0.2F, 0F, 0F, -1.7F, -0.5F, -0.5F, 0.5F, -0.2F, 0F, -0.2F, -0.1F, 0.4F); // Box 288
		turretModel[38].setRotationPoint(30F, -22F, -23F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-0.2F, -0.5F, 0.4F, 0.5F, -1.2F, 0F, 2F, -1.4F, -1.5F, -4.2F, -1F, 3F, -0.2F, -0.1F, 0.4F, 0.5F, -0.2F, 0F, 2F, -0.3F, -1.5F, -4.2F, -0.1F, 3F); // Box 289
		turretModel[39].setRotationPoint(30F, -22F, -18F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,2.5F, 0F, 0.2F, -3.7F, 0F, -0.7F, -2.7F, 0F, -2.4F, 0F, 0F, 0F, 2.8F, 0F, 1F, -3.5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 290
		turretModel[40].setRotationPoint(37.7F, -21F, -20F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, -0.25F, 0.2F, 0F, -0.55F, 0.2F, -0.2F, 0F, 0F, -1F, 0F, 0F, 1F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, -0.2F, 0F, 0F, -1F); // Box 291
		turretModel[41].setRotationPoint(32F, -20.2F, 20.8F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, -0.25F, 0.2F, 0F, -0.55F, 0.2F, -0.2F, 0F, 0F, -1F, 0F, 0F, 1F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, -0.2F, 0F, 0F, -1F); // Box 292
		turretModel[42].setRotationPoint(32F, -19F, 21.1F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 4F, -0.25F, 0.2F, 0F, -0.9F, 0.2F, -0.45F, 0F, 0F, -4F, 0F, 0F, 4F, -0.2F, -0.2F, 0F, -0.9F, -0.2F, -0.45F, 0F, 0F, -4F); // Box 294
		turretModel[43].setRotationPoint(31F, -20.2F, 22.2F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 4F, -0.25F, 0.2F, 0F, -0.9F, 0.2F, -0.45F, 0F, 0F, -4F, 0F, 0F, 4F, -0.2F, -0.2F, 0F, -0.9F, -0.2F, -0.45F, 0F, 0F, -4F); // Box 295
		turretModel[44].setRotationPoint(31F, -19F, 22.5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, 0F, 0F, 0F); // Box 296
		turretModel[45].setRotationPoint(32.2F, -20.2F, 20.5F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, 0F, 0F, 0F); // Box 297
		turretModel[46].setRotationPoint(31.9F, -19F, 20.5F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, -0.55F, 0.2F, -0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 1F); // Box 298
		turretModel[47].setRotationPoint(32F, -20.2F, -21.8F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, -0.55F, 0.2F, -0.2F, -0.25F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 1F); // Box 299
		turretModel[48].setRotationPoint(32F, -19F, -22.1F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -4F, -0.9F, 0.2F, -0.45F, -0.25F, 0.2F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -0.9F, -0.2F, -0.45F, -0.2F, -0.2F, 0F, 0F, 0F, 4F); // Box 300
		turretModel[49].setRotationPoint(31F, -20.2F, -23.2F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -4F, -0.9F, 0.2F, -0.45F, -0.25F, 0.2F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -0.9F, -0.2F, -0.45F, -0.2F, -0.2F, 0F, 0F, 0F, 4F); // Box 301
		turretModel[50].setRotationPoint(31F, -19F, -23.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 302
		turretModel[51].setRotationPoint(32.2F, -20.2F, -23.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 303
		turretModel[52].setRotationPoint(31.9F, -19F, -23.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 287
		turretModel[53].setRotationPoint(-8F, -25F, -25.2F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 290
		turretModel[54].setRotationPoint(-46F, -25F, 23F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 27, 9, 11, 0F,0F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, 0F, 0.4F, -0.2F); // Box 292
		turretModel[55].setRotationPoint(-36F, -28F, 12.2F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 27, 9, 11, 0F,0F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, 0F, 0.4F, -0.2F); // Box 293
		turretModel[56].setRotationPoint(-36F, -28F, -23.2F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 294
		turretModel[57].setRotationPoint(-46F, -25F, -24F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 295
		turretModel[58].setRotationPoint(-46F, -21F, 23F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 296
		turretModel[59].setRotationPoint(-46F, -21F, -24F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 297
		turretModel[60].setRotationPoint(-23F, -25F, 23F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 48, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 298
		turretModel[61].setRotationPoint(-37F, -25F, -24F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 299
		turretModel[62].setRotationPoint(-41F, -25F, 23F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 300
		turretModel[63].setRotationPoint(-45F, -25F, 23F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 301
		turretModel[64].setRotationPoint(-41F, -25F, -24F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 302
		turretModel[65].setRotationPoint(-45F, -25F, -24F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 303
		turretModel[66].setRotationPoint(-41F, -19F, -24F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 304
		turretModel[67].setRotationPoint(-45F, -19F, -24F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 305
		turretModel[68].setRotationPoint(-46.2F, -21F, -10F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 306
		turretModel[69].setRotationPoint(-46.2F, -25F, -10F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 307
		turretModel[70].setRotationPoint(-46.2F, -25F, 17.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 308
		turretModel[71].setRotationPoint(-46.2F, -25F, 13.5F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 309
		turretModel[72].setRotationPoint(-46.2F, -25F, 5.5F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 310
		turretModel[73].setRotationPoint(-46.2F, -25F, 1.5F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 311
		turretModel[74].setRotationPoint(-46.2F, -25F, 9.5F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 312
		turretModel[75].setRotationPoint(-46.2F, -25F, -18.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 313
		turretModel[76].setRotationPoint(-46.2F, -25F, -14.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 314
		turretModel[77].setRotationPoint(-46.2F, -25F, -6.5F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 315
		turretModel[78].setRotationPoint(-46.2F, -25F, -2.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 316
		turretModel[79].setRotationPoint(-46.2F, -25F, -10.5F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 317
		turretModel[80].setRotationPoint(-46.2F, -19F, 17.5F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 318
		turretModel[81].setRotationPoint(-46.2F, -19F, 13.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 319
		turretModel[82].setRotationPoint(-46.2F, -19F, 9.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 320
		turretModel[83].setRotationPoint(-46.2F, -19F, 5.5F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 321
		turretModel[84].setRotationPoint(-46.2F, -19F, 1.5F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 322
		turretModel[85].setRotationPoint(-46.2F, -19F, -18.5F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 323
		turretModel[86].setRotationPoint(-46.2F, -19F, -14.5F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 324
		turretModel[87].setRotationPoint(-46.2F, -19F, -10.5F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 325
		turretModel[88].setRotationPoint(-46.2F, -19F, -6.5F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 326
		turretModel[89].setRotationPoint(-46.2F, -19F, -2.5F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 327
		turretModel[90].setRotationPoint(-42F, -27.8F, -22.75F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 328
		turretModel[91].setRotationPoint(-50F, -27.8F, -22.75F);

		turretModel[92].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		turretModel[92].setRotationPoint(-46F, -27.8F, -22.75F);

		turretModel[93].addShapeBox(4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		turretModel[93].setRotationPoint(-50F, -28.8F, -22.75F);
		turretModel[93].rotateAngleZ = 0.06981317F;

		turretModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 331
		turretModel[94].setRotationPoint(-50F, -28.8F, -22.75F);
		turretModel[94].rotateAngleZ = 0.06981317F;

		turretModel[95].addShapeBox(8F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 332
		turretModel[95].setRotationPoint(-50F, -28.8F, -22.75F);
		turretModel[95].rotateAngleZ = 0.06981317F;

		turretModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F); // Box 333
		turretModel[96].setRotationPoint(-51.2F, -25F, -15F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F); // Box 334
		turretModel[97].setRotationPoint(-51.2F, -21F, -15F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 336
		turretModel[98].setRotationPoint(-23F, -19F, -24F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 337
		turretModel[99].setRotationPoint(-51.2F, -25F, -19.5F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 338
		turretModel[100].setRotationPoint(-51.2F, -21F, -19.5F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 339
		turretModel[101].setRotationPoint(-51.2F, -25F, -19F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 340
		turretModel[102].setRotationPoint(-51.2F, -25F, -15.5F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 4.5F, -0.2F, 3.8F, -5.2F, -0.2F, 4F); // Box 341
		turretModel[103].setRotationPoint(-51.2F, -19F, -15F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -5.2F, -0.2F, 4F, 4.5F, -0.2F, 3.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 342
		turretModel[104].setRotationPoint(-51.2F, -19F, -19.5F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 343
		turretModel[105].setRotationPoint(-51.2F, -25F, -18.75F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 344
		turretModel[106].setRotationPoint(-51.2F, -21F, -18.75F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 345
		turretModel[107].setRotationPoint(-51.2F, -19F, -18.75F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 346
		turretModel[108].setRotationPoint(-48.7F, -25F, -12.8F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 347
		turretModel[109].setRotationPoint(-48.7F, -25F, -21.8F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 348
		turretModel[110].setRotationPoint(-45F, -19F, 23F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 349
		turretModel[111].setRotationPoint(-45F, -19F, -24F);

		turretModel[112].addShapeBox(-39F, -1F, -2.5F, 2, 24, 5, 0F,-1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F); // Box 350
		turretModel[112].setRotationPoint(1F, -55F, -12.5F);

		turretModel[113].addShapeBox(-39F, -1F, -2.5F, 2, 24, 5, 0F,-1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F, -0.8F, 0F, -2.3F); // Box 351
		turretModel[113].setRotationPoint(1F, -55F, 12.5F);

		turretModel[114].addShapeBox(11F, 0F, 11F, 7, 1, 10, 0F,0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		turretModel[114].setRotationPoint(1F, -27.5F, -2F);

		turretModel[115].addShapeBox(11F, 0F, 11F, 4, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 378
		turretModel[115].setRotationPoint(6F, -26.5F, -2F);

		turretModel[116].addShapeBox(11F, 0F, 11F, 4, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 379
		turretModel[116].setRotationPoint(6F, -26.5F, 7F);

		turretModel[117].addShapeBox(-3F, -8F, 7F, 2, 3, 15, 0F,-0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F, -0.5F, 2F, -3F); // Box 380
		turretModel[117].setRotationPoint(-3F, -29.5F, 0F);
		turretModel[117].rotateAngleZ = 0.2268928F;

		turretModel[118].addShapeBox(4F, 1F, 12F, 3, 3, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 381
		turretModel[118].setRotationPoint(-2F, -28F, 0F);

		turretModel[119].addShapeBox(4F, 0F, -17F, 5, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 382
		turretModel[119].setRotationPoint(-3F, -29F, 0F);

		turretModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 1F, 0F, -0.4F); // Box 383
		turretModel[120].setRotationPoint(8F, -36F, -18F);

		turretModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		turretModel[121].setRotationPoint(7F, -33F, -17.5F);

		turretModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		turretModel[122].setRotationPoint(6F, -37F, -18.5F);

		turretModel[123].addShapeBox(10F, 2F, -16F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 386
		turretModel[123].setRotationPoint(0F, -32F, 1F);

		turretModel[124].addShapeBox(10F, 2F, -16F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		turretModel[124].setRotationPoint(1F, -28F, 2F);

		turretModel[125].addShapeBox(-39F, -1F, 25.5F, 2, 9, 5, 0F,-0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 388
		turretModel[125].setRotationPoint(0F, -34F, -12.5F);
		turretModel[125].rotateAngleZ = -0.03490659F;

		turretModel[126].addShapeBox(-30F, 0F, -3F, 8, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 389
		turretModel[126].setRotationPoint(-5F, -30.5F, 2F);

		turretModel[127].addShapeBox(-30F, -10F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		turretModel[127].setRotationPoint(1F, -25F, 3.5F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 27, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 399
		turretModel[128].setRotationPoint(-9F, -25.2F, -5F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 403
		turretModel[129].setRotationPoint(-23F, -25F, -24F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 406
		turretModel[130].setRotationPoint(-5F, -25F, -25.2F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 407
		turretModel[131].setRotationPoint(-2F, -25F, -25.2F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 408
		turretModel[132].setRotationPoint(-2F, -22F, -25.2F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 409
		turretModel[133].setRotationPoint(-5F, -22F, -25.2F);

		turretModel[134].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 410
		turretModel[134].setRotationPoint(-8F, -22F, -25.2F);

		turretModel[135].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 411
		turretModel[135].setRotationPoint(-2F, -19F, -25.2F);

		turretModel[136].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 412
		turretModel[136].setRotationPoint(-5F, -19F, -25.2F);

		turretModel[137].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 413
		turretModel[137].setRotationPoint(-8F, -19F, -25.2F);

		turretModel[138].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 414
		turretModel[138].setRotationPoint(7.5F, -25F, -25.2F);

		turretModel[139].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 415
		turretModel[139].setRotationPoint(7.5F, -22F, -25.2F);

		turretModel[140].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 416
		turretModel[140].setRotationPoint(7.5F, -19F, -25.2F);

		turretModel[141].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 417
		turretModel[141].setRotationPoint(4.5F, -19F, -25.2F);

		turretModel[142].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 418
		turretModel[142].setRotationPoint(4.5F, -22F, -25.2F);

		turretModel[143].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 419
		turretModel[143].setRotationPoint(4.5F, -25F, -25.2F);

		turretModel[144].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 420
		turretModel[144].setRotationPoint(1.5F, -25F, -25.2F);

		turretModel[145].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 421
		turretModel[145].setRotationPoint(1.5F, -22F, -25.2F);

		turretModel[146].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 422
		turretModel[146].setRotationPoint(1.5F, -19F, -25.2F);

		turretModel[147].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 423
		turretModel[147].setRotationPoint(10.5F, -19F, -25.2F);

		turretModel[148].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 424
		turretModel[148].setRotationPoint(10.5F, -22F, -25.2F);

		turretModel[149].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 425
		turretModel[149].setRotationPoint(10.5F, -25F, -25.2F);

		turretModel[150].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 426
		turretModel[150].setRotationPoint(23F, -20F, -25.2F);

		turretModel[151].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 427
		turretModel[151].setRotationPoint(23F, -23F, -25.2F);

		turretModel[152].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 428
		turretModel[152].setRotationPoint(20F, -23F, -25.2F);

		turretModel[153].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 429
		turretModel[153].setRotationPoint(20F, -20F, -25.2F);

		turretModel[154].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 430
		turretModel[154].setRotationPoint(17F, -20F, -25.2F);

		turretModel[155].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 431
		turretModel[155].setRotationPoint(17F, -23F, -25.2F);

		turretModel[156].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 432
		turretModel[156].setRotationPoint(14F, -23F, -25.2F);

		turretModel[157].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 433
		turretModel[157].setRotationPoint(14F, -20F, -25.2F);

		turretModel[158].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 434
		turretModel[158].setRotationPoint(-8F, -25F, 23.2F);

		turretModel[159].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 435
		turretModel[159].setRotationPoint(-5F, -25F, 23.2F);

		turretModel[160].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 436
		turretModel[160].setRotationPoint(-2F, -25F, 23.2F);

		turretModel[161].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 437
		turretModel[161].setRotationPoint(-2F, -22F, 23.2F);

		turretModel[162].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 438
		turretModel[162].setRotationPoint(-5F, -22F, 23.2F);

		turretModel[163].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 439
		turretModel[163].setRotationPoint(-8F, -22F, 23.2F);

		turretModel[164].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 440
		turretModel[164].setRotationPoint(-2F, -19F, 23.2F);

		turretModel[165].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 441
		turretModel[165].setRotationPoint(-5F, -19F, 23.2F);

		turretModel[166].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 442
		turretModel[166].setRotationPoint(-8F, -19F, 23.2F);

		turretModel[167].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 443
		turretModel[167].setRotationPoint(7.5F, -25F, 23.2F);

		turretModel[168].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 444
		turretModel[168].setRotationPoint(7.5F, -22F, 23.2F);

		turretModel[169].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 445
		turretModel[169].setRotationPoint(7.5F, -19F, 23.2F);

		turretModel[170].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 446
		turretModel[170].setRotationPoint(4.5F, -19F, 23.2F);

		turretModel[171].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 447
		turretModel[171].setRotationPoint(4.5F, -22F, 23.2F);

		turretModel[172].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 448
		turretModel[172].setRotationPoint(4.5F, -25F, 23.2F);

		turretModel[173].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 449
		turretModel[173].setRotationPoint(1.5F, -25F, 23.2F);

		turretModel[174].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 450
		turretModel[174].setRotationPoint(1.5F, -22F, 23.2F);

		turretModel[175].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 451
		turretModel[175].setRotationPoint(1.5F, -19F, 23.2F);

		turretModel[176].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 452
		turretModel[176].setRotationPoint(10.5F, -19F, 23.2F);

		turretModel[177].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 453
		turretModel[177].setRotationPoint(10.5F, -22F, 23.2F);

		turretModel[178].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 454
		turretModel[178].setRotationPoint(10.5F, -25F, 23.2F);

		turretModel[179].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 455
		turretModel[179].setRotationPoint(23F, -20F, 23.2F);

		turretModel[180].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 456
		turretModel[180].setRotationPoint(23F, -23F, 23.2F);

		turretModel[181].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 457
		turretModel[181].setRotationPoint(20F, -23F, 23.2F);

		turretModel[182].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 458
		turretModel[182].setRotationPoint(20F, -20F, 23.2F);

		turretModel[183].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 459
		turretModel[183].setRotationPoint(17F, -20F, 23.2F);

		turretModel[184].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 460
		turretModel[184].setRotationPoint(17F, -23F, 23.2F);

		turretModel[185].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 461
		turretModel[185].setRotationPoint(14F, -23F, 23.2F);

		turretModel[186].addShapeBox(0F, 0F, 0F, 9, 9, 2, 0F,-0.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -6.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -6.1F, -6.1F, 0F, -0.1F, -6.1F, 0F); // Box 462
		turretModel[186].setRotationPoint(14F, -20F, 23.2F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import CR.Computerthingy?
		barrelModel[1] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import BL.GunHolder
		barrelModel[2] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import BL.BackFattyPart
		barrelModel[3] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import BL.MiddleyPart
		barrelModel[4] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import BL.End
		barrelModel[5] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 123
		barrelModel[6] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 129
		barrelModel[7] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 130
		barrelModel[8] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 132
		barrelModel[9] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 139
		barrelModel[10] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // MG 1
		barrelModel[11] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // MG 2
		barrelModel[12] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // MG 3
		barrelModel[13] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // MG 4
		barrelModel[14] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // MG 5
		barrelModel[15] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // MG 6
		barrelModel[16] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // MG 7
		barrelModel[17] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // MG 8
		barrelModel[18] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // MG 9
		barrelModel[19] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // MG 10
		barrelModel[20] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // MG 11
		barrelModel[21] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // MG 12
		barrelModel[22] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // B1
		barrelModel[23] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // B2
		barrelModel[24] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // G1
		barrelModel[25] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // G2
		barrelModel[26] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // G3
		barrelModel[27] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // G4
		barrelModel[28] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // G5
		barrelModel[29] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // G6
		barrelModel[30] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Ammo 1
		barrelModel[31] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Ammo 2
		barrelModel[32] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // B1 Inner
		barrelModel[33] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // B2 Inner
		barrelModel[34] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // MG 2 Inner
		barrelModel[35] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 391
		barrelModel[36] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 392
		barrelModel[37] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 393
		barrelModel[38] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 394
		barrelModel[39] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 395
		barrelModel[40] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 396
		barrelModel[41] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 397
		barrelModel[42] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 398

		barrelModel[0].addShapeBox(-0.5F, -10.5F, -2F, 7, 4, 10, 0F,1F, -0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1.5F, 1F, -0.2F, 1.5F, 1F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 1F, 2F, 1.5F); // Import CR.Computerthingy?
		barrelModel[0].setRotationPoint(30F, -22F, -3F);

		barrelModel[1].addBox(-15F, -3F, 0F, 22, 6, 6, 0F); // Import BL.GunHolder
		barrelModel[1].setRotationPoint(30F, -22F, -3F);

		barrelModel[2].addShapeBox(5F, -2.5F, 0.5F, 15, 5, 5, 0F,0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F); // Import BL.BackFattyPart
		barrelModel[2].setRotationPoint(30F, -22F, -3F);

		barrelModel[3].addShapeBox(25F, -2F, 1F, 46, 1, 4, 0F,0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Import BL.MiddleyPart
		barrelModel[3].setRotationPoint(30F, -22F, -3F);

		barrelModel[4].addShapeBox(81F, -1.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import BL.End
		barrelModel[4].setRotationPoint(30F, -22F, -3F);

		barrelModel[5].addShapeBox(20F, -3F, 0.5F, 12, 3, 5, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 123
		barrelModel[5].setRotationPoint(30F, -22F, -3F);

		barrelModel[6].addShapeBox(-3F, 0F, 0.5F, 12, 6, 5, 0F,6F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 4F, 6F, 0.5F, 4.5F, 10F, 0.5F, 2.5F, -3F, -0.5F, 2.5F, -2F, -0.5F, 4F, 10F, 0.5F, 4.5F); // Box 129
		barrelModel[6].setRotationPoint(30F, -22F, -3F);

		barrelModel[7].addShapeBox(-3F, -6F, 0.5F, 12, 5, 5, 0F,-2F, -0.5F, 2.5F, -2F, -0.5F, 2.5F, -2F, -0.5F, 4F, -2F, -0.5F, 4.5F, 6F, 1.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 4F, 6F, 0.5F, 4.5F); // Box 130
		barrelModel[7].setRotationPoint(30F, -22F, -3F);

		barrelModel[8].addShapeBox(-9.5F, -10.5F, -2F, 7, 4, 10, 0F,-1F, -1.5F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 1.5F, -1F, -1.5F, 1.5F, 0F, 3F, 0F, 1F, 2F, 0F, 1F, 2F, 1.5F, 0F, 3F, 1.5F); // Box 132
		barrelModel[8].setRotationPoint(30F, -22F, -3F);

		barrelModel[9].addShapeBox(7F, -4F, 7.5F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 139
		barrelModel[9].setRotationPoint(30F, -22F, -3F);

		barrelModel[10].addShapeBox(13.5F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG 1
		barrelModel[10].setRotationPoint(7F, -36F, -17F);

		barrelModel[11].addShapeBox(0.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2
		barrelModel[11].setRotationPoint(7F, -36F, -17F);

		barrelModel[12].addBox(-2.5F, -2.5F, -1F, 10, 3, 2, 0F); // MG 3
		barrelModel[12].setRotationPoint(7F, -36F, -17F);

		barrelModel[13].addBox(3F, -2F, 0.2F, 3, 2, 1, 0F); // MG 4
		barrelModel[13].setRotationPoint(7F, -36F, -17F);

		barrelModel[14].addBox(-1.5F, -1.5F, -1.1F, 6, 1, 1, 0F); // MG 5
		barrelModel[14].setRotationPoint(7F, -36F, -17F);

		barrelModel[15].addTrapezoid(-3.2F, -1.5F, -0.5F, 4, 1, 1, 0F, -0.20F, ModelRendererTurbo.MR_RIGHT); // MG 6
		barrelModel[15].setRotationPoint(7F, -36F, -17F);

		barrelModel[16].addShapeBox(3.5F, -2.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // MG 7
		barrelModel[16].setRotationPoint(7F, -36F, -17F);

		barrelModel[17].addShapeBox(3.5F, -2.5F, -3.3F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // MG 8
		barrelModel[17].setRotationPoint(7F, -36F, -17F);

		barrelModel[18].addShapeBox(6.4F, -3.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 9
		barrelModel[18].setRotationPoint(7F, -36F, -17F);

		barrelModel[19].addShapeBox(-1.6F, -3.5F, -0.5F, 2, 2, 1, 0F,-0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG 10
		barrelModel[19].setRotationPoint(7F, -36F, -17F);

		barrelModel[20].addBox(7.5F, -1.5F, -0.5F, 7, 1, 1, 0F); // MG 11
		barrelModel[20].setRotationPoint(7F, -36F, -17F);

		barrelModel[21].addBox(24.5F, -1.5F, -0.5F, 1, 1, 1, 0F); // MG 12
		barrelModel[21].setRotationPoint(7F, -36F, -17F);

		barrelModel[22].addShapeBox(13.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1
		barrelModel[22].setRotationPoint(7F, -36F, -17F);

		barrelModel[23].addShapeBox(12.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2
		barrelModel[23].setRotationPoint(7F, -36F, -17F);

		barrelModel[24].addShapeBox(-4F, -3F, 0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F); // G1
		barrelModel[24].setRotationPoint(7F, -36F, -17F);

		barrelModel[25].addShapeBox(-4F, -2F, 0.5F, 1, 2, 1, 0F,0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F); // G2
		barrelModel[25].setRotationPoint(7F, -36F, -17F);

		barrelModel[26].addShapeBox(-4F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F); // G3
		barrelModel[26].setRotationPoint(7F, -36F, -17F);

		barrelModel[27].addShapeBox(-4F, -3F, -1.5F, 2, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F); // G4
		barrelModel[27].setRotationPoint(7F, -36F, -17F);

		barrelModel[28].addShapeBox(-4F, -2F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F); // G5
		barrelModel[28].setRotationPoint(7F, -36F, -17F);

		barrelModel[29].addShapeBox(-4F, 0F, -1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4999F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4999F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F); // G6
		barrelModel[29].setRotationPoint(7F, -36F, -17F);

		barrelModel[30].addBox(3.5F, -0.5F, 1F, 2, 3, 6, 0F); // Ammo 1
		barrelModel[30].setRotationPoint(7F, -36F, -17F);

		barrelModel[31].addShapeBox(3.5F, -2F, 0.6F, 2, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Ammo 2
		barrelModel[31].setRotationPoint(7F, -36F, -17F);
		barrelModel[31].rotateAngleX = -0.54105207F;

		barrelModel[32].addShapeBox(13.5F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B1 Inner
		barrelModel[32].setRotationPoint(7F, -36F, -17F);

		barrelModel[33].addShapeBox(12.5F, 0.2F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // B2 Inner
		barrelModel[33].setRotationPoint(7F, -36F, -17F);

		barrelModel[34].addShapeBox(0.5F, -2.5F, -1.5F, 13, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.5F, -0.5F); // MG 2 Inner
		barrelModel[34].setRotationPoint(7F, -36F, -17F);

		barrelModel[35].addShapeBox(4.5F, -9.2F, 3F, 2, 3, 6, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		barrelModel[35].setRotationPoint(30F, -22F, -3F);

		barrelModel[36].addShapeBox(4.5F, -9.2F, 0F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 392
		barrelModel[36].setRotationPoint(30F, -22F, -3F);

		barrelModel[37].addShapeBox(25F, -1F, 1F, 46, 2, 4, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 393
		barrelModel[37].setRotationPoint(30F, -22F, -3F);

		barrelModel[38].addShapeBox(25F, 1F, 1F, 46, 1, 4, 0F,0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, -1F); // Box 394
		barrelModel[38].setRotationPoint(30F, -22F, -3F);

		barrelModel[39].addShapeBox(81F, -0.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		barrelModel[39].setRotationPoint(30F, -22F, -3F);

		barrelModel[40].addShapeBox(81F, 0.5F, 1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 396
		barrelModel[40].setRotationPoint(30F, -22F, -3F);

		barrelModel[41].addShapeBox(81F, -3F, 2.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		barrelModel[41].setRotationPoint(30F, -22F, -3F);

		barrelModel[42].addShapeBox(20F, 1F, 0.5F, 12, 1, 5, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 398
		barrelModel[42].setRotationPoint(30F, -22F, -3F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 191
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 192
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 193
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 194
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 195
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 196
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 197
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 198
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 199
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 200
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 201
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 849, 105, textureX, textureY); // Box 202
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 203
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 204
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 205
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 206
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 207
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 208
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 209
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 210
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 211
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 212
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 213
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 214
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 215
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 216
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 217
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 218
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 219
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 220
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 221
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 222
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 223
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 224
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 225
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 226
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 227
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 228
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 229
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 230
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 231
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 232
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 233
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 234
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 235
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 236
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 237
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 238

		leftTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 191
		leftTrackWheelModels[0].setRotationPoint(37F, 4.5F, -26F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 192
		leftTrackWheelModels[1].setRotationPoint(37F, 4.5F, -26F);

		leftTrackWheelModels[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 193
		leftTrackWheelModels[2].setRotationPoint(37F, 4.5F, -26F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 194
		leftTrackWheelModels[3].setRotationPoint(37F, 4.5F, -21.5F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 195
		leftTrackWheelModels[4].setRotationPoint(37F, 4.5F, -21.5F);

		leftTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 196
		leftTrackWheelModels[5].setRotationPoint(37F, 4.5F, -21.5F);

		leftTrackWheelModels[6].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 197
		leftTrackWheelModels[6].setRotationPoint(23F, 4.5F, -26F);

		leftTrackWheelModels[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 198
		leftTrackWheelModels[7].setRotationPoint(23F, 4.5F, -26F);

		leftTrackWheelModels[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 199
		leftTrackWheelModels[8].setRotationPoint(23F, 4.5F, -26F);

		leftTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 200
		leftTrackWheelModels[9].setRotationPoint(23F, 4.5F, -21.5F);

		leftTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 201
		leftTrackWheelModels[10].setRotationPoint(23F, 4.5F, -21.5F);

		leftTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 202
		leftTrackWheelModels[11].setRotationPoint(23F, 4.5F, -21.5F);

		leftTrackWheelModels[12].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 203
		leftTrackWheelModels[12].setRotationPoint(9F, 4.5F, -26F);

		leftTrackWheelModels[13].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 204
		leftTrackWheelModels[13].setRotationPoint(9F, 4.5F, -26F);

		leftTrackWheelModels[14].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 205
		leftTrackWheelModels[14].setRotationPoint(9F, 4.5F, -26F);

		leftTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 206
		leftTrackWheelModels[15].setRotationPoint(9F, 4.5F, -21.5F);

		leftTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 207
		leftTrackWheelModels[16].setRotationPoint(9F, 4.5F, -21.5F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 208
		leftTrackWheelModels[17].setRotationPoint(9F, 4.5F, -21.5F);

		leftTrackWheelModels[18].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 209
		leftTrackWheelModels[18].setRotationPoint(-6F, 4.5F, -26F);

		leftTrackWheelModels[19].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 210
		leftTrackWheelModels[19].setRotationPoint(-6F, 4.5F, -26F);

		leftTrackWheelModels[20].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 211
		leftTrackWheelModels[20].setRotationPoint(-6F, 4.5F, -26F);

		leftTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 212
		leftTrackWheelModels[21].setRotationPoint(-6F, 4.5F, -21.5F);

		leftTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 213
		leftTrackWheelModels[22].setRotationPoint(-6F, 4.5F, -21.5F);

		leftTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 214
		leftTrackWheelModels[23].setRotationPoint(-6F, 4.5F, -21.5F);

		leftTrackWheelModels[24].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 215
		leftTrackWheelModels[24].setRotationPoint(-21F, 4.5F, -26F);

		leftTrackWheelModels[25].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 216
		leftTrackWheelModels[25].setRotationPoint(-21F, 4.5F, -26F);

		leftTrackWheelModels[26].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 217
		leftTrackWheelModels[26].setRotationPoint(-21F, 4.5F, -26F);

		leftTrackWheelModels[27].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 218
		leftTrackWheelModels[27].setRotationPoint(-21F, 4.5F, -21.5F);

		leftTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 219
		leftTrackWheelModels[28].setRotationPoint(-21F, 4.5F, -21.5F);

		leftTrackWheelModels[29].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 220
		leftTrackWheelModels[29].setRotationPoint(-21F, 4.5F, -21.5F);

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
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 123
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 124
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 125
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 129
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 130
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 131
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 132
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 133
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 134
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 135
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 136
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 137
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 138
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 139
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 140
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 141
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 142
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 143
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 144
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 145
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 146
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 147
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 148
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 149
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 150
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 151
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 152
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 153
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 154
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 155
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 156
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 157
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 158
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 159
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 160
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 161
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 162
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 163
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 164
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 165
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 166
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 167
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 168
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 169
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 170
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 171
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 172
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 173

		rightTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 123
		rightTrackWheelModels[0].setRotationPoint(37F, 4.5F, 23F);

		rightTrackWheelModels[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 124
		rightTrackWheelModels[1].setRotationPoint(37F, 4.5F, 23F);

		rightTrackWheelModels[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 125
		rightTrackWheelModels[2].setRotationPoint(37F, 4.5F, 23F);

		rightTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 129
		rightTrackWheelModels[3].setRotationPoint(37F, 4.5F, 18.5F);

		rightTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 130
		rightTrackWheelModels[4].setRotationPoint(37F, 4.5F, 18.5F);

		rightTrackWheelModels[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 131
		rightTrackWheelModels[5].setRotationPoint(37F, 4.5F, 18.5F);

		rightTrackWheelModels[6].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 132
		rightTrackWheelModels[6].setRotationPoint(23F, 4.5F, 23F);

		rightTrackWheelModels[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 133
		rightTrackWheelModels[7].setRotationPoint(23F, 4.5F, 23F);

		rightTrackWheelModels[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 134
		rightTrackWheelModels[8].setRotationPoint(23F, 4.5F, 23F);

		rightTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 135
		rightTrackWheelModels[9].setRotationPoint(23F, 4.5F, 18.5F);

		rightTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 136
		rightTrackWheelModels[10].setRotationPoint(23F, 4.5F, 18.5F);

		rightTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 137
		rightTrackWheelModels[11].setRotationPoint(23F, 4.5F, 18.5F);

		rightTrackWheelModels[12].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 138
		rightTrackWheelModels[12].setRotationPoint(9F, 4.5F, 23F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 139
		rightTrackWheelModels[13].setRotationPoint(9F, 4.5F, 23F);

		rightTrackWheelModels[14].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 140
		rightTrackWheelModels[14].setRotationPoint(9F, 4.5F, 23F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 141
		rightTrackWheelModels[15].setRotationPoint(9F, 4.5F, 18.5F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 142
		rightTrackWheelModels[16].setRotationPoint(9F, 4.5F, 18.5F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 143
		rightTrackWheelModels[17].setRotationPoint(9F, 4.5F, 18.5F);

		rightTrackWheelModels[18].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 144
		rightTrackWheelModels[18].setRotationPoint(-6F, 4.5F, 23F);

		rightTrackWheelModels[19].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 145
		rightTrackWheelModels[19].setRotationPoint(-6F, 4.5F, 23F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 146
		rightTrackWheelModels[20].setRotationPoint(-6F, 4.5F, 23F);

		rightTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 147
		rightTrackWheelModels[21].setRotationPoint(-6F, 4.5F, 18.5F);

		rightTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 148
		rightTrackWheelModels[22].setRotationPoint(-6F, 4.5F, 18.5F);

		rightTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 149
		rightTrackWheelModels[23].setRotationPoint(-6F, 4.5F, 18.5F);

		rightTrackWheelModels[24].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 150
		rightTrackWheelModels[24].setRotationPoint(-21F, 4.5F, 23F);

		rightTrackWheelModels[25].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 151
		rightTrackWheelModels[25].setRotationPoint(-21F, 4.5F, 23F);

		rightTrackWheelModels[26].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 152
		rightTrackWheelModels[26].setRotationPoint(-21F, 4.5F, 23F);

		rightTrackWheelModels[27].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F); // Box 153
		rightTrackWheelModels[27].setRotationPoint(-21F, 4.5F, 18.5F);

		rightTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 154
		rightTrackWheelModels[28].setRotationPoint(-21F, 4.5F, 18.5F);

		rightTrackWheelModels[29].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 3, 0F,-3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, -3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 155
		rightTrackWheelModels[29].setRotationPoint(-21F, 4.5F, 18.5F);

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
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 180
		leftTrackModel[1] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 181
		leftTrackModel[2] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 182
		leftTrackModel[3] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 183
		leftTrackModel[4] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 184
		leftTrackModel[5] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 185
		leftTrackModel[6] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 186
		leftTrackModel[7] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 187

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		leftTrackModel[0].setRotationPoint(56.5F, -5F, -27F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, -0.1F, -0.6F, 1.5F, -0.1F, -0.6F, 1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 181
		leftTrackModel[1].setRotationPoint(56.5F, 0F, -27F);
		leftTrackModel[1].rotateAngleZ = -0.78539816F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 75, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftTrackModel[2].setRotationPoint(-36.5F, 9F, -27F);

		leftTrackModel[3].addShapeBox(0F, -2F, 0F, 18, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[3].setRotationPoint(38.5F, 11F, -27F);
		leftTrackModel[3].rotateAngleZ = 0.38397244F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftTrackModel[4].setRotationPoint(-47.5F, 3F, -27F);
		leftTrackModel[4].rotateAngleZ = -0.47996554F;

		leftTrackModel[5].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 185
		leftTrackModel[5].setRotationPoint(-50.5F, -0.5F, -27F);
		leftTrackModel[5].rotateAngleZ = 0.73303829F;

		leftTrackModel[6].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftTrackModel[6].setRotationPoint(-50.2F, -4.5F, -27F);

		leftTrackModel[7].addShapeBox(0F, -8F, 0F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[7].setRotationPoint(-52.2F, -4.5F, -27F);
		leftTrackModel[7].rotateAngleZ = -0.78539816F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import RT.BackTrack
		rightTrackModel[1] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 174
		rightTrackModel[2] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 175
		rightTrackModel[3] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 176
		rightTrackModel[4] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 177
		rightTrackModel[5] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 178
		rightTrackModel[6] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 179
		rightTrackModel[7] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 180

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import RT.BackTrack
		rightTrackModel[0].setRotationPoint(56.5F, -5F, 17F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, -0.1F, -0.6F, 1.5F, -0.1F, -0.6F, 1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		rightTrackModel[1].setRotationPoint(56.5F, 0F, 17F);
		rightTrackModel[1].rotateAngleZ = -0.78539816F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 75, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackModel[2].setRotationPoint(-36.5F, 9F, 17F);

		rightTrackModel[3].addShapeBox(0F, -2F, 0F, 18, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightTrackModel[3].setRotationPoint(38.5F, 11F, 17F);
		rightTrackModel[3].rotateAngleZ = 0.38397244F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightTrackModel[4].setRotationPoint(-47.5F, 3F, 17F);
		rightTrackModel[4].rotateAngleZ = -0.47996554F;

		rightTrackModel[5].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 178
		rightTrackModel[5].setRotationPoint(-50.5F, -0.5F, 17F);
		rightTrackModel[5].rotateAngleZ = 0.73303829F;

		rightTrackModel[6].addShapeBox(-2F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightTrackModel[6].setRotationPoint(-50.2F, -4.5F, 17F);

		rightTrackModel[7].addShapeBox(0F, -8F, 0F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rightTrackModel[7].setRotationPoint(-52.2F, -4.5F, 17F);
		rightTrackModel[7].rotateAngleZ = -0.78539816F;
	}
}