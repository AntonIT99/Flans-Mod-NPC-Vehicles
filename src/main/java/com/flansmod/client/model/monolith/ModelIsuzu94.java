//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Isuzu94
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIsuzu94 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelIsuzu94() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[132];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[2];
		leftFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel = new ModelRendererTurbo[6];
		leftBackWheelModel = new ModelRendererTurbo[12];
		rightBackWheelModel = new ModelRendererTurbo[12];
		steeringWheelModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initsteeringWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 51
		bodyModel[26] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 52
		bodyModel[27] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 53
		bodyModel[28] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 54
		bodyModel[29] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 55
		bodyModel[30] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 56
		bodyModel[31] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 58
		bodyModel[33] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 59
		bodyModel[34] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 79
		bodyModel[44] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 81
		bodyModel[46] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 82
		bodyModel[47] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 90
		bodyModel[55] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 92
		bodyModel[57] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 93
		bodyModel[58] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 94
		bodyModel[59] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 96
		bodyModel[61] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 269
		bodyModel[62] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 270
		bodyModel[63] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 271
		bodyModel[64] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 272
		bodyModel[65] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 273
		bodyModel[66] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 275
		bodyModel[67] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 103
		bodyModel[68] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 104
		bodyModel[69] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 105
		bodyModel[70] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 106
		bodyModel[71] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 414
		bodyModel[72] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 415
		bodyModel[73] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 110
		bodyModel[74] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 111
		bodyModel[75] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 112
		bodyModel[76] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 113
		bodyModel[77] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 114
		bodyModel[78] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 115
		bodyModel[79] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 116
		bodyModel[80] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 117
		bodyModel[81] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[82] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 119
		bodyModel[83] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 121
		bodyModel[84] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 122
		bodyModel[85] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 123
		bodyModel[86] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 124
		bodyModel[87] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 125
		bodyModel[88] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 126
		bodyModel[89] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 127
		bodyModel[90] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 130
		bodyModel[93] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 131
		bodyModel[94] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 132
		bodyModel[95] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 133
		bodyModel[96] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 134
		bodyModel[97] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 135
		bodyModel[98] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 136
		bodyModel[99] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 137
		bodyModel[100] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 138
		bodyModel[101] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 139
		bodyModel[102] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 140
		bodyModel[103] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 141
		bodyModel[104] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 142
		bodyModel[105] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 143
		bodyModel[106] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 144
		bodyModel[107] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 145
		bodyModel[108] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 146
		bodyModel[109] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 147
		bodyModel[110] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 148
		bodyModel[111] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 149
		bodyModel[112] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 150
		bodyModel[113] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 151
		bodyModel[114] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 152
		bodyModel[115] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 153
		bodyModel[116] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 154
		bodyModel[117] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 155
		bodyModel[118] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 156
		bodyModel[119] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 157
		bodyModel[120] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 158
		bodyModel[121] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 159
		bodyModel[122] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 178
		bodyModel[123] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 179
		bodyModel[124] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 180
		bodyModel[125] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 181
		bodyModel[126] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 182
		bodyModel[127] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 185
		bodyModel[128] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 186
		bodyModel[129] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 187
		bodyModel[130] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 174
		bodyModel[131] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 424

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(44F, -19F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 2, 14, 0F,-0.5F, 1.5F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 1.5F, 2F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 4F); // Box 3
		bodyModel[1].setRotationPoint(26F, -19F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F,0F, 0F, 1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 3F); // Box 4
		bodyModel[2].setRotationPoint(22F, -21F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[3].setRotationPoint(38.5F, -10.5F, 6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[4].setRotationPoint(43.5F, -10.5F, 6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0.5F, 0F, 0F, -1.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(46.5F, -9.5F, 6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,1.5F, -0.2F, 0F, -2F, -2.8F, 0F, -0.5F, -2.8F, -1F, 0.5F, -0.2F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(48.5F, -8.5F, 6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 15
		bodyModel[7].setRotationPoint(36.5F, -10.5F, 6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, -4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 3F, 0F); // Box 16
		bodyModel[8].setRotationPoint(31.5F, -10.5F, 6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F); // Box 17
		bodyModel[9].setRotationPoint(23.5F, -6.5F, 6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 18
		bodyModel[10].setRotationPoint(20.5F, 0.5F, 6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 23, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[11].setRotationPoint(-2.5F, 2F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F); // Box 20
		bodyModel[12].setRotationPoint(44F, -17F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 10, 14, 0F,-0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, -0.5F, 4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 4F); // Box 21
		bodyModel[13].setRotationPoint(26F, -17F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 3, 14, 0F,-0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 2.5F, 4F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, -0.5F, 2.5F, 4F); // Box 24
		bodyModel[14].setRotationPoint(26F, -7.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3.5F, 0F, 1.5F, -3.5F, 0F, 1.5F, -3F); // Box 25
		bodyModel[15].setRotationPoint(44F, -7.5F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(51.5F, -4.5F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(51.5F, -4.5F, 9.5F);

		bodyModel[18].addShapeBox(-1F, -1F, 0F, 2, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(40.5F, 2F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 13, 18, 0F,0F, 0F, 3F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 3F); // Box 30
		bodyModel[19].setRotationPoint(22F, -17F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 1, 23, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 32
		bodyModel[20].setRotationPoint(2F, -5F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 15, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 35
		bodyModel[21].setRotationPoint(2F, -20F, 12.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-1F, -2F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, 3F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 3F, 0F, 4F, 3F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 4F, 3F); // Box 37
		bodyModel[23].setRotationPoint(22F, -4F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 50
		bodyModel[24].setRotationPoint(-4.5F, -3F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 51
		bodyModel[25].setRotationPoint(-8F, -7F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 1.4F, 0F, 1.3F, 1.4F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[26].setRotationPoint(-11F, -9F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[27].setRotationPoint(-38F, -9F, 6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.3F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 1.4F, 0F); // Box 54
		bodyModel[28].setRotationPoint(-41F, -9F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F); // Box 55
		bodyModel[29].setRotationPoint(-42F, -7F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 56
		bodyModel[30].setRotationPoint(-45.5F, -3F, 6.5F);

		bodyModel[31].addShapeBox(-1F, -1F, 0F, 2, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[31].setRotationPoint(-14F, 2F, -14F);

		bodyModel[32].addShapeBox(-1F, -1F, 0F, 2, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[32].setRotationPoint(-35.5F, 2F, -14F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 15, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[33].setRotationPoint(2F, -20F, -13.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[34].setRotationPoint(21F, -20F, -11.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 65
		bodyModel[35].setRotationPoint(2F, -30F, 12.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 66
		bodyModel[36].setRotationPoint(2F, -23F, 12.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 67
		bodyModel[37].setRotationPoint(2F, -28F, 13.2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F); // Box 68
		bodyModel[38].setRotationPoint(8F, -28F, 12.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 28, 0F,0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 69
		bodyModel[39].setRotationPoint(2F, -31F, -14F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 28, 0F,0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 70
		bodyModel[40].setRotationPoint(9F, -31F, -14F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[41].setRotationPoint(21F, -22F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[42].setRotationPoint(21F, -30F, 10.5F);

		bodyModel[43].addShapeBox(-8.5F, -8.5F, 0F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[43].setRotationPoint(20.5F, -8F, -15.5F);
		bodyModel[43].rotateAngleY = 0.13962634F;

		bodyModel[44].addShapeBox(-5F, -5F, -4F, 10, 3, 1, 0F,-3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[44].setRotationPoint(20.5F, -8F, -12.5F);
		bodyModel[44].rotateAngleY = 0.13962634F;

		bodyModel[45].addShapeBox(-5F, -2F, -4F, 10, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[45].setRotationPoint(20.5F, -8F, -12.5F);
		bodyModel[45].rotateAngleY = 0.13962634F;

		bodyModel[46].addShapeBox(-5F, 2F, -4F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 82
		bodyModel[46].setRotationPoint(20.5F, -8F, -12.5F);
		bodyModel[46].rotateAngleY = 0.13962634F;

		bodyModel[47].addShapeBox(-8.5F, 2.5F, 0F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 83
		bodyModel[47].setRotationPoint(20.5F, -8F, -15.5F);
		bodyModel[47].rotateAngleY = 0.13962634F;

		bodyModel[48].addShapeBox(-8.5F, -3F, 0F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[48].setRotationPoint(20.5F, -8F, -15.5F);
		bodyModel[48].rotateAngleY = 0.13962634F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, 1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, 1.9F, 0F, 0F, 0F); // Box 85
		bodyModel[49].setRotationPoint(9F, -20F, -13.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 86
		bodyModel[50].setRotationPoint(10F, -16F, -14F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 51, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[51].setRotationPoint(-50F, -10F, -17F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 51, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 88
		bodyModel[52].setRotationPoint(-50F, -9F, -17F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 51, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 89
		bodyModel[53].setRotationPoint(-50F, -19F, 16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 90
		bodyModel[54].setRotationPoint(-50F, -26F, 16F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 91
		bodyModel[55].setRotationPoint(-50F, -26.8F, 16F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 92
		bodyModel[56].setRotationPoint(-50F, -26.8F, -16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[57].setRotationPoint(3F, -23F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 3, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[58].setRotationPoint(3F, -8F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[59].setRotationPoint(2F, -25F, -13.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[60].setRotationPoint(2F, -30F, -13.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 269
		bodyModel[61].setRotationPoint(48F, -13.75F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[62].setRotationPoint(48F, -15F, 6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 271
		bodyModel[63].setRotationPoint(48F, -11.5F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F); // Box 272
		bodyModel[64].setRotationPoint(46F, -13.75F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, -0.4F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.4F, -1.2F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 273
		bodyModel[65].setRotationPoint(46F, -15F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, -1F, -0.4F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.4F, -1.2F); // Box 275
		bodyModel[66].setRotationPoint(46F, -11.5F, 6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 103
		bodyModel[67].setRotationPoint(48.3F, -12.75F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 104
		bodyModel[68].setRotationPoint(47.8F, -12.75F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -3.75F, 1F, 0.5F, -3.75F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 3.25F, 0F, 0.5F, 3.25F, 0F); // Box 105
		bodyModel[69].setRotationPoint(47.8F, -10.75F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 9, 34, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 106
		bodyModel[70].setRotationPoint(-50F, -19F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[71].setRotationPoint(-16.5F, -0.5F, -2.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,34F, 0F, 3F, 34F, 0F, 3F, 34F, 0F, 3F, 34F, 0F, 3F, 32F, 0F, 3F, 34F, 0F, 3F, 34F, 0F, 3F, 32F, 0F, 3F); // Box 415
		bodyModel[72].setRotationPoint(-14.5F, -4.5F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[73].setRotationPoint(-38F, -0.5F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 8, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[74].setRotationPoint(38F, -3.5F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 2F, 5F, 0.2F, 2F, 5F, 0.2F, 2F, 5F, 0.2F, 2F, 5F, 0.2F, 2F); // Box 112
		bodyModel[75].setRotationPoint(14.5F, -0.5F, -0.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F); // Box 113
		bodyModel[76].setRotationPoint(-19.5F, 0.5F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[77].setRotationPoint(38F, -3.5F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[78].setRotationPoint(47.2F, -18.5F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[79].setRotationPoint(47.2F, -13.5F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[80].setRotationPoint(47.2F, -9.5F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F, 24F, 0F, 3F); // Box 118
		bodyModel[81].setRotationPoint(-24.5F, -6.5F, -0.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 51, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		bodyModel[82].setRotationPoint(-50F, -19F, -17F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 121
		bodyModel[83].setRotationPoint(0F, -26F, 16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 122
		bodyModel[84].setRotationPoint(-10F, -26F, 16F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 123
		bodyModel[85].setRotationPoint(-20F, -26F, 16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 124
		bodyModel[86].setRotationPoint(-30F, -26F, 16F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 125
		bodyModel[87].setRotationPoint(-40F, -26F, 16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 126
		bodyModel[88].setRotationPoint(-50F, -26F, -17F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 127
		bodyModel[89].setRotationPoint(-50F, -26.8F, -17F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 128
		bodyModel[90].setRotationPoint(0F, -26F, -17F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 129
		bodyModel[91].setRotationPoint(-10F, -26F, -17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 130
		bodyModel[92].setRotationPoint(-20F, -26F, -17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 131
		bodyModel[93].setRotationPoint(-30F, -26F, -17F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 132
		bodyModel[94].setRotationPoint(-40F, -26F, -17F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 133
		bodyModel[95].setRotationPoint(-50F, -26F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 134
		bodyModel[96].setRotationPoint(-50F, -26F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 9, 34, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 135
		bodyModel[97].setRotationPoint(0F, -19F, -17F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 15, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 136
		bodyModel[98].setRotationPoint(2F, -20F, -13.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 137
		bodyModel[99].setRotationPoint(2F, -30F, -13.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 138
		bodyModel[100].setRotationPoint(2F, -23F, -13.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 139
		bodyModel[101].setRotationPoint(2F, -28F, -14.2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 140
		bodyModel[102].setRotationPoint(8F, -28F, -13.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[103].setRotationPoint(21F, -30F, -11.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 142
		bodyModel[104].setRotationPoint(48.3F, -12.75F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[105].setRotationPoint(38.5F, -10.5F, -17.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[106].setRotationPoint(43.5F, -10.5F, -17.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.5F, -1.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 145
		bodyModel[107].setRotationPoint(46.5F, -9.5F, -17.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0.5F, -0.2F, 0F, -0.5F, -2.8F, -1F, -2F, -2.8F, 0F, 1.5F, -0.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 146
		bodyModel[108].setRotationPoint(48.5F, -8.5F, -17.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 147
		bodyModel[109].setRotationPoint(36.5F, -10.5F, -17.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, -4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 3F, 0F); // Box 148
		bodyModel[110].setRotationPoint(31.5F, -10.5F, -17.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F); // Box 149
		bodyModel[111].setRotationPoint(23.5F, -6.5F, -17.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 150
		bodyModel[112].setRotationPoint(20.5F, 0.5F, -17.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 23, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[113].setRotationPoint(-2.5F, 2F, -17.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[114].setRotationPoint(-1F, -2F, -17F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 153
		bodyModel[115].setRotationPoint(-4.5F, -3F, -17.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 154
		bodyModel[116].setRotationPoint(-8F, -7F, -17.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 1.4F, 0F, 1.3F, 1.4F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[117].setRotationPoint(-11F, -9F, -17.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 27, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[118].setRotationPoint(-38F, -9F, -17.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.3F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 1.4F, 0F); // Box 157
		bodyModel[119].setRotationPoint(-41F, -9F, -17.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F); // Box 158
		bodyModel[120].setRotationPoint(-42F, -7F, -17.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 159
		bodyModel[121].setRotationPoint(-45.5F, -3F, -17.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 178
		bodyModel[122].setRotationPoint(48F, -13.75F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[123].setRotationPoint(48F, -15F, -10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 180
		bodyModel[124].setRotationPoint(48F, -11.5F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 181
		bodyModel[125].setRotationPoint(47.8F, -12.75F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, -3.75F, 1F, -0.5F, -3.75F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 3.25F, 0F, -0.5F, 3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 182
		bodyModel[126].setRotationPoint(47.8F, -10.75F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[127].setRotationPoint(3F, -23F, 2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 3, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[128].setRotationPoint(3F, -8F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[129].setRotationPoint(51.5F, -4.5F, -14.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[130].setRotationPoint(2F, -30F, 5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 15, 15, 0F,0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F); // Box 424
		bodyModel[131].setRotationPoint(48.6F, -19.75F, -7.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 183
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 184

		bodyDoorOpenModel[0].addShapeBox(-12F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F); // Box 183
		bodyDoorOpenModel[0].setRotationPoint(22F, -20F, 12.5F);
		bodyDoorOpenModel[0].rotateAngleY = -1.23918377F;

		bodyDoorOpenModel[1].addShapeBox(-12F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 184
		bodyDoorOpenModel[1].setRotationPoint(23F, -16F, 13F);
		bodyDoorOpenModel[1].rotateAngleY = -1.23918377F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F); // Box 31
		bodyDoorCloseModel[0].setRotationPoint(9F, -20F, 12.5F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 34
		bodyDoorCloseModel[1].setRotationPoint(10F, -16F, 13F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 9
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 10

		leftFrontWheelModel[0].addShapeBox(-8.5F, -3F, 0F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		leftFrontWheelModel[0].setRotationPoint(40.5F, 2F, 13F);

		leftFrontWheelModel[1].addShapeBox(-8.5F, -8.5F, 0F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftFrontWheelModel[1].setRotationPoint(40.5F, 2F, 13F);

		leftFrontWheelModel[2].addShapeBox(-8.5F, 2.5F, 0F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 7
		leftFrontWheelModel[2].setRotationPoint(40.5F, 2F, 13F);

		leftFrontWheelModel[3].addShapeBox(-5F, -2F, 4F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 8
		leftFrontWheelModel[3].setRotationPoint(40.5F, 2F, 13F);

		leftFrontWheelModel[4].addShapeBox(-5F, -5F, 4F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 9
		leftFrontWheelModel[4].setRotationPoint(40.5F, 2F, 13F);

		leftFrontWheelModel[5].addShapeBox(-5F, 2F, 4F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F); // Box 10
		leftFrontWheelModel[5].setRotationPoint(40.5F, 2F, 13F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 160
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 161
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 162
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 169
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 170
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 171

		rightFrontWheelModel[0].addShapeBox(-8.5F, -3F, -4F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		rightFrontWheelModel[0].setRotationPoint(40.5F, 2F, -13F);

		rightFrontWheelModel[1].addShapeBox(-8.5F, -8.5F, -4F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightFrontWheelModel[1].setRotationPoint(40.5F, 2F, -13F);

		rightFrontWheelModel[2].addShapeBox(-8.5F, 2.5F, -4F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 162
		rightFrontWheelModel[2].setRotationPoint(40.5F, 2F, -13F);

		rightFrontWheelModel[3].addShapeBox(-5F, -5F, -5F, 10, 3, 1, 0F,-3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightFrontWheelModel[3].setRotationPoint(40.5F, 2F, -13F);

		rightFrontWheelModel[4].addShapeBox(-5F, -2F, -5F, 10, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightFrontWheelModel[4].setRotationPoint(40.5F, 2F, -13F);

		rightFrontWheelModel[5].addShapeBox(-5F, 2F, -5F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 171
		rightFrontWheelModel[5].setRotationPoint(40.5F, 2F, -13F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 38
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 39
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 40
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 41
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 42
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 43
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 44
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 45
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 46
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 47
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 48
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 49

		leftBackWheelModel[0].addShapeBox(-8.5F, -3F, 0F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		leftBackWheelModel[0].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[1].addShapeBox(-8.5F, -8.5F, 0F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftBackWheelModel[1].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[2].addShapeBox(-5F, -5F, 4F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 40
		leftBackWheelModel[2].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[3].addShapeBox(-5F, -2F, 4F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 41
		leftBackWheelModel[3].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[4].addShapeBox(-5F, 2F, 4F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F); // Box 42
		leftBackWheelModel[4].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[5].addShapeBox(-8.5F, 2.5F, 0F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 43
		leftBackWheelModel[5].setRotationPoint(-14F, 2F, 13F);

		leftBackWheelModel[6].addShapeBox(-8.5F, -3F, 0F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		leftBackWheelModel[6].setRotationPoint(-35.5F, 2F, 13F);

		leftBackWheelModel[7].addShapeBox(-8.5F, -8.5F, 0F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftBackWheelModel[7].setRotationPoint(-35.5F, 2F, 13F);

		leftBackWheelModel[8].addShapeBox(-5F, -5F, 4F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		leftBackWheelModel[8].setRotationPoint(-35.5F, 2F, 13F);

		leftBackWheelModel[9].addShapeBox(-5F, -2F, 4F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 47
		leftBackWheelModel[9].setRotationPoint(-35.5F, 2F, 13F);

		leftBackWheelModel[10].addShapeBox(-5F, 2F, 4F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F); // Box 48
		leftBackWheelModel[10].setRotationPoint(-35.5F, 2F, 13F);

		leftBackWheelModel[11].addShapeBox(-8.5F, 2.5F, 0F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 49
		leftBackWheelModel[11].setRotationPoint(-35.5F, 2F, 13F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 163
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 164
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 165
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 166
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 167
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 168
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 172
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 173
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 174
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 175
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 176
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 177

		rightBackWheelModel[0].addShapeBox(-8.5F, -3F, -4F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
		rightBackWheelModel[0].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[1].addShapeBox(-8.5F, -8.5F, -4F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightBackWheelModel[1].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[2].addShapeBox(-8.5F, 2.5F, -4F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 165
		rightBackWheelModel[2].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[3].addShapeBox(-8.5F, 2.5F, -4F, 17, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 166
		rightBackWheelModel[3].setRotationPoint(-35.5F, 2F, -13F);

		rightBackWheelModel[4].addShapeBox(-8.5F, -3F, -4F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 167
		rightBackWheelModel[4].setRotationPoint(-35.5F, 2F, -13F);

		rightBackWheelModel[5].addShapeBox(-8.5F, -8.5F, -4F, 17, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightBackWheelModel[5].setRotationPoint(-35.5F, 2F, -13F);

		rightBackWheelModel[6].addShapeBox(-5F, -2F, -5F, 10, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightBackWheelModel[6].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[7].addShapeBox(-5F, -5F, -5F, 10, 3, 1, 0F,-3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		rightBackWheelModel[7].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[8].addShapeBox(-5F, 2F, -5F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 174
		rightBackWheelModel[8].setRotationPoint(-14F, 2F, -13F);

		rightBackWheelModel[9].addShapeBox(-5F, 2F, -5F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 175
		rightBackWheelModel[9].setRotationPoint(-35.5F, 2F, -13F);

		rightBackWheelModel[10].addShapeBox(-5F, -2F, -5F, 10, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightBackWheelModel[10].setRotationPoint(-35.5F, 2F, -13F);

		rightBackWheelModel[11].addShapeBox(-5F, -5F, -5F, 10, 3, 1, 0F,-3F, -2.9F, 0F, -3F, -2.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightBackWheelModel[11].setRotationPoint(-35.5F, 2F, -13F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 203
		steeringWheelModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 204
		steeringWheelModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 205
		steeringWheelModel[3] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 206

		steeringWheelModel[0].addShapeBox(-4F, -1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		steeringWheelModel[0].setRotationPoint(19.5F, -18F, -6F);
		steeringWheelModel[0].rotateAngleZ = -0.87266463F;

		steeringWheelModel[1].addShapeBox(-4F, -3F, -3F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		steeringWheelModel[1].setRotationPoint(19.5F, -18F, -6F);
		steeringWheelModel[1].rotateAngleZ = -0.87266463F;

		steeringWheelModel[2].addShapeBox(-4F, 1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 205
		steeringWheelModel[2].setRotationPoint(19.5F, -18F, -6F);
		steeringWheelModel[2].rotateAngleZ = -0.87266463F;

		steeringWheelModel[3].addShapeBox(-3F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		steeringWheelModel[3].setRotationPoint(19.5F, -18F, -6F);
		steeringWheelModel[3].rotateAngleZ = -0.87266463F;
	}
}