//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType61 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelType61() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];
		turretModel = new ModelRendererTurbo[106];
		barrelModel = new ModelRendererTurbo[29];
		leftTrackWheelModels = new ModelRendererTurbo[36];
		rightTrackWheelModels = new ModelRendererTurbo[36];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box8
		bodyModel[6] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box10
		bodyModel[7] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box15
		bodyModel[8] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box16
		bodyModel[9] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box17
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box18
		bodyModel[11] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box19
		bodyModel[12] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box20
		bodyModel[13] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box21
		bodyModel[14] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box22
		bodyModel[15] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import Box23
		bodyModel[16] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import Box26
		bodyModel[17] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box88
		bodyModel[18] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box89
		bodyModel[19] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Import Box90
		bodyModel[20] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box91
		bodyModel[21] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Import Box92
		bodyModel[22] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import Box93
		bodyModel[23] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Import Box94
		bodyModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box95
		bodyModel[25] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box96
		bodyModel[26] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box97
		bodyModel[27] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box98
		bodyModel[28] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box99
		bodyModel[29] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import Box100
		bodyModel[30] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import Box101
		bodyModel[31] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import Box102
		bodyModel[32] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box103
		bodyModel[33] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Import Box104
		bodyModel[34] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Import Box105
		bodyModel[35] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import Box106
		bodyModel[36] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box107
		bodyModel[37] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box108
		bodyModel[38] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box109
		bodyModel[39] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box110
		bodyModel[40] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Import Box111
		bodyModel[41] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import Box121
		bodyModel[42] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Import Box123
		bodyModel[43] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Import Box124
		bodyModel[44] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Import Box125
		bodyModel[45] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Import Box126
		bodyModel[46] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box127
		bodyModel[47] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import Box128
		bodyModel[48] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Box129
		bodyModel[49] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Box130
		bodyModel[50] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Import Box131
		bodyModel[51] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import Box132
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box133
		bodyModel[53] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box134
		bodyModel[54] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box135
		bodyModel[55] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box136
		bodyModel[56] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box137
		bodyModel[57] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box138
		bodyModel[58] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box139
		bodyModel[59] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Import Box140
		bodyModel[60] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box141
		bodyModel[61] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box142
		bodyModel[62] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box143
		bodyModel[63] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box144
		bodyModel[64] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box145
		bodyModel[65] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box146
		bodyModel[66] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box147
		bodyModel[67] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box148
		bodyModel[68] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box149
		bodyModel[69] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box150
		bodyModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box157
		bodyModel[71] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box163
		bodyModel[72] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Import Box164
		bodyModel[73] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Import Box165
		bodyModel[74] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box166
		bodyModel[75] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import Box167
		bodyModel[76] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box168
		bodyModel[77] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box396
		bodyModel[78] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Import Box397
		bodyModel[79] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box478
		bodyModel[80] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box479
		bodyModel[81] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box480
		bodyModel[82] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box481
		bodyModel[83] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box482
		bodyModel[84] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import Box490
		bodyModel[85] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box491
		bodyModel[86] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Import Box500
		bodyModel[87] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box484
		bodyModel[88] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box485
		bodyModel[89] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Box486
		bodyModel[90] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import Box487
		bodyModel[91] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box488
		bodyModel[92] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import Box489
		bodyModel[93] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box469
		bodyModel[94] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box470
		bodyModel[95] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import Box472
		bodyModel[96] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box952
		bodyModel[97] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Import Box953
		bodyModel[98] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Import Box954
		bodyModel[99] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Import Box816
		bodyModel[100] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box817
		bodyModel[101] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Import Box818
		bodyModel[102] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box828
		bodyModel[103] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import Box829
		bodyModel[104] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Import Box830
		bodyModel[105] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box831
		bodyModel[106] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Import Box422
		bodyModel[107] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Box436
		bodyModel[108] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import Box437
		bodyModel[109] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box438
		bodyModel[110] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box439
		bodyModel[111] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Import Box442
		bodyModel[112] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box444
		bodyModel[113] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Import Box445
		bodyModel[114] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Import Box446
		bodyModel[115] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box447
		bodyModel[116] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import Box448
		bodyModel[117] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Import Box451
		bodyModel[118] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Import Box453
		bodyModel[119] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box454
		bodyModel[120] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box457
		bodyModel[121] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import Box458
		bodyModel[122] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import Box455
		bodyModel[123] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box456
		bodyModel[124] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import Box457
		bodyModel[125] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box458
		bodyModel[126] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import Box459
		bodyModel[127] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box460
		bodyModel[128] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Box461
		bodyModel[129] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import Box462
		bodyModel[130] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Import Box463
		bodyModel[131] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Import Box181
		bodyModel[132] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import Box182
		bodyModel[133] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import Box183
		bodyModel[134] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box185
		bodyModel[135] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Import Box186
		bodyModel[136] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box398
		bodyModel[137] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box399
		bodyModel[138] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Import Box401
		bodyModel[139] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import Box402
		bodyModel[140] = new ModelRendererTurbo(this, 585, 249, textureX, textureY); // Box 3
		bodyModel[141] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Box 4
		bodyModel[142] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 5
		bodyModel[143] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 6
		bodyModel[144] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 7
		bodyModel[145] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 8
		bodyModel[146] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 14
		bodyModel[147] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 15
		bodyModel[148] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 16
		bodyModel[149] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 17
		bodyModel[150] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 18
		bodyModel[151] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 19
		bodyModel[152] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 20
		bodyModel[153] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 21
		bodyModel[154] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 22
		bodyModel[155] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 23
		bodyModel[156] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 24
		bodyModel[157] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 25
		bodyModel[158] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 26
		bodyModel[159] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 30
		bodyModel[160] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 35
		bodyModel[161] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 36

		bodyModel[0].addBox(0F, 0F, 0F, 72, 23, 25, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-45F, -20.25F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 22, 21, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(27F, -20.25F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-45F, -20.25F, -15.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 72, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import Box3
		bodyModel[3].setRotationPoint(-45F, -20.25F, 13.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 20, 21, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -3F, 0F, 0F); // Import Box6
		bodyModel[4].setRotationPoint(31F, -18.25F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 24, 6, 0F,0F, -2F, 0F, 4F, -12F, 0F, 3F, -12.5F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 4F, -11F, 0F, 3F, -11F, 0F, 0F, -6F, 0F); // Import Box8
		bodyModel[5].setRotationPoint(27F, -22.25F, 11.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 22, 35, 0F,2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, -9.5F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 2F, -9.5F, -1F); // Import Box10
		bodyModel[6].setRotationPoint(-58F, -20.25F, -16.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 90, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box15
		bodyModel[7].setRotationPoint(-45F, -15.25F, 17.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box16
		bodyModel[8].setRotationPoint(-57F, -15.25F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 90, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box17
		bodyModel[9].setRotationPoint(-45F, -15.25F, -28F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		bodyModel[10].setRotationPoint(45F, -15.25F, 17.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 0F, -0.5F); // Import Box19
		bodyModel[11].setRotationPoint(50F, -13.25F, 17.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Import Box20
		bodyModel[12].setRotationPoint(52F, -9.25F, 17.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Import Box21
		bodyModel[13].setRotationPoint(52F, -9.25F, -28F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 0F, -0.5F); // Import Box22
		bodyModel[14].setRotationPoint(50F, -13.25F, -28F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, -0.5F, 0F, 0F, -0.5F); // Import Box23
		bodyModel[15].setRotationPoint(45F, -15.25F, -28F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, -4F, 0F, 4F, 2F, 0F, 4F, 2F, -5.5F, 0F, -4F, -5.5F, -1F, 3F, 0F, 4F, -2F, 0F, 4F, -2F, -5.5F, -1F, 3F, -5.5F); // Import Box26
		bodyModel[16].setRotationPoint(-64F, -13.25F, 18F);

		bodyModel[17].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box88
		bodyModel[17].setRotationPoint(-1.75F, -0.2F, -12.75F);

		bodyModel[18].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box89
		bodyModel[18].setRotationPoint(-1.75F, -0.2F, -12.75F);

		bodyModel[19].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box90
		bodyModel[19].setRotationPoint(-1.75F, -0.2F, -12.75F);

		bodyModel[20].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box91
		bodyModel[20].setRotationPoint(11.25F, -0.2F, -12.75F);

		bodyModel[21].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box92
		bodyModel[21].setRotationPoint(11.25F, -0.2F, -12.75F);

		bodyModel[22].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box93
		bodyModel[22].setRotationPoint(11.25F, -0.2F, -12.75F);

		bodyModel[23].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box94
		bodyModel[23].setRotationPoint(24.25F, -0.2F, -12.75F);

		bodyModel[24].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box95
		bodyModel[24].setRotationPoint(24.25F, -0.2F, -12.75F);

		bodyModel[25].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box96
		bodyModel[25].setRotationPoint(24.25F, -0.2F, -12.75F);

		bodyModel[26].addShapeBox(-3F, -1.7F, -5F, 6, 3, 8, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box97
		bodyModel[26].setRotationPoint(28.25F, -0.2F, -12.75F);

		bodyModel[27].addShapeBox(-3F, 0.3F, -5F, 6, 3, 8, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box98
		bodyModel[27].setRotationPoint(28.25F, -0.2F, -12.75F);

		bodyModel[28].addShapeBox(-3F, -3.7F, -5F, 6, 3, 8, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box99
		bodyModel[28].setRotationPoint(28.25F, -0.2F, -12.75F);

		bodyModel[29].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box100
		bodyModel[29].setRotationPoint(-14.75F, -0.2F, -12.75F);

		bodyModel[30].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box101
		bodyModel[30].setRotationPoint(-14.75F, -0.2F, -12.75F);

		bodyModel[31].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box102
		bodyModel[31].setRotationPoint(-14.75F, -0.2F, -12.75F);

		bodyModel[32].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box103
		bodyModel[32].setRotationPoint(-27.75F, -0.2F, -12.75F);

		bodyModel[33].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box104
		bodyModel[33].setRotationPoint(-27.75F, -0.2F, -12.75F);

		bodyModel[34].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box105
		bodyModel[34].setRotationPoint(-27.75F, -0.2F, -12.75F);

		bodyModel[35].addShapeBox(-3F, -3.7F, -5F, 6, 3, 9, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box106
		bodyModel[35].setRotationPoint(-40.25F, -1.5F, 16.25F);

		bodyModel[36].addShapeBox(-3F, -1.7F, -5F, 6, 3, 9, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box107
		bodyModel[36].setRotationPoint(-40.25F, -1.5F, 16.25F);

		bodyModel[37].addShapeBox(-3F, 0.3F, -5F, 6, 3, 9, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box108
		bodyModel[37].setRotationPoint(-40.25F, -1.5F, 16.25F);

		bodyModel[38].addShapeBox(-3F, 0.3F, -5F, 6, 3, 9, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box109
		bodyModel[38].setRotationPoint(28.25F, -0.2F, 16.25F);

		bodyModel[39].addShapeBox(-3F, -1.7F, -5F, 6, 3, 9, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box110
		bodyModel[39].setRotationPoint(28.25F, -0.2F, 16.25F);

		bodyModel[40].addShapeBox(-3F, -3.7F, -5F, 6, 3, 9, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box111
		bodyModel[40].setRotationPoint(28.25F, -0.2F, 16.25F);

		bodyModel[41].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[41].setRotationPoint(25.75F, -0.2F, -14.75F);

		bodyModel[42].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[42].setRotationPoint(29.75F, -0.2F, -14.75F);

		bodyModel[43].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[43].setRotationPoint(12.75F, -0.2F, -14.75F);

		bodyModel[44].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		bodyModel[44].setRotationPoint(-0.25F, -0.2F, -14.75F);

		bodyModel[45].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		bodyModel[45].setRotationPoint(-13.25F, -0.2F, -14.75F);

		bodyModel[46].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		bodyModel[46].setRotationPoint(-26.25F, -0.2F, -14.75F);

		bodyModel[47].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[47].setRotationPoint(-38.75F, -1.2F, -14.75F);

		bodyModel[48].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box129
		bodyModel[48].setRotationPoint(-13.25F, -9.2F, -14.75F);
		bodyModel[48].rotateAngleZ = -0.59341195F;

		bodyModel[49].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box130
		bodyModel[49].setRotationPoint(-26.25F, -9.2F, -14.75F);
		bodyModel[49].rotateAngleZ = -0.59341195F;

		bodyModel[50].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box131
		bodyModel[50].setRotationPoint(21.75F, -10.2F, -14.75F);

		bodyModel[51].addShapeBox(-1.8F, -3.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box132
		bodyModel[51].setRotationPoint(27.75F, -10.2F, -14.75F);
		bodyModel[51].rotateAngleZ = 0.78539816F;

		bodyModel[52].addShapeBox(-1.8F, -1.7F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[52].setRotationPoint(27.75F, -10.2F, -14.65F);
		bodyModel[52].rotateAngleZ = 0.78539816F;

		bodyModel[53].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[53].setRotationPoint(-12.6F, -10.2F, -14.65F);
		bodyModel[53].rotateAngleZ = -0.59341195F;

		bodyModel[54].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[54].setRotationPoint(-25.6F, -10.2F, -14.65F);
		bodyModel[54].rotateAngleZ = -0.59341195F;

		bodyModel[55].addShapeBox(-1.8F, 0.3F, -5F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[55].setRotationPoint(21.75F, -10.2F, -14.65F);

		bodyModel[56].addShapeBox(-1.8F, 0.3F, -5F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[56].setRotationPoint(21.75F, -10.2F, 25F);

		bodyModel[57].addShapeBox(-1.8F, -1.7F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		bodyModel[57].setRotationPoint(27.75F, -10.2F, 25F);
		bodyModel[57].rotateAngleZ = 0.78539816F;

		bodyModel[58].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[58].setRotationPoint(-12.6F, -10.2F, 25F);
		bodyModel[58].rotateAngleZ = -0.59341195F;

		bodyModel[59].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[59].setRotationPoint(-25.6F, -10.2F, 25F);
		bodyModel[59].rotateAngleZ = -0.59341195F;

		bodyModel[60].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[60].setRotationPoint(17.75F, -6.2F, -14.65F);

		bodyModel[61].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[61].setRotationPoint(4.75F, -6.2F, -14.65F);

		bodyModel[62].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[62].setRotationPoint(-8.25F, -6.2F, -14.65F);

		bodyModel[63].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[63].setRotationPoint(-21.25F, -6.2F, -14.65F);

		bodyModel[64].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[64].setRotationPoint(-34.25F, -6.2F, -14.65F);

		bodyModel[65].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[65].setRotationPoint(-34.25F, -6.2F, 24.5F);

		bodyModel[66].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[66].setRotationPoint(-21.25F, -6.2F, 24.5F);

		bodyModel[67].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[67].setRotationPoint(-8.25F, -6.2F, 24.5F);

		bodyModel[68].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[68].setRotationPoint(4.75F, -6.2F, 24.5F);

		bodyModel[69].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[69].setRotationPoint(17.75F, -6.2F, 24.5F);

		bodyModel[70].addShapeBox(-1.8F, -2.7F, -5F, 2, 5, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box157
		bodyModel[70].setRotationPoint(32.75F, -9.2F, -15.75F);
		bodyModel[70].rotateAngleZ = 0.78539816F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		bodyModel[71].setRotationPoint(-47.5F, -20.25F, 17F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 27, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[72].setRotationPoint(-47.5F, -20.25F, 26F);

		bodyModel[73].addShapeBox(-1.8F, 0.3F, -5F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box165
		bodyModel[73].setRotationPoint(-44.25F, -2.5F, 24.5F);

		bodyModel[74].addShapeBox(-1.8F, 0.3F, -5F, 2, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Import Box166
		bodyModel[74].setRotationPoint(-44.25F, -0.25F, 25.5F);

		bodyModel[75].addShapeBox(-1.8F, 0.3F, -5F, 2, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Import Box167
		bodyModel[75].setRotationPoint(-44.25F, -0.25F, -16.5F);

		bodyModel[76].addShapeBox(-1.8F, 0.3F, -5F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box168
		bodyModel[76].setRotationPoint(-44.25F, -2.5F, -14.5F);

		bodyModel[77].addShapeBox(-20F, -16F, 7F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box396
		bodyModel[77].setRotationPoint(10F, -6F, -20.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 6, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box397
		bodyModel[78].setRotationPoint(-63F, -19.25F, 5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Import Box478
		bodyModel[79].setRotationPoint(-56.7F, -8.4F, -7.1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Import Box479
		bodyModel[80].setRotationPoint(-56.7F, -8.4F, 8.2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box480
		bodyModel[81].setRotationPoint(-58.2F, -7.6F, 8.2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box481
		bodyModel[82].setRotationPoint(-58.2F, -7.6F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box482
		bodyModel[83].setRotationPoint(-58.2F, -7.6F, 9.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box490
		bodyModel[84].setRotationPoint(-57.7F, -8F, -0.8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box491
		bodyModel[85].setRotationPoint(-60.5F, -8F, -0.2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.35F, 0F); // Import Box500
		bodyModel[86].setRotationPoint(-63F, -8F, 0.8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 4F, -0.3F, 2F, -0.2F, -0.3F, 2F, -0.2F, 0F, 0F, 4F, 0F, 0F, -1F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, -1F, 0F); // Import Box484
		bodyModel[87].setRotationPoint(42.3F, -7.4F, 8.2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box485
		bodyModel[88].setRotationPoint(46.8F, -6.6F, 8.2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box486
		bodyModel[89].setRotationPoint(46.8F, -6.6F, 9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 4F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F); // Import Box487
		bodyModel[90].setRotationPoint(42.3F, -7.4F, -7.1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box488
		bodyModel[91].setRotationPoint(46.8F, -6.6F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Import Box489
		bodyModel[92].setRotationPoint(46.8F, -6.6F, -8.1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Import Box469
		bodyModel[93].setRotationPoint(34F, -21F, 23.8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Import Box470
		bodyModel[94].setRotationPoint(34F, -21F, 16.8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Import Box472
		bodyModel[95].setRotationPoint(34F, -21.6F, 16.8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box952
		bodyModel[96].setRotationPoint(32F, -20.25F, 21F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box953
		bodyModel[97].setRotationPoint(32F, -19.25F, 21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Import Box954
		bodyModel[98].setRotationPoint(32F, -18.25F, 21F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Import Box816
		bodyModel[99].setRotationPoint(32F, -18.25F, 17.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box817
		bodyModel[100].setRotationPoint(32F, -19.25F, 17.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box818
		bodyModel[101].setRotationPoint(32F, -20.25F, 17.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Import Box828
		bodyModel[102].setRotationPoint(31F, -21.6F, 22.3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Import Box829
		bodyModel[103].setRotationPoint(29F, -19.53F, 22.3F);
		bodyModel[103].rotateAngleZ = 0.78539816F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Import Box830
		bodyModel[104].setRotationPoint(31F, -21.6F, 18.3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Import Box831
		bodyModel[105].setRotationPoint(29F, -19.53F, 18.3F);
		bodyModel[105].rotateAngleZ = 0.78539816F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Import Box422
		bodyModel[106].setRotationPoint(37F, -15.25F, -11.1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box436
		bodyModel[107].setRotationPoint(-51.5F, -19F, 26.7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box437
		bodyModel[108].setRotationPoint(-62F, -19.25F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box438
		bodyModel[109].setRotationPoint(-62F, -19.25F, 11.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box439
		bodyModel[110].setRotationPoint(-62F, -19.25F, 16F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box442
		bodyModel[111].setRotationPoint(-63.5F, -19F, 11.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box444
		bodyModel[112].setRotationPoint(-57F, -21.25F, -9.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box445
		bodyModel[113].setRotationPoint(-44F, -21.25F, -9.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box446
		bodyModel[114].setRotationPoint(-29F, -21.25F, -9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box447
		bodyModel[115].setRotationPoint(-29F, -21.25F, 9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box448
		bodyModel[116].setRotationPoint(-29F, -22.25F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		bodyModel[117].setRotationPoint(-32.5F, -21F, -16F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box453
		bodyModel[118].setRotationPoint(-44F, -21.25F, 10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box454
		bodyModel[119].setRotationPoint(-44F, -21.25F, -2.5F);

		bodyModel[120].addShapeBox(-20F, -16F, 7F, 6, 10, 8, 0F,0F, -1F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		bodyModel[120].setRotationPoint(43F, -5F, -17F);

		bodyModel[121].addShapeBox(-20F, -16F, 7F, 2, 2, 4, 0F,-0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box458
		bodyModel[121].setRotationPoint(46F, -6F, -15F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, -0.5F, 0F, 0F, -0.5F); // Import Box455
		bodyModel[122].setRotationPoint(45F, -16.25F, -17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box456
		bodyModel[123].setRotationPoint(28F, -16.25F, -17.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, 2F, 0F, -0.5F); // Import Box457
		bodyModel[124].setRotationPoint(50F, -14.25F, -17.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, -0.5F, 0F, 0F, -0.5F); // Import Box458
		bodyModel[125].setRotationPoint(45F, -16.25F, 19F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box459
		bodyModel[126].setRotationPoint(28F, -16.25F, 19F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, 2F, 0F, -0.5F); // Import Box460
		bodyModel[127].setRotationPoint(50F, -14.25F, 19F);

		bodyModel[128].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box461
		bodyModel[128].setRotationPoint(-2.5F, -10F, 28.25F);

		bodyModel[129].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box462
		bodyModel[129].setRotationPoint(-29.5F, -10F, 28.25F);

		bodyModel[130].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box463
		bodyModel[130].setRotationPoint(24.5F, -10F, 28.25F);

		bodyModel[131].addShapeBox(-5.75F, -6F, -7F, 14, 4, 5, 0F,-4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		bodyModel[131].setRotationPoint(-54.5F, -6.5F, 20.75F);

		bodyModel[132].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Import Box182
		bodyModel[132].setRotationPoint(-54.5F, -6.5F, 20.75F);

		bodyModel[133].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box183
		bodyModel[133].setRotationPoint(-54.5F, -6.5F, 20.75F);

		bodyModel[134].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Import Box185
		bodyModel[134].setRotationPoint(-54.5F, -6.5F, -11.75F);

		bodyModel[135].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box186
		bodyModel[135].setRotationPoint(-54.5F, -6.5F, -11.75F);

		bodyModel[136].addShapeBox(-5.75F, 2F, -7F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box398
		bodyModel[136].setRotationPoint(39.5F, -6.5F, 21.5F);

		bodyModel[137].addBox(-5.75F, -2F, -7F, 14, 4, 3, 0F); // Import Box399
		bodyModel[137].setRotationPoint(39.5F, -6.5F, 21.5F);

		bodyModel[138].addBox(-5.75F, -2F, -7F, 14, 4, 3, 0F); // Import Box401
		bodyModel[138].setRotationPoint(39.5F, -6.5F, -8.5F);

		bodyModel[139].addShapeBox(-5.75F, 2F, -7F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box402
		bodyModel[139].setRotationPoint(39.5F, -6.5F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 84, 5, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 13F, 0F, 0F, 7F, 0F, 1F, 0F, 0F, 1F); // Box 3
		bodyModel[140].setRotationPoint(-57.5F, -20.25F, 17.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[141].setRotationPoint(-47.5F, -20.25F, -25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 27, 5, 3, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[142].setRotationPoint(-47.5F, -20.25F, -28F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6
		bodyModel[143].setRotationPoint(-51.5F, -19F, -27.7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 21, 24, 6, 0F,0F, -2F, 0F, 3F, -12.5F, 0F, 4F, -12F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 3F, -11F, 0F, 4F, -11F, 0F, -7F, 0F, 0F); // Box 7
		bodyModel[144].setRotationPoint(27F, -22.25F, -15.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 84, 5, 10, 0F,0F, 0F, -5F, -1F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 1F, 13F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[145].setRotationPoint(-57.5F, -20.25F, -25.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 14
		bodyModel[146].setRotationPoint(34F, -21F, -22.8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 15
		bodyModel[147].setRotationPoint(34F, -21F, -15.8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Box 16
		bodyModel[148].setRotationPoint(34F, -21.6F, -22.8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 17
		bodyModel[149].setRotationPoint(32F, -20.25F, -22F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 18
		bodyModel[150].setRotationPoint(32F, -19.25F, -22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 19
		bodyModel[151].setRotationPoint(32F, -18.25F, -22F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 20
		bodyModel[152].setRotationPoint(32F, -18.25F, -18.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 21
		bodyModel[153].setRotationPoint(32F, -19.25F, -18.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 22
		bodyModel[154].setRotationPoint(32F, -20.25F, -18.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 23
		bodyModel[155].setRotationPoint(31F, -21.6F, -21.3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 24
		bodyModel[156].setRotationPoint(29F, -19.53F, -17.3F);
		bodyModel[156].rotateAngleZ = 0.78539816F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 25
		bodyModel[157].setRotationPoint(31F, -21.6F, -17.3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 26
		bodyModel[158].setRotationPoint(29F, -19.53F, -17.3F);
		bodyModel[158].rotateAngleZ = 0.78539816F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 30
		bodyModel[159].setRotationPoint(37F, -15.25F, 10.1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, -4F, -4.5F, 4F, 2F, -4.5F, 4F, 2F, 0F, 0F, -4F, 0F, -1F, 3F, -4.5F, 4F, -2F, -4.5F, 4F, -2F, 0F, -1F, 3F, 0F); // Box 35
		bodyModel[160].setRotationPoint(-64F, -13.25F, -32.5F);

		bodyModel[161].addShapeBox(-5.75F, -6F, 7F, 14, 4, 5, 0F,-4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[161].setRotationPoint(-54.5F, -6.5F, -25.75F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Import Box199
		turretModel[1] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Import Box200
		turretModel[2] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import Box201
		turretModel[3] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import Box224
		turretModel[4] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Import Box225
		turretModel[5] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Import Box226
		turretModel[6] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import Box227
		turretModel[7] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import Box228
		turretModel[8] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import Box229
		turretModel[9] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Import Box231
		turretModel[10] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Import Box232
		turretModel[11] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box233
		turretModel[12] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box234
		turretModel[13] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Box236
		turretModel[14] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Import Box237
		turretModel[15] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Import Box238
		turretModel[16] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Import Box239
		turretModel[17] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import Box240
		turretModel[18] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Import Box242
		turretModel[19] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Import Box243
		turretModel[20] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Import Box244
		turretModel[21] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Import Box245
		turretModel[22] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import Box246
		turretModel[23] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Import Box249
		turretModel[24] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box251
		turretModel[25] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box252
		turretModel[26] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import Box253
		turretModel[27] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box254
		turretModel[28] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box255
		turretModel[29] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box256
		turretModel[30] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import Box257
		turretModel[31] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box258
		turretModel[32] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Import Box296
		turretModel[33] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Box297
		turretModel[34] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Import Box298
		turretModel[35] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box299
		turretModel[36] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box614
		turretModel[37] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box615
		turretModel[38] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import Box616
		turretModel[39] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box617
		turretModel[40] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import Box622
		turretModel[41] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Import Box651
		turretModel[42] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box317
		turretModel[43] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import Box318
		turretModel[44] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box319
		turretModel[45] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box320
		turretModel[46] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box321
		turretModel[47] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import Box322
		turretModel[48] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Import Box323
		turretModel[49] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import Box324
		turretModel[50] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import Box325
		turretModel[51] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import Box326
		turretModel[52] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box327
		turretModel[53] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box328
		turretModel[54] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box329
		turretModel[55] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Import Box330
		turretModel[56] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Box331
		turretModel[57] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import Box332
		turretModel[58] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box333
		turretModel[59] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Box334
		turretModel[60] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box335
		turretModel[61] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import Box336
		turretModel[62] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box337
		turretModel[63] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Import Box338
		turretModel[64] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box339
		turretModel[65] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Box345
		turretModel[66] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Import Box346
		turretModel[67] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import Box347
		turretModel[68] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Import Box348
		turretModel[69] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box349
		turretModel[70] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import Box350
		turretModel[71] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import Box351
		turretModel[72] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import Box352
		turretModel[73] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box353
		turretModel[74] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box354
		turretModel[75] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box671
		turretModel[76] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import Box672
		turretModel[77] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import Box673
		turretModel[78] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box363
		turretModel[79] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box364
		turretModel[80] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box365
		turretModel[81] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import Box366
		turretModel[82] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Import Box367
		turretModel[83] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Box368
		turretModel[84] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box369
		turretModel[85] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Import Box655
		turretModel[86] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box656
		turretModel[87] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box657
		turretModel[88] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import Box373
		turretModel[89] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Import Box374
		turretModel[90] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box375
		turretModel[91] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Import Box376
		turretModel[92] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box377
		turretModel[93] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box378
		turretModel[94] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Import Box379
		turretModel[95] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Import Box380
		turretModel[96] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box381
		turretModel[97] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Import Box382
		turretModel[98] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import Box383
		turretModel[99] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Import Box384
		turretModel[100] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import Box385
		turretModel[101] = new ModelRendererTurbo(this, 529, 233, textureX, textureY); // Box 2
		turretModel[102] = new ModelRendererTurbo(this, 897, 241, textureX, textureY); // Box 9
		turretModel[103] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 10
		turretModel[104] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 11
		turretModel[105] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 13

		turretModel[0].addShapeBox(-6.75F, 0.25F, -18.5F, 13, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box199
		turretModel[0].setRotationPoint(1F, -21.5F, 1F);

		turretModel[1].addShapeBox(-18.75F, 0.25F, -18.5F, 12, 2, 37, 0F,-0.5F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, -0.5F, -12F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -12F); // Import Box200
		turretModel[1].setRotationPoint(1F, -21.5F, 1F);

		turretModel[2].addShapeBox(6.25F, 0.25F, -18.5F, 12, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, -0.5F, 0F); // Import Box201
		turretModel[2].setRotationPoint(1F, -21.5F, 1F);

		turretModel[3].addShapeBox(-6.75F, -11.25F, -20.25F, 6, 5, 41, 0F,0F, 0.5F, -4F, 0F, 0.5F, -4.5F, 0F, 0.5F, -6.25F, 0F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box224
		turretModel[3].setRotationPoint(1F, -21.5F, 1F);

		turretModel[4].addShapeBox(-0.75F, -11.25F, -20.25F, 7, 5, 41, 0F,0F, 0.5F, -4.5F, 0F, 0.5F, -5F, 0F, 0.5F, -6.75F, 0F, 0.5F, -6.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box225
		turretModel[4].setRotationPoint(1F, -21.5F, 1F);

		turretModel[5].addShapeBox(6.25F, -11.25F, -19.25F, 7, 5, 39, 0F,0F, 0.5F, -4F, -1F, 0.5F, -6F, -1F, 0.5F, -6.75F, 0F, 0.5F, -5.75F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0.5F); // Import Box226
		turretModel[5].setRotationPoint(1F, -21.5F, 1F);

		turretModel[6].addShapeBox(13.25F, -4.25F, -17.5F, 5, 4, 35, 0F,0F, 1F, -1.25F, 0F, 1.24F, -7F, 0F, 1.24F, -6.5F, 0F, 1F, -1.25F, 0F, 2.5F, -1.25F, 0F, 3.25F, -6.25F, 0F, 3.25F, -5.5F, 0F, 2.5F, -1.25F); // Import Box227
		turretModel[6].setRotationPoint(1F, -22.5F, 1F);

		turretModel[7].addShapeBox(13.25F, -11.75F, -17.5F, 5, 5, 35, 0F,1F, 0F, -4.25F, 0F, -1.5F, -9.5F, 0F, -1.5F, -9F, 1F, 0F, -4.5F, 0F, 0.5F, -1F, 0F, 0.25F, -7F, 0F, 0.25F, -6.5F, 0F, 0.5F, -0.95F); // Import Box228
		turretModel[7].setRotationPoint(1F, -21.5F, 1F);

		turretModel[8].addShapeBox(12.25F, -15.75F, -7.75F, 6, 5, 16, 0F,1F, -1.3F, 4F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 1F, -1.3F, 4F, 0F, -2F, 5.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -2F, 4.75F); // Import Box229
		turretModel[8].setRotationPoint(1F, -20.5F, 1F);

		turretModel[9].addShapeBox(6.25F, -15.75F, -15.25F, 6, 3, 29, 0F,0F, -1F, -1F, -2.5F, -1F, -2F, -2.5F, -1F, -0.5F, 0F, -1F, -0.25F, 0F, 0F, 0F, -1F, 0F, -1.67F, -1F, 0F, -0.59F, 0F, 0F, 0.25F); // Import Box231
		turretModel[9].setRotationPoint(1F, -20.5F, 1F);

		turretModel[10].addShapeBox(11.75F, -15.75F, -13.25F, 1, 3, 26, 0F,2F, -1F, 0F, -1.5F, -1.3F, -1.5F, -1.5F, -1.3F, -0.5F, 2F, -1F, 0.5F, 0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.41F); // Import Box232
		turretModel[10].setRotationPoint(1F, -20.5F, 1F);

		turretModel[11].addShapeBox(-0.75F, -15.75F, -20.25F, 7, 2, 41, 0F,0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -7.25F, -1F, 0F, -7F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, 0F, -6.75F, 0F, 0F, -6.25F); // Import Box233
		turretModel[11].setRotationPoint(1F, -19.5F, 1F);

		turretModel[12].addShapeBox(-6.75F, -15.75F, -20.25F, 7, 2, 41, 0F,0F, 0F, -4F, -1F, 0F, -5.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, -1F, 0F, -4.5F, -1F, 0F, -6.25F, 0F, 0F, -5.5F); // Import Box234
		turretModel[12].setRotationPoint(1F, -19.5F, 1F);

		turretModel[13].addShapeBox(-13.75F, -11.75F, -18.5F, 7, 5, 37, 0F,0.5F, 1F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -3.25F, 0.5F, 1F, -5.5F, 0.5F, 1F, -1.25F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0.5F, 1F, -3F); // Import Box236
		turretModel[13].setRotationPoint(1F, -21.5F, 1F);

		turretModel[14].addShapeBox(-18.75F, -2.75F, -13.5F, 4, 3, 25, 0F,0.5F, 0F, -4F, 0.5F, 0F, 3.75F, 0.5F, 0F, 4F, 0.5F, 0F, -2F, -0.5F, 0F, -3F, 1F, 0F, 4F, 1F, 0F, 4F, -0.5F, 0F, -2F); // Import Box237
		turretModel[14].setRotationPoint(1F, -20.5F, 1F);

		turretModel[15].addShapeBox(-18.75F, -4.75F, -13.5F, 4, 2, 25, 0F,2.5F, -0.5F, -1.5F, 0.5F, -0.5F, 3.61F, 0.5F, -0.5F, 3.67F, 2.5F, -0.5F, 0.25F, 0.5F, 0F, -4F, 0.5F, 0F, 3.75F, 0.5F, 0F, 4F, 0.5F, 0F, -2F); // Import Box238
		turretModel[15].setRotationPoint(1F, -20.5F, 1F);

		turretModel[16].addShapeBox(-34.5F, -14.75F, -10.5F, 15, 8, 21, 0F,0.5F, -1.5F, -3F, 0.5F, -0.5F, 0F, 3.75F, -0.5F, 1.25F, 0.5F, -1.5F, -3F, 0.5F, -3F, 0.5F, 0F, -2.25F, 3.5F, -0.5F, -2.25F, 3.25F, 0.5F, -3F, 0.5F); // Import Box239
		turretModel[16].setRotationPoint(1F, -19.5F, 1F);

		turretModel[17].addShapeBox(-33F, -16.25F, -10.5F, 14, 3, 21, 0F,1F, -1.5F, -5F, 0F, -0.5F, -2F, 3.25F, -0.25F, -0.75F, 1F, -1.5F, -5F, 2F, 0F, -3F, 0F, -1F, 0F, 3.25F, -1F, 1.25F, 2F, 0F, -3F); // Import Box240
		turretModel[17].setRotationPoint(1F, -19.5F, 1F);

		turretModel[18].addShapeBox(-34.5F, -5.75F, -10.5F, 15, 1, 21, 0F,0.5F, 3F, 0.5F, 0F, 2.25F, 3.5F, -0.5F, 2.25F, 3.25F, 0.5F, 3F, 0.5F, -1.5F, 0.5F, -1.5F, -1.75F, 0.5F, 1.5F, -1.75F, 0.5F, 1.25F, -1.5F, 0.5F, -1.5F); // Import Box242
		turretModel[18].setRotationPoint(1F, -20.5F, 1F);

		turretModel[19].addShapeBox(-13.75F, -15.75F, -18.5F, 7, 2, 37, 0F,0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -4.75F, 0.5F, 0F, -8F, 0.5F, -1F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -3.25F, 0.5F, -1F, -5.5F); // Import Box243
		turretModel[19].setRotationPoint(1F, -19.5F, 1F);

		turretModel[20].addShapeBox(-19F, -6.25F, -16.5F, 5, 2, 31, 0F,0.5F, 1.75F, -2.5F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 1F, 1.75F, -0.75F, 2.25F, 0F, -4.5F, -0.25F, 0F, 0.61F, -0.25F, 0F, 0.67F, 2.25F, 0F, -2.74F); // Import Box244
		turretModel[20].setRotationPoint(1F, -20.5F, 1F);

		turretModel[21].addShapeBox(-18.25F, -13.75F, -16F, 4, 8, 29, 0F,0.75F, 0.5F, -5.5F, 0F, 0F, 0.25F, 0F, 0F, 0.01F, -2.5F, 0.5F, -1.25F, 1.25F, -2.25F, -2F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 1.75F, -2.25F, 0.75F); // Import Box245
		turretModel[21].setRotationPoint(1F, -20.5F, 1F);

		turretModel[22].addShapeBox(-15.75F, -15.75F, -18.5F, 2, 1, 31, 0F,3.25F, 0F, -10F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, 0.25F, -2.75F, 3.25F, -0.5F, -8F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.75F); // Import Box246
		turretModel[22].setRotationPoint(1F, -19.5F, 1F);

		turretModel[23].addShapeBox(-14.25F, -17.75F, -16.25F, 8, 7, 15, 0F,-0.5F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		turretModel[23].setRotationPoint(1F, -19.5F, 1F);

		turretModel[24].addShapeBox(-17.75F, -17.75F, -16.25F, 4, 2, 15, 0F,-1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F, 0.25F, 0F, -6F, -0.22F, 0F, -0.6F, -0.5F, 0F, 0F, 0.25F, 0F, -5.5F); // Import Box251
		turretModel[24].setRotationPoint(1F, -19.5F, 1F);

		turretModel[25].addShapeBox(-7.25F, -17.75F, -18.25F, 5, 7, 17, 0F,-0.5F, 0F, 0F, -0.5F, 0.75F, -2F, -0.5F, 0.75F, -3F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F); // Import Box252
		turretModel[25].setRotationPoint(1F, -19.5F, 1F);

		turretModel[26].addShapeBox(-3.25F, -17.75F, -15.25F, 4, 7, 11, 0F,-0.5F, 0.75F, 1F, -0.5F, 0.75F, -3F, -0.5F, 0.75F, -3F, -0.5F, 0.75F, 0F, -0.5F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 1F); // Import Box253
		turretModel[26].setRotationPoint(1F, -19.5F, 1F);

		turretModel[27].addShapeBox(-14.25F, -18.75F, -15.25F, 4, 1, 13, 0F,-0.5F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box254
		turretModel[27].setRotationPoint(1F, -19.5F, 1F);

		turretModel[28].addShapeBox(-10.25F, -18.75F, -15.25F, 4, 1, 13, 0F,0F, 0.5F, 1F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 1F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box255
		turretModel[28].setRotationPoint(1F, -19.5F, 1F);

		turretModel[29].addShapeBox(-17.75F, -18.75F, -16.25F, 4, 1, 15, 0F,-1.5F, 0.5F, -6F, 0F, 0.5F, -2F, 0F, 0.5F, -1.75F, -1.5F, 0.5F, -6F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F); // Import Box256
		turretModel[29].setRotationPoint(1F, -19.5F, 1F);

		turretModel[30].addShapeBox(-6.75F, -18.75F, -17.25F, 5, 1, 15, 0F,0F, 0.5F, -0.75F, -0.5F, 0.5F, -2.75F, -0.5F, 0.5F, -2.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.75F, 0F, 0F, -0.75F); // Import Box257
		turretModel[30].setRotationPoint(1F, -19.5F, 1F);

		turretModel[31].addShapeBox(-2.75F, -18.75F, -12.5F, 3, 1, 8, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F); // Import Box258
		turretModel[31].setRotationPoint(1F, -19.5F, 1F);

		turretModel[32].addShapeBox(-10.25F, -15.75F, 13F, 3, 5, 2, 0F,0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -2F); // Import Box296
		turretModel[32].setRotationPoint(1F, -20.5F, 1F);

		turretModel[33].addShapeBox(-10.25F, -15.75F, 13F, 3, 4, 2, 0F,0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box297
		turretModel[33].setRotationPoint(1F, -20.5F, 1F);

		turretModel[34].addShapeBox(-4.25F, -15.75F, 13.75F, 5, 6, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, 0.5F); // Import Box298
		turretModel[34].setRotationPoint(1F, -20.5F, 1F);

		turretModel[35].addShapeBox(-6.45F, -15.75F, 13.75F, 2, 6, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.8F, 0F, -0.75F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.1F, 0F, -0.75F); // Import Box299
		turretModel[35].setRotationPoint(1F, -20.5F, 1F);

		turretModel[36].addShapeBox(-4F, -16.5F, 5F, 3, 10, 9, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F); // Import Box614
		turretModel[36].setRotationPoint(1F, -20.5F, 1F);

		turretModel[37].addShapeBox(-6F, -16.5F, 5F, 2, 10, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box615
		turretModel[37].setRotationPoint(1F, -20.5F, 1F);

		turretModel[38].addShapeBox(-7F, -16.5F, 5F, 1, 10, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Import Box616
		turretModel[38].setRotationPoint(1F, -20.5F, 1F);

		turretModel[39].addShapeBox(-1F, -16.5F, 6.5F, 1, 10, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box617
		turretModel[39].setRotationPoint(1F, -20.5F, 1F);

		turretModel[40].addShapeBox(-7.5F, -16.5F, 6F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box622
		turretModel[40].setRotationPoint(1F, -20.65F, 1F);

		turretModel[41].addShapeBox(-7.5F, -16.5F, 11F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box651
		turretModel[41].setRotationPoint(1F, -20.65F, 1F);

		turretModel[42].addShapeBox(-32.75F, -7.5F, 18F, 26, 1, 1, 0F,0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F); // Import Box317
		turretModel[42].setRotationPoint(1F, -20.5F, 1F);

		turretModel[43].addShapeBox(-32.75F, -7.5F, 19.25F, 26, 1, 1, 0F,0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F); // Import Box318
		turretModel[43].setRotationPoint(1F, -20.5F, 1F);

		turretModel[44].addShapeBox(-33.5F, -7.5F, 10F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F); // Import Box319
		turretModel[44].setRotationPoint(1F, -20.5F, 1F);

		turretModel[45].addShapeBox(-20.5F, -7.5F, 12.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box320
		turretModel[45].setRotationPoint(1F, -20.5F, 1F);

		turretModel[46].addShapeBox(-7.5F, -7.5F, 15.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box321
		turretModel[46].setRotationPoint(1F, -20.5F, 1F);

		turretModel[47].addShapeBox(3.5F, -7.5F, 15.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box322
		turretModel[47].setRotationPoint(1F, -20.5F, 1F);

		turretModel[48].addShapeBox(-6.75F, -7.5F, 19.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F); // Import Box323
		turretModel[48].setRotationPoint(1F, -20.5F, 1F);

		turretModel[49].addShapeBox(-6.75F, -7.5F, 18.5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F); // Import Box324
		turretModel[49].setRotationPoint(1F, -20.5F, 1F);

		turretModel[50].addShapeBox(0.25F, -7.5F, 20.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Import Box325
		turretModel[50].setRotationPoint(1F, -20.5F, 1F);

		turretModel[51].addShapeBox(0.25F, -7.5F, 19.5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Import Box326
		turretModel[51].setRotationPoint(1F, -20.5F, 1F);

		turretModel[52].addShapeBox(-2.75F, -7.5F, 19.5F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box327
		turretModel[52].setRotationPoint(1F, -20.5F, 1F);

		turretModel[53].addShapeBox(-2.75F, -7.5F, 20.75F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box328
		turretModel[53].setRotationPoint(1F, -20.5F, 1F);

		turretModel[54].addShapeBox(4.25F, -7.5F, 19.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F); // Import Box329
		turretModel[54].setRotationPoint(1F, -20.5F, 1F);

		turretModel[55].addShapeBox(8.25F, -7.5F, 16.75F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F); // Import Box330
		turretModel[55].setRotationPoint(1F, -20.5F, 1F);

		turretModel[56].addShapeBox(-10.75F, -9.1F, -19.25F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box331
		turretModel[56].setRotationPoint(1F, -20.5F, 1F);

		turretModel[57].addShapeBox(-10.75F, -9.1F, -21F, 16, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box332
		turretModel[57].setRotationPoint(1F, -20.5F, 1F);

		turretModel[58].addShapeBox(3.5F, -9.1F, -20.75F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box333
		turretModel[58].setRotationPoint(1F, -20.5F, 1F);

		turretModel[59].addShapeBox(6.75F, -9.1F, -20.75F, 1, 1, 5, 0F,1.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box334
		turretModel[59].setRotationPoint(1F, -20.5F, 1F);

		turretModel[60].addShapeBox(-14.75F, -9.1F, -19.25F, 4, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F); // Import Box335
		turretModel[60].setRotationPoint(1F, -20.5F, 1F);

		turretModel[61].addShapeBox(-14.75F, -9.1F, -21F, 4, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F); // Import Box336
		turretModel[61].setRotationPoint(1F, -20.5F, 1F);

		turretModel[62].addShapeBox(-16.75F, -9.1F, -18.25F, 2, 1, 1, 0F,0.25F, -0.25F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F, 0.25F, -0.25F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F); // Import Box337
		turretModel[62].setRotationPoint(1F, -20.5F, 1F);

		turretModel[63].addShapeBox(-17.75F, -9.1F, -20F, 3, 1, 1, 0F,-0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F, -0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F); // Import Box338
		turretModel[63].setRotationPoint(1F, -20.5F, 1F);

		turretModel[64].addShapeBox(-10.5F, -9.1F, -23.15F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box339
		turretModel[64].setRotationPoint(1F, -20.5F, 1F);
		turretModel[64].rotateAngleY = -0.38397244F;

		turretModel[65].addShapeBox(-45F, -12.75F, -8F, 9, 5, 16, 0F,0F, 0.25F, 2F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 2F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F); // Import Box345
		turretModel[65].setRotationPoint(1F, -17.5F, 1F);

		turretModel[66].addShapeBox(-45F, -14.25F, -8F, 9, 3, 16, 0F,0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 2F); // Import Box346
		turretModel[66].setRotationPoint(1F, -19.5F, 1F);

		turretModel[67].addShapeBox(-37F, -12.75F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		turretModel[67].setRotationPoint(1F, -20.5F, 1F);

		turretModel[68].addShapeBox(-37F, -6.75F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box348
		turretModel[68].setRotationPoint(1F, -20.5F, 1F);

		turretModel[69].addShapeBox(-37F, -6.75F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[69].setRotationPoint(1F, -20.5F, 1F);

		turretModel[70].addShapeBox(-37F, -12.75F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		turretModel[70].setRotationPoint(1F, -20.5F, 1F);

		turretModel[71].addShapeBox(-37F, -12.75F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box351
		turretModel[71].setRotationPoint(1F, -20.5F, 1F);

		turretModel[72].addShapeBox(-37F, -6.75F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box352
		turretModel[72].setRotationPoint(1F, -20.5F, 1F);

		turretModel[73].addShapeBox(-20F, -16.5F, 7F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		turretModel[73].setRotationPoint(1F, -20.5F, 1F);

		turretModel[74].addShapeBox(-32F, -16F, 5F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		turretModel[74].setRotationPoint(1F, -20.5F, 1F);

		turretModel[75].addShapeBox(2.25F, -17.75F, -14.3F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Import Box671
		turretModel[75].setRotationPoint(1F, -19.5F, 2F);

		turretModel[76].addShapeBox(2.25F, -17.75F, -7.8F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Import Box672
		turretModel[76].setRotationPoint(1F, -19.5F, 1F);

		turretModel[77].addShapeBox(2.25F, -18.4F, -12.55F, 3, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Import Box673
		turretModel[77].setRotationPoint(1F, -19.5F, 1F);

		turretModel[78].addShapeBox(-5.75F, -20.5F, -12.3F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Import Box363
		turretModel[78].setRotationPoint(1F, -20.5F, 1F);

		turretModel[79].addShapeBox(-5.75F, -20.5F, -5.8F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Import Box364
		turretModel[79].setRotationPoint(1F, -20.5F, 1F);

		turretModel[80].addShapeBox(-5.75F, -21.15F, -11.55F, 3, 1, 6, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Import Box365
		turretModel[80].setRotationPoint(1F, -20.5F, 1F);

		turretModel[81].addShapeBox(-3.9F, -19.75F, -11.1F, 1, 1, 5, 0F,-0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Import Box366
		turretModel[81].setRotationPoint(1F, -20.5F, 1F);

		turretModel[82].addShapeBox(-5F, -19.75F, -11.1F, 2, 1, 5, 0F,-1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box367
		turretModel[82].setRotationPoint(1F, -21.5F, 1F);

		turretModel[83].addShapeBox(-6F, -18.75F, -11.6F, 3, 9, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box368
		turretModel[83].setRotationPoint(1F, -21.5F, 1F);

		turretModel[84].addShapeBox(-3.5F, -18.75F, -11.6F, 2, 9, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F); // Import Box369
		turretModel[84].setRotationPoint(1F, -20.5F, 1F);

		turretModel[85].addShapeBox(-9.5F, -19.5F, -12.85F, 3, 9, 8, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Import Box655
		turretModel[85].setRotationPoint(1F, -19.5F, 1F);

		turretModel[86].addShapeBox(-13F, -19.5F, -12.85F, 4, 9, 8, 0F,-0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F); // Import Box656
		turretModel[86].setRotationPoint(1F, -19.5F, 1F);

		turretModel[87].addShapeBox(-15.5F, -19.5F, -12.85F, 3, 9, 8, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Import Box657
		turretModel[87].setRotationPoint(1F, -19.5F, 1F);

		turretModel[88].addShapeBox(-18F, -20F, -11.5F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Import Box373
		turretModel[88].setRotationPoint(2F, -19.5F, 1F);

		turretModel[89].addShapeBox(-18F, -20F, -6.5F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Import Box374
		turretModel[89].setRotationPoint(2F, -19.5F, 1F);

		turretModel[90].addShapeBox(-19F, -20F, -11.5F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box375
		turretModel[90].setRotationPoint(2F, -19.5F, 1F);

		turretModel[91].addShapeBox(-19F, -20F, -6.5F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box376
		turretModel[91].setRotationPoint(2F, -19.5F, 1F);

		turretModel[92].addShapeBox(-20F, -18F, -12.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Import Box377
		turretModel[92].setRotationPoint(2F, -19.5F, 1F);

		turretModel[93].addShapeBox(-20F, -18F, -10.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Import Box378
		turretModel[93].setRotationPoint(2F, -19.5F, 1F);

		turretModel[94].addShapeBox(-20F, -18F, -5.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Import Box379
		turretModel[94].setRotationPoint(2F, -19.5F, 1F);

		turretModel[95].addShapeBox(-20F, -18F, -7.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Import Box380
		turretModel[95].setRotationPoint(2F, -19.5F, 1F);

		turretModel[96].addShapeBox(-19F, -18F, -13.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		turretModel[96].setRotationPoint(2F, -19.5F, 1F);

		turretModel[97].addShapeBox(-19F, -18F, -6.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box382
		turretModel[97].setRotationPoint(2F, -19.5F, 1F);

		turretModel[98].addShapeBox(-19F, -18F, -15.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box383
		turretModel[98].setRotationPoint(1F, -20.5F, 1F);

		turretModel[99].addShapeBox(-19F, -18F, -4.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box384
		turretModel[99].setRotationPoint(2F, -19.5F, 1F);

		turretModel[100].addShapeBox(-10.5F, -19.75F, -9.75F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Import Box385
		turretModel[100].setRotationPoint(1F, -19.5F, 1F);

		turretModel[101].addShapeBox(-13.75F, -11.75F, -18.5F, 7, 5, 37, 0F,0.5F, 0F, -1.25F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0.5F, 0F, -3F, 0.5F, 2F, -1.25F, 0F, 2F, 1.75F, 0F, 2F, 1.75F, 0.5F, 2F, -3.25F); // Box 2
		turretModel[101].setRotationPoint(1F, -15.5F, 1F);

		turretModel[102].addShapeBox(-6.75F, -11.25F, -20.25F, 6, 7, 41, 0F,0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F); // Box 9
		turretModel[102].setRotationPoint(1F, -16.5F, 1F);

		turretModel[103].addShapeBox(-0.75F, -11.25F, -20.25F, 7, 7, 41, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 10
		turretModel[103].setRotationPoint(1F, -16.5F, 1F);

		turretModel[104].addShapeBox(6.25F, -11.25F, -19.25F, 7, 7, 39, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, -3F, 0F, 0.5F, -3.5F, 0F, 0.5F, 0.5F); // Box 11
		turretModel[104].setRotationPoint(1F, -16.5F, 1F);

		turretModel[105].addShapeBox(-32F, -16F, 5F, 1, 5, 1, 0F,0.6F, 40F, -0.4F, -1.4F, 40F, -0.4F, -1.4F, 40F, -0.4F, 0.6F, 40F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 13
		turretModel[105].setRotationPoint(2F, -24.5F, 2F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Import Box606
		barrelModel[1] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Import Box607
		barrelModel[2] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import Box608
		barrelModel[3] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box265
		barrelModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box266
		barrelModel[5] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box269
		barrelModel[6] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import Box270
		barrelModel[7] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box271
		barrelModel[8] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box272
		barrelModel[9] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import Box273
		barrelModel[10] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box274
		barrelModel[11] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box275
		barrelModel[12] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import Box276
		barrelModel[13] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box277
		barrelModel[14] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box278
		barrelModel[15] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box279
		barrelModel[16] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box280
		barrelModel[17] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import Box282
		barrelModel[18] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Import Box283
		barrelModel[19] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import Box284
		barrelModel[20] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Import Box286
		barrelModel[21] = new ModelRendererTurbo(this, 689, 185, textureX, textureY); // Import Box287
		barrelModel[22] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Import Box288
		barrelModel[23] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Import Box289
		barrelModel[24] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Import Box290
		barrelModel[25] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box291
		barrelModel[26] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box293
		barrelModel[27] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Import Box294
		barrelModel[28] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box295

		barrelModel[0].addShapeBox(3F, -0.6F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Import Box606
		barrelModel[0].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[1].addShapeBox(3F, -1.4F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Import Box607
		barrelModel[1].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[2].addShapeBox(3F, 0.2F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Import Box608
		barrelModel[2].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[3].addShapeBox(43F, 1.4F, -1.75F, 12, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box265
		barrelModel[3].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[4].addShapeBox(43F, 0.6F, -1.75F, 12, 1, 3, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box266
		barrelModel[4].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[5].addShapeBox(43F, 2.2F, -1.75F, 12, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Import Box269
		barrelModel[5].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[6].addShapeBox(56F, 0.6F, -1.75F, 3, 1, 3, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box270
		barrelModel[6].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[7].addShapeBox(56F, 1.4F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box271
		barrelModel[7].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[8].addShapeBox(56F, 2.2F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Import Box272
		barrelModel[8].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[9].addShapeBox(58F, -1.4F, -4F, 3, 1, 7, 0F,-1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F); // Import Box273
		barrelModel[9].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[10].addShapeBox(58F, -0.6F, -4F, 3, 1, 7, 0F,-0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F); // Import Box274
		barrelModel[10].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[11].addShapeBox(58F, 0.2F, -4F, 3, 1, 7, 0F,-0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F); // Import Box275
		barrelModel[11].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[12].addShapeBox(58F, -0.6F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Import Box276
		barrelModel[12].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[13].addShapeBox(58F, -1.4F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Import Box277
		barrelModel[13].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[14].addShapeBox(58F, 0.2F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Import Box278
		barrelModel[14].setRotationPoint(18.5F, -26F, 1.5F);

		barrelModel[15].addShapeBox(8.5F, 0.6F, -1.75F, 7, 1, 3, 0F,0F, 0.5F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0.5F, -0.95F, 0F, -0.3F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, 0.5F); // Import Box279
		barrelModel[15].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[16].addShapeBox(8.5F, 1.4F, -1.75F, 7, 1, 3, 0F,0F, 0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.5F); // Import Box280
		barrelModel[16].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[17].addShapeBox(3F, 0F, -9.75F, 4, 3, 19, 0F,-0.25F, -0.5F, 0.25F, -0.5F, -1F, -7.5F, -0.5F, -1F, -7.5F, -0.25F, -0.5F, 0.25F, 0.25F, 1F, -0.25F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, 0.25F, 1F, 0.25F); // Import Box282
		barrelModel[17].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[18].addShapeBox(2F, -3F, -9.75F, 4, 3, 19, 0F,1.25F, 2F, -0.25F, 0.25F, -2.75F, -8.75F, 0.25F, -2.75F, -8.75F, 1.25F, 2F, 0.25F, -1.25F, 0.5F, 0.25F, 0.5F, 1F, -7.5F, 0.5F, 1F, -7.5F, -1.25F, 0.5F, 0.25F); // Import Box283
		barrelModel[18].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[19].addShapeBox(-0.25F, -3F, -9.75F, 1, 2, 19, 0F,0F, 2F, 0.25F, 0F, 2F, -0.25F, 0F, 2F, 0.25F, 0F, 2F, 0.5F, -2.25F, 1.5F, 1F, 2.5F, 1.5F, 0.25F, 2.5F, 1.5F, 0.25F, -2.25F, 1.5F, 1.25F); // Import Box284
		barrelModel[19].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[20].addShapeBox(2F, 0.5F, -10.75F, 1, 3, 21, 0F,0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -0.75F, 0.5F, 0.5F, 0F); // Import Box286
		barrelModel[20].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[21].addShapeBox(1.5F, 4F, -10.75F, 1, 3, 21, 0F,0F, 0F, -0.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, -0.25F, -0.5F, -4.25F, -0.25F, -0.5F, -3.75F, 0.5F, 0F, -2F); // Import Box287
		barrelModel[21].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[22].addShapeBox(2.75F, 4F, -10.75F, 4, 3, 21, 0F,0F, 0F, -1.25F, -0.25F, 1F, -8.5F, -0.25F, 1F, -8.5F, 0F, 0F, -0.75F, 0.5F, -0.5F, -4.25F, -0.5F, -2.75F, -8.8F, -0.5F, -2.75F, -8.8F, 0.5F, -0.5F, -3.75F); // Import Box288
		barrelModel[22].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[23].addShapeBox(8.5F, 2.2F, -1.75F, 7, 1, 3, 0F,0F, -0.3F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, 0.5F, 0F, 0.5F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0.5F, -0.95F); // Import Box289
		barrelModel[23].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[24].addShapeBox(6.5F, 1.4F, -1.75F, 2, 1, 3, 0F,0F, 0.4F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.6F, 0.5F); // Import Box290
		barrelModel[24].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[25].addShapeBox(6.5F, 0.2F, -1.75F, 2, 1, 3, 0F,0.25F, 0.45F, -0.7F, 0F, 0.1F, -0.95F, 0F, 0.1F, -0.95F, 0.25F, 0.45F, -0.75F, 0F, -0.2F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.2F, 0.5F); // Import Box291
		barrelModel[25].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[26].addShapeBox(6.5F, 2.8F, -1.75F, 2, 1, 3, 0F,0F, -0.2F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.2F, 0.5F, 0.25F, 0.45F, -0.8F, 0F, -0.1F, -0.95F, 0F, -0.1F, -0.95F, 0.25F, 0.45F, -0.8F); // Import Box293
		barrelModel[26].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[27].addShapeBox(-1F, -1.5F, -7.75F, 5, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import Box294
		barrelModel[27].setRotationPoint(18.5F, -28F, 1.5F);

		barrelModel[28].addShapeBox(1F, -1.5F, -7.75F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box295
		barrelModel[28].setRotationPoint(18.5F, -28F, 1.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Import Box523
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Import Box524
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box525
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import Box31
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Import Box32
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box33
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box34
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box35
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Import Box36
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Import Box37
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Import Box38
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import Box39
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box40
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Import Box41
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Import Box42
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Import Box43
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 593, 193, textureX, textureY); // Import Box44
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Import Box45
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Import Box46
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box47
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box48
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Import Box49
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Import Box50
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Import Box51
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Import Box79
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import Box80
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Import Box81
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import Box82
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import Box83
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box84
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Import Box85
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Import Box86
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Import Box87
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Import Box154
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Import Box155
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import Box156

		leftTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box523
		leftTrackWheelModels[0].setRotationPoint(-8F, 2.2F, 28F);

		leftTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box524
		leftTrackWheelModels[1].setRotationPoint(-8F, 2.2F, 28F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box525
		leftTrackWheelModels[2].setRotationPoint(-8F, 2.2F, 28F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		leftTrackWheelModels[3].setRotationPoint(-21.5F, 2.2F, 28F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box32
		leftTrackWheelModels[4].setRotationPoint(-21.5F, 2.2F, 28F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box33
		leftTrackWheelModels[5].setRotationPoint(-21.5F, 2.2F, 28F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		leftTrackWheelModels[6].setRotationPoint(-34.5F, 2.2F, 28F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box35
		leftTrackWheelModels[7].setRotationPoint(-34.5F, 2.2F, 28F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box36
		leftTrackWheelModels[8].setRotationPoint(-34.5F, 2.2F, 28F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		leftTrackWheelModels[9].setRotationPoint(4.75F, 2.2F, 28F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box38
		leftTrackWheelModels[10].setRotationPoint(4.75F, 2.2F, 28F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box39
		leftTrackWheelModels[11].setRotationPoint(4.75F, 2.2F, 28F);

		leftTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		leftTrackWheelModels[12].setRotationPoint(17.75F, 2.2F, 28F);

		leftTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box41
		leftTrackWheelModels[13].setRotationPoint(17.75F, 2.2F, 28F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box42
		leftTrackWheelModels[14].setRotationPoint(17.75F, 2.2F, 28F);

		leftTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		leftTrackWheelModels[15].setRotationPoint(33F, 2.2F, 28F);

		leftTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box44
		leftTrackWheelModels[16].setRotationPoint(33F, 2.2F, 28F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box45
		leftTrackWheelModels[17].setRotationPoint(33F, 2.2F, 28F);

		leftTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		leftTrackWheelModels[18].setRotationPoint(42.75F, -5.8F, 28.25F);

		leftTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box47
		leftTrackWheelModels[19].setRotationPoint(42.75F, -5.8F, 28.25F);

		leftTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box48
		leftTrackWheelModels[20].setRotationPoint(42.75F, -5.8F, 28.25F);

		leftTrackWheelModels[21].addShapeBox(-5.75F, -6F, -7F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		leftTrackWheelModels[21].setRotationPoint(-54.5F, -4.5F, 27.25F);

		leftTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 9, 0F); // Import Box50
		leftTrackWheelModels[22].setRotationPoint(-54.5F, -4.5F, 27.25F);

		leftTrackWheelModels[23].addShapeBox(-5.75F, 2F, -7F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box51
		leftTrackWheelModels[23].setRotationPoint(-54.5F, -4.5F, 27.25F);

		leftTrackWheelModels[24].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box79
		leftTrackWheelModels[24].setRotationPoint(-2.5F, -8F, 27.25F);

		leftTrackWheelModels[25].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box80
		leftTrackWheelModels[25].setRotationPoint(-2.5F, -8F, 27.25F);

		leftTrackWheelModels[26].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box81
		leftTrackWheelModels[26].setRotationPoint(-2.5F, -8F, 27.25F);

		leftTrackWheelModels[27].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box82
		leftTrackWheelModels[27].setRotationPoint(24F, -8F, 27.25F);

		leftTrackWheelModels[28].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box83
		leftTrackWheelModels[28].setRotationPoint(24F, -8F, 27.25F);

		leftTrackWheelModels[29].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box84
		leftTrackWheelModels[29].setRotationPoint(24F, -8F, 27.25F);

		leftTrackWheelModels[30].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box85
		leftTrackWheelModels[30].setRotationPoint(-29.5F, -8F, 27.25F);

		leftTrackWheelModels[31].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box86
		leftTrackWheelModels[31].setRotationPoint(-29.5F, -8F, 27.25F);

		leftTrackWheelModels[32].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box87
		leftTrackWheelModels[32].setRotationPoint(-29.5F, -8F, 27.25F);

		leftTrackWheelModels[33].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box154
		leftTrackWheelModels[33].setRotationPoint(-45F, 1.25F, 27F);

		leftTrackWheelModels[34].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box155
		leftTrackWheelModels[34].setRotationPoint(-45F, 1.25F, 27F);

		leftTrackWheelModels[35].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box156
		leftTrackWheelModels[35].setRotationPoint(-45F, 1.25F, 27F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Import Box52
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Import Box53
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Import Box54
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Import Box55
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Import Box56
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Import Box57
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Import Box58
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Import Box59
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Import Box60
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Import Box61
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box62
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Import Box63
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Import Box64
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Import Box65
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Import Box66
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Import Box67
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Import Box68
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import Box69
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Import Box70
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Import Box71
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 697, 217, textureX, textureY); // Import Box72
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 745, 217, textureX, textureY); // Import Box73
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Import Box74
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 881, 217, textureX, textureY); // Import Box75
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import Box112
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Import Box113
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Import Box114
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Import Box115
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import Box116
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import Box117
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Import Box118
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import Box119
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Import Box120
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Import Box151
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box152
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Import Box153

		rightTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		rightTrackWheelModels[0].setRotationPoint(-54.5F, -4.5F, -19.75F);

		rightTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box53
		rightTrackWheelModels[1].setRotationPoint(-54.5F, -4.5F, -19.75F);

		rightTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box54
		rightTrackWheelModels[2].setRotationPoint(-54.5F, -4.5F, -19.75F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		rightTrackWheelModels[3].setRotationPoint(-34.5F, 2.2F, -19.75F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box56
		rightTrackWheelModels[4].setRotationPoint(-34.5F, 2.2F, -19.75F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box57
		rightTrackWheelModels[5].setRotationPoint(-34.5F, 2.2F, -19.75F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		rightTrackWheelModels[6].setRotationPoint(-21.5F, 2.2F, -19.75F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box59
		rightTrackWheelModels[7].setRotationPoint(-21.5F, 2.2F, -19.75F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box60
		rightTrackWheelModels[8].setRotationPoint(-21.5F, 2.2F, -19.75F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		rightTrackWheelModels[9].setRotationPoint(-8F, 2.2F, -19.75F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box62
		rightTrackWheelModels[10].setRotationPoint(-8F, 2.2F, -19.75F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box63
		rightTrackWheelModels[11].setRotationPoint(-8F, 2.2F, -19.75F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		rightTrackWheelModels[12].setRotationPoint(4.75F, 2.2F, -19.75F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box65
		rightTrackWheelModels[13].setRotationPoint(4.75F, 2.2F, -19.75F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box66
		rightTrackWheelModels[14].setRotationPoint(4.75F, 2.2F, -19.75F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		rightTrackWheelModels[15].setRotationPoint(17.75F, 2.2F, -19.75F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box68
		rightTrackWheelModels[16].setRotationPoint(17.75F, 2.2F, -19.75F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box69
		rightTrackWheelModels[17].setRotationPoint(17.75F, 2.2F, -19.75F);

		rightTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		rightTrackWheelModels[18].setRotationPoint(32.75F, 2.2F, -19.75F);

		rightTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box71
		rightTrackWheelModels[19].setRotationPoint(32.75F, 2.2F, -19.75F);

		rightTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box72
		rightTrackWheelModels[20].setRotationPoint(32.75F, 2.2F, -19.75F);

		rightTrackWheelModels[21].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box73
		rightTrackWheelModels[21].setRotationPoint(42.75F, -5.8F, -19.75F);

		rightTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Import Box74
		rightTrackWheelModels[22].setRotationPoint(42.75F, -5.8F, -19.75F);

		rightTrackWheelModels[23].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		rightTrackWheelModels[23].setRotationPoint(42.75F, -5.8F, -19.75F);

		rightTrackWheelModels[24].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box112
		rightTrackWheelModels[24].setRotationPoint(24F, -8F, -20F);

		rightTrackWheelModels[25].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box113
		rightTrackWheelModels[25].setRotationPoint(24F, -8F, -20F);

		rightTrackWheelModels[26].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box114
		rightTrackWheelModels[26].setRotationPoint(24F, -8F, -20F);

		rightTrackWheelModels[27].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box115
		rightTrackWheelModels[27].setRotationPoint(-2.5F, -8F, -20F);

		rightTrackWheelModels[28].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box116
		rightTrackWheelModels[28].setRotationPoint(-2.5F, -8F, -20F);

		rightTrackWheelModels[29].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box117
		rightTrackWheelModels[29].setRotationPoint(-2.5F, -8F, -20F);

		rightTrackWheelModels[30].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box118
		rightTrackWheelModels[30].setRotationPoint(-29.5F, -8F, -20F);

		rightTrackWheelModels[31].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box119
		rightTrackWheelModels[31].setRotationPoint(-29.5F, -8F, -20F);

		rightTrackWheelModels[32].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box120
		rightTrackWheelModels[32].setRotationPoint(-29.5F, -8F, -20F);

		rightTrackWheelModels[33].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box151
		rightTrackWheelModels[33].setRotationPoint(-45F, 1.25F, -20F);

		rightTrackWheelModels[34].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box152
		rightTrackWheelModels[34].setRotationPoint(-45F, 1.25F, -20F);

		rightTrackWheelModels[35].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Import Box153
		rightTrackWheelModels[35].setRotationPoint(-45F, 1.25F, -20F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Import Box795
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box170
		leftTrackModel[2] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Import Box171
		leftTrackModel[3] = new ModelRendererTurbo(this, 777, 225, textureX, textureY); // Import Box172
		leftTrackModel[4] = new ModelRendererTurbo(this, 913, 225, textureX, textureY); // Import Box173
		leftTrackModel[5] = new ModelRendererTurbo(this, 601, 225, textureX, textureY); // Import Box174
		leftTrackModel[6] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box175
		leftTrackModel[7] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Import Box176
		leftTrackModel[8] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Import Box177
		leftTrackModel[9] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Import Box178
		leftTrackModel[10] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Import Box179
		leftTrackModel[11] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Import Box180

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Import Box795
		leftTrackModel[0].setRotationPoint(-35.5F, 8.6F, 19F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Import Box170
		leftTrackModel[1].setRotationPoint(-37.5F, -12.5F, 19F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0.35F, -0.2F); // Import Box171
		leftTrackModel[2].setRotationPoint(25.5F, -12.5F, 19F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,0F, -0.45F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.45F, -0.2F, 0F, 1.25F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 1.25F, -0.2F); // Import Box172
		leftTrackModel[3].setRotationPoint(-56.5F, -12.5F, 19F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 22, 1, 10, 0F,-1F, 9.25F, -0.2F, 0F, 2.25F, -0.2F, 0F, 2.25F, -0.2F, -1F, 9.25F, -0.2F, -1F, -8.45F, -0.2F, 0F, -1.55F, -0.2F, 0F, -1.55F, -0.2F, -1F, -8.45F, -0.2F); // Import Box173
		leftTrackModel[4].setRotationPoint(-57.5F, 10.5F, 19F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 2.3F, -0.2F, -1.5F, 14.5F, -0.2F, -1.5F, 14.5F, -0.2F, 0F, 2.3F, -0.2F, 0F, -1.55F, -0.2F, -0.5F, -14.45F, -0.2F, -0.5F, -14.45F, -0.2F, 0F, -1.55F, -0.2F); // Import Box174
		leftTrackModel[5].setRotationPoint(35.5F, 10.5F, 19F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 1.35F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0F, 1.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.55F, -0.2F); // Import Box175
		leftTrackModel[6].setRotationPoint(41.5F, -12.5F, 19F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0.55F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0F, -0.2F, -0.35F, 0.55F, -0.2F, -0.35F, 0.55F, -0.2F, 0.55F, 0F, -0.2F); // Import Box176
		leftTrackModel[7].setRotationPoint(49.35F, -7.5F, 19F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,4F, -0.45F, -0.2F, -4.65F, 1.25F, -0.2F, -4.65F, 1.25F, -0.2F, 4F, -0.45F, -0.2F, 0.55F, 0.3F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.3F, -0.2F); // Import Box177
		leftTrackModel[8].setRotationPoint(49.35F, -12F, 19F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Import Box178
		leftTrackModel[9].setRotationPoint(-61.5F, -6.4F, 19F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,-5F, -0.35F, -0.2F, 4F, -2.15F, -0.2F, 4F, -2.15F, -0.2F, -5F, -0.35F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Import Box179
		leftTrackModel[10].setRotationPoint(-61.5F, -12.4F, 19F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, -5F, -0.55F, -0.2F, 4F, -2.3F, -0.2F, 4F, -2.3F, -0.2F, -5F, -0.55F, -0.2F); // Import Box180
		leftTrackModel[11].setRotationPoint(-61.5F, -2.4F, 19F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Import Box187
		rightTrackModel[1] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Import Box188
		rightTrackModel[2] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Import Box189
		rightTrackModel[3] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Import Box190
		rightTrackModel[4] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import Box191
		rightTrackModel[5] = new ModelRendererTurbo(this, 649, 233, textureX, textureY); // Import Box192
		rightTrackModel[6] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Import Box193
		rightTrackModel[7] = new ModelRendererTurbo(this, 713, 233, textureX, textureY); // Import Box194
		rightTrackModel[8] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Import Box195
		rightTrackModel[9] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Import Box196
		rightTrackModel[10] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Import Box197
		rightTrackModel[11] = new ModelRendererTurbo(this, 833, 233, textureX, textureY); // Import Box198

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Import Box187
		rightTrackModel[0].setRotationPoint(-35.5F, 8.6F, -27F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 10, 0F,-1F, 9.25F, -0.2F, 0F, 2.25F, -0.2F, 0F, 2.25F, -0.2F, -1F, 9.25F, -0.2F, -1F, -8.45F, -0.2F, 0F, -1.55F, -0.2F, 0F, -1.55F, -0.2F, -1F, -8.45F, -0.2F); // Import Box188
		rightTrackModel[1].setRotationPoint(-57.5F, 10.5F, -27F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, -5F, -0.55F, -0.2F, 4F, -2.3F, -0.2F, 4F, -2.3F, -0.2F, -5F, -0.55F, -0.2F); // Import Box189
		rightTrackModel[2].setRotationPoint(-61.5F, -2.4F, -27F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Import Box190
		rightTrackModel[3].setRotationPoint(-61.5F, -6.4F, -27F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,-5F, -0.35F, -0.2F, 4F, -2.15F, -0.2F, 4F, -2.15F, -0.2F, -5F, -0.35F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Import Box191
		rightTrackModel[4].setRotationPoint(-61.5F, -12.4F, -27F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,0F, -0.45F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.45F, -0.2F, 0F, 1.25F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 1.25F, -0.2F); // Import Box192
		rightTrackModel[5].setRotationPoint(-56.5F, -12.5F, -27F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 63, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Import Box193
		rightTrackModel[6].setRotationPoint(-37.5F, -12.5F, -27F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0.35F, -0.2F); // Import Box194
		rightTrackModel[7].setRotationPoint(25.5F, -12.5F, -27F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 1.35F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0F, 1.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.55F, -0.2F); // Import Box195
		rightTrackModel[8].setRotationPoint(41.5F, -12.5F, -27F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,4F, -0.45F, -0.2F, -4.65F, 1.25F, -0.2F, -4.65F, 1.25F, -0.2F, 4F, -0.45F, -0.2F, 0.55F, 0.3F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.3F, -0.2F); // Import Box196
		rightTrackModel[9].setRotationPoint(49.35F, -12F, -27F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0.55F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0F, -0.2F, -0.35F, 0.55F, -0.2F, -0.35F, 0.55F, -0.2F, 0.55F, 0F, -0.2F); // Import Box197
		rightTrackModel[10].setRotationPoint(49.35F, -7.5F, -27F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 2.3F, -0.2F, -1.5F, 14.5F, -0.2F, -1.5F, 14.5F, -0.2F, 0F, 2.3F, -0.2F, 0F, -1.55F, -0.2F, -0.5F, -14.45F, -0.2F, -0.5F, -14.45F, -0.2F, 0F, -1.55F, -0.2F); // Import Box198
		rightTrackModel[11].setRotationPoint(35.5F, 10.5F, -27F);
	}
}