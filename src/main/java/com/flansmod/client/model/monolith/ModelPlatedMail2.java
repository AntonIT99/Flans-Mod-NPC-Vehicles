//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PlatedMail2
// Model Creator: 
// Created on: 03.04.2022 - 17:24:15
// Last changed on: 03.04.2022 - 17:24:15

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPlatedMail2 extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPlatedMail2() //Same as Filename
	{
		headModel = new ModelRendererTurbo[50];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 32, 35, textureX, textureY); // Box 106
		headModel[5] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 111
		headModel[6] = new ModelRendererTurbo(this, 32, 5, textureX, textureY); // Box 112
		headModel[7] = new ModelRendererTurbo(this, 32, 35, textureX, textureY); // Box 114
		headModel[8] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 115
		headModel[9] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 118
		headModel[10] = new ModelRendererTurbo(this, 32, 35, textureX, textureY); // Box 120
		headModel[11] = new ModelRendererTurbo(this, 32, 35, textureX, textureY); // Box 121
		headModel[12] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 150
		headModel[13] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 151
		headModel[14] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 152
		headModel[15] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 153
		headModel[16] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 154
		headModel[17] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 155
		headModel[18] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 156
		headModel[19] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 161
		headModel[20] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 162
		headModel[21] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 163
		headModel[22] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 164
		headModel[23] = new ModelRendererTurbo(this, 3, 33, textureX, textureY); // Box 165
		headModel[24] = new ModelRendererTurbo(this, 3, 33, textureX, textureY); // Box 166
		headModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		headModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		headModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		headModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		headModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		headModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		headModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		headModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		headModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		headModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		headModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		headModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		headModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		headModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		headModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		headModel[40] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 209
		headModel[41] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 210
		headModel[42] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 211
		headModel[43] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 212
		headModel[44] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 214
		headModel[45] = new ModelRendererTurbo(this, 7, 16, textureX, textureY); // Box 215
		headModel[46] = new ModelRendererTurbo(this, 3, 33, textureX, textureY); // Box 120
		headModel[47] = new ModelRendererTurbo(this, 3, 33, textureX, textureY); // Box 151
		headModel[48] = new ModelRendererTurbo(this, 32, 5, textureX, textureY); // Box 152
		headModel[49] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 146

		headModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.15F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 18
		headModel[0].setRotationPoint(-4F, 23F, -4.1F);

		headModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.75F, -0.15F, -0.5F, -0.75F, 0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0.0999999999999999F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[1].setRotationPoint(0F, 23F, -4.1F);

		headModel[2].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F); // Box 20
		headModel[2].setRotationPoint(-4F, 19F, -2F);

		headModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F); // Box 21
		headModel[3].setRotationPoint(0F, 19F, -2F);

		headModel[4].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F, 0.35F, 0.5F, 0.35F, 0.25F, 0.5F, 0.35F, 0F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F); // Box 106
		headModel[4].setRotationPoint(-4F, 10F, -2F);

		headModel[5].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0F, 8.32667268468867E-17F, 0.2F, 0.2F, 1.38777878078145E-16F, 0.2F, 0.2F, 1.38777878078145E-16F, 0.1F, 0F, 2.77555756156289E-17F, 0.0999999999999999F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 111
		headModel[5].setRotationPoint(0F, 0F, -2F);

		headModel[6].addShapeBox(0F, 0F, 0F, 4, 11, 4, 0F,0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.0999999999999999F, 0.2F, 0F, 0.1F, 0.2F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.0999999999999999F, 0.2F, 0F, 0.1F); // Box 112
		headModel[6].setRotationPoint(-8F, 0F, -2F);

		headModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.35F, -0.5F, 0.35F, 0.25F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F); // Box 114
		headModel[7].setRotationPoint(-4F, 18F, -2F);

		headModel[8].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0F, 0.1F, 0.3F, 0.2F, 0.0999999999999999F, 0.3F, 0.2F, 0.1F, 0.1F, 0F, 0.1F, 0.0999999999999999F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F); // Box 115
		headModel[8].setRotationPoint(0F, 0F, -2F);

		headModel[9].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0.2F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.0999999999999999F, 0.2F, 0.1F, 0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 118
		headModel[9].setRotationPoint(-4F, 0F, -2F);

		headModel[10].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0.25F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0F, 0.5F, 0.35F); // Box 120
		headModel[10].setRotationPoint(0F, 10F, -2F);

		headModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.25F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F); // Box 121
		headModel[11].setRotationPoint(0F, 18F, -2F);

		headModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.4F, -0.4F, 0.3F, -4.2F, -0.4F, 0.3F, -4.2F, -0.4F, 0.2F, 0.4F, -0.4F, 0.2F, 0.2F, 0F, 0.0999999999999998F, -4F, 0F, 0.0999999999999998F, -4F, 0F, -0.0999999999999998F, 0.2F, 0F, -0.0999999999999993F); // Box 150
		headModel[12].setRotationPoint(-8.2F, 5.4F, -2F);

		headModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, 0.0999999999999998F, -4.3F, 0F, 0.0999999999999998F, -4.3F, 0F, -0.0999999999999998F, 0.5F, 0F, -0.0999999999999993F, 0.4F, -0.4F, 0.3F, -4.2F, -0.4F, 0.3F, -4.2F, -0.4F, 0.2F, 0.4F, -0.4F, 0.2F); // Box 151
		headModel[13].setRotationPoint(-8.2F, 4.2F, -2F);

		headModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, -1.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -1.65F, 0.2F, 0.199999999999999F, -1.65F, 0.2F, 0.2F, 2.77555756156289E-17F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0.2F, 1.38777878078145E-16F, 0.200000000000001F); // Box 152
		headModel[14].setRotationPoint(-8.1F, 6.75F, -2F);

		headModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.2F, 0.1F, -0.4F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 2.77555756156289E-17F, 0.3F, 0.2F, 1.38777878078145E-16F, 0.200000000000001F, 0.1F, 0F, 0.2F); // Box 153
		headModel[15].setRotationPoint(4.15F, 9F, -2F);

		headModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-4.2F, -0.4F, 0.3F, 0.4F, -0.4F, 0.3F, 0.4F, -0.4F, 0.2F, -4.2F, -0.4F, 0.2F, -4F, 0F, 0.0999999999999998F, 0.2F, 0F, 0.0999999999999998F, 0.2F, 0F, -0.0999999999999993F, -4F, 0F, -0.0999999999999998F); // Box 154
		headModel[16].setRotationPoint(4.3F, 5.4F, -2F);

		headModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-4.3F, 0F, 0.0999999999999998F, 0.5F, 0F, 0.0999999999999998F, 0.5F, 0F, -0.0999999999999993F, -4.3F, 0F, -0.0999999999999998F, -4.2F, -0.4F, 0.3F, 0.4F, -0.4F, 0.3F, 0.4F, -0.4F, 0.2F, -4.2F, -0.4F, 0.2F); // Box 155
		headModel[17].setRotationPoint(4.3F, 4.2F, -2F);

		headModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1.65F, 0.3F, 0.2F, -1.65F, 0.3F, 0.199999999999999F, -1.65F, 0.2F, 0F, -1.65F, 0.2F, 0F, 0F, 0.3F, 0.2F, 2.77555756156289E-17F, 0.3F, 0.2F, 1.38777878078145E-16F, 0.200000000000001F, 0F, 0F, 0.2F); // Box 156
		headModel[18].setRotationPoint(4.15F, 6.75F, -2F);

		headModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.0999999999999999F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		headModel[19].setRotationPoint(-4F, 1.25F, -2.4F);

		headModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		headModel[20].setRotationPoint(-4F, 3.25F, -2.4F);

		headModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		headModel[21].setRotationPoint(-4F, 5.25F, -2.4F);

		headModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		headModel[22].setRotationPoint(-4F, 7.25F, -2.4F);

		headModel[23].addShapeBox(0F, 0F, 0F, 4, 3,9, 4, 0F,0.2F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.45F, 0F, 0.55F, -0.25F, 0F, 0.55F, 0F, 0F, 0.35F, 0.45F, 0F); // Box 165
		headModel[23].setRotationPoint(-4F, 10.1F, -2F);

		headModel[24].addShapeBox(0F, 0F, 0F, 4, 3,9, 4, 0F,0F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, -0.25F, 0F, 0.55F, 0.45F, 0F, 0.55F, 0.45F, 0F, 0.35F, 0F, 0F); // Box 166
		headModel[24].setRotationPoint(0F, 10.1F, -2F);

		headModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		headModel[25].setRotationPoint(-1.55F, 1.5F, -3.25F);

		headModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		headModel[26].setRotationPoint(-1.55F, 3.5F, -3.25F);

		headModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		headModel[27].setRotationPoint(-1.55F, 5.5F, -3.25F);

		headModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		headModel[28].setRotationPoint(-1.55F, 7.5F, -3.25F);

		headModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		headModel[29].setRotationPoint(-0.8F, -0.25F, -3.15F);

		headModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.7F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0F, -0.55F, -0.7F, 0F, -0.55F, 0.05F, -0.7F, -0.15F, 0.05F, -0.7F, -0.15F, 0.05F, 0F, -0.55F, 0.05F, 0F); // Box 172
		headModel[30].setRotationPoint(-1.05F, 1.5F, -3.25F);

		headModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.7F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0F, -0.55F, -0.7F, 0F, -0.55F, 0.05F, -0.7F, -0.15F, 0.05F, -0.7F, -0.15F, 0.05F, 0F, -0.55F, 0.05F, 0F); // Box 173
		headModel[31].setRotationPoint(-1.05F, 3.5F, -3.25F);

		headModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.7F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0F, -0.55F, -0.7F, 0F, -0.55F, 0.05F, -0.7F, -0.15F, 0.05F, -0.7F, -0.15F, 0.05F, 0F, -0.55F, 0.05F, 0F); // Box 174
		headModel[32].setRotationPoint(-1.05F, 5.5F, -3.25F);

		headModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.7F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0F, -0.55F, -0.7F, 0F, -0.55F, 0.05F, -0.7F, -0.15F, 0.05F, -0.7F, -0.15F, 0.05F, 0F, -0.55F, 0.05F, 0F); // Box 175
		headModel[33].setRotationPoint(-1.05F, 7.5F, -3.25F);

		headModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.65F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.15F, 0F, -1.05F, -0.25F, -0.1F, 0.3F, -0.65F, 0F, 0F, -0.75F, 0F, 0F, -0.15F, -0.1F, 0.3F, -0.25F); // Box 176
		headModel[34].setRotationPoint(-1.45F, 1.5F, -3.25F);

		headModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.65F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.15F, 0F, -1.05F, -0.25F, -0.1F, 0.3F, -0.65F, 0F, 0F, -0.75F, 0F, 0F, -0.15F, -0.1F, 0.3F, -0.25F); // Box 177
		headModel[35].setRotationPoint(-1.45F, 3.5F, -3.25F);

		headModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.65F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.15F, 0F, -1.05F, -0.25F, -0.1F, 0.3F, -0.65F, 0F, 0F, -0.75F, 0F, 0F, -0.15F, -0.1F, 0.3F, -0.25F); // Box 178
		headModel[36].setRotationPoint(-1.45F, 5.5F, -3.25F);

		headModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.05F, -0.65F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.15F, 0F, -1.05F, -0.25F, -0.1F, 0.3F, -0.65F, 0F, 0F, -0.75F, 0F, 0F, -0.15F, -0.1F, 0.3F, -0.25F); // Box 179
		headModel[37].setRotationPoint(-1.45F, 7.5F, -3.25F);

		headModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.7F, -0.7F, -0.15F, -0.7F, -0.7F, -0.15F, -0.7F, 0F, -0.55F, -0.7F, 0F, -0.55F, 0.05F, -0.7F, -0.15F, 0.05F, -0.7F, -0.15F, 0.05F, 0F, -0.55F, 0.05F, 0F); // Box 180
		headModel[38].setRotationPoint(-0.750000000000001F, -0.25F, -3.15F);

		headModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1.25F, -0.65F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.15F, -0.5F, -1.25F, -0.25F, -0.6F, 0.4F, -0.65F, 0F, 0F, -0.75F, 0F, 0F, -0.15F, -0.6F, 0.4F, -0.25F); // Box 181
		headModel[39].setRotationPoint(-1.15F, -0.2F, -3.15F);

		headModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F); // Box 209
		headModel[40].setRotationPoint(-2.25F, 14.5F, -3.15F);

		headModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 210
		headModel[41].setRotationPoint(-3.25F, 14.5F, -3.15F);

		headModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F); // Box 211
		headModel[42].setRotationPoint(2.25F, 14.5F, -3.15F);

		headModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 212
		headModel[43].setRotationPoint(1.25F, 14.5F, -3.15F);

		headModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F); // Box 214
		headModel[44].setRotationPoint(-3.25F, 14.5F, -3.15F);

		headModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F); // Box 215
		headModel[45].setRotationPoint(1.25F, 14.5F, -3.15F);

		headModel[46].addShapeBox(0F, 0F, 0F, 3,8, 6, 4, 0F,0.199999999999999F, 0.0999999999999999F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F); // Box 120
		headModel[46].setRotationPoint(-8.1F, 0F, -2F);

		headModel[47].addShapeBox(0F, 0F, 0F, 3,8, 6, 4, 0F,0.199999999999999F, 0.0999999999999999F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F); // Box 151
		headModel[47].setRotationPoint(4.25F, 0F, -2F);

		headModel[48].addShapeBox(0F, 0F, 0F, 4, 11, 4, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0F, 0F, 0.0999999999999999F, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.75F, 0.1F, 0F, 0F, 0.0999999999999999F); // Box 152
		headModel[48].setRotationPoint(4.1F, 0F, -2F);

		headModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.3F, -0.4F, 0.3F, 0.2F, -0.4F, 0.3F, 0.1F, -0.4F, 0.2F, 0.3F, -0.4F, 0.2F, 0.2F, 2.77555756156289E-17F, 0.3F, 0.2F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.2F, 1.38777878078145E-16F, 0.200000000000001F); // Box 146
		headModel[49].setRotationPoint(-8.1F, 9F, -2F);
	}
}