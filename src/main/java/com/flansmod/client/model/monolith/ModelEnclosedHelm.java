//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEnclosedHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelEnclosedHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[38];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 259
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		headModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		headModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 1
		headModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 2
		headModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 3
		headModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		headModel[13] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 7
		headModel[15] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 8
		headModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 9
		headModel[17] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 10
		headModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		headModel[19] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 12
		headModel[20] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		headModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 14
		headModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		headModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 17
		headModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 18
		headModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 21
		headModel[26] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 22
		headModel[27] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 26
		headModel[28] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 27
		headModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		headModel[30] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29
		headModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 30
		headModel[32] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 31
		headModel[33] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 32
		headModel[34] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 33
		headModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 34
		headModel[36] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 35
		headModel[37] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 36

		headModel[0].addShapeBox(-2F, -9F, -4F, 4, 4, 8, 0F,2.1F, 0.5F, 1F, 2.1F, 0.5F, 1F, 2.1F, 0.2F, 1F, 2.1F, 0.2F, 1F, 2F, -0.5F, 0.8F, 2F, -0.5F, 0.8F, 2F, -0.2F, 0.8F, 2F, -0.2F, 0.8F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3F, -5F, -4.05F, 6, 1, 8, 0F,1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, -0.8F, 1F, 1F, -0.8F, 1F, 1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 259
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -5.5F, -4.05F, 4, 1, 8, 0F,2.2F, 0F, 1.1F, 2.2F, 0F, 1.1F, 2.2F, -0.3F, 1.1F, 2.2F, -0.3F, 1.1F, 2.2F, 0F, 1.1F, 2.2F, 0F, 1.1F, 2.2F, 0.4F, 1.1F, 2.2F, 0.4F, 1.1F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -5F, -1F, 10, 5, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, -3F, -0.8F, 0.25F, -3F); // Box 23
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -5F, -4.5F, 1, 2, 3, 0F,-1.16F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.8F, 0F, 0F, -0.8F, -1.16F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -1F, 0F, 0F, -1F); // Box 1
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -3F, -5.5F, 9, 1, 3, 0F,-1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.4F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -5F, -5.3F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F); // Box 4
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -1F, -5.5F, 9, 2, 3, 0F,-1F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, -0.4F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, 1F, -5.5F, 9, 1, 3, 0F,-1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, -2.5F, -0.1F, -0.8F, -2.5F, -0.1F, -0.8F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 1
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -5F, -4.5F, 1, 2, 3, 0F,0.7F, 0F, 0F, -1.16F, 0F, 0F, 0F, 0F, -0.8F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0F, -1.16F, 0F, 0F, 0F, 0F, -1F, 0.7F, 0F, -1F); // Box 2
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -3.5F, -5.35F, 9, 1, 1, 0F,-0.9F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, -0.9F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F); // Box 3
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -3F, -5.3F, 1, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 4
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -2F, -5.3F, 1, 2, 1, 0F,0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F); // Box 5
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -3.61F, -5.3F, 1, 1, 1, 0F,0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F); // Box 6
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 7
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-3.99F, -9F, -4F, 1, 4, 8, 0F,1.3F, 0.5F, 0F, -1.1F, 0.5F, 1F, -1.1F, 0.2F, 1F, 1.3F, 0.2F, 0F, 1F, -0.5F, -0.2F, -1F, -0.5F, 0.8F, -1F, -0.2F, 0.8F, 1F, -0.2F, -0.2F); // Box 8
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-5.3F, -5.5F, -3.05F, 1, 1, 6, 0F,0.1F, 0F, 1.1F, 0.1F, 0F, 2.1F, 0.1F, -0.3F, 2.1F, 0.1F, -0.3F, 1.1F, 0.1F, 0F, 1.1F, 0.1F, 0F, 2.1F, 0.1F, 0.4F, 2.1F, 0.1F, 0.4F, 1.1F); // Box 9
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5F, -5F, -4.05F, 1, 1, 8, 0F,0.3F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.8F, 1F, 0.3F, -0.8F, 0F, 0.3F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, 0F, 1F, 0.3F, 0F, 0F); // Box 10
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4F, -5F, -4.05F, 1, 1, 8, 0F,0F, -0.4F, 1F, 0.3F, -0.4F, 0F, 0.3F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, -0.4F, 1F, 0.3F, -0.4F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1F); // Box 11
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.3F, -5.5F, -3.05F, 1, 1, 6, 0F,0.1F, 0F, 2.1F, 0.1F, 0F, 1.1F, 0.1F, -0.3F, 1.1F, 0.1F, -0.3F, 2.1F, 0.1F, 0F, 2.1F, 0.1F, 0F, 1.1F, 0.1F, 0.4F, 1.1F, 0.1F, 0.4F, 2.1F); // Box 12
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.01F, -9F, -4F, 1, 4, 8, 0F,-1.1F, 0.5F, 1F, 1.3F, 0.5F, 0F, 1.3F, 0.2F, 0F, -1.1F, 0.2F, 1F, -1F, -0.5F, 0.8F, 1F, -0.5F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, 0.8F); // Box 13
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-2.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-2.4F, -0.9F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-1.4F, -0.9F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1.4F, -0.1F, -5.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0.4F, -0.1F, -5.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(1.4F, -0.9F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 26
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(0.4F, -0.9F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 27
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(0.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 28
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(1.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 29
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(2.4F, -1.7F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 30
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-1.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 31
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-2.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 32
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 33
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(0.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 34
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(1.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 35
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(2.4F, -2.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 36
		headModel[37].setRotationPoint(0F, 0F, 0F);
	}
}