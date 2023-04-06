//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingKuyakHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingKuyakHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMingKuyakHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[27];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 50
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 136
		headModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 256
		headModel[5] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 29
		headModel[6] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 54
		headModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box43
		headModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box44
		headModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box47
		headModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box48
		headModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box57
		headModel[12] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import Box58
		headModel[13] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 79
		headModel[14] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 80
		headModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 81
		headModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 82
		headModel[17] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box62
		headModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		headModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 39
		headModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 91
		headModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 47
		headModel[22] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		headModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		headModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 50
		headModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 51
		headModel[26] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 52

		headModel[0].addShapeBox(-4F, -7.5F, -4F, 8, 3, 8, 0F,0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F, 0.9F, -1F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.3F, -4F, 8, 1, 8, 0F,-1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, -1.8F, 1.4F, -1.8F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -15.8F, -0.5F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 50
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6F, -4F, 8, 2, 1, 0F,0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.5F, 0.9F, 0.7F, -0.3F, -0.1F, 0.7F, -0.3F, -0.1F); // Box 136
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5.5F, -8F, 4, 1, 3, 0F,-1.5F, -0.4F, -1.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 256
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -5.5F, -8F, 4, 1, 3, 0F,0F, -0.4F, -0.5F, -1F, -0.4F, -1.2F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -16.8F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 54
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -6F, 4.7F, 16, 8, 1, 0F,0.9F, -0.2F, 0F, -7.1F, -0.2F, 0F, -7.1F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 1.3F, -4.2F, -0.3F, -6.7F, -4.2F, -0.3F, -6.7F, -4.2F, -0.3F, 1.3F, -4.2F, -0.3F); // Import Box43
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-6F, -2.4F, 5F, 24, 6, 1, 0F,-0.7F, -0.2F, 0F, -12.7F, -0.2F, 0F, -12.7F, -0.2F, -0.6F, -0.7F, -0.2F, -0.6F, 0.5F, -2.5F, -0.9F, -11.5F, -2.5F, -0.9F, -11.5F, -2.5F, 0.3F, 0.5F, -2.5F, 0.3F); // Import Box44
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.5F, -6F, 1F, 1, 8, 8, 0F,-0.5F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -4F, -0.6F, -0.2F, -4F, 0F, -4.2F, 0.5F, -0.6F, -4.2F, 0.5F, -0.6F, -4.2F, -4F, 0F, -4.2F, -4F); // Import Box47
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-6.1F, -2.4F, 2F, 1, 6, 6, 0F,-0.6F, -0.2F, 1.5F, 0F, -0.2F, 1.5F, 0F, -0.2F, -3F, -0.6F, -0.2F, -3F, 0.5F, -4F, 0.9F, -1.1F, -4F, 0.9F, -1.4F, -2.5F, -2F, 0.8F, -2.5F, -2F); // Import Box48
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.5F, -6F, -5F, 1, 8, 8, 0F,-0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -2F, -0.7F, -0.2F, -2F, -0.6F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, -4.5F, -3.5F, -0.6F, -4.5F, -3.5F); // Import Box57
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5.5F, -2F, -5F, 1, 4, 8, 0F,-0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -3.5F, -0.6F, 0.5F, -3.5F, -1.1F, -1.2F, 0F, 0.5F, -1.2F, 0F, 0.2F, -2.4F, -4.5F, -0.8F, -2.4F, -4.5F); // Import Box58
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2F, -11.8F, -2F, 4, 1, 4, 0F,-1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 79
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -12.8F, -1F, 2, 1, 2, 0F,-0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F); // Box 80
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -15.3F, 0F, 1, 3, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2.9F, 0F, -0.4F, -2.9F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 81
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -6.1F, -4.5F, 9, 1, 9, 0F,0.6F, -0.1F, 0.6F, 0.6F, -0.1F, 0.6F, 0.6F, -0.1F, 0.8F, 0.6F, -0.1F, 0.8F, 0.6F, -0.1F, 0.6F, 0.6F, -0.1F, 0.6F, 0.6F, -0.1F, 0.8F, 0.6F, -0.1F, 0.8F); // Box 82
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -16.5F, -0.5F, 1, 2, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.8F, 0.6F, 0.2F, -0.8F, 0.6F); // Import Box62
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0F, 0.8F, 0F, 0F); // Box 38
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0.5F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -1.2F, 0.5F, 0F); // Box 39
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,0.2F, 0.3F, -4.2F, 0.2F, 0.3F, -4.2F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 91
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -13.5F, -0.5F, 1, 2, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.8F, 0.6F, 0.2F, -0.8F, 0.6F); // Box 47
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-1F, -7.5F, -5F, 2, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(4.5F, -6F, -5F, 1, 8, 8, 0F,0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.7F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -4F, -0.2F, -0.6F, -4F, -0.2F, -0.6F, -4.5F, -3.5F, 0F, -4.5F, -3.5F); // Box 49
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(4.5F, -2F, -5F, 1, 4, 8, 0F,0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0.5F, -1.2F, 0F, -1.1F, -1.2F, 0F, -0.8F, -2.4F, -4.5F, 0.2F, -2.4F, -4.5F); // Box 50
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(4.5F, -6F, 1F, 1, 8, 8, 0F,0F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.6F, -0.2F, -4F, 0F, -0.2F, -4F, -0.6F, -4.2F, 0.5F, 0F, -4.2F, 0.5F, 0F, -4.2F, -4F, -0.6F, -4.2F, -4F); // Box 51
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(5.1F, -2.4F, 2F, 1, 6, 6, 0F,0F, -0.2F, 1.5F, -0.6F, -0.2F, 1.5F, -0.6F, -0.2F, -3F, 0F, -0.2F, -3F, -1.1F, -4F, 0.9F, 0.5F, -4F, 0.9F, 0.8F, -2.5F, -2F, -1.4F, -2.5F, -2F); // Box 52
		headModel[26].setRotationPoint(0F, 0F, 0F);
	}
}