//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T34
// Model Creator: 
// Created on: -
// Last changed on: -

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelT34 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelT34() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import UnderBody
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import UnderBase
		bodyModel[2] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Trackguards
		bodyModel[3] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Shape3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box17
		bodyModel[7] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box18
		bodyModel[8] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box19
		bodyModel[9] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box20
		bodyModel[10] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Box1
		bodyModel[11] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Box2
		bodyModel[12] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import Box3
		bodyModel[13] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box4
		bodyModel[14] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Import Box20
		bodyModel[15] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box0
		bodyModel[16] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box1
		bodyModel[17] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box2
		bodyModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box3
		bodyModel[19] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Box10
		bodyModel[20] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box66
		bodyModel[21] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Box2
		bodyModel[22] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box3
		bodyModel[23] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Box5
		bodyModel[24] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Import Box7
		bodyModel[25] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import Box8
		bodyModel[26] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import Box9
		bodyModel[27] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import Box10
		bodyModel[28] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Import Box11
		bodyModel[29] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box12
		bodyModel[30] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Import Box16
		bodyModel[31] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box5
		bodyModel[32] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Box8
		bodyModel[33] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Box9
		bodyModel[34] = new ModelRendererTurbo(this, 200, 440, textureX, textureY); // Import Box67
		bodyModel[35] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box14
		bodyModel[36] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box15
		bodyModel[37] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import TrackTop
		bodyModel[38] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Import TrackRearLeft
		bodyModel[39] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import TrackFrontLeft
		bodyModel[40] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // Import TrackBottomLeft
		bodyModel[41] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import TrackFrontAngledLeft
		bodyModel[42] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import TrackRearAngledLeft
		bodyModel[43] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Box6
		bodyModel[44] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box14
		bodyModel[45] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box15
		bodyModel[46] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box16
		bodyModel[47] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box17
		bodyModel[48] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box18
		bodyModel[49] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import Box19
		bodyModel[50] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box4
		bodyModel[51] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box5
		bodyModel[52] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box6
		bodyModel[53] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box7
		bodyModel[54] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box11
		bodyModel[55] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box12
		bodyModel[56] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box13
		bodyModel[57] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box14
		bodyModel[58] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box15
		bodyModel[59] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box16
		bodyModel[60] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box17
		bodyModel[61] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box18
		bodyModel[62] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box19
		bodyModel[63] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Box20
		bodyModel[64] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import TrackTop
		bodyModel[65] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Import TrackRearRight
		bodyModel[66] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import TrackFrontRight
		bodyModel[67] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // Import TrackBottomRight
		bodyModel[68] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import TrackFrontAngledRight
		bodyModel[69] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import TrackRearAngledRight
		bodyModel[70] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Box7
		bodyModel[71] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box8
		bodyModel[72] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box9
		bodyModel[73] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box10
		bodyModel[74] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box11
		bodyModel[75] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box12
		bodyModel[76] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import Box13
		bodyModel[77] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box21
		bodyModel[78] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box22
		bodyModel[79] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box23
		bodyModel[80] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box24
		bodyModel[81] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box25
		bodyModel[82] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box26
		bodyModel[83] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box27
		bodyModel[84] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import Box28
		bodyModel[85] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box29
		bodyModel[86] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box30
		bodyModel[87] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box31
		bodyModel[88] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box32
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box33
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box34

		bodyModel[0].addShapeBox(0F, 0F, -1F, 108, 14, 37, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F); // Import UnderBody
		bodyModel[0].setRotationPoint(-73F, -11F, -18F);

		bodyModel[1].addBox(0F, 0F, 0F, 89, 4, 37, 0F); // Import UnderBase
		bodyModel[1].setRotationPoint(-62F, -1.5F, -19F);

		bodyModel[2].addBox(0F, 0F, 0F, 93, 3, 54, 0F); // Import Trackguards
		bodyModel[2].setRotationPoint(-65F, -14F, -27F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Import Shape3
		bodyModel[3].setRotationPoint(-78F, -14F, 18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 41, 14, 24, 0F, 35F, -2F, 7F, 0F, -2F, 7F, 0F, -2F, 7F, 35F, -2F, 7F, 50F, 0F, 15F, 15F, 0F, 15F, 15F, 0F, 15F, 50F, 0F, 15F); // Import Box6
		bodyModel[4].setRotationPoint(-20.3F, -25F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 9, 37, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 10F, 0F, 15F, -3F, 0F, 15F, -3F, 0F, -6F, 10F, 0F); // Import Box7
		bodyModel[5].setRotationPoint(25F, -17F, -19F);
		bodyModel[5].rotateAngleZ = 0.15707963F;

		bodyModel[6].addBox(0F, 0F, -3F, 17, 8, 3, 0F); // Import Box17
		bodyModel[6].setRotationPoint(-56F, -22F, -20F);
		bodyModel[6].rotateAngleX = -0.17453293F;

		bodyModel[7].addBox(0F, 0F, 0F, 17, 8, 3, 0F); // Import Box18
		bodyModel[7].setRotationPoint(-56F, -22F, 19F);
		bodyModel[7].rotateAngleX = 0.17453293F;

		bodyModel[8].addBox(0F, 0F, -3F, 17, 8, 3, 0F); // Import Box19
		bodyModel[8].setRotationPoint(-37F, -22F, -20F);
		bodyModel[8].rotateAngleX = -0.17453293F;

		bodyModel[9].addBox(0F, 0F, 0F, 17, 8, 3, 0F); // Import Box20
		bodyModel[9].setRotationPoint(-37F, -22F, 19F);
		bodyModel[9].rotateAngleX = 0.17453293F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[10].setRotationPoint(28F, -14F, 18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[11].setRotationPoint(28F, -14F, -27F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box3
		bodyModel[12].setRotationPoint(25F, -19F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box4
		bodyModel[13].setRotationPoint(27F, -18F, 0F);
		bodyModel[13].rotateAngleZ = -0.87266463F;

		bodyModel[14].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Box20
		bodyModel[14].setRotationPoint(31F, -16.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 3F, 17, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box0
		bodyModel[15].setRotationPoint(-37F, -22F, 19F);
		bodyModel[15].rotateAngleX = 0.17453293F;

		bodyModel[16].addShapeBox(0F, 0F, 3F, 17, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box1
		bodyModel[16].setRotationPoint(-56F, -22F, 19F);
		bodyModel[16].rotateAngleX = 0.17453293F;

		bodyModel[17].addShapeBox(0F, 0F, -6F, 17, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[17].setRotationPoint(-37F, -22F, -20F);
		bodyModel[17].rotateAngleX = -0.17453293F;

		bodyModel[18].addShapeBox(0F, 0F, -6F, 17, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[18].setRotationPoint(-56F, -22F, -20F);
		bodyModel[18].rotateAngleX = -0.17453293F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Import Box10
		bodyModel[19].setRotationPoint(-78F, -14F, -27F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F, 0F, 0F, 29F, 0F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 30F, 1F, 0F, 30F, 1F, 0F, 1F, 1F, 0F, 1F); // Import Box66
		bodyModel[20].setRotationPoint(-54.3F, -24F, 11F);

		bodyModel[21].addShapeBox(-1F, -25F, -12F, 18, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box2
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-6F, -25F, -12F, 5, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-18F, -25F, -12F, 12, 2, 24, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box5
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1F, -26F, -13F, 19, 1, 26, 0F, 0F, 0F, 3F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box7
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-6F, -26F, -13F, 3, 1, 26, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-20F, -26F, -13F, 12, 1, 26, 0F, 1F, 0F, -3F, 2F, 0F, 3F, 2F, 0F, 3F, 1F, 0F, -3F, 0F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -5F); // Import Box9
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1F, -38F, -13F, 18, 12, 26, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 3F); // Import Box10
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-6F, -38F, -13F, 3, 12, 26, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 3F); // Import Box11
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-18F, -38F, -13F, 12, 12, 26, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 3F, 0F, -3F); // Import Box12
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(15F, -36F, -6F, 4, 9, 12, 0F); // Import Box16
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(-9.5F, -40F, -5.5F, 11, 2, 15, 0F); // Import Box5
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-11.5F, -40F, -5.5F, 2, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box8
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.5F, -40F, -5.5F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box9
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(19F, -36F, -6F, 2, 9, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(8F, -2F, -1F, 35, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box14
		bodyModel[35].setRotationPoint(20F, -31.5F, 0F);

		bodyModel[36].addShapeBox(0F, -3F, -2F, 8, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[36].setRotationPoint(20F, -31.5F, 0F);

		bodyModel[37].addBox(0F, 0F, 0F, 109, 1, 8, 0F); // Import TrackTop
		bodyModel[37].setRotationPoint(-73F, -9F, 18F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // Import TrackRearLeft
		bodyModel[38].setRotationPoint(-73F, -8F, 18F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import TrackFrontLeft
		bodyModel[39].setRotationPoint(35F, -8F, 18F);

		bodyModel[40].addBox(0F, 0F, 0F, 85, 1, 8, 0F); // Import TrackBottomLeft
		bodyModel[40].setRotationPoint(-62F, 9F, 18F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import TrackFrontAngledLeft
		bodyModel[41].setRotationPoint(36F, -1F, 26.01F);
		bodyModel[41].rotateAngleY = 3.14159265F;
		bodyModel[41].rotateAngleZ = -0.85521133F;

		bodyModel[42].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Import TrackRearAngledLeft
		bodyModel[42].setRotationPoint(-73F, 1F, 18.01F);
		bodyModel[42].rotateAngleZ = -0.89011792F;

		bodyModel[43].addBox(0F, 2F, 0F, 8, 4, 7, 0F); // Import Box6
		bodyModel[43].setRotationPoint(27F, -8F, 18F);

		bodyModel[44].addBox(0F, 0F, 0F, 13, 9, 7, 0F); // Import Box14
		bodyModel[44].setRotationPoint(10F, -2F, 19F);

		bodyModel[45].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box15
		bodyModel[45].setRotationPoint(-8F, -4F, 19F);

		bodyModel[46].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box16
		bodyModel[46].setRotationPoint(-26F, -4F, 19F);

		bodyModel[47].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box17
		bodyModel[47].setRotationPoint(-44F, -4F, 19F);

		bodyModel[48].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box18
		bodyModel[48].setRotationPoint(-62F, -4F, 18F);

		bodyModel[49].addBox(0F, 2F, 0F, 9, 5, 7, 0F); // Import Box19
		bodyModel[49].setRotationPoint(-72F, -8F, 19F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box4
		bodyModel[50].setRotationPoint(27F, -2F, 18F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[51].setRotationPoint(27F, -8F, 18F);

		bodyModel[52].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[52].setRotationPoint(10F, -2F, 19F);

		bodyModel[53].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box7
		bodyModel[53].setRotationPoint(10F, -2F, 19F);

		bodyModel[54].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[54].setRotationPoint(-8F, -2F, 19F);

		bodyModel[55].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[55].setRotationPoint(-26F, -2F, 19F);

		bodyModel[56].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[56].setRotationPoint(-44F, -2F, 19F);

		bodyModel[57].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[57].setRotationPoint(-62F, -2F, 18F);

		bodyModel[58].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box15
		bodyModel[58].setRotationPoint(-8F, -2F, 19F);

		bodyModel[59].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box16
		bodyModel[59].setRotationPoint(-26F, -2F, 19F);

		bodyModel[60].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box17
		bodyModel[60].setRotationPoint(-44F, -2F, 19F);

		bodyModel[61].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		bodyModel[61].setRotationPoint(-62F, -2F, 18F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[62].setRotationPoint(-72F, -8F, 19F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box20
		bodyModel[63].setRotationPoint(-72F, -1F, 19F);

		bodyModel[64].addBox(0F, 0F, 0F, 109, 1, 8, 0F); // Import TrackTop
		bodyModel[64].setRotationPoint(-73F, -9F, -27F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // Import TrackRearRight
		bodyModel[65].setRotationPoint(-73F, -8F, -27F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import TrackFrontRight
		bodyModel[66].setRotationPoint(35F, -8F, -27F);

		bodyModel[67].addBox(0F, 0F, 0F, 85, 1, 8, 0F); // Import TrackBottomRight
		bodyModel[67].setRotationPoint(-62F, 9F, -27F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import TrackFrontAngledRight
		bodyModel[68].setRotationPoint(36F, -1F, -19.01F);
		bodyModel[68].rotateAngleY = 3.14159265F;
		bodyModel[68].rotateAngleZ = -0.87266463F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Import TrackRearAngledRight
		bodyModel[69].setRotationPoint(-73F, 1F, -27.01F);
		bodyModel[69].rotateAngleZ = -0.89011792F;

		bodyModel[70].addBox(0F, 2F, 0F, 8, 4, 7, 0F); // Import Box7
		bodyModel[70].setRotationPoint(27F, -8F, -26F);

		bodyModel[71].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box8
		bodyModel[71].setRotationPoint(10F, -4F, -26F);

		bodyModel[72].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box9
		bodyModel[72].setRotationPoint(-8F, -4F, -26F);

		bodyModel[73].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box10
		bodyModel[73].setRotationPoint(-26F, -4F, -26F);

		bodyModel[74].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box11
		bodyModel[74].setRotationPoint(-44F, -4F, -26F);

		bodyModel[75].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Import Box12
		bodyModel[75].setRotationPoint(-62F, -4F, -26F);

		bodyModel[76].addBox(0F, 2F, 0F, 9, 5, 7, 0F); // Import Box13
		bodyModel[76].setRotationPoint(-72F, -8F, -26F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[77].setRotationPoint(27F, -8F, -26F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box22
		bodyModel[78].setRotationPoint(27F, -2F, -26F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[79].setRotationPoint(10F, -4F, -26F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box24
		bodyModel[80].setRotationPoint(10F, 7F, -26F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[81].setRotationPoint(-8F, -4F, -26F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[82].setRotationPoint(-26F, -4F, -26F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[83].setRotationPoint(-44F, -4F, -26F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[84].setRotationPoint(-62F, -4F, -26F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box29
		bodyModel[85].setRotationPoint(-8F, 7F, -26F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box30
		bodyModel[86].setRotationPoint(-26F, 7F, -26F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box31
		bodyModel[87].setRotationPoint(-44F, 7F, -26F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box32
		bodyModel[88].setRotationPoint(-62F, 7F, -26F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[89].setRotationPoint(-72F, -8F, -26F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box34
		bodyModel[90].setRotationPoint(-72F, -1F, -26F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 91; i++)
		{
			bodyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bodyModel[];
}