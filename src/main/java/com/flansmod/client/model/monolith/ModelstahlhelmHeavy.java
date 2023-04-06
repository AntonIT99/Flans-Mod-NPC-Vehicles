//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelstahlhelmHeavy extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelstahlhelmHeavy() //Same as Filename
	{
		headModel = new ModelRendererTurbo[51];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		headModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		headModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 2
		headModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		headModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 1
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		headModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 2
		headModel[14] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 3
		headModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 0
		headModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		headModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 2
		headModel[18] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 3
		headModel[19] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 4
		headModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		headModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		headModel[22] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 7
		headModel[23] = new ModelRendererTurbo(this, 41, 45, textureX, textureY); // Box 8
		headModel[24] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 9
		headModel[25] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 10
		headModel[26] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 11
		headModel[27] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 12
		headModel[28] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 14
		headModel[29] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 0
		headModel[30] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 1
		headModel[31] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 2
		headModel[32] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 0
		headModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 1
		headModel[34] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 2
		headModel[35] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 3
		headModel[36] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 4
		headModel[37] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 5
		headModel[38] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 7
		headModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 8
		headModel[40] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 9
		headModel[41] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 10
		headModel[42] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 11
		headModel[43] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 12
		headModel[44] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 13
		headModel[45] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 14
		headModel[46] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 15
		headModel[47] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 16
		headModel[48] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18
		headModel[49] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 19
		headModel[50] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 0

		headModel[0].addShapeBox(3.6F, -9.2F, -4.1F, 1, 2, 8, 0F,0.8F, 0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.1F, -0.8F, 0F, 0.8F, -1.3F, 1F, 0.6F, -1F, 0.6F, 0.2F, -0.5F, 0.3F, 0.6F, 0.5F, 0.5F, 0.6F, 1F, 1.4F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(3.6F, -10.4F, -4.1F, 1, 1, 8, 0F,1.6F, -0.2F, -2.3F, -1F, -0.7F, -2.6F, -0.9F, -1.2F, -1F, 1.6F, -0.8F, -0.5F, 0.8F, 0.1F, 0F, -0.3F, 0.3F, -0.5F, -0.1F, 1F, 0F, 0.8F, 1.5F, 1F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3F, -9.2F, -4.1F, 6, 2, 8, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -1.3F, 1F, -0.2F, -1.3F, 1F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 1F, 1.4F, 0F, 1F, 1.4F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -6.5F, -4.1F, 6, 2, 8, 0F,0F, 1.7F, 0.6F, 0F, 1.7F, 0.6F, 0F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.7F, 1.2F, 0F, -0.7F, 1.2F, 0F, 1.4F, 1.3F, 0F, 1.4F, 1.3F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2F, -5.4F, -6.1F, 4, 1, 3, 0F,1F, -0.4F, -0.4F, 1F, -0.4F, -0.4F, 0.9F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1.1F, 1F, -0.5F, 1.1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 35
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -10.4F, -4.1F, 6, 1, 8, 0F,-1F, -0.2F, -2.3F, -1F, -0.2F, -2.3F, -1F, -0.8F, -0.5F, -1F, -0.8F, -0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 1.5F, 1F, -0.2F, 1.5F, 1F); // Box 45
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -0.7F, -3.6F, 10, 1, 1, 0F,-0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -1F, -0.2F, 0.3F, -1F, -0.2F, 0.3F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 23
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.9F, -5F, -0.6F, 1, 5, 1, 0F,0.5F, -1F, -0.8F, -1.2F, -1.2F, -0.8F, -1.2F, -1.4F, 0.5F, 0.5F, -1.4F, 0.5F, 1F, -0.3F, 3F, -1.8F, -0.3F, 3F, -1.8F, -0.2F, -3.2F, 1F, -0.2F, -3.2F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.6F, -6.5F, -4.1F, 1, 2, 9, 0F,0.6F, 1.7F, 0.6F, 0.2F, 1.2F, 0.3F, 0.6F, 0.2F, -0.5F, 0.6F, -0.3F, 0.4F, 0.6F, -0.7F, 1.2F, 0.3F, -0.2F, 0.5F, 0.7F, 1.2F, -1F, 0.6F, 1.4F, 0.3F); // Box 2
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2F, -4.8F, -6.3F, 4, 1, 3, 0F,1F, 0.1F, 0.9F, 1F, 0.1F, 0.9F, 0.9F, 0F, 1F, 1F, 0F, 1F, 1F, -0.95F, 0.95F, 1F, -0.95F, 0.95F, 1F, -0.3F, 1F, 1F, -0.3F, 1F); // Box 0
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.6F, -5.4F, -5.1F, 1, 1, 2, 0F,0.6F, 0.6F, -0.05F, 0.24F, 0.1F, -0.65F, 0.2F, -0.3F, 0F, 0.6F, -0.6F, 0F, 0.6F, -0.5F, 0.9F, 0.26F, -0.4F, 0.6F, 1.1F, 0.3F, -0.5F, 0.6F, -0.1F, 0F); // Box 1
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.6F, -4.8F, -6.1F, 1, 1, 2, 0F,0.6F, 0.1F, 1.1F, 0.1F, -0.2F, 0.4F, 1.1F, -0.7F, 0.5F, 0.6F, 0F, 1F, 0.6F, -0.95F, 1.15F, 0.1F, -0.7F, 0.45F, 1.1F, -0.2F, 0.6F, 0.6F, -0.5F, 1F); // Box 7
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-2F, -5.4F, -5.1F, 4, 1, 3, 0F,1F, 0.6F, -0.05F, 1F, 0.6F, -0.05F, 0.9F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.9F, 1F, -0.5F, 0.9F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(5.1F, -4.6F, -3.1F, 1, 1, 2, 0F,0.3F, 0.5F, 0.4F, -0.4F, -0.5F, 0.5F, -1.2F, 0F, 0F, 0.7F, 0.7F, 0F, -0.8F, 1.1F, -1F, 0.3F, 1.1F, -1F, 0.4F, 1.4F, 0F, -0.9F, 1.4F, 0F); // Box 2
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.6F, -5.4F, -6.1F, 1, 1, 3, 0F,0.6F, -0.4F, -0.4F, 0.2F, -0.4F, -0.8F, 0.2F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 1.1F, 0.1F, -0.2F, 0.4F, 1.1F, 0.3F, -0.5F, 0.6F, 0F, 0F); // Box 3
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(5.1F, -4.6F, -1.1F, 1, 1, 5, 0F,0.7F, 0.7F, 0F, -1.2F, 0.2F, 0F, -0.85F, -0.2F, 0.05F, 0.3F, -0.6F, 0.05F, -0.9F, 1.4F, 0F, 0.4F, 1.4F, 0F, -0.1F, 2.1F, 0F, -0.5F, 2.1F, 0F); // Box 0
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(5.1F, -3.6F, 3.9F, 1, 1, 1, 0F,0.3F, 0.4F, 0.95F, -0.85F, 0.8F, -0.05F, -3.1F, 0.8F, 0.3F, 1.7F, -0.5F, -0.2F, -0.1F, 1.1F, 0F, -0.1F, 1.1F, 0F, -2.6F, 1.4F, 1.6F, 1.6F, 1.4F, 1F); // Box 1
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3F, -3.6F, 5.1F, 6, 1, 1, 0F,0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0.5F, -2.4F, 0.4F, 0.5F, -2.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.4F, -0.2F, 0.5F, 1.4F, -0.2F); // Box 2
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.6F, -5.4F, -6.1F, 1, 1, 3, 0F,0.3F, -0.4F, -0.8F, 0.6F, -0.4F, -0.4F, 0.6F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.1F, -0.2F, 0.4F, 0.6F, -0.5F, 1.1F, 0.6F, 0F, 0F, 1.1F, 0.3F, -0.5F); // Box 3
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.6F, -4.8F, -6.1F, 1, 1, 2, 0F,0.1F, -0.2F, 0.4F, 0.6F, 0.1F, 1.1F, 0.6F, 0F, 1F, 1.1F, -0.7F, 0.5F, 0.1F, -0.7F, 0.45F, 0.6F, -0.95F, 1.15F, 0.6F, -0.5F, 1F, 1.1F, -0.2F, 0.6F); // Box 4
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.6F, -5.4F, -5.1F, 1, 1, 2, 0F,0.24F, 0.1F, -0.65F, 0.6F, 0.6F, -0.05F, 0.6F, -0.8F, 0F, 0.29F, -0.3F, 0F, 0.3F, -0.4F, 0.6F, 0.6F, -0.5F, 0.9F, 0.6F, -0.1F, 0F, 1.1F, 0.3F, -0.5F); // Box 5
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4.6F, -6.5F, -4.1F, 1, 2, 9, 0F,0.2F, 1.2F, 0.3F, 0.6F, 1.7F, 0.6F, 0.6F, -0.3F, 0.4F, 0.6F, 0.2F, -0.5F, 0.25F, -0.2F, 0.5F, 0.6F, -0.7F, 1.2F, 0.6F, 1.4F, 0.3F, 0.7F, 1.2F, -1F); // Box 6
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.6F, -9.2F, -4.1F, 1, 2, 8, 0F,-0.3F, -0.1F, -0.5F, 0.8F, 0.1F, 0F, 0.8F, -1.3F, 1F, -0.1F, -0.8F, 0F, 0.2F, -0.5F, 0.3F, 0.6F, -1F, 0.6F, 0.6F, 1F, 1.4F, 0.6F, 0.5F, 0.5F); // Box 7
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4.6F, -10.4F, -4.1F, 1, 1, 8, 0F,-1F, -0.7F, -2.6F, 1.6F, -0.2F, -2.3F, 1.6F, -0.8F, -0.5F, -0.9F, -1.2F, -1F, -0.3F, 0.3F, -0.5F, 0.8F, 0.1F, 0F, 0.8F, 1.5F, 1F, -0.1F, 1F, 0F); // Box 8
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-6.1F, -3.6F, 3.9F, 1, 1, 1, 0F,-0.85F, 0.8F, -0.05F, 0.1F, 0.4F, 0.95F, 2.1F, -0.3F, -0.6F, -3.1F, 0.8F, 0.3F, -0.1F, 1.1F, 0F, -0.3F, 1.1F, 0F, 1.6F, 1.4F, 1F, -2.6F, 1.4F, 1.6F); // Box 9
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-6.1F, -4.6F, -1.1F, 1, 1, 5, 0F,-1.2F, 0.2F, 0F, 0.7F, 0.7F, 0F, 0.3F, -0.6F, 0.05F, -0.85F, -0.2F, 0.05F, 0.4F, 1.4F, 0F, -0.9F, 1.4F, 0F, -0.5F, 2.1F, 0F, -0.1F, 2.1F, 0F); // Box 10
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-6.1F, -4.6F, -3.1F, 1, 1, 2, 0F,-0.4F, -0.5F, 0.5F, 0.21F, 0.5F, 0F, 0.7F, 0.5F, 0F, -1.2F, 0.2F, 0F, 0.3F, 1.1F, -1F, -0.8F, 1.1F, -1F, -0.9F, 1.4F, 0F, 0.4F, 1.4F, 0F); // Box 11
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5.9F, -5F, -0.6F, 1, 5, 1, 0F,-1.2F, -1.2F, -0.8F, 0.5F, -1F, -0.8F, 0.5F, -1.4F, 0.5F, -1.2F, -1.4F, 0.5F, -1.8F, -0.3F, 3F, 1F, -0.3F, 3F, 1F, -0.2F, -3.2F, -1.8F, -0.2F, -3.2F); // Box 12
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5F, -7.8F, -1.1F, 1, 1, 1, 0F,0F, -0.1F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 14
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-5.4F, -7.9F, -1.1F, 1, 1, 1, 0F,0F, -0.2F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.2F, -0.3F, 0.1F, -0.3F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 0
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(4F, -7.8F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Box 1
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(4.4F, -7.9F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.2F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, -0.5F, -0.2F, -0.3F); // Box 2
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-2F, -5.4F, -5.5F, 4, 1, 1, 0F,1F, 0.6F, -0.05F, 1F, 0.6F, -0.05F, 0.9F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.7F, 1F, -0.5F, 0.7F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -6.5F, -4.5F, 6, 2, 1, 0F,0F, 1.7F, 0.6F, 0F, 1.7F, 0.6F, 0F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.7F, 1.2F, 0F, -0.7F, 1.2F, 0F, -0.6F, 1.3F, 0F, -0.6F, 1.3F); // Box 1
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3F, -9.2F, -4.5F, 6, 2, 1, 0F,-0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -1.3F, 1F, -0.2F, -1.3F, 1F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 1F, 1.4F, 0F, 1F, 1.4F); // Box 2
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4.6F, -5.4F, -5.5F, 1, 1, 2, 0F,0.64F, 0.1F, -0.65F, 0.6F, 0.6F, -0.05F, 0.6F, -0.8F, 0F, 0.69F, -0.3F, 0F, 0.7F, -0.4F, 0.4F, 0.6F, -0.5F, 0.7F, 0.6F, -0.1F, 0F, 1.5F, 0.3F, -0.5F); // Box 3
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-6.5F, -4.6F, -3.5F, 1, 1, 4, 0F,-0.4F, -0.5F, 0.5F, 0.21F, 0.5F, 0F, 0.7F, 0.5F, 0F, -1.2F, 0.2F, 0F, 0.3F, 1.1F, -1F, -0.8F, 1.1F, -1F, -0.9F, 1.4F, -0.5F, 0.4F, 1.4F, -0.5F); // Box 4
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4.6F, -6.5F, -4.5F, 1, 2, 6, 0F,0.6F, 1.2F, 0.3F, 0.6F, 1.7F, 0.6F, 0.6F, -0.3F, -0.6F, 1F, 0.2F, -1.2F, 0.65F, -0.2F, 0.5F, 0.6F, -0.7F, 1.2F, 0.6F, 0.4F, -0.2F, 1.1F, 0.5F, -1.2F); // Box 5
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4.6F, -9.2F, -4.5F, 1, 2, 5, 0F,0.1F, -0.1F, -0.8F, 0.8F, 0.1F, 0F, 0.8F, -0.4F, -1.5F, 0.3F, -0.4F, -1.5F, 0.6F, -0.5F, 0.3F, 0.6F, -1F, 0.6F, 0.6F, 1F, -0.6F, 1F, 0.3F, -1.2F); // Box 7
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4.6F, -10.4F, -4.5F, 1, 1, 5, 0F,-0.6F, -0.6F, -2.6F, 1.6F, 0.3F, -2.3F, 2F, 0.7F, 0F, -0.8F, -0.2F, 0F, 0.1F, 0.3F, -0.8F, 0.8F, 0.1F, 0F, 0.8F, 1.5F, 0F, 0.3F, 1F, 0F); // Box 8
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-3F, -10.4F, -4.5F, 6, 1, 5, 0F,-1F, 0.3F, -2.3F, -1F, 0.3F, -2.3F, -1.4F, 0.7F, 0F, -1.4F, 0.7F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 1.5F, 0F, -0.2F, 1.5F, 0F); // Box 9
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5F, -8.5F, -1.5F, 1, 1, 2, 0F,-0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.15F, 0.3F, 0F, -0.15F); // Box 10
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.1F, -6F, 0F, 1, 1, 5, 0F,0.8F, 0F, 0.3F, 0.6F, 0F, 0.6F, 1.2F, -0.6F, 0.6F, 0.6F, -0.5F, -0.7F, 0.85F, 0F, 0.5F, 0.6F, 0F, 1.2F, 1.2F, 0.7F, 0.5F, 0.7F, 0.6F, -0.8F); // Box 11
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-3F, -5.4F, 4.6F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 12
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(3.6F, -6.5F, -4.5F, 1, 2, 6, 0F,0.6F, 1.7F, 0.6F, 0.6F, 1.2F, 0.3F, 1F, 0.2F, -1.2F, 0.6F, -0.3F, -0.6F, 0.6F, -0.7F, 1.2F, 0.65F, -0.2F, 0.5F, 1.1F, 0.5F, -1.2F, 0.6F, 0.4F, -0.2F); // Box 13
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(3.6F, -9.2F, -4.5F, 1, 2, 5, 0F,0.8F, 0.1F, 0F, 0.1F, -0.1F, -0.8F, 0.3F, -0.4F, -1.5F, 0.8F, -0.4F, -1.5F, 0.6F, -1F, 0.6F, 0.6F, -0.5F, 0.3F, 1F, 0.3F, -1.2F, 0.6F, 1F, -0.6F); // Box 14
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(4F, -8.5F, -1.5F, 1, 1, 2, 0F,0F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 15
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(3.6F, -10.4F, -4.5F, 1, 1, 5, 0F,1.6F, 0.3F, -2.3F, -0.6F, -0.6F, -2.6F, -0.8F, -0.1F, 0F, 2F, 0.7F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.3F, -0.8F, 0.3F, 1F, 0F, 0.8F, 1.5F, 0F); // Box 16
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(4.1F, -6F, 0F, 1, 1, 5, 0F,0.6F, 0F, 0.6F, 0.8F, 0F, 0.3F, 0.6F, -0.5F, -0.7F, 1.2F, -0.6F, 0.6F, 0.6F, 0F, 1.2F, 0.85F, 0F, 0.5F, 0.7F, 0.6F, -0.8F, 1.2F, 0.7F, 0.5F); // Box 18
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(3.6F, -5.4F, -5.5F, 1, 1, 2, 0F,0.6F, 0.6F, -0.05F, 0.64F, 0.1F, -0.65F, 0.69F, -0.3F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.5F, 0.7F, 0.7F, -0.4F, 0.4F, 1.5F, 0.3F, -0.5F, 0.6F, -0.1F, 0F); // Box 19
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(5.5F, -4.6F, -3.5F, 1, 1, 4, 0F,0.21F, 0.5F, 0F, -0.4F, -0.5F, 0.5F, -1.2F, 0.2F, 0F, 0.7F, 0.5F, 0F, -0.8F, 1.1F, -1F, 0.3F, 1.1F, -1F, 0.4F, 1.4F, -0.5F, -0.9F, 1.4F, -0.5F); // Box 0
		headModel[50].setRotationPoint(0F, 0F, 0F);
	}
}