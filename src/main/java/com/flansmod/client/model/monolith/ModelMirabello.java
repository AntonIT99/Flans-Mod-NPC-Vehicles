//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMirabello extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMirabello() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[89];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 55
		bodyModel[18] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 56
		bodyModel[19] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 57
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 58
		bodyModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		bodyModel[22] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 77
		bodyModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 96
		bodyModel[27] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 70
		bodyModel[28] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 84
		bodyModel[30] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 85
		bodyModel[31] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 88
		bodyModel[34] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 25
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		bodyModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 27
		bodyModel[37] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 28
		bodyModel[38] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 29
		bodyModel[39] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 30
		bodyModel[40] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 99
		bodyModel[41] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 100
		bodyModel[42] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 111
		bodyModel[47] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 112
		bodyModel[48] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 81
		bodyModel[49] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 82
		bodyModel[50] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 83
		bodyModel[51] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 84
		bodyModel[52] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 89
		bodyModel[53] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 90
		bodyModel[54] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		bodyModel[55] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 92
		bodyModel[56] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 93
		bodyModel[57] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 94
		bodyModel[58] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 95
		bodyModel[59] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 12
		bodyModel[60] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 14
		bodyModel[62] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 15
		bodyModel[63] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		bodyModel[64] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		bodyModel[65] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 18
		bodyModel[66] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 19
		bodyModel[67] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 20
		bodyModel[68] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 21
		bodyModel[69] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 22
		bodyModel[70] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 23
		bodyModel[71] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 24
		bodyModel[72] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 25
		bodyModel[73] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 26
		bodyModel[74] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 27
		bodyModel[75] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 28
		bodyModel[76] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 29
		bodyModel[77] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 30
		bodyModel[78] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 31
		bodyModel[79] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 32
		bodyModel[80] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 33
		bodyModel[81] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 34
		bodyModel[82] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 35
		bodyModel[83] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 36
		bodyModel[84] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 37
		bodyModel[85] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 38
		bodyModel[86] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 39
		bodyModel[87] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 40
		bodyModel[88] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 3, 14, 0F,33F, 0.2F, 0F, 26F, 0F, 0F, 26F, 0F, 0F, 33F, 0.2F, 0F, 33F, 0.5F, 0F, 26F, 0.5F, 0F, 26F, 0.5F, 0F, 33F, 0.5F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31F, 0.5F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 70, 4, 14, 0F,-2.5F, -0.5F, 0F, 0.6F, -0.5F, -4.5F, 0.6F, -0.5F, -4.5F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, -4.5F, 0.5F, -1F, -4.5F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(28F, -4F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 49, 4, 14, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(28F, 0F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 10
		bodyModel[3].setRotationPoint(-97F, 0F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 38, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[4].setRotationPoint(44F, -48F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F); // Box 15
		bodyModel[5].setRotationPoint(-65F, -50F, -0.5F);
		bodyModel[5].rotateAngleZ = 0.01745329F;

		bodyModel[6].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 22
		bodyModel[6].setRotationPoint(10F, -1.5F, -6F);

		bodyModel[7].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[7].setRotationPoint(10F, -1.5F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[8].setRotationPoint(-71.5F, -7F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 40
		bodyModel[9].setRotationPoint(-72.5F, -7F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		bodyModel[10].setRotationPoint(-77F, -7F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 5, 14, 0F,4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, -1.5F, -3F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 4.5F, -1.5F, -3F); // Box 48
		bodyModel[11].setRotationPoint(-80.5F, 4F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,2F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, -5F, -4F, -2.8F, -4F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -4F, -2.8F, -4F); // Box 49
		bodyModel[12].setRotationPoint(-94F, 3F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 49, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 1F, -2F); // Box 50
		bodyModel[13].setRotationPoint(28F, 4F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 33, 6, 14, 0F,33F, 0F, 0F, 26F, 0F, 0F, 26F, 0F, 0F, 33F, 0F, 0F, 38F, 0.5F, -2F, 26F, 0F, -2F, 26F, 0F, -2F, 38F, 0.5F, -2F); // Box 51
		bodyModel[14].setRotationPoint(-31F, 4F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 6, 12, 0F,0F, 0F, -3F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, -0.5F, -3.5F); // Box 52
		bodyModel[15].setRotationPoint(77F, 4F, -6F);

		bodyModel[16].addShapeBox(-8.6F, -1.5F, 0F, 21, 15, 1, 0F,-3.35F, -4F, -0.45F, -12.35F, -4F, -0.45F, -12.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -7.5F, -0.45F, -12.35F, -7.5F, -0.45F, -12.35F, -7.5F, -0.45F, -3.35F, -7.5F, -0.45F); // Box 53
		bodyModel[16].setRotationPoint(-96.8F, -10F, -0.5F);
		bodyModel[16].rotateAngleZ = 0.08726646F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F,8F, 0.4F, -1F, 8F, 0.2F, 0F, 8F, 0.2F, 0F, 8F, 0.4F, -1F, 8F, 0.5F, -1F, 8F, 0.5F, 0F, 8F, 0.5F, 0F, 8F, 0.5F, -1F); // Box 55
		bodyModel[17].setRotationPoint(-77F, 0.5F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 5, 12, 0F,0F, 0F, -2.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, -3F); // Box 56
		bodyModel[18].setRotationPoint(77F, -1F, -6F);

		bodyModel[19].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 57
		bodyModel[19].setRotationPoint(10F, -1.5F, -6F);

		bodyModel[20].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 58
		bodyModel[20].setRotationPoint(10F, -1.5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[21].setRotationPoint(8.5F, -1F, -6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 63
		bodyModel[22].setRotationPoint(57.5F, -6.5F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[23].setRotationPoint(58.5F, -6.5F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 65
		bodyModel[24].setRotationPoint(60F, -6.5F, -0.5F);

		bodyModel[25].addShapeBox(-0.5F, -1.5F, 0F, 1, 16, 1, 0F,-0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F); // Box 77
		bodyModel[25].setRotationPoint(-96.8F, -10F, -0.5F);
		bodyModel[25].rotateAngleZ = 0.12217305F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 96
		bodyModel[26].setRotationPoint(-96F, 4F, -0.5F);
		bodyModel[26].rotateAngleZ = -0.12217305F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[27].setRotationPoint(3.5F, -12F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 71
		bodyModel[28].setRotationPoint(2F, -2F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 84
		bodyModel[29].setRotationPoint(-43F, -5F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 85
		bodyModel[30].setRotationPoint(-49F, -5F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 86
		bodyModel[31].setRotationPoint(-53F, -5F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[32].setRotationPoint(-39F, -6F, 5.8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[33].setRotationPoint(-51F, -6F, 5.8F);

		bodyModel[34].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 25
		bodyModel[34].setRotationPoint(-58.5F, -2.5F, 6.5F);
		bodyModel[34].rotateAngleY = 2.51327412F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 26
		bodyModel[35].setRotationPoint(-58.5F, -2.5F, 6.5F);
		bodyModel[35].rotateAngleY = 2.51327412F;

		bodyModel[36].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 27
		bodyModel[36].setRotationPoint(-58.5F, -1.6F, 6.5F);
		bodyModel[36].rotateAngleY = 1.74532925F;

		bodyModel[37].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 28
		bodyModel[37].setRotationPoint(-59F, -2.5F, -6F);
		bodyModel[37].rotateAngleY = 3.9618974F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 29
		bodyModel[38].setRotationPoint(-59F, -2.5F, -6F);
		bodyModel[38].rotateAngleY = 3.9618974F;

		bodyModel[39].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[39].setRotationPoint(-58.5F, -1.6F, -6F);
		bodyModel[39].rotateAngleY = 1.74532925F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[40].setRotationPoint(-73.5F, -4.5F, -4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[41].setRotationPoint(-72.5F, -3.5F, -2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 103
		bodyModel[42].setRotationPoint(97.5F, -12F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 108
		bodyModel[43].setRotationPoint(-43F, -5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 109
		bodyModel[44].setRotationPoint(-49F, -5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 110
		bodyModel[45].setRotationPoint(-53F, -5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[46].setRotationPoint(-39F, -6F, -6.8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[47].setRotationPoint(-51F, -6F, -6.8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[48].setRotationPoint(43.1F, -7F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[49].setRotationPoint(43F, -10.5F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 83
		bodyModel[50].setRotationPoint(47F, -9F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -1.5F, 0F, -0.85F, -1.5F, 0F, -0.85F, 0F); // Box 84
		bodyModel[51].setRotationPoint(47F, -11F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		bodyModel[52].setRotationPoint(46.75F, -10F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 90
		bodyModel[53].setRotationPoint(46.75F, -10F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 91
		bodyModel[54].setRotationPoint(50.25F, -10F, 0.7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 92
		bodyModel[55].setRotationPoint(50.25F, -10F, -1.7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 93
		bodyModel[56].setRotationPoint(48.5F, -10F, -2.3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 94
		bodyModel[57].setRotationPoint(48.5F, -10F, 1.3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 95
		bodyModel[58].setRotationPoint(48.1F, -7F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[59].setRotationPoint(36.5F, -12F, -2F);

		bodyModel[60].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 13
		bodyModel[60].setRotationPoint(10F, -1.5F, 6F);

		bodyModel[61].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 14
		bodyModel[61].setRotationPoint(10F, -1.5F, 6F);

		bodyModel[62].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 15
		bodyModel[62].setRotationPoint(10F, -1.5F, 6F);

		bodyModel[63].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 16
		bodyModel[63].setRotationPoint(10F, -1.5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[64].setRotationPoint(8.5F, -1F, 5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 18
		bodyModel[65].setRotationPoint(-81.5F, -2.5F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 19
		bodyModel[66].setRotationPoint(-86F, -2.5F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[67].setRotationPoint(-80.5F, -2.5F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 21
		bodyModel[68].setRotationPoint(43.5F, -35F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 22
		bodyModel[69].setRotationPoint(44F, -37F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F, 47F, -0.3F, -0.3F); // Box 23
		bodyModel[70].setRotationPoint(-17F, -48F, -0.5F);
		bodyModel[70].rotateAngleZ = -0.01745329F;

		bodyModel[71].addShapeBox(2F, 0F, 0F, 14, 1, 1, 0F,20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F); // Box 24
		bodyModel[71].setRotationPoint(-86F, -20F, -0.5F);
		bodyModel[71].rotateAngleZ = 0.9424778F;

		bodyModel[72].addShapeBox(2F, 0F, 0F, 23, 1, 1, 0F,20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F); // Box 25
		bodyModel[72].setRotationPoint(60F, -34.5F, -0.5F);
		bodyModel[72].rotateAngleZ = -0.57595865F;

		bodyModel[73].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 26
		bodyModel[73].setRotationPoint(-28.5F, -1.6F, -6F);
		bodyModel[73].rotateAngleY = 1.74532925F;

		bodyModel[74].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 27
		bodyModel[74].setRotationPoint(-29F, -2.5F, -6F);
		bodyModel[74].rotateAngleY = 3.9618974F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 28
		bodyModel[75].setRotationPoint(-29F, -2.5F, -6F);
		bodyModel[75].rotateAngleY = 3.9618974F;

		bodyModel[76].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 29
		bodyModel[76].setRotationPoint(-28.5F, -2.5F, 6.5F);
		bodyModel[76].rotateAngleY = 2.51327412F;

		bodyModel[77].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[77].setRotationPoint(-28.5F, -1.6F, 6.5F);
		bodyModel[77].rotateAngleY = 1.74532925F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		bodyModel[78].setRotationPoint(-28.5F, -2.5F, 6.5F);
		bodyModel[78].rotateAngleY = 2.51327412F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 32
		bodyModel[79].setRotationPoint(-22F, -3F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 33
		bodyModel[80].setRotationPoint(-16F, -3F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 34
		bodyModel[81].setRotationPoint(-26F, -3F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 35
		bodyModel[82].setRotationPoint(-26F, -3F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 36
		bodyModel[83].setRotationPoint(-22F, -3F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 37
		bodyModel[84].setRotationPoint(-16F, -3F, 2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[85].setRotationPoint(-12F, -4F, 5.8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[86].setRotationPoint(-24F, -4F, 5.8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[87].setRotationPoint(-24F, -4F, -6.8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[88].setRotationPoint(-12F, -4F, -6.8F);
	}
}