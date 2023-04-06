//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kuai Qiang
// Model Creator: 
// Created on: 22.03.2020 - 12:09:14
// Last changed on: 22.03.2020 - 12:09:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model3eyeGun extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model3eyeGun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[57];
		gunModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 25
		gunModel[10] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 26
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gunModel[12] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 28
		gunModel[13] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Box 29
		gunModel[14] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 16, 4, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 32
		gunModel[17] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 33
		gunModel[18] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 34
		gunModel[19] = new ModelRendererTurbo(this, 12, 2, textureX, textureY); // Box 35
		gunModel[20] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Box 36
		gunModel[21] = new ModelRendererTurbo(this, 8, 4, textureX, textureY); // Box 37
		gunModel[22] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 38
		gunModel[23] = new ModelRendererTurbo(this, 8, 0, textureX, textureY); // Box 39
		gunModel[24] = new ModelRendererTurbo(this, 4, 4, textureX, textureY); // Box 40
		gunModel[25] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 41
		gunModel[26] = new ModelRendererTurbo(this, 4, 0, textureX, textureY); // Box 42
		gunModel[27] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 16, 4, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Box 35
		gunModel[35] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 36
		gunModel[36] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 12, 2, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Box 52
		gunModel[50] = new ModelRendererTurbo(this, 20, 4, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 54
		gunModel[52] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 55
		gunModel[53] = new ModelRendererTurbo(this, 16, 4, textureX, textureY); // Box 56
		gunModel[54] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Box 57
		gunModel[55] = new ModelRendererTurbo(this, 12, 2, textureX, textureY); // Box 58
		gunModel[56] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 59

		gunModel[0].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(-6F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 1
		gunModel[1].setRotationPoint(-6F, -3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 2
		gunModel[2].setRotationPoint(-6F, -3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 3
		gunModel[3].setRotationPoint(16F, -3F, -1.25F);

		gunModel[4].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 4
		gunModel[4].setRotationPoint(16F, -3F, -1.25F);

		gunModel[5].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 5
		gunModel[5].setRotationPoint(16F, -3F, -1.25F);

		gunModel[6].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 6
		gunModel[6].setRotationPoint(22F, -3F, -1.25F);

		gunModel[7].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 7
		gunModel[7].setRotationPoint(22F, -3F, -1.25F);

		gunModel[8].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(22F, -3F, -1.25F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 25
		gunModel[9].setRotationPoint(-6.25F, -3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 26
		gunModel[10].setRotationPoint(-6.25F, -3F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 27
		gunModel[11].setRotationPoint(-6.25F, -3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 28
		gunModel[12].setRotationPoint(20F, -3F, -1.25F);

		gunModel[13].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 29
		gunModel[13].setRotationPoint(20F, -3F, -1.25F);

		gunModel[14].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 30
		gunModel[14].setRotationPoint(20F, -3F, -1.25F);

		gunModel[15].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 31
		gunModel[15].setRotationPoint(18F, -3F, -1.25F);

		gunModel[16].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 32
		gunModel[16].setRotationPoint(18F, -3F, -1.25F);

		gunModel[17].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 33
		gunModel[17].setRotationPoint(18F, -3F, -1.25F);

		gunModel[18].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 34
		gunModel[18].setRotationPoint(16F, -3F, -1.25F);

		gunModel[19].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 35
		gunModel[19].setRotationPoint(16F, -3F, -1.25F);

		gunModel[20].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 36
		gunModel[20].setRotationPoint(16F, -3F, -1.25F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 37
		gunModel[21].setRotationPoint(14F, -3F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 38
		gunModel[22].setRotationPoint(14F, -3F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 39
		gunModel[23].setRotationPoint(14F, -3F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0F, -0.75F, -0.7916666F, 0F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.125F, -0.2F, -0.75F, 0.125F, -0.2F, 0F, 0.25F, -0.2F); // Box 40
		gunModel[24].setRotationPoint(11F, -3F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0F, -0.75F, -0.4583333F, 0F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0F, -0.75F, -0.2083333F, 0F, 0F, -0.2083333F, 0.125F); // Box 41
		gunModel[25].setRotationPoint(11F, -3F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, -0.125F, -0.2F, -0.75F, -0.125F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0F, -0.75F, -0.5416666F, 0F, 0F, -0.5416666F, 0.125F); // Box 42
		gunModel[26].setRotationPoint(11F, -3F, -0.5F);

		gunModel[27].addShapeBox(0F, -0.75F, 0F, 6, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 28
		gunModel[27].setRotationPoint(16F, -3F, -0.5F);

		gunModel[28].addShapeBox(0F, -0.75F, 0F, 6, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 29
		gunModel[28].setRotationPoint(16F, -3F, -0.5F);

		gunModel[29].addShapeBox(0F, -0.75F, 0F, 6, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 30
		gunModel[29].setRotationPoint(16F, -3F, -0.5F);

		gunModel[30].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 31
		gunModel[30].setRotationPoint(18F, -3F, -0.5F);

		gunModel[31].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 32
		gunModel[31].setRotationPoint(18F, -3F, -0.5F);

		gunModel[32].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 33
		gunModel[32].setRotationPoint(18F, -3F, -0.5F);

		gunModel[33].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 34
		gunModel[33].setRotationPoint(20F, -3F, -0.5F);

		gunModel[34].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 35
		gunModel[34].setRotationPoint(20F, -3F, -0.5F);

		gunModel[35].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 36
		gunModel[35].setRotationPoint(20F, -3F, -0.5F);

		gunModel[36].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 37
		gunModel[36].setRotationPoint(22F, -3F, -0.5F);

		gunModel[37].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 38
		gunModel[37].setRotationPoint(22F, -3F, -0.5F);

		gunModel[38].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 39
		gunModel[38].setRotationPoint(22F, -3F, -0.5F);

		gunModel[39].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 41
		gunModel[39].setRotationPoint(16F, -3F, -0.5F);

		gunModel[40].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 42
		gunModel[40].setRotationPoint(16F, -3F, -0.5F);

		gunModel[41].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 43
		gunModel[41].setRotationPoint(16F, -3F, -0.5F);

		gunModel[42].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 44
		gunModel[42].setRotationPoint(22F, -3F, 0.25F);

		gunModel[43].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F, 0F, -0.5416666F, 0F); // Box 45
		gunModel[43].setRotationPoint(16F, -3F, 0.25F);

		gunModel[44].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.4583333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F, 0F, -0.2083333F, 0F); // Box 46
		gunModel[44].setRotationPoint(16F, -3F, 0.25F);

		gunModel[45].addShapeBox(0F, 0.5F, 0F, 6, 1, 1, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, -0.7916666F, 0F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F, 0F, 0.125F, -0.2F); // Box 47
		gunModel[45].setRotationPoint(16F, -3F, 0.25F);

		gunModel[46].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 48
		gunModel[46].setRotationPoint(22F, -3F, 0.25F);

		gunModel[47].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 50
		gunModel[47].setRotationPoint(22F, -3F, 0.25F);

		gunModel[48].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 51
		gunModel[48].setRotationPoint(20F, -3F, 0.25F);

		gunModel[49].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 52
		gunModel[49].setRotationPoint(20F, -3F, 0.25F);

		gunModel[50].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 53
		gunModel[50].setRotationPoint(20F, -3F, 0.25F);

		gunModel[51].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 54
		gunModel[51].setRotationPoint(18F, -3F, 0.25F);

		gunModel[52].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 55
		gunModel[52].setRotationPoint(18F, -3F, 0.25F);

		gunModel[53].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 56
		gunModel[53].setRotationPoint(18F, -3F, 0.25F);

		gunModel[54].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, -0.75F, -0.5416666F, 0.125F, 0F, -0.5416666F, 0.125F); // Box 57
		gunModel[54].setRotationPoint(16F, -3F, 0.25F);

		gunModel[55].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, -0.75F, -0.4583333F, 0.125F, 0F, -0.4583333F, 0.125F, 0F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, -0.75F, -0.2083333F, 0.125F, 0F, -0.2083333F, 0.125F); // Box 58
		gunModel[55].setRotationPoint(16F, -3F, 0.25F);

		gunModel[56].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, -0.75F, -0.7916666F, 0.125F, 0F, -0.7916666F, 0.125F, 0F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box 59
		gunModel[56].setRotationPoint(16F, -3F, 0.25F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 54, 0, textureX, textureY); // Box 43
		ammoModel[1] = new ModelRendererTurbo(this, 54, 0, textureX, textureY); // Box 40
		ammoModel[2] = new ModelRendererTurbo(this, 54, 0, textureX, textureY); // Box 49

		ammoModel[0].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 43
		ammoModel[0].setRotationPoint(21.7F, -2.88F, -1.25F);

		ammoModel[1].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 40
		ammoModel[1].setRotationPoint(21.7F, -2.88F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 49
		ammoModel[2].setRotationPoint(21.7F, -2.88F, 0.25F);



		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}