//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.12.2019 - 14:49:51
// Last changed on: 17.12.2019 - 14:49:51

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelkoreanpeasantarmorhat extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelkoreanpeasantarmorhat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[12];
		headModel[0] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26
		headModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 27
		headModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
		headModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		headModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 30

		headModel[0].addShapeBox(-4F, -11F, -4F, 8, 3, 8, 0F, -0.9F, -0.6F, -1.5F, -0.9F, -0.6F, -1.5F, -0.9F, -0.7F, -1.25F, -0.9F, -0.7F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-6F, -8F, -6F, 12, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -12.1000000000001F, 0.5F, 1, 1, 3, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -11.4000000000001F, -0.5F, 1, 1, 1, 0F, 0.3F, 0.5F, -0.7F, 0.3F, 0.5F, -0.7F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-7F, -8F, -6F, 1, 2, 12, 0F, -0.4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -1.5F, 0F, -0.6F, -1.5F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.5F); // Box 26
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(6F, -8F, -6F, 1, 2, 12, 0F, 0F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -1.5F, 0F, -0.7F, -1.5F, 0F, -0.7F, 0F); // Box 27
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6F, -8F, -7F, 12, 2, 1, 0F, -1.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, 0F, -1.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, 0F); // Box 28
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -8F, 6F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, -1.5F, -0.7F, 0F, -1.5F, -0.6F, 0F); // Box 29
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -11.4000000000001F, 3.5F, 1, 1, 1, 0F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.7F, -1F, 0.3F, 0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[8].setRotationPoint(0F, 0F, 0F);
		
		
		
		headModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		headModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12
		headModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16

		headModel[9].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.5F, -5.5F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1F, -0.6F, -0.55F, -1F, -0.2F, -0.55F, -1F, -0.2F, 0.25F, 1F, -0.6F, 0.25F); // Box 12
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -5.5F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, -0.2F, -0.55F, 1F, -0.6F, -0.55F, 1F, -0.6F, 0.25F, -1F, -0.2F, 0.25F); // Box 16
		headModel[11].setRotationPoint(0F, 0F, 0F);


	//	bodyModel = new ModelRendererTurbo[3];
	//	bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
	//	bodyModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12
	//	bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16

	//	bodyModel[0].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 15
	//	bodyModel[0].setRotationPoint(0F, 0F, 0F);

	//	bodyModel[1].addShapeBox(-1.5F, -5.5F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1F, -0.6F, -0.55F, -1F, -0.2F, -0.55F, -1F, -0.2F, 0.25F, 1F, -0.6F, 0.25F); // Box 12
	//	bodyModel[1].setRotationPoint(0F, 0F, 0F);

	//	bodyModel[2].addShapeBox(-0.5F, -5.5F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, -0.2F, -0.55F, 1F, -0.6F, -0.55F, 1F, -0.6F, 0.25F, -1F, -0.2F, 0.25F); // Box 16
//		bodyModel[2].setRotationPoint(0F, 0F, 0F);


	}
}