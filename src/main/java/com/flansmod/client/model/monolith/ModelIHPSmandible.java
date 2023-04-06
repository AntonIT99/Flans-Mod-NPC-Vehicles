//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIHPSmandible extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelIHPSmandible() //Same as Filename
	{
		headModel = new ModelRendererTurbo[73];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 45
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		headModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 3
		headModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		headModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		headModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 1
		headModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 18
		headModel[15] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 19
		headModel[16] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 4
		headModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 5
		headModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 6
		headModel[19] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 7
		headModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 8
		headModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 9
		headModel[22] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 9
		headModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		headModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 2
		headModel[25] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 4
		headModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 5
		headModel[27] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 6
		headModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		headModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 17
		headModel[30] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 18
		headModel[31] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 19
		headModel[32] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 20
		headModel[33] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 21
		headModel[34] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 22
		headModel[35] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 23
		headModel[36] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 24
		headModel[37] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 25
		headModel[38] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 26
		headModel[39] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 27
		headModel[40] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 28
		headModel[41] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 29
		headModel[42] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 30
		headModel[43] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 31
		headModel[44] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 32
		headModel[45] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		headModel[46] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 34
		headModel[47] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 35
		headModel[48] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 0
		headModel[49] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 1
		headModel[50] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 2
		headModel[51] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 3
		headModel[52] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 4
		headModel[53] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 5
		headModel[54] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 6
		headModel[55] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 7
		headModel[56] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 12
		headModel[57] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 13
		headModel[58] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 14
		headModel[59] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 15
		headModel[60] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 16
		headModel[61] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		headModel[62] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 18
		headModel[63] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 19
		headModel[64] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 20
		headModel[65] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 21
		headModel[66] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 22
		headModel[67] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 23
		headModel[68] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 24
		headModel[69] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 25
		headModel[70] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 26
		headModel[71] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 27
		headModel[72] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 28

		headModel[0].addShapeBox(2F, -9F, -4.05F, 2, 2, 8, 0F,0.5F, -0.6F, 0.2F, 0F, -0.8F, -0.1F, 0.1F, -1F, 0.1F, 0.5F, -0.9F, 0.8F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.5F, 0.7F, 1.5F, 1F, 0F, 1.5F, 1.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(2F, -10F, -4.05F, 2, 1, 8, 0F,1.3F, -0.4F, -3F, -0.8F, -0.8F, -3.5F, -0.7F, -1F, -1.5F, 1.3F, -0.8F, -0.8F, 0.5F, 0.6F, 0.2F, 0F, 0.8F, -0.1F, 0.1F, 1F, 0.1F, 0.5F, 0.9F, 0.8F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -9F, -4.05F, 2, 2, 8, 0F,0.5F, -0.6F, 0.2F, 0.5F, -0.6F, 0.2F, 0.5F, -0.9F, 0.8F, 0.5F, -0.9F, 0.8F, 1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, 1.5F, 1.5F, 1F, 1.5F, 1.5F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -6.5F, -5.05F, 2, 2, 10, 0F,1F, 0.3F, -0.2F, 1F, 0.3F, -0.2F, 1F, -1F, 0.5F, 1F, -1F, 0.5F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 1.7F, 0.9F, 0.5F, 1.7F, 0.9F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1.5F, -10F, -4.05F, 3, 1, 8, 0F,-0.8F, -0.4F, -3F, -0.8F, -0.4F, -3F, -0.8F, -0.8F, -0.8F, -0.8F, -0.8F, -0.8F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.9F, 0.8F, 0F, 0.9F, 0.8F); // Box 45
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -0.8F, -4.15F, 10, 1, 1, 0F,-0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4.4F, -4.2F, -2.05F, 1, 4, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0.4F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, -1F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F); // Box 0
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3F, -6.5F, -4.05F, 1, 2, 2, 0F,1.3F, 0.2F, 1F, 0.3F, 0.2F, 0.5F, 0.45F, -0.3F, 1.5F, 1F, -0.3F, 1.5F, 1.5F, -0.5F, 1.4F, 0.5F, -0.3F, 0.8F, 0.7F, -0.1F, -1F, 1.5F, 0F, -1F); // Box 2
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1.9F, -6.5F, -3.05F, 2, 2, 5, 0F,0F, -0.3F, -2.5F, 0.4F, -0.25F, -2.5F, 0.58F, -0.64F, 0.5F, 1F, -0.2F, 0F, 0.5F, 0F, 0F, 0.7F, -0.1F, 0F, 1.2F, 2.2F, 1.7F, 0.5F, 1.5F, 1.2F); // Box 3
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3F, -6.5F, 1.95F, 1, 2, 2, 0F,1F, 0.1F, -0.5F, 0.58F, -0.64F, -0.5F, 0.7F, -1F, 1F, 1F, -1F, 1.5F, 1.5F, 1.4F, -1.7F, 1.2F, 2.2F, -1.7F, 1F, 2F, 1.2F, 1.5F, 1.7F, 1.9F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4.4F, -2.5F, 1.95F, 1, 2, 1, 0F,2F, -0.8F, -2.5F, -1.4F, -0.8F, -2.1F, -1.4F, -1.3F, 1.1F, 1.7F, -1.3F, 1.4F, 0.3F, -0.3F, 3.8F, -0.9F, -0.3F, 3.8F, -0.9F, 0F, -4.2F, 0.3F, 0F, -4.2F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4.1F, -1.2F, -2.05F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0.2F, -0.1F, 1.7F, -0.9F, -0.1F, 1.7F, -1F, 0.2F, -2.3F, 0.2F, 0.2F, -2.3F); // Box 1
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -3.5F, 4F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 0
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.5F, -5F, -0.65F, 1, 1, 2, 0F,0F, -0.8F, -0.1F, -0.12F, -0.8F, -0.1F, 0F, -1.3F, -0.65F, 0F, -1.3F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F); // Box 1
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4F, -5.8F, -0.5F, 1, 1, 3, 0F,0F, 0.6F, 0.3F, 0F, 0.1F, 0F, 0F, -0.4F, -0.8F, 0F, 0F, -0.3F, -0.3F, -0.2F, 1.1F, 0.1F, -0.3F, 0.1F, 0.1F, 0.1F, -0.9F, 0F, 0.3F, -0.4F); // Box 18
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(5F, -5.8F, -0.5F, 1, 1, 10, 0F,0F, 0.1F, 0.1F, -0.7F, 0.25F, 0.1F, -0.7F, -0.2F, -8.4F, 0F, -0.3F, -8.4F, -0.1F, -0.5F, 0.2F, -0.55F, -0.4F, 0.2F, -0.55F, 0F, -8.5F, -0.1F, -0.1F, -8.5F); // Box 19
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.5F, -5F, -2.05F, 1, 2, 2, 0F,0.5F, 0.5F, -2F, -1.1F, 0.5F, -2F, -1.1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.4F, -1.5F, 0.7F, -0.9F, -1.5F, 0.7F, 0.2F, 0F, -0.4F, -0.7F, 0F, -0.4F); // Box 4
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.5F, -5F, -0.85F, 1, 2, 3, 0F,0.5F, 0.5F, -1.3F, -1.1F, 0.5F, -1.3F, -1.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.7F, 0F, -0.4F, 0.2F, 0F, -0.4F, -0.6F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F); // Box 5
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.2F, -5.6F, 1F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.4F, -0.08F, -0.25F, -0.4F, -0.08F, -0.3F, -0.2F, -0.5F, -0.35F, 0F, -0.6F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.2F, -0.3F, -0.6F, -0.15F, -0.1F); // Box 6
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4F, -5.5F, -0.05F, 1, 2, 2, 0F,0F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.1F, 0F, -1.4F, 0F, 0.1F, -1.3F, -1.35F, 0.05F, 1F, 0.5F, -0.5F, 0.6F, 0.5F, -0.4F, -2.4F, -1.45F, 0.15F, -2.7F); // Box 7
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4.1F, -5.1F, 0.95F, 1, 2, 2, 0F,0F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.1F, 0F, -1.4F, 0F, 0.1F, -1.3F, -1.45F, 0.05F, 1F, 0.5F, -0.5F, 0.6F, 0.5F, -0.4F, -2.4F, -1.35F, 0.1F, -2.7F); // Box 8
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3.9F, -5.7F, -0.4F, 1, 1, 1, 0F,0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.1F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, 0.2F, -0.2F, 0.25F, 0.2F, -0.2F, 0.35F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 9
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-1F, -9F, -5.1F, 2, 3, 1, 0F,0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.6F, 1F, -0.8F, 0.6F, 1F, -0.8F); // Box 9
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-1F, -8.45F, -4.9F, 2, 1, 1, 0F,-0.3F, -0.5F, 0.35F, -0.3F, -0.5F, 0.35F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 1
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-1F, -6.6F, -5.5F, 2, 1, 1, 0F,-0.3F, -0.5F, 0.35F, -0.3F, -0.5F, 0.35F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 2
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1.25F, -8.45F, -5.1F, 1, 2, 1, 0F,-0.1F, -1F, 0.4F, -0.8F, -1F, 0.4F, -0.8F, -1.1F, -0.7F, -0.1F, -1.1F, -0.7F, -0.1F, 0.2F, 0.6F, -0.8F, 0.2F, 0.6F, -0.8F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F); // Box 4
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0.25F, -8.45F, -5.1F, 1, 2, 1, 0F,-0.8F, -1F, 0.4F, -0.1F, -1F, 0.4F, -0.1F, -1.1F, -0.7F, -0.8F, -1.1F, -0.7F, -0.8F, 0.2F, 0.6F, -0.1F, 0.2F, 0.6F, -0.1F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F); // Box 5
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-0.5F, -7.35F, -4.9F, 1, 1, 1, 0F,-0.1F, -0.1F, 0.55F, -0.1F, -0.1F, 0.55F, -0.1F, -0.15F, -0.7F, -0.1F, -0.15F, -0.7F, -0.1F, -0.1F, 0.67F, -0.1F, -0.1F, 0.67F, -0.1F, -0.07F, -0.5F, -0.1F, -0.07F, -0.5F); // Box 6
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1F, -6F, -5.3F, 2, 1, 1, 0F,0.7F, -0.7F, 0F, 0.7F, -0.7F, 0F, 0.7F, -0.7F, 0F, 0.7F, -0.7F, 0F, 0.5F, -0.03F, 0.1F, 0.5F, -0.03F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 16
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.5F, -9F, -4.2F, 1, 2, 8, 0F,-0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.9F, 0.8F, -0.2F, -0.9F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 1.5F, 1.5F, -0.2F, 1.5F, 1.5F); // Box 17
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, -10F, -4F, 1, 1, 8, 0F,-0.8F, -0.2F, -3F, -0.8F, -0.2F, -3F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.8F, -0.8F, 0.6F, 0.4F, -0.8F, 0.6F, 0.4F, -0.8F, 0.9F, 1F, -0.8F, 0.9F, 1F); // Box 18
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.5F, -9F, 3.2F, 1, 2, 1, 0F,-0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.9F, 0.8F, -0.2F, -0.9F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 1.5F, 1.5F, -0.2F, 1.5F, 1.5F); // Box 19
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-0.5F, -6.5F, 4.2F, 1, 2, 1, 0F,-0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 1F, 0.6F, -0.2F, 1F, 0.6F); // Box 20
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-0.5F, -5F, 4.3F, 1, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 21
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-0.5F, -4F, 4.3F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, -0.1F, 0.8F, 0.3F, -0.1F, 0.8F); // Box 22
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-0.5F, -10F, -2.4F, 1, 1, 1, 0F,0F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 23
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-1F, -2F, -6.5F, 2, 3, 1, 0F,0.3F, -0.5F, 0.7F, 0.3F, -0.5F, 0.7F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 24
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(1F, -2F, -6.5F, 3, 3, 1, 0F,-0.3F, -0.5F, 0.5F, 0.3F, -0.5F, 0F, 0.8F, 0F, 0F, 0.3F, -0.2F, 0F, 0F, 0.5F, -0.5F, -0.3F, -0.2F, -1F, 0.5F, -0.4F, 0.5F, 0F, 0.5F, 0.5F); // Box 25
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(3F, -2F, -5.5F, 1, 3, 4, 0F,-1F, -0.2F, 0F, 0.8F, 0F, 0F, 1.45F, 0.5F, 1F, -2F, 0.5F, 1F, 0F, 0F, -0.5F, 0.5F, -0.4F, -0.5F, 1F, -1.5F, 0.5F, -1F, -1F, 0.5F); // Box 26
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(4.5F, -3.4F, -1.4F, 1, 1, 1, 0F,-0.3F, 0.5F, 0.3F, -0.45F, 0.5F, 0.3F, -0.3F, -0.4F, 1.5F, -0.1F, -0.4F, 1.5F, -0.2F, 0.2F, 0.9F, -0.3F, 0.05F, 0.8F, -0.25F, 0.8F, -0.3F, -0.2F, 0.9F, -0.3F); // Box 27
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(4.7F, -3.7F, -1.5F, 1, 1, 1, 0F,0.3F, 0.8F, -1.5F, 0F, 0.1F, -1F, 0F, -0.25F, 0.8F, 0.2F, 0.5F, 1.3F, 0F, 0.6F, 0.1F, -0.1F, 0.1F, -0.2F, 0F, 0.4F, -0.1F, 0.1F, 1F, -0.4F); // Box 28
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(4.2F, -4.8F, -0.8F, 1, 1, 1, 0F,0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.1F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, 0.2F, -0.2F, 0.25F, 0.2F, -0.2F, 0.35F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 29
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-1F, -7F, -5.5F, 2, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 30
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(1F, -6F, -5.5F, 3, 1, 1, 0F,0F, -0.7F, 0F, 0.5F, -1.1F, -0.5F, 0.5F, -1.4F, 2.3F, 0F, -0.7F, 0F, 0F, 0.2F, 0.2F, 0.5F, 0.5F, -0.5F, 0.7F, 0.8F, 2.3F, 0F, 0F, 0F); // Box 31
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-1F, -2F, -6.5F, 2, 1, 1, 0F,-0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, 0.3F, -0.5F, 0.7F, 0.3F, -0.5F, 0.7F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F); // Box 32
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-1F, -5F, -5.9F, 2, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F, -1.3F); // Box 33
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(1F, -5F, -5.9F, 3, 4, 1, 0F,0F, 0F, -0.3F, 0F, -0.3F, -1F, 0.5F, -0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.7F, -0.2F, -0.5F, 0F, 0.3F, -0.5F, -0.6F, 0F, 0F, -1.3F); // Box 34
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(3.6F, -5F, -5.5F, 1, 4, 3, 0F,-0.5F, -0.3F, -1F, -0.1F, -0.3F, -1F, 0.1F, -0.8F, 0.8F, -0.9F, -0.8F, 0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.4F, -1F, 0F, -1.1F, -1F, 0F); // Box 35
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-4F, -10F, -4.05F, 2, 1, 8, 0F,-0.8F, -0.8F, -3.5F, 1.3F, -0.4F, -3F, 1.3F, -0.8F, -0.8F, -0.7F, -1F, -1.5F, 0F, 0.8F, -0.1F, 0.5F, 0.6F, 0.2F, 0.5F, 0.9F, 0.8F, 0.1F, 1F, 0.1F); // Box 0
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-4F, -6.5F, -4.05F, 1, 2, 2, 0F,0.3F, 0.2F, 0.5F, 1.3F, 0.2F, 1F, 1F, -0.3F, 1.5F, 0.45F, -0.3F, 1.5F, 0.5F, -0.3F, 0.8F, 1.5F, -0.5F, 1.4F, 1.5F, 0F, -1F, 0.7F, -0.1F, -1F); // Box 1
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-4F, -9F, -4.05F, 2, 2, 8, 0F,0F, -0.8F, -0.1F, 0.5F, -0.6F, 0.2F, 0.5F, -0.9F, 0.8F, 0.1F, -1F, 0.1F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 1F, 0F, 1.5F, 1.5F, 0.7F, 1.5F, 1F); // Box 2
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-4F, -6.5F, 1.95F, 1, 2, 2, 0F,0.58F, -0.64F, -0.5F, 1F, 0.1F, -0.5F, 1F, -1F, 1.5F, 0.7F, -1F, 1F, 1.2F, 2.2F, -1.7F, 1.5F, 1.4F, -1.7F, 1.5F, 1.7F, 1.9F, 1F, 2F, 1.2F); // Box 3
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-5.5F, -5F, -2.05F, 1, 2, 2, 0F,-1.1F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, 0.5F, -1.1F, 0.5F, 0.5F, -0.9F, -1.5F, 0.7F, 0.4F, -1.5F, 0.7F, -0.7F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 4
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-5.5F, -5F, -0.85F, 1, 2, 3, 0F,-1.1F, 0.5F, -1.3F, 0.5F, 0.5F, -1.3F, 0.5F, 0.5F, 0F, -1.1F, 0.5F, 0F, 0.2F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0.1F, 0.2F, 0.5F, -0.6F, 0.2F, 0.5F); // Box 5
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-3.9F, -6.5F, -3.05F, 2, 2, 5, 0F,0.4F, -0.25F, -2.5F, 0F, -0.3F, -2.5F, 1F, -0.2F, 0F, 0.58F, -0.64F, 0.5F, 0.7F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 1.2F, 1.2F, 2.2F, 1.7F); // Box 6
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-5F, -5.8F, -0.5F, 1, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.6F, 0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.8F, 0.1F, -0.3F, 0.1F, -0.3F, -0.2F, 1.1F, 0F, 0.3F, -0.4F, 0.1F, 0.1F, -0.9F); // Box 7
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-5F, -5.5F, -0.05F, 1, 2, 2, 0F,-0.2F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.1F, -1.3F, -0.1F, 0F, -1.4F, 0.5F, -0.5F, 0.6F, -1.35F, 0.05F, 1F, -1.45F, 0.15F, -2.7F, 0.5F, -0.4F, -2.4F); // Box 12
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-5.1F, -5.1F, 0.95F, 1, 2, 2, 0F,-0.2F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.1F, -1.3F, -0.1F, 0F, -1.4F, 0.5F, -0.5F, 0.6F, -1.45F, 0.05F, 1F, -1.35F, 0.1F, -2.7F, 0.5F, -0.4F, -2.4F); // Box 13
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-4.9F, -5.7F, -0.4F, 1, 1, 1, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, 0.7F, -0.1F, -0.3F, 0.7F, 0.25F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.1F, 0.5F, 0.1F, 0.35F, 0.5F, 0.1F); // Box 14
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-5.5F, -5F, -0.65F, 1, 1, 2, 0F,-0.12F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -1.3F, -0.65F, 0F, -1.3F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F); // Box 15
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-5.7F, -3.7F, -1.5F, 1, 1, 1, 0F,0F, 0.1F, -1F, 0.3F, 0.8F, -1.5F, 0.2F, 0.5F, 1.3F, 0F, -0.25F, 0.8F, -0.1F, 0.1F, -0.2F, 0F, 0.6F, 0.1F, 0.1F, 1F, -0.4F, 0F, 0.4F, -0.1F); // Box 16
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-4F, -5F, -5.9F, 3, 4, 1, 0F,0F, -0.3F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, -0.3F, 0.4F, -0.2F, -0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0.3F, -0.5F, -0.6F); // Box 17
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-4F, -6F, -5.5F, 3, 1, 1, 0F,0.5F, -1.1F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.5F, -1.4F, 2.3F, 0.5F, 0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0.7F, 0.8F, 2.3F); // Box 18
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-4F, -2F, -5.5F, 1, 3, 4, 0F,0.8F, 0F, 0F, -1F, -0.2F, 0F, -2F, 0.5F, 1F, 1.45F, 0.5F, 1F, 0.5F, -0.4F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, 0.5F, 1F, -1.5F, 0.5F); // Box 19
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(-4F, -2F, -6.5F, 3, 3, 1, 0F,0.3F, -0.5F, 0F, -0.3F, -0.5F, 0.5F, 0.3F, -0.2F, 0F, 0.8F, 0F, 0F, -0.3F, -0.2F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0.5F, -0.4F, 0.5F); // Box 20
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-4.6F, -5F, -5.5F, 1, 4, 3, 0F,-0.1F, -0.5F, -0.9F, -0.5F, -0.3F, -1F, -0.9F, -0.8F, 0.8F, 0.1F, -0.8F, 0.8F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -1.1F, -1F, 0F, 0.4F, -1F, 0F); // Box 21
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-5.5F, -3.4F, -1.4F, 1, 1, 1, 0F,-0.45F, 0.5F, 0.3F, -0.3F, 0.5F, 0.3F, -0.1F, -0.4F, 1.5F, -0.3F, -0.4F, 1.5F, -0.3F, 0.05F, 0.8F, -0.2F, 0.2F, 0.9F, -0.2F, 0.9F, -0.3F, -0.25F, 0.8F, -0.3F); // Box 22
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(-5.2F, -5.6F, 1F, 1, 1, 1, 0F,-0.08F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.35F, 0F, -0.08F, -0.3F, -0.2F, 0F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F, -0.15F, -0.1F, 0F, -0.2F, -0.3F); // Box 23
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-5.4F, -4.2F, -2.05F, 1, 4, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -1F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -1F, -0.3F, -0.2F); // Box 24
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(-5.4F, -2.5F, 1.95F, 1, 2, 1, 0F,-1.4F, -0.8F, -2.1F, 2F, -0.8F, -2.5F, 1.7F, -1.3F, 1.4F, -1.4F, -1.3F, 1.1F, -0.9F, -0.3F, 3.8F, 0.3F, -0.3F, 3.8F, 0.3F, 0F, -4.2F, -0.9F, 0F, -4.2F); // Box 25
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(-5.1F, -1.2F, -2.05F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.65F, -0.2F, -0.6F, -0.65F, -0.2F, -0.9F, -0.1F, 1.7F, 0.2F, -0.1F, 1.7F, 0.2F, 0.2F, -2.3F, -1F, 0.2F, -2.3F); // Box 26
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(-1F, -7F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(-1.5F, -7.5F, -5.5F, 3, 1, 1, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 28
		headModel[72].setRotationPoint(0F, 0F, 0F);
	}
}