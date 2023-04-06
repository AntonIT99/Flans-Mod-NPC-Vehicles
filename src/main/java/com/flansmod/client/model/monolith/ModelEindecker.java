//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEindecker extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEindecker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[106];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[4];
		rightWingModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box4
		bodyModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box9
		bodyModel[6] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box10
		bodyModel[7] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box13
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box14
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box15
		bodyModel[10] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box19
		bodyModel[11] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box20
		bodyModel[12] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box18
		bodyModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box26
		bodyModel[14] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box28
		bodyModel[15] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box33
		bodyModel[16] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box35
		bodyModel[17] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box36
		bodyModel[18] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box71
		bodyModel[19] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import Box113
		bodyModel[20] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box115
		bodyModel[21] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box116
		bodyModel[22] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import Box117
		bodyModel[23] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box122
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box129
		bodyModel[25] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box130
		bodyModel[26] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box131
		bodyModel[27] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box132
		bodyModel[28] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import Box133
		bodyModel[29] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box135
		bodyModel[30] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box136
		bodyModel[31] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box137
		bodyModel[32] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box138
		bodyModel[33] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box139
		bodyModel[34] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box140
		bodyModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box141
		bodyModel[36] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box142
		bodyModel[37] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Import Box147
		bodyModel[38] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Box148
		bodyModel[39] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box149
		bodyModel[40] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box155
		bodyModel[41] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box156
		bodyModel[42] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box157
		bodyModel[43] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import Box158
		bodyModel[44] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box160
		bodyModel[45] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box162
		bodyModel[46] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box166
		bodyModel[47] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box167
		bodyModel[48] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box168
		bodyModel[49] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box169
		bodyModel[50] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box170
		bodyModel[51] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box171
		bodyModel[52] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box172
		bodyModel[53] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box173
		bodyModel[54] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box174
		bodyModel[55] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box175
		bodyModel[56] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box198
		bodyModel[57] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box199
		bodyModel[58] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box200
		bodyModel[59] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box201
		bodyModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box202
		bodyModel[61] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box203
		bodyModel[62] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import Box204
		bodyModel[63] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box205
		bodyModel[64] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Box7
		bodyModel[65] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box8
		bodyModel[66] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import Box9
		bodyModel[67] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box11
		bodyModel[68] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box12
		bodyModel[69] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import Box13
		bodyModel[70] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import Box14
		bodyModel[71] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box17
		bodyModel[72] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import Box18
		bodyModel[73] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box19
		bodyModel[74] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Box26
		bodyModel[75] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box27
		bodyModel[76] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box28
		bodyModel[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box40
		bodyModel[78] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Box41
		bodyModel[79] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import Box42
		bodyModel[80] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box44
		bodyModel[81] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box45
		bodyModel[82] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box46
		bodyModel[83] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box47
		bodyModel[84] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box50
		bodyModel[85] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box51
		bodyModel[86] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import Box52
		bodyModel[87] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Import Box59
		bodyModel[88] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import Box60
		bodyModel[89] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import Box61
		bodyModel[90] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import Box62
		bodyModel[91] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import Box167
		bodyModel[92] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box168
		bodyModel[93] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box169
		bodyModel[94] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Import Box170
		bodyModel[95] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Import Box171
		bodyModel[96] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Import Box172
		bodyModel[97] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Import Box173
		bodyModel[98] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import Box174
		bodyModel[99] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Import Box175
		bodyModel[100] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Import Box176
		bodyModel[101] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 37
		bodyModel[102] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 39
		bodyModel[103] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 42
		bodyModel[104] = new ModelRendererTurbo(this, 395, 294, textureX, textureY); // Box 45
		bodyModel[105] = new ModelRendererTurbo(this, 395, 294, textureX, textureY); // Box 46

		bodyModel[0].addBox(0F, 0F, 0F, 36, 1, 25, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-25F, -23F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 33, 1, 25, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Import Box2
		bodyModel[1].setRotationPoint(11F, -23F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -4F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F); // Import Box3
		bodyModel[2].setRotationPoint(-50F, -23F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 37, 29, 1, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Import Box4
		bodyModel[3].setRotationPoint(7F, -52F, 11F);

		bodyModel[4].addBox(0F, 0F, 0F, 34, 29, 1, 0F); // Import Box5
		bodyModel[4].setRotationPoint(-27F, -52F, 11F);

		bodyModel[5].addBox(0F, 0F, 0F, 34, 29, 1, 0F); // Import Box9
		bodyModel[5].setRotationPoint(-27F, -52F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 29, 1, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Import Box10
		bodyModel[6].setRotationPoint(7F, -52F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[7].setRotationPoint(19F, -52F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import Box14
		bodyModel[8].setRotationPoint(8F, -52F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,-8F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box15
		bodyModel[9].setRotationPoint(8F, -52F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 30, 11, 0F,0F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[10].setRotationPoint(-15F, -52F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 30, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[11].setRotationPoint(-15F, -52F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[12].setRotationPoint(-27F, -52F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 114, 32, 10, 0F,0F, -1F, 0F, 0F, -16F, 0F, 0F, -17F, -7F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -14F, 0F, 0F, -14F, -7F, 0F, -5F, 0F); // Import Box26
		bodyModel[13].setRotationPoint(44F, -52F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 1, 10, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[14].setRotationPoint(19F, -52F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[15].setRotationPoint(-27F, -52F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 29, 11, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Import Box35
		bodyModel[16].setRotationPoint(-48F, -52F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 29, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F); // Import Box36
		bodyModel[17].setRotationPoint(-48F, -52F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 16, 2, 25, 0F); // Import Box71
		bodyModel[18].setRotationPoint(-24F, -22F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 27, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 12F, 6F, 0F, 12F); // Import Box113
		bodyModel[19].setRotationPoint(-24F, -20F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 27, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 12F, -6F, 0F, 12F, -6F, 0F, -12F, 6F, 0F, -12F); // Import Box115
		bodyModel[20].setRotationPoint(-24F, -20F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 50, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[21].setRotationPoint(-35F, 6F, -25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 4, 50, 0F,0F, 0F, 0F, 0F, -3F, -22F, 0F, -3F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F); // Import Box117
		bodyModel[22].setRotationPoint(-30F, 6F, -25F);

		bodyModel[23].addBox(0F, 0F, 0F, 9, 18, 2, 0F); // Import Box122
		bodyModel[23].setRotationPoint(-29F, 1F, -27F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[24].setRotationPoint(-34F, 1F, -27F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Import Box130
		bodyModel[25].setRotationPoint(-34F, 6F, 25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import Box131
		bodyModel[26].setRotationPoint(-34F, 14F, -27F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[27].setRotationPoint(-20F, 1F, -27F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Import Box133
		bodyModel[28].setRotationPoint(-20F, 6F, -27F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[29].setRotationPoint(-20F, 14F, -27F);

		bodyModel[30].addBox(0F, 0F, 0F, 9, 18, 2, 0F); // Import Box136
		bodyModel[30].setRotationPoint(-29F, 1F, 25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[31].setRotationPoint(-34F, 1F, 25F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Import Box138
		bodyModel[32].setRotationPoint(-34F, 6F, -27F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[33].setRotationPoint(-20F, 1F, 25F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Import Box140
		bodyModel[34].setRotationPoint(-20F, 6F, 25F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[35].setRotationPoint(-20F, 14F, 25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import Box142
		bodyModel[36].setRotationPoint(-34F, 14F, 25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[37].setRotationPoint(10F, -51F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Import Box148
		bodyModel[38].setRotationPoint(10F, -51F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 19, 5, 0F,3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[39].setRotationPoint(10F, -51F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		bodyModel[40].setRotationPoint(-3F, -32F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		bodyModel[41].setRotationPoint(-3F, -32F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		bodyModel[42].setRotationPoint(-3F, -32F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		bodyModel[43].setRotationPoint(-8F, -38F, -1.5F);
		bodyModel[43].rotateAngleZ = -0.31415927F;

		bodyModel[44].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Box160
		bodyModel[44].setRotationPoint(-15F, -57F, -1.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 30, 3, 1, 0F); // Import Box162
		bodyModel[45].setRotationPoint(-52F, -57F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[46].setRotationPoint(-52F, -57F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 30, 1, 3, 0F); // Import Box167
		bodyModel[47].setRotationPoint(-52F, -56F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box168
		bodyModel[48].setRotationPoint(-52F, -55F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[49].setRotationPoint(-52F, -57F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[50].setRotationPoint(-52F, -55F, -2F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box171
		bodyModel[51].setRotationPoint(-54F, -55.8F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Import Box172
		bodyModel[52].setRotationPoint(-21F, -57F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[53].setRotationPoint(-21F, -57F, -3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[54].setRotationPoint(-21F, -57F, 0.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Box175
		bodyModel[55].setRotationPoint(-25F, -56F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Import Box198
		bodyModel[56].setRotationPoint(-51F, -58F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		bodyModel[57].setRotationPoint(-51F, -58F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box200
		bodyModel[58].setRotationPoint(-51F, -58F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		bodyModel[59].setRotationPoint(-51F, -60F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Import Box202
		bodyModel[60].setRotationPoint(-51F, -59F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Import Box203
		bodyModel[61].setRotationPoint(-51F, -59F, 0F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Import Box204
		bodyModel[62].setRotationPoint(-51F, -60F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		bodyModel[63].setRotationPoint(-51F, -60F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box7
		bodyModel[64].setRotationPoint(-55F, -53F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box8
		bodyModel[65].setRotationPoint(-55F, -48F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[66].setRotationPoint(-55F, -54F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[67].setRotationPoint(-58F, -54F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box12
		bodyModel[68].setRotationPoint(-58F, -54F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F); // Import Box13
		bodyModel[69].setRotationPoint(-58F, -53F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F); // Import Box14
		bodyModel[70].setRotationPoint(-58F, -32F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box17
		bodyModel[71].setRotationPoint(-58F, -43F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box18
		bodyModel[72].setRotationPoint(-58F, -48F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Import Box19
		bodyModel[73].setRotationPoint(-58F, -38F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box26
		bodyModel[74].setRotationPoint(-48F, -48F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box27
		bodyModel[75].setRotationPoint(-48F, -43F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -4F, 0F, 0F, -2F); // Import Box28
		bodyModel[76].setRotationPoint(-48F, -38F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[77].setRotationPoint(-55F, -53F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[78].setRotationPoint(-55F, -48F, -13F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[79].setRotationPoint(-55F, -54F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[80].setRotationPoint(-58F, -54F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[81].setRotationPoint(-58F, -54F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[82].setRotationPoint(-58F, -53F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box47
		bodyModel[83].setRotationPoint(-58F, -32F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box50
		bodyModel[84].setRotationPoint(-58F, -43F, -13F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box51
		bodyModel[85].setRotationPoint(-58F, -48F, -13F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F); // Import Box52
		bodyModel[86].setRotationPoint(-58F, -38F, -13F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, -2F, 0F, -1F, -4F, 0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box59
		bodyModel[87].setRotationPoint(-48F, -48F, -13F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box60
		bodyModel[88].setRotationPoint(-48F, -43F, -13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -3F, 2F, 0F, -2F, 2F); // Import Box61
		bodyModel[89].setRotationPoint(-48F, -38F, -13F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, -5F, 0F, 0F, -6F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[90].setRotationPoint(-48F, -53F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[91].setRotationPoint(-57F, -43F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[92].setRotationPoint(-57F, -50F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[93].setRotationPoint(-57F, -37F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[94].setRotationPoint(-57F, -41F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[95].setRotationPoint(-57F, -41F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import Box172
		bodyModel[96].setRotationPoint(-57F, -47F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[97].setRotationPoint(-57F, -47F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[98].setRotationPoint(-57F, -35F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F); // Import Box175
		bodyModel[99].setRotationPoint(-57F, -35F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[100].setRotationPoint(-62F, -42F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 114, 32, 11, 0F,0F, -3F, 0F, 0F, -17F, -7F, 0F, -16F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -14F, -7F, 0F, -14F, 0F, 0F, -5F, 0F); // Box 37
		bodyModel[101].setRotationPoint(44F, -52F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 34, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -10F, -6F, 0F, -10F, -6F, 0F, 10F, 6F, 0F, 10F); // Box 39
		bodyModel[102].setRotationPoint(8F, -23F, -13F);
		bodyModel[102].rotateAngleZ = -0.2443461F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 34, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 10F, -6F, 0F, 10F, -6F, 0F, -10F, 6F, 0F, -10F); // Box 42
		bodyModel[103].setRotationPoint(8F, -23F, 9F);
		bodyModel[103].rotateAngleZ = -0.2443461F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-9F, 0F, -10F, -9F, 0F, -11F, -9F, 0F, -11F, -9F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, -11F, -9F, 0F, -11F, -9F, 0F, -10F); // Box 45
		bodyModel[104].setRotationPoint(37F, -16F, -12F);
		bodyModel[104].rotateAngleX = 1.57079633F;
		bodyModel[104].rotateAngleY = 0.05235988F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-9F, 0F, -11F, -9F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, -11F, -9F, 0F, -11F, -9F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, -11F); // Box 46
		bodyModel[105].setRotationPoint(77F, -16F, 9F);
		bodyModel[105].rotateAngleX = 1.57079633F;
		bodyModel[105].rotateAngleY = 3.08923278F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import Box58
		tailModel[1] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box59
		tailModel[2] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box60
		tailModel[3] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import Box61
		tailModel[4] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box62
		tailModel[5] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Import Box63
		tailModel[6] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import Box64
		tailModel[7] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box65
		tailModel[8] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box66
		tailModel[9] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box67
		tailModel[10] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import Box91
		tailModel[11] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 38

		tailModel[0].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Import Box58
		tailModel[0].setRotationPoint(158F, -36F, -1F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F); // Import Box59
		tailModel[1].setRotationPoint(173F, -36F, -1F);

		tailModel[2].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // Import Box60
		tailModel[2].setRotationPoint(173F, -45F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		tailModel[3].setRotationPoint(173F, -56F, -1F);

		tailModel[4].addBox(0F, 0F, 0F, 10, 20, 1, 0F); // Import Box62
		tailModel[4].setRotationPoint(163F, -56F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		tailModel[5].setRotationPoint(158F, -56F, -1F);

		tailModel[6].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Import Box64
		tailModel[6].setRotationPoint(154F, -45F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import Box65
		tailModel[7].setRotationPoint(154F, -41F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		tailModel[8].setRotationPoint(154F, -54F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		tailModel[9].setRotationPoint(178F, -52F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 26, 1, 45, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		tailModel[10].setRotationPoint(152F, -36F, -47F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 26, 1, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 38
		tailModel[11].setRotationPoint(152F, -36F, 2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import Box76
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box78
		leftWingModel[2] = new ModelRendererTurbo(this, 0, 395, textureX, textureY); // Import Box85
		leftWingModel[3] = new ModelRendererTurbo(this, 395, 294, textureX, textureY); // Box 43

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 44, 4, 137, 0F,0F, -1F, 0F, 0F, -3F, 12F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		leftWingModel[0].setRotationPoint(-27F, -46F, -149F);
		leftWingModel[0].rotateAngleZ = -0.17453293F;

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 44, 4, 137, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F); // Import Box78
		leftWingModel[1].setRotationPoint(-27F, -46F, 11F);
		leftWingModel[1].rotateAngleZ = -0.17453293F;

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 97, 0F,0F, -4F, 93F, 0F, 0F, 100F, 0F, 0F, 100F, 0F, -4F, 93F, 0F, 2F, 93F, 0F, 0F, 100F, 0F, 0F, 100F, 0F, 2F, 93F); // Import Box85
		leftWingModel[2].setRotationPoint(-37F, -45F, -49F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftWingModel[3].setRotationPoint(-27F, -46F, -141F);
		leftWingModel[3].rotateAngleZ = -0.2268928F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 395, 294, textureX, textureY); // Box 44

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rightWingModel[0].setRotationPoint(-27F, -46F, 101F);
		rightWingModel[0].rotateAngleZ = -0.2268928F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-60F, -40F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 256, 400, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 256, 400, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[1].addBox(-0.5F, -30F, -2F, 1, 30, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}