//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGatlingCamel extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelGatlingCamel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		hipsModel = new ModelRendererTurbo[442];
		leftArmModel = new ModelRendererTurbo[97];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[86];
		rightLegModel = new ModelRendererTurbo[96];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 217, 82, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 206, 80, textureX, textureY); // Box 127
		bodyModel[2] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 128
		bodyModel[3] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 129
		bodyModel[4] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 130
		bodyModel[5] = new ModelRendererTurbo(this, 223, 85, textureX, textureY); // Box 174
		bodyModel[6] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 175
		bodyModel[7] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 177
		bodyModel[8] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 178
		bodyModel[9] = new ModelRendererTurbo(this, 230, 71, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 222, 81, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 223, 85, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 215, 89, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 230, 66, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 230, 66, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 225, 66, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(0.5F, 0F, -1F, 1, 1, 2, 0F,-.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[1].addShapeBox(-1F, 0F, -3F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[1].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[2].addShapeBox(-1F, 0F, 3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .25F, -.5F, 0F, .25F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .2F, 0F, -.5F, .2F); // Box 128
		bodyModel[2].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[3].addShapeBox(-1F, -1F, 3.5F, 2, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, .5F, -.3F, 0F, .5F, -.3F); // Box 129
		bodyModel[3].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[4].addShapeBox(-1F, -2F, 4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 130
		bodyModel[4].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[5].addShapeBox(-1F, -4F, 4F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[5].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[6].addShapeBox(-1.5F, -5F, 4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 175
		bodyModel[6].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[7].addShapeBox(-1.5F, -4F, 4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -1F, 0F, 0.2F); // Box 177
		bodyModel[7].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[8].addShapeBox(-1.5F, -6F, 4F, 3, 1, 1, 0F,-.8F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0.2F, -.8F, -.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 178
		bodyModel[8].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[9].addShapeBox(-5F, 0F, -1F, 4, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F); // Box 23
		bodyModel[9].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[10].addShapeBox(-1F, 0F, -4F, 2, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[10].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[11].addShapeBox(-1F, -1F, -4.5F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 28
		bodyModel[11].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[12].addShapeBox(-1F, -2F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[12].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[13].addShapeBox(-1F, -4F, -5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[14].addShapeBox(-1.5F, -4F, -5F, 3, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[14].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[15].addShapeBox(-1.5F, -5F, -5F, 3, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[15].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[16].addShapeBox(-1.5F, -6F, -5F, 3, 1, 1, 0F,-0.8F, -0.3F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[16].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[17].addShapeBox(-7F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 3
		bodyModel[17].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[18].addShapeBox(-6F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 4
		bodyModel[18].setRotationPoint(0F, -49.5F, 0F);

		bodyModel[19].addShapeBox(-6.5F, -4.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[19].setRotationPoint(0F, -49.5F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 1
		hipsModel[1] = new ModelRendererTurbo(this, 41, 29, textureX, textureY); // Box 2
		hipsModel[2] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 3
		hipsModel[3] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 4
		hipsModel[4] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 5
		hipsModel[5] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 6
		hipsModel[6] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 7
		hipsModel[7] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 8
		hipsModel[8] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 9
		hipsModel[9] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 11
		hipsModel[10] = new ModelRendererTurbo(this, 13, 11, textureX, textureY); // Box 12
		hipsModel[11] = new ModelRendererTurbo(this, 25, 11, textureX, textureY); // Box 13
		hipsModel[12] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 14
		hipsModel[13] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 15
		hipsModel[14] = new ModelRendererTurbo(this, 71, 11, textureX, textureY); // Box 16
		hipsModel[15] = new ModelRendererTurbo(this, 84, 11, textureX, textureY); // Box 17
		hipsModel[16] = new ModelRendererTurbo(this, 96, 11, textureX, textureY); // Box 18
		hipsModel[17] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 19
		hipsModel[18] = new ModelRendererTurbo(this, 13, 75, textureX, textureY); // Box 20
		hipsModel[19] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 22
		hipsModel[20] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 30
		hipsModel[21] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 36
		hipsModel[22] = new ModelRendererTurbo(this, 38, 74, textureX, textureY); // Box 37
		hipsModel[23] = new ModelRendererTurbo(this, 43, 74, textureX, textureY); // Box 38
		hipsModel[24] = new ModelRendererTurbo(this, 48, 74, textureX, textureY); // Box 39
		hipsModel[25] = new ModelRendererTurbo(this, 37, 80, textureX, textureY); // Box 44
		hipsModel[26] = new ModelRendererTurbo(this, 118, 83, textureX, textureY); // Box 76
		hipsModel[27] = new ModelRendererTurbo(this, 119, 59, textureX, textureY); // Box 79
		hipsModel[28] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 80
		hipsModel[29] = new ModelRendererTurbo(this, 119, 88, textureX, textureY); // Box 81
		hipsModel[30] = new ModelRendererTurbo(this, 119, 65, textureX, textureY); // Box 83
		hipsModel[31] = new ModelRendererTurbo(this, 118, 93, textureX, textureY); // Box 0
		hipsModel[32] = new ModelRendererTurbo(this, 118, 71, textureX, textureY); // Box 1
		hipsModel[33] = new ModelRendererTurbo(this, 118, 75, textureX, textureY); // Box 2
		hipsModel[34] = new ModelRendererTurbo(this, 118, 97, textureX, textureY); // Box 3
		hipsModel[35] = new ModelRendererTurbo(this, 118, 79, textureX, textureY); // Box 4
		hipsModel[36] = new ModelRendererTurbo(this, 118, 101, textureX, textureY); // Box 5
		hipsModel[37] = new ModelRendererTurbo(this, 112, 67, textureX, textureY); // Box 6
		hipsModel[38] = new ModelRendererTurbo(this, 112, 63, textureX, textureY); // Box 7
		hipsModel[39] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 0
		hipsModel[40] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 1
		hipsModel[41] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 2
		hipsModel[42] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 3
		hipsModel[43] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 4
		hipsModel[44] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 5
		hipsModel[45] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 7
		hipsModel[46] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 8
		hipsModel[47] = new ModelRendererTurbo(this, 25, 50, textureX, textureY); // Box 9
		hipsModel[48] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 10
		hipsModel[49] = new ModelRendererTurbo(this, 57, 50, textureX, textureY); // Box 11
		hipsModel[50] = new ModelRendererTurbo(this, 71, 50, textureX, textureY); // Box 12
		hipsModel[51] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 13
		hipsModel[52] = new ModelRendererTurbo(this, 96, 50, textureX, textureY); // Box 14
		hipsModel[53] = new ModelRendererTurbo(this, 96, 39, textureX, textureY); // Box 15
		hipsModel[54] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 16
		hipsModel[55] = new ModelRendererTurbo(this, 71, 39, textureX, textureY); // Box 17
		hipsModel[56] = new ModelRendererTurbo(this, 57, 39, textureX, textureY); // Box 18
		hipsModel[57] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Box 19
		hipsModel[58] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 20
		hipsModel[59] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 21
		hipsModel[60] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 22
		hipsModel[61] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Box 23
		hipsModel[62] = new ModelRendererTurbo(this, 13, 81, textureX, textureY); // Box 24
		hipsModel[63] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 25
		hipsModel[64] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 26
		hipsModel[65] = new ModelRendererTurbo(this, 13, 64, textureX, textureY); // Box 27
		hipsModel[66] = new ModelRendererTurbo(this, 25, 64, textureX, textureY); // Box 28
		hipsModel[67] = new ModelRendererTurbo(this, 41, 64, textureX, textureY); // Box 29
		hipsModel[68] = new ModelRendererTurbo(this, 57, 64, textureX, textureY); // Box 30
		hipsModel[69] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 31
		hipsModel[70] = new ModelRendererTurbo(this, 84, 64, textureX, textureY); // Box 32
		hipsModel[71] = new ModelRendererTurbo(this, 96, 64, textureX, textureY); // Box 33
		hipsModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 35
		hipsModel[73] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 6
		hipsModel[74] = new ModelRendererTurbo(this, 139, 40, textureX, textureY); // Box 7
		hipsModel[75] = new ModelRendererTurbo(this, 130, 40, textureX, textureY); // Box 8
		hipsModel[76] = new ModelRendererTurbo(this, 139, 35, textureX, textureY); // Box 9
		hipsModel[77] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 10
		hipsModel[78] = new ModelRendererTurbo(this, 139, 28, textureX, textureY); // Box 11
		hipsModel[79] = new ModelRendererTurbo(this, 130, 28, textureX, textureY); // Box 12
		hipsModel[80] = new ModelRendererTurbo(this, 139, 23, textureX, textureY); // Box 13
		hipsModel[81] = new ModelRendererTurbo(this, 130, 23, textureX, textureY); // Box 14
		hipsModel[82] = new ModelRendererTurbo(this, 139, 19, textureX, textureY); // Box 15
		hipsModel[83] = new ModelRendererTurbo(this, 130, 19, textureX, textureY); // Box 16
		hipsModel[84] = new ModelRendererTurbo(this, 139, 14, textureX, textureY); // Box 17
		hipsModel[85] = new ModelRendererTurbo(this, 130, 14, textureX, textureY); // Box 18
		hipsModel[86] = new ModelRendererTurbo(this, 139, 9, textureX, textureY); // Box 19
		hipsModel[87] = new ModelRendererTurbo(this, 130, 9, textureX, textureY); // Box 20
		hipsModel[88] = new ModelRendererTurbo(this, 134, 52, textureX, textureY); // Box 2
		hipsModel[89] = new ModelRendererTurbo(this, 127, 56, textureX, textureY); // Box 3
		hipsModel[90] = new ModelRendererTurbo(this, 134, 57, textureX, textureY); // Box 4
		hipsModel[91] = new ModelRendererTurbo(this, 119, 55, textureX, textureY); // Box 5
		hipsModel[92] = new ModelRendererTurbo(this, 118, 50, textureX, textureY); // Box 6
		hipsModel[93] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 7
		hipsModel[94] = new ModelRendererTurbo(this, 13, 11, textureX, textureY); // Box 8
		hipsModel[95] = new ModelRendererTurbo(this, 25, 11, textureX, textureY); // Box 9
		hipsModel[96] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 10
		hipsModel[97] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 11
		hipsModel[98] = new ModelRendererTurbo(this, 71, 11, textureX, textureY); // Box 12
		hipsModel[99] = new ModelRendererTurbo(this, 84, 11, textureX, textureY); // Box 13
		hipsModel[100] = new ModelRendererTurbo(this, 96, 11, textureX, textureY); // Box 14
		hipsModel[101] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 15
		hipsModel[102] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 16
		hipsModel[103] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 17
		hipsModel[104] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 18
		hipsModel[105] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 19
		hipsModel[106] = new ModelRendererTurbo(this, 41, 29, textureX, textureY); // Box 20
		hipsModel[107] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 21
		hipsModel[108] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 22
		hipsModel[109] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 23
		hipsModel[110] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 24
		hipsModel[111] = new ModelRendererTurbo(this, 96, 50, textureX, textureY); // Box 25
		hipsModel[112] = new ModelRendererTurbo(this, 96, 64, textureX, textureY); // Box 26
		hipsModel[113] = new ModelRendererTurbo(this, 96, 39, textureX, textureY); // Box 27
		hipsModel[114] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 28
		hipsModel[115] = new ModelRendererTurbo(this, 71, 39, textureX, textureY); // Box 29
		hipsModel[116] = new ModelRendererTurbo(this, 57, 39, textureX, textureY); // Box 30
		hipsModel[117] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Box 31
		hipsModel[118] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 32
		hipsModel[119] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 33
		hipsModel[120] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 34
		hipsModel[121] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 35
		hipsModel[122] = new ModelRendererTurbo(this, 25, 64, textureX, textureY); // Box 39
		hipsModel[123] = new ModelRendererTurbo(this, 41, 64, textureX, textureY); // Box 40
		hipsModel[124] = new ModelRendererTurbo(this, 57, 64, textureX, textureY); // Box 41
		hipsModel[125] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 42
		hipsModel[126] = new ModelRendererTurbo(this, 84, 64, textureX, textureY); // Box 43
		hipsModel[127] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 44
		hipsModel[128] = new ModelRendererTurbo(this, 25, 50, textureX, textureY); // Box 46
		hipsModel[129] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 47
		hipsModel[130] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 48
		hipsModel[131] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 49
		hipsModel[132] = new ModelRendererTurbo(this, 57, 50, textureX, textureY); // Box 50
		hipsModel[133] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 51
		hipsModel[134] = new ModelRendererTurbo(this, 71, 50, textureX, textureY); // Box 52
		hipsModel[135] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 53
		hipsModel[136] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 54
		hipsModel[137] = new ModelRendererTurbo(this, 13, 75, textureX, textureY); // Box 55
		hipsModel[138] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 56
		hipsModel[139] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 57
		hipsModel[140] = new ModelRendererTurbo(this, 13, 81, textureX, textureY); // Box 58
		hipsModel[141] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 59
		hipsModel[142] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Box 60
		hipsModel[143] = new ModelRendererTurbo(this, 37, 80, textureX, textureY); // Box 61
		hipsModel[144] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 62
		hipsModel[145] = new ModelRendererTurbo(this, 121, 40, textureX, textureY); // Box 63
		hipsModel[146] = new ModelRendererTurbo(this, 121, 34, textureX, textureY); // Box 64
		hipsModel[147] = new ModelRendererTurbo(this, 112, 34, textureX, textureY); // Box 66
		hipsModel[148] = new ModelRendererTurbo(this, 112, 28, textureX, textureY); // Box 67
		hipsModel[149] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 68
		hipsModel[150] = new ModelRendererTurbo(this, 112, 23, textureX, textureY); // Box 69
		hipsModel[151] = new ModelRendererTurbo(this, 112, 19, textureX, textureY); // Box 71
		hipsModel[152] = new ModelRendererTurbo(this, 112, 14, textureX, textureY); // Box 72
		hipsModel[153] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 73
		hipsModel[154] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 74
		hipsModel[155] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Box 75
		hipsModel[156] = new ModelRendererTurbo(this, 121, 4, textureX, textureY); // Box 76
		hipsModel[157] = new ModelRendererTurbo(this, 139, 40, textureX, textureY); // Box 77
		hipsModel[158] = new ModelRendererTurbo(this, 130, 40, textureX, textureY); // Box 78
		hipsModel[159] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 79
		hipsModel[160] = new ModelRendererTurbo(this, 139, 35, textureX, textureY); // Box 80
		hipsModel[161] = new ModelRendererTurbo(this, 139, 28, textureX, textureY); // Box 81
		hipsModel[162] = new ModelRendererTurbo(this, 130, 28, textureX, textureY); // Box 82
		hipsModel[163] = new ModelRendererTurbo(this, 139, 23, textureX, textureY); // Box 83
		hipsModel[164] = new ModelRendererTurbo(this, 130, 23, textureX, textureY); // Box 84
		hipsModel[165] = new ModelRendererTurbo(this, 130, 19, textureX, textureY); // Box 85
		hipsModel[166] = new ModelRendererTurbo(this, 139, 19, textureX, textureY); // Box 86
		hipsModel[167] = new ModelRendererTurbo(this, 139, 14, textureX, textureY); // Box 87
		hipsModel[168] = new ModelRendererTurbo(this, 139, 9, textureX, textureY); // Box 89
		hipsModel[169] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 91
		hipsModel[170] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 68
		hipsModel[171] = new ModelRendererTurbo(this, 13, 64, textureX, textureY); // Box 69
		hipsModel[172] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 70
		hipsModel[173] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 71
		hipsModel[174] = new ModelRendererTurbo(this, 127, 62, textureX, textureY); // Box 57
		hipsModel[175] = new ModelRendererTurbo(this, 132, 62, textureX, textureY); // Box 58
		hipsModel[176] = new ModelRendererTurbo(this, 112, 71, textureX, textureY); // Box 59
		hipsModel[177] = new ModelRendererTurbo(this, 128, 75, textureX, textureY); // Box 60
		hipsModel[178] = new ModelRendererTurbo(this, 126, 66, textureX, textureY); // Box 61
		hipsModel[179] = new ModelRendererTurbo(this, 128, 71, textureX, textureY); // Box 62
		hipsModel[180] = new ModelRendererTurbo(this, 119, 65, textureX, textureY); // Box 64
		hipsModel[181] = new ModelRendererTurbo(this, 119, 59, textureX, textureY); // Box 65
		hipsModel[182] = new ModelRendererTurbo(this, 119, 55, textureX, textureY); // Box 66
		hipsModel[183] = new ModelRendererTurbo(this, 130, 14, textureX, textureY); // Box 67
		hipsModel[184] = new ModelRendererTurbo(this, 130, 9, textureX, textureY); // Box 68
		hipsModel[185] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 69
		hipsModel[186] = new ModelRendererTurbo(this, 133, 71, textureX, textureY); // Box 70
		hipsModel[187] = new ModelRendererTurbo(this, 133, 76, textureX, textureY); // Box 71
		hipsModel[188] = new ModelRendererTurbo(this, 112, 75, textureX, textureY); // Box 76
		hipsModel[189] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 1
		hipsModel[190] = new ModelRendererTurbo(this, 112, 56, textureX, textureY); // Box 3
		hipsModel[191] = new ModelRendererTurbo(this, 112, 53, textureX, textureY); // Box 5
		hipsModel[192] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 6
		hipsModel[193] = new ModelRendererTurbo(this, 134, 52, textureX, textureY); // Box 7
		hipsModel[194] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 8
		hipsModel[195] = new ModelRendererTurbo(this, 134, 57, textureX, textureY); // Box 9
		hipsModel[196] = new ModelRendererTurbo(this, 127, 56, textureX, textureY); // Box 10
		hipsModel[197] = new ModelRendererTurbo(this, 127, 62, textureX, textureY); // Box 11
		hipsModel[198] = new ModelRendererTurbo(this, 132, 62, textureX, textureY); // Box 12
		hipsModel[199] = new ModelRendererTurbo(this, 126, 66, textureX, textureY); // Box 13
		hipsModel[200] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 14
		hipsModel[201] = new ModelRendererTurbo(this, 128, 71, textureX, textureY); // Box 15
		hipsModel[202] = new ModelRendererTurbo(this, 133, 71, textureX, textureY); // Box 16
		hipsModel[203] = new ModelRendererTurbo(this, 133, 76, textureX, textureY); // Box 17
		hipsModel[204] = new ModelRendererTurbo(this, 128, 75, textureX, textureY); // Box 18
		hipsModel[205] = new ModelRendererTurbo(this, 112, 67, textureX, textureY); // Box 19
		hipsModel[206] = new ModelRendererTurbo(this, 112, 63, textureX, textureY); // Box 20
		hipsModel[207] = new ModelRendererTurbo(this, 112, 75, textureX, textureY); // Box 21
		hipsModel[208] = new ModelRendererTurbo(this, 112, 53, textureX, textureY); // Box 22
		hipsModel[209] = new ModelRendererTurbo(this, 112, 56, textureX, textureY); // Box 23
		hipsModel[210] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 24
		hipsModel[211] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 25
		hipsModel[212] = new ModelRendererTurbo(this, 195, 9, textureX, textureY); // Box 3
		hipsModel[213] = new ModelRendererTurbo(this, 155, 10, textureX, textureY); // Box 4
		hipsModel[214] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 5
		hipsModel[215] = new ModelRendererTurbo(this, 155, 19, textureX, textureY); // Box 6
		hipsModel[216] = new ModelRendererTurbo(this, 155, 38, textureX, textureY); // Box 7
		hipsModel[217] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Box 8
		hipsModel[218] = new ModelRendererTurbo(this, 155, 26, textureX, textureY); // Box 9
		hipsModel[219] = new ModelRendererTurbo(this, 155, 23, textureX, textureY); // Box 10
		hipsModel[220] = new ModelRendererTurbo(this, 154, 44, textureX, textureY); // Box 11
		hipsModel[221] = new ModelRendererTurbo(this, 154, 47, textureX, textureY); // Box 12
		hipsModel[222] = new ModelRendererTurbo(this, 154, 50, textureX, textureY); // Box 13
		hipsModel[223] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 16
		hipsModel[224] = new ModelRendererTurbo(this, 154, 56, textureX, textureY); // Box 17
		hipsModel[225] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 18
		hipsModel[226] = new ModelRendererTurbo(this, 154, 62, textureX, textureY); // Box 19
		hipsModel[227] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 20
		hipsModel[228] = new ModelRendererTurbo(this, 154, 68, textureX, textureY); // Box 21
		hipsModel[229] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 22
		hipsModel[230] = new ModelRendererTurbo(this, 154, 78, textureX, textureY); // Box 23
		hipsModel[231] = new ModelRendererTurbo(this, 154, 74, textureX, textureY); // Box 24
		hipsModel[232] = new ModelRendererTurbo(this, 155, 10, textureX, textureY); // Box 25
		hipsModel[233] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 26
		hipsModel[234] = new ModelRendererTurbo(this, 155, 19, textureX, textureY); // Box 27
		hipsModel[235] = new ModelRendererTurbo(this, 154, 44, textureX, textureY); // Box 28
		hipsModel[236] = new ModelRendererTurbo(this, 154, 47, textureX, textureY); // Box 29
		hipsModel[237] = new ModelRendererTurbo(this, 154, 50, textureX, textureY); // Box 30
		hipsModel[238] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 31
		hipsModel[239] = new ModelRendererTurbo(this, 154, 56, textureX, textureY); // Box 32
		hipsModel[240] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 33
		hipsModel[241] = new ModelRendererTurbo(this, 154, 62, textureX, textureY); // Box 34
		hipsModel[242] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 35
		hipsModel[243] = new ModelRendererTurbo(this, 154, 68, textureX, textureY); // Box 36
		hipsModel[244] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 37
		hipsModel[245] = new ModelRendererTurbo(this, 154, 74, textureX, textureY); // Box 38
		hipsModel[246] = new ModelRendererTurbo(this, 195, 13, textureX, textureY); // Box 39
		hipsModel[247] = new ModelRendererTurbo(this, 195, 22, textureX, textureY); // Box 40
		hipsModel[248] = new ModelRendererTurbo(this, 182, 9, textureX, textureY); // Box 41
		hipsModel[249] = new ModelRendererTurbo(this, 182, 13, textureX, textureY); // Box 42
		hipsModel[250] = new ModelRendererTurbo(this, 182, 22, textureX, textureY); // Box 43
		hipsModel[251] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 44
		hipsModel[252] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 45
		hipsModel[253] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 46
		hipsModel[254] = new ModelRendererTurbo(this, 211, 13, textureX, textureY); // Box 47
		hipsModel[255] = new ModelRendererTurbo(this, 211, 22, textureX, textureY); // Box 48
		hipsModel[256] = new ModelRendererTurbo(this, 211, 9, textureX, textureY); // Box 49
		hipsModel[257] = new ModelRendererTurbo(this, 224, 9, textureX, textureY); // Box 50
		hipsModel[258] = new ModelRendererTurbo(this, 224, 13, textureX, textureY); // Box 51
		hipsModel[259] = new ModelRendererTurbo(this, 224, 22, textureX, textureY); // Box 52
		hipsModel[260] = new ModelRendererTurbo(this, 235, 9, textureX, textureY); // Box 53
		hipsModel[261] = new ModelRendererTurbo(this, 235, 13, textureX, textureY); // Box 54
		hipsModel[262] = new ModelRendererTurbo(this, 235, 22, textureX, textureY); // Box 55
		hipsModel[263] = new ModelRendererTurbo(this, 195, 29, textureX, textureY); // Box 57
		hipsModel[264] = new ModelRendererTurbo(this, 182, 29, textureX, textureY); // Box 62
		hipsModel[265] = new ModelRendererTurbo(this, 169, 29, textureX, textureY); // Box 63
		hipsModel[266] = new ModelRendererTurbo(this, 211, 29, textureX, textureY); // Box 0
		hipsModel[267] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 1
		hipsModel[268] = new ModelRendererTurbo(this, 235, 29, textureX, textureY); // Box 2
		hipsModel[269] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 0
		hipsModel[270] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 1
		hipsModel[271] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 2
		hipsModel[272] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 3
		hipsModel[273] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 4
		hipsModel[274] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 5
		hipsModel[275] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 6
		hipsModel[276] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 7
		hipsModel[277] = new ModelRendererTurbo(this, 169, 29, textureX, textureY); // Box 12
		hipsModel[278] = new ModelRendererTurbo(this, 182, 29, textureX, textureY); // Box 13
		hipsModel[279] = new ModelRendererTurbo(this, 195, 29, textureX, textureY); // Box 14
		hipsModel[280] = new ModelRendererTurbo(this, 211, 29, textureX, textureY); // Box 15
		hipsModel[281] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 16
		hipsModel[282] = new ModelRendererTurbo(this, 235, 29, textureX, textureY); // Box 17
		hipsModel[283] = new ModelRendererTurbo(this, 235, 22, textureX, textureY); // Box 18
		hipsModel[284] = new ModelRendererTurbo(this, 224, 22, textureX, textureY); // Box 19
		hipsModel[285] = new ModelRendererTurbo(this, 211, 22, textureX, textureY); // Box 20
		hipsModel[286] = new ModelRendererTurbo(this, 195, 22, textureX, textureY); // Box 21
		hipsModel[287] = new ModelRendererTurbo(this, 182, 22, textureX, textureY); // Box 22
		hipsModel[288] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 23
		hipsModel[289] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 24
		hipsModel[290] = new ModelRendererTurbo(this, 182, 13, textureX, textureY); // Box 25
		hipsModel[291] = new ModelRendererTurbo(this, 195, 13, textureX, textureY); // Box 26
		hipsModel[292] = new ModelRendererTurbo(this, 211, 13, textureX, textureY); // Box 27
		hipsModel[293] = new ModelRendererTurbo(this, 224, 13, textureX, textureY); // Box 28
		hipsModel[294] = new ModelRendererTurbo(this, 235, 13, textureX, textureY); // Box 29
		hipsModel[295] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 30
		hipsModel[296] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 31
		hipsModel[297] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 32
		hipsModel[298] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 33
		hipsModel[299] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 34
		hipsModel[300] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 35
		hipsModel[301] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 36
		hipsModel[302] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 37
		hipsModel[303] = new ModelRendererTurbo(this, 153, 108, textureX, textureY); // Box 39
		hipsModel[304] = new ModelRendererTurbo(this, 153, 115, textureX, textureY); // Box 40
		hipsModel[305] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 41
		hipsModel[306] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 42
		hipsModel[307] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 43
		hipsModel[308] = new ModelRendererTurbo(this, 192, 57, textureX, textureY); // Box 0
		hipsModel[309] = new ModelRendererTurbo(this, 192, 51, textureX, textureY); // Box 1
		hipsModel[310] = new ModelRendererTurbo(this, 192, 45, textureX, textureY); // Box 2
		hipsModel[311] = new ModelRendererTurbo(this, 192, 41, textureX, textureY); // Box 3
		hipsModel[312] = new ModelRendererTurbo(this, 183, 41, textureX, textureY); // Box 4
		hipsModel[313] = new ModelRendererTurbo(this, 183, 45, textureX, textureY); // Box 5
		hipsModel[314] = new ModelRendererTurbo(this, 183, 51, textureX, textureY); // Box 6
		hipsModel[315] = new ModelRendererTurbo(this, 183, 57, textureX, textureY); // Box 7
		hipsModel[316] = new ModelRendererTurbo(this, 174, 41, textureX, textureY); // Box 8
		hipsModel[317] = new ModelRendererTurbo(this, 174, 45, textureX, textureY); // Box 9
		hipsModel[318] = new ModelRendererTurbo(this, 174, 51, textureX, textureY); // Box 10
		hipsModel[319] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 11
		hipsModel[320] = new ModelRendererTurbo(this, 183, 41, textureX, textureY); // Box 0
		hipsModel[321] = new ModelRendererTurbo(this, 183, 45, textureX, textureY); // Box 1
		hipsModel[322] = new ModelRendererTurbo(this, 183, 51, textureX, textureY); // Box 2
		hipsModel[323] = new ModelRendererTurbo(this, 183, 57, textureX, textureY); // Box 3
		hipsModel[324] = new ModelRendererTurbo(this, 174, 41, textureX, textureY); // Box 4
		hipsModel[325] = new ModelRendererTurbo(this, 174, 45, textureX, textureY); // Box 5
		hipsModel[326] = new ModelRendererTurbo(this, 174, 51, textureX, textureY); // Box 6
		hipsModel[327] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 7
		hipsModel[328] = new ModelRendererTurbo(this, 212, 42, textureX, textureY); // Box 8
		hipsModel[329] = new ModelRendererTurbo(this, 212, 47, textureX, textureY); // Box 9
		hipsModel[330] = new ModelRendererTurbo(this, 221, 42, textureX, textureY); // Box 10
		hipsModel[331] = new ModelRendererTurbo(this, 221, 57, textureX, textureY); // Box 12
		hipsModel[332] = new ModelRendererTurbo(this, 221, 47, textureX, textureY); // Box 13
		hipsModel[333] = new ModelRendererTurbo(this, 221, 57, textureX, textureY); // Box 14
		hipsModel[334] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 15
		hipsModel[335] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 16
		hipsModel[336] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 18
		hipsModel[337] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 19
		hipsModel[338] = new ModelRendererTurbo(this, 153, 95, textureX, textureY); // Box 20
		hipsModel[339] = new ModelRendererTurbo(this, 153, 101, textureX, textureY); // Box 21
		hipsModel[340] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 22
		hipsModel[341] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 23
		hipsModel[342] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 24
		hipsModel[343] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 25
		hipsModel[344] = new ModelRendererTurbo(this, 221, 42, textureX, textureY); // Box 26
		hipsModel[345] = new ModelRendererTurbo(this, 212, 47, textureX, textureY); // Box 27
		hipsModel[346] = new ModelRendererTurbo(this, 221, 47, textureX, textureY); // Box 28
		hipsModel[347] = new ModelRendererTurbo(this, 221, 57, textureX, textureY); // Box 29
		hipsModel[348] = new ModelRendererTurbo(this, 221, 57, textureX, textureY); // Box 30
		hipsModel[349] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 31
		hipsModel[350] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 32
		hipsModel[351] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 33
		hipsModel[352] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 34
		hipsModel[353] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 35
		hipsModel[354] = new ModelRendererTurbo(this, 222, 60, textureX, textureY); // Box 36
		hipsModel[355] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 38
		hipsModel[356] = new ModelRendererTurbo(this, 153, 95, textureX, textureY); // Box 39
		hipsModel[357] = new ModelRendererTurbo(this, 153, 101, textureX, textureY); // Box 40
		hipsModel[358] = new ModelRendererTurbo(this, 153, 108, textureX, textureY); // Box 41
		hipsModel[359] = new ModelRendererTurbo(this, 153, 115, textureX, textureY); // Box 42
		hipsModel[360] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 43
		hipsModel[361] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 44
		hipsModel[362] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 45
		hipsModel[363] = new ModelRendererTurbo(this, 174, 45, textureX, textureY); // Box 46
		hipsModel[364] = new ModelRendererTurbo(this, 183, 45, textureX, textureY); // Box 47
		hipsModel[365] = new ModelRendererTurbo(this, 192, 45, textureX, textureY); // Box 48
		hipsModel[366] = new ModelRendererTurbo(this, 183, 45, textureX, textureY); // Box 49
		hipsModel[367] = new ModelRendererTurbo(this, 174, 45, textureX, textureY); // Box 50
		hipsModel[368] = new ModelRendererTurbo(this, 192, 51, textureX, textureY); // Box 51
		hipsModel[369] = new ModelRendererTurbo(this, 183, 51, textureX, textureY); // Box 52
		hipsModel[370] = new ModelRendererTurbo(this, 174, 51, textureX, textureY); // Box 53
		hipsModel[371] = new ModelRendererTurbo(this, 183, 51, textureX, textureY); // Box 54
		hipsModel[372] = new ModelRendererTurbo(this, 174, 51, textureX, textureY); // Box 55
		hipsModel[373] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 56
		hipsModel[374] = new ModelRendererTurbo(this, 183, 57, textureX, textureY); // Box 57
		hipsModel[375] = new ModelRendererTurbo(this, 192, 57, textureX, textureY); // Box 58
		hipsModel[376] = new ModelRendererTurbo(this, 183, 57, textureX, textureY); // Box 59
		hipsModel[377] = new ModelRendererTurbo(this, 174, 57, textureX, textureY); // Box 60
		hipsModel[378] = new ModelRendererTurbo(this, 171, 69, textureX, textureY); // Box 61
		hipsModel[379] = new ModelRendererTurbo(this, 172, 77, textureX, textureY); // Box 63
		hipsModel[380] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 64
		hipsModel[381] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 65
		hipsModel[382] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 66
		hipsModel[383] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 67
		hipsModel[384] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 68
		hipsModel[385] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 69
		hipsModel[386] = new ModelRendererTurbo(this, 184, 77, textureX, textureY); // Box 70
		hipsModel[387] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 71
		hipsModel[388] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 72
		hipsModel[389] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 73
		hipsModel[390] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 74
		hipsModel[391] = new ModelRendererTurbo(this, 172, 77, textureX, textureY); // Box 75
		hipsModel[392] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 76
		hipsModel[393] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 77
		hipsModel[394] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 78
		hipsModel[395] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 79
		hipsModel[396] = new ModelRendererTurbo(this, 184, 77, textureX, textureY); // Box 80
		hipsModel[397] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 81
		hipsModel[398] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 82
		hipsModel[399] = new ModelRendererTurbo(this, 198, 68, textureX, textureY); // Box 83
		hipsModel[400] = new ModelRendererTurbo(this, 214, 68, textureX, textureY); // Box 84
		hipsModel[401] = new ModelRendererTurbo(this, 214, 68, textureX, textureY); // Box 85
		hipsModel[402] = new ModelRendererTurbo(this, 199, 84, textureX, textureY); // Box 86
		hipsModel[403] = new ModelRendererTurbo(this, 199, 77, textureX, textureY); // Box 87
		hipsModel[404] = new ModelRendererTurbo(this, 199, 77, textureX, textureY); // Box 88
		hipsModel[405] = new ModelRendererTurbo(this, 199, 84, textureX, textureY); // Box 89
		hipsModel[406] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 90
		hipsModel[407] = new ModelRendererTurbo(this, 184, 77, textureX, textureY); // Box 91
		hipsModel[408] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 92
		hipsModel[409] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 93
		hipsModel[410] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 94
		hipsModel[411] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 95
		hipsModel[412] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 96
		hipsModel[413] = new ModelRendererTurbo(this, 184, 77, textureX, textureY); // Box 97
		hipsModel[414] = new ModelRendererTurbo(this, 184, 94, textureX, textureY); // Box 98
		hipsModel[415] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 99
		hipsModel[416] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 100
		hipsModel[417] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 101
		hipsModel[418] = new ModelRendererTurbo(this, 172, 77, textureX, textureY); // Box 102
		hipsModel[419] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 103
		hipsModel[420] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 104
		hipsModel[421] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 105
		hipsModel[422] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 106
		hipsModel[423] = new ModelRendererTurbo(this, 172, 77, textureX, textureY); // Box 107
		hipsModel[424] = new ModelRendererTurbo(this, 172, 83, textureX, textureY); // Box 108
		hipsModel[425] = new ModelRendererTurbo(this, 172, 89, textureX, textureY); // Box 109
		hipsModel[426] = new ModelRendererTurbo(this, 214, 68, textureX, textureY); // Box 110
		hipsModel[427] = new ModelRendererTurbo(this, 171, 69, textureX, textureY); // Box 111
		hipsModel[428] = new ModelRendererTurbo(this, 214, 68, textureX, textureY); // Box 112
		hipsModel[429] = new ModelRendererTurbo(this, 198, 68, textureX, textureY); // Box 113
		hipsModel[430] = new ModelRendererTurbo(this, 199, 84, textureX, textureY); // Box 114
		hipsModel[431] = new ModelRendererTurbo(this, 199, 77, textureX, textureY); // Box 115
		hipsModel[432] = new ModelRendererTurbo(this, 199, 84, textureX, textureY); // Box 116
		hipsModel[433] = new ModelRendererTurbo(this, 199, 77, textureX, textureY); // Box 117
		hipsModel[434] = new ModelRendererTurbo(this, 198, 88, textureX, textureY); // Box 118
		hipsModel[435] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 119
		hipsModel[436] = new ModelRendererTurbo(this, 198, 88, textureX, textureY); // Box 120
		hipsModel[437] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 121
		hipsModel[438] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 122
		hipsModel[439] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 123
		hipsModel[440] = new ModelRendererTurbo(this, 198, 88, textureX, textureY); // Box 125
		hipsModel[441] = new ModelRendererTurbo(this, 198, 88, textureX, textureY); // Box 126

		hipsModel[0].addShapeBox(0F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[0].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[1].addShapeBox(-4F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[1].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[2].addShapeBox(-8F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		hipsModel[2].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[3].addShapeBox(-12F, -6F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 4
		hipsModel[3].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[4].addShapeBox(-15F, -6F, 0F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 5
		hipsModel[4].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[5].addShapeBox(-18F, -10F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 6
		hipsModel[5].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[6].addShapeBox(4F, -6F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F); // Box 7
		hipsModel[6].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[7].addShapeBox(7F, -6F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, .5F, 0F); // Box 8
		hipsModel[7].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[8].addShapeBox(9F, -6F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[8].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[9].addShapeBox(7F, -15F, 0F, 3, 5, 2, 0F,0F, .5F, 0F, -1F, -1.5F, 0F, -1F, -2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[9].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[10].addShapeBox(4F, -16F, 0F, 3, 6, 2, 0F,0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[10].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[11].addShapeBox(0F, -16F, 0F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[11].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[12].addShapeBox(-4F, -16F, 0F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[12].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[13].addShapeBox(-8F, -16F, 0F, 4, 6, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[13].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[14].addShapeBox(-12F, -15F, 0F, 4, 5, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[14].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[15].addShapeBox(-15F, -14F, 0F, 3, 4, 2, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[15].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[16].addShapeBox(-18F, -13F, 0F, 3, 3, 2, 0F,-.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 18
		hipsModel[16].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[17].addShapeBox(0F, -20F, 0F, 4, 4, 1, 0F,.5F, .3F, 0F, -1.8F, -1F, 0F, -2F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[17].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[18].addShapeBox(-4F, -20F, 0F, 4, 4, 1, 0F,-1.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[18].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[19].addShapeBox(-8F, -20F, 0F, 4, 4, 1, 0F,-1.8F, -2F, 0F, 1.5F, .3F, 0F, 1.5F, 0F, 0F, -2F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 22
		hipsModel[19].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[20].addShapeBox(7F, -10F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[20].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[21].addShapeBox(17.5F, -18F, 0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		hipsModel[21].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[22].addShapeBox(-19F, -10F, -0.5F, 1, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[22].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[23].addShapeBox(-19F, -7F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Box 38
		hipsModel[23].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[24].addShapeBox(-19.5F, -3F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39
		hipsModel[24].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[25].addShapeBox(-21F, 1F, 0F, 2, 5, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -.5F, .5F, 0F, 0F, -.5F, 0F, -.5F, -1.5F, 0F, -.5F, -1F, 0F); // Box 44
		hipsModel[25].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[26].addShapeBox(20.5F, -16.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[26].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[27].addShapeBox(20.5F, -19.5F, -1F, 2, 3, 1, 0F,.3F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, .3F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[27].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[28].addShapeBox(18.5F, -18.5F, 1F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, -1F, 0F); // Box 80
		hipsModel[28].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[29].addShapeBox(22.5F, -16.5F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F); // Box 81
		hipsModel[29].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[30].addShapeBox(22.5F, -18.5F, -1F, 1, 2, 1, 0F,0F, .7F, 0F, .5F, 0F, -.5F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[30].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[31].addShapeBox(23.5F, -16.5F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F); // Box 0
		hipsModel[31].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[32].addShapeBox(23.5F, -18.5F, -0.5F, 3, 2, 1, 0F,-.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[32].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[33].addShapeBox(26.5F, -18.5F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[33].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[34].addShapeBox(25.3F, -16.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, -1F, -.7F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -1F, -.7F, 0F); // Box 3
		hipsModel[34].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[35].addShapeBox(27.5F, -18.5F, -0.5F, 1, 2, 1, 0F,0F, -.4F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -.4F, 0F, 0F, .1F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, .1F, 0F); // Box 4
		hipsModel[35].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[36].addShapeBox(27.3F, -16.3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[36].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[37].addShapeBox(18.5F, -19.5F, 1F, 1, 1, 1, 0F,0F, 0F, -.5F, .2F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, .5F, -.5F, 0F, 0F, .2F, 0F, .5F, .2F, 0F, -.5F, -.5F, 1F, -.3F); // Box 6
		hipsModel[37].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[38].addShapeBox(18.5F, -20.5F, 1F, 1, 1, 1, 0F,-.5F, 0F, -.5F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, 0F, -.5F, .2F, 0F, 0F, 0F, 0F, -.5F, 0F, .5F, .5F); // Box 7
		hipsModel[38].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[39].addShapeBox(-17F, -7F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 0
		hipsModel[39].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[40].addShapeBox(4F, -8F, 2F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		hipsModel[40].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[41].addShapeBox(0F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F); // Box 2
		hipsModel[41].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[42].addShapeBox(-4F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 3
		hipsModel[42].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[43].addShapeBox(-8F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F); // Box 4
		hipsModel[43].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[44].addShapeBox(-12F, -8F, 2F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 5
		hipsModel[44].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[45].addShapeBox(7F, -10F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Box 7
		hipsModel[45].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[46].addShapeBox(4F, -10F, 2F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F); // Box 8
		hipsModel[46].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[47].addShapeBox(0F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F); // Box 9
		hipsModel[47].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[48].addShapeBox(-4F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
		hipsModel[48].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[49].addShapeBox(-8F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 11
		hipsModel[49].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[50].addShapeBox(-12F, -10F, 2F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 12
		hipsModel[50].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[51].addShapeBox(-15F, -10F, 2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F); // Box 13
		hipsModel[51].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[52].addShapeBox(-18F, -10F, 2F, 3, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, .5F, -1F, -.5F, -.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, .5F, -1.5F, -.5F, -.5F); // Box 14
		hipsModel[52].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[53].addShapeBox(-18F, -13F, 2F, 3, 3, 1, 0F,-.5F, -2F, 1F, 0F, 0F, .5F, 0F, -1.5F, 0F, -1.5F, -2.5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, .5F, -1F, .5F, -.5F); // Box 15
		hipsModel[53].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[54].addShapeBox(-15F, -14F, 2F, 3, 4, 2, 0F,0F, -1F, .5F, 0F, .5F, 0F, 0F, -2F, -.3F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F); // Box 16
		hipsModel[54].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[55].addShapeBox(-12F, -15F, 2F, 4, 5, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 17
		hipsModel[55].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[56].addShapeBox(-8F, -16F, 2F, 4, 6, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F); // Box 18
		hipsModel[56].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[57].addShapeBox(-4F, -16F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
		hipsModel[57].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[58].addShapeBox(0F, -16F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 20
		hipsModel[58].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[59].addShapeBox(4F, -16F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, .5F, 0F, -3.5F, -1F, 0F, -2.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		hipsModel[59].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[60].addShapeBox(7F, -15F, 2F, 3, 5, 1, 0F,0F, 0F, .5F, -1F, -2F, .5F, -2F, -3F, -.5F, 0F, -2.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F); // Box 22
		hipsModel[60].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[61].addShapeBox(0F, -20F, 1F, 4, 4, 1, 0F,.5F, 0F, 0F, -2F, -1F, 0F, -3F, -1.5F, 0F, 1F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, .5F, 0F, 1.5F, 1.5F); // Box 23
		hipsModel[61].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[62].addShapeBox(-4F, -20F, 1F, 4, 4, 1, 0F,-1.5F, 0F, 0F, -.5F, 0F, 0F, -1F, -1F, .5F, -1.5F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F); // Box 24
		hipsModel[62].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[63].addShapeBox(-8F, -20F, 1F, 4, 4, 1, 0F,-2F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, .5F, -3F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, -2F, 1F, .5F); // Box 25
		hipsModel[63].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[64].addShapeBox(7F, -6F, 2F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1F, 0F, .5F, 0F, -1F, -1F, 1F, -1F, -2F, -.5F, 0F, -1F, .5F); // Box 26
		hipsModel[64].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[65].addShapeBox(4F, -6F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -2F, -.5F, 0F, -1.5F, 0F); // Box 27
		hipsModel[65].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[66].addShapeBox(0F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 1F); // Box 28
		hipsModel[66].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[67].addShapeBox(-4F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 29
		hipsModel[67].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[68].addShapeBox(-8F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2.5F, 0F); // Box 30
		hipsModel[68].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[69].addShapeBox(-12F, -6F, 2F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -2F, -1F); // Box 31
		hipsModel[69].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[70].addShapeBox(-15F, -6F, 2F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2.5F, -2F); // Box 32
		hipsModel[70].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[71].addShapeBox(-17F, -7F, 2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, .5F, -.5F, .5F, -.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, -.5F, -1F, -2F, -.5F, -1F); // Box 33
		hipsModel[71].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[72].addShapeBox(7F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1F); // Box 35
		hipsModel[72].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[73].addShapeBox(-22F, 1F, 0F, 2, 5, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F); // Box 6
		hipsModel[73].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[74].addShapeBox(9F, -10F, 0.5F, 3, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 7
		hipsModel[74].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[75].addShapeBox(9F, -6F, 0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 8
		hipsModel[75].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[76].addShapeBox(12F, -9F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 9
		hipsModel[76].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[77].addShapeBox(12F, -6F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.3F, 0F, -.8F, 0F); // Box 10
		hipsModel[77].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[78].addShapeBox(14F, -10F, 0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, .5F, -.5F, -.3F, 0F, -1.5F, -.3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[78].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[79].addShapeBox(14F, -6F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, -1F, -.3F, 0F, 0F, -.3F); // Box 12
		hipsModel[79].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[80].addShapeBox(16F, -10F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F); // Box 13
		hipsModel[80].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[81].addShapeBox(16F, -7F, 0.5F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 1.5F, -2.5F, 0F, 1F, -3F, -.3F, -1F, -1F, -.3F); // Box 14
		hipsModel[81].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[82].addShapeBox(16F, -10F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, -.5F, -.3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, -.3F); // Box 15
		hipsModel[82].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[83].addShapeBox(18F, -10F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.3F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -1F, 1F, -.3F, 0F, 0F, 0F); // Box 16
		hipsModel[83].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[84].addShapeBox(16F, -12F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, .5F, -.3F); // Box 17
		hipsModel[84].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[85].addShapeBox(18F, -12F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.3F, -.5F, 0F, 0F); // Box 18
		hipsModel[85].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[86].addShapeBox(17.5F, -15F, 0.5F, 1, 3, 1, 0F,.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.5F); // Box 19
		hipsModel[86].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[87].addShapeBox(18.5F, -15F, 0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Box 20
		hipsModel[87].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[88].addShapeBox(18.5F, -16.5F, 1F, 2, 2, 1, 0F,.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F); // Box 2
		hipsModel[88].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[89].addShapeBox(20.5F, -19.5F, 1F, 2, 3, 1, 0F,.3F, 0F, 0F, 0F, -.3F, 0F, 0F, -1F, .2F, .3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F); // Box 3
		hipsModel[89].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[90].addShapeBox(20.5F, -16.5F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 4
		hipsModel[90].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[91].addShapeBox(18.5F, -18.5F, -1F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1F, 0F, -.3F, 1.2F, 0F, -.3F, .3F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 5
		hipsModel[91].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[92].addShapeBox(18.5F, -16.5F, -1F, 2, 2, 2, 0F,.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 6
		hipsModel[92].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[93].addShapeBox(7F, -15F, -2F, 3, 5, 2, 0F,0F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[93].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[94].addShapeBox(4F, -16F, -2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[94].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[95].addShapeBox(0F, -16F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[95].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[96].addShapeBox(-4F, -16F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[96].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[97].addShapeBox(-8F, -16F, -2F, 4, 6, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[97].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[98].addShapeBox(-12F, -15F, -2F, 4, 5, 2, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[98].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[99].addShapeBox(-15F, -14F, -2F, 3, 4, 2, 0F,0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[99].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[100].addShapeBox(-18F, -13F, -2F, 3, 3, 2, 0F,-0.5F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[100].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[101].addShapeBox(-18F, -10F, -2F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		hipsModel[101].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[102].addShapeBox(-17F, -7F, -2F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 16
		hipsModel[102].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[103].addShapeBox(-15F, -6F, -2F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 17
		hipsModel[103].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[104].addShapeBox(-12F, -6F, -2F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[104].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[105].addShapeBox(-8F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -.5F, 0F); // Box 19
		hipsModel[105].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[106].addShapeBox(-4F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 20
		hipsModel[106].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[107].addShapeBox(0F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 21
		hipsModel[107].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[108].addShapeBox(4F, -6F, -2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		hipsModel[108].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[109].addShapeBox(7F, -6F, -2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 23
		hipsModel[109].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[110].addShapeBox(7F, -10F, -2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[110].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[111].addShapeBox(-18F, -10F, -3F, 3, 3, 1, 0F,-1F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 25
		hipsModel[111].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[112].addShapeBox(-17F, -7F, -3F, 2, 2, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, -2F, 0F, 1F); // Box 26
		hipsModel[112].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[113].addShapeBox(-18F, -13F, -3F, 3, 3, 1, 0F,-1.5F, -2.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 1F, -1F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 27
		hipsModel[113].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[114].addShapeBox(-15F, -14F, -4F, 3, 4, 2, 0F,0F, -2.5F, -1F, 0F, -2F, -0.3F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[114].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[115].addShapeBox(-12F, -15F, -4F, 4, 5, 2, 0F,0F, -3F, -0.3F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[115].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[116].addShapeBox(-8F, -16F, -4F, 4, 6, 2, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[116].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[117].addShapeBox(-4F, -16F, -4F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[117].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[118].addShapeBox(0F, -16F, -4F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[118].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[119].addShapeBox(4F, -16F, -4F, 3, 6, 2, 0F,0F, -2.5F, -0.3F, 0F, -3.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[119].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[120].addShapeBox(7F, -15F, -3F, 3, 5, 1, 0F,0F, -2.5F, 0F, -2F, -3F, -0.5F, -1F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 34
		hipsModel[120].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[121].addShapeBox(7F, -10F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[121].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[122].addShapeBox(0F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[122].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[123].addShapeBox(-4F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[123].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[124].addShapeBox(-8F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		hipsModel[124].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[125].addShapeBox(-12F, -6F, -4F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 42
		hipsModel[125].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[126].addShapeBox(-15F, -6F, -4F, 3, 3, 2, 0F,0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 43
		hipsModel[126].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[127].addShapeBox(4F, -10F, -4F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[127].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[128].addShapeBox(0F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[128].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[129].addShapeBox(0F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[129].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[130].addShapeBox(-4F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[130].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[131].addShapeBox(-4F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[131].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[132].addShapeBox(-8F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[132].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[133].addShapeBox(-8F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[133].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[134].addShapeBox(-12F, -10F, -4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[134].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[135].addShapeBox(-12F, -8F, -4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[135].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[136].addShapeBox(-15F, -10F, -4F, 3, 4, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 54
		hipsModel[136].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[137].addShapeBox(-4F, -20F, -1F, 4, 4, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -1.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[137].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[138].addShapeBox(-8F, -20F, -1F, 4, 4, 1, 0F,-2F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0.3F, 0F, -1.8F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 56
		hipsModel[138].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[139].addShapeBox(0F, -20F, -1F, 4, 4, 1, 0F,0.5F, 0F, 0F, -2F, -1F, 0F, -1.8F, -1F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[139].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[140].addShapeBox(-4F, -20F, -2F, 4, 4, 1, 0F,-1.5F, -1F, 0.5F, -1F, -1F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[140].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[141].addShapeBox(-8F, -20F, -2F, 4, 4, 1, 0F,-3F, -2F, 0F, 1.5F, -1F, 0.5F, 1.5F, 0F, 0F, -2F, -2F, 0F, -2F, 1F, 0.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 59
		hipsModel[141].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[142].addShapeBox(0F, -20F, -2F, 4, 4, 1, 0F,1F, -1F, 0.5F, -3F, -1.5F, 0F, -2F, -1F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 1.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[142].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[143].addShapeBox(-21F, 1F, -1F, 2, 5, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F); // Box 61
		hipsModel[143].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[144].addShapeBox(-22F, 1F, -1F, 2, 5, 1, 0F,-1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F); // Box 62
		hipsModel[144].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[145].addShapeBox(9F, -10F, -0.5F, 3, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[145].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[146].addShapeBox(12F, -9F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[146].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[147].addShapeBox(12F, -6F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[147].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[148].addShapeBox(14F, -6F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, .5F, 0F); // Box 67
		hipsModel[148].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[149].addShapeBox(14F, -10F, -0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[149].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[150].addShapeBox(16F, -7F, -0.5F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, -1F, -.5F, 0F); // Box 69
		hipsModel[150].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[151].addShapeBox(18F, -10F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[151].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[152].addShapeBox(18F, -12F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Box 72
		hipsModel[152].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[153].addShapeBox(16F, -12F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[153].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[154].addShapeBox(17.5F, -15F, -0.5F, 1, 3, 1, 0F,.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 74
		hipsModel[154].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[155].addShapeBox(18.5F, -15F, -0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[155].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[156].addShapeBox(17.5F, -18F, -0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 76
		hipsModel[156].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[157].addShapeBox(9F, -10F, -1.5F, 3, 4, 1, 0F,-.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[157].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[158].addShapeBox(9F, -6F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[158].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[159].addShapeBox(12F, -6F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[159].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[160].addShapeBox(12F, -9F, -1.5F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		hipsModel[160].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[161].addShapeBox(14F, -10F, -1.5F, 2, 4, 1, 0F,0F, -1.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[161].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[162].addShapeBox(14F, -6F, -1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 1F, -1F, -0.3F, 1F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 82
		hipsModel[162].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[163].addShapeBox(16F, -10F, -1.5F, 2, 3, 1, 0F,-0.5F, -0.5F, -0.3F, -1.5F, -0.5F, -0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 83
		hipsModel[163].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[164].addShapeBox(16F, -7F, -1.5F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -1F, -1F, -0.3F, 1F, -3F, -0.3F, 1.5F, -2.5F, 0F, -1F, -0.5F, 0F); // Box 84
		hipsModel[164].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[165].addShapeBox(18F, -10F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.3F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[165].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[166].addShapeBox(16F, -10F, -1.5F, 2, 2, 1, 0F,-0.5F, -0.5F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		hipsModel[166].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[167].addShapeBox(16F, -12F, -1.5F, 2, 2, 1, 0F,-1F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[167].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[168].addShapeBox(17.5F, -15F, -1.5F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 89
		hipsModel[168].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[169].addShapeBox(17.5F, -18F, -1.5F, 2, 3, 1, 0F,-1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 91
		hipsModel[169].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[170].addShapeBox(4F, -8F, -4F, 3, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[170].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[171].addShapeBox(4F, -6F, -4F, 3, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		hipsModel[171].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[172].addShapeBox(7F, -6F, -3F, 3, 4, 1, 0F,0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -1F, -2F, -0.5F, -1F, -1F, 1F, 0F, 0.5F, 0F); // Box 70
		hipsModel[172].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[173].addShapeBox(7F, -8F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[173].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[174].addShapeBox(22.5F, -18.5F, 1F, 1, 2, 1, 0F,0F, .7F, 0F, .5F, 0F, .5F, 0F, -.5F, -.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 57
		hipsModel[174].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[175].addShapeBox(22.5F, -16.5F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, .5F, 0F, -.8F, -.3F, 0F, -.5F, 0F); // Box 58
		hipsModel[175].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[176].addShapeBox(27.5F, -18.5F, -0.5F, 1, 1, 1, 0F,0F, -.3F, 0F, -.3F, -.8F, -.2F, -.3F, -.8F, -.2F, 0F, -.3F, 0F, 0F, 0F, 0F, -.1F, .2F, -.4F, -.1F, .2F, -.4F, 0F, 0F, 0F); // Box 59
		hipsModel[176].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[177].addShapeBox(27.5F, -18.5F, 0.5F, 1, 2, 1, 0F,0F, -.4F, 0F, -.35F, -.8F, .45F, -.5F, -1F, -.7F, 0F, -.7F, -.3F, 0F, .1F, 0F, 0F, .1F, .45F, -.1F, 0F, -.4F, 0F, .1F, 0F); // Box 60
		hipsModel[177].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[178].addShapeBox(23.5F, -18.5F, 0.5F, 3, 2, 1, 0F,-.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.7F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F); // Box 61
		hipsModel[178].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[179].addShapeBox(26.5F, -18.5F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.7F, -.3F, 0F, -.7F, -.3F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, -.3F); // Box 62
		hipsModel[179].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[180].addShapeBox(22.5F, -18.5F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, -0.5F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 64
		hipsModel[180].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[181].addShapeBox(20.5F, -19.5F, 0F, 2, 3, 1, 0F,.3F, .2F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[181].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[182].addShapeBox(18.5F, -18.5F, 0F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1.2F, 0F, -.3F, 1F, 0F, -.3F, .3F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 66
		hipsModel[182].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[183].addShapeBox(18F, -12F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		hipsModel[183].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[184].addShapeBox(18.5F, -15F, -1.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[184].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[185].addShapeBox(23.5F, -16.5F, 0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, -1.4F, -.5F, 0F, -.8F, .2F); // Box 69
		hipsModel[185].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[186].addShapeBox(25.3F, -16.5F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.1F, -.5F, 0F, -.1F, -1F, -.7F, 0F, 0F, -.8F, 0F, 0F, -1.1F, -.3F, -1.1F, -1F, 0F); // Box 70
		hipsModel[186].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[187].addShapeBox(27.3F, -16.3F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.1F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, -.2F, 0F, -.3F, -.5F, -.6F, 0F, -.3F, -.3F); // Box 71
		hipsModel[187].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[188].addShapeBox(20.5F, -14.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, .5F, 0F, .3F, -.5F, 0F, 0F, -.8F, 0F, -.5F, 0F, 0F); // Box 76
		hipsModel[188].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[189].addShapeBox(22.6F, -18.8F, 1F, 1, 1, 1, 0F,0F, -.8F, 0F, -.4F, -.7F, 0F, -.4F, -.7F, -.15F, -.2F, -.8F, .1F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, -.45F, 0F, 0F, .2F); // Box 1
		hipsModel[189].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[190].addShapeBox(22.6F, -19.21F, 1F, 1, 1, 1, 0F,-.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, -.35F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, -.35F, -.2F, -.4F, 0F); // Box 3
		hipsModel[190].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[191].addShapeBox(22.6F, -19.41F, 1F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -.2F, -0.4F, -0.4F, -.1F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -.35F, -0.2F, -0.4F, 0F); // Box 5
		hipsModel[191].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[192].addShapeBox(22.6F, -19.01F, 1F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.1F); // Box 6
		hipsModel[192].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[193].addShapeBox(18.5F, -16.5F, -2F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 7
		hipsModel[193].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[194].addShapeBox(18.5F, -18.5F, -2F, 2, 2, 1, 0F,-0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, -1F, 0F); // Box 8
		hipsModel[194].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[195].addShapeBox(20.5F, -16.5F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[195].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[196].addShapeBox(20.5F, -19.5F, -2F, 2, 3, 1, 0F,0.3F, -1F, 0F, 0F, -1F, 0.2F, 0F, -0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[196].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[197].addShapeBox(22.5F, -18.5F, -2F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 11
		hipsModel[197].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[198].addShapeBox(22.5F, -16.5F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.3F, 0F, -0.2F, 0.5F, 0F, 0F, 0F); // Box 12
		hipsModel[198].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[199].addShapeBox(23.5F, -18.5F, -1.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.7F, -0.3F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[199].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[200].addShapeBox(23.5F, -16.5F, -1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.2F, 0F, -1.4F, -0.5F, 0F, -1F, 0F, 0F, -0.2F, 0F); // Box 14
		hipsModel[200].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[201].addShapeBox(26.5F, -18.5F, -1.5F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[201].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[202].addShapeBox(25.3F, -16.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1.1F, -1F, 0F, 0F, -1.1F, -0.3F, 0F, -0.8F, 0F, -1F, -0.7F, 0F); // Box 16
		hipsModel[202].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[203].addShapeBox(27.3F, -16.3F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.1F, -0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.5F, -0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[203].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[204].addShapeBox(27.5F, -18.5F, -1.5F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, -0.5F, -1F, -0.7F, -0.35F, -0.8F, 0.45F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, -0.1F, 0F, -0.4F, 0F, 0.1F, 0.45F, 0F, 0.1F, 0F); // Box 18
		hipsModel[204].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[205].addShapeBox(18.5F, -19.5F, -2F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 19
		hipsModel[205].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[206].addShapeBox(18.5F, -20.5F, -2F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.5F); // Box 20
		hipsModel[206].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[207].addShapeBox(20.5F, -14.5F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0.3F, -0.5F, 0F, -0.6F, 0.5F, 0F); // Box 21
		hipsModel[207].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[208].addShapeBox(22.6F, -19.41F, -2F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 22
		hipsModel[208].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[209].addShapeBox(22.6F, -19.21F, -2F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 23
		hipsModel[209].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[210].addShapeBox(22.6F, -19.01F, -2F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 24
		hipsModel[210].setRotationPoint(-4.5F, -20F, 0F);

		hipsModel[211].addShapeBox(22.6F, -18.8F, -2F, 1, 1, 1, 0F,-0.2F, -0.8F, 0.1F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, -0.45F, 0F, -0.1F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[211].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[212].addShapeBox(-3.5F, -21F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[212].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[213].addShapeBox(24F, -18.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 4
		hipsModel[213].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[214].addShapeBox(24F, -18F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, 0F, 0F, .2F, 0F, 0F, .2F, -.3F, 0F, .6F, -.3F); // Box 5
		hipsModel[214].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[215].addShapeBox(24F, -16F, 0F, 1, 1, 2, 0F,0F, -.6F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.6F, -.3F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .2F, -1F); // Box 6
		hipsModel[215].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[216].addShapeBox(17F, -15F, -1F, 1, 1, 2, 0F,.1F, .2F, -.4F, 0F, 0F, .3F, 0F, 0F, .3F, .1F, .2F, -.4F, .3F, -.3F, -.4F, 0F, 0F, .3F, 0F, 0F, .3F, .3F, -.3F, -.4F); // Box 7
		hipsModel[216].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[217].addShapeBox(18F, -15F, -2F, 2, 1, 4, 0F,0F, 0F, -.7F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.7F); // Box 8
		hipsModel[217].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[218].addShapeBox(20F, -14.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, .1F, -.2F, -1F, .1F, -.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -1.2F, 0F, .2F, -1.2F, 0F, 0F, 0F); // Box 9
		hipsModel[218].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[219].addShapeBox(22F, -14.5F, -0.5F, 3, 1, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .2F, 0F); // Box 10
		hipsModel[219].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[220].addShapeBox(24F, -16F, 1F, 1, 1, 1, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.3F, 0F, -.1F, -.6F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, .1F, 0F, -.1F, .4F, 0F); // Box 11
		hipsModel[220].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[221].addShapeBox(24F, -15.8F, 2F, 1, 1, 1, 0F,-.1F, -.4F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -1F, -.1F, -.4F, -.2F, -.1F, .2F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -1F, -.1F, .2F, -.2F); // Box 12
		hipsModel[221].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[222].addShapeBox(19.2F, -15.5F, 1.9F, 5, 1, 1, 0F,-.1F, -2.1F, -1.5F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -2.1F, 1.2F, -.1F, 1.9F, -1.5F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, 1.9F, 1.2F); // Box 13
		hipsModel[222].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[223].addShapeBox(16.4F, -13.5F, 3.6F, 3, 1, 1, 0F,-.1F, -.6F, -.1F, -.1F, -.1F, .2F, -.1F, -.1F, -.5F, -.1F, -.6F, -.1F, -.1F, .4F, -.1F, -.1F, -.1F, .2F, -.1F, -.1F, -.5F, -.1F, .4F, -.1F); // Box 16
		hipsModel[223].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[224].addShapeBox(13.6F, -13F, 3.6F, 3, 1, 1, 0F,-.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F); // Box 17
		hipsModel[224].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[225].addShapeBox(11.8F, -13.5F, 3.6F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 18
		hipsModel[225].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[226].addShapeBox(9F, -15.5F, 3.6F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 19
		hipsModel[226].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[227].addShapeBox(5.2F, -17.5F, 3.6F, 4, 1, 1, 0F,-0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F); // Box 20
		hipsModel[227].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[228].addShapeBox(1.4F, -21.5F, 3.6F, 4, 1, 1, 0F,-0.1F, 2F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, -2.2F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.2F, -0.1F); // Box 21
		hipsModel[228].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[229].addShapeBox(-0.4F, -23.6F, 3.6F, 2, 1, 1, 0F,-0.5F, .9F, .3F, -0.1F, -.1F, -0.1F, -0.1F, -.1F, -0.1F, -0.1F, .9F, -.9F, -0.5F, -1.1F, .3F, -0.1F, -.1F, -0.1F, -0.1F, -.1F, -0.1F, -0.1F, -1.1F, -0.9F); // Box 22
		hipsModel[229].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[230].addShapeBox(-1.4F, -24.6F, -2F, 1, 1, 4, 0F,-0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F); // Box 23
		hipsModel[230].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[231].addShapeBox(-1.4F, -24.6F, 2F, 1, 1, 2, 0F,-0.1F, -.1F, 0F, -0.1F, -.1F, 0F, .5F, -.1F, -.7F, -1.1F, -.1F, -0.3F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, .5F, -.1F, -.7F, -1.1F, -.1F, -0.3F); // Box 24
		hipsModel[231].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[232].addShapeBox(24F, -18.5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		hipsModel[232].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[233].addShapeBox(24F, -18F, -2F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.6F, 0F); // Box 26
		hipsModel[233].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[234].addShapeBox(24F, -16F, -2F, 1, 1, 2, 0F,0F, -0.6F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, 0F); // Box 27
		hipsModel[234].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[235].addShapeBox(24F, -16F, -2F, 1, 1, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 28
		hipsModel[235].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[236].addShapeBox(24F, -15.8F, -3F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.2F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.2F, -0.2F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, 0F, -0.1F, 0.2F, 0F); // Box 29
		hipsModel[236].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[237].addShapeBox(19.2F, -15.5F, -2.9F, 5, 1, 1, 0F,-0.1F, -2.1F, 1.2F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -1.5F, -0.1F, 1.9F, 1.2F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -1.5F); // Box 30
		hipsModel[237].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[238].addShapeBox(16.4F, -13.5F, -4.6F, 3, 1, 1, 0F,-0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.2F, -0.1F, -0.6F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.2F, -0.1F, 0.4F, -0.1F); // Box 31
		hipsModel[238].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[239].addShapeBox(13.6F, -13F, -4.6F, 3, 1, 1, 0F,-.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F); // Box 32
		hipsModel[239].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[240].addShapeBox(11.8F, -13.5F, -4.6F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 33
		hipsModel[240].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[241].addShapeBox(9F, -15.5F, -4.6F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 34
		hipsModel[241].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[242].addShapeBox(5.2F, -17.5F, -4.6F, 4, 1, 1, 0F,-0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F); // Box 35
		hipsModel[242].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[243].addShapeBox(1.4F, -21.5F, -4.6F, 4, 1, 1, 0F,-0.1F, 2F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, -2.2F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.2F, -0.1F); // Box 36
		hipsModel[243].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[244].addShapeBox(-0.4F, -23.6F, -4.6F, 2, 1, 1, 0F,-0.1F, 0.9F, -0.9F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.5F, 0.9F, 0.3F, -0.1F, -1.1F, -0.9F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.5F, -1.1F, 0.3F); // Box 37
		hipsModel[244].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[245].addShapeBox(-1.4F, -24.6F, -4F, 1, 1, 2, 0F,-1.1F, -0.1F, -0.3F, 0.5F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.1F, -0.1F, -0.3F, 0.5F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 38
		hipsModel[245].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[246].addShapeBox(-3.5F, -21F, 1F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[246].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[247].addShapeBox(-3.5F, -17F, 3F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 40
		hipsModel[247].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[248].addShapeBox(0.5F, -21F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[248].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[249].addShapeBox(0.5F, -21F, 1F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F); // Box 42
		hipsModel[249].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[250].addShapeBox(0.5F, -16F, 3F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 43
		hipsModel[250].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[251].addShapeBox(3.5F, -20F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[251].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[252].addShapeBox(3.5F, -20F, 1F, 3, 4, 3, 0F,0F, 0F, 0F, .5F, -2F, 0F, 0F, -3F, -1.5F, 0F, -1.5F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, .5F, -1F, 0F, -.5F, 0F); // Box 45
		hipsModel[252].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[253].addShapeBox(3.5F, -16F, 3F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, .5F, 1F, 0F, -.5F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F); // Box 46
		hipsModel[253].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[254].addShapeBox(-6.5F, -21F, 1F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 47
		hipsModel[254].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[255].addShapeBox(-6.5F, -16F, 3F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 48
		hipsModel[255].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[256].addShapeBox(-6.5F, -21F, -1F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 49
		hipsModel[256].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[257].addShapeBox(-8.5F, -20F, -1F, 2, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 50
		hipsModel[257].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[258].addShapeBox(-8.5F, -20F, 1F, 2, 4, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[258].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[259].addShapeBox(-8.5F, -16F, 3F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 52
		hipsModel[259].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[260].addShapeBox(-10.5F, -18.5F, -1F, 2, 1, 2, 0F,.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 53
		hipsModel[260].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[261].addShapeBox(-10.5F, -19F, 1F, 2, 3, 3, 0F,.5F, -2.5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -1F, 0F, -3F, -1F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F); // Box 54
		hipsModel[261].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[262].addShapeBox(-10.5F, -16F, 3F, 2, 4, 1, 0F,-.3F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, .5F); // Box 55
		hipsModel[262].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[263].addShapeBox(-3.5F, -12F, 4F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 57
		hipsModel[263].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[264].addShapeBox(0.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F); // Box 62
		hipsModel[264].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[265].addShapeBox(3.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, -.5F, 0F, 1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 0F, 0F, 0F); // Box 63
		hipsModel[265].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[266].addShapeBox(-6.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, .5F); // Box 0
		hipsModel[266].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[267].addShapeBox(-8.5F, -12F, 4F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, 0F); // Box 1
		hipsModel[267].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[268].addShapeBox(-10.5F, -12F, 4F, 2, 3, 1, 0F,-.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F); // Box 2
		hipsModel[268].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[269].addShapeBox(2.5F, -9F, 4F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.2F, 0F, .3F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, .8F); // Box 0
		hipsModel[269].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[270].addShapeBox(2.5F, -6F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, .5F, .15F, 0F, -.5F, .15F, 0F, -.5F, 0F, -0.1F, .5F, 0F, .1F); // Box 1
		hipsModel[270].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[271].addShapeBox(2F, -3F, 2F, 1, 3, 2, 0F,.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, .9F, 0F, 0F, 1.1F, .5F, .3F, 0F, -.5F, .3F, 0F, -.2F, -1.5F, .2F, .2F, -1.5F, .4F); // Box 2
		hipsModel[271].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[272].addShapeBox(1.5F, -2.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Box 3
		hipsModel[272].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[273].addShapeBox(-8.5F, -9F, 4F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F); // Box 4
		hipsModel[273].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[274].addShapeBox(-8.5F, -6F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -0.5F, -.3F, 0F, 0.5F, -.3F, 0F, 0.5F, -.5F, 0.1F, -0.5F, -.5F, -0.1F); // Box 5
		hipsModel[274].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[275].addShapeBox(-8F, -3.5F, 2F, 1, 3, 2, 0F,-0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.9F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.2F, -1.5F, 0.4F, -0.2F, -1.5F, 0.2F); // Box 6
		hipsModel[275].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[276].addShapeBox(-7.5F, -3F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		hipsModel[276].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[277].addShapeBox(3.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[277].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[278].addShapeBox(0.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 13
		hipsModel[278].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[279].addShapeBox(-3.5F, -12F, -5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 14
		hipsModel[279].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[280].addShapeBox(-6.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 15
		hipsModel[280].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[281].addShapeBox(-8.5F, -12F, -5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 16
		hipsModel[281].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[282].addShapeBox(-10.5F, -12F, -5F, 2, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 17
		hipsModel[282].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[283].addShapeBox(-10.5F, -16F, -4F, 2, 4, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.8F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 18
		hipsModel[283].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[284].addShapeBox(-8.5F, -16F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[284].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[285].addShapeBox(-6.5F, -16F, -4F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[285].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[286].addShapeBox(-3.5F, -17F, -4F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[286].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[287].addShapeBox(0.5F, -16F, -4F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[287].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[288].addShapeBox(3.5F, -16F, -4F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[288].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[289].addShapeBox(3.5F, -20F, -4F, 3, 4, 3, 0F,0F, -1.5F, -1F, 0F, -3F, -1.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 24
		hipsModel[289].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[290].addShapeBox(0.5F, -21F, -4F, 3, 5, 3, 0F,0F, -2F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[290].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[291].addShapeBox(-3.5F, -21F, -4F, 4, 4, 3, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[291].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[292].addShapeBox(-6.5F, -21F, -4F, 3, 5, 3, 0F,0F, -2.5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
		hipsModel[292].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[293].addShapeBox(-8.5F, -20F, -4F, 2, 4, 3, 0F,0F, -2.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 28
		hipsModel[293].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[294].addShapeBox(-10.5F, -19F, -4F, 2, 3, 3, 0F,0F, -3F, -1F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0.5F, -2.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 29
		hipsModel[294].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[295].addShapeBox(-8.5F, -9F, -5F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[295].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[296].addShapeBox(-8.5F, -6F, -5F, 1, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.1F, 0.5F, -0.5F, 0.1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 31
		hipsModel[296].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[297].addShapeBox(-8F, -3.5F, -4F, 1, 3, 2, 0F,0F, 0F, 0.9F, 0F, 0F, 1.1F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -1.5F, 0.2F, 0.2F, -1.5F, 0.4F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F); // Box 32
		hipsModel[297].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[298].addShapeBox(-7.5F, -3F, -2F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 33
		hipsModel[298].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[299].addShapeBox(1.5F, -2.5F, -2F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 34
		hipsModel[299].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[300].addShapeBox(2F, -3F, -4F, 1, 3, 2, 0F,0F, 0F, 1.1F, 0F, 0F, 0.9F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.2F, -1.5F, 0.4F, -0.2F, -1.5F, 0.2F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 35
		hipsModel[300].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[301].addShapeBox(2.5F, -6F, -5F, 1, 3, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F); // Box 36
		hipsModel[301].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[302].addShapeBox(2.5F, -9F, -5F, 1, 3, 1, 0F,0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[302].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[303].addShapeBox(-2.5F, -12.5F, 4F, 2, 4, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -.8F, 0F, .5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 39
		hipsModel[303].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[304].addShapeBox(-2.5F, -8.5F, 5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 40
		hipsModel[304].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[305].addShapeBox(-2.5F, -6.5F, 5F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 41
		hipsModel[305].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[306].addShapeBox(-2.5F, -2F, 2F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2.5F, .3F, 0F, -2.5F, .3F); // Box 42
		hipsModel[306].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[307].addShapeBox(-2.5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 43
		hipsModel[307].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[308].addShapeBox(-3.5F, -16.5F, 4F, 4, 4, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 0
		hipsModel[308].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[309].addShapeBox(-3.5F, -19.5F, 3F, 4, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 1
		hipsModel[309].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[310].addShapeBox(-3.5F, -21.5F, 1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[310].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[311].addShapeBox(-3.5F, -21.5F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[311].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[312].addShapeBox(0.5F, -21.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[312].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[313].addShapeBox(0.5F, -21.5F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[313].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[314].addShapeBox(0.5F, -19.5F, 3F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, -2F, 0F, 0F, -2F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, -.5F, -.5F, 0F, 0F, -.5F); // Box 6
		hipsModel[314].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[315].addShapeBox(0.5F, -16.5F, 4F, 2, 4, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, .2F, 0F, 0F, .2F); // Box 7
		hipsModel[315].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[316].addShapeBox(2.5F, -22.5F, -1F, 1, 1, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 8
		hipsModel[316].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[317].addShapeBox(2.5F, -22.5F, 1F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 9
		hipsModel[317].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[318].addShapeBox(2.5F, -20.5F, 3F, 1, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -.5F, -2F, 0F, .5F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.5F, 0F, .5F, -.5F); // Box 10
		hipsModel[318].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[319].addShapeBox(2.5F, -17.5F, 4F, 1, 4, 1, 0F,0F, -.5F, .1F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, .5F, .2F); // Box 11
		hipsModel[319].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[320].addShapeBox(-5.5F, -21.5F, -1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[320].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[321].addShapeBox(-5.5F, -21.5F, 1F, 2, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[321].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[322].addShapeBox(-5.5F, -19.5F, 3F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		hipsModel[322].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[323].addShapeBox(-5.5F, -16.5F, 4F, 2, 4, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F); // Box 3
		hipsModel[323].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[324].addShapeBox(-6.5F, -22.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[324].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[325].addShapeBox(-6.5F, -22.5F, 1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[325].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[326].addShapeBox(-6.5F, -20.5F, 3F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0.5F, -0.9F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 6
		hipsModel[326].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[327].addShapeBox(-6.5F, -17.5F, 4F, 1, 4, 1, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F); // Box 7
		hipsModel[327].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[328].addShapeBox(3.5F, -27.5F, -1F, 2, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[328].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[329].addShapeBox(3.5F, -26.5F, 1F, 2, 16, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 9
		hipsModel[329].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[330].addShapeBox(3.5F, -27.5F, 1F, 2, 1, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[330].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[331].addShapeBox(3.5F, -10.5F, 4.5F, 2, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		hipsModel[331].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[332].addShapeBox(3.5F, -26.5F, 0.4F, 2, 8, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 2.6F, 3F, 0F, 2.6F); // Box 13
		hipsModel[332].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[333].addShapeBox(0.5F, -18.5F, 2.9F, 2, 1, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, .1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, .3F, -0.5F, 0F, .3F); // Box 14
		hipsModel[333].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[334].addShapeBox(4F, -27.5F, 1F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 15
		hipsModel[334].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[335].addShapeBox(4F, -27.5F, 1F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 16
		hipsModel[335].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[336].addShapeBox(-2.5F, -22F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[336].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[337].addShapeBox(-2.5F, -22F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[337].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[338].addShapeBox(-2.5F, -20F, 3F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 20
		hipsModel[338].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[339].addShapeBox(-2.5F, -17F, 4F, 2, 4, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 21
		hipsModel[339].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[340].addShapeBox(4F, -10.7F, 4.5F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 22
		hipsModel[340].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[341].addShapeBox(4F, -10.7F, 4.5F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 23
		hipsModel[341].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[342].addShapeBox(1F, -18.7F, 3.2F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 24
		hipsModel[342].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[343].addShapeBox(1F, -18.7F, 3.2F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 25
		hipsModel[343].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[344].addShapeBox(3.5F, -27.5F, -2F, 2, 1, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[344].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[345].addShapeBox(3.5F, -26.5F, -2F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 27
		hipsModel[345].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[346].addShapeBox(3.5F, -26.5F, -1.4F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, 0F, 2.6F, -3F, 0F, 2.6F, -3F, 0F, -3F, 3F, 0F, -3F); // Box 28
		hipsModel[346].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[347].addShapeBox(0.5F, -18.5F, -3.9F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 29
		hipsModel[347].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[348].addShapeBox(3.5F, -10.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 30
		hipsModel[348].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[349].addShapeBox(1F, -18.7F, -4.2F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 31
		hipsModel[349].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[350].addShapeBox(1F, -18.7F, -4.2F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 32
		hipsModel[350].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[351].addShapeBox(4F, -10.7F, -5.5F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 33
		hipsModel[351].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[352].addShapeBox(4F, -10.7F, -5.5F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 34
		hipsModel[352].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[353].addShapeBox(4F, -27.5F, -2F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F); // Box 35
		hipsModel[353].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[354].addShapeBox(4F, -27.5F, -2F, 1, 1, 1, 0F,-.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.3F, -.1F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F, -.1F, -.5F, .1F); // Box 36
		hipsModel[354].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[355].addShapeBox(-2.5F, -22F, -3F, 2, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
		hipsModel[355].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[356].addShapeBox(-2.5F, -20F, -5F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 39
		hipsModel[356].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[357].addShapeBox(-2.5F, -17F, -5F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40
		hipsModel[357].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[358].addShapeBox(-2.5F, -12.5F, -6F, 2, 4, 2, 0F,0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[358].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[359].addShapeBox(-2.5F, -8.5F, -7F, 2, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		hipsModel[359].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[360].addShapeBox(-2.5F, -6.5F, -7F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		hipsModel[360].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[361].addShapeBox(-2.5F, -2F, -5F, 2, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		hipsModel[361].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[362].addShapeBox(-2.5F, 0F, -2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		hipsModel[362].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[363].addShapeBox(-6.5F, -22.5F, -3F, 1, 3, 2, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 46
		hipsModel[363].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[364].addShapeBox(-5.5F, -21.5F, -3F, 2, 3, 2, 0F,0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 47
		hipsModel[364].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[365].addShapeBox(-3.5F, -21.5F, -3F, 4, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 48
		hipsModel[365].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[366].addShapeBox(0.5F, -21.5F, -3F, 2, 3, 2, 0F,0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 49
		hipsModel[366].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[367].addShapeBox(2.5F, -22.5F, -3F, 1, 3, 2, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F); // Box 50
		hipsModel[367].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[368].addShapeBox(-3.5F, -19.5F, -5F, 4, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 51
		hipsModel[368].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[369].addShapeBox(0.5F, -19.5F, -5F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 52
		hipsModel[369].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[370].addShapeBox(2.5F, -20.5F, -5F, 1, 3, 2, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0.5F, -0.9F); // Box 53
		hipsModel[370].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[371].addShapeBox(-5.5F, -19.5F, -5F, 2, 3, 2, 0F,0F, 0.5F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 54
		hipsModel[371].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[372].addShapeBox(-6.5F, -20.5F, -5F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.9F, 0F, 0F, -0.9F); // Box 55
		hipsModel[372].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[373].addShapeBox(-6.5F, -17.5F, -5F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 56
		hipsModel[373].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[374].addShapeBox(-5.5F, -16.5F, -5F, 2, 4, 1, 0F,0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 57
		hipsModel[374].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[375].addShapeBox(-3.5F, -16.5F, -5F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		hipsModel[375].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[376].addShapeBox(0.5F, -16.5F, -5F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 59
		hipsModel[376].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[377].addShapeBox(2.5F, -17.5F, -5F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 60
		hipsModel[377].setRotationPoint(-4.5F, -21F, 0F);

		hipsModel[378].addShapeBox(-6.5F, -11F, 7.8F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 61
		hipsModel[378].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[378].rotateAngleX = 0.19198622F;

		hipsModel[379].addShapeBox(0.5F, -15F, 8.8F, 1, 1, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 63
		hipsModel[379].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[379].rotateAngleX = 0.19198622F;

		hipsModel[380].addShapeBox(1.5F, -15F, 8.8F, 1, 1, 4, 0F,0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F); // Box 64
		hipsModel[380].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[380].rotateAngleX = 0.19198622F;

		hipsModel[381].addShapeBox(2F, -15F, 10.3F, 1, 1, 1, 0F,-.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F, -.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F); // Box 65
		hipsModel[381].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[381].rotateAngleX = 0.19198622F;

		hipsModel[382].addShapeBox(-0.5F, -15F, 8.8F, 1, 1, 4, 0F,-0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F); // Box 66
		hipsModel[382].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[382].rotateAngleX = 0.19198622F;

		hipsModel[383].addShapeBox(-1F, -15F, 10.3F, 1, 1, 1, 0F,.1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F); // Box 67
		hipsModel[383].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[383].rotateAngleX = 0.19198622F;

		hipsModel[384].addShapeBox(-1F, -14F, 10.3F, 1, 3, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F); // Box 68
		hipsModel[384].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[384].rotateAngleX = 0.19198622F;

		hipsModel[385].addShapeBox(-0.5F, -14F, 8.8F, 1, 3, 4, 0F,-0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F); // Box 69
		hipsModel[385].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[385].rotateAngleX = 0.19198622F;

		hipsModel[386].addShapeBox(0.5F, -14F, 8.8F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[386].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[386].rotateAngleX = 0.19198622F;

		hipsModel[387].addShapeBox(1.5F, -14F, 8.8F, 1, 3, 4, 0F,0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F); // Box 71
		hipsModel[387].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[387].rotateAngleX = 0.19198622F;

		hipsModel[388].addShapeBox(2F, -14F, 10.3F, 1, 3, 1, 0F,-.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F, -.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F); // Box 72
		hipsModel[388].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[388].rotateAngleX = 0.19198622F;

		hipsModel[389].addShapeBox(-6F, -15F, 10.3F, 1, 1, 1, 0F,.1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F); // Box 73
		hipsModel[389].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[389].rotateAngleX = 0.19198622F;

		hipsModel[390].addShapeBox(-5.5F, -15F, 8.8F, 1, 1, 4, 0F,-0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F); // Box 74
		hipsModel[390].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[390].rotateAngleX = 0.19198622F;

		hipsModel[391].addShapeBox(-4.5F, -15F, 8.8F, 1, 1, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 75
		hipsModel[391].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[391].rotateAngleX = 0.19198622F;

		hipsModel[392].addShapeBox(-3.5F, -15F, 8.8F, 1, 1, 4, 0F,0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F); // Box 76
		hipsModel[392].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[392].rotateAngleX = 0.19198622F;

		hipsModel[393].addShapeBox(-3F, -15F, 10.3F, 1, 1, 1, 0F,-.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F, -.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F); // Box 77
		hipsModel[393].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[393].rotateAngleX = 0.19198622F;

		hipsModel[394].addShapeBox(-3F, -14F, 10.3F, 1, 3, 1, 0F,-.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F, -.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F); // Box 78
		hipsModel[394].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[394].rotateAngleX = 0.19198622F;

		hipsModel[395].addShapeBox(-3.5F, -14F, 8.8F, 1, 3, 4, 0F,0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F); // Box 79
		hipsModel[395].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[395].rotateAngleX = 0.19198622F;

		hipsModel[396].addShapeBox(-4.5F, -14F, 8.8F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		hipsModel[396].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[396].rotateAngleX = 0.19198622F;

		hipsModel[397].addShapeBox(-5.5F, -14F, 8.8F, 1, 3, 4, 0F,-0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F); // Box 81
		hipsModel[397].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[397].rotateAngleX = 0.19198622F;

		hipsModel[398].addShapeBox(-6F, -14F, 10.3F, 1, 3, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F); // Box 82
		hipsModel[398].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[398].rotateAngleX = 0.19198622F;

		hipsModel[399].addShapeBox(-6.5F, -16F, 7.8F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 83
		hipsModel[399].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[399].rotateAngleX = 0.19198622F;

		hipsModel[400].addShapeBox(2.5F, -15F, 7.8F, 1, 4, 7, 0F,-.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, -4F, -1.5F, -.5F, -4F, -1.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F); // Box 84
		hipsModel[400].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[400].rotateAngleX = 0.19198622F;

		hipsModel[401].addShapeBox(-7F, -15F, 7.8F, 1, 4, 7, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -1.5F, -0.5F, -4F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 85
		hipsModel[401].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[401].rotateAngleX = 0.19198622F;

		hipsModel[402].addShapeBox(0.5F, -16F, 10.3F, 1, 1, 1, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[402].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[402].rotateAngleX = 0.19198622F;

		hipsModel[403].addShapeBox(-1.5F, -18.3F, 10.3F, 5, 5, 1, 0F,-1.8F, -1.8F, .2F, -1.8F, -1.8F, .2F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F); // Box 87
		hipsModel[403].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[403].rotateAngleX = 0.19198622F;

		hipsModel[404].addShapeBox(-6.5F, -18.3F, 10.3F, 5, 5, 1, 0F,-1.8F, -1.8F, .2F, -1.8F, -1.8F, .2F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F, -1.8F, -1.8F, -.4F); // Box 88
		hipsModel[404].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[404].rotateAngleX = 0.19198622F;

		hipsModel[405].addShapeBox(-4.5F, -16F, 10.3F, 1, 1, 1, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		hipsModel[405].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[405].rotateAngleX = 0.19198622F;

		hipsModel[406].addShapeBox(-1F, -14F, -11.3F, 1, 3, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F); // Box 90
		hipsModel[406].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[406].rotateAngleX = -0.19198622F;

		hipsModel[407].addShapeBox(0.5F, -14F, -12.8F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[407].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[407].rotateAngleX = -0.19198622F;

		hipsModel[408].addShapeBox(-0.5F, -14F, -12.8F, 1, 3, 4, 0F,-0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F); // Box 92
		hipsModel[408].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[408].rotateAngleX = -0.19198622F;

		hipsModel[409].addShapeBox(1.5F, -14F, -12.8F, 1, 3, 4, 0F,0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F); // Box 93
		hipsModel[409].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[409].rotateAngleX = -0.19198622F;

		hipsModel[410].addShapeBox(2F, -14F, -11.3F, 1, 3, 1, 0F,-.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F, -.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F); // Box 94
		hipsModel[410].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[410].rotateAngleX = -0.19198622F;

		hipsModel[411].addShapeBox(-3F, -14F, -11.3F, 1, 3, 1, 0F,-.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F, -.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 1F); // Box 95
		hipsModel[411].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[411].rotateAngleX = -0.19198622F;

		hipsModel[412].addShapeBox(-3.5F, -14F, -12.8F, 1, 3, 4, 0F,0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F, 0F, 0F); // Box 96
		hipsModel[412].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[412].rotateAngleX = -0.19198622F;

		hipsModel[413].addShapeBox(-4.5F, -14F, -12.8F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		hipsModel[413].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[413].rotateAngleX = -0.19198622F;

		hipsModel[414].addShapeBox(-6F, -14F, -11.3F, 1, 3, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F); // Box 98
		hipsModel[414].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[414].rotateAngleX = -0.19198622F;

		hipsModel[415].addShapeBox(-5.5F, -14F, -12.8F, 1, 3, 4, 0F,-0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F); // Box 99
		hipsModel[415].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[415].rotateAngleX = -0.19198622F;

		hipsModel[416].addShapeBox(-6F, -15F, -11.3F, 1, 1, 1, 0F,.1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F); // Box 100
		hipsModel[416].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[416].rotateAngleX = -0.19198622F;

		hipsModel[417].addShapeBox(-5.5F, -15F, -12.8F, 1, 1, 4, 0F,-0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F); // Box 101
		hipsModel[417].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[417].rotateAngleX = -0.19198622F;

		hipsModel[418].addShapeBox(-4.5F, -15F, -12.8F, 1, 1, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 102
		hipsModel[418].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[418].rotateAngleX = -0.19198622F;

		hipsModel[419].addShapeBox(-3.5F, -15F, -12.8F, 1, 1, 4, 0F,0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F); // Box 103
		hipsModel[419].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[419].rotateAngleX = -0.19198622F;

		hipsModel[420].addShapeBox(-3F, -15F, -11.3F, 1, 1, 1, 0F,-.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F, -.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F); // Box 104
		hipsModel[420].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[420].rotateAngleX = -0.19198622F;

		hipsModel[421].addShapeBox(-1F, -15F, -11.3F, 1, 1, 1, 0F,.1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F); // Box 105
		hipsModel[421].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[421].rotateAngleX = -0.19198622F;

		hipsModel[422].addShapeBox(-0.5F, -15F, -12.8F, 1, 1, 4, 0F,-0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F); // Box 106
		hipsModel[422].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[422].rotateAngleX = -0.19198622F;

		hipsModel[423].addShapeBox(0.5F, -15F, -12.8F, 1, 1, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 107
		hipsModel[423].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[423].rotateAngleX = -0.19198622F;

		hipsModel[424].addShapeBox(1.5F, -15F, -12.8F, 1, 1, 4, 0F,0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F); // Box 108
		hipsModel[424].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[424].rotateAngleX = -0.19198622F;

		hipsModel[425].addShapeBox(2F, -15F, -11.3F, 1, 1, 1, 0F,-.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F, -.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F); // Box 109
		hipsModel[425].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[425].rotateAngleX = -0.19198622F;

		hipsModel[426].addShapeBox(2.5F, -15F, -14.8F, 1, 4, 7, 0F,-0.5F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 110
		hipsModel[426].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[426].rotateAngleX = -0.19198622F;

		hipsModel[427].addShapeBox(-6.5F, -11F, -13.8F, 10, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		hipsModel[427].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[427].rotateAngleX = -0.19198622F;

		hipsModel[428].addShapeBox(-7F, -15F, -14.8F, 1, 4, 7, 0F,-0.5F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 112
		hipsModel[428].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[428].rotateAngleX = -0.19198622F;

		hipsModel[429].addShapeBox(-6.5F, -16F, -8.8F, 10, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		hipsModel[429].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[429].rotateAngleX = -0.19198622F;

		hipsModel[430].addShapeBox(0.5F, -16F, -11.3F, 1, 1, 1, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		hipsModel[430].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[430].rotateAngleX = -0.19198622F;

		hipsModel[431].addShapeBox(-1.5F, -18.3F, -11.3F, 5, 5, 1, 0F,-1.8F, -1.8F, -1F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, 0.2F, -1.8F, -1.8F, 0.2F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F); // Box 115
		hipsModel[431].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[431].rotateAngleX = -0.19198622F;

		hipsModel[432].addShapeBox(-4.5F, -16F, -11.3F, 1, 1, 1, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		hipsModel[432].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[432].rotateAngleX = -0.19198622F;

		hipsModel[433].addShapeBox(-6.5F, -18.3F, -11.3F, 5, 5, 1, 0F,-1.8F, -1.8F, -1F, -1.8F, -1.8F, -1F, -1.8F, -1.8F, 0.2F, -1.8F, -1.8F, 0.2F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F, -1.8F, -1.8F, -0.4F); // Box 117
		hipsModel[433].setRotationPoint(-4.5F, -21F, 0F);
		hipsModel[433].rotateAngleX = -0.19198622F;

		hipsModel[434].addShapeBox(0.5F, -17.5F, 6.5F, 1, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		hipsModel[434].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[435].addShapeBox(0.5F, -20.5F, 6.5F, 1, 3, 1, 0F,1F, -.2F, 6F, -1F, -.2F, 6F, -1F, -.2F, -6.5F, 1F, -.2F, -6.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F); // Box 119
		hipsModel[435].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[436].addShapeBox(-4.5F, -17.5F, 6.5F, 1, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		hipsModel[436].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[437].addShapeBox(-4.5F, -20.5F, 6.5F, 1, 3, 1, 0F,-1F, -0.2F, 6F, 1F, -0.2F, 6F, 1F, -0.2F, -6.5F, -1F, -0.2F, -6.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 121
		hipsModel[437].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[438].addShapeBox(0.5F, -20.5F, -7.5F, 1, 3, 1, 0F,1F, -0.2F, -6.5F, -1F, -0.2F, -6.5F, -1F, -0.2F, 6F, 1F, -0.2F, 6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 122
		hipsModel[438].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[439].addShapeBox(-4.5F, -20.5F, -7.5F, 1, 3, 1, 0F,-1F, -0.2F, -6.5F, 1F, -0.2F, -6.5F, 1F, -0.2F, 6F, -1F, -0.2F, 6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 123
		hipsModel[439].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[440].addShapeBox(-4.5F, -17.5F, -7.5F, 1, 1, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 125
		hipsModel[440].setRotationPoint(-4.5F, -22F, 0F);

		hipsModel[441].addShapeBox(0.5F, -17.5F, -7.5F, 1, 1, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 126
		hipsModel[441].setRotationPoint(-4.5F, -22F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 165, 117, textureX, textureY); // Box 0
		leftArmModel[1] = new ModelRendererTurbo(this, 186, 120, textureX, textureY); // Box 149
		leftArmModel[2] = new ModelRendererTurbo(this, 165, 110, textureX, textureY); // Box 150
		leftArmModel[3] = new ModelRendererTurbo(this, 165, 104, textureX, textureY); // Box 151
		leftArmModel[4] = new ModelRendererTurbo(this, 165, 100, textureX, textureY); // Box 152
		leftArmModel[5] = new ModelRendererTurbo(this, 186, 112, textureX, textureY); // Box 153
		leftArmModel[6] = new ModelRendererTurbo(this, 186, 105, textureX, textureY); // Box 154
		leftArmModel[7] = new ModelRendererTurbo(this, 186, 101, textureX, textureY); // Box 155
		leftArmModel[8] = new ModelRendererTurbo(this, 197, 101, textureX, textureY); // Box 156
		leftArmModel[9] = new ModelRendererTurbo(this, 186, 101, textureX, textureY); // Box 157
		leftArmModel[10] = new ModelRendererTurbo(this, 165, 124, textureX, textureY); // Box 159
		leftArmModel[11] = new ModelRendererTurbo(this, 165, 132, textureX, textureY); // Box 160
		leftArmModel[12] = new ModelRendererTurbo(this, 165, 138, textureX, textureY); // Box 161
		leftArmModel[13] = new ModelRendererTurbo(this, 186, 128, textureX, textureY); // Box 162
		leftArmModel[14] = new ModelRendererTurbo(this, 186, 136, textureX, textureY); // Box 163
		leftArmModel[15] = new ModelRendererTurbo(this, 186, 143, textureX, textureY); // Box 164
		leftArmModel[16] = new ModelRendererTurbo(this, 186, 143, textureX, textureY); // Box 165
		leftArmModel[17] = new ModelRendererTurbo(this, 197, 143, textureX, textureY); // Box 166
		leftArmModel[18] = new ModelRendererTurbo(this, 208, 100, textureX, textureY); // Box 167
		leftArmModel[19] = new ModelRendererTurbo(this, 208, 104, textureX, textureY); // Box 168
		leftArmModel[20] = new ModelRendererTurbo(this, 208, 110, textureX, textureY); // Box 169
		leftArmModel[21] = new ModelRendererTurbo(this, 208, 117, textureX, textureY); // Box 170
		leftArmModel[22] = new ModelRendererTurbo(this, 208, 124, textureX, textureY); // Box 171
		leftArmModel[23] = new ModelRendererTurbo(this, 208, 138, textureX, textureY); // Box 172
		leftArmModel[24] = new ModelRendererTurbo(this, 208, 132, textureX, textureY); // Box 173
		leftArmModel[25] = new ModelRendererTurbo(this, 187, 147, textureX, textureY); // Box 179
		leftArmModel[26] = new ModelRendererTurbo(this, 229, 106, textureX, textureY); // Box 0
		leftArmModel[27] = new ModelRendererTurbo(this, 221, 130, textureX, textureY); // Box 1
		leftArmModel[28] = new ModelRendererTurbo(this, 221, 124, textureX, textureY); // Box 2
		leftArmModel[29] = new ModelRendererTurbo(this, 221, 118, textureX, textureY); // Box 3
		leftArmModel[30] = new ModelRendererTurbo(this, 221, 124, textureX, textureY); // Box 4
		leftArmModel[31] = new ModelRendererTurbo(this, 221, 130, textureX, textureY); // Box 5
		leftArmModel[32] = new ModelRendererTurbo(this, 209, 162, textureX, textureY); // Box 6
		leftArmModel[33] = new ModelRendererTurbo(this, 209, 156, textureX, textureY); // Box 7
		leftArmModel[34] = new ModelRendererTurbo(this, 209, 162, textureX, textureY); // Box 8
		leftArmModel[35] = new ModelRendererTurbo(this, 209, 156, textureX, textureY); // Box 9
		leftArmModel[36] = new ModelRendererTurbo(this, 209, 150, textureX, textureY); // Box 10
		leftArmModel[37] = new ModelRendererTurbo(this, 221, 99, textureX, textureY); // Box 11
		leftArmModel[38] = new ModelRendererTurbo(this, 222, 112, textureX, textureY); // Box 12
		leftArmModel[39] = new ModelRendererTurbo(this, 216, 106, textureX, textureY); // Box 13
		leftArmModel[40] = new ModelRendererTurbo(this, 224, 105, textureX, textureY); // Box 14
		leftArmModel[41] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 15
		leftArmModel[42] = new ModelRendererTurbo(this, 209, 138, textureX, textureY); // Box 16
		leftArmModel[43] = new ModelRendererTurbo(this, 209, 138, textureX, textureY); // Box 17
		leftArmModel[44] = new ModelRendererTurbo(this, 209, 138, textureX, textureY); // Box 18
		leftArmModel[45] = new ModelRendererTurbo(this, 219, 140, textureX, textureY); // Box 19
		leftArmModel[46] = new ModelRendererTurbo(this, 219, 140, textureX, textureY); // Box 20
		leftArmModel[47] = new ModelRendererTurbo(this, 219, 140, textureX, textureY); // Box 21
		leftArmModel[48] = new ModelRendererTurbo(this, 151, 147, textureX, textureY); // Box 22
		leftArmModel[49] = new ModelRendererTurbo(this, 187, 147, textureX, textureY); // Box 24
		leftArmModel[50] = new ModelRendererTurbo(this, 151, 147, textureX, textureY); // Box 25
		leftArmModel[51] = new ModelRendererTurbo(this, 169, 143, textureX, textureY); // Box 26
		leftArmModel[52] = new ModelRendererTurbo(this, 241, 100, textureX, textureY); // Box 34
		leftArmModel[53] = new ModelRendererTurbo(this, 241, 104, textureX, textureY); // Box 35
		leftArmModel[54] = new ModelRendererTurbo(this, 241, 110, textureX, textureY); // Box 36
		leftArmModel[55] = new ModelRendererTurbo(this, 241, 117, textureX, textureY); // Box 37
		leftArmModel[56] = new ModelRendererTurbo(this, 241, 124, textureX, textureY); // Box 38
		leftArmModel[57] = new ModelRendererTurbo(this, 241, 132, textureX, textureY); // Box 39
		leftArmModel[58] = new ModelRendererTurbo(this, 241, 138, textureX, textureY); // Box 40
		leftArmModel[59] = new ModelRendererTurbo(this, 237, 143, textureX, textureY); // Box 41
		leftArmModel[60] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 42
		leftArmModel[61] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 43
		leftArmModel[62] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 45
		leftArmModel[63] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 46
		leftArmModel[64] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 47
		leftArmModel[65] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 48
		leftArmModel[66] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 49
		leftArmModel[67] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 52
		leftArmModel[68] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 53
		leftArmModel[69] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 58
		leftArmModel[70] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 59
		leftArmModel[71] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 60
		leftArmModel[72] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 61
		leftArmModel[73] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 62
		leftArmModel[74] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 63
		leftArmModel[75] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 64
		leftArmModel[76] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 65
		leftArmModel[77] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 66
		leftArmModel[78] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 67
		leftArmModel[79] = new ModelRendererTurbo(this, 152, 159, textureX, textureY); // Box 68
		leftArmModel[80] = new ModelRendererTurbo(this, 152, 153, textureX, textureY); // Box 69
		leftArmModel[81] = new ModelRendererTurbo(this, 189, 153, textureX, textureY); // Box 70
		leftArmModel[82] = new ModelRendererTurbo(this, 189, 159, textureX, textureY); // Box 71
		leftArmModel[83] = new ModelRendererTurbo(this, 213, 147, textureX, textureY); // Box 72
		leftArmModel[84] = new ModelRendererTurbo(this, 213, 147, textureX, textureY); // Box 73
		leftArmModel[85] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 74
		leftArmModel[86] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 75
		leftArmModel[87] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 76
		leftArmModel[88] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 77
		leftArmModel[89] = new ModelRendererTurbo(this, 207, 146, textureX, textureY); // Box 78
		leftArmModel[90] = new ModelRendererTurbo(this, 207, 149, textureX, textureY); // Box 79
		leftArmModel[91] = new ModelRendererTurbo(this, 224, 135, textureX, textureY); // Box 80
		leftArmModel[92] = new ModelRendererTurbo(this, 224, 141, textureX, textureY); // Box 81
		leftArmModel[93] = new ModelRendererTurbo(this, 229, 140, textureX, textureY); // Box 82
		leftArmModel[94] = new ModelRendererTurbo(this, 234, 140, textureX, textureY); // Box 84
		leftArmModel[95] = new ModelRendererTurbo(this, 229, 140, textureX, textureY); // Box 0
		leftArmModel[96] = new ModelRendererTurbo(this, 234, 140, textureX, textureY); // Box 1

		leftArmModel[0].addShapeBox(-8.5F, -0.5F, -2.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.57079633F;

		leftArmModel[1].addShapeBox(-1.5F, -0.5F, -3F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addShapeBox(-8.5F, -1.5F, -2.5F, 7, 1, 5, 0F,0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addShapeBox(-8.5F, -2.5F, -2F, 7, 1, 4, 0F,0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Box 151
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addShapeBox(-8.5F, -2.5F, -1F, 7, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.6F, .4F, 0F, -.6F, .4F, 0F, -.6F, .4F, 0F, -.6F, .4F); // Box 152
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(-1.5F, -1.5F, -3F, 3, 1, 6, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(-1.5F, -2.5F, -2.5F, 3, 1, 5, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F); // Box 154
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(-1.5F, -3F, 0.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.25F, -1.2F, 0F, -.25F, -1.2F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, -.35F, 0F, -.15F, -.35F); // Box 155
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addShapeBox(-1.5F, -3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F); // Box 156
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;

		leftArmModel[9].addShapeBox(-1.5F, -3F, -2.5F, 3, 1, 2, 0F,0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 157
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.57079633F;

		leftArmModel[10].addShapeBox(-8.5F, 0.5F, -2.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 159
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.57079633F;

		leftArmModel[11].addShapeBox(-8.5F, 1.5F, -2F, 7, 1, 4, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 160
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.57079633F;

		leftArmModel[12].addShapeBox(-8.5F, 1.5F, -1F, 7, 1, 2, 0F,0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 161
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.57079633F;

		leftArmModel[13].addShapeBox(-1.5F, 0.5F, -3F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 162
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = -1.57079633F;

		leftArmModel[14].addShapeBox(-1.5F, 1.5F, -2.5F, 3, 1, 5, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 163
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -1.57079633F;

		leftArmModel[15].addShapeBox(-1.5F, 2F, 0.5F, 3, 1, 2, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F); // Box 164
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = -1.57079633F;

		leftArmModel[16].addShapeBox(-1.5F, 2F, -2.5F, 3, 1, 2, 0F,0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = -1.57079633F;

		leftArmModel[17].addShapeBox(-1.5F, 2F, -0.5F, 3, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -1.57079633F;

		leftArmModel[18].addShapeBox(0.7F, -2.5F, -1F, 1, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.6F, .4F, 0F, -.6F, .4F, 0F, -.6F, .4F, 0F, -.6F, .4F); // Box 167
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -1.57079633F;

		leftArmModel[19].addShapeBox(0.7F, -2.5F, -2F, 1, 1, 4, 0F,0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Box 168
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = -1.57079633F;

		leftArmModel[20].addShapeBox(0.7F, -1.5F, -2.5F, 1, 1, 5, 0F,0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -1.57079633F;

		leftArmModel[21].addShapeBox(0.7F, -0.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -1.57079633F;

		leftArmModel[22].addShapeBox(0.7F, 0.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 171
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -1.57079633F;

		leftArmModel[23].addShapeBox(0.7F, 1.5F, -1F, 1, 1, 2, 0F,0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 172
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = -1.57079633F;

		leftArmModel[24].addShapeBox(0.7F, 1.5F, -2F, 1, 1, 4, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 173
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -1.57079633F;

		leftArmModel[25].addShapeBox(-7.5F, 0F, 3F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 179
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -1.57079633F;

		leftArmModel[26].addShapeBox(-3F, -2.5F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.7F, .5F, 0F, -.7F, .5F, 0F, 0F, .5F, 0F); // Box 0
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = -1.57079633F;

		leftArmModel[27].addShapeBox(1.5F, -3.5F, -0.5F, 1, 1, 1, 0F,-.4F, -.3F, 1.2F, .1F, -.3F, .2F, .1F, -.3F, .2F, -.4F, -.3F, 1.2F, -.4F, -.3F, 1.2F, .1F, -.3F, .2F, .1F, -.3F, .2F, -.4F, -.3F, 1.2F); // Box 1
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -1.57079633F;

		leftArmModel[28].addShapeBox(1F, -3.5F, -2F, 1, 1, 4, 0F,0F, -.3F, .2F, -.1F, -.3F, -.3F, -.1F, -.3F, -.3F, 0F, -.3F, .2F, 0F, -.3F, .2F, -.1F, -.3F, -.3F, -.1F, -.3F, -.3F, 0F, -.3F, .2F); // Box 2
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -1.57079633F;

		leftArmModel[29].addShapeBox(0F, -3.5F, -2F, 1, 1, 4, 0F,0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F); // Box 3
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = -1.57079633F;

		leftArmModel[30].addShapeBox(-1F, -3.5F, -2F, 1, 1, 4, 0F,-0.1F, -.3F, -0.3F, 0F, -.3F, .2F, 0F, -.3F, .2F, -0.1F, -.3F, -0.3F, -0.1F, -.3F, -0.3F, 0F, -.3F, .2F, 0F, -.3F, .2F, -0.1F, -.3F, -0.3F); // Box 4
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -1.57079633F;

		leftArmModel[31].addShapeBox(-1.5F, -3.5F, -0.5F, 1, 1, 1, 0F,.1F, -.3F, .2F, -0.4F, -.3F, 1.2F, -0.4F, -.3F, 1.2F, .1F, -.3F, .2F, .1F, -.3F, .2F, -0.4F, -.3F, 1.2F, -0.4F, -.3F, 1.2F, .1F, -.3F, .2F); // Box 5
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -1.57079633F;

		leftArmModel[32].addShapeBox(1.5F, -4.2F, -0.5F, 1, 1, 1, 0F,-.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F, -.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -.4F, 0F, 1.2F); // Box 6
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -1.57079633F;

		leftArmModel[33].addShapeBox(1F, -4.2F, -2F, 1, 1, 4, 0F,0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, 0F, 0F, .2F); // Box 7
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = -1.57079633F;

		leftArmModel[34].addShapeBox(-1.5F, -4.2F, -0.5F, 1, 1, 1, 0F,.1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F, .1F, 0F, .2F, -0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, .1F, 0F, .2F); // Box 8
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -1.57079633F;

		leftArmModel[35].addShapeBox(-1F, -4.2F, -2F, 1, 1, 4, 0F,-0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0F, .2F, 0F, 0F, .2F, -0.1F, 0F, -0.3F); // Box 9
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -1.57079633F;

		leftArmModel[36].addShapeBox(0F, -4.2F, -2F, 1, 1, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 10
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
		leftArmModel[36].rotateAngleZ = -1.57079633F;

		leftArmModel[37].addShapeBox(-3F, -3.5F, 0F, 2, 1, 4, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -1.57079633F;

		leftArmModel[38].addShapeBox(-2.5F, -1F, 0F, 1, 1, 4, 0F,.2F, -.7F, 0F, .2F, -.7F, 0F, .2F, -.7F, 0F, .2F, -.7F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 12
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = -1.57079633F;

		leftArmModel[39].addShapeBox(-2F, -2.5F, 0F, 1, 2, 4, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -0.7F, .5F, 0F); // Box 13
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -1.57079633F;

		leftArmModel[40].addShapeBox(-2.5F, -2.5F, 2F, 1, 2, 2, 0F,.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -1F, .2F, 0F, -1F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F); // Box 14
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = -1.57079633F;

		leftArmModel[41].addShapeBox(-7.5F, -1F, 2F, 5, 1, 2, 0F,0F, -.8F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);
		leftArmModel[41].rotateAngleZ = -1.57079633F;

		leftArmModel[42].addShapeBox(-7.5F, 1F, -3F, 1, 1, 6, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Box 16
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);
		leftArmModel[42].rotateAngleZ = -1.57079633F;

		leftArmModel[43].addShapeBox(-7.5F, 1F, -3F, 1, 1, 6, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F); // Box 17
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
		leftArmModel[43].rotateAngleZ = -1.57079633F;

		leftArmModel[44].addShapeBox(-7.5F, 1F, -3F, 1, 1, 6, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 18
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);
		leftArmModel[44].rotateAngleZ = -1.57079633F;

		leftArmModel[45].addShapeBox(-7.5F, 1F, -4F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F); // Box 19
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);
		leftArmModel[45].rotateAngleZ = -1.57079633F;

		leftArmModel[46].addShapeBox(-7.5F, 1F, -4F, 1, 1, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Box 20
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);
		leftArmModel[46].rotateAngleZ = -1.57079633F;

		leftArmModel[47].addShapeBox(-7.5F, 1F, -4F, 1, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 21
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);
		leftArmModel[47].rotateAngleZ = -1.57079633F;

		leftArmModel[48].addShapeBox(0.5F, 0F, 3F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 22
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);
		leftArmModel[48].rotateAngleZ = -1.57079633F;

		leftArmModel[49].addShapeBox(-7.5F, 0F, -4F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 24
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);
		leftArmModel[49].rotateAngleZ = -1.57079633F;

		leftArmModel[50].addShapeBox(0.5F, 0F, -4F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 25
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -1.57079633F;

		leftArmModel[51].addShapeBox(-7.5F, -1F, -4F, 5, 1, 2, 0F,0F, -.8F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);
		leftArmModel[51].rotateAngleZ = -1.57079633F;

		leftArmModel[52].addShapeBox(12.7F, -2.5F, -1F, 1, 1, 2, 0F,-.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, -.6F, .4F, -.3F, -.6F, .4F, -.3F, -.6F, .4F, -.3F, -.6F, .4F); // Box 34
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);
		leftArmModel[52].rotateAngleZ = -1.57079633F;

		leftArmModel[53].addShapeBox(12.7F, -2.5F, -2F, 1, 1, 4, 0F,-.3F, -.4F, -.6F, -.3F, -.4F, -.6F, -.3F, -.4F, -.6F, -.3F, -.4F, -.6F, -.3F, .1F, .1F, -.3F, .1F, .1F, -.3F, .1F, .1F, -.3F, .1F, .1F); // Box 35
		leftArmModel[53].setRotationPoint(0F, 0F, 0F);
		leftArmModel[53].rotateAngleZ = -1.57079633F;

		leftArmModel[54].addShapeBox(12.7F, -1.5F, -2.5F, 1, 1, 5, 0F,-.3F, -.1F, -.4F, -.3F, -.1F, -.4F, -.3F, -.1F, -.4F, -.3F, -.1F, -.4F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 36
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);
		leftArmModel[54].rotateAngleZ = -1.57079633F;

		leftArmModel[55].addShapeBox(12.7F, -0.5F, -2.5F, 1, 1, 5, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 37
		leftArmModel[55].setRotationPoint(0F, 0F, 0F);
		leftArmModel[55].rotateAngleZ = -1.57079633F;

		leftArmModel[56].addShapeBox(12.7F, 0.5F, -2.5F, 1, 1, 5, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -0.1F, -0.4F, -.3F, -0.1F, -0.4F, -.3F, -0.1F, -0.4F, -.3F, -0.1F, -0.4F); // Box 38
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);
		leftArmModel[56].rotateAngleZ = -1.57079633F;

		leftArmModel[57].addShapeBox(12.7F, 1.5F, -2F, 1, 1, 4, 0F,-.3F, 0.1F, 0.1F, -.3F, 0.1F, 0.1F, -.3F, 0.1F, 0.1F, -.3F, 0.1F, 0.1F, -.3F, -0.4F, -0.6F, -.3F, -0.4F, -0.6F, -.3F, -0.4F, -0.6F, -.3F, -0.4F, -0.6F); // Box 39
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);
		leftArmModel[57].rotateAngleZ = -1.57079633F;

		leftArmModel[58].addShapeBox(12.7F, 1.5F, -1F, 1, 1, 2, 0F,-.3F, -0.6F, 0.4F, -.3F, -0.6F, 0.4F, -.3F, -0.6F, 0.4F, -.3F, -0.6F, 0.4F, -.3F, 0F, -0.5F, -.3F, 0F, -0.5F, -.3F, 0F, -0.5F, -.3F, 0F, -0.5F); // Box 40
		leftArmModel[58].setRotationPoint(0F, 0F, 0F);
		leftArmModel[58].rotateAngleZ = -1.57079633F;

		leftArmModel[59].addShapeBox(12.7F, 0F, -2.5F, 1, 1, 5, 0F,-.4F, -.1F, 1F, -.4F, -.1F, 1F, -.4F, -.1F, 1F, -.4F, -.1F, 1F, -.4F, -.6F, 1F, -.4F, -.6F, 1F, -.4F, -.6F, 1F, -.4F, -.6F, 1F); // Box 41
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);
		leftArmModel[59].rotateAngleZ = -1.57079633F;

		leftArmModel[60].addShapeBox(15.5F, -0.5F, -3F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 42
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);
		leftArmModel[60].rotateAngleZ = -1.57079633F;

		leftArmModel[61].addShapeBox(1.5F, -3.5F, -1.5F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 43
		leftArmModel[61].setRotationPoint(0F, 0F, 0F);
		leftArmModel[61].rotateAngleZ = -1.57079633F;

		leftArmModel[62].addShapeBox(1.5F, -2.5F, -1.5F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 45
		leftArmModel[62].setRotationPoint(0F, 0F, 0F);
		leftArmModel[62].rotateAngleZ = -1.57079633F;

		leftArmModel[63].addShapeBox(1.5F, 0.5F, -1.5F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 46
		leftArmModel[63].setRotationPoint(0F, 0F, 0F);
		leftArmModel[63].rotateAngleZ = -1.57079633F;

		leftArmModel[64].addShapeBox(1.5F, 1.5F, -1.5F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 47
		leftArmModel[64].setRotationPoint(0F, 0F, 0F);
		leftArmModel[64].rotateAngleZ = -1.57079633F;

		leftArmModel[65].addShapeBox(1.5F, -1.1F, -3.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 48
		leftArmModel[65].setRotationPoint(0F, 0F, 0F);
		leftArmModel[65].rotateAngleZ = -1.57079633F;

		leftArmModel[66].addShapeBox(1.5F, -0.1F, -3.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 49
		leftArmModel[66].setRotationPoint(0F, 0F, 0F);
		leftArmModel[66].rotateAngleZ = -1.57079633F;

		leftArmModel[67].addShapeBox(1.5F, -3.1F, -2.6F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 52
		leftArmModel[67].setRotationPoint(0F, 0F, 0F);
		leftArmModel[67].rotateAngleZ = -1.57079633F;

		leftArmModel[68].addShapeBox(1.5F, -2.1F, -2.6F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 53
		leftArmModel[68].setRotationPoint(0F, 0F, 0F);
		leftArmModel[68].rotateAngleZ = -1.57079633F;

		leftArmModel[69].addShapeBox(1.5F, -2.3F, -3.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 58
		leftArmModel[69].setRotationPoint(0F, 0F, 0F);
		leftArmModel[69].rotateAngleZ = -1.57079633F;

		leftArmModel[70].addShapeBox(1.5F, -1.3F, -3.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 59
		leftArmModel[70].setRotationPoint(0F, 0F, 0F);
		leftArmModel[70].rotateAngleZ = -1.57079633F;

		leftArmModel[71].addShapeBox(1.5F, -2.1F, -0.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 60
		leftArmModel[71].setRotationPoint(0F, 0F, 0F);
		leftArmModel[71].rotateAngleZ = -1.57079633F;

		leftArmModel[72].addShapeBox(1.5F, -3.1F, -0.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 61
		leftArmModel[72].setRotationPoint(0F, 0F, 0F);
		leftArmModel[72].rotateAngleZ = -1.57079633F;

		leftArmModel[73].addShapeBox(1.5F, 1F, -2.6F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 62
		leftArmModel[73].setRotationPoint(0F, 0F, 0F);
		leftArmModel[73].rotateAngleZ = -1.57079633F;

		leftArmModel[74].addShapeBox(1.5F, -1.11022302462516E-16F, -2.6F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 63
		leftArmModel[74].setRotationPoint(0F, 0F, 0F);
		leftArmModel[74].rotateAngleZ = -1.57079633F;

		leftArmModel[75].addShapeBox(1.5F, 1F, -0.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 64
		leftArmModel[75].setRotationPoint(0F, 0F, 0F);
		leftArmModel[75].rotateAngleZ = -1.57079633F;

		leftArmModel[76].addShapeBox(1.5F, 0F, -0.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 65
		leftArmModel[76].setRotationPoint(0F, 0F, 0F);
		leftArmModel[76].rotateAngleZ = -1.57079633F;

		leftArmModel[77].addShapeBox(1.5F, -1.3F, 0.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 66
		leftArmModel[77].setRotationPoint(0F, 0F, 0F);
		leftArmModel[77].rotateAngleZ = -1.57079633F;

		leftArmModel[78].addShapeBox(1.5F, -2.3F, 0.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 67
		leftArmModel[78].setRotationPoint(0F, 0F, 0F);
		leftArmModel[78].rotateAngleZ = -1.57079633F;

		leftArmModel[79].addShapeBox(1.5F, -1.1F, 0.4F, 14, 2, 3, 0F,0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 68
		leftArmModel[79].setRotationPoint(0F, 0F, 0F);
		leftArmModel[79].rotateAngleZ = -1.57079633F;

		leftArmModel[80].addShapeBox(1.5F, -0.1F, 0.4F, 14, 2, 3, 0F,0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 69
		leftArmModel[80].setRotationPoint(0F, 0F, 0F);
		leftArmModel[80].rotateAngleZ = -1.57079633F;

		leftArmModel[81].addShapeBox(13.4F, -0.5F, -1.5F, 4, 2, 3, 0F,0F, -0.5F, -1.1F, -.6F, -0.5F, -1.1F, -.6F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -1.1F, -1.3F, -.6F, -1.1F, -1.3F, -.6F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // Box 70
		leftArmModel[81].setRotationPoint(0F, 0F, 0F);
		leftArmModel[81].rotateAngleZ = -1.57079633F;

		leftArmModel[82].addShapeBox(13.4F, -1.5F, -1.5F, 4, 2, 3, 0F,0F, -1.1F, -1.3F, -.6F, -1.1F, -1.3F, -.6F, -1.1F, -1.3F, 0F, -1.1F, -1.3F, 0F, -.5F, -1.1F, -.6F, -.5F, -1.1F, -.6F, -.5F, -1.1F, 0F, -.5F, -1.1F); // Box 71
		leftArmModel[82].setRotationPoint(0F, 0F, 0F);
		leftArmModel[82].rotateAngleZ = -1.57079633F;

		leftArmModel[83].addShapeBox(15.5F, -1F, -0.5F, 1, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .5F, .1F, 0F, .5F, .1F, 0F, .5F, .1F, 0F, .5F); // Box 72
		leftArmModel[83].setRotationPoint(0F, 0F, 0F);
		leftArmModel[83].rotateAngleZ = -1.57079633F;

		leftArmModel[84].addShapeBox(15.5F, 0F, -0.5F, 1, 1, 1, 0F,.1F, 0F, 0.5F, .1F, 0F, 0.5F, .1F, 0F, 0.5F, .1F, 0F, 0.5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 73
		leftArmModel[84].setRotationPoint(0F, 0F, 0F);
		leftArmModel[84].rotateAngleZ = -1.57079633F;

		leftArmModel[85].addShapeBox(15.5F, -0.5F, -2F, 1, 1, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 74
		leftArmModel[85].setRotationPoint(0F, 0F, 0F);
		leftArmModel[85].rotateAngleZ = -1.57079633F;

		leftArmModel[86].addShapeBox(15.5F, -0.5F, -1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Box 75
		leftArmModel[86].setRotationPoint(0F, 0F, 0F);
		leftArmModel[86].rotateAngleZ = -1.57079633F;

		leftArmModel[87].addShapeBox(15.5F, -0.5F, 1F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 76
		leftArmModel[87].setRotationPoint(0F, 0F, 0F);
		leftArmModel[87].rotateAngleZ = -1.57079633F;

		leftArmModel[88].addShapeBox(15.5F, -0.5F, 2F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftArmModel[88].setRotationPoint(0F, 0F, 0F);
		leftArmModel[88].rotateAngleZ = -1.57079633F;

		leftArmModel[89].addShapeBox(15.5F, -0.5F, 0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 78
		leftArmModel[89].setRotationPoint(0F, 0F, 0F);
		leftArmModel[89].rotateAngleZ = -1.57079633F;

		leftArmModel[90].addShapeBox(15.5F, -1F, -4F, 1, 1, 1, 0F,-.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F); // Box 79
		leftArmModel[90].setRotationPoint(0F, 0F, 0F);
		leftArmModel[90].rotateAngleZ = -1.57079633F;

		leftArmModel[91].addShapeBox(-7.5F, 1.7F, -4F, 1, 4, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 80
		leftArmModel[91].setRotationPoint(0F, 0F, 0F);
		leftArmModel[91].rotateAngleZ = -1.57079633F;

		leftArmModel[92].addShapeBox(-7.5F, 4.9F, -5.5F, 1, 1, 2, 0F,-.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F); // Box 81
		leftArmModel[92].setRotationPoint(0F, 0F, 0F);
		leftArmModel[92].rotateAngleZ = -1.57079633F;

		leftArmModel[93].addShapeBox(-7.5F, 4.9F, -6.5F, 1, 1, 1, 0F,-.25F, 0F, 0F, -.25F, 0F, 0F, -.25F, -.25F, 0F, -.25F, -.25F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.25F, -.5F, 0F, -.25F, -.5F, 0F); // Box 82
		leftArmModel[93].setRotationPoint(0F, 0F, 0F);
		leftArmModel[93].rotateAngleZ = -1.57079633F;

		leftArmModel[94].addShapeBox(-7.5F, 4.9F, -7.5F, 1, 1, 1, 0F,-0.35F, -0.25F, -.5F, -0.35F, -0.25F, -.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -.5F, -0.25F, -0.5F, -.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		leftArmModel[94].setRotationPoint(0F, 0F, 0F);
		leftArmModel[94].rotateAngleZ = -1.57079633F;

		leftArmModel[95].addShapeBox(-7.5F, 4.9F, -6.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 0
		leftArmModel[95].setRotationPoint(0F, 0F, 0F);
		leftArmModel[95].rotateAngleZ = -1.57079633F;

		leftArmModel[96].addShapeBox(-7.5F, 4.9F, -7.5F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 1
		leftArmModel[96].setRotationPoint(0F, 0F, 0F);
		leftArmModel[96].rotateAngleZ = -1.57079633F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1

		rightArmModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 1
		rightArmModel[0].setRotationPoint(-5.5F, -49F, -6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 47
		leftLegModel[1] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 48
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 49
		leftLegModel[3] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 50
		leftLegModel[4] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 51
		leftLegModel[5] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 52
		leftLegModel[6] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 53
		leftLegModel[7] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 54
		leftLegModel[8] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 55
		leftLegModel[9] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 56
		leftLegModel[10] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 57
		leftLegModel[11] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 58
		leftLegModel[12] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 59
		leftLegModel[13] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 1
		leftLegModel[14] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 2
		leftLegModel[15] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 3
		leftLegModel[16] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 4
		leftLegModel[17] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 5
		leftLegModel[18] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 6
		leftLegModel[19] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 14
		leftLegModel[20] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 15
		leftLegModel[21] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 16
		leftLegModel[22] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 17
		leftLegModel[23] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 18
		leftLegModel[24] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 19
		leftLegModel[25] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 20
		leftLegModel[26] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 21
		leftLegModel[27] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 22
		leftLegModel[28] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 24
		leftLegModel[29] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 0
		leftLegModel[30] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 1
		leftLegModel[31] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 2
		leftLegModel[32] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 3
		leftLegModel[33] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 4
		leftLegModel[34] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 5
		leftLegModel[35] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 0
		leftLegModel[36] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 1
		leftLegModel[37] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 2
		leftLegModel[38] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 3
		leftLegModel[39] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 4
		leftLegModel[40] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 5
		leftLegModel[41] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 6
		leftLegModel[42] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 7
		leftLegModel[43] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 24
		leftLegModel[44] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 25
		leftLegModel[45] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 26
		leftLegModel[46] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 27
		leftLegModel[47] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 28
		leftLegModel[48] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 29
		leftLegModel[49] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 30
		leftLegModel[50] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 31
		leftLegModel[51] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 32
		leftLegModel[52] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 33
		leftLegModel[53] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 34
		leftLegModel[54] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 35
		leftLegModel[55] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 36
		leftLegModel[56] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 37
		leftLegModel[57] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 38
		leftLegModel[58] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 39
		leftLegModel[59] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 40
		leftLegModel[60] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 41
		leftLegModel[61] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 42
		leftLegModel[62] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 43
		leftLegModel[63] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 44
		leftLegModel[64] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 45
		leftLegModel[65] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 46
		leftLegModel[66] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 47
		leftLegModel[67] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 48
		leftLegModel[68] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 49
		leftLegModel[69] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 50
		leftLegModel[70] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 51
		leftLegModel[71] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 52
		leftLegModel[72] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 53
		leftLegModel[73] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 54
		leftLegModel[74] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 55
		leftLegModel[75] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 56
		leftLegModel[76] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 57
		leftLegModel[77] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 58
		leftLegModel[78] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 59
		leftLegModel[79] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 60
		leftLegModel[80] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 61
		leftLegModel[81] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 62
		leftLegModel[82] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 63
		leftLegModel[83] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 64
		leftLegModel[84] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 66
		leftLegModel[85] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 67

		leftLegModel[0].addShapeBox(-3F, 1F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F); // Box 47
		leftLegModel[0].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[1].addShapeBox(1F, 1F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, -.5F); // Box 48
		leftLegModel[1].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[2].addShapeBox(-3F, -3F, -2F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[2].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[3].addShapeBox(-1F, -3F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftLegModel[3].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[4].addShapeBox(1F, -3F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftLegModel[4].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[5].addShapeBox(-2F, 5F, -1.5F, 3, 2, 1, 0F,.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.8F, 0F, .3F, -.5F, 0F, .3F); // Box 52
		leftLegModel[5].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[6].addShapeBox(-1.5F, 7F, -1.5F, 2, 4, 1, 0F,.5F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 53
		leftLegModel[6].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[7].addShapeBox(-1.5F, 11F, -1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 54
		leftLegModel[7].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[8].addShapeBox(-1.5F, 13F, -1.5F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F); // Box 55
		leftLegModel[8].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[9].addShapeBox(-1.5F, 14F, -1.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 56
		leftLegModel[9].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[10].addShapeBox(0.5F, 21F, -1F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[10].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[11].addShapeBox(0F, 23F, -1F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 58
		leftLegModel[11].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[12].addShapeBox(-1F, 24F, -1F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 59
		leftLegModel[12].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[13].addShapeBox(-3F, -3F, -1F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 1
		leftLegModel[13].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[14].addShapeBox(-1F, -3F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 2
		leftLegModel[14].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[15].addShapeBox(1F, -3F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 3
		leftLegModel[15].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[16].addShapeBox(1F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -1.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftLegModel[16].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[17].addShapeBox(-1F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftLegModel[17].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[18].addShapeBox(-3F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
		leftLegModel[18].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[19].addShapeBox(1F, -3F, -3F, 2, 4, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftLegModel[19].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[20].addShapeBox(-1F, -3F, -3F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftLegModel[20].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[21].addShapeBox(-3F, -3F, -3F, 2, 4, 1, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftLegModel[21].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[22].addShapeBox(-3F, 1F, -3F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 17
		leftLegModel[22].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[23].addShapeBox(-1F, 1F, -3F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftLegModel[23].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[24].addShapeBox(1F, 1F, -3F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		leftLegModel[24].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[25].addShapeBox(-2F, 5F, -2.5F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftLegModel[25].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[26].addShapeBox(-1.5F, 7F, -2.5F, 2, 4, 1, 0F,0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftLegModel[26].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[27].addShapeBox(-1.5F, 11F, -2.5F, 2, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 22
		leftLegModel[27].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[28].addShapeBox(0.5F, 21F, -2F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 24
		leftLegModel[28].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[29].addShapeBox(0.5F, 22F, -1F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftLegModel[29].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[30].addShapeBox(0.5F, 22F, -2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 1
		leftLegModel[30].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[31].addShapeBox(0F, 23F, -2F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 2
		leftLegModel[31].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[32].addShapeBox(-1F, 24F, -2F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftLegModel[32].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[33].addShapeBox(3F, 24F, -1F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 4
		leftLegModel[33].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[34].addShapeBox(3.5F, 24F, -1F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 5
		leftLegModel[34].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[35].addShapeBox(-1.5F, 13F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftLegModel[35].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[36].addShapeBox(-1.5F, 14F, -2.5F, 2, 7, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 1
		leftLegModel[36].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[37].addShapeBox(0.5F, 21F, -3F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 2
		leftLegModel[37].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[38].addShapeBox(0.5F, 22F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 3
		leftLegModel[38].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[39].addShapeBox(-1F, 24F, -3F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftLegModel[39].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[40].addShapeBox(3F, 24F, -3F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 5
		leftLegModel[40].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[41].addShapeBox(3.5F, 24F, -3F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 6
		leftLegModel[41].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[42].addShapeBox(0F, 23F, -3F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 7
		leftLegModel[42].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[43].addShapeBox(3.5F, 24F, -10F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 24
		leftLegModel[43].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[44].addShapeBox(3.5F, 24F, -8F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 25
		leftLegModel[44].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[45].addShapeBox(3F, 24F, -8F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 26
		leftLegModel[45].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[46].addShapeBox(3F, 24F, -10F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 27
		leftLegModel[46].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[47].addShapeBox(-1F, 24F, -9F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftLegModel[47].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[48].addShapeBox(0F, 23F, -10F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 29
		leftLegModel[48].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[49].addShapeBox(0F, 23F, -8F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 30
		leftLegModel[49].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[50].addShapeBox(0.5F, 22F, -10F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 31
		leftLegModel[50].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[51].addShapeBox(0.5F, 22F, -9F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 32
		leftLegModel[51].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[52].addShapeBox(0.5F, 22F, -8F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 33
		leftLegModel[52].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[53].addShapeBox(0.5F, 21F, -8F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftLegModel[53].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[54].addShapeBox(0.5F, 21F, -9F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 35
		leftLegModel[54].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[55].addShapeBox(0.5F, 21F, -10F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 36
		leftLegModel[55].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[56].addShapeBox(-1F, 24F, -10F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftLegModel[56].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[57].addShapeBox(-1F, 24F, -8F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 38
		leftLegModel[57].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[58].addShapeBox(-1.5F, 14F, -9.5F, 2, 7, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 39
		leftLegModel[58].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[59].addShapeBox(-1.5F, 14F, -8.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 40
		leftLegModel[59].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[60].addShapeBox(-1.5F, 13F, -8.5F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F); // Box 41
		leftLegModel[60].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[61].addShapeBox(-1.5F, 13F, -9.5F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftLegModel[61].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[62].addShapeBox(-1.5F, 11F, -9.5F, 2, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 43
		leftLegModel[62].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[63].addShapeBox(-1.5F, 11F, -8.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 44
		leftLegModel[63].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[64].addShapeBox(-1.5F, 7F, -8.5F, 2, 4, 1, 0F,.5F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 45
		leftLegModel[64].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[65].addShapeBox(-1.5F, 7F, -9.5F, 2, 4, 1, 0F,0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftLegModel[65].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[66].addShapeBox(-2F, 5F, -9.5F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftLegModel[66].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[67].addShapeBox(-2F, 5F, -8.5F, 3, 2, 1, 0F,.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.8F, 0F, .3F, -.5F, 0F, .3F); // Box 48
		leftLegModel[67].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[68].addShapeBox(1F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -1.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[68].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[69].addShapeBox(1F, 1F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, -.5F); // Box 50
		leftLegModel[69].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[70].addShapeBox(1F, 1F, -10F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		leftLegModel[70].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[71].addShapeBox(1F, -3F, -10F, 2, 4, 1, 0F,0F, -1F, 0F, -1F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftLegModel[71].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[72].addShapeBox(1F, -3F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftLegModel[72].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[73].addShapeBox(1F, -3F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 54
		leftLegModel[73].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[74].addShapeBox(-1F, -3F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftLegModel[74].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[75].addShapeBox(-1F, -3F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 56
		leftLegModel[75].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[76].addShapeBox(-3F, -3F, -9F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[76].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[77].addShapeBox(-3F, -3F, -8F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 58
		leftLegModel[77].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[78].addShapeBox(-1F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftLegModel[78].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[79].addShapeBox(-3F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		leftLegModel[79].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[80].addShapeBox(-3F, 1F, -10F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		leftLegModel[80].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[81].addShapeBox(-3F, 1F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F); // Box 62
		leftLegModel[81].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[82].addShapeBox(0F, 23F, -9F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 63
		leftLegModel[82].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[83].addShapeBox(-1F, 1F, -10F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftLegModel[83].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[84].addShapeBox(-1F, -3F, -10F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftLegModel[84].setRotationPoint(1.5F, -25F, 5F);

		leftLegModel[85].addShapeBox(-3F, -3F, -10F, 2, 4, 1, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftLegModel[85].setRotationPoint(1.5F, -25F, 5F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 61
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 62
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 63
		rightLegModel[3] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 65
		rightLegModel[4] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 66
		rightLegModel[5] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 67
		rightLegModel[6] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 68
		rightLegModel[7] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 69
		rightLegModel[8] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 70
		rightLegModel[9] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 71
		rightLegModel[10] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 0
		rightLegModel[11] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 7
		rightLegModel[12] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 8
		rightLegModel[13] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 9
		rightLegModel[14] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 10
		rightLegModel[15] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 11
		rightLegModel[16] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 12
		rightLegModel[17] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 8
		rightLegModel[18] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 9
		rightLegModel[19] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 10
		rightLegModel[20] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 11
		rightLegModel[21] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 12
		rightLegModel[22] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 13
		rightLegModel[23] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 14
		rightLegModel[24] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 15
		rightLegModel[25] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 16
		rightLegModel[26] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 17
		rightLegModel[27] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 18
		rightLegModel[28] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 19
		rightLegModel[29] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 20
		rightLegModel[30] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 21
		rightLegModel[31] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 22
		rightLegModel[32] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 23
		rightLegModel[33] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 72
		rightLegModel[34] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 73
		rightLegModel[35] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 74
		rightLegModel[36] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 75
		rightLegModel[37] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 76
		rightLegModel[38] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 78
		rightLegModel[39] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 0
		rightLegModel[40] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 1
		rightLegModel[41] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 2
		rightLegModel[42] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 3
		rightLegModel[43] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 4
		rightLegModel[44] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 5
		rightLegModel[45] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 6
		rightLegModel[46] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 7
		rightLegModel[47] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 8
		rightLegModel[48] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 9
		rightLegModel[49] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 10
		rightLegModel[50] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 11
		rightLegModel[51] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 12
		rightLegModel[52] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 13
		rightLegModel[53] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 14
		rightLegModel[54] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 15
		rightLegModel[55] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 16
		rightLegModel[56] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 17
		rightLegModel[57] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 18
		rightLegModel[58] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 19
		rightLegModel[59] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 20
		rightLegModel[60] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 21
		rightLegModel[61] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 22
		rightLegModel[62] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 23
		rightLegModel[63] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 24
		rightLegModel[64] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 25
		rightLegModel[65] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 26
		rightLegModel[66] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 27
		rightLegModel[67] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 28
		rightLegModel[68] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 29
		rightLegModel[69] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 30
		rightLegModel[70] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 31
		rightLegModel[71] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 32
		rightLegModel[72] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 33
		rightLegModel[73] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 34
		rightLegModel[74] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 35
		rightLegModel[75] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 36
		rightLegModel[76] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 37
		rightLegModel[77] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 38
		rightLegModel[78] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 39
		rightLegModel[79] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 40
		rightLegModel[80] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 41
		rightLegModel[81] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 42
		rightLegModel[82] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 43
		rightLegModel[83] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 44
		rightLegModel[84] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 45
		rightLegModel[85] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 46
		rightLegModel[86] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 47
		rightLegModel[87] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 48
		rightLegModel[88] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 49
		rightLegModel[89] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 50
		rightLegModel[90] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 51
		rightLegModel[91] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 52
		rightLegModel[92] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 53
		rightLegModel[93] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 54
		rightLegModel[94] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 55
		rightLegModel[95] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 56

		rightLegModel[0].addShapeBox(-2F, -4F, -2F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightLegModel[0].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[1].addShapeBox(1F, -4F, -2F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightLegModel[1].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[2].addShapeBox(1F, 0F, -2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -1F, 0F, 0F); // Box 63
		rightLegModel[2].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[3].addShapeBox(-5F, 0F, -2F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		rightLegModel[3].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[4].addShapeBox(-3F, 8F, -1.5F, 3, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightLegModel[4].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[5].addShapeBox(-4F, 7F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 67
		rightLegModel[5].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[6].addShapeBox(-5F, 8F, -1.5F, 2, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, .3F, -2F, 0F, .3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		rightLegModel[6].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[7].addShapeBox(-5F, -4F, -2F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 69
		rightLegModel[7].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[8].addShapeBox(-4F, 15F, -1.5F, 2, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 70
		rightLegModel[8].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[9].addShapeBox(-4F, 18F, -1.5F, 2, 4, 1, 0F,0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F); // Box 71
		rightLegModel[9].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[10].addShapeBox(-5F, 13F, -1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F); // Box 0
		rightLegModel[10].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[11].addShapeBox(1F, -4F, -1F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F); // Box 7
		rightLegModel[11].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[12].addShapeBox(-2F, -4F, -1F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 8
		rightLegModel[12].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[13].addShapeBox(-5F, -4F, -1F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 1F, 0F); // Box 9
		rightLegModel[13].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[14].addShapeBox(-5F, 0F, -1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 10
		rightLegModel[14].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[15].addShapeBox(-2F, 0F, -1F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightLegModel[15].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[16].addShapeBox(1F, 0F, -1F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, 0F, -.5F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[16].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[17].addShapeBox(0.5F, 25F, -3F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 8
		rightLegModel[17].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[18].addShapeBox(0F, 25F, -3F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 9
		rightLegModel[18].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[19].addShapeBox(0.5F, 25F, -1F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 10
		rightLegModel[19].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[20].addShapeBox(0F, 25F, -1F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		rightLegModel[20].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[21].addShapeBox(-4F, 25F, -2F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[21].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[22].addShapeBox(-3F, 24F, -2F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 13
		rightLegModel[22].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[23].addShapeBox(-3F, 24F, -3F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 14
		rightLegModel[23].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[24].addShapeBox(-3F, 24F, -1F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 15
		rightLegModel[24].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[25].addShapeBox(-2.5F, 23F, -2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 16
		rightLegModel[25].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[26].addShapeBox(-2.5F, 23F, -1F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 17
		rightLegModel[26].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[27].addShapeBox(-2.5F, 22F, -1F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightLegModel[27].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[28].addShapeBox(-2.5F, 22F, -2F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 19
		rightLegModel[28].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[29].addShapeBox(-2.5F, 22F, -3F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 20
		rightLegModel[29].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[30].addShapeBox(-2.5F, 23F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		rightLegModel[30].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[31].addShapeBox(-4F, 25F, -3F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightLegModel[31].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[32].addShapeBox(-4F, 25F, -1F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 23
		rightLegModel[32].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[33].addShapeBox(-5F, 14F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F); // Box 72
		rightLegModel[33].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[34].addShapeBox(1F, -4F, -9F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightLegModel[34].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[35].addShapeBox(-2F, -4F, -9F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightLegModel[35].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[36].addShapeBox(-5F, -4F, -9F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		rightLegModel[36].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[37].addShapeBox(1F, 0F, -9F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -1F, 0F, 0F); // Box 76
		rightLegModel[37].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[38].addShapeBox(-5F, 0F, -9F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 78
		rightLegModel[38].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[39].addShapeBox(-4F, 7F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -2F, 0F, -.2F, -1F, 0F, -.2F); // Box 0
		rightLegModel[39].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[40].addShapeBox(-4F, 18F, -2.5F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		rightLegModel[40].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[41].addShapeBox(-4F, 15F, -2.5F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightLegModel[41].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[42].addShapeBox(-5F, 14F, -2.5F, 3, 1, 1, 0F,-0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		rightLegModel[42].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[43].addShapeBox(-5F, 13F, -2.5F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightLegModel[43].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[44].addShapeBox(-3F, 8F, -2.5F, 3, 5, 1, 0F,-1F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightLegModel[44].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[45].addShapeBox(-5F, 8F, -2.5F, 2, 5, 1, 0F,-2F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		rightLegModel[45].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[46].addShapeBox(-4F, 7F, -3F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		rightLegModel[46].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[47].addShapeBox(1F, -4F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 2F); // Box 8
		rightLegModel[47].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[48].addShapeBox(-2F, -4F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 9
		rightLegModel[48].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[49].addShapeBox(-5F, -4F, -8F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 1F, 1F); // Box 10
		rightLegModel[49].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[50].addShapeBox(-5F, 0F, -8F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 11
		rightLegModel[50].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[51].addShapeBox(-2F, 0F, -8F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[51].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[52].addShapeBox(1F, 0F, -8F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 0F, -.5F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 13
		rightLegModel[52].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[53].addShapeBox(-4F, 7F, -8F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -2F, 0F, -.2F, -1F, 0F, -.2F); // Box 14
		rightLegModel[53].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[54].addShapeBox(-4F, 7F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 15
		rightLegModel[54].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[55].addShapeBox(-4F, 7F, -10F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 16
		rightLegModel[55].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[56].addShapeBox(1F, 0F, -3F, 3, 7, 1, 0F,0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F); // Box 17
		rightLegModel[56].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[57].addShapeBox(1F, -4F, -3F, 3, 4, 1, 0F,0F, -1F, 0F, -2F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightLegModel[57].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[58].addShapeBox(-2F, -4F, -3F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightLegModel[58].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[59].addShapeBox(-2F, 0F, -3F, 3, 7, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightLegModel[59].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[60].addShapeBox(-5F, -4F, -3F, 3, 4, 1, 0F,-1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 21
		rightLegModel[60].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[61].addShapeBox(-5F, 0F, -3F, 3, 7, 1, 0F,-1F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		rightLegModel[61].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[62].addShapeBox(1F, -4F, -10F, 3, 4, 1, 0F,0F, -1F, 0F, -2F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightLegModel[62].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[63].addShapeBox(1F, 0F, -10F, 3, 7, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F); // Box 24
		rightLegModel[63].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[64].addShapeBox(-2F, -4F, -10F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightLegModel[64].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[65].addShapeBox(-2F, 0F, -10F, 3, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightLegModel[65].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[66].addShapeBox(-5F, -4F, -10F, 3, 4, 1, 0F,-1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 27
		rightLegModel[66].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[67].addShapeBox(-5F, 0F, -10F, 3, 7, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 28
		rightLegModel[67].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[68].addShapeBox(-5F, 8F, -8.5F, 2, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, .3F, -2F, 0F, .3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 29
		rightLegModel[68].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[69].addShapeBox(-5F, 8F, -9.5F, 2, 5, 1, 0F,-2F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		rightLegModel[69].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[70].addShapeBox(-5F, 13F, -9.5F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightLegModel[70].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[71].addShapeBox(-5F, 13F, -8.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F); // Box 32
		rightLegModel[71].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[72].addShapeBox(-5F, 14F, -8.5F, 3, 1, 1, 0F,0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F); // Box 33
		rightLegModel[72].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[73].addShapeBox(-5F, 14F, -9.5F, 3, 1, 1, 0F,-0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 34
		rightLegModel[73].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[74].addShapeBox(-4F, 15F, -9.5F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightLegModel[74].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[75].addShapeBox(-4F, 15F, -8.5F, 2, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 36
		rightLegModel[75].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[76].addShapeBox(-4F, 18F, -8.5F, 2, 4, 1, 0F,0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F); // Box 37
		rightLegModel[76].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[77].addShapeBox(-4F, 18F, -9.5F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		rightLegModel[77].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[78].addShapeBox(-2.5F, 22F, -10F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 39
		rightLegModel[78].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[79].addShapeBox(-2.5F, 22F, -8F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightLegModel[79].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[80].addShapeBox(-2.5F, 22F, -9F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 41
		rightLegModel[80].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[81].addShapeBox(-2.5F, 23F, -9F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 42
		rightLegModel[81].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[82].addShapeBox(-2.5F, 23F, -10F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 43
		rightLegModel[82].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[83].addShapeBox(-2.5F, 23F, -8F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 44
		rightLegModel[83].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[84].addShapeBox(-3F, 24F, -8F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 45
		rightLegModel[84].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[85].addShapeBox(-3F, 24F, -9F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 46
		rightLegModel[85].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[86].addShapeBox(-3F, 24F, -10F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 47
		rightLegModel[86].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[87].addShapeBox(-4F, 25F, -9F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightLegModel[87].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[88].addShapeBox(-4F, 25F, -8F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 49
		rightLegModel[88].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[89].addShapeBox(-4F, 25F, -10F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightLegModel[89].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[90].addShapeBox(0F, 25F, -10F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 51
		rightLegModel[90].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[91].addShapeBox(0.5F, 25F, -10F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 52
		rightLegModel[91].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[92].addShapeBox(0.5F, 25F, -8F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 53
		rightLegModel[92].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[93].addShapeBox(0F, 25F, -8F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 54
		rightLegModel[93].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[94].addShapeBox(-3F, 8F, -8.5F, 3, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightLegModel[94].setRotationPoint(-17.5F, -26F, 5F);

		rightLegModel[95].addShapeBox(-3F, 8F, -9.5F, 3, 5, 1, 0F,-1F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightLegModel[95].setRotationPoint(-17.5F, -26F, 5F);
	}
}