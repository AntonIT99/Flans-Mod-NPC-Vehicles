//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomanSpangenhelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelRomanSpangenhelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[49];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box19
		headModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box20
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box21
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1
		headModel[7] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 2
		headModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 3
		headModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		headModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		headModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		headModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 18
		headModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 19
		headModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 22
		headModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		headModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14
		headModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 15
		headModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 16
		headModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 17
		headModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 18
		headModel[22] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 19
		headModel[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 20
		headModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 21
		headModel[25] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 22
		headModel[26] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 23
		headModel[27] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 24
		headModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		headModel[29] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 1
		headModel[30] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 2
		headModel[31] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 39
		headModel[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 40
		headModel[33] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 41
		headModel[34] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 42
		headModel[35] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 38
		headModel[36] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 39
		headModel[37] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 40
		headModel[38] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 41
		headModel[39] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 42
		headModel[40] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 43
		headModel[41] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 44
		headModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 45
		headModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		headModel[44] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 47
		headModel[45] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 48
		headModel[46] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 49
		headModel[47] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 50
		headModel[48] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 51

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0F, 1.3F, -0.2F, 0F, 1.3F, -0.2F, 0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0.8F, -0.5F, 0.7F, 0.8F, -0.5F, 0.7F, 0.8F, -0.5F, 1.2F, 0.8F, -0.5F, 1.2F); // Import Box18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.8F, -4F, 8, 1, 8, 0F,-2F, 1F, -2.5F, -2F, 1F, -2.5F, -2F, 0.7F, -0.8F, -2F, 0.7F, -0.8F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0.7F, 0F, 1F, 0.7F); // Import Box22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,1F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 1.2F, 0F, 0F, 1.2F); // Import Box20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, -0.3F, 1.4F, 1F, -0.3F, 1.4F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1.5F, -10.8F, -4F, 3, 1, 8, 0F,-0.3F, 1.3F, -2.4F, -0.3F, 1.3F, -2.4F, -0.3F, 1F, -0.6F, -0.3F, 1F, -0.6F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 1F, 1F, -0.3F, 1F, 1F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1.5F, -8F, -4F, 3, 3, 8, 0F,-0.3F, 1.3F, 0.1F, -0.3F, 1.3F, 0.1F, -0.3F, 0.8F, 1F, -0.3F, 0.8F, 1F, -0.3F, -1F, 0.8F, -0.3F, -1F, 0.8F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F, 1.5F); // Box 1
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -10.8F, -0.6F, 8, 1, 3, 0F,-1.8F, 1.15F, 0F, -1.8F, 1.15F, -0.2F, -1.8F, 1F, -0.2F, -1.8F, 1F, 0F, 0.2F, 0.7F, 0.4F, 0.2F, 0.7F, 0.1F, 0.2F, 0.9F, -0.5F, 0.2F, 0.9F, -0.3F); // Box 2
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8.2F, -0.9F, 8, 1, 3, 0F,0.2F, 0.9F, 0.1F, 0.2F, 0.9F, -0.1F, 0.2F, 0.7F, -0.2F, 0.2F, 0.7F, 0F, 0.9F, 1.4F, 0.2F, 0.9F, 1.4F, 0.2F, 0.9F, 1.6F, -0.1F, 0.9F, 1.6F, -0.1F); // Box 3
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -12.8F, -0.5F, 3, 1, 3, 0F,-0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 0
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 2
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 3
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -5F, -4.5F, 2, 1, 1, 0F,0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, -0.7F, -0.4F, 0.2F, -0.7F); // Box 17
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3F, -5.2F, -4.5F, 2, 1, 1, 0F,-0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F); // Box 18
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -5F, -4.5F, 1, 1, 1, 0F,0F, -0.4F, 0.7F, 0.5F, -0.4F, 0.7F, 0.5F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 19
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(1F, -5.2F, -4.5F, 2, 1, 1, 0F,-0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, -0.7F, -0.3F, -0.2F, -0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F); // Box 22
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(3F, -5F, -4.5F, 1, 1, 1, 0F,0.5F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, -0.7F, 0.5F, -0.4F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 13
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -4.5F, -4.5F, 1, 2, 1, 0F,0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F); // Box 14
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.5F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0.5F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 16
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.5F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(2F, -6.2F, -5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -2.5F, -4.5F, 1, 1, 1, 0F,0.2F, -0.2F, 0.7F, 0.2F, -0.2F, 0.7F, 0.2F, -0.2F, -0.7F, 0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F); // Box 19
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4.5F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 20
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-3F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1.5F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0.5F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(2F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 24
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.5F, -5.6F, 4.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 25
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3.5F, -4.5F, 3.7F, 7, 2, 1, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -0.5F, 0.5F, 0.9F, -0.5F, 0.5F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.3F, 0F, 0.9F, -0.3F, 0F); // Box 1
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-3F, -3.5F, 2.7F, 6, 4, 1, 0F,1.4F, -0.5F, -1.1F, 1.4F, -0.5F, -1.1F, 1.4F, -0.3F, 0.9F, 1.4F, -0.3F, 0.9F, 1.9F, 0.5F, -2.7F, 1.9F, 0.5F, -2.7F, 1.9F, -0.1F, 2.3F, 1.9F, -0.1F, 2.3F); // Box 2
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(3.85F, -1F, -3.5F, 1, 2, 3, 0F,0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F); // Box 39
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.85F, -2F, -3.5F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(3.85F, -3.5F, -3.5F, 1, 2, 7, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 41
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(3.85F, -4.5F, -3F, 1, 1, 6, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 42
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4.85F, -4.5F, -3F, 1, 1, 6, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 38
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4.85F, -3.5F, -3.5F, 1, 2, 7, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 39
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4.85F, -2F, -3.5F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4.85F, -1F, -3.5F, 1, 2, 3, 0F,0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F); // Box 41
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(4.3F, -6.1F, -4.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 42
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(4.3F, -6F, -2.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 43
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(4.3F, -5.9F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 44
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(4.3F, -5.8F, 1.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 45
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(4.3F, -5.7F, 3.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 46
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-5.3F, -6.1F, -4.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 47
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-5.3F, -6F, -2.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 48
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-5.3F, -5.9F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 49
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-5.3F, -5.8F, 1.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 50
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-5.3F, -5.7F, 3.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 51
		headModel[48].setRotationPoint(0F, 0F, 0F);
	}
}