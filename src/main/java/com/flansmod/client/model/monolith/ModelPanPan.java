//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanPan extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPanPan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];
		turretModel = new ModelRendererTurbo[8];
		barrelModel = new ModelRendererTurbo[9];
		leftFrontWheelModel = new ModelRendererTurbo[9];
		rightFrontWheelModel = new ModelRendererTurbo[9];
		leftBackWheelModel = new ModelRendererTurbo[9];
		rightBackWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 77
		bodyModel[31] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 81
		bodyModel[32] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 82
		bodyModel[33] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 83
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 85
		bodyModel[36] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 86
		bodyModel[37] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 87
		bodyModel[38] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 88
		bodyModel[39] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 89
		bodyModel[40] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 90
		bodyModel[41] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 91
		bodyModel[42] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 92
		bodyModel[43] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 93
		bodyModel[44] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 94
		bodyModel[45] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 95
		bodyModel[46] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 96
		bodyModel[47] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 97
		bodyModel[48] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 98
		bodyModel[49] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 99
		bodyModel[50] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 100
		bodyModel[51] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 101
		bodyModel[52] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 102
		bodyModel[53] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 104
		bodyModel[55] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 107
		bodyModel[57] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 109
		bodyModel[59] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 112
		bodyModel[60] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 113
		bodyModel[61] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 114
		bodyModel[62] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 115

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 18, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-7F, -17.55F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 18, 30, 0F,0F, 0F, 0F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, -7.5F, -0.5F, 2.5F, -7.5F, 0F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(7F, -17.55F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 16, 15, 0F,0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(14.5F, -13.05F, -7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 16, 15, 0F,-0.2F, 0.2F, 0F, 0F, -7.6F, 0F, 0F, -7.6F, 0F, -0.2F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.6F, 0F); // Box 12
		bodyModel[3].setRotationPoint(22F, -13.05F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 18, 30, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, -2F); // Box 13
		bodyModel[4].setRotationPoint(-16F, -17.55F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 18, 26, 0F,0F, -6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.6F, 0F, 0.9F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.9F, -0.6F); // Box 14
		bodyModel[5].setRotationPoint(-18F, -17.55F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 12, 26, 0F,0F, 0F, -5.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -5.4F, 1F, -2.3F, -6F, 0F, 0.9F, -0.6F, 0F, 0.9F, -0.6F, 1F, -2.3F, -6F); // Box 15
		bodyModel[6].setRotationPoint(-47F, -11.55F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 15, 0F,0F, 0.6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F); // Box 16
		bodyModel[7].setRotationPoint(14.5F, 3.55F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F,0F, 0.6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.6F, 0F, 1.5F, -0.4F, 0F, -5F, -0.3F, 0F, -5F, -0.3F, 0F, 1.5F, -0.4F, 0F); // Box 17
		bodyModel[8].setRotationPoint(22F, 3.95F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 15, 0F,0F, 0.2F, 0F, -1.8F, -0.2F, 0F, -1.8F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0F, 0.4F, 0F); // Box 18
		bodyModel[9].setRotationPoint(14.5F, -17.55F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 6, 13, 0F,0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 10F, 1F, 0.5F, 10F, 0F, 0.5F, 11F, 0F, 0.5F, 11F, 1F, 0.5F, 10F); // Box 19
		bodyModel[10].setRotationPoint(-46.8F, -11.45F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 3, 33, 0F,1F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 1F, 0.5F, 0F, 1F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 1F, -0.5F, -10F); // Box 20
		bodyModel[11].setRotationPoint(-46.8F, -4.45F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 1.5F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F, 0F, 1.5F, 10F); // Box 21
		bodyModel[12].setRotationPoint(-41.4F, -11.48F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F); // Box 22
		bodyModel[13].setRotationPoint(-36.3F, -11.48F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 10F); // Box 23
		bodyModel[14].setRotationPoint(-26.3F, -11.48F, -8.5F);
		bodyModel[14].rotateAngleZ = -0.85521133F;

		bodyModel[15].addShapeBox(6F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 10F, 0F, 0F, 9.3F, 0F, 0F, 9.3F, 0F, 0F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 9.3F, 0F, 0.3F, 9.3F, 0F, 0.3F, 10F); // Box 24
		bodyModel[15].setRotationPoint(-26.3F, -11.48F, -8.5F);
		bodyModel[15].rotateAngleZ = -0.85521133F;

		bodyModel[16].addShapeBox(8F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 9.3F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 9.3F, 0F, 0.3F, 9.3F, 0F, 0.3F, 7.5F, 0F, 0.3F, 7.5F, 0F, 0.3F, 9.3F); // Box 25
		bodyModel[16].setRotationPoint(-26.3F, -11.48F, -8.5F);
		bodyModel[16].rotateAngleZ = -0.85521133F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0.3F, 10F, 0F, 0.3F, 6F, 0F, 0.3F, 6F, 0F, 0.3F, 10F, -0.8F, -0.2F, 10F, 0F, 0F, 6F, 0F, 0F, 6F, -0.8F, -0.2F, 10F); // Box 26
		bodyModel[17].setRotationPoint(-20F, -4F, -6F);
		bodyModel[17].rotateAngleZ = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 27
		bodyModel[18].setRotationPoint(19F, -11.48F, -18F);

		bodyModel[19].addShapeBox(-8F, 0F, 0F, 8, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 28
		bodyModel[19].setRotationPoint(19F, -11.48F, -18F);
		bodyModel[19].rotateAngleZ = 0.48869219F;

		bodyModel[20].addShapeBox(-13F, 0F, 0F, 5, 1, 36, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -2F); // Box 29
		bodyModel[20].setRotationPoint(19F, -11.48F, -18F);
		bodyModel[20].rotateAngleZ = 0.48869219F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 30
		bodyModel[21].setRotationPoint(26F, -11.48F, -18F);
		bodyModel[21].rotateAngleZ = -0.2268928F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 31
		bodyModel[22].setRotationPoint(28.8F, -10.8F, -18F);
		bodyModel[22].rotateAngleZ = -0.52359878F;

		bodyModel[23].addShapeBox(7F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, -1.5F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 32
		bodyModel[23].setRotationPoint(28.8F, -10.8F, -18F);
		bodyModel[23].rotateAngleZ = -0.52359878F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 33
		bodyModel[24].setRotationPoint(19F, -11.48F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 34
		bodyModel[25].setRotationPoint(26F, -11.48F, 7F);
		bodyModel[25].rotateAngleZ = -0.2268928F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 35
		bodyModel[26].setRotationPoint(28.8F, -10.8F, 7F);
		bodyModel[26].rotateAngleZ = -0.52359878F;

		bodyModel[27].addShapeBox(7F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, 0F); // Box 36
		bodyModel[27].setRotationPoint(28.8F, -10.8F, 7F);
		bodyModel[27].rotateAngleZ = -0.52359878F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, -1F, -0.3F, -0.3F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(36.5F, -5.8F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.4F, -0.5F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 38
		bodyModel[29].setRotationPoint(36.5F, -5.8F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.8F, -0.2F, 10F, 0F, 0F, 6F, 0F, 0F, 6F, -0.8F, -0.2F, 10F, 0F, 0.3F, 10F, 0F, 0.3F, 6F, 0F, 0.3F, 6F, 0F, 0.3F, 10F); // Box 77
		bodyModel[30].setRotationPoint(9F, -5F, -6F);
		bodyModel[30].rotateAngleZ = -1.57079633F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[31].setRotationPoint(20.2F, -17.55F, -5.4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[32].setRotationPoint(20.2F, -17.55F, 3.4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 83
		bodyModel[33].setRotationPoint(20F, -17F, -5.5F);
		bodyModel[33].rotateAngleZ = 0.34906585F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[34].setRotationPoint(-40.1F, -17.48F, 14.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.6F, 45F, -0.4F, -1.4F, 45F, -0.4F, -1.4F, 45F, -0.4F, 0.6F, 45F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 85
		bodyModel[35].setRotationPoint(-39.6F, -24.48F, 15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[36].setRotationPoint(-16.5F, -17.5F, 0.5F);
		bodyModel[36].rotateAngleZ = -0.34906585F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[37].setRotationPoint(-16.3F, -18.05F, 0.6F);
		bodyModel[37].rotateAngleZ = -0.6981317F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[38].setRotationPoint(-16.3F, -18.05F, 9.4F);
		bodyModel[38].rotateAngleZ = -0.6981317F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[39].setRotationPoint(-16.5F, -17.5F, -11.5F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[40].setRotationPoint(-16.3F, -18.05F, -2.6F);
		bodyModel[40].rotateAngleZ = -0.6981317F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[41].setRotationPoint(-16.3F, -18.05F, -11.4F);
		bodyModel[41].rotateAngleZ = -0.6981317F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 14, 4, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 92
		bodyModel[42].setRotationPoint(-7F, 0.45F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 4, 30, 0F,0F, 0F, 0F, -0.5F, -2.5F, -7.5F, -0.5F, -2.5F, -7.5F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, -1.4F, -7.5F, -0.5F, -1.4F, -7.5F, 0F, 0F, -9F); // Box 93
		bodyModel[43].setRotationPoint(7F, 0.45F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 33, 4, 30, 0F,0F, 1.5F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -6.5F, 0F, -1.5F, -6.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1.5F, -6.5F); // Box 94
		bodyModel[44].setRotationPoint(-40F, 0.45F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0F, -4F, -0.5F, 0.7F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, -4F, -0.5F, 0.7F); // Box 95
		bodyModel[45].setRotationPoint(-48F, -2F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[46].setRotationPoint(-6.5F, -17F, -15.2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[47].setRotationPoint(-7F, -16.5F, -15.4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[48].setRotationPoint(-7F, -11.5F, -15.4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[49].setRotationPoint(-7F, -6.5F, -15.4F);

		bodyModel[50].addShapeBox(-5F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 100
		bodyModel[50].setRotationPoint(-10.5F, -17F, 13.5F);
		bodyModel[50].rotateAngleY = 0.17453293F;

		bodyModel[51].addShapeBox(-9F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 101
		bodyModel[51].setRotationPoint(-10.5F, -7F, 13.5F);
		bodyModel[51].rotateAngleY = 0.17453293F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[52].setRotationPoint(-11F, -16.5F, 13.8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[53].setRotationPoint(-11F, -11F, 13.8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[54].setRotationPoint(-11F, -5.5F, 13.8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 106
		bodyModel[55].setRotationPoint(33.8F, -8.5F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[56].setRotationPoint(33.2F, -7F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 108
		bodyModel[57].setRotationPoint(33.8F, -8.5F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[58].setRotationPoint(33.2F, -7F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 112
		bodyModel[59].setRotationPoint(22F, -1.05F, -14.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[60].setRotationPoint(22F, -1.05F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[61].setRotationPoint(-34F, -0.25F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 115
		bodyModel[62].setRotationPoint(-34F, -0.25F, -14.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 66
		turretModel[1] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 67
		turretModel[2] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 68
		turretModel[3] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 69
		turretModel[4] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 70
		turretModel[5] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 105
		turretModel[6] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 110
		turretModel[7] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 111

		turretModel[0].addShapeBox(0F, 0F, 0F, 9, 11, 20, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 3F, 0F, 4.5F, -1F, 0F, 4.5F, -1F, 0F, 4.5F, 3F, 0F, 4.5F); // Box 66
		turretModel[0].setRotationPoint(-4F, -28.55F, -10F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 3, 11, 20, 0F,0F, -0.8F, 0F, 0.9F, -1.2F, -2.5F, 0.9F, -1.2F, -3.5F, 0F, -0.8F, 0F, 1F, 0F, 4.5F, 5.5F, 0F, -1F, 3F, 0F, 0.5F, 1F, 0F, 4.5F); // Box 67
		turretModel[1].setRotationPoint(5F, -28.55F, -10F);

		turretModel[2].addShapeBox(-1F, 0F, 0F, 1, 11, 20, 0F,4.6F, -1.2F, -2.5F, -5F, -1.2F, -2.7F, -5F, -1.2F, -3.7F, 4.6F, -1.2F, -3.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3.5F, 2.5F, 0F, 0.5F); // Box 68
		turretModel[2].setRotationPoint(14.5F, -28.55F, -10F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 6, 11, 20, 0F,-2.5F, 0.4F, -4F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0.4F, -4F, 3F, 0F, -2F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 3F, 0F, -2F); // Box 69
		turretModel[3].setRotationPoint(-13F, -28.55F, -10F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0.2F, -0.2F, -1F, -0.7F, -0.2F, -1F, -0.7F, -0.2F, 0F, 0.2F, -0.2F, -1F, 1F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, -1F, 1F, -0.2F); // Box 70
		turretModel[4].setRotationPoint(9.5F, -26.55F, -2.5F);

		turretModel[5].addShapeBox(-1F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 105
		turretModel[5].setRotationPoint(14.5F, -19.55F, -8F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 110
		turretModel[6].setRotationPoint(-11F, -28.55F, -5.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 2F); // Box 111
		turretModel[7].setRotationPoint(-11F, -28.55F, 0.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 71
		barrelModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 72
		barrelModel[2] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 73
		barrelModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 74
		barrelModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 75
		barrelModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 76
		barrelModel[6] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 78
		barrelModel[7] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 79
		barrelModel[8] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 80

		barrelModel[0].addShapeBox(-0.7F, -1.2F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		barrelModel[0].setRotationPoint(10.5F, -22.6F, 0F);

		barrelModel[1].addShapeBox(5.3F, -1.2F, -1.5F, 4, 3, 3, 0F,0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 72
		barrelModel[1].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[2].addShapeBox(9.3F, -1.2F, -1.5F, 12, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 73
		barrelModel[2].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[3].addShapeBox(21.3F, -1.2F, -1.5F, 1, 3, 3, 0F,0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 74
		barrelModel[3].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[4].addShapeBox(22.3F, -1.2F, -1.5F, 1, 3, 3, 0F,0F, -0.8F, -0.8F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.8F, -0.8F); // Box 75
		barrelModel[4].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[5].addShapeBox(23.3F, -1.2F, -1.5F, 4, 3, 3, 0F,0F, -1F, -1F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -1F, -1F); // Box 76
		barrelModel[5].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[6].addShapeBox(0F, -0.2F, 2.5F, 8, 3, 4, 0F,0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, -1.2F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 78
		barrelModel[6].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[7].addShapeBox(0F, 1.2F, 2.5F, 8, 2, 4, 0F,0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F); // Box 79
		barrelModel[7].setRotationPoint(10.5F, -22.7F, 0F);

		barrelModel[8].addShapeBox(7.2F, 1.2F, 4F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 80
		barrelModel[8].setRotationPoint(10.5F, -22.7F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 7
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8

		leftFrontWheelModel[0].addShapeBox(-9.5F, -3F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		leftFrontWheelModel[0].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[1].addShapeBox(-9.5F, -9F, 0F, 19, 6, 2, 0F,-6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		leftFrontWheelModel[1].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[2].addShapeBox(-9.5F, 3F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F); // Box 2
		leftFrontWheelModel[2].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[3].addShapeBox(-9.5F, -3F, -2F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftFrontWheelModel[3].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[4].addShapeBox(-9.5F, -9F, -2F, 19, 6, 2, 0F,-6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftFrontWheelModel[4].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[5].addShapeBox(-9.5F, 3F, -2F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F); // Box 5
		leftFrontWheelModel[5].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[6].addShapeBox(-4F, -1.5F, 2F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 6
		leftFrontWheelModel[6].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[7].addShapeBox(-4F, -4.51F, 2F, 8, 3, 1, 0F,-3F, -0.5F, 0F, -3F, -0.5F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 7
		leftFrontWheelModel[7].setRotationPoint(23.5F, 0.7F, 15.8F);

		leftFrontWheelModel[8].addShapeBox(-4F, 1.49F, 2F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F); // Box 8
		leftFrontWheelModel[8].setRotationPoint(23.5F, 0.7F, 15.8F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 39
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 40
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 41
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 42
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 43
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 44
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 45
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 46
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 47

		rightFrontWheelModel[0].addShapeBox(-9.5F, -3F, 0F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightFrontWheelModel[0].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[1].addShapeBox(-9.5F, -9F, 0F, 19, 6, 2, 0F,-6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightFrontWheelModel[1].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[2].addShapeBox(-9.5F, 3F, 0F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F); // Box 41
		rightFrontWheelModel[2].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[3].addShapeBox(-9.5F, -3F, 2F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		rightFrontWheelModel[3].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[4].addShapeBox(-9.5F, -9F, 2F, 19, 6, 2, 0F,-6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		rightFrontWheelModel[4].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[5].addShapeBox(-9.5F, 3F, 2F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F); // Box 44
		rightFrontWheelModel[5].setRotationPoint(23.5F, 0.7F, -17.8F);

		rightFrontWheelModel[6].addShapeBox(-4F, -1.5F, -2F, 8, 3, 1, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightFrontWheelModel[6].setRotationPoint(23.5F, 0.7F, -16.8F);

		rightFrontWheelModel[7].addShapeBox(-4F, -4.51F, -2F, 8, 3, 1, 0F,-2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightFrontWheelModel[7].setRotationPoint(23.5F, 0.7F, -16.8F);

		rightFrontWheelModel[8].addShapeBox(-4F, 1.49F, -2F, 8, 3, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 47
		rightFrontWheelModel[8].setRotationPoint(23.5F, 0.7F, -16.8F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 57
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 58
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 59
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 60
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 61
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 62
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 63
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 64
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 65

		leftBackWheelModel[0].addShapeBox(-4F, -4.51F, 2F, 8, 3, 1, 0F,-3F, -0.5F, 0F, -3F, -0.5F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 57
		leftBackWheelModel[0].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[1].addShapeBox(-4F, -1.5F, 2F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 58
		leftBackWheelModel[1].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[2].addShapeBox(-4F, 1.49F, 2F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F); // Box 59
		leftBackWheelModel[2].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[3].addShapeBox(-9.5F, -9F, 0F, 19, 6, 2, 0F,-6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 60
		leftBackWheelModel[3].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[4].addShapeBox(-9.5F, -3F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		leftBackWheelModel[4].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[5].addShapeBox(-9.5F, 3F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F); // Box 62
		leftBackWheelModel[5].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[6].addShapeBox(-9.5F, -9F, -2F, 19, 6, 2, 0F,-6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftBackWheelModel[6].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[7].addShapeBox(-9.5F, -3F, -2F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftBackWheelModel[7].setRotationPoint(-31.5F, 1F, 15.3F);

		leftBackWheelModel[8].addShapeBox(-9.5F, 3F, -2F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F); // Box 65
		leftBackWheelModel[8].setRotationPoint(-31.5F, 1F, 15.3F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 48
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 49
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 50
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 51
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 52
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 53
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 54
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 55
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 56

		rightBackWheelModel[0].addShapeBox(-4F, -4.51F, -2F, 8, 3, 1, 0F,-2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightBackWheelModel[0].setRotationPoint(-31.5F, 1F, -16.3F);

		rightBackWheelModel[1].addShapeBox(-4F, -1.5F, -2F, 8, 3, 1, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[1].setRotationPoint(-31.5F, 1F, -16.3F);

		rightBackWheelModel[2].addShapeBox(-4F, 1.49F, -2F, 8, 3, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, -2.5F, 0F, -2.8F, -2.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 50
		rightBackWheelModel[2].setRotationPoint(-31.5F, 1F, -16.3F);

		rightBackWheelModel[3].addShapeBox(-9.5F, -9F, 0F, 19, 6, 2, 0F,-6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightBackWheelModel[3].setRotationPoint(-31.5F, 1F, -17.3F);

		rightBackWheelModel[4].addShapeBox(-9.5F, -3F, 0F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightBackWheelModel[4].setRotationPoint(-31.5F, 1F, -17.3F);

		rightBackWheelModel[5].addShapeBox(-9.5F, 3F, 0F, 19, 6, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F); // Box 53
		rightBackWheelModel[5].setRotationPoint(-31.5F, 1F, -17.3F);

		rightBackWheelModel[6].addShapeBox(-9.5F, -9F, 2F, 19, 6, 2, 0F,-6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 54
		rightBackWheelModel[6].setRotationPoint(-31.5F, 1F, -17.3F);

		rightBackWheelModel[7].addShapeBox(-9.5F, -3F, 2F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 55
		rightBackWheelModel[7].setRotationPoint(-31.5F, 1F, -17.3F);

		rightBackWheelModel[8].addShapeBox(-9.5F, 3F, 2F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0.5F, 0F, -6F, 0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F); // Box 56
		rightBackWheelModel[8].setRotationPoint(-31.5F, 1F, -17.3F);
	}
}