//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Finfokker
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFinfokker extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFinfokker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];
		noseModel = new ModelRendererTurbo[18];
		tailModel = new ModelRendererTurbo[15];
		leftWingModel = new ModelRendererTurbo[15];
		rightWingModel = new ModelRendererTurbo[15];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 119
		bodyModel[1] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 121
		bodyModel[2] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 122
		bodyModel[3] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 123
		bodyModel[4] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 124
		bodyModel[5] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 125
		bodyModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 126
		bodyModel[7] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 127
		bodyModel[8] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 128
		bodyModel[9] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 129
		bodyModel[10] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 130
		bodyModel[11] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 131
		bodyModel[12] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 132
		bodyModel[13] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 133
		bodyModel[14] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 134
		bodyModel[15] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 136
		bodyModel[16] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 137
		bodyModel[17] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 138
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 139
		bodyModel[19] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 84
		bodyModel[20] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 85
		bodyModel[21] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 86
		bodyModel[22] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 87
		bodyModel[23] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 145
		bodyModel[25] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 149
		bodyModel[26] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 150
		bodyModel[27] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 151
		bodyModel[28] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 152
		bodyModel[29] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 153
		bodyModel[30] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 154
		bodyModel[31] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 155
		bodyModel[32] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 156
		bodyModel[33] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 157
		bodyModel[34] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 158
		bodyModel[35] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 159
		bodyModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 160
		bodyModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 161
		bodyModel[38] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 162
		bodyModel[39] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 163
		bodyModel[40] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 164
		bodyModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 165
		bodyModel[42] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 178
		bodyModel[43] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 179
		bodyModel[44] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 221
		bodyModel[47] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 225
		bodyModel[48] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 226
		bodyModel[49] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 227
		bodyModel[50] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 228
		bodyModel[51] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 229
		bodyModel[52] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 192
		bodyModel[53] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 193
		bodyModel[54] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 194
		bodyModel[55] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 195
		bodyModel[56] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 196
		bodyModel[57] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 200
		bodyModel[58] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 201
		bodyModel[59] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 219
		bodyModel[60] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 220
		bodyModel[61] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 134

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Box 119
		bodyModel[0].setRotationPoint(-56F, -31F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, -1F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, -1F, -7F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Box 121
		bodyModel[1].setRotationPoint(-56F, -39F, -11.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -8F); // Box 122
		bodyModel[2].setRotationPoint(-56F, -23F, -11.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, 0.5F, -7F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0.5F, -7F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 123
		bodyModel[3].setRotationPoint(-54F, -39F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0F, -8F); // Box 124
		bodyModel[4].setRotationPoint(-54F, -23F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 8, 23, 0F,0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 125
		bodyModel[5].setRotationPoint(-54F, -31F, -11.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 9, 26, 0F,0F, 0F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[6].setRotationPoint(-52F, -40F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[7].setRotationPoint(-52F, -31F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -9.5F, 0F, 1F, -9.5F, 0F, 1F, -9.5F, 0F, 0.5F, -9.5F); // Box 128
		bodyModel[8].setRotationPoint(-52F, -23F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 50, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 1F, -9.5F, 0F, -1F, -9.5F, 0F, -1F, -9.5F, 0F, 1F, -9.5F); // Box 129
		bodyModel[9].setRotationPoint(-46F, -23F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 50, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F); // Box 130
		bodyModel[10].setRotationPoint(-46F, -31F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 50, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 131
		bodyModel[11].setRotationPoint(-46F, -31F, 12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F, 6F, 0F, 0F, -1.8F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 1.8F); // Box 132
		bodyModel[12].setRotationPoint(-20F, -38F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, 2F, -7F, 0F, 3F, -8F, 0F, 3F, 8F, 0F, 2F, 7F, 0F, 0F, 0F, 0F, 0F, -1.45F, 0F, 0F, 1.45F, 0F, 0F, 0F); // Box 133
		bodyModel[13].setRotationPoint(-46F, -38F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 3F, -8F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 3F, 8F, 0F, 0F, -1.45F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.45F); // Box 134
		bodyModel[14].setRotationPoint(-25F, -38F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 1, 10, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[15].setRotationPoint(-46F, -40F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 6F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, 1.8F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.8F); // Box 137
		bodyModel[16].setRotationPoint(-20F, -38F, 12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, 2F, 7F, 0F, 3F, 8F, 0F, 3F, -8F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 1.45F, 0F, 0F, -1.45F, 0F, 0F, 0F); // Box 138
		bodyModel[17].setRotationPoint(-46F, -38F, 12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 3F, 8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 3F, -8F, 0F, 0F, 1.45F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.45F); // Box 139
		bodyModel[18].setRotationPoint(-25F, -38F, 12F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[19].setRotationPoint(-33F, -42.5F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[20].setRotationPoint(-34F, -44.1F, -0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[21].setRotationPoint(-34F, -43.6F, 0.05F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[22].setRotationPoint(-34F, -43F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[23].setRotationPoint(-34F, -43.6F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 145
		bodyModel[24].setRotationPoint(-27F, -42.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, -3.5F, 0F, 2F, -3.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -6F); // Box 149
		bodyModel[25].setRotationPoint(4F, -23F, -9.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 27, 8, 1, 0F,0F, 0F, 9F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, -2F, 5.5F, 0F, -2F, 5.5F, 0F, 0F, 9F); // Box 150
		bodyModel[26].setRotationPoint(4F, -31F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 7, 1, 0F,0F, 0F, 6F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 6F, 0F, 0F, 9F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 9F); // Box 151
		bodyModel[27].setRotationPoint(4F, -38F, -0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, 5.5F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 5.5F, 1F, 0F, -1F, 5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -1F, 5F); // Box 152
		bodyModel[28].setRotationPoint(4F, -40F, -1.5F);

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[29].setRotationPoint(-18.5F, -46.5F, -3.5F);
		bodyModel[29].rotateAngleX = -0.33161256F;
		bodyModel[29].rotateAngleZ = -0.17453293F;

		bodyModel[30].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[30].setRotationPoint(-18.5F, -46.5F, -3.5F);
		bodyModel[30].rotateAngleX = -0.05235988F;
		bodyModel[30].rotateAngleZ = -0.80285146F;

		bodyModel[31].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[31].setRotationPoint(-18.5F, -46.5F, 3.5F);
		bodyModel[31].rotateAngleX = 0.05235988F;
		bodyModel[31].rotateAngleZ = -0.80285146F;

		bodyModel[32].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[32].setRotationPoint(-18.5F, -47F, -3.5F);

		bodyModel[33].addShapeBox(-0.5F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[33].setRotationPoint(-18.5F, -47F, -3.5F);

		bodyModel[34].addShapeBox(-0.5F, 0F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[34].setRotationPoint(-5.5F, -47F, -3.5F);
		bodyModel[34].rotateAngleY = 0.13962634F;
		bodyModel[34].rotateAngleZ = -0.15707963F;

		bodyModel[35].addShapeBox(-0.5F, 0F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[35].setRotationPoint(-5.5F, -47F, 3.5F);
		bodyModel[35].rotateAngleY = -0.13962634F;
		bodyModel[35].rotateAngleZ = -0.15707963F;

		bodyModel[36].addShapeBox(-0.5F, 0F, -1.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[36].setRotationPoint(-5.5F, -47.2F, 3.5F);
		bodyModel[36].rotateAngleX = -0.41887902F;
		bodyModel[36].rotateAngleY = -0.13962634F;
		bodyModel[36].rotateAngleZ = -0.15707963F;

		bodyModel[37].addShapeBox(-0.5F, 0F, -0.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[37].setRotationPoint(-5.5F, -47.2F, -3.5F);
		bodyModel[37].rotateAngleX = 0.41887902F;
		bodyModel[37].rotateAngleY = 0.13962634F;
		bodyModel[37].rotateAngleZ = -0.15707963F;

		bodyModel[38].addShapeBox(-0.5F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 162
		bodyModel[38].setRotationPoint(-5.6F, -47.8F, 0F);
		bodyModel[38].rotateAngleZ = -0.15707963F;

		bodyModel[39].addShapeBox(-0.5F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[39].setRotationPoint(-18.5F, -47F, 0F);
		bodyModel[39].rotateAngleZ = 0.06981317F;

		bodyModel[40].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[40].setRotationPoint(-12.5F, -46.5F, -3.5F);
		bodyModel[40].rotateAngleX = -0.31415927F;
		bodyModel[40].rotateAngleZ = -0.15707963F;

		bodyModel[41].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[41].setRotationPoint(-6F, -46.5F, -3.4F);
		bodyModel[41].rotateAngleX = -0.31415927F;
		bodyModel[41].rotateAngleZ = -0.15707963F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 23, 12, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, -4F, 0F); // Box 178
		bodyModel[42].setRotationPoint(6F, -31F, -9.5F);
		bodyModel[42].rotateAngleY = 0.13962634F;
		bodyModel[42].rotateAngleZ = 0.03490659F;

		bodyModel[43].addShapeBox(0F, -8F, 0F, 23, 11, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 179
		bodyModel[43].setRotationPoint(6F, -31F, -9.5F);
		bodyModel[43].rotateAngleX = -0.41887902F;
		bodyModel[43].rotateAngleY = 0.13962634F;
		bodyModel[43].rotateAngleZ = 0.03490659F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[44].setRotationPoint(-9.5F, -39F, -2.5F);
		bodyModel[44].rotateAngleZ = -0.12217305F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[45].setRotationPoint(-20.5F, -33F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[46].setRotationPoint(-37.8F, -37.5F, -11F);
		bodyModel[46].rotateAngleZ = 0.27925268F;

		bodyModel[47].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[47].setRotationPoint(-29F, -39.5F, -9.5F);
		bodyModel[47].rotateAngleZ = 0.27925268F;

		bodyModel[48].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[48].setRotationPoint(-29F, -39.5F, -10.5F);
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[49].setRotationPoint(-29F, -39.5F, -9F);
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[50].setRotationPoint(-29F, -39.5F, -11F);
		bodyModel[50].rotateAngleZ = 0.27925268F;

		bodyModel[51].addShapeBox(0F, 3.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[51].setRotationPoint(-29F, -39.5F, -10F);
		bodyModel[51].rotateAngleZ = 0.27925268F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 192
		bodyModel[52].setRotationPoint(-9.5F, -39F, -5F);
		bodyModel[52].rotateAngleZ = -0.12217305F;

		bodyModel[53].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 193
		bodyModel[53].setRotationPoint(-15.5F, -33F, -5F);
		bodyModel[53].rotateAngleZ = -0.12217305F;

		bodyModel[54].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 194
		bodyModel[54].setRotationPoint(-15.5F, -33F, 4F);
		bodyModel[54].rotateAngleZ = -0.12217305F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 195
		bodyModel[55].setRotationPoint(-9.5F, -39F, 4F);
		bodyModel[55].rotateAngleZ = -0.12217305F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 196
		bodyModel[56].setRotationPoint(-4.5F, -38F, -2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[57].setRotationPoint(-53F, -11F, -1.5F);
		bodyModel[57].rotateAngleZ = 0.10471976F;

		bodyModel[58].addShapeBox(3F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[58].setRotationPoint(-53F, -11F, -1.5F);
		bodyModel[58].rotateAngleZ = 0.10471976F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 23, 12, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, -4F, 0F); // Box 219
		bodyModel[59].setRotationPoint(6F, -31F, 8.5F);
		bodyModel[59].rotateAngleY = -0.13962634F;
		bodyModel[59].rotateAngleZ = 0.03490659F;

		bodyModel[60].addShapeBox(0F, -7.5F, 0F, 23, 11, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 220
		bodyModel[60].setRotationPoint(6F, -31F, 8.5F);
		bodyModel[60].rotateAngleX = 0.41887902F;
		bodyModel[60].rotateAngleY = -0.13962634F;
		bodyModel[60].rotateAngleZ = 0.03490659F;

		bodyModel[61].addShapeBox(-0.5F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[61].setRotationPoint(-18.5F, -47F, 3.5F);

		bodyModel[62].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[62].setRotationPoint(-18.5F, -46.5F, 3.5F);
		bodyModel[62].rotateAngleX = 0.33161256F;
		bodyModel[62].rotateAngleZ = -0.17453293F;

		bodyModel[63].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[63].setRotationPoint(-12.5F, -46.5F, 3.5F);
		bodyModel[63].rotateAngleX = 0.31415927F;
		bodyModel[63].rotateAngleZ = -0.15707963F;

		bodyModel[64].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[64].setRotationPoint(-6F, -46.5F, 3.4F);
		bodyModel[64].rotateAngleX = 0.31415927F;
		bodyModel[64].rotateAngleZ = -0.15707963F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		noseModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 187
		noseModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 189
		noseModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 190
		noseModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 193
		noseModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 194
		noseModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 195
		noseModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 196
		noseModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 197
		noseModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 198
		noseModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 199
		noseModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 200
		noseModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 201
		noseModel[14] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 120
		noseModel[15] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 197
		noseModel[16] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 198
		noseModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 199

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 186
		noseModel[0].setRotationPoint(-67F, -31F, -12.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 8, 25, 0F,0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 187
		noseModel[1].setRotationPoint(-67F, -39F, -12.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 11, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F); // Box 188
		noseModel[2].setRotationPoint(-67F, -23F, -12.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-1.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.7F); // Box 189
		noseModel[3].setRotationPoint(-73F, -39F, -4.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-0.5F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.7F, -1.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F); // Box 190
		noseModel[4].setRotationPoint(-73F, -19.5F, -4.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 193
		noseModel[5].setRotationPoint(-73F, -31F, 8.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0.5F, -8F, -1.5F, -1.5F, -8F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 194
		noseModel[6].setRotationPoint(-73F, -39F, 8.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F); // Box 195
		noseModel[7].setRotationPoint(-73F, -31F, -12.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0.5F, -8F, -1.5F, -1.5F, -8F); // Box 196
		noseModel[8].setRotationPoint(-73F, -23F, 8.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, -1.5F, -8F, 0F, 0.5F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F); // Box 197
		noseModel[9].setRotationPoint(-73F, -39F, -12.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -1.5F, -1.5F, -8F, 0F, 0.5F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F); // Box 198
		noseModel[10].setRotationPoint(-73F, -23F, -12.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 199
		noseModel[11].setRotationPoint(-73F, -31.5F, -4F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		noseModel[12].setRotationPoint(-77F, -28.5F, -1F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.3F, -0.3F); // Box 201
		noseModel[13].setRotationPoint(-78.7F, -28.5F, -1F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseModel[14].setRotationPoint(-70F, -31.5F, -4F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		noseModel[15].setRotationPoint(-64F, -13F, -2F);

		noseModel[16].addShapeBox(0F, -3F, 0F, 3, 3, 4, 0F,0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		noseModel[16].setRotationPoint(-61F, -11F, -2F);
		noseModel[16].rotateAngleZ = 0.40142573F;

		noseModel[17].addShapeBox(3F, -3F, 0F, 3, 3, 4, 0F,0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 199
		noseModel[17].setRotationPoint(-61F, -11F, -2F);
		noseModel[17].rotateAngleZ = 0.40142573F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 231
		tailModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 232
		tailModel[2] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 116
		tailModel[3] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 118
		tailModel[4] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 146
		tailModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 147
		tailModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 148
		tailModel[7] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 168
		tailModel[8] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 169
		tailModel[9] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 170
		tailModel[10] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 171
		tailModel[11] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 172
		tailModel[12] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 173
		tailModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 217
		tailModel[14] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 218

		tailModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 29, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 231
		tailModel[0].setRotationPoint(44F, -34.5F, -29.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		tailModel[1].setRotationPoint(46F, -34.5F, -33.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.8F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, -0.8F); // Box 116
		tailModel[2].setRotationPoint(50.5F, -20F, -2F);
		tailModel[2].rotateAngleZ = -0.71558499F;

		tailModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[3].setRotationPoint(50F, -16F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		tailModel[4].setRotationPoint(50F, -18F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 147
		tailModel[5].setRotationPoint(50F, -14F, -1F);

		tailModel[6].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[6].setRotationPoint(48.5F, -22F, -1F);
		tailModel[6].rotateAngleZ = 0.20943951F;

		tailModel[7].addShapeBox(0F, 0F, 0F, 33, 7, 1, 0F,0F, 0F, 5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, 0F, 5.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 5.5F); // Box 168
		tailModel[7].setRotationPoint(31F, -32F, -0.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 33, 6, 1, 0F,0F, 0F, 5.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 5.5F, 0F, 0F, 2F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, 2F); // Box 169
		tailModel[8].setRotationPoint(31F, -25F, -0.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 33, 5, 1, 0F,0F, 0F, 2.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 5F); // Box 170
		tailModel[9].setRotationPoint(31F, -37F, -0.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 1.5F); // Box 171
		tailModel[10].setRotationPoint(31F, -38F, -1.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F); // Box 172
		tailModel[11].setRotationPoint(58F, -50F, -1F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		tailModel[12].setRotationPoint(59F, -53F, -1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 18, 2, 29, 0F,6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 217
		tailModel[13].setRotationPoint(44F, -34.5F, 0.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 218
		tailModel[14].setRotationPoint(46F, -34.5F, 29.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 234
		leftWingModel[1] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 235
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 236
		leftWingModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 238
		leftWingModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 239
		leftWingModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 242
		leftWingModel[6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 243
		leftWingModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 244
		leftWingModel[8] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 245
		leftWingModel[9] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 246
		leftWingModel[10] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 283
		leftWingModel[11] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 114
		leftWingModel[12] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 166
		leftWingModel[13] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 167
		leftWingModel[14] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 177

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 106, 0F,-1F, 4F, 0F, -10F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[0].setRotationPoint(-41F, -20F, -106F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 106, 0F,-4F, 3.5F, -4F, 1F, 4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, -8F, -4F, 1F, -8F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 235
		leftWingModel[1].setRotationPoint(-48F, -20F, -106F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 106, 0F,10F, 4F, 0F, -18F, 3F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 10F, -8F, 0F, -18F, -7F, -6F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[2].setRotationPoint(-21F, -20F, -106F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, -1F); // Box 238
		leftWingModel[3].setRotationPoint(-49F, -19F, -29F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 239
		leftWingModel[4].setRotationPoint(-49F, -13F, -28F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 1.5F, 5F, 0F, 1.5F, 5F, 0F, 1.5F, 7F, 0F, 1.5F); // Box 242
		leftWingModel[5].setRotationPoint(-49F, -4F, -28F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 2F, 0F, 0F); // Box 243
		leftWingModel[6].setRotationPoint(-55F, -1F, -29.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 244
		leftWingModel[7].setRotationPoint(-55F, 2F, -29.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F,1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftWingModel[8].setRotationPoint(-55F, 4F, -29.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 246
		leftWingModel[9].setRotationPoint(-55F, 6F, -28.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 283
		leftWingModel[10].setRotationPoint(-45F, -23F, -76F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 114
		leftWingModel[11].setRotationPoint(-45F, -19F, -75.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftWingModel[12].setRotationPoint(-56F, -20F, -37.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[13].setRotationPoint(-54.5F, -20.2F, -42.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 25, 6, 18, 0F,-0.3F, 0.6F, 0F, 0F, 3F, -12F, 0F, 3F, 0F, -3F, 0F, 0F, -0.3F, -1.2F, 0F, 0F, -3F, -15F, 0F, -3F, 0F, -3F, 0F, 0F); // Box 177
		leftWingModel[14].setRotationPoint(-13F, -20F, -18F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 202
		rightWingModel[1] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 203
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 204
		rightWingModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 205
		rightWingModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 206
		rightWingModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 207
		rightWingModel[6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 208
		rightWingModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 209
		rightWingModel[8] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 210
		rightWingModel[9] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 211
		rightWingModel[10] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 212
		rightWingModel[11] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 213
		rightWingModel[12] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 214
		rightWingModel[13] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 215
		rightWingModel[14] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 216

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 106, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -8F, 0F, -1F, -8F, 0F); // Box 202
		rightWingModel[0].setRotationPoint(-41F, -20F, 0F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 106, 0F,3F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -4F, 3.5F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, -8F, 0F, -4F, -8F, -4F); // Box 203
		rightWingModel[1].setRotationPoint(-48F, -20F, 0F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 106, 0F,0F, 0F, 0F, -3F, 0F, 0F, -18F, 3F, -6F, 10F, 4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -18F, -7F, -6F, 10F, -8F, 0F); // Box 204
		rightWingModel[2].setRotationPoint(-21F, -20F, 0F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, -1F); // Box 205
		rightWingModel[3].setRotationPoint(-49F, -19F, 24F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 206
		rightWingModel[4].setRotationPoint(-49F, -13F, 25F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 1.5F, 5F, 0F, 1.5F, 5F, 0F, 1.5F, 7F, 0F, 1.5F); // Box 207
		rightWingModel[5].setRotationPoint(-49F, -4F, 25F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 2F, 0F, 0F); // Box 208
		rightWingModel[6].setRotationPoint(-55F, -1F, 23.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 209
		rightWingModel[7].setRotationPoint(-55F, 2F, 23.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F,1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightWingModel[8].setRotationPoint(-55F, 4F, 23.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 211
		rightWingModel[9].setRotationPoint(-55F, 6F, 24.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[10].setRotationPoint(-45F, -23F, 53F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 213
		rightWingModel[11].setRotationPoint(-45F, -19F, 52.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightWingModel[12].setRotationPoint(-56F, -20F, 36.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightWingModel[13].setRotationPoint(-54.5F, -20.2F, 41.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 25, 6, 18, 0F,-3F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -12F, -0.3F, 0.6F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -15F, -0.3F, -1.2F, 0F); // Box 216
		rightWingModel[14].setRotationPoint(-13F, -20F, 0F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 174
		yawFlapModel[1] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 175
		yawFlapModel[2] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 176
		yawFlapModel[3] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 106
		yawFlapModel[4] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 107
		yawFlapModel[5] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 5, 31, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 174
		yawFlapModel[0].setRotationPoint(64F, -53F, 0F);

		yawFlapModel[1].addShapeBox(5F, 0F, -1F, 5, 29, 2, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 175
		yawFlapModel[1].setRotationPoint(64F, -52.5F, 0F);

		yawFlapModel[2].addShapeBox(10F, 0F, -1F, 5, 25, 2, 0F,0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 176
		yawFlapModel[2].setRotationPoint(64F, -49F, 0F);

		yawFlapModel[3].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[3].setRotationPoint(-26F, -25.8F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[4].setRotationPoint(-26F, -25.8F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[5].setRotationPoint(-26F, -25.8F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-22F, -21.5F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-75.5F, -27.5F, 0F);
		propellerModels[1] = makeProp2(-75.5F, -27.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 170, 186, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 170, 186, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 170, 186, textureX, textureY);
		prop[0].addBox(-1F, -4F, -2F, 2, 4, 4, 0.0F);
		prop[1].addBox(-1F, -4F, -2F, 2, 4, 4, 0.0F);
		prop[2].addBox(-1F, -4F, -2F, 2, 4, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[0].addBox(-0.5F, -31F, -1.5F, 1, 31, 3, 0.0F);
		prop[1].addBox(-0.5F, -31F, -1.5F, 1, 31, 3, 0.0F);
		prop[2].addBox(-0.5F, -31F, -1.5F, 1, 31, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}