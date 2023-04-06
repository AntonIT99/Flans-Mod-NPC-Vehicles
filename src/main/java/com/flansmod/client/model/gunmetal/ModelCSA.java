//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U.S Sharpshooters Uniform Coat
// Model Creator: 
// Created on: 28.07.2017 - 10:13:26
// Last changed on: 28.07.2017 - 10:13:26

package com.flansmod.client.model.gunmetal; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCSA extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCSA() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		bodyModel = new ModelRendererTurbo[63];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 81
		headModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 83
		headModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 84
		headModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 85
		headModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 86
		headModel[5] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 87
		headModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 90
		headModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 91
		headModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 92
		headModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 93
		headModel[10] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 98

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F,1.38777878078145E-15F, 0.1F, 0.1F, -4.16333634234434E-17F, 0.1F, 0.100000000000001F, -5.55111512312578E-17F, 0.100000000000002F, 0.0999999999999996F, 0.0999999999999992F, 0.0999999999999982F, 0.1F, 0.1F, -0.100000000000001F, 0.1F, 0.0999999999999995F, -0.1F, 0.100000000000001F, 0.100000000000001F, -0.1F, 0.0999999999999992F, 0.0999999999999996F, -0.100000000000001F, 0.1F); // Box 81
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1.7F, 0.1F, -2F, -2F, 0.0999999999999996F, -2F, -2F, 0.0999999999999999F, -1.7F, -1.7F, 0.0999999999999982F, -1.7F, 3.60822483003176E-16F, -0.100000000000001F, 0.1F, -5.82867087928207E-16F, -0.1F, 0.0999999999999997F, 1.02695629777827E-15F, -0.1F, 0.0999999999999992F, 0.0999999999999996F, -0.100000000000001F, 0.1F); // Box 83
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -7F, -4F, 8, 1, 8, 0F,-0.0000000000000004163336342344F, 0.1F, 0.0999999999999996F, 0.0499999999999999F, 0.0999999999999996F, 0.100000000000001F, 0.05F, 0.0999999999999999F, 0.1F, 0.0999999999999992F, 0.0999999999999982F, 0.1F, 0.1F, -0.200000000000002F, 0.1F, 0.099999999999999F, -0.200000000000001F, 0.1F, 0.100000000000001F, -0.2F, 0.0999999999999987F, 0.1F, -0.200000000000002F, 0.1F); // Box 84
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, -5F, 8, 1, 1, 0F,0.100000000000001F, -0.600000000000001F, 0.199999999999999F, 0.0999999999999996F, -0.600000000000002F, 0.200000000000002F, 0.0999999999999998F, -0.6F, -0.100000000000001F, 0.0999999999999992F, -0.600000000000003F, -0.0999999999999995F, 0.1F, -1.36002320516582E-15F, 0.5F, 0.099999999999999F, -2.77555756156289E-17F, 0.5F, 0.100000000000001F, -9.43689570931383E-16F, -0.100000000000001F, 0.0999999999999996F, -1.94289029309402E-15F, -0.1F); // Box 85
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7F, 4F, 8, 1, 1, 0F,0.0999999999999992F, -0.600000000000002F, -0.0999999999999995F, 0.0999999999999998F, -0.6F, -0.100000000000001F, 0.0999999999999996F, -0.600000000000001F, 0.400000000000002F, 0.100000000000001F, -0.599999999999999F, 0.299999999999999F, 0.0999999999999996F, -0.200000000000002F, -0.1F, 0.100000000000001F, -0.2F, -0.100000000000001F, 0.0999999999999995F, -0.2F, 0.6F, 0.1F, -0.200000000000001F, 0.5F); // Box 86
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -7F, -4F, 1, 1, 8, 0F,0.400000000000002F, -0.800000000000001F, 0.0999999999999996F, -0.100000000000003F, -0.600000000000001F, 1.2F, -0.0999999999999995F, -0.600000000000002F, 1.3F, 0.299999999999999F, -0.799999999999999F, 0F, 0.3F, 8.32667268468867E-17F, 0.5F, -0.100000000000001F, 4.16333634234434E-17F, 1.5F, -0.1F, -0.200000000000002F, 1.5F, 0.5F, -0.100000000000001F, 0.1F); // Box 87
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -7.5F, -4F, 8, 1, 8, 0F,0.100000000000001F, 0.1F, 0.2F, 0.1F, 0.1F, 0.200000000000001F, 0.1F, 0.100000000000002F, 0.2F, 0.199999999999999F, 0.0999999999999982F, 0.2F, 0.1F, -0.100000000000001F, 0.2F, 0.0999999999999995F, -0.1F, 0.200000000000001F, 0.1F, -0.1F, 0.199999999999999F, 0.199999999999999F, -0.100000000000001F, 0.2F); // Box 90
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -8F, -2F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.800000000000002F, -0.4F, -0.3F, -0.800000000000001F, -0.500000000000001F, 0.3F, 0.100000000000001F, -0.5F, 0.3F, 0.100000000000002F, 0F, -0.3F, -0.799999999999999F, -1.02140518265514E-14F, -0.3F, -0.800000000000001F, -0.0999999999999996F, 0.300000000000001F, 0.100000000000001F, -0.0999999999999996F, 0.3F); // Box 91
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -8F, -1F, 1, 1, 1, 0F,0.0999999999999997F, -0.4F, -0.3F, -0.700000000000002F, -0.4F, -0.3F, -0.700000000000001F, -0.4F, -0.0999999999999996F, 0.0999999999999996F, -0.4F, -0.1F, 0.100000000000002F, 0F, -0.3F, -0.699999999999999F, -1.02140518265514E-14F, -0.3F, -0.700000000000001F, 0F, -0.0999999999999996F, 0.100000000000001F, 0F, -0.1F); // Box 92
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -8F, 0.2F, 1, 1, 1, 0F,0.100000000000001F, -0.5F, 0.3F, -0.800000000000001F, -0.500000000000001F, 0.3F, -0.800000000000002F, -0.4F, -0.3F, 0.0999999999999997F, -0.4F, -0.3F, 0.100000000000001F, -0.0999999999999996F, 0.3F, -0.800000000000001F, -0.0999999999999996F, 0.300000000000001F, -0.799999999999999F, -1.02140518265514E-14F, -0.3F, 0.100000000000002F, 0F, -0.3F); // Box 93
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -7F, -4F, 1, 1, 8, 0F,-0.100000000000003F, -0.600000000000001F, 1.2F, 0.400000000000002F, -0.800000000000001F, 0.0999999999999996F, 0.299999999999999F, -0.799999999999999F, 0.1F, -0.0999999999999995F, -0.600000000000002F, 1.4F, -0.100000000000001F, 4.16333634234434E-17F, 1.5F, 0.3F, -0.1F, 0.5F, 0.5F, -0.100000000000001F, 0.1F, -0.1F, -0.200000000000002F, 1.6F); // Box 98
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 5
		bodyModel[19] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 7
		bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[22] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 5
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 7
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 8
		bodyModel[32] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 86
		bodyModel[34] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 87
		bodyModel[35] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 88
		bodyModel[36] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 89
		bodyModel[37] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 90
		bodyModel[38] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 91
		bodyModel[39] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 92
		bodyModel[40] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 93
		bodyModel[41] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 94
		bodyModel[42] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 95
		bodyModel[43] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 96
		bodyModel[44] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 97
		bodyModel[45] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 98
		bodyModel[46] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 98
		bodyModel[48] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 99
		bodyModel[49] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 82
		bodyModel[50] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 83
		bodyModel[51] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 84
		bodyModel[52] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 86
		bodyModel[53] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 87
		bodyModel[54] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 88
		bodyModel[55] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 89
		bodyModel[56] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 95

		bodyModel[0].addShapeBox(0F, 0F, -3F, 9, 12, 1, 0F,0F, -1.1F, -0.8F, -5F, 0.0999999999999999F, -0.8F, -5F, 0.0999999999999996F, 4.2F, 0F, 0.1F, 4.2F, 0F, 0F, -0.8F, -5F, 0F, -0.8F, -5F, 0F, 4.2F, 0F, 0F, 4.2F); // Box 3
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -3F, 4, 10, 5, 0F,-1.16573417585641E-15F, 0.0999999999999996F, -0.8F, 0F, -1.1F, -0.8F, 0F, 0.0999999999999996F, 0.200000000000001F, -9.85322934354826E-16F, 0.100000000000001F, 0.2F, -0.0000000000000001665334536938F, 2F, -0.8F, 0F, 2F, -0.8F, 0F, 2F, 0.2F, 5.55111512312578E-17F, 2F, 0.200000000000001F); // Box 4
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 1F, -3F, 1, 1, 1, 0F,0F, -0.1F, -0.699999999999999F, 3F, 1.1F, -0.8F, 3F, 1.1F, 0F, 0F, -0.0999999999999999F, 0F, -0.5F, -0.2F, -0.6F, 3F, -1.4F, -0.8F, 3F, -1.4F, 0F, -0.5F, -0.2F, 0F); // Box 9
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 1F, -3F, 1, 1, 1, 0F,3.1F, 1.1F, -0.800000000000001F, 0F, -0.1F, -0.699999999999999F, 0F, -0.1F, 0F, 2.9F, 1.1F, 0F, 3F, -1.5F, -0.8F, -0.399999999999999F, -0.2F, -0.599999999999999F, -0.399999999999999F, -0.2F, 0F, 2.9F, -1.7F, 0F); // Box 10
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1F, -0.3F, -2.6F, 1, 1, 1, 0F,-0.9F, -0.4F, -0.300000000000001F, 0.0999999999999999F, -0.4F, -0.300000000000002F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F, -0.9F, -0.400000000000001F, -0.299999999999999F, 0.1F, -0.400000000000001F, -0.299999999999999F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F); // Box 11
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 8F, -2.6F, 1, 1, 1, 0F,3.775F, -0.2F, -0.300000000000001F, 4.15F, -0.2F, -0.300000000000002F, 4.15F, -0.2F, 3.9F, 3.775F, -0.2F, 3.9F, 3.775F, -0.0999999999999989F, -0.299999999999999F, 4.15F, -0.100000000000001F, -0.299999999999999F, 4.15F, -0.2F, 3.9F, 3.775F, -0.2F, 3.9F); // Box 14
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 0F, 1.4F, 1, 1, 1, 0F,7.9F, -16.5F, -0.400000000000002F, 3.13638004456607E-15F, 0.200000000000003F, -0.1F, 0.1F, 0.200000000000004F, -0.100000000000001F, 7.9F, -16.5F, -0.2F, 7.7F, 16.2F, -0.400000000000001F, -8.32667268468867E-17F, -0.399999999999999F, -0.099999999999999F, 0.0999999999999989F, -0.500000000000001F, -0.100000000000002F, 7.70000000000001F, 16.2F, -0.099999999999999F); // Box 15
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3F, 0F, 2.4F, 1, 1, 1, 0F,7.2F, -10.7F, 0.299999999999996F, -0.0999999999999986F, -7.21644966006352E-16F, 0.300000000000002F, 0.0000000000000002498001805407F, 0.100000000000001F, -1.1F, 7.2F, -10.7F, -1.05F, 7.2F, 10.8F, 0.299999999999999F, -0.199999999999999F, 0F, 0.300000000000003F, -0.300000000000001F, -0.100000000000004F, -1.1F, 7.2F, 10.8F, -1.1F); // Box 18
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(3F, 0F, -2.6F, 1, 1, 1, 0F,-1F, -10.8F, -0.200000000000001F, -8.1F, 0.100000000000001F, -0.450000000000002F, -8.1F, 0.100000000000001F, 3.9F, -1F, -10.7F, 4F, -1F, 10.6F, -0.20000000000001F, -8F, -0.1F, -0.449999999999999F, -8F, -0.3F, 3.9F, -1F, 10.6F, 4F); // Box 19
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, -3F, 1, 1, 1, 0F,3.6F, 0.15F, -5.1F, -4.9F, 0.1F, -0.9F, 2.9F, 0.1F, -0.1F, -4F, 0.1F, 4.1F, 0F, 0.1F, -0.9F, 3F, -1.1F, -0.9F, -5F, 0F, 4F, 0F, 0F, 0.500000000000001F); // Box 23
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.300000000000001F, 0.2F, -0.3F, -0.300000000000002F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 28
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 0.2F, -2.6F, 1, 1, 1, 0F,-0.9F, -0.4F, -0.300000000000001F, 0.0999999999999999F, -0.4F, -0.300000000000002F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F, -0.9F, -0.400000000000001F, -0.299999999999999F, 0.1F, -0.400000000000001F, -0.299999999999999F, 0.0999999999999999F, -0.4F, -0.300000000000001F, -0.9F, -0.4F, -0.300000000000001F); // Box 29
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 8F, -2.6F, 1, 1, 1, 0F,-0.6F, -0.2F, -0.200000000000001F, 0.8F, -0.2F, -0.200000000000002F, 0.8F, -0.2F, -0.300000000000001F, -0.6F, -0.2F, -0.300000000000001F, -0.6F, -0.0999999999999998F, -0.199999999999998F, 0.8F, -0.0999999999999995F, -0.199999999999999F, 0.8F, -0.100000000000001F, -0.300000000000001F, -0.599999999999998F, -0.0999999999999991F, -0.300000000000001F); // Box 29
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-7F, 10F, 0F, 3, 5, 3, 0F,-2F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F); // Box 0
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-8F, 10F, 1F, 3, 5, 2, 0F,-2.4F, 0.2F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, -2.5F, 0F, -0.4F, -2.3F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, -2.4F, -1.3F, -0.4F); // Box 1
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-5F, 10F, -3F, 3, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-6F, 10F, -3F, 3, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.3F, 0F, -0.4F, 0.2F, 0F, -0.2F, -1.3F, -0.1F, -2F, -1F, 0F, -2F, -1F, 0F, -0.299999999999999F, -1F, 0F); // Box 3
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-6F, 10F, -0.2F, 1, 2, 1, 0F,-0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.6F, -0.3F, 0.199999999999999F, -0.6F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, -0.3F, 0F, -0.600000000000001F); // Box 4
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-6F, 12F, -0.2F, 1, 2, 1, 0F,-0.3F, 2.77555756156289E-16F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.6F, -0.3F, -6.93889390390723E-16F, -0.6F, -0.3F, -0.699999999999999F, -0.0999999999999996F, -0.5F, -0.7F, -0.100000000000001F, -0.5F, -0.7F, -0.7F, -0.3F, -0.7F, -0.700000000000002F); // Box 5
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-6F, 12F, -1F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.799999999999999F, -0.7F, -0.7F, -0.699999999999999F, -0.7F, -0.7F, 0.3F, -0.2F, -0.7F, 0.2F, -0.2F, -0.0999999999999996F, -0.8F, -0.7F, -0.0999999999999996F, -0.700000000000001F, -0.7F, -0.100000000000001F, 0.3F, -0.2F, -0.100000000000001F, 0.2F); // Box 7
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-6F, 11F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.899999999999999F, -0.7F, -0.4F, -0.9F, -0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 11
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-6F, 11F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 13
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-6F, 11F, -1.15F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.899999999999999F, -0.7F, -0.4F, -0.9F, -0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 14
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-6F, 10.6F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, -0.7F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 15
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-5.3F, 13.75F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.499999999999998F, -0.300000000000002F, -0.100000000000001F, -0.5F, -0.3F, -0.100000000000001F, -0.5F, -0.3F, -0.5F, -0.500000000000001F, -0.3F, -0.5F, 0F, -0.300000000000001F, -0.100000000000001F, 0F, -0.3F, -0.100000000000001F, 0F, -0.300000000000001F, -0.5F, 0F, -0.299999999999999F); // Box 0
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5F, 14F, -2F, 1, 2, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-5F, 18F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 2
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5.5F, 14F, -0.5F, 2, 1, 1, 0F,-0.6F, -0.699999999999999F, -2.77555756156289E-16F, -0.6F, -0.7F, -2.77555756156289E-16F, -0.6F, -0.7F, -5.55111512312578E-17F, -0.6F, -0.699999999999999F, -5.55111512312578E-17F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 3
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5F, 16F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-5.4F, 14F, -1F, 1, 1, 1, 0F,-0.9F, -0.8F, -0.4F, -8.32667268468867E-17F, -0.8F, -0.4F, -1.11022302462516E-16F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 5
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5.4F, 14F, -2F, 1, 1, 1, 0F,-0.9F, -0.8F, -1.2F, -8.32667268468867E-17F, -0.8F, -1.2F, -1.11022302462516E-16F, -0.8F, 0.4F, -0.9F, -0.8F, 0.4F, -0.9F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.7F, -0.9F, 0F, 0.7F); // Box 7
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-5.4F, 14F, -2F, 1, 1, 1, 0F,-0.9F, -0.8F, -1.1F, -8.32667268468867E-17F, -0.8F, -1.1F, -1.11022302462516E-16F, -0.8F, 0.3F, -0.9F, -0.8F, 0.3F, -0.9F, 0.7F, -0.8F, 0F, 0.7F, -0.8F, 0F, 0.5F, 1.66533453693773E-16F, -0.9F, 0.6F, -2.77555756156289E-16F); // Box 8
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3F, 0F, -2.6F, 1, 1, 1, 0F,7.1F, -10.7F, -0.200000000000002F, 3.3584246494911E-15F, 1.72084568816899E-15F, -0.300000000000001F, 2.22044604925031E-16F, -0.2F, -0.200000000000001F, 7.2F, -10.7F, -0.400000000000001F, 7.2F, 10.7F, -0.200000000000001F, -3.46944695195361E-16F, 0.100000000000001F, -0.299999999999999F, 0.199999999999999F, -1.66533453693773E-16F, -0.200000000000001F, 7.2F, 10.9F, -0.5F); // Box 102
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1F, 1.7F, -2.6F, 1, 1, 1, 0F,-0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 86
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1F, 2.2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F); // Box 87
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1F, 4F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.300000000000001F, 0.2F, -0.3F, -0.300000000000002F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 88
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1F, 3.7F, -2.6F, 1, 1, 1, 0F,-0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 89
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1F, 4.2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F); // Box 90
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1F, 5.7F, -2.6F, 1, 1, 1, 0F,-0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 91
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-1F, 6F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.300000000000001F, 0.2F, -0.3F, -0.300000000000002F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 92
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1F, 6.2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F); // Box 93
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1F, 10F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.300000000000001F, 0.2F, -0.3F, -0.300000000000002F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 94
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-1F, 10.2F, -2.6F, 1, 1, 1, 0F,-0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F); // Box 95
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-1F, 9.7F, -2.6F, 1, 1, 1, 0F,-0.8F, -0.5F, -0.300000000000001F, 0.0999999999999999F, -0.5F, -0.300000000000002F, 0.1F, -0.5F, -0.300000000000001F, -0.8F, -0.5F, -0.300000000000001F, -0.7F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.299999999999999F, 0.2F, -0.4F, -0.300000000000001F, -0.7F, -0.4F, -0.300000000000001F); // Box 96
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-1F, 9F, -2.6F, 1, 1, 1, 0F,-0.6F, 0.0999999999999989F, -0.200000000000001F, 0.8F, 0.100000000000001F, -0.200000000000002F, 0.8F, 0.1F, -0.300000000000001F, -0.6F, 0.0999999999999989F, -0.300000000000001F, -0.7F, -1F, -0.199999999999998F, 0.7F, -1F, -0.199999999999999F, 0.7F, -1F, -0.300000000000001F, -0.699999999999998F, -0.999999999999999F, -0.300000000000001F); // Box 97
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-1F, 7.1F, -2.6F, 1, 1, 1, 0F,-0.7F, -1F, -0.199999999999998F, 0.7F, -1F, -0.199999999999999F, 0.7F, -1F, -0.300000000000001F, -0.699999999999998F, -0.999999999999999F, -0.300000000000001F, -0.6F, 0.0999999999999989F, -0.200000000000001F, 0.8F, 0.100000000000001F, -0.200000000000002F, 0.8F, 0.1F, -0.300000000000001F, -0.6F, 0.0999999999999989F, -0.300000000000001F); // Box 98
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(3.9F, 10F, -4F, 1, 3, 7, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.100000000000001F, 0F, 0F, 1.36002320516582E-15F); // Box 0
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(3.9F, 10F, -4F, 1, 1, 7, 0F,0F, 0.1F, -1.1F, 0.1F, 0.1F, -1.1F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -1.1F, 0.1F, -1F, -1.1F, 0.1F, -1F, -1.02695629777827E-15F, 0F, -1F, 1.36002320516582E-15F); // Box 98
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(3.9F, 10F, -4F, 1, 2, 7, 0F,-1.1F, 0.1F, -1.1F, 0.2F, 0.1F, -1.1F, 0.2F, 0.1F, 0F, -1.1F, 0.1F, 0F, -1F, 1.1F, -1.1F, 0.1F, 1.1F, -1.1F, 0.1F, 1.1F, -1.02695629777827E-15F, -1F, 1.1F, 1.36002320516582E-15F); // Box 99
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-6F, -1.3F, -2.6F, 2, 13, 6, 0F,-0.4F, -1.15F, -0.300000000000001F, 0.0999999999999999F, -0.9F, -0.300000000000002F, 0.0999999999999999F, -0.8F, -0.95F, -0.4F, -1.15F, -1.05F, -10.1F, 4.35F, -0.049999999999999F, 9.8F, 3.6F, -0.099999999999999F, 9.75F, 3.65F, -1.05F, -10F, 4.55F, -0.95F); // Box 82
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(3F, 14.7F, -2.6F, 1, 1, 6, 0F,-1.1F, -1.45F, -2.4F, 1.8F, -0.6F, -2.5F, 1.75F, -0.65F, -1.05F, -1F, -1.55F, -0.95F, -1.35F, 1.95F, -2.8F, 1.6F, 1.3F, -2.9F, 1.6F, 1.25F, -1.05F, -1.3F, 1.85F, -1.05F); // Box 83
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(3F, 14.7F, -3.6F, 1, 1, 6, 0F,-1.1F, -1.35F, -1.05F, 1.8F, -0.6F, -1.1F, 1.8F, -0.6F, -2.5F, -1.1F, -1.45F, -2.4F, -1.3F, 1.85F, -1.05F, 1.6F, 1.25F, -1.05F, 1.6F, 1.3F, -2.9F, -1.35F, 1.95F, -2.8F); // Box 84
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.3F, 17F, -1.6F, 2, 2, 2, 0F,-0.7F, -0.3F, -0.300000000000001F, -0.3F, -0.3F, -0.300000000000002F, -0.3F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F, -0.7F, 0.1F, -0.299999999999999F, -0.3F, 0.1F, -0.299999999999999F, -0.3F, 0.1F, -0.300000000000001F, -0.7F, 0.1F, -0.300000000000001F); // Box 86
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(3.3F, 17F, -1.6F, 2, 2, 2, 0F,-1.45F, -0.3F, -0.550000000000001F, -0.3F, -0.3F, -0.300000000000002F, -0.3F, -0.3F, -0.300000000000001F, -1.45F, -0.3F, -0.550000000000001F, -1.45F, 0.1F, -0.549999999999999F, -0.3F, 0.1F, -0.299999999999999F, -0.3F, 0.1F, -0.300000000000001F, -1.45F, 0.1F, -0.550000000000001F); // Box 87
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(5.7F, 17F, -1.6F, 2, 2, 2, 0F,-0.3F, -0.3F, -0.300000000000002F, -1.45F, -0.3F, -0.55F, -1.45F, -0.3F, -0.550000000000001F, -0.3F, -0.3F, -0.300000000000001F, -0.3F, 0.1F, -0.299999999999999F, -1.45F, 0.1F, -0.549999999999999F, -1.45F, 0.1F, -0.550000000000001F, -0.3F, 0.1F, -0.300000000000001F); // Box 88
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(4.65F, 17F, -0.3F, 1, 1, 1, 0F,-0.7F, -0.6F, -0.550000000000001F, -0.05F, -0.6F, -0.550000000000002F, -0.05F, -0.6F, -0.300000000000001F, -0.7F, -0.6F, -0.300000000000001F, -0.7F, 0.1F, -0.549999999999999F, -0.05F, 0.1F, -0.549999999999999F, -0.05F, 0.1F, -0.300000000000001F, -0.7F, 0.1F, -0.300000000000001F); // Box 89
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.65F, 18F, -0.3F, 1, 1, 1, 0F,-0.7F, -0.1F, -0.550000000000001F, -0.05F, -0.0999999999999999F, -0.550000000000002F, -0.05F, -0.1F, -0.300000000000001F, -0.7F, -0.0999999999999999F, -0.300000000000001F, -0.7F, -0.6F, -0.349999999999999F, -0.05F, -0.6F, -0.349999999999999F, -0.05F, -0.7F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F); // Box 90
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(4.65F, 16.7F, -0.3F, 1, 1, 1, 0F,-0.7F, -0.6F, -0.349999999999999F, -0.05F, -0.6F, -0.349999999999999F, -0.05F, -0.7F, -0.300000000000001F, -0.7F, -0.7F, -0.300000000000001F, -0.7F, -0.1F, -0.550000000000001F, -0.05F, -0.0999999999999999F, -0.550000000000002F, -0.05F, -0.1F, -0.300000000000001F, -0.7F, -0.0999999999999999F, -0.300000000000001F); // Box 91
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(4.65F, 17F, -0.3F, 1, 1, 3, 0F,-0.9F, -1.1F, -0.650000000000001F, -0.05F, -1F, -0.650000000000002F, 0.15F, 1.6F, -0.300000000000001F, -1.1F, 1.6F, -0.300000000000001F, -0.9F, 0.1F, -0.649999999999999F, -0.05F, 0.1F, -0.649999999999999F, 0.15F, -2.5F, -0.300000000000001F, -1.1F, -2.5F, -0.300000000000001F); // Box 92
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4.65F, 17F, -3.3F, 1, 1, 6, 0F,0.5F, -5.55111512312578E-17F, -0.650000000000001F, 0.15F, 1.6F, -0.750000000000002F, 0.15F, 1.5F, -0.300000000000001F, 0.6F, 0.4F, -0.200000000000001F, 0.5F, -1.1F, -0.649999999999999F, 0.15F, -2.7F, -0.749999999999999F, 0.15F, -2.6F, -0.300000000000001F, 0.6F, -1.5F, -0.200000000000001F); // Box 93
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(4.65F, 17F, -2.3F, 1, 1, 3, 0F,-1.1F, 1.6F, -0.300000000000001F, 0.15F, 1.6F, -0.300000000000001F, -0.05F, -1F, -0.350000000000002F, -0.9F, -1.1F, -0.350000000000001F, -1.1F, -2.5F, -0.300000000000001F, 0.15F, -2.6F, -0.200000000000001F, -0.05F, 0.1F, -0.349999999999999F, -0.9F, 0.1F, -0.349999999999999F); // Box 94
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-6F, -1.3F, -2.6F, 1, 1, 5, 0F,-0.8F, -0.9F, -0.500000000000001F, 0.9F, -0.8F, -0.300000000000002F, 0.9F, -0.7F, -0.100000000000001F, -0.8F, -0.8F, -0.300000000000001F, -0.4F, 0.149999999999999F, -0.299999999999999F, 1.1F, -0.100000000000001F, -0.299999999999999F, 1.1F, -0.2F, 0.049999999999999F, -0.4F, 0.15F, -0.0500000000000009F); // Box 95
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(3F, 0F, -2.6F, 1, 1, 1, 0F,7.9F, -16.5F, -0.400000000000002F, 3.13638004456607E-15F, 0.200000000000003F, -0.1F, 0.1F, 0.200000000000004F, -0.100000000000001F, 7.9F, -16.5F, -0.2F, 7.7F, 16.2F, -0.400000000000001F, -8.32667268468867E-17F, -0.399999999999999F, -0.099999999999999F, 0.0999999999999989F, -0.500000000000001F, -0.100000000000002F, 7.70000000000001F, 16.2F, -0.099999999999999F); // Box 95
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8

		leftArmModel[0].addShapeBox(-1F, -2F, -3F, 4, 8, 5, 0F,0.0999999999999996F, 0.0999999999999996F, -0.8F, 0.3F, 0.0999999999999995F, -0.8F, 0.3F, 0.100000000000001F, 0.199999999999999F, 0.0999999999999995F, 0.1F, 0.200000000000001F, 0.100000000000001F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0.2F, 0.100000000000001F, 0F, 0.2F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -3F, 4, 8, 5, 0F,0.0999999999999996F, -4.85722573273506E-16F, -0.8F, 0.3F, -4.16333634234434E-17F, -0.8F, 0.3F, 4.71844785465692E-16F, 0.199999999999999F, 0.0999999999999995F, -9.29811783123569E-16F, 0.200000000000001F, 0.0999999999999998F, -6F, -0.8F, 0.2F, -6F, -0.8F, 0.2F, -6F, 0.2F, 0.0999999999999996F, -6F, 0.2F); // Box 8
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		rightArmModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7

		rightArmModel[0].addShapeBox(-3F, -2F, -3F, 4, 8, 5, 0F,0.199999999999999F, 0.0999999999999996F, -0.8F, 0.0999999999999996F, 0.0999999999999996F, -0.8F, 0.0999999999999985F, 0.0999999999999996F, 0.200000000000001F, 0.199999999999999F, 0.100000000000001F, 0.2F, 0.2F, 0F, -0.8F, 0.0999999999999996F, 0F, -0.8F, 0.0999999999999996F, 0F, 0.2F, 0.2F, 0F, 0.200000000000001F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6F, -3F, 4, 2, 5, 0F,0.299999999999999F, -3.60822483003176E-16F, -0.8F, 0.100000000000001F, -4.16333634234434E-17F, -0.8F, 0.0999999999999996F, -4.16333634234434E-17F, 0.200000000000001F, 0.399999999999999F, 4.44089209850063E-16F, 0.2F, 0.2F, 0F, -0.8F, 0.100000000000001F, 0F, -0.8F, 0.0999999999999994F, 0F, 0.2F, 0.2F, 0F, 0.200000000000001F); // Box 7
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30
		leftLegModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 6
		leftLegModel[2] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 0
		leftLegModel[3] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 1
		leftLegModel[4] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 2
		leftLegModel[5] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 3
		leftLegModel[6] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 5
		leftLegModel[7] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 6
		leftLegModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7

		leftLegModel[0].addShapeBox(-2F, -1F, -3F, 4, 9, 5, 0F,0.099999999999999F, -1.1F, -0.9F, 0.199999999999999F, -1.1F, -0.9F, 0.2F, -1.1F, 0.100000000000003F, 0.0999999999999991F, -1.2F, 0.100000000000002F, 0.0999999999999994F, 2F, -0.900000000000001F, 0.100000000000001F, 2F, -0.9F, 0.0999999999999996F, 2F, 0.0999999999999986F, 0.0999999999999997F, 2F, 0.100000000000003F); // Box 30
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 0F, -3F, 9, 12, 1, 0F,0F, -2.58126853225349E-15F, -0.8F, -4.8F, 4.16333634234434E-17F, -0.8F, -5F, 0F, 4.2F, 0F, 0F, 4.2F, -1.4F, -8.7F, -0.8F, -4.6F, -8.6F, -0.8F, -4.6F, -8.6F, 4.2F, 0F, -8.7F, 4.2F); // Box 6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.0999999999999999F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0999999999999999F, 0.0999999999999999F, 0.0999999999999999F, 0.1F); // Box 0
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -6F, 4, 2, 4, 0F,-8.32667268468867E-17F, -1.6F, -2.1F, -2.77555756156289E-17F, -1.6F, -2.1F, 0.1F, -1.2F, 2.77555756156289E-17F, 0.1F, -1.2F, 2.77555756156289E-17F, -2.77555756156289E-17F, 0.1F, -2.1F, 2.77555756156289E-17F, 0.1F, -2.1F, 0.1F, 0.1F, -8.32667268468867E-17F, 0.0999999999999999F, 0.1F, 2.77555756156289E-17F); // Box 1
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -6F, 2, 2, 4, 0F,0.0999999999999999F, 0F, -3.9F, 2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 0.1F, -0.7F, -3.6F, -0.3F, -1.1F, -3.9F, -0.3F, -1.1F, -8.32667268468867E-17F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F); // Box 2
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(0F, 10F, -6F, 2, 2, 4, 0F,2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 0.0999999999999999F, 0F, -3.9F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, -0.3F, -1.1F, -3.9F, 0F, -0.7F, -3.6F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F, -0.3F, -1.1F, -8.32667268468867E-17F); // Box 3
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-0.5F, 10F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 5
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-0.5F, 9.7F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 6
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-0.5F, 9.4F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 7
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 29
		rightLegModel[2] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 8
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 9
		rightLegModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 10
		rightLegModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 11
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		rightLegModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 13
		rightLegModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 14

		rightLegModel[0].addShapeBox(-2F, 0F, -3F, 4, 10, 5, 0F,-1.11022302462516E-15F, -9.99200722162641E-16F, -0.8F, 0F, -2.35922392732846E-15F, -0.8F, 0F, -9.29811783123569E-16F, 0.200000000000001F, -9.15933995315754E-16F, 1.36002320516582E-15F, 0.2F, 0.399999999999999F, -6.6F, -0.8F, -1.6F, -6.6F, -0.8F, 0F, -6.7F, 0.2F, 0.299999999999999F, -6.7F, 0.200000000000001F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1F, -3F, 4, 9, 5, 0F,0.199999999999999F, -1.1F, -0.9F, 0.0999999999999996F, -1.2F, -0.9F, 0.0999999999999996F, -1.2F, 0.100000000000003F, 0.0999999999999991F, -1.2F, 0.100000000000002F, 0.0999999999999998F, 2F, -0.900000000000001F, 0.100000000000001F, 2F, -0.9F, 0.100000000000001F, 2F, 0.0999999999999986F, 0.0999999999999997F, 2F, 0.100000000000003F); // Box 29
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0999999999999999F, 0.0999999999999999F, 0.0999999999999999F, 0.1F); // Box 8
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -6F, 4, 2, 4, 0F,-8.32667268468867E-17F, -1.6F, -2.1F, -2.77555756156289E-17F, -1.6F, -2.1F, 0.1F, -1.2F, 2.77555756156289E-17F, 0.1F, -1.2F, 2.77555756156289E-17F, -2.77555756156289E-17F, 0.1F, -2.1F, 2.77555756156289E-17F, 0.1F, -2.1F, 0.1F, 0.1F, -8.32667268468867E-17F, 0.0999999999999999F, 0.1F, 2.77555756156289E-17F); // Box 9
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -6F, 2, 2, 4, 0F,0.0999999999999999F, 0F, -3.9F, 2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 0.1F, -0.7F, -3.6F, -0.3F, -1.1F, -3.9F, -0.3F, -1.1F, -8.32667268468867E-17F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F); // Box 10
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0F, 10F, -6F, 2, 2, 4, 0F,2.77555756156289E-17F, -1.94289029309402E-16F, -3.9F, 0.0999999999999999F, 0F, -3.9F, 0.1F, -8.32667268468867E-17F, 2.77555756156289E-17F, 1.38777878078145E-16F, 0F, 2.77555756156289E-17F, -0.3F, -1.1F, -3.9F, 0F, -0.7F, -3.6F, 0.0999999999999999F, -0.8F, 2.77555756156289E-17F, -0.3F, -1.1F, -8.32667268468867E-17F); // Box 11
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-0.5F, 10F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 12
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-0.5F, 9.7F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 13
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-0.5F, 9.4F, -3F, 1, 1, 1, 0F,0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.9F, 1.11022302462516E-16F, 0F, -0.9F, 2.77555756156289E-17F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 5.55111512312578E-17F); // Box 14
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}
}