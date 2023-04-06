//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingguangHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMingguangHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[34];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 43
		headModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 47
		headModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 52
		headModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 58
		headModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		headModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 25
		headModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		headModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		headModel[13] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 1
		headModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 2
		headModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		headModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		headModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 5
		headModel[18] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		headModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		headModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		headModel[21] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 9
		headModel[22] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 10
		headModel[23] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 11
		headModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 12
		headModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 13
		headModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 14
		headModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 16
		headModel[28] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 17
		headModel[29] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 36
		headModel[30] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 37
		headModel[31] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 38
		headModel[32] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 21
		headModel[33] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 22

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 4, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.8F, -4F, 8, 2, 8, 0F,-2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,0.7F, -0.89F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, 0F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, -0.5F, 0.8F, 0.7F, -0.9F, 0.8F, 0.7F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.4F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.5F, 4.7F, 8, 3, 1, 0F,0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F); // Box 43
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5.5F, -5.5F, -4F, 1, 3, 9, 0F,-0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F); // Box 47
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.5F, -5.5F, -4F, 1, 3, 9, 0F,0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F); // Box 52
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.1F, -0.4F, 0.7F, 0.1F, -0.4F, 0.7F, 0.1F, -0.4F, -1.3F, 0.1F, -0.4F, -1.3F); // Box 58
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -4.5F, -5.5F, 1, 4, 1, 0F,-1F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -1.6F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 24
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(5F, -4.5F, -6.2F, 2, 4, 1, 0F,-0.6F, -0.2F, -0.6F, -0.9F, 0.2F, -1F, -0.6F, 0.2F, 0.7F, 0F, -0.2F, -0.3F, -1.2F, -0.2F, -0.6F, -0.3F, -0.6F, -1F, 0F, -0.6F, 0.7F, -0.6F, -0.2F, -0.3F); // Box 25
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(7F, -4.9F, -4.5F, 1, 4, 1, 0F,1F, -0.2F, 0.5F, -1.6F, -0.2F, 0.5F, 0.4F, 0.8F, 0F, -1F, 0.8F, 0F, 0.4F, -0.2F, 0.5F, -1F, -0.2F, 0.5F, 1F, -1.2F, 0F, -1.6F, -1.2F, 0F); // Box 26
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-2F, -0.5F, -4.1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -2.5F, 5F, 8, 1, 1, 0F,0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -1.3F, 0.9F, -0.2F, -1.3F, 0.9F, -0.2F, 0.7F, 0.9F, -0.2F, 0.7F); // Box 1
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5.5F, -2.5F, 7F, 11, 1, 1, 0F,0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0.7F, 0.9F, -0.2F, 0.7F, 0.9F, -0.2F, -1.3F, 0.9F, -0.2F, -1.3F); // Box 2
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-7F, -6.5F, 7.3F, 14, 4, 1, 0F,0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F, 0.9F, 0.3F, -0.3F); // Box 3
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.8F, -2.4F, -1.9F, 1, 1, 6, 0F,0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F); // Box 4
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(6.8F, -2.4F, -1.9F, 1, 1, 8, 0F,-0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F); // Box 5
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, -4.5F, -5.5F, 1, 4, 1, 0F,0.4F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 1F, -0.2F, 0F, -1.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-7F, -4.5F, -6.2F, 2, 4, 1, 0F,-0.9F, 0.2F, -1F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.3F, -0.6F, 0.2F, 0.7F, -0.3F, -0.6F, -1F, -1.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.3F, 0F, -0.6F, 0.7F); // Box 7
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-8F, -4.9F, -4.5F, 1, 4, 1, 0F,-1.6F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, -1F, 0.8F, 0F, 0.4F, 0.8F, 0F, -1F, -0.2F, 0.5F, 0.4F, -0.2F, 0.5F, -1.6F, -1.2F, 0F, 1F, -1.2F, 0F); // Box 8
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(7.2F, -6.5F, -2F, 1, 4, 9, 0F,-0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F); // Box 9
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-8.2F, -6.5F, -2F, 1, 4, 9, 0F,0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.9F); // Box 10
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-5.8F, -2.4F, -1.9F, 1, 1, 6, 0F,-0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F); // Box 11
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-7.8F, -2.4F, -1.9F, 1, 1, 8, 0F,0F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, -0.6F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, 0.7F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F); // Box 12
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5.5F, -2.5F, 5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -1.3F, 0.9F, -0.2F, 0.7F, 0.9F, -0.2F, 0.7F); // Box 13
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(4.5F, -2.5F, 5F, 1, 1, 1, 0F,0.9F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -1.3F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, 0.7F, 0.9F, -0.2F, 0.7F); // Box 14
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-7.9F, -2.5F, 7F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, -0.9F, -0.1F, -0.9F); // Box 16
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(5.9F, -2.5F, 7F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -0.9F, -0.1F, -0.9F, 0F, -0.1F, -0.9F); // Box 17
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-1.5F, -7.65F, -4.7F, 3, 1, 1, 0F,-1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F); // Box 36
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-1.5F, -7F, -4.7F, 3, 1, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 37
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-1.5F, -6.35F, -4.7F, 3, 1, 1, 0F,-0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F); // Box 38
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-1.5F, -8.5F, -4.35F, 3, 1, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 21
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-1.5F, -10.4F, -3.1F, 3, 1, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.1F, 1.25F, -0.4F, 1.1F, 1.25F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F); // Box 22
		headModel[33].setRotationPoint(0F, 0F, 0F);
	}
}