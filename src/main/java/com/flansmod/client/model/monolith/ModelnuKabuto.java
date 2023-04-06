//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: nuKabuto
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelnuKabuto extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelnuKabuto() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];

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
		headModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 44
		headModel[7] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 45
		headModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 46
		headModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 47
		headModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
		headModel[11] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 49
		headModel[12] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 50
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 52
		headModel[14] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 53
		headModel[15] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
		headModel[16] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 55
		headModel[17] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 56
		headModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 57
		headModel[19] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 58
		headModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 21
		headModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 22
		headModel[23] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 23
		headModel[24] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 24
		headModel[25] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 25
		headModel[26] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 27
		headModel[27] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		headModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		headModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 32

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.5F, 4.7F, 8, 2, 1, 0F,0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F); // Box 43
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4.5F, 5.1F, 8, 2, 1, 0F,1.3F, -0.2F, 0F, 1.3F, -0.2F, 0F, 1.3F, -0.2F, -0.6F, 1.3F, -0.2F, -0.6F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F); // Box 44
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -3.5F, 5.5F, 8, 2, 1, 0F,1.7F, -0.2F, 0F, 1.7F, -0.2F, 0F, 1.7F, -0.2F, -0.6F, 1.7F, -0.2F, -0.6F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F); // Box 45
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -2.2F, 5.9F, 8, 2, 1, 0F,2.1F, -0.2F, 0F, 2.1F, -0.2F, 0F, 2.1F, -0.2F, -0.6F, 2.1F, -0.2F, -0.6F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F); // Box 46
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.5F, -5.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 47
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.9F, -4.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.4F, -0.6F, -0.2F, 0.4F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F); // Box 48
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6.3F, -3.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.8F, -0.6F, -0.2F, 0.8F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.8F, -0.3F, -0.2F, 0.8F); // Box 49
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-6.7F, -2.3F, -4F, 1, 2, 10, 0F,-0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0.1F, -0.6F, -0.2F, 0.1F, -0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 50
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.5F, -5.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 52
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.9F, -4.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F); // Box 53
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(5.3F, -3.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.8F, -0.3F, -0.2F, 0.8F); // Box 54
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(5.7F, -2.3F, -4F, 1, 2, 10, 0F,0F, -0.2F, 0.1F, -0.6F, -0.2F, 0.1F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F); // Box 55
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -5.5F, -5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.3F, 0F, 0.1F, 2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0F, -5.5F, -5F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 2.5F, 0.5F, 0F, 1.3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, -1F, 0.1F, -0.3F, -1F); // Box 58
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5F, -6.2F, -5.2F, 1, 2, 1, 0F,0.3F, 0F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 20
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4F, -6.2F, -5.2F, 1, 2, 1, 0F,-0.2F, 0.3F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.2F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 21
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3F, -0.2F, -3.5F, 6, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F); // Box 22
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3F, 0.8F, -3.7F, 6, 1, 1, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F); // Box 23
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-3F, 1.8F, -3.9F, 3, 1, 1, 0F,0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.5F, 0.3F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0.5F, 0.3F, -0.3F); // Box 24
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(0F, 1.8F, -3.9F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0.5F, 0.3F, -0.3F, 0.5F, 0.3F, -0.3F, 0F, 0.6F, -0.3F); // Box 25
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-2F, -6.5F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, -0.8F, 0F, 0F); // Box 27
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-2F, -10.5F, -6F, 2, 4, 1, 0F,0.5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(0F, -10.5F, -6F, 2, 4, 1, 0F,-2F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(0F, -6.5F, -6F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.3F, 0F); // Box 32
		headModel[29].setRotationPoint(0F, 0F, 0F);
	}
}