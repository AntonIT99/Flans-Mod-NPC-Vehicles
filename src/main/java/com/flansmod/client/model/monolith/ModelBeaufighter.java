//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Beaufighter
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBeaufighter extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBeaufighter() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[66];
		noseModel = new ModelRendererTurbo[13];
		tailModel = new ModelRendererTurbo[22];
		leftWingModel = new ModelRendererTurbo[29];
		rightWingModel = new ModelRendererTurbo[29];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[3];
		leftWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 143
		bodyModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 144
		bodyModel[2] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 145
		bodyModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 146
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 147
		bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 149
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 152
		bodyModel[7] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 153
		bodyModel[8] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 154
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 155
		bodyModel[10] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 156
		bodyModel[11] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 157
		bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 158
		bodyModel[13] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 159
		bodyModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 160
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 161
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 162
		bodyModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 163
		bodyModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 164
		bodyModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 165
		bodyModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 166
		bodyModel[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 167
		bodyModel[22] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 168
		bodyModel[23] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 169
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 170
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 171
		bodyModel[26] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 172
		bodyModel[27] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 173
		bodyModel[28] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 174
		bodyModel[29] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 175
		bodyModel[30] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 176
		bodyModel[31] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 177
		bodyModel[32] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 178
		bodyModel[33] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 179
		bodyModel[34] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 180
		bodyModel[35] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 181
		bodyModel[36] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 182
		bodyModel[37] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 200
		bodyModel[38] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 201
		bodyModel[39] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 202
		bodyModel[40] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 203
		bodyModel[41] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 306
		bodyModel[42] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 308
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 603
		bodyModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 604
		bodyModel[45] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 606
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 911
		bodyModel[47] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 912
		bodyModel[48] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 913
		bodyModel[49] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 907
		bodyModel[50] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 908
		bodyModel[51] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 909
		bodyModel[52] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 910
		bodyModel[53] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 578
		bodyModel[54] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		bodyModel[55] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import 
		bodyModel[56] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import 
		bodyModel[57] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import 
		bodyModel[58] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import 
		bodyModel[59] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 271
		bodyModel[60] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 272
		bodyModel[61] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 273
		bodyModel[62] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 274
		bodyModel[63] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 275
		bodyModel[64] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 276
		bodyModel[65] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 277

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 7, 20, 0F,0F, 0F, -6F, -0.5F, 1F, -5F, -0.5F, 1F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 143
		bodyModel[0].setRotationPoint(-74F, -36F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 20, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 144
		bodyModel[1].setRotationPoint(-74F, -29F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0.8F, -6F, 0F, 1.5F, -5F, 0F, 1.5F, -5F, 0F, 0.8F, -6F); // Box 145
		bodyModel[2].setRotationPoint(-74F, -21F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 5, 20, 0F,0F, -1F, 1F, 0F, -2F, 3.5F, 0F, -2F, 3.5F, 0F, -1F, 1F, 0F, 1.5F, -5F, 0F, 4.5F, -3F, 0F, 4.5F, -3F, 0F, 1.5F, -5F); // Box 146
		bodyModel[3].setRotationPoint(-69F, -21F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 2.5F, 0F, 1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 147
		bodyModel[4].setRotationPoint(-69F, -30F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0.5F, 0F, -5.2F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 5.5F, 0F, 0F, 0F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 0F); // Box 149
		bodyModel[5].setRotationPoint(-69F, -36F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, 0F, 1.5F, -2.5F, 0F, 1.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, 2.5F, 0F, 0F, 0F); // Box 152
		bodyModel[6].setRotationPoint(-69F, -30F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 68, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 153
		bodyModel[7].setRotationPoint(-53F, -31.5F, -13.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 68, 13, 1, 0F,0F, 0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0.5F, 0F, 1F, 8F, 0F, 1F, 7F, 0F, 1F, -7F, 0F, 1F, -8F); // Box 154
		bodyModel[8].setRotationPoint(-53F, -45.5F, -5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 68, 7, 27, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -6.5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, -6.5F); // Box 155
		bodyModel[9].setRotationPoint(-53F, -18.5F, -13.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 68, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 156
		bodyModel[10].setRotationPoint(-53F, -31.5F, 12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 68, 13, 1, 0F,0F, 0.5F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -0.5F, 0F, 1F, -8F, 0F, 1F, -7F, 0F, 1F, 7F, 0F, 1F, 8F); // Box 157
		bodyModel[11].setRotationPoint(-53F, -45.5F, 4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0.5F, 0F, 5.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -5.2F, 0F, 0F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, 2.5F, 0F, 0F, 0F); // Box 158
		bodyModel[12].setRotationPoint(-69F, -36F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 64, 2, 10, 0F,0F, 0.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 4F, 2.5F, 0.5F, 4F, 2.5F, 0.5F, 0F, 0F, 0F); // Box 159
		bodyModel[13].setRotationPoint(-53F, -48F, -5F);

		bodyModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[14].setRotationPoint(-61.5F, -46F, -3.5F);
		bodyModel[14].rotateAngleY = -0.05235988F;
		bodyModel[14].rotateAngleZ = -0.01745329F;

		bodyModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[15].setRotationPoint(-61.5F, -46F, 3.5F);
		bodyModel[15].rotateAngleY = 0.05235988F;
		bodyModel[15].rotateAngleZ = -0.01745329F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[16].setRotationPoint(-61.5F, -47.5F, -1.5F);
		bodyModel[16].rotateAngleZ = -0.01745329F;

		bodyModel[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[17].setRotationPoint(-61.5F, -47.4F, 2F);
		bodyModel[17].rotateAngleX = -0.6981317F;
		bodyModel[17].rotateAngleY = -0.05235988F;
		bodyModel[17].rotateAngleZ = -0.01745329F;

		bodyModel[18].addShapeBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[18].setRotationPoint(-61.5F, -47.4F, -2F);
		bodyModel[18].rotateAngleX = 0.6981317F;
		bodyModel[18].rotateAngleY = -0.05235988F;
		bodyModel[18].rotateAngleZ = -0.01745329F;

		bodyModel[19].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[19].setRotationPoint(-61.5F, -46F, -3.5F);
		bodyModel[19].rotateAngleY = 0.01745329F;
		bodyModel[19].rotateAngleZ = -0.75049158F;

		bodyModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[20].setRotationPoint(-61.5F, -46F, 3.5F);
		bodyModel[20].rotateAngleY = -0.01745329F;
		bodyModel[20].rotateAngleZ = -0.75049158F;

		bodyModel[21].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[21].setRotationPoint(-61.5F, -46F, 3.5F);
		bodyModel[21].rotateAngleX = 0.36651914F;
		bodyModel[21].rotateAngleZ = -0.06981317F;

		bodyModel[22].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[22].setRotationPoint(-61.5F, -46F, -3.5F);
		bodyModel[22].rotateAngleX = -0.36651914F;
		bodyModel[22].rotateAngleZ = -0.06981317F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 7, 27, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 1F, -5F); // Box 169
		bodyModel[23].setRotationPoint(15F, -18.5F, -13.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[24].setRotationPoint(15F, -31.5F, -12.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[25].setRotationPoint(15F, -31.5F, 11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, -6.7F, 0F, 0F, -8.5F, 0F, 0F, 8.5F, 0F, 0F, 6.7F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 172
		bodyModel[26].setRotationPoint(15F, -43F, -12.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 6.7F, 0F, 0F, 8.5F, 0F, 0F, -8.5F, 0F, 0F, -6.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 173
		bodyModel[27].setRotationPoint(15F, -43F, 11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 28, 7, 27, 0F,0F, 0.5F, -1F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, -5F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0.5F, -5F); // Box 174
		bodyModel[28].setRotationPoint(26F, -18.5F, -13.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 28, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0.5F, 0F); // Box 175
		bodyModel[29].setRotationPoint(26F, -31.5F, -12.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 28, 12, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0.5F, 0F); // Box 176
		bodyModel[30].setRotationPoint(26F, -31.5F, 11.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 28, 12, 1, 0F,0F, -0.5F, -8.5F, 0F, -3.5F, -9.35F, 0F, -3.5F, 9F, 0F, -0.5F, 8.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F); // Box 177
		bodyModel[31].setRotationPoint(26F, -43.5F, -12.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 28, 12, 1, 0F,0F, -0.5F, 8.5F, 0F, -3.5F, 9F, 0F, -3.5F, -9.35F, 0F, -0.5F, -8.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[32].setRotationPoint(26F, -43.5F, 11.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 28, 3, 8, 0F,-3F, -1F, -2F, 0F, -3.5F, -2.5F, 0F, -3.5F, -2.5F, -3F, -1F, -2F, 0F, -0.5F, 0F, 0F, 2.5F, -0.85F, 0F, 2.5F, -0.85F, 0F, -0.5F, 0F); // Box 179
		bodyModel[33].setRotationPoint(26F, -45.5F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 22, 7, 15, 0F,0F, 0F, 3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, 0F); // Box 180
		bodyModel[34].setRotationPoint(54F, -20F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0.5F); // Box 181
		bodyModel[35].setRotationPoint(54F, -31.5F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 22, 10, 10, 0F,0F, 0F, -3.5F, 0F, -2.5F, -3.5F, 0F, -2.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, 5F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, 5F); // Box 182
		bodyModel[36].setRotationPoint(54F, -42F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 65, 6, 5, 0F,-2F, 0F, 0F, -11F, 0F, -1F, -6F, 1F, 1F, -1F, 1F, 0.5F, 1F, -0.5F, 0F, 2F, -0.5F, -1F, 12F, -0.5F, 1F, 2F, -0.5F, 1F); // Box 200
		bodyModel[37].setRotationPoint(-56F, -29F, -18.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 65, 5, 5, 0F,1F, -0.5F, 0F, 2F, -0.5F, -1F, 12F, -0.5F, 1F, 2F, -0.5F, 1F, -3F, 0F, 0F, -11F, 0F, -1F, -6F, 0F, 1F, -2F, 0F, 0.5F); // Box 201
		bodyModel[38].setRotationPoint(-56F, -24F, -18.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 65, 6, 5, 0F,-2F, 0F, 0.5F, -12F, 0F, 1F, -11F, 0F, 1F, -2F, 0F, 0F, 1F, -0.5F, 1F, -2F, -0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 0F); // Box 202
		bodyModel[39].setRotationPoint(-56F, -29F, -23.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 65, 5, 5, 0F,1F, -0.5F, 1F, -2F, -0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 0F, -3F, 0F, 0.5F, -12F, 0F, 1F, -11F, 0F, 1F, -3F, 0F, 0F); // Box 203
		bodyModel[40].setRotationPoint(-56F, -24F, -23.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[41].setRotationPoint(-63F, -25F, -4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[42].setRotationPoint(-55F, -36F, -4.5F);

		bodyModel[43].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[43].setRotationPoint(-64F, -31.5F, 2F);

		bodyModel[44].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[44].setRotationPoint(-64F, -31.5F, -2F);

		bodyModel[45].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[45].setRotationPoint(-66F, -29.5F, 0F);

		bodyModel[46].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 911
		bodyModel[46].setRotationPoint(-66F, -28.5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 912
		bodyModel[47].setRotationPoint(-66.5F, -21F, -1F);

		bodyModel[48].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 913
		bodyModel[48].setRotationPoint(-64F, -29.5F, -2F);

		bodyModel[49].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 907
		bodyModel[49].setRotationPoint(-69F, -23.5F, -4F);
		bodyModel[49].rotateAngleZ = 0.41887903F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 908
		bodyModel[50].setRotationPoint(-69F, -23.5F, -4F);
		bodyModel[50].rotateAngleZ = 0.41887903F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 909
		bodyModel[51].setRotationPoint(-69F, -23.5F, 2F);
		bodyModel[51].rotateAngleZ = 0.41887903F;

		bodyModel[52].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 910
		bodyModel[52].setRotationPoint(-69F, -23.5F, 2F);
		bodyModel[52].rotateAngleZ = 0.41887903F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 578
		bodyModel[53].setRotationPoint(-69.5F, -36.5F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F); // Import 
		bodyModel[54].setRotationPoint(-68.7F, -37.28F, -0.45F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[55].setRotationPoint(-68.7F, -37.8F, -0.45F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[56].setRotationPoint(-68.2F, -37.8F, -0.45F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F); // Import 
		bodyModel[57].setRotationPoint(-69.7F, -37.8F, -0.45F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[58].setRotationPoint(-69F, -38.1F, -0.45F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[59].setRotationPoint(-69.2F, -35.5F, -4.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[60].setRotationPoint(-69.2F, -35.5F, 1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[61].setRotationPoint(-55F, -42F, -3.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 65, 6, 5, 0F,-1F, 1F, 0.5F, -6F, 1F, 1F, -11F, 0F, -1F, -2F, 0F, 0F, 2F, -0.5F, 1F, 12F, -0.5F, 1F, 2F, -0.5F, -1F, 1F, -0.5F, 0F); // Box 274
		bodyModel[62].setRotationPoint(-56F, -29F, 13.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 65, 5, 5, 0F,2F, -0.5F, 1F, 12F, -0.5F, 1F, 2F, -0.5F, -1F, 1F, -0.5F, 0F, -2F, 0F, 0.5F, -6F, 0F, 1F, -11F, 0F, -1F, -3F, 0F, 0F); // Box 275
		bodyModel[63].setRotationPoint(-56F, -24F, 13.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 65, 6, 5, 0F,-2F, 0F, 0F, -11F, 0F, 1F, -12F, 0F, 1F, -2F, 0F, 0.5F, 1F, -0.5F, 0F, 2F, -0.5F, 1F, -2F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 276
		bodyModel[64].setRotationPoint(-56F, -29F, 18.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 65, 5, 5, 0F,1F, -0.5F, 0F, 2F, -0.5F, 1F, -2F, -0.5F, 1F, 1F, -0.5F, 1F, -3F, 0F, 0F, -11F, 0F, 1F, -12F, 0F, 1F, -3F, 0F, 0.5F); // Box 277
		bodyModel[65].setRotationPoint(-56F, -24F, 18.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134
		noseModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 135
		noseModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 136
		noseModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 137
		noseModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 138
		noseModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 139
		noseModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 140
		noseModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 141
		noseModel[8] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 142
		noseModel[9] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 251
		noseModel[10] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 252
		noseModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 319
		noseModel[12] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 320

		noseModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 134
		noseModel[0].setRotationPoint(-87.5F, -26F, -3F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 2.5F, -1F, 0F, 2.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 135
		noseModel[1].setRotationPoint(-87.5F, -28F, -3F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, -2F); // Box 136
		noseModel[2].setRotationPoint(-87.5F, -24F, -3F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, -0.5F, 1F, 3F, -0.5F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 3F, -0.5F, 1F, 3F, 0F, 0F, 0F); // Box 137
		noseModel[3].setRotationPoint(-84.5F, -27F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -0.5F, -4F, -0.5F, 2.5F, -3F, -0.5F, 2.5F, -3F, 0F, -0.5F, -4F, 0F, 0F, 0F, -0.5F, -1F, 3F, -0.5F, -1F, 3F, 0F, 0F, 0F); // Box 138
		noseModel[4].setRotationPoint(-84.5F, -31F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, -0.5F, -1F, 3F, -0.5F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 2.5F, -3F, -0.5F, 2.5F, -3F, 0F, 0F, -4F); // Box 139
		noseModel[5].setRotationPoint(-84.5F, -23F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 140
		noseModel[6].setRotationPoint(-80F, -28F, -9F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F,0F, -0.5F, -6F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 141
		noseModel[7].setRotationPoint(-80F, -34F, -9F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, 0.8F, -5F, 0F, 0.8F, -5F, 0F, -0.5F, -6F); // Box 142
		noseModel[8].setRotationPoint(-80F, -22F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		noseModel[9].setRotationPoint(-82F, -17F, -3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		noseModel[10].setRotationPoint(-80F, -18.5F, -6F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		noseModel[11].setRotationPoint(-82F, -17F, 2F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		noseModel[12].setRotationPoint(-80F, -18.5F, 5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 183
		tailModel[1] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 184
		tailModel[2] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 185
		tailModel[3] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 186
		tailModel[4] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 187
		tailModel[5] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 188
		tailModel[6] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 189
		tailModel[7] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 190
		tailModel[8] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 191
		tailModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 212
		tailModel[10] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 213
		tailModel[11] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 214
		tailModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 215
		tailModel[13] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 216
		tailModel[14] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 217
		tailModel[15] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 221
		tailModel[16] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 222
		tailModel[17] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 223
		tailModel[18] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 315
		tailModel[19] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 316
		tailModel[20] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 317
		tailModel[21] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 318

		tailModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 11, 0F,0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0F); // Box 183
		tailModel[0].setRotationPoint(76F, -21F, -5.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 13, 10, 11, 0F,0F, 0.5F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F); // Box 184
		tailModel[1].setRotationPoint(76F, -31F, -5.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 13, 7, 11, 0F,0F, 0.5F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 2.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 2.5F); // Box 185
		tailModel[2].setRotationPoint(76F, -39F, -5.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 26, 10, 12, 0F,0F, 0F, 0F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5.5F, 0F, -3F, -5.5F, 0F, 0F, 0F); // Box 186
		tailModel[3].setRotationPoint(89F, -31F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 12, 0F,0F, 0F, 0F, 0F, 3F, -5.5F, 0F, 3F, -5.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -5.5F, 0F, -2.5F, -5.5F, 0F, 0F, -1.5F); // Box 187
		tailModel[4].setRotationPoint(89F, -21F, -6F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 26, 7, 12, 0F,0F, 0F, -4.5F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F); // Box 188
		tailModel[5].setRotationPoint(89F, -38F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 21, 15, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 189
		tailModel[6].setRotationPoint(89F, -52F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,-6.5F, -2F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -6.5F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 190
		tailModel[7].setRotationPoint(98F, -61F, -0.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		tailModel[8].setRotationPoint(110F, -45F, -0.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		tailModel[9].setRotationPoint(95F, -18F, -1F);

		tailModel[10].addShapeBox(-1.2F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		tailModel[10].setRotationPoint(95F, -12F, -2F);
		tailModel[10].rotateAngleZ = 0.41887902F;

		tailModel[11].addShapeBox(-1.2F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		tailModel[11].setRotationPoint(95F, -7F, -1.5F);

		tailModel[12].addShapeBox(-1.2F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		tailModel[12].setRotationPoint(95F, -10F, -1.5F);

		tailModel[13].addShapeBox(-1.2F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 216
		tailModel[13].setRotationPoint(95F, -4F, -1.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 23, 3, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		tailModel[14].setRotationPoint(91F, -38F, -37F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		tailModel[15].setRotationPoint(91F, -38F, -45F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		tailModel[16].setRotationPoint(95F, -38F, -51F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.9F, 0F, 0F, 0F); // Box 223
		tailModel[17].setRotationPoint(111F, -38F, -51F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 23, 3, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		tailModel[18].setRotationPoint(91F, -38F, 0F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 316
		tailModel[19].setRotationPoint(91F, -38F, 37F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 317
		tailModel[20].setRotationPoint(95F, -38F, 45F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 318
		tailModel[21].setRotationPoint(111F, -38F, 45F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 204
		leftWingModel[1] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 205
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 206
		leftWingModel[3] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 207
		leftWingModel[4] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 208
		leftWingModel[5] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 209
		leftWingModel[6] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 210
		leftWingModel[7] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 211
		leftWingModel[8] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 224
		leftWingModel[9] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 225
		leftWingModel[10] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 226
		leftWingModel[11] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 227
		leftWingModel[12] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 228
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 229
		leftWingModel[14] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 230
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 231
		leftWingModel[16] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 232
		leftWingModel[17] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 233
		leftWingModel[18] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 235
		leftWingModel[19] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Box 236
		leftWingModel[20] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 237
		leftWingModel[21] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 238
		leftWingModel[22] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 239
		leftWingModel[23] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Box 240
		leftWingModel[24] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 241
		leftWingModel[25] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 242
		leftWingModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 243
		leftWingModel[27] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 244
		leftWingModel[28] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 245

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 61, 6, 38, 0F,-3F, -1F, 0F, -13F, -1F, 1F, -8F, 0F, 1F, -2F, 0F, 0.5F, 0.5F, 0.5F, 0F, -3F, 0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 204
		leftWingModel[0].setRotationPoint(-56F, -29F, -62.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 61, 5, 37, 0F,0.5F, 0.5F, 0F, -3F, 0.5F, 1F, 2F, 1.5F, 1F, 1F, 1.5F, 1F, -3F, -1F, 0F, -13F, -1F, 1F, -8F, -2F, 1F, -3F, -2F, 1.5F); // Box 205
		leftWingModel[1].setRotationPoint(-56F, -22F, -62.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 36, 6, 83, 0F,-3F, 4F, 0F, -13F, 3F, 0F, -1F, -1F, 0F, 10F, -1F, 1F, 0.5F, -8.5F, 0F, -6F, -7.5F, 0F, 9F, 0.5F, 0F, 13.5F, 0.5F, 1F); // Box 206
		leftWingModel[2].setRotationPoint(-43F, -29F, -146.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 36, 6, 83, 0F,0.5F, 9.5F, 0F, -6F, 8.5F, 0F, 9F, 0.5F, 0F, 13.5F, 0.5F, 1F, -3F, -13.5F, 0F, -13F, -13F, 0F, -1F, -2F, 0F, 10F, -2F, 1F); // Box 207
		leftWingModel[3].setRotationPoint(-43F, -22F, -146.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,-2F, 0.5F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 5F, 0F, 0F, 7F, 0.5F, 0F, 3.5F, -0.5F, 0F); // Box 208
		leftWingModel[4].setRotationPoint(-40F, -33F, -151.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,1.5F, 2F, 0F, 5F, 1F, 0F, 7F, 0.5F, 0F, 3.5F, 1.5F, 0F, -2F, -2.5F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 209
		leftWingModel[5].setRotationPoint(-40F, -30F, -151.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,-8F, 0.2F, 0F, -5F, -0.2F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -7F, -1F, 1F, -4F, -0.5F, 1F, 5F, 0F, 0F, 1.5F, -1F, 0F); // Box 210
		leftWingModel[6].setRotationPoint(-40F, -33F, -158.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,-7F, 1F, 1F, -4F, 0.5F, 1F, 5F, 0F, 0F, 1.5F, 1F, 0F, -8F, -1.8F, 0F, -5F, -1.2F, 0F, -2F, -1F, 0F, -2F, -1.5F, 0F); // Box 211
		leftWingModel[7].setRotationPoint(-40F, -31F, -158.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[8].setRotationPoint(-83F, -29F, -61.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftWingModel[9].setRotationPoint(-83F, -35F, -61.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 226
		leftWingModel[10].setRotationPoint(-83F, -16F, -61.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 227
		leftWingModel[11].setRotationPoint(-90F, -29F, -61.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 228
		leftWingModel[12].setRotationPoint(-90F, -35F, -61.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 229
		leftWingModel[13].setRotationPoint(-90F, -16F, -61.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 230
		leftWingModel[14].setRotationPoint(-90F, -29F, -45.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 11, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftWingModel[15].setRotationPoint(-67F, -29F, -60.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftWingModel[16].setRotationPoint(-67F, -34F, -60.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 233
		leftWingModel[17].setRotationPoint(-67F, -16F, -60.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 16, 13, 22, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 235
		leftWingModel[18].setRotationPoint(-56F, -29F, -60.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, -8F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 236
		leftWingModel[19].setRotationPoint(-56F, -34F, -60.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 237
		leftWingModel[20].setRotationPoint(-56F, -16F, -60.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 238
		leftWingModel[21].setRotationPoint(-40F, -32F, -56.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 239
		leftWingModel[22].setRotationPoint(-40F, -18F, -56.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 26, 8, 14, 0F,0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 240
		leftWingModel[23].setRotationPoint(-40F, -27F, -56.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 241
		leftWingModel[24].setRotationPoint(-98F, -24.5F, -51.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftWingModel[25].setRotationPoint(-101F, -24.5F, -51.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 243
		leftWingModel[26].setRotationPoint(-103.5F, -24.5F, -51.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftWingModel[27].setRotationPoint(-74F, -40F, -52.5F);
		leftWingModel[27].rotateAngleZ = -0.05235988F;

		leftWingModel[28].addShapeBox(7F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, 3F, 0F, 0F, 3F, 0F); // Box 245
		leftWingModel[28].setRotationPoint(-74F, -40F, -52.5F);
		leftWingModel[28].rotateAngleZ = -0.05235988F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 283
		rightWingModel[1] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 284
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 285
		rightWingModel[3] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 286
		rightWingModel[4] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 287
		rightWingModel[5] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 288
		rightWingModel[6] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 289
		rightWingModel[7] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 290
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 291
		rightWingModel[9] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 292
		rightWingModel[10] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 293
		rightWingModel[11] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 294
		rightWingModel[12] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 295
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 296
		rightWingModel[14] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 297
		rightWingModel[15] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 298
		rightWingModel[16] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 299
		rightWingModel[17] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 300
		rightWingModel[18] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 301
		rightWingModel[19] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Box 302
		rightWingModel[20] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 303
		rightWingModel[21] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 304
		rightWingModel[22] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 305
		rightWingModel[23] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Box 306
		rightWingModel[24] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 307
		rightWingModel[25] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 308
		rightWingModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 309
		rightWingModel[27] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 310
		rightWingModel[28] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 311

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 61, 6, 38, 0F,-2F, 0F, 0.5F, -8F, 0F, 1F, -13F, -1F, 1F, -3F, -1F, 0F, 1F, -0.5F, 1F, 2F, -0.5F, 1F, -3F, 0.5F, 1F, 0.5F, 0.5F, 0F); // Box 283
		rightWingModel[0].setRotationPoint(-56F, -29F, 24.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 61, 5, 37, 0F,1F, 1.5F, 1F, 2F, 1.5F, 1F, -3F, 0.5F, 1F, 0.5F, 0.5F, 0F, -3F, -2F, 1.5F, -8F, -2F, 1F, -13F, -1F, 1F, -3F, -1F, 0F); // Box 284
		rightWingModel[1].setRotationPoint(-56F, -22F, 25.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 36, 6, 83, 0F,10F, -1F, 1F, -1F, -1F, 0F, -13F, 3F, 0F, -3F, 4F, 0F, 13.5F, 0.5F, 1F, 9F, 0.5F, 0F, -6F, -7.5F, 0F, 0.5F, -8.5F, 0F); // Box 285
		rightWingModel[2].setRotationPoint(-43F, -29F, 63.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 36, 6, 83, 0F,13.5F, 0.5F, 1F, 9F, 0.5F, 0F, -6F, 8.5F, 0F, 0.5F, 9.5F, 0F, 10F, -2F, 1F, -1F, -2F, 0F, -13F, -13F, 0F, -3F, -13.5F, 0F); // Box 286
		rightWingModel[3].setRotationPoint(-43F, -22F, 63.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, 3.5F, -0.5F, 0F, 7F, 0.5F, 0F, 5F, 0F, 0F, 1.5F, -1F, 0F); // Box 287
		rightWingModel[4].setRotationPoint(-40F, -33F, 146.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,3.5F, 1.5F, 0F, 7F, 0.5F, 0F, 5F, 1F, 0F, 1.5F, 2F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2.5F, 0F); // Box 288
		rightWingModel[5].setRotationPoint(-40F, -30F, 146.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,-2F, 0.5F, 0F, -2F, -0.5F, 0F, -5F, -0.2F, 0F, -8F, 0.2F, 0F, 1.5F, -1F, 0F, 5F, 0F, 0F, -4F, -0.5F, 1F, -7F, -1F, 1F); // Box 289
		rightWingModel[6].setRotationPoint(-40F, -33F, 151.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,1.5F, 1F, 0F, 5F, 0F, 0F, -4F, 0.5F, 1F, -7F, 1F, 1F, -2F, -1.5F, 0F, -2F, -1F, 0F, -5F, -1.2F, 0F, -8F, -1.8F, 0F); // Box 290
		rightWingModel[7].setRotationPoint(-40F, -31F, 151.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 16, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightWingModel[8].setRotationPoint(-83F, -29F, 37.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightWingModel[9].setRotationPoint(-83F, -35F, 37.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 293
		rightWingModel[10].setRotationPoint(-83F, -16F, 37.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 294
		rightWingModel[11].setRotationPoint(-90F, -29F, 53.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 295
		rightWingModel[12].setRotationPoint(-90F, -35F, 37.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 296
		rightWingModel[13].setRotationPoint(-90F, -16F, 37.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 297
		rightWingModel[14].setRotationPoint(-90F, -29F, 37.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 11, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightWingModel[15].setRotationPoint(-67F, -29F, 38.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[16].setRotationPoint(-67F, -34F, 38.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 300
		rightWingModel[17].setRotationPoint(-67F, -16F, 38.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 16, 13, 22, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 301
		rightWingModel[18].setRotationPoint(-56F, -29F, 38.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, -8F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 302
		rightWingModel[19].setRotationPoint(-56F, -34F, 38.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 303
		rightWingModel[20].setRotationPoint(-56F, -16F, 38.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 304
		rightWingModel[21].setRotationPoint(-40F, -32F, 42.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 305
		rightWingModel[22].setRotationPoint(-40F, -18F, 42.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 26, 8, 14, 0F,0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 306
		rightWingModel[23].setRotationPoint(-40F, -27F, 42.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 307
		rightWingModel[24].setRotationPoint(-98F, -24.5F, 47.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[25].setRotationPoint(-101F, -24.5F, 47.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 309
		rightWingModel[26].setRotationPoint(-103.5F, -24.5F, 47.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingModel[27].setRotationPoint(-74F, -40F, 46.5F);
		rightWingModel[27].rotateAngleZ = -0.05235988F;

		rightWingModel[28].addShapeBox(7F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, 3F, 0F, 0F, 3F, 0F); // Box 311
		rightWingModel[28].setRotationPoint(-74F, -40F, 46.5F);
		rightWingModel[28].rotateAngleZ = -0.05235988F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 192
		yawFlapModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 193
		yawFlapModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 194
		yawFlapModel[3] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 195
		yawFlapModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 196
		yawFlapModel[5] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 197
		yawFlapModel[6] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 198
		yawFlapModel[7] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 199

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 16, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		yawFlapModel[0].setRotationPoint(115F, -55F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 16, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		yawFlapModel[1].setRotationPoint(115F, -61F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -0.5F, 13, 5, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		yawFlapModel[2].setRotationPoint(115F, -66F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, -0.5F, 9, 2, 1, 0F,-3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		yawFlapModel[3].setRotationPoint(115F, -68F, 0F);

		yawFlapModel[4].addShapeBox(-6.5F, -1F, -0.5F, 6, 17, 1, 0F,0F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 196
		yawFlapModel[4].setRotationPoint(115F, -61F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, -0.5F, 16, 9, 1, 0F,0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 197
		yawFlapModel[5].setRotationPoint(115F, -38F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, -0.5F, 16, 5, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		yawFlapModel[6].setRotationPoint(115F, -29F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, -0.5F, 12, 5, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -2F, 0F, -3.5F, -2F, 0F, 0F, -0.5F, 0F); // Box 199
		yawFlapModel[7].setRotationPoint(115F, -24F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 218
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 219
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 220

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 6F); // Box 218
		pitchFlapLeftModel[0].setRotationPoint(114F, -36.5F, -37F);

		pitchFlapLeftModel[1].addShapeBox(0F, -1F, 0F, 9, 2, 13, 0F,0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		pitchFlapLeftModel[1].setRotationPoint(114F, -36.5F, -50F);

		pitchFlapLeftModel[2].addShapeBox(-3F, -1F, 0F, 3, 2, 13, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		pitchFlapLeftModel[2].setRotationPoint(114F, -36.5F, -50F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 312
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 313
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 314

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 30, 0F,0F, 0F, 6F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		pitchFlapRightModel[0].setRotationPoint(114F, -36.5F, 7F);

		pitchFlapRightModel[1].addShapeBox(0F, -1F, 0F, 9, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F); // Box 313
		pitchFlapRightModel[1].setRotationPoint(114F, -36.5F, 37F);

		pitchFlapRightModel[2].addShapeBox(-3F, -1F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 314
		pitchFlapRightModel[2].setRotationPoint(114F, -36.5F, 37F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 246
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 247
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 248
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 249
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 250

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 246
		leftWingWheelModel[0].setRotationPoint(-67F, 5F, -52.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingWheelModel[1].setRotationPoint(-67F, 0F, -52.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingWheelModel[2].setRotationPoint(-67F, -5F, -52.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingWheelModel[3].setRotationPoint(-61F, -13F, -53.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[4].setRotationPoint(-61F, -13F, -46.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 278
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 279
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 280
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 281
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 282

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 278
		rightWingWheelModel[0].setRotationPoint(-67F, 5F, 46.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingWheelModel[1].setRotationPoint(-67F, 0F, 46.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingWheelModel[2].setRotationPoint(-67F, -5F, 46.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingWheelModel[3].setRotationPoint(-61F, -13F, 52.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightWingWheelModel[4].setRotationPoint(-61F, -13F, 45.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-95F, -22.5F, -49.5F);
		propellerModels[1] = makeProp2(-95F, -22.5F, -49.5F);
		propellerModels[2] = makeProp3(-95F, -22.5F, 49.5F);
		propellerModels[3] = makeProp4(-95F, -22.5F, 49.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[0].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[1].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[2].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[0].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[1].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[2].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 2, 343, textureX, textureY);
		prop[0].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[1].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[2].addBox(-2F, -4F, -1.5F, 4, 4, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 26, 343, textureX, textureY);
		prop[0].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[1].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[2].addBox(-1F, -30F, -1F, 2, 30, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}