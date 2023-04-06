//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChapelFer
// Model Creator: 
// Created on: 01.05.2022 - 15:38:29
// Last changed on: 01.05.2022 - 15:38:29

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChapelFer extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelChapelFer() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		headModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		headModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		headModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		headModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		headModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		headModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		headModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		headModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		headModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		headModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		headModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		headModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		headModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		headModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		headModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		headModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		headModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		headModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		headModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		headModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		headModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		headModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66

		headModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0.25F, 0F, 0.25F); // Box 68
		headModel[0].setRotationPoint(-4F, -8F, -4F);

		headModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.75F, 0.25F, 0F, 0.5F); // Box 69
		headModel[1].setRotationPoint(-4F, -9F, -4.25F);

		headModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-0.75F, -0.5F, -1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.25F, -0.75F, -0.5F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F); // Box 70
		headModel[2].setRotationPoint(-4F, -10F, -4.25F);

		headModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-1.25F, -1F, -2.25F, 0F, -0.25F, -2F, 0F, -0.25F, -1.5F, -1.25F, -1F, -1.5F, -0.75F, 0.5F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, -0.75F, 0.5F, -0.5F); // Box 71
		headModel[3].setRotationPoint(-4F, -11F, -4.25F);

		headModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, -0.25F, 0.75F); // Box 73
		headModel[4].setRotationPoint(0F, -9F, -4.25F);

		headModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0.25F, -0.75F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F); // Box 74
		headModel[5].setRotationPoint(0F, -10F, -4.25F);

		headModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.25F, -2F, -1.25F, -1F, -2.25F, -1.25F, -1F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.75F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 75
		headModel[6].setRotationPoint(0F, -11F, -4.25F);

		headModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.25F, -3.75F, -1.75F, -1F, -4F, -1.75F, -1F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, -2F, -1.25F, 0.5F, -2.25F, -1.25F, 0.5F, -1.5F, 0F, -0.25F, -1.5F); // Box 76
		headModel[7].setRotationPoint(0F, -11.5F, -4.25F);

		headModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-1.75F, -1F, -4F, 0F, -0.25F, -3.75F, 0F, -0.25F, -3F, -1.75F, -1F, -3F, -1.25F, 0.5F, -2.25F, 0F, -0.25F, -2F, 0F, -0.25F, -1.5F, -1.25F, 0.5F, -1.5F); // Box 77
		headModel[8].setRotationPoint(-4F, -11.5F, -4.25F);

		headModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, -1F, 3.25F, 0.5F, -0.75F, 3.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 3.25F, -1F, 0F, 3.25F, -0.75F, 0.25F, 0F, 0F, 0F); // Box 52
		headModel[9].setRotationPoint(-4.25F, -7.75F, -5.25F);

		headModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, -2.5F, -1.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, -2.75F, 0F, 0.5F, 1.75F, -1.5F, 0F, 1.25F, -0.5F, 0F, 0F, 0F, 1.25F, 2F, 0F); // Box 53
		headModel[10].setRotationPoint(-5.25F, -4.75F, -7.25F);

		headModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, -3.25F, -1F, 0.25F, -2.25F, 0F, 0.25F, -0.75F, -0.25F, 1F, -1.75F, 0F, 1F, 2.5F, -1F, 0.25F, 1.5F, 0F, 0.25F, 0.25F, 0F, 1F, 1.25F, 0F); // Box 54
		headModel[11].setRotationPoint(-3.25F, -6F, -7.75F);

		headModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 1F); // Box 56
		headModel[12].setRotationPoint(0F, -8F, -4F);

		headModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,3.25F, 0.5F, -0.75F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 3.25F, 0.25F, 0F, 3.25F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 3.25F, -0.75F, 0.25F); // Box 57
		headModel[13].setRotationPoint(3.25F, -7.75F, -5.25F);

		headModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.25F, -2.25F, 0F, 1F, -3.25F, -1F, 1F, -1.75F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, 1.5F, 0F, 1F, 2.5F, -1F, 1F, 1.25F, 0F, 0.25F, 0.25F, 0F); // Box 58
		headModel[14].setRotationPoint(0.25F, -6F, -7.75F);

		headModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, -0.5F, 0.5F, -2.5F, -1.5F, 1.25F, -2.75F, 0F, 0F, -0.5F, -0.5F, 0F, 1.25F, -0.5F, 0.5F, 1.75F, -1.5F, 1.25F, 2F, 0F, 0F, 0F, 0F); // Box 59
		headModel[15].setRotationPoint(4.25F, -4.75F, -7.25F);

		headModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, 1.25F, -2.75F, 0F, 1.75F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1.25F, 2F, 0F, 1.75F, 2.25F, 0F, 0F, 0F, 0F); // Box 60
		headModel[16].setRotationPoint(4.25F, -4.75F, -4.25F);

		headModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0.5F, 1.75F, -3F, 0.5F, 1.75F, -3F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 1.75F, 2.25F, 0.5F, 1.75F, 2.25F, 0F, 0F, 0F, 0F); // Box 61
		headModel[17].setRotationPoint(4.25F, -4.75F, -0.75F);

		headModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 1.75F, -3F, 0F, 1.25F, -3F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 1.75F, 2.25F, 0F, 1.25F, 2.25F, 0F, 0F, 0F, 0F); // Box 62
		headModel[18].setRotationPoint(4.25F, -4.75F, 1.25F);

		headModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 3.25F, 0.25F, 0F, 3.25F, 0.5F, -0.75F, 0F, 0.25F, -1F, 0F, 0F, 0F, 3.25F, -0.75F, 0.25F, 3.25F, -1F, 0F, 0F, -0.25F, -0.5F); // Box 65
		headModel[19].setRotationPoint(-4.25F, -7.75F, 4.25F);

		headModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,3.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 3.25F, 0.5F, -0.75F, 3.25F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 3.25F, -1F, 0F); // Box 67
		headModel[20].setRotationPoint(3.25F, -7.75F, 4.25F);

		headModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.25F, -0.75F, -0.25F, 1F, -1.75F, 0F, 1F, -4F, -0.5F, 0.25F, -4F, 0.5F, 0.25F, 0.25F, 0F, 1F, 1.25F, 0F, 1F, 3.25F, -0.5F, 0.25F, 3.25F, 0.5F); // Box 68
		headModel[21].setRotationPoint(0.25F, -5.75F, 4.75F);

		headModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, 1.25F, -3F, 0F, 0.5F, -3F, -1.5F, -1.5F, -3F, -1.5F, 0F, 0F, 0F, 1.25F, 2.25F, 0F, 0.5F, 2.25F, -1.5F, -1.5F, 2.25F, -1.5F); // Box 69
		headModel[22].setRotationPoint(4.25F, -4.75F, 4.25F);

		headModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.5F, -1.5F, -3F, -1.5F, -1.5F, -3F, 0.5F, 0F, -3F, 2F, 0F, 0F, 0F, -1.5F, 2.25F, -1.5F, -1.5F, 2.25F, 0.5F, 0F, 2.25F, 2F); // Box 73
		headModel[23].setRotationPoint(4.25F, -4.75F, 4.25F);

		headModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.25F, -2.75F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0F, 1.75F, -3F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 2.25F, 0F); // Box 61
		headModel[24].setRotationPoint(-5.25F, -4.75F, -4.25F);

		headModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1.75F, -3F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 1.75F, -3F, 0F, 1.75F, 2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.75F, 2.25F, 0F); // Box 62
		headModel[25].setRotationPoint(-5.25F, -4.75F, -0.75F);

		headModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.75F, -3F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 1.25F, -3F, 0F, 1.75F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 2.25F, 0F); // Box 63
		headModel[26].setRotationPoint(-5.25F, -4.75F, 1.25F);

		headModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.5F, -3F, -1.5F, 0F, -0.75F, -0.5F, 0F, -3F, 2F, -1.5F, -3F, 0.5F, -1.5F, 2.25F, -1.5F, 0F, 0F, 0F, 0F, 2.25F, 2F, -1.5F, 2.25F, 0.5F); // Box 64
		headModel[27].setRotationPoint(-7.25F, -4.75F, 4.25F);

		headModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.25F, -3F, 0F, 0F, -0.75F, -0.5F, -1.5F, -3F, -1.5F, 0.5F, -3F, -1.5F, 1.25F, 2.25F, 0F, 0F, 0F, 0F, -1.5F, 2.25F, -1.5F, 0.5F, 2.25F, -1.5F); // Box 65
		headModel[28].setRotationPoint(-5.25F, -4.75F, 4.25F);

		headModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, -1.75F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -4F, 0.5F, 1F, -4F, -0.5F, 1F, 1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 3.25F, 0.5F, 1F, 3.25F, -0.5F); // Box 66
		headModel[29].setRotationPoint(-3.25F, -5.75F, 4.75F);
	}
}