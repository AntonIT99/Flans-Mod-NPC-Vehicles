//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanAssaultChest
// Model Creator: 
// Created on: 28.02.2016 - 16:11:42
// Last changed on: 28.02.2016 - 16:11:42

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanPanzerbluse extends ModelCustomArmour //Same as Filename
{
	int textureX = 4096;
	int textureY = 2048;

	public ModelGermanPanzerbluse() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyModel[0] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 1240, 350, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 88, 80, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 94, 154, textureX, textureY); // Box 54
		bodyModel[4] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // Box 55
		bodyModel[5] = new ModelRendererTurbo(this, 70, 121, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 48, 121, textureX, textureY); // Box 57
		bodyModel[7] = new ModelRendererTurbo(this, 48, 121, textureX, textureY); // Box 58
		bodyModel[8] = new ModelRendererTurbo(this, 69, 153, textureX, textureY); // Box 62
		bodyModel[9] = new ModelRendererTurbo(this, 69, 153, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 69, 153, textureX, textureY); // Box 64
		bodyModel[11] = new ModelRendererTurbo(this, 69, 153, textureX, textureY); // Box 65
		bodyModel[12] = new ModelRendererTurbo(this, 1, 148, textureX, textureY); // Box 66
		bodyModel[13] = new ModelRendererTurbo(this, 69, 153, textureX, textureY); // Box 67
		bodyModel[14] = new ModelRendererTurbo(this, 75, 24, textureX, textureY); // Box 68
		bodyModel[15] = new ModelRendererTurbo(this, 40, 152, textureX, textureY); // Box 69
		bodyModel[16] = new ModelRendererTurbo(this, 40, 152, textureX, textureY); // Box 70
		bodyModel[17] = new ModelRendererTurbo(this, 64, 600, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 64, 900, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 112, 80, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 112, 80, textureX, textureY); // Box 29

		bodyModel[0].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F, 0.1F, 0.0F, 0.3F, -6.9F, 0.0F, 0.3F, -6.9F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.3F, -6.9F, -6.7F, 0.3F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.8F, 3.5F, -2.15F, 800, 800, 10, 0F, -0.2F, -0.5F, 0F, -797.5F, -0.5F, 0F, -797.5F, -0.25F, -9F, 0F, -0.25F, -9F, -0.2F, -798.5F, 0F, -797.5F, -798.5F, 0F, -797.5F, -798.5F, -9F, 0F, -798.5F, -9F); // Box 52
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 0F, -2F, 9, 27, 1, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 53
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 0F, 1F, 16, 27, 1, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 54
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -2F, 16, 34, 4, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 55
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2.5F, 0F, -2F, 9, 27, 1, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 56
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 0F, -2F, 8, 27, 1, 0F, 1F, 0.1F, 0.1F, -6.5F, -3F, 0.1F, -6.5F, -3F, 0.1F, 1F, 0.1F, 0.1F, 1F, -24F, 0.1F, -6.5F, -24F, 0.1F, -6.5F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 57
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, -2F, 8, 27, 1, 0F, 0F, -3F, 0.1F, -5.5F, 0.1F, 0.1F, -5.5F, 0.1F, 0.1F, 0.0F, -3F, 0.1F, 0.0F, -24F, 0.1F, -5.5F, -24F, 0.1F, -5.5F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 58
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 0F, -2.2F, 8, 26, 1, 0F, 0F, 0.1F, 0.1F, -6.3F, -2F, 0.1F, -6.3F, -2F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, -23.5F, 0.1F, -6.3F, -24F, 0.1F, -6.3F, -24F, 0.1F, 0.5F, -23.5F, 0.1F); // Box 62
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5.5F, 0F, -2.5F, 8, 26, 1, 0F, -6.25F, -2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -6.25F, -2F, 0.1F, -6.25F, -24F, 0.1F, 0.5F, -23.5F, 0.1F, 0.5F, -23.5F, 0.1F, -6.25F, -24F, 0.1F); // Box 63
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.88F, 2F, -2.2F, 8, 26, 1, 0F, 0F, 0.1F, 0.1F, -5.3F, -3F, 0.1F, -5.3F, -3F, 0.1F, 0F, 0.1F, 0.1F, 1.5F, -24.5F, 0.1F, -5.3F, -23F, 0.1F, -5.3F, -23F, 0.1F, 1.5F, -24.5F, 0.1F); // Box 64
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-7.12F, 2F, -2.5F, 8, 26, 1, 0F, -5.3F, -3F, 0.1F, -0.05F, 0.1F, 0.1F, -0.05F, 0.1F, 0.1F, -5.3F, -3F, 0.1F, -5.3F, -23F, 0.1F, 1.5F, -24.5F, 0.1F, 1.5F, -24.5F, 0.1F, -5.3F, -23F, 0.1F); // Box 65
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, 5F, -2.3F, 13, 32, 4, 0F, 0.3F, 0F, 0.1F, -7.0F, 0F, 0.1F, -7.0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, -24F, 0.1F, -7F, -24F, 0.1F, -7F, -24F, 0.1F, 0.3F, -24F, 0.1F); // Box 66
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-7.12F, 2F, -2.3F, 8, 26, 1, 0F, -5.32F, -3F, 0.1F, 1.65F, 2.1F, 0.1F, 1.65F, 2.1F, 0.1F, -5.32F, -3F, 0.1F, -11.62F, -23F, 0.1F, 3.62F, -28.1F, 0.1F, 3.62F, -28.1F, 0.1F, -11.62F, -23F, 0.1F); // Box 67
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.75F, -2.2F, -3.1F, 6, 6, 1, 0F, -5F, -6.46F, -0.4F, -0.8F, -5.8F, -0.4F, -0.8F, -5.8F, -0.4F, -5F, -6.46F, -0.4F, -5.45F, 0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -5.45F, 0.3F, -0.4F); // Box 68
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, 0F, -2F, 9, 26, 4, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 69
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.5F, 0F, -2F, 9, 26, 4, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Box 70
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-484.1F, 1.1F, -4.85F, 480, 260, 6, 0F, -482.2F, 0.2F, -2.5F, 2.2F, -1F, -2.5F, 2.2F, -1F, -2.5F, -482.2F, 0.2F, -2.5F, -481.5F, -260.05F, -2.5F, 1.5F, -258.85F, -2.5F, 1.5F, -258.85F, -2.5F, -481.5F, -260.05F, -2.5F); // Box 25
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(4.1F, 1.1F, -5.15F, 480, 260, 6, 0F, 2.2F, -1F, -2.5F, -482.2F, 0.2F, -2.5F, -482.2F, 0.2F, -2.5F, 2.2F, -1F, -2.5F, 1.5F, -258.85F, -2.5F, -481.5F, -260.05F, -2.5F, -481.5F, -260.05F, -2.5F, 1.5F, -258.85F, -2.5F); // Box 26
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2.51F, 0F, -2.19F, 8, 26, 1, 0F, 0.1F, 0.1F, 0.1F, -6.3F, -2F, 0.1F, -6.3F, -2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.6F, -23.4F, 0.1F, -6.3F, -23.95F, 0.1F, -6.3F, -23.95F, 0.1F, 0.6F, -23.4F, 0.1F); // Box 27
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5.51F, 0F, -2.49F, 8, 26, 1, 0F, -6.3F, -2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -6.3F, -2F, 0.1F, -6.3F, -23.95F, 0.1F, 0.6F, -23.4F, 0.1F, 0.6F, -23.4F, 0.1F, -6.3F, -23.95F, 0.1F); // Box 29
		bodyModel[20].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 1220, 70, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 900, 30, textureX, textureY); // Import 
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		leftArmModel[3] = new ModelRendererTurbo(this, 300, 420, textureX, textureY); // Box 57
		leftArmModel[4] = new ModelRendererTurbo(this, 2150, 420, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(-1F, 5.8F, -2F, 160, 40, 160, 0F, 0.3F, 0.0F, 0.3F, -155.7F, 0.0F, 0.3F, -155.7F, 0.0F, -155.7F, 0.3F, 0.0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.4F, 0.0F, 0.15F, -77.9F, 0.0F, 0.15F, -77.9F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import 
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.3F, 1.5F, -18.25F, 10, 800, 800, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, -781F, 0F, -0.25F, -781F, 0F, -798.5F, -17.5F, -9F, -798.5F, -17.5F, -9F, -798.5F, -781F, 0F, -798.5F, -781F); // Box 57
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-6.7F, -0.4F, -18.75F, 10, 800, 800, 0F, -9F, -0.25F, -17.5F, 0F, -0.25F, -17.5F, 0F, -0.25F, -780F, -9F, -0.25F, -780F, -9F, -798.5F, -17.5F, 0F, -798.5F, -17.5F, 0F, -798.5F, -780F, -9F, -798.5F, -780F); // Box 52
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import 
		rightArmModel[2] = new ModelRendererTurbo(this, 650, 30, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5.8F, -2F, 160, 40, 160, 0F, 0.3F, 0F, 0.3F, -155.7F, 0F, 0.3F, -155.7F, 0F, -155.7F, 0.3F, 0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.1F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.1F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


	}
}