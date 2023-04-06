//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.03.2020 - 20:20:00
// Last changed on: 10.03.2020 - 20:20:00

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUSA1800s extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelUSA1800s() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 36
		headModel[1] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		headModel[2] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import ImportBox11
		headModel[3] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 33
		headModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 128
		headModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 129

		headModel[0].addShapeBox(-4F, -8.5F, -4F, 8, 1, 8, 0F, 0.0000000000000009853229343548F, -0.699999999999998F, 3.60822483003176E-16F, -1.81799020282369E-15F, -0.700000000000001F, 1.02695629777827E-15F, -4.16333634234434E-17F, 0.0999999999999999F, -0.050000000000001F, -0.100000000000001F, 0.1F, -0.100000000000001F, 0.1F, -0.100000000000001F, 0.1F, 0.0999999999999995F, -0.1F, 0.1F, 0.100000000000001F, -0.0999999999999996F, 0.0499999999999991F, 0.0999999999999996F, -0.0999999999999996F, 0.1F); // Box 36
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.5F, -4F, 8, 1, 8, 0F, 0.0000000000000011F, -0.8F, 0F, -1.36002320516582E-15F, -0.8F, 0F, -0.200000000000001F, 0.0999999999999999F, -1.1F, -0.300000000000001F, 0.1F, -1F, 0.0499999999999999F, 0.699999999999998F, -3.60822483003176E-16F, -1.38777878078145E-16F, 0.699999999999999F, -8.32667268468867E-17F, 1.36002320516582E-15F, -0.0999999999999996F, -0.050000000000001F, -0.0999999999999997F, -0.0999999999999996F, -0.1F); // Box 37
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-23F, -27.5F, -4.5F, 46, 41, 1, 0F, -24.2F, -18.8F, -0.3F, -24.2F, -18.8F, -0.3F, -23.2F, -19.8F, 0F, -23.2F, -19.8F, 0F, -24.2F, -20.8F, -0.3F, -24.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F); // Import ImportBox11
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7.5F, -5F, 8, 1, 1, 0F, 0.100000000000001F, -0.700000000000002F, 0.2F, 0.0999999999999983F, -0.700000000000001F, 0.3F, 0.0999999999999996F, -0.4F, -0.100000000000001F, 0.0999999999999994F, -0.399999999999999F, -0.0999999999999996F, 0.1F, 0.100000000000001F, 0.4F, 0.0999999999999996F, 0.1F, 0.499999999999999F, 0.0999999999999996F, 0F, -0.1F, 0.1F, -0.1F, -0.0999999999999996F); // Box 33
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.9F, -4F, 8, 1, 8, 0F, 0.100000000000001F, -0.3F, 0.1F, 0.0999999999999996F, -0.3F, 0.100000000000001F, 0.0999999999999996F, -0.3F, 0.0499999999999986F, 0.0999999999999992F, -0.3F, 0.099999999999999F, 0.1F, -0.3F, 0.1F, 0.0999999999999995F, -0.3F, 0.1F, 0.100000000000001F, -0.3F, -9.29811783123569E-16F, 0.0999999999999996F, -0.3F, 0.1F); // Box 128
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -7.5F, -4F, 8, 1, 8, 0F, 0.100000000000001F, -0.3F, 0.1F, 0.0999999999999996F, -0.3F, 0.100000000000001F, 0.0999999999999996F, -0.3F, 0.0499999999999986F, 0.0999999999999992F, -0.3F, 0.099999999999999F, 0.1F, -0.05F, 0.1F, 0.0999999999999995F, -0.05F, 0.1F, 0.100000000000001F, -0.05F, -9.29811783123569E-16F, 0.0999999999999996F, -0.05F, 0.1F); // Box 129
		headModel[5].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[75];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box116
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box118
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box120
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box121
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box122
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box123
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box125
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box126
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box154
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box155
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box156
		bodyModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box165
		bodyModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box166
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box167
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box168
		bodyModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box169
		bodyModel[16] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box172
		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box71
		bodyModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box142
		bodyModel[19] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box143
		bodyModel[20] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box144
		bodyModel[21] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box148
		bodyModel[22] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box149
		bodyModel[23] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box150
		bodyModel[24] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box151
		bodyModel[25] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box152
		bodyModel[26] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box153
		bodyModel[27] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box154
		bodyModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box155
		bodyModel[29] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box156
		bodyModel[30] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box162
		bodyModel[31] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box169
		bodyModel[32] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box175
		bodyModel[33] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box176
		bodyModel[34] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box177
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box178
		bodyModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box179
		bodyModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box180
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box181
		bodyModel[39] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box182
		bodyModel[40] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box183
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box184
		bodyModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box185
		bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box186
		bodyModel[44] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box204
		bodyModel[45] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box205
		bodyModel[46] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box207
		bodyModel[47] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box208
		bodyModel[48] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box209
		bodyModel[49] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box210
		bodyModel[50] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box211
		bodyModel[51] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box212
		bodyModel[52] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 203
		bodyModel[54] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 124
		bodyModel[56] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 125
		bodyModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 126
		bodyModel[58] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 127
		bodyModel[59] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		bodyModel[62] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 131
		bodyModel[63] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box105
		bodyModel[64] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box130
		bodyModel[65] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box131
		bodyModel[66] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box176
		bodyModel[67] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box178
		bodyModel[68] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box79
		bodyModel[69] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 199
		bodyModel[70] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 200
		bodyModel[71] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 201
		bodyModel[72] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 164
		bodyModel[73] = new ModelRendererTurbo(this, 160, 70, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 114

		bodyModel[0].addShapeBox(-4F, 2F, -2.65F, 2, 11, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box116
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 2F, -2.65F, 2, 11, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box118
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 2F, -2.65F, 2, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box120
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, 2F, -2.65F, 2, 11, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box121
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1F, -2.65F, 2, 1, 1, 0F, 0F, 1F, -0.45F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box122
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, 1F, -2.65F, 2, 1, 1, 0F, 0F, 0.9F, -0.15F, 0F, 1F, -0.45F, 0F, 1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box123
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 0F, -2.65F, 2, 2, 1, 0F, 0F, 0.9F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box125
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, -2.65F, 2, 2, 1, 0F, 0F, -0.1F, -0.05F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box126
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-3F, -0.01F, -2F, 1, 1, 4, 0F); // Import Box154
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(2F, -0.01F, -2F, 1, 1, 4, 0F); // Import Box155
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(-2F, 0.99F, -1F, 4, 1, 3, 0F); // Import Box156
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.45F); // Import Box165
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F); // Import Box166
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.7F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Import Box167
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.8F, 0F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Import Box168
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 2F, 1.5F, 2, 11, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F); // Import Box169
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2F, 2F, 1.5F, 2, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F); // Import Box172
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addBox(-3.5F, 1.4F, -2F, 7, 1, 3, 0F); // Import Box71
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 2.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box142
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 2.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box143
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.5F, 1.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box144
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 5.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box148
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.5F, 5.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box149
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, 4.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box150
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-0.5F, 6.53F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box151
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-0.5F, 6.7F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box152
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-0.5F, 8.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box153
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-0.5F, 8.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box154
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-0.5F, 7.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box155
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-0.5F, 6.05F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box156
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, 1F, -2.9F, 1, 3, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, 0.7F, 0F, -0.6F, -1.3F, 0F, -0.6F, -1.3F, 0F, -0.2F, 0.7F, 0F, -0.2F); // Import Box162
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3F, -0.01F, -2F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 3F, 0F, 0.2F, 3F, 0.4F, 0.2F, 3F, 0.15F, 0.2F, 3F, 0.4F); // Import Box169
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.5F, 0.99F, 2.6F, 7, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box175
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.5F, -0.01F, 2.6F, 7, 1, 3, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box176
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 1F, 5.6F, 7, 3, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F); // Import Box177
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.5F, 3.99F, 2.6F, 7, 1, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F); // Import Box178
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.5F, 1F, 1.6F, 7, 3, 1, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box179
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3.5F, 4.3F, 2.1F, 7, 3, 3, 0F, -0.8F, 0.4F, -0.2F, -0.8F, 0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F); // Import Box180
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 5.8F, 2F, 7, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box181
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.5F, 5.9F, 4.15F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box182
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.5F, 6.09F, 4.15F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box183
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-0.5F, 5.46F, 4.15F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box184
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, 6.01F, 2.2F, 3, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box185
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0F, 6.01F, 2.2F, 3, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box186
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2.5F, 1F, 5.6F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Import Box204
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.5F, 0.2F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box205
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2.5F, 3.8F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Import Box207
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1.5F, 0.2F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box208
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1.5F, 1F, 5.6F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Import Box209
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(1.5F, 3.8F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Import Box210
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.5F, 0.99F, 2.6F, 1, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box211
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(1.5F, 0.99F, 2.6F, 1, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box212
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0F, 2F, 1.5F, 2, 11, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 202
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2F, 2F, 1.5F, 2, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 203
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-0.5F, 3.53F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 123
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-0.5F, 3.7F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 124
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-0.5F, 3.05F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 125
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-0.5F, 0.45F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 126
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-0.5F, 0.62F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Box 127
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-0.5F, -0.0300000000000004F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(2.5F, 1F, -3.05F, 1, 3, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -1.3F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.2F, -1.3F, 0F, -0.2F); // Box 129
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-3.5F, 1F, 2F, 1, 3, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, 0.7F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.6F, 0.7F, 0F, -0.6F); // Box 130
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(2.5F, 1F, 2F, 1, 3, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -1.3F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.6F, -1.3F, 0F, -0.6F); // Box 131
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(1.2F, 1F, -3.15F, 2, 8, 1, 0F, 5.4F, 1.15F, -0.33F, -5.3F, 1.15F, -0.4F, -5.4F, 1.15F, 0F, 5.4F, 1.15F, 0F, -0.9F, 0F, -0.35F, 0.8F, 0F, -0.35F, 1F, 0F, 0F, -0.9F, 0F, 0F); // Import Box105
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(0F, 8.8F, -3F, 2, 2, 1, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box130
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(2F, 8.8F, -3.02F, 2, 2, 5, 0F, 0.05F, 0F, 0F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.1F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.1F, 0F, 0F, -0.3F); // Import Box131
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-2F, 8.8F, -3F, 2, 2, 1, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box176
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.05F, 0F, 0F, 0.2F); // Import Box178
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4F, 8.8F, -3F, 2, 2, 5, 0F, 0.2F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0.25F, 0F, -0.15F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0.25F, 0F, -0.1F); // Import Box79
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0.05F, 0F, 0.05F); // Box 199
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-2F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.05F); // Box 200
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0F, 0F, -0.1F); // Box 201
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(1.2F, 1F, 1.75F, 2, 8, 1, 0F, 5.4F, 1.15F, 0F, -5.4F, 1.15F, 0F, -5.3F, 1.15F, -0.4F, 5.4F, 1.15F, -0.33F, -0.9F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, -0.35F, -0.9F, 0F, -0.35F); // Box 164
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-23F, -15.5F, -3.15F, 46, 42, 1, 0F, -24.2F, -18.8F, -0.3F, -24.2F, -18.8F, -0.3F, -23.2F, -19.8F, 0F, -23.2F, -19.8F, 0F, -24.2F, -20.8F, -0.3F, -24.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F); // Box 134
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4F, -0.01F, -2F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 3F, 0.4F, 0.2F, 3F, 0F, 0.2F, 3F, 0.4F, 0.2F, 3F, 0.15F); // Box 114
		bodyModel[74].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[9];
		leftArmModel[0] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box69
		leftArmModel[1] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box95
		leftArmModel[2] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 196
		leftArmModel[3] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 132
		leftArmModel[4] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 133
		leftArmModel[5] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 134
		leftArmModel[6] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 135
		leftArmModel[7] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 136
		leftArmModel[8] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 137

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Import Box69
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box95
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 5.61F, -2F, 4, 3, 4, 0F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 196
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.1F, 5.01F, -1.75F, 1, 1, 1, 0F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 132
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.1F, 5.13F, -1.75F, 1, 1, 1, 0F, 0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 133
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.1F, 4.49F, -1.75F, 1, 1, 1, 0F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 134
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.1F, 4.01F, -1.75F, 1, 1, 1, 0F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 135
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.1F, 4.13F, -1.75F, 1, 1, 1, 0F, 0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F); // Box 136
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.1F, 3.49F, -1.75F, 1, 1, 1, 0F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 137
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[9];
		rightArmModel[0] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box151
		rightArmModel[1] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box152
		rightArmModel[2] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 198
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 138
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 139
		rightArmModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 140
		rightArmModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 141
		rightArmModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 142
		rightArmModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 143

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Import Box151
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box152
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 5.61F, -2F, 4, 3, 4, 0F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 198
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.1F, 5.13F, -1.75F, 1, 1, 1, 0F, 0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 138
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.1F, 5.01F, -1.75F, 1, 1, 1, 0F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 139
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.1F, 4.49F, -1.75F, 1, 1, 1, 0F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 140
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.1F, 4.13F, -1.75F, 1, 1, 1, 0F, 0.05F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0F, -0.05F, -0.22F, 0.05F, -0.05F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 141
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.1F, 4.01F, -1.75F, 1, 1, 1, 0F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F); // Box 142
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.1F, 3.49F, -1.75F, 1, 1, 1, 0F, 0.05F, -0.82F, -0.22F, 0F, -0.82F, -0.22F, 0F, -0.8F, -0.22F, 0.05F, -0.82F, -0.22F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F); // Box 143
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box107
		leftLegModel[1] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box114
		leftLegModel[2] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box78
		leftLegModel[3] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import 

		leftLegModel[0].addShapeBox(-2F, 10F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box114
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 11F, -2.75F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, -2.1F, -2F, 4, 12, 4, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import 
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box115
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box76
		rightLegModel[2] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box79
		rightLegModel[3] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import 

		rightLegModel[0].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box115
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11F, -2.75F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box79
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, -2.1F, -2F, 4, 12, 4, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import 
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


	}
}