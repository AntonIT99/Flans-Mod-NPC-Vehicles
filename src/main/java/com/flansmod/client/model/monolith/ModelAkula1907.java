//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAkula1907 extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelAkula1907() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 70
		bodyModel[56] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 71
		bodyModel[57] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 72
		bodyModel[58] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 77
		bodyModel[63] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 81
		bodyModel[67] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 82
		bodyModel[68] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 83
		bodyModel[69] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 84
		bodyModel[70] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 85
		bodyModel[71] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 86
		bodyModel[72] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 88
		bodyModel[74] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 89
		bodyModel[75] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 90
		bodyModel[76] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 91
		bodyModel[77] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 92
		bodyModel[78] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 93
		bodyModel[79] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 94
		bodyModel[80] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 95
		bodyModel[81] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 96
		bodyModel[82] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 97
		bodyModel[83] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 98
		bodyModel[84] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 99
		bodyModel[85] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 100
		bodyModel[86] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 101
		bodyModel[87] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 103
		bodyModel[89] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 104
		bodyModel[90] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 105
		bodyModel[91] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 107
		bodyModel[93] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 108
		bodyModel[94] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 109

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[0].setRotationPoint(-53F, -7F, -0.5F);
		bodyModel[0].rotateAngleZ = 0.08726646F;

		bodyModel[1].addShapeBox(-7F, -1F, 0F, 9, 7, 1, 0F,-1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F); // Box 52
		bodyModel[1].setRotationPoint(-53F, -7F, -0.5F);
		bodyModel[1].rotateAngleZ = 0.08726646F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(0F, 3F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(0F, 5F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 3
		bodyModel[4].setRotationPoint(0F, 7F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(26F, 5F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[6].setRotationPoint(26F, 3F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -0.5F, -3F, -4F, -0.5F, -3F, 0F, 0F, -3F); // Box 6
		bodyModel[7].setRotationPoint(26F, 7F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0.5F, -2.5F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -1F); // Box 7
		bodyModel[8].setRotationPoint(35F, 4F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, -1F, 1F, 0F, -3.8F, 1F, 0F, -3.8F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -3.8F, 2F, 0F, -3.8F, 0F, 0F, -1F); // Box 8
		bodyModel[9].setRotationPoint(35F, 5F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, -1F, 2F, 0F, -3.8F, 2F, 0F, -3.8F, 0F, 0F, -1F, 4F, 0.5F, -3F, -1F, -2F, -3.5F, -1F, -2F, -3.5F, 4F, 0.5F, -3F); // Box 9
		bodyModel[10].setRotationPoint(35F, 7F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.3F, -0.45F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.5F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, -0.6F); // Box 11
		bodyModel[11].setRotationPoint(46F, 1F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(18F, 1.5F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(14F, 1.5F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-11F, 1F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-0.2F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-19F, 1F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-23F, 1.6F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-26F, 3F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-26F, 5F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 4, 8, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.3F, -3F); // Box 19
		bodyModel[19].setRotationPoint(-20F, 7F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, -3F, 0F, -0.3F, -3F, 0F, -0.3F, -3F, 0F, -1F, -3F); // Box 20
		bodyModel[20].setRotationPoint(-26F, 7F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-37F, 1.5F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-45F, 2F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-1F, 1.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1.5F, -1F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -1F); // Box 23
		bodyModel[23].setRotationPoint(-54F, 2F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F); // Box 24
		bodyModel[24].setRotationPoint(-37F, 4.5F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 2.4F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.4F, -1F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -3F, -3F); // Box 25
		bodyModel[25].setRotationPoint(-37F, 7F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0.1F, -2.5F, 0F, 0.3F, -3.5F, 0F, 0.3F, -3.5F, 0F, 0.1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -2.5F); // Box 26
		bodyModel[26].setRotationPoint(35F, 1F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2.5F, -2F); // Box 27
		bodyModel[27].setRotationPoint(-45F, 4.5F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, -3F, -1.2F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -1F, -3F, -1.2F); // Box 28
		bodyModel[28].setRotationPoint(-54F, 4.5F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 29
		bodyModel[29].setRotationPoint(-7F, -1.5F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0.2F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 30
		bodyModel[30].setRotationPoint(-7F, -2.5F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 31
		bodyModel[31].setRotationPoint(-4.75F, -5.5F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 32
		bodyModel[32].setRotationPoint(-4.75F, -11.5F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		bodyModel[33].setRotationPoint(-2.6F, -11.5F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 34
		bodyModel[34].setRotationPoint(-2.6F, -5.5F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(-49F, 5F, -0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.2F, -1.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, -1.2F, 0F, -0.3F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -1F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-50.5F, 5F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.45F, -0.5F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, 0F, 0F, -0.45F, 0F, 0F, -0.8F, 1F, -0.5F, -0.8F, 1F, -0.5F, -0.8F, 0F, 0F, -0.8F); // Box 52
		bodyModel[37].setRotationPoint(44F, 2F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -0.7F, 1F, 0.5F, -0.8F, 1F, 0.5F, -0.8F, 0F, 0F, -0.7F, 2F, 0.9F, -0.8F, -1.5F, -0.8F, -0.8F, -1.5F, -0.8F, -0.8F, 2F, 0.9F, -0.8F); // Box 53
		bodyModel[38].setRotationPoint(44F, 5F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[39].setRotationPoint(27F, 1.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 55
		bodyModel[40].setRotationPoint(20.5F, 1.8F, -1.6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 56
		bodyModel[41].setRotationPoint(20.5F, 1.4F, -1.6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 57
		bodyModel[42].setRotationPoint(20.5F, 2.2F, -1.6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F); // Box 58
		bodyModel[43].setRotationPoint(18.5F, 2.2F, -1.6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F); // Box 59
		bodyModel[44].setRotationPoint(18.5F, 1.4F, -1.6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F); // Box 60
		bodyModel[45].setRotationPoint(18.5F, 1.8F, -1.6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F); // Box 61
		bodyModel[46].setRotationPoint(25.5F, 2.2F, -1.6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F); // Box 62
		bodyModel[47].setRotationPoint(25.5F, 1.4F, -1.6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F); // Box 63
		bodyModel[48].setRotationPoint(25.5F, 1.8F, -1.6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 64
		bodyModel[49].setRotationPoint(18F, 1.8F, -1.6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[50].setRotationPoint(-32F, 1.6F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 66
		bodyModel[51].setRotationPoint(-37F, 3F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2.5F); // Box 67
		bodyModel[52].setRotationPoint(-45F, 3F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 68
		bodyModel[53].setRotationPoint(-48F, 8.5F, -0.5F);
		bodyModel[53].rotateAngleZ = -0.2268928F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 69
		bodyModel[54].setRotationPoint(-42F, 10F, -0.5F);
		bodyModel[54].rotateAngleZ = 0.15707963F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 70
		bodyModel[55].setRotationPoint(-39F, 7.5F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 71
		bodyModel[56].setRotationPoint(-39F, 7.5F, 1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 72
		bodyModel[57].setRotationPoint(-45F, 7.5F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 73
		bodyModel[58].setRotationPoint(-45F, 7.5F, 1F);

		bodyModel[59].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 74
		bodyModel[59].setRotationPoint(-45F, 8F, 1.5F);

		bodyModel[60].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 75
		bodyModel[60].setRotationPoint(-45F, 8F, -1.5F);

		bodyModel[61].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 76
		bodyModel[61].setRotationPoint(-45F, 8F, -1.5F);
		bodyModel[61].rotateAngleX = 2.35619449F;

		bodyModel[62].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 77
		bodyModel[62].setRotationPoint(-45F, 8F, 1.5F);
		bodyModel[62].rotateAngleX = 2.35619449F;

		bodyModel[63].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 78
		bodyModel[63].setRotationPoint(-45F, 8F, -1.5F);
		bodyModel[63].rotateAngleX = -2.35619449F;

		bodyModel[64].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		bodyModel[64].setRotationPoint(-45F, 8F, 1.5F);
		bodyModel[64].rotateAngleX = -2.35619449F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 80
		bodyModel[65].setRotationPoint(20.5F, 1.8F, 0.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 81
		bodyModel[66].setRotationPoint(20.5F, 1.4F, 0.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 82
		bodyModel[67].setRotationPoint(20.5F, 2.2F, 0.6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F); // Box 83
		bodyModel[68].setRotationPoint(18.5F, 2.2F, 0.6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F); // Box 84
		bodyModel[69].setRotationPoint(18.5F, 1.4F, 0.6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F); // Box 85
		bodyModel[70].setRotationPoint(18.5F, 1.8F, 0.6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F); // Box 86
		bodyModel[71].setRotationPoint(25.5F, 2.2F, 0.6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F); // Box 87
		bodyModel[72].setRotationPoint(25.5F, 1.4F, 0.6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F); // Box 88
		bodyModel[73].setRotationPoint(25.5F, 1.8F, 0.6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 89
		bodyModel[74].setRotationPoint(18F, 1.8F, 0.6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 90
		bodyModel[75].setRotationPoint(-29.25F, 1.8F, 0.6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 91
		bodyModel[76].setRotationPoint(-29.25F, 1.4F, 0.6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 92
		bodyModel[77].setRotationPoint(-29.25F, 2.2F, 0.6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F); // Box 93
		bodyModel[78].setRotationPoint(-31.25F, 2.2F, 0.6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F); // Box 94
		bodyModel[79].setRotationPoint(-31.25F, 1.4F, 0.6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F); // Box 95
		bodyModel[80].setRotationPoint(-31.25F, 1.8F, 0.6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F); // Box 96
		bodyModel[81].setRotationPoint(-24.25F, 2.2F, 0.6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F); // Box 97
		bodyModel[82].setRotationPoint(-24.25F, 1.4F, 0.6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F); // Box 98
		bodyModel[83].setRotationPoint(-24.25F, 1.8F, 0.6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 99
		bodyModel[84].setRotationPoint(-31.75F, 1.8F, 0.6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 100
		bodyModel[85].setRotationPoint(-31.75F, 1.8F, -1.6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F); // Box 101
		bodyModel[86].setRotationPoint(-31.25F, 1.8F, -1.6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F); // Box 102
		bodyModel[87].setRotationPoint(-31.25F, 1.4F, -1.6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 103
		bodyModel[88].setRotationPoint(-29.25F, 1.4F, -1.6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 104
		bodyModel[89].setRotationPoint(-29.25F, 1.8F, -1.6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F); // Box 105
		bodyModel[90].setRotationPoint(-31.25F, 2.2F, -1.6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 106
		bodyModel[91].setRotationPoint(-29.25F, 2.2F, -1.6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F); // Box 107
		bodyModel[92].setRotationPoint(-24.25F, 1.4F, -1.6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0.2F); // Box 108
		bodyModel[93].setRotationPoint(-24.25F, 1.8F, -1.6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.3F, -0.2F); // Box 109
		bodyModel[94].setRotationPoint(-24.25F, 2.2F, -1.6F);
	}
}