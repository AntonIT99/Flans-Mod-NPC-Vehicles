//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGreaterHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelGreaterHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[60];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		headModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 4
		headModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 11
		headModel[15] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		headModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14
		headModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		headModel[18] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 16
		headModel[19] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 17
		headModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		headModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 19
		headModel[22] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 20
		headModel[23] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 21
		headModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
		headModel[25] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 23
		headModel[26] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 24
		headModel[27] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 25
		headModel[28] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 26
		headModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 27
		headModel[30] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 28
		headModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		headModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 30
		headModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 31
		headModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		headModel[35] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 33
		headModel[36] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		headModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		headModel[38] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 36
		headModel[39] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 37
		headModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 38
		headModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		headModel[42] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 40
		headModel[43] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 41
		headModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 42
		headModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		headModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 44
		headModel[47] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 45
		headModel[48] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 46
		headModel[49] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 47
		headModel[50] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 48
		headModel[51] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		headModel[52] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 50
		headModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
		headModel[54] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 52
		headModel[55] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 53
		headModel[56] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 54
		headModel[57] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 55
		headModel[58] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 56
		headModel[59] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 57

		headModel[0].addShapeBox(-5F, -9F, -5.5F, 5, 5, 5, 0F,-1F, -0.7F, -1.2F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0.8F, 0.2F, 0F); // Box 2
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -8F, -5.4F, 1, 5, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, -0.5F, 1.3F, 0.1F, -0.5F, 1.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1.7F, -1.45F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1.7F, -0.65F, -5.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1.7F, 0.15F, -5.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -2.8F, -5.5F, 5, 5, 5, 0F,-0.2F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0.65F, 0.2F, 0F, -0.7F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -9F, -0.5F, 5, 5, 6, 0F,-0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.8F, -1F, -0.7F, -1.5F, 0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, -1F); // Box 2
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -3.6F, -0.5F, 5, 5, 6, 0F,0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.2F, -0.5F, -0.8F, -1F, -1.2F); // Box 3
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -9.5F, -0.5F, 5, 1, 6, 0F,-0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, -0.9F, -0.5F, -1.5F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.7F, -0.85F, 0.2F, -1.4F); // Box 4
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -9.5F, -5.5F, 5, 1, 5, 0F,-1F, -0.5F, -1.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.95F, 0.2F, -1.1F, 0F, 0.3F, -0.4F, 0F, 0.2F, 0F, -0.1F, 0.2F, 0F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -4F, -5.4F, 1, 6, 1, 0F,0.1F, -0.5F, 1.3F, 0.1F, -0.5F, 1.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.1F, 0.9F, -0.2F, -0.1F, 0.9F, -0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1.7F, -2.2F, -5.9F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.7F, 0.9F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5.2F, -3.2F, -5.5F, 5, 1, 5, 0F,-0.3F, 0F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 0.2F, 0.7F, 0.1F, 0.2F, -0.4F, -0.4F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5.2F, -4.5F, -5.5F, 5, 1, 5, 0F,-0.4F, -0.2F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0.5F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 0.2F, 0.7F, -0.2F, 0.2F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-5.2F, -4.5F, -5.5F, 2, 1, 5, 0F,-0.3F, -0.8F, 0.5F, -0.2F, -0.8F, 0.61F, -0.2F, -0.7F, 0.2F, 0.7F, -0.8F, 0.2F, -0.3F, 0.3F, 0.5F, -0.2F, 0.37F, 0.65F, -0.2F, 0.4F, 0.2F, 0.7F, 0.2F, 0.2F); // Box 12
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2.5F, -1.6F, -5.65F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-2.5F, -0.8F, -5.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-2.5F, -1.11022302462516E-16F, -5.25F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 16
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-2.5F, 0.75F, -5.05F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-2.5F, -2.35F, -5.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-3.35F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 19
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3.35F, -1.7F, -5.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 20
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3.35F, -0.9F, -5.35F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-3.35F, -0.1F, -5.05F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-3.35F, 0.65F, -4.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.25F, 0.55F, -4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 24
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3.25F, -0.2F, -4.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 25
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.25F, -1F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 26
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.25F, -1.8F, -5.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 27
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(3.25F, -2.55F, -5.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 28
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(0F, -9F, -5.5F, 5, 5, 5, 0F,0F, -0.7F, -0.5F, -1F, -0.7F, -1.2F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0.8F, -0.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 29
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(0.2F, -4.5F, -5.5F, 5, 1, 5, 0F,0F, -0.1F, 0.8F, -0.4F, -0.2F, 0.2F, 0.5F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 1F, -0.3F, -0.2F, 0.5F, 0.7F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 30
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(3.2F, -4.5F, -5.5F, 2, 1, 5, 0F,-0.2F, -0.8F, 0.61F, -0.3F, -0.8F, 0.5F, 0.7F, -0.8F, 0.2F, -0.2F, -0.7F, 0.2F, -0.2F, 0.37F, 0.65F, -0.3F, 0.3F, 0.5F, 0.7F, 0.2F, 0.2F, -0.2F, 0.4F, 0.2F); // Box 31
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(0.2F, -3.2F, -5.5F, 5, 1, 5, 0F,0F, -0.2F, 1F, -0.3F, 0F, 0.5F, 0.7F, 0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.1F, 0.8F, -0.4F, -0.4F, 0.2F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 32
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(0F, -9.5F, -5.5F, 5, 1, 5, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -1.2F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, -0.4F, -0.95F, 0.2F, -1.1F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 33
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(0F, -2.8F, -5.5F, 5, 5, 5, 0F,0F, 0.2F, 0.8F, -0.2F, 0.2F, 0F, 0.65F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -0.5F, -0.7F, -0.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 34
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(0F, -3.6F, -0.5F, 5, 5, 6, 0F,0F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.2F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.8F, -1F, -1.2F, 0F, -1.2F, -0.5F); // Box 35
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(0F, -9F, -0.5F, 5, 5, 6, 0F,0F, -0.7F, 0F, -0.2F, -0.7F, 0F, -1F, -0.7F, -1.5F, 0F, -0.7F, -0.8F, 0F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.2F, 0.2F, -1F, 0F, 0.2F, 0F); // Box 36
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(0F, -9.5F, -0.5F, 5, 1, 6, 0F,0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.9F, -0.5F, -1.5F, 0F, -0.5F, -0.8F, 0F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.85F, 0.2F, -1.4F, 0F, 0.2F, -0.7F); // Box 37
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(0.7F, -2.2F, -5.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 38
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(0.7F, -1.45F, -5.65F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 39
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(0.7F, -0.65F, -5.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 40
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(0.7F, 0.15F, -5.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 41
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(0.7F, 0.9F, -5.1F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 42
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(1.5F, -2.35F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 43
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(1.5F, -1.6F, -5.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 44
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(1.5F, -0.8F, -5.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 45
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(1.5F, -1.11022302462516E-16F, -5.15F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 46
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(1.5F, 0.75F, -4.95F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 47
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(2.35F, -2.45F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 48
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(2.35F, -1.7F, -5.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 49
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(2.35F, -0.9F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 50
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(2.35F, -0.1F, -4.9F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 51
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(2.35F, 0.65F, -4.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 52
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-4.25F, -2.55F, -5.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 53
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-4.25F, -1.8F, -5.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 54
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-4.25F, -1F, -5.1F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 55
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-4.25F, -0.2F, -4.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 56
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-4.25F, 0.55F, -4.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 57
		headModel[59].setRotationPoint(0F, 0F, 0F);
	}
}