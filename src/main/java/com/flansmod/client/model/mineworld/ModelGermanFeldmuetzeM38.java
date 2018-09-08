//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanAssaultHat
// Model Creator: 
// Created on: 29.02.2016 - 21:46:43
// Last changed on: 29.02.2016 - 21:46:43

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanFeldmuetzeM38 extends ModelCustomArmour //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelGermanFeldmuetzeM38() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];
		headModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 10
		headModel[4] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 14
		headModel[8] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 15
		headModel[9] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 18
		headModel[10] = new ModelRendererTurbo(this, 1809, 2, textureX, textureY); // Box 16
		headModel[11] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Box 17
		headModel[12] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 18
		headModel[13] = new ModelRendererTurbo(this, 1771, 13, textureX, textureY); // Box 19
		headModel[14] = new ModelRendererTurbo(this, 1775, 10, textureX, textureY); // Box 20
		headModel[15] = new ModelRendererTurbo(this, 1775, 10, textureX, textureY); // Box 15
		headModel[16] = new ModelRendererTurbo(this, 97, 867, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -7F, -4F, 16, 2, 16, 0F, 0.1F, 1F, 0.1F, -7.9F, 1F, 0.1F, -7.9F, 1F, -7.9F, 0.1F, 1F, -7.9F, 0.1F, 0.0F, 0.1F, -7.9F, 0.0F, 0.1F, -7.9F, 0.0F, -7.9F, 0.1F, 0.0F, -7.9F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-11.75F, -8.5F, -4.3F, 800, 800, 1, 0F, -10.5F, 0F, 0F, -787F, 0F, 0F, -787F, 0.0F, 0F, -10.5F, 0.0F, 0.0F, -10.5F, -799F, 0.0F, -787F, -799F, 0.0F, -787F, -799F, 0.0F, -10.5F, -799F, 0.0F); // Import 
		headModel[1].setRotationPoint(0F, 0.5F, 0F);

		headModel[2].addShapeBox(-4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8.26F, 3.5F, 8, 3, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Box 10
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, -0.7F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -9.5F, -4F, 8, 1, 4, 0F, -2.9F, -0.3F, 0.2F, -2.9F, -0.3F, 0.2F, -2.9F, -0.5F, 0F, -2.9F, -0.5F, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 14
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -9.75F, 0F, 8, 1, 4, 0F, -2.9F, -0.75F, 0F, -2.9F, -0.75F, 0F, -2.9F, -1.25F, 0.1F, -2.9F, -1.25F, 0.1F, 0.1F, 0.75F, 0F, 0.1F, 0.75F, 0F, 0.1F, 0.75F, 0.1F, 0.1F, 0.75F, 0.1F); // Box 15
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, -6.2F, -4.3F, 30, 30, 1, 0F, -0.2F, -0.2F, 0.0F, -29.2F, -0.2F, 0.0F, -29.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -29.2F, 0.0F, -29.2F, -29.2F, 0.0F, -29.2F, -29.2F, 0.0F, -0.2F, -29.2F, 0.0F); // Box 18
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -7.26F, -4.5F, 8, 2, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F, 0.3F, 0.25F, -0.3F); // Box 16
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -6.65F, -4.3F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.8F, -1.6F, 0F, -0.8F, -1.6F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -1.8F, 0F); // Box 17
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-2F, -6.65F, -4.3F, 2, 2, 1, 0F, -0.8F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.6F, 0F, -1F, -0.4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -1F, -0.4F, 0F); // Box 18
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -7.27F, -4.55F, 8, 1, 1, 0F, 0.35F, -0.5F, -0.3F, 0.35F, -0.5F, -0.3F, 0.35F, -0.5F, -0.45F, 0.35F, -0.5F, -0.45F, 0.35F, -0.4F, -0.3F, 0.35F, -0.4F, -0.3F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F); // Box 19
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4F, -7.27F, -4.3F, 1, 1, 4, 0F, 0.3F, -0.5F, -0.3F, -0.65F, -0.5F, -0.3F, -0.65F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, -0.4F, -0.3F, -0.65F, -0.4F, -0.3F, -0.65F, -1.4F, -0.3F, 0.3F, -1.4F, -0.3F); // Box 20
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.05F, -7.27F, -4.3F, 1, 1, 4, 0F, 0.3F, -0.5F, -0.3F, -0.65F, -0.5F, -0.3F, -0.65F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, -0.4F, -0.3F, -0.65F, -0.4F, -0.3F, -0.65F, -1.4F, -0.3F, 0.3F, -1.4F, -0.3F); // Box 15
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -6.1F, -4.3F, 781, 471, 1, 0F, 0F, 0F, 0.0F, -779F, 0F, 0.0F, -779F, 0F, 0.0F, 0F, 0F, 0.0F, 0F, -470F, 0.0F, -779F, -470F, 0.0F, -779F, -470F, 0.0F, 0F, -470F, 0.0F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);


	}
}