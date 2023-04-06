//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPattonM46 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPattonM46() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[118];
		turretModel = new ModelRendererTurbo[36];
		barrelModel = new ModelRendererTurbo[9];
		leftTrackModel = new ModelRendererTurbo[8];
		rightTrackModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box34
		bodyModel[1] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import Box35
		bodyModel[2] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box36
		bodyModel[3] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box37
		bodyModel[4] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box38
		bodyModel[5] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Box39
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Shape40
		bodyModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Shape41
		bodyModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Shape42
		bodyModel[9] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Shape43
		bodyModel[10] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Shape44
		bodyModel[11] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Shape50
		bodyModel[12] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Shape51
		bodyModel[13] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import Shape52
		bodyModel[14] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Shape53
		bodyModel[15] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import Shape54
		bodyModel[16] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Shape55
		bodyModel[17] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import Box73
		bodyModel[18] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box74
		bodyModel[19] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box75
		bodyModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box76
		bodyModel[21] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box77
		bodyModel[22] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import Box78
		bodyModel[23] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box80
		bodyModel[24] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import Box81
		bodyModel[25] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box82
		bodyModel[26] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box85
		bodyModel[27] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Import Box86
		bodyModel[28] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box87
		bodyModel[29] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import Box88
		bodyModel[30] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box89
		bodyModel[31] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import Box90
		bodyModel[32] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box8
		bodyModel[33] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box9
		bodyModel[34] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box10
		bodyModel[35] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import Box24
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box25
		bodyModel[37] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box27
		bodyModel[38] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box28
		bodyModel[39] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box29
		bodyModel[40] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box30
		bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box31
		bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box32
		bodyModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box33
		bodyModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box34
		bodyModel[45] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box35
		bodyModel[46] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box36
		bodyModel[47] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box37
		bodyModel[48] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box38
		bodyModel[49] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box39
		bodyModel[50] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box41
		bodyModel[51] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import Box42
		bodyModel[52] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import Box43
		bodyModel[53] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box44
		bodyModel[54] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box45
		bodyModel[55] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Import Box46
		bodyModel[56] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import Box51
		bodyModel[57] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box54
		bodyModel[58] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box55
		bodyModel[59] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import Box56
		bodyModel[60] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box57
		bodyModel[61] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box58
		bodyModel[62] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box59
		bodyModel[63] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import Box60
		bodyModel[64] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box61
		bodyModel[65] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box62
		bodyModel[66] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import Box63
		bodyModel[67] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box64
		bodyModel[68] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box66
		bodyModel[69] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box67
		bodyModel[70] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box68
		bodyModel[71] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box69
		bodyModel[72] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box70
		bodyModel[73] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box71
		bodyModel[74] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box72
		bodyModel[75] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box73
		bodyModel[76] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box74
		bodyModel[77] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box75
		bodyModel[78] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import Box76
		bodyModel[79] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box77
		bodyModel[80] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box78
		bodyModel[81] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Shape17
		bodyModel[82] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Import Box18
		bodyModel[83] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box19
		bodyModel[84] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box20
		bodyModel[85] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Shape21
		bodyModel[86] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Shape22
		bodyModel[87] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Shape23
		bodyModel[88] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Import Shape24
		bodyModel[89] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Shape25
		bodyModel[90] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import Shape26
		bodyModel[91] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import Shape27
		bodyModel[92] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Import Shape28
		bodyModel[93] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Shape29
		bodyModel[94] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Import Shape30
		bodyModel[95] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box0
		bodyModel[96] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 3
		bodyModel[97] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 5
		bodyModel[99] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Shape 7
		bodyModel[100] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Shape 8
		bodyModel[101] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 9
		bodyModel[102] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 10
		bodyModel[103] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 11
		bodyModel[104] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Box 12
		bodyModel[105] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 13
		bodyModel[106] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 14
		bodyModel[107] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 15
		bodyModel[108] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 16
		bodyModel[109] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 17
		bodyModel[110] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 18
		bodyModel[111] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 19
		bodyModel[112] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 20
		bodyModel[113] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 21
		bodyModel[114] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Box 22
		bodyModel[115] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 23
		bodyModel[116] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 24
		bodyModel[117] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[0].setRotationPoint(-57F, -10F, 23F);

		bodyModel[1].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Import Box35
		bodyModel[1].setRotationPoint(-57F, -10F, 23F);

		bodyModel[2].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box36
		bodyModel[2].setRotationPoint(-57F, -10F, 23F);

		bodyModel[3].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[3].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Import Box38
		bodyModel[4].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[5].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box39
		bodyModel[5].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape40
		bodyModel[6].setRotationPoint(0F, -8F, 29F);

		bodyModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape41
		bodyModel[7].setRotationPoint(14F, -8F, 29F);

		bodyModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape42
		bodyModel[8].setRotationPoint(28F, -8F, 29F);

		bodyModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape43
		bodyModel[9].setRotationPoint(-14F, -8F, 29F);

		bodyModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape44
		bodyModel[10].setRotationPoint(-28F, -8F, 29F);

		bodyModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape50
		bodyModel[11].setRotationPoint(38F, 8F, 31F);

		bodyModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape51
		bodyModel[12].setRotationPoint(24F, 8F, 31F);

		bodyModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape52
		bodyModel[13].setRotationPoint(10F, 8F, 31F);

		bodyModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape53
		bodyModel[14].setRotationPoint(-4F, 8F, 31F);

		bodyModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape54
		bodyModel[15].setRotationPoint(-18F, 8F, 31F);

		bodyModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape55
		bodyModel[16].setRotationPoint(-32F, 8F, 31F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 12, 42, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[17].setRotationPoint(33F, -20F, -21F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 13, 42, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[18].setRotationPoint(12F, -21F, -21F);

		bodyModel[19].addBox(0F, 0F, 0F, 37, 13, 42, 0F); // Import Box75
		bodyModel[19].setRotationPoint(-25F, -21F, -21F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 13, 42, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[20].setRotationPoint(-45F, -21F, -21F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 12, 21, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[21].setRotationPoint(-62F, -20F, -21F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 112, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -11F, 0F, 0F); // Import Box78
		bodyModel[22].setRotationPoint(-62F, -8F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 71, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[23].setRotationPoint(-47F, -17F, 20F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box81
		bodyModel[24].setRotationPoint(-58F, -17F, 20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[25].setRotationPoint(-63F, -16F, 20F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[26].setRotationPoint(-46F, -21F, 21F);

		bodyModel[27].addBox(0F, 0F, 0F, 35, 4, 9, 0F); // Import Box86
		bodyModel[27].setRotationPoint(-23F, -21F, 21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		bodyModel[28].setRotationPoint(13F, -21F, 21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[29].setRotationPoint(13F, -21F, -30F);

		bodyModel[30].addBox(0F, 0F, 0F, 35, 4, 9, 0F); // Import Box89
		bodyModel[30].setRotationPoint(-23F, -21F, -30F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[31].setRotationPoint(-46F, -21F, -30F);

		bodyModel[32].addBox(0F, 0F, 0F, 24, 3, 24, 0F); // Import Box8
		bodyModel[32].setRotationPoint(-12F, -22F, -12F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Import Box9
		bodyModel[33].setRotationPoint(40F, -16F, -16F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box10
		bodyModel[34].setRotationPoint(46F, -14.5F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[35].setRotationPoint(-61F, -19F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[36].setRotationPoint(-61F, -21F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[37].setRotationPoint(-55F, -18F, 29F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[38].setRotationPoint(-48F, -18F, 29F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[39].setRotationPoint(-48F, -18F, -30F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[40].setRotationPoint(-61F, -19F, -30F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[41].setRotationPoint(-55F, -18F, -30F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[42].setRotationPoint(-61F, -21F, -30F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[43].setRotationPoint(-61F, -20F, 24F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[44].setRotationPoint(-61F, -20F, -25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box35
		bodyModel[45].setRotationPoint(-61F, -21F, 25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[46].setRotationPoint(-61F, -21F, -29F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[47].setRotationPoint(-61F, -18F, -29F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box38
		bodyModel[48].setRotationPoint(-61F, -18F, 25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box39
		bodyModel[49].setRotationPoint(-61F, -16F, 18F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[50].setRotationPoint(-61F, -16F, -24F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[51].setRotationPoint(-61F, -19F, -24F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import Box43
		bodyModel[52].setRotationPoint(-61F, -19F, 13F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box44
		bodyModel[53].setRotationPoint(-61F, -16F, -13F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box45
		bodyModel[54].setRotationPoint(-61F, -16F, 12F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 40, 0F); // Import Box46
		bodyModel[55].setRotationPoint(-63F, -13F, -20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 17, 12, 21, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[56].setRotationPoint(-62F, -20F, 0F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box54
		bodyModel[57].setRotationPoint(39F, -19F, 21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[58].setRotationPoint(39F, -23F, 20F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Box56
		bodyModel[59].setRotationPoint(39F, -22F, 20F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box57
		bodyModel[60].setRotationPoint(39F, -20F, 20F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box58
		bodyModel[61].setRotationPoint(39F, -18F, -23F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[62].setRotationPoint(39F, -21F, -24F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import Box60
		bodyModel[63].setRotationPoint(39F, -20F, -24F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box61
		bodyModel[64].setRotationPoint(39F, -19F, -24F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Import Box62
		bodyModel[65].setRotationPoint(32F, -21F, -28F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Import Box63
		bodyModel[66].setRotationPoint(32F, -21F, -24F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[67].setRotationPoint(32F, -22F, -28F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Import Box66
		bodyModel[68].setRotationPoint(32F, -20F, -26.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box67
		bodyModel[69].setRotationPoint(14F, -21F, 28F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box68
		bodyModel[70].setRotationPoint(7F, -21.5F, 28F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box69
		bodyModel[71].setRotationPoint(-8F, -21.5F, 28F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box70
		bodyModel[72].setRotationPoint(-21F, -21.5F, 28F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box71
		bodyModel[73].setRotationPoint(-30F, -21F, 28F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box72
		bodyModel[74].setRotationPoint(-44F, -20.5F, 28F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box73
		bodyModel[75].setRotationPoint(14F, -21F, -29F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box74
		bodyModel[76].setRotationPoint(7F, -21.5F, -29F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box75
		bodyModel[77].setRotationPoint(-8F, -21.5F, -29F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box76
		bodyModel[78].setRotationPoint(-21F, -21.5F, -29F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box77
		bodyModel[79].setRotationPoint(-30F, -21F, -29F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box78
		bodyModel[80].setRotationPoint(-44F, -20.5F, -29F);

		bodyModel[81].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape17
		bodyModel[81].setRotationPoint(38F, 8F, -23F);

		bodyModel[82].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		bodyModel[82].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[83].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Import Box19
		bodyModel[83].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[84].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[84].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[85].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape21
		bodyModel[85].setRotationPoint(28F, -8F, -25F);

		bodyModel[86].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape22
		bodyModel[86].setRotationPoint(24F, 8F, -23F);

		bodyModel[87].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape23
		bodyModel[87].setRotationPoint(14F, -8F, -25F);

		bodyModel[88].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape24
		bodyModel[88].setRotationPoint(10F, 8F, -23F);

		bodyModel[89].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape25
		bodyModel[89].setRotationPoint(0F, -8F, -25F);

		bodyModel[90].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape26
		bodyModel[90].setRotationPoint(-4F, 8F, -23F);

		bodyModel[91].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape27
		bodyModel[91].setRotationPoint(-14F, -8F, -25F);

		bodyModel[92].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape28
		bodyModel[92].setRotationPoint(-18F, 8F, -23F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Import Shape29
		bodyModel[93].setRotationPoint(-28F, -8F, -25F);

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Import Shape30
		bodyModel[94].setRotationPoint(-32F, 8F, -23F);

		bodyModel[95].addShapeBox(-2.5F, 4F, 0F, 3, 20, 30, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box0
		bodyModel[95].setRotationPoint(30F, -24F, -15F);
		bodyModel[95].rotateAngleZ = 0.9250245F;

		bodyModel[96].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[96].setRotationPoint(-57F, -10F, -31F);

		bodyModel[97].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Box 4
		bodyModel[97].setRotationPoint(-57F, -10F, -31F);

		bodyModel[98].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[98].setRotationPoint(-57F, -10F, -31F);

		bodyModel[99].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 7
		bodyModel[99].setRotationPoint(-46F, 2F, 29F);

		bodyModel[100].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 8
		bodyModel[100].setRotationPoint(-46F, 2F, -25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 71, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[101].setRotationPoint(-47F, -17F, 34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[102].setRotationPoint(-58F, -17F, 34F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 11
		bodyModel[103].setRotationPoint(-63F, -16F, 34F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 27, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[104].setRotationPoint(24F, -17F, 20F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 27, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[105].setRotationPoint(24F, -17F, 34F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 14
		bodyModel[106].setRotationPoint(51F, -16F, 20F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[107].setRotationPoint(51F, -16F, 34F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 71, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[108].setRotationPoint(-47F, -17F, -34F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[109].setRotationPoint(-58F, -17F, -34F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[110].setRotationPoint(-63F, -16F, -34F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 71, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[111].setRotationPoint(-47F, -17F, -35F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[112].setRotationPoint(-58F, -17F, -35F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 21
		bodyModel[113].setRotationPoint(-63F, -16F, -35F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 27, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[114].setRotationPoint(24F, -17F, -34F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 27, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 23
		bodyModel[115].setRotationPoint(24F, -17F, -35F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 24
		bodyModel[116].setRotationPoint(51F, -16F, -34F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[117].setRotationPoint(51F, -16F, -35F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Import Box91
		turretModel[1] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Import Box92
		turretModel[2] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Import Box93
		turretModel[3] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Box94
		turretModel[4] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box95
		turretModel[5] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Import Box108
		turretModel[6] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Import Box110
		turretModel[7] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Import Box112
		turretModel[8] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Import Box113
		turretModel[9] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import Box114
		turretModel[10] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Import Box115
		turretModel[11] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Import Box116
		turretModel[12] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Import Box117
		turretModel[13] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Import Box118
		turretModel[14] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Import Box119
		turretModel[15] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Import Box120
		turretModel[16] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box22
		turretModel[17] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import Box48
		turretModel[18] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box49
		turretModel[19] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box50
		turretModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box52
		turretModel[21] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box53
		turretModel[22] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box79
		turretModel[23] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box0
		turretModel[24] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import Box1
		turretModel[25] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import Box288
		turretModel[26] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box289
		turretModel[27] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box290
		turretModel[28] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box291
		turretModel[29] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box292
		turretModel[30] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box293
		turretModel[31] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box294
		turretModel[32] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box295
		turretModel[33] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box296
		turretModel[34] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box297
		turretModel[35] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box299

		turretModel[0].addShapeBox(0F, 0F, -21F, 8, 15, 42, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box91
		turretModel[0].setRotationPoint(0F, -36F, 0F);

		turretModel[1].addShapeBox(8F, 0F, -21F, 8, 15, 42, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box92
		turretModel[1].setRotationPoint(0F, -36F, 0F);

		turretModel[2].addShapeBox(16F, 0F, -19F, 12, 15, 38, 0F,0F, 0F, 0F, -2F, -2F, -6F, -2F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box93
		turretModel[2].setRotationPoint(0F, -36F, 0F);

		turretModel[3].addShapeBox(-8F, 0F, -19F, 8, 15, 38, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box94
		turretModel[3].setRotationPoint(0F, -36F, 0F);

		turretModel[4].addShapeBox(-24F, 0F, -16F, 16, 15, 32, 0F,0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -6F); // Import Box95
		turretModel[4].setRotationPoint(0F, -36F, 0F);

		turretModel[5].addShapeBox(26F, 0F, -13F, 5, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		turretModel[5].setRotationPoint(0F, -31F, 0F);

		turretModel[6].addShapeBox(26F, 0F, -13F, 5, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Import Box110
		turretModel[6].setRotationPoint(0F, -24F, 0F);

		turretModel[7].addShapeBox(8F, 0F, -21F, 8, 1, 42, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box112
		turretModel[7].setRotationPoint(0F, -37F, 0F);

		turretModel[8].addShapeBox(16F, 0F, -19F, 10, 3, 38, 0F,0F, 0F, -1F, -1F, -2F, -7F, -1F, -2F, -7F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F); // Import Box113
		turretModel[8].setRotationPoint(0F, -37F, 0F);

		turretModel[9].addShapeBox(0F, 0F, -21F, 8, 1, 42, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box114
		turretModel[9].setRotationPoint(0F, -37F, 0F);

		turretModel[10].addShapeBox(-8F, 0F, -19F, 8, 1, 38, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box115
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(-24F, 0F, -16F, 16, 1, 32, 0F,-1F, -1F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, -7F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F); // Import Box116
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(-3F, 0F, -17F, 7, 4, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		turretModel[12].setRotationPoint(0F, -41F, 0F);

		turretModel[13].addShapeBox(4F, 0F, -17F, 5, 4, 17, 0F,0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box118
		turretModel[13].setRotationPoint(0F, -41F, 0F);

		turretModel[14].addShapeBox(-8F, 0F, -17F, 5, 4, 17, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box119
		turretModel[14].setRotationPoint(0F, -41F, 0F);

		turretModel[15].addShapeBox(26F, 0F, -13F, 5, 3, 26, 0F,0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		turretModel[15].setRotationPoint(0F, -34F, 0F);

		turretModel[16].addShapeBox(25F, 0F, 8.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		turretModel[16].setRotationPoint(0F, -37F, 0F);

		turretModel[17].addBox(-20F, 0F, 11F, 1, 1, 3, 0F); // Import Box48
		turretModel[17].setRotationPoint(0F, -34F, 0F);

		turretModel[18].addBox(-20F, 0F, 11F, 1, 1, 3, 0F); // Import Box49
		turretModel[18].setRotationPoint(0F, -31F, 0F);

		turretModel[19].addBox(-20F, 0F, 13F, 1, 2, 1, 0F); // Import Box50
		turretModel[19].setRotationPoint(0F, -33F, 0F);

		turretModel[20].addShapeBox(3F, 0F, 22F, 8, 8, 2, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F); // Import Box52
		turretModel[20].setRotationPoint(0F, -34F, 0F);
		turretModel[20].rotateAngleY = -0.2443461F;

		turretModel[21].addShapeBox(3F, 0F, -24F, 8, 8, 2, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F); // Import Box53
		turretModel[21].setRotationPoint(0F, -34F, 0F);
		turretModel[21].rotateAngleY = 0.2443461F;

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		turretModel[22].setRotationPoint(14F, -47F, -8.5F);

		turretModel[23].addShapeBox(-22F, 0F, -10.5F, 1, 9, 1, 0F,2.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, 2.5F, 30F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		turretModel[23].setRotationPoint(0F, -43.5F, 0F);

		turretModel[24].addShapeBox(-22F, 0F, 9.5F, 1, 9, 1, 0F,2.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, 2.5F, 30F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		turretModel[24].setRotationPoint(0F, -43.5F, 0F);

		turretModel[25].addShapeBox(-2.5F, -26F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		turretModel[25].setRotationPoint(14F, -23F, -9F);

		turretModel[26].addShapeBox(-6.5F, -26F, 0F, 4, 2, 2, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box289
		turretModel[26].setRotationPoint(14F, -23F, -9F);
		turretModel[26].rotateAngleY = 0F;
		turretModel[26].rotateAngleZ = 0F;

		turretModel[27].addShapeBox(-8.5F, -26.5F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		turretModel[27].setRotationPoint(14F, -23F, -9F);
		turretModel[27].rotateAngleY = 0F;
		turretModel[27].rotateAngleZ = 0F;

		turretModel[28].addShapeBox(-8.5F, -26.5F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		turretModel[28].setRotationPoint(14F, -23F, -9F);
		turretModel[28].rotateAngleY = 0F;
		turretModel[28].rotateAngleZ = 0F;

		turretModel[29].addShapeBox(6.5F, -25.5F, 0.5F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box292
		turretModel[29].setRotationPoint(14F, -23F, -9F);
		turretModel[29].rotateAngleY = 0F;
		turretModel[29].rotateAngleZ = 0F;

		turretModel[30].addShapeBox(11.5F, -25.5F, 0.5F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box293
		turretModel[30].setRotationPoint(14F, -23F, -9F);
		turretModel[30].rotateAngleY = 0F;
		turretModel[30].rotateAngleZ = 0F;

		turretModel[31].addShapeBox(0.5F, -23.8F, -1.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		turretModel[31].setRotationPoint(14F, -25F, -9F);
		turretModel[31].rotateAngleY = 0F;
		turretModel[31].rotateAngleZ = 0F;

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		turretModel[32].setRotationPoint(6.5F, -49F, -9F);

		turretModel[33].addShapeBox(0F, 0F, 2F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		turretModel[33].setRotationPoint(6.5F, -49F, -9F);
		turretModel[33].rotateAngleY = 0F;
		turretModel[33].rotateAngleZ = 0F;

		turretModel[34].addShapeBox(0.5F, -25.5F, 2F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		turretModel[34].setRotationPoint(14F, -23F, -9F);
		turretModel[34].rotateAngleY = 0F;
		turretModel[34].rotateAngleZ = 0F;

		turretModel[35].addShapeBox(9.5F, -24.8F, -0.5F, 1, 1, 2, 0F,0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		turretModel[35].setRotationPoint(14F, -23F, -9F);
		turretModel[35].rotateAngleY = 0F;
		turretModel[35].rotateAngleZ = 0F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import Box127
		barrelModel[1] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Box0
		barrelModel[2] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box2
		barrelModel[3] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box3
		barrelModel[4] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box4
		barrelModel[5] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box5
		barrelModel[6] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box6
		barrelModel[7] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box7
		barrelModel[8] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 6

		barrelModel[0].addShapeBox(0F, -2.5F, -11F, 14, 5, 5, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box127
		barrelModel[0].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[1].addBox(14F, -2F, -10.5F, 48, 4, 4, 0F); // Import Box0
		barrelModel[1].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[2].addShapeBox(62F, -2.5F, -11F, 3, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box2
		barrelModel[2].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[3].addBox(65F, -2.5F, -11F, 4, 1, 1, 0F); // Import Box3
		barrelModel[3].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[4].addBox(65F, -2.5F, -7F, 4, 1, 1, 0F); // Import Box4
		barrelModel[4].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[5].addBox(65F, 1.5F, -7F, 4, 1, 1, 0F); // Import Box5
		barrelModel[5].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[6].addBox(65F, 1.5F, -11F, 4, 1, 1, 0F); // Import Box6
		barrelModel[6].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[7].addShapeBox(69F, -2.5F, -11F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box7
		barrelModel[7].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[8].addShapeBox(41F, -2.5F, -11F, 20, 5, 5, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 6
		barrelModel[8].setRotationPoint(29F, -27.5F, 8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		leftTrackModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box1
		leftTrackModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box2
		leftTrackModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box3
		leftTrackModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box4
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box5
		leftTrackModel[6] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box6
		leftTrackModel[7] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box7

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 82, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		leftTrackModel[0].setRotationPoint(-54F, -15F, 21F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Import Box1
		leftTrackModel[1].setRotationPoint(-43F, 8F, 21F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Import Box2
		leftTrackModel[2].setRotationPoint(-57F, -14F, 21F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box3
		leftTrackModel[3].setRotationPoint(-59F, -12F, 21F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 15, 12, 0F,0F, -1F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -12F, 0F); // Import Box4
		leftTrackModel[4].setRotationPoint(-57F, -7F, 21F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 21, 9, 12, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import Box5
		leftTrackModel[5].setRotationPoint(28F, -15F, 21F);
		leftTrackModel[5].rotateAngleZ = 0.17453293F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box6
		leftTrackModel[6].setRotationPoint(50F, -11F, 21F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 18, 11, 12, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box7
		leftTrackModel[7].setRotationPoint(32F, -1F, 21F);
		leftTrackModel[7].rotateAngleZ = 0.12217305F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box8
		rightTrackModel[1] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import Box9
		rightTrackModel[2] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box13
		rightTrackModel[3] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box14
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box15
		rightTrackModel[5] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 0
		rightTrackModel[6] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 1
		rightTrackModel[7] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 2

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 82, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box8
		rightTrackModel[0].setRotationPoint(-54F, -15F, -33F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Import Box9
		rightTrackModel[1].setRotationPoint(-43F, 8F, -33F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 21, 9, 12, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import Box13
		rightTrackModel[2].setRotationPoint(28F, -15F, -33F);
		rightTrackModel[2].rotateAngleZ = 0.17453293F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box14
		rightTrackModel[3].setRotationPoint(50F, -11F, -33F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 11, 12, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Import Box15
		rightTrackModel[4].setRotationPoint(32F, -1F, -33F);
		rightTrackModel[4].rotateAngleZ = 0.12217305F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 0
		rightTrackModel[5].setRotationPoint(-57F, -14F, -33F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1
		rightTrackModel[6].setRotationPoint(-59F, -12F, -33F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 15, 12, 0F,0F, -1F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -12F, 0F); // Box 2
		rightTrackModel[7].setRotationPoint(-57F, -7F, -33F);
	}
}