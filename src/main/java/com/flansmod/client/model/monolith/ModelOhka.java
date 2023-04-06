//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ohka
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOhka extends ModelPlane //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelOhka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];
		noseModel = new ModelRendererTurbo[11];
		tailModel = new ModelRendererTurbo[25];
		leftWingModel = new ModelRendererTurbo[2];
		rightWingModel = new ModelRendererTurbo[1];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[8];
		tailWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initbodyWheelModel_1();
		inittailWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 129
		bodyModel[1] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 130
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 131
		bodyModel[3] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 132
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 133
		bodyModel[5] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 134
		bodyModel[6] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 135
		bodyModel[7] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 137
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 138
		bodyModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 139
		bodyModel[10] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 140
		bodyModel[11] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 141
		bodyModel[12] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 142
		bodyModel[13] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 143
		bodyModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 144
		bodyModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 172
		bodyModel[16] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 173
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 174
		bodyModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 175
		bodyModel[19] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 176
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 177
		bodyModel[21] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 178
		bodyModel[22] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 179
		bodyModel[23] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 180
		bodyModel[24] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 181
		bodyModel[25] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 182
		bodyModel[26] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 183
		bodyModel[27] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 184
		bodyModel[28] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 185
		bodyModel[29] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 186
		bodyModel[30] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 187
		bodyModel[31] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 188
		bodyModel[32] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 189
		bodyModel[33] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 190
		bodyModel[34] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 191
		bodyModel[35] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 90
		bodyModel[36] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 91
		bodyModel[37] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 192
		bodyModel[38] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 193
		bodyModel[39] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 194
		bodyModel[40] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 195
		bodyModel[41] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 84
		bodyModel[43] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 85
		bodyModel[44] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 86
		bodyModel[45] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 87
		bodyModel[46] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 129
		bodyModel[0].setRotationPoint(-30.5F, -5.75F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, 0F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 130
		bodyModel[1].setRotationPoint(-30.5F, -11.25F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 5, 14, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 131
		bodyModel[2].setRotationPoint(-30.5F, -1.5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[3].setRotationPoint(-6.5F, 2.5F, -3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.5F, 4F, 0F, -0.5F, 4F); // Box 133
		bodyModel[4].setRotationPoint(-6.5F, -1.5F, -7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 134
		bodyModel[5].setRotationPoint(-6.5F, -1.5F, 6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[6].setRotationPoint(-6.5F, -6.25F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[7].setRotationPoint(-6.5F, -6.25F, 6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, -0.5F, 0F, 0F, -3F, 3.5F, 0F, -3F, -3.5F, 0F, -0.5F, 0F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F); // Box 138
		bodyModel[8].setRotationPoint(-6.5F, -12F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, -0.5F, 0F, 0F, -3F, -3.5F, 0F, -3F, 3.5F, 0F, -0.5F, 0F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F); // Box 139
		bodyModel[9].setRotationPoint(-6.5F, -12F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, -3F, 3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -3F, -3.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F); // Box 140
		bodyModel[10].setRotationPoint(1.5F, -12F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, -3F, -3.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -3F, 3.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F); // Box 141
		bodyModel[11].setRotationPoint(1.5F, -12F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 5, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[12].setRotationPoint(18.5F, -6.25F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F); // Box 143
		bodyModel[13].setRotationPoint(18.5F, -12.5F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 5, 6, 0F,0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[14].setRotationPoint(18.5F, -1.5F, -3F);

		bodyModel[15].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 172
		bodyModel[15].setRotationPoint(-1F, -16F, -2.5F);
		bodyModel[15].rotateAngleZ = -0.83775804F;

		bodyModel[16].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 173
		bodyModel[16].setRotationPoint(-1F, -16F, -2.5F);
		bodyModel[16].rotateAngleX = -0.41887902F;
		bodyModel[16].rotateAngleZ = 0.33161256F;

		bodyModel[17].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 174
		bodyModel[17].setRotationPoint(2.5F, -17.7F, 0F);
		bodyModel[17].rotateAngleX = -0.38397244F;

		bodyModel[18].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 175
		bodyModel[18].setRotationPoint(-1F, -16F, 2.5F);
		bodyModel[18].rotateAngleZ = -0.83775804F;

		bodyModel[19].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 176
		bodyModel[19].setRotationPoint(-1F, -16F, 2.5F);
		bodyModel[19].rotateAngleX = 0.41887902F;
		bodyModel[19].rotateAngleZ = 0.33161256F;

		bodyModel[20].addShapeBox(-0.5F, 0F, -0.5F, 4, 1, 1, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 177
		bodyModel[20].setRotationPoint(-1F, -16.75F, 0F);
		bodyModel[20].rotateAngleZ = 0.38397244F;

		bodyModel[21].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 178
		bodyModel[21].setRotationPoint(-1F, -16F, -2F);
		bodyModel[21].rotateAngleZ = -0.83775804F;

		bodyModel[22].addShapeBox(-0.5F, -0.5F, -2F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 179
		bodyModel[22].setRotationPoint(2.5F, -17.7F, 0F);
		bodyModel[22].rotateAngleX = 0.38397244F;

		bodyModel[23].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 180
		bodyModel[23].setRotationPoint(6.5F, -17.7F, 0F);
		bodyModel[23].rotateAngleX = -0.38397244F;

		bodyModel[24].addShapeBox(-0.5F, -0.5F, -2F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 181
		bodyModel[24].setRotationPoint(6.5F, -17.7F, 0F);
		bodyModel[24].rotateAngleX = 0.38397244F;

		bodyModel[25].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 182
		bodyModel[25].setRotationPoint(10F, -16.7F, 0F);
		bodyModel[25].rotateAngleX = -0.38397244F;

		bodyModel[26].addShapeBox(-0.5F, -0.5F, -2F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 183
		bodyModel[26].setRotationPoint(10F, -16.7F, 0F);
		bodyModel[26].rotateAngleX = 0.38397244F;

		bodyModel[27].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 184
		bodyModel[27].setRotationPoint(10F, -16F, 1.8F);
		bodyModel[27].rotateAngleX = 0.40142573F;
		bodyModel[27].rotateAngleZ = 0.12217305F;

		bodyModel[28].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 185
		bodyModel[28].setRotationPoint(6.5F, -17F, 1.8F);
		bodyModel[28].rotateAngleX = 0.40142573F;
		bodyModel[28].rotateAngleZ = 0.05235988F;

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 186
		bodyModel[29].setRotationPoint(2.5F, -17F, 1.8F);
		bodyModel[29].rotateAngleX = 0.4712389F;
		bodyModel[29].rotateAngleZ = 0.03490659F;

		bodyModel[30].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 187
		bodyModel[30].setRotationPoint(6.5F, -17F, -1.8F);
		bodyModel[30].rotateAngleX = -0.40142573F;
		bodyModel[30].rotateAngleZ = 0.05235988F;

		bodyModel[31].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 188
		bodyModel[31].setRotationPoint(2.5F, -17F, -1.8F);
		bodyModel[31].rotateAngleX = -0.4712389F;
		bodyModel[31].rotateAngleZ = 0.03490659F;

		bodyModel[32].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 189
		bodyModel[32].setRotationPoint(10F, -16F, -1.8F);
		bodyModel[32].rotateAngleX = -0.40142573F;
		bodyModel[32].rotateAngleZ = 0.12217305F;

		bodyModel[33].addShapeBox(-0.5F, 0F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 190
		bodyModel[33].setRotationPoint(3F, -18.1F, 0F);

		bodyModel[34].addShapeBox(-0.5F, 0F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 191
		bodyModel[34].setRotationPoint(7F, -18F, 0F);
		bodyModel[34].rotateAngleZ = -0.27925268F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[35].setRotationPoint(14F, -11F, -1.5F);
		bodyModel[35].rotateAngleZ = -0.12217305F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[36].setRotationPoint(3F, -5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 192
		bodyModel[37].setRotationPoint(14F, -11F, -4F);
		bodyModel[37].rotateAngleZ = -0.12217305F;

		bodyModel[38].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 193
		bodyModel[38].setRotationPoint(8F, -5F, -4F);
		bodyModel[38].rotateAngleZ = -0.12217305F;

		bodyModel[39].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 194
		bodyModel[39].setRotationPoint(8F, -5F, 3F);
		bodyModel[39].rotateAngleZ = -0.12217305F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 195
		bodyModel[40].setRotationPoint(14F, -11F, 3F);
		bodyModel[40].rotateAngleZ = -0.12217305F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 83
		bodyModel[41].setRotationPoint(-26F, -13.5F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[42].setRotationPoint(-9F, -13F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[43].setRotationPoint(-9F, -14.6F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[44].setRotationPoint(-9F, -14.1F, 0.05F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[45].setRotationPoint(-9F, -13.5F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[46].setRotationPoint(-9F, -14.1F, -1F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		noseModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 120
		noseModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 121
		noseModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 122
		noseModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 123
		noseModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 124
		noseModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 125
		noseModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 126
		noseModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 127
		noseModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 128
		noseModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 171

		noseModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, 0F, 1.25F, 1.25F, 0F, 1.25F, 1.25F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 1.25F, 1.25F, 0F, 1.25F, 1.25F, -0.2F, -0.2F, -0.2F); // Box 119
		noseModel[0].setRotationPoint(-60.5F, -4.5F, -1F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, 0.25F); // Box 120
		noseModel[1].setRotationPoint(-59.5F, -5.5F, -2F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0.25F); // Box 121
		noseModel[2].setRotationPoint(-59.5F, -7.5F, -2F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0.25F, -1.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -1.5F, -0.5F, -0.5F); // Box 122
		noseModel[3].setRotationPoint(-59.5F, -1.5F, -2F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0.25F, 2.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, 2.5F); // Box 123
		noseModel[4].setRotationPoint(-55.5F, -5.5F, -2F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, -1.5F, -0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1.5F, -0.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 2.5F); // Box 124
		noseModel[5].setRotationPoint(-55.5F, -9.5F, -2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, -0.25F, 2.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 4.5F, 0F, -0.25F, 2.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1.5F, -0.5F); // Box 125
		noseModel[6].setRotationPoint(-55.5F, -1.5F, -2F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 126
		noseModel[7].setRotationPoint(-43.5F, -5.75F, -6.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 0.25F, -4F, 0F, 1.2F, -3.5F, 0F, 1.2F, -3.5F, 0F, 0.25F, -4F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F); // Box 127
		noseModel[8].setRotationPoint(-43.5F, -10F, -6.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F); // Box 128
		noseModel[9].setRotationPoint(-43.5F, -1F, -6.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		noseModel[10].setRotationPoint(-61F, -4F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 145
		tailModel[1] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 146
		tailModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 147
		tailModel[3] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 148
		tailModel[4] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 149
		tailModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 150
		tailModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 151
		tailModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
		tailModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 153
		tailModel[9] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 154
		tailModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 155
		tailModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 156
		tailModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 157
		tailModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 158
		tailModel[14] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 161
		tailModel[15] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 165
		tailModel[16] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 166
		tailModel[17] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 167
		tailModel[18] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 168
		tailModel[19] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 169
		tailModel[20] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 219
		tailModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 220
		tailModel[22] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 221
		tailModel[23] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 222
		tailModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 223

		tailModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[0].setRotationPoint(41.5F, -12.25F, -21F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 146
		tailModel[1].setRotationPoint(39.5F, -6.25F, -7.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 13, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.75F, -4.5F, 0F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, -0.75F, -4.5F); // Box 147
		tailModel[2].setRotationPoint(39.5F, -1.25F, -7.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[3].setRotationPoint(52.5F, -7.25F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		tailModel[4].setRotationPoint(52.5F, -4F, -2.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tailModel[5].setRotationPoint(52.5F, -4F, 0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 1F, 0F, 0.1F, 1F, 0F, 0F, 0F, 0F); // Box 151
		tailModel[6].setRotationPoint(52.5F, -11F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 3.5F, -0.5F, 0.25F, 2.5F, -0.5F, 0.25F, -2.5F, 0F, 0.25F, -3.5F); // Box 152
		tailModel[7].setRotationPoint(52.5F, -11F, -3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3.5F, -0.5F, 0.25F, -2.5F, -0.5F, 0.25F, 2.5F, 0F, 0.25F, 3.5F); // Box 153
		tailModel[8].setRotationPoint(52.5F, -11F, 2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.25F, 1.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, 0.5F, 0F, 0.25F, -0.5F); // Box 154
		tailModel[9].setRotationPoint(52.5F, -5.5F, -5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.25F, -1.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, -0.5F, -1.5F, -0.25F, 0.5F, -1.5F, -0.25F, -0.5F, 0F, 0.25F, 0.5F); // Box 155
		tailModel[10].setRotationPoint(52.5F, -5.5F, 4F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 1F, 0.8F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 4.5F, 0F, 0.5F, 4.5F); // Box 156
		tailModel[11].setRotationPoint(52.5F, -1.25F, -5.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 1F, 0.8F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 4.5F, 0F, -0.2F, 4.5F, 0F, -0.2F, -4F, 0F, 0.5F, -4F); // Box 157
		tailModel[12].setRotationPoint(52.5F, -1.25F, 4.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[13].setRotationPoint(52.5F, 0.25F, -1.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 4.5F, 0F, -0.25F, 3.5F, 0F, -0.25F, 3.5F, 0F, -0.25F, 4.5F); // Box 161
		tailModel[14].setRotationPoint(39.5F, -12.5F, -3F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 165
		tailModel[15].setRotationPoint(41.5F, -16.25F, -22F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[16].setRotationPoint(44.5F, -18.25F, -22F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[17].setRotationPoint(41.5F, -18.25F, -22F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.7F, 0F); // Box 168
		tailModel[18].setRotationPoint(41.5F, -6F, -22F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 169
		tailModel[19].setRotationPoint(44.5F, -6F, -22F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 219
		tailModel[20].setRotationPoint(41.5F, -16.25F, 21F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		tailModel[21].setRotationPoint(44.5F, -18.25F, 21F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		tailModel[22].setRotationPoint(41.5F, -18.25F, 21F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.7F, 0F); // Box 222
		tailModel[23].setRotationPoint(41.5F, -6F, 21F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 223
		tailModel[24].setRotationPoint(44.5F, -6F, 21F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 159
		leftWingModel[1] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 160

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 4F, 1F, 4F, 4F, 1F); // Box 159
		leftWingModel[0].setRotationPoint(-22.5F, -5.75F, -36F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		leftWingModel[1].setRotationPoint(-35.5F, -3.5F, -21F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 218

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 29, 0F,4F, -3F, 0F, 7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 1F, 7F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingModel[0].setRotationPoint(-22.5F, -5.75F, 7F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 170
		yawFlapModel[1] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 232
		yawFlapModel[2] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 224

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 0.2F, 0F, 0.5F, -1.2F, -0.2F, 0.5F, -1.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1.2F, -0.2F, 0.5F, -1.2F, -0.2F, 0F, 0.2F, 0F); // Box 170
		yawFlapModel[0].setRotationPoint(48.5F, -18.6F, -21.5F);

		yawFlapModel[1].addShapeBox(0F, -0.95F, -5.5F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[1].setRotationPoint(-3F, 0.2F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 0.2F, 0F, 0.5F, -1.2F, -0.2F, 0.5F, -1.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1.2F, -0.2F, 0.5F, -1.2F, -0.2F, 0F, 0.2F, 0F); // Box 224
		yawFlapModel[2].setRotationPoint(48.5F, -18.6F, 21.5F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 163
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 3, 2, 16, 0F,0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F); // Box 163
		pitchFlapLeftModel[0].setRotationPoint(48.5F, -11.25F, -21F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -11F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[1].setRotationPoint(2F, 1F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 225

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 3, 2, 16, 0F,0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F); // Box 225
		pitchFlapRightModel[0].setRotationPoint(48.5F, -11.25F, 5F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 202
		bodyWheelModel[1] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 203
		bodyWheelModel[2] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 204
		bodyWheelModel[3] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 205
		bodyWheelModel[4] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 206
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 207
		bodyWheelModel[6] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 208
		bodyWheelModel[7] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 209

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyWheelModel[0].setRotationPoint(-46.5F, 7.5F, -2F);

		bodyWheelModel[1].addShapeBox(-12F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyWheelModel[1].setRotationPoint(-46.2F, 7.5F, -2F);
		bodyWheelModel[1].rotateAngleZ = -0.36651914F;

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyWheelModel[2].setRotationPoint(-10F, 4.5F, -1.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyWheelModel[3].setRotationPoint(-9.5F, 3.5F, -1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyWheelModel[4].setRotationPoint(-43.5F, 2.5F, -1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyWheelModel[5].setRotationPoint(-44F, 4.5F, -1.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyWheelModel[6].setRotationPoint(-27F, 4.5F, -1.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyWheelModel[7].setRotationPoint(-26.5F, 3.5F, -1F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 210
		tailWheelModel[1] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 211

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		tailWheelModel[0].setRotationPoint(37F, 2.5F, -1.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 211
		tailWheelModel[1].setRotationPoint(37F, 4.5F, -1.5F);
	}
}