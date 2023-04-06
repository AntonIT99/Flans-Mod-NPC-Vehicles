//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelED209fix extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelED209fix() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		bodyModel[0] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 378, 65, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 378, 65, textureX, textureY); // Core11
		bodyModel[3] = new ModelRendererTurbo(this, 122, 66, textureX, textureY); // Core12
		bodyModel[4] = new ModelRendererTurbo(this, 146, 106, textureX, textureY); // Core13
		bodyModel[5] = new ModelRendererTurbo(this, 121, 143, textureX, textureY); // Core14
		bodyModel[6] = new ModelRendererTurbo(this, 239, 102, textureX, textureY); // Core15
		bodyModel[7] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core16
		bodyModel[8] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core17
		bodyModel[9] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core18
		bodyModel[10] = new ModelRendererTurbo(this, 239, 67, textureX, textureY); // Core19
		bodyModel[11] = new ModelRendererTurbo(this, 11, 113, textureX, textureY); // Core2
		bodyModel[12] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core20
		bodyModel[13] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core21
		bodyModel[14] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core22
		bodyModel[15] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Core3
		bodyModel[16] = new ModelRendererTurbo(this, 76, 113, textureX, textureY); // Core4
		bodyModel[17] = new ModelRendererTurbo(this, 11, 59, textureX, textureY); // Core5
		bodyModel[18] = new ModelRendererTurbo(this, 11, 149, textureX, textureY); // Core6
		bodyModel[19] = new ModelRendererTurbo(this, 394, 172, textureX, textureY); // Core7
		bodyModel[20] = new ModelRendererTurbo(this, 323, 65, textureX, textureY); // Core8
		bodyModel[21] = new ModelRendererTurbo(this, 323, 106, textureX, textureY); // Core9

		bodyModel[0].addBox(31.5F, -18F, -4F, 5, 5, 8, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, -48F, 0F);

		bodyModel[1].addShapeBox(-5.5F, -32F, 11.5F, 20, 7, 4, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F); // Core10
		bodyModel[1].setRotationPoint(0F, -48F, 0F);

		bodyModel[2].addShapeBox(-5.5F, -32F, -15.5F, 20, 7, 4, 0F, 2F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core11
		bodyModel[2].setRotationPoint(0F, -48F, 0F);

		bodyModel[3].addShapeBox(-19.5F, -29F, -11F, 31, 5, 22, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Core12
		bodyModel[3].setRotationPoint(0F, -48F, 0F);

		bodyModel[4].addShapeBox(7.5F, -32F, -9F, 6, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 1F, 0F, -6F, 0F, 0F, 0F); // Core13
		bodyModel[4].setRotationPoint(0F, -48F, 0F);

		bodyModel[5].addShapeBox(-22.5F, -32F, -9F, 30, 8, 18, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[5].setRotationPoint(0F, -48F, 0F);

		bodyModel[6].addShapeBox(-3.5F, -24F, 15F, 16, 6, 18, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core15
		bodyModel[6].setRotationPoint(0F, -48F, 0F);

		bodyModel[7].addShapeBox(-1.5F, -19F, 15F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core16
		bodyModel[7].setRotationPoint(0F, -48F, 0F);

		bodyModel[8].addShapeBox(-1.5F, -15F, 15F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core17
		bodyModel[8].setRotationPoint(0F, -48F, 0F);

		bodyModel[9].addShapeBox(-1.5F, -11F, 15F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core18
		bodyModel[9].setRotationPoint(0F, -48F, 0F);

		bodyModel[10].addShapeBox(-3.5F, -24F, -33F, 16, 6, 18, 0F, -5F, -4F, 0F, -5F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core19
		bodyModel[10].setRotationPoint(0F, -48F, 0F);

		bodyModel[11].addShapeBox(31.5F, -13F, -11F, 6, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F); // Core2
		bodyModel[11].setRotationPoint(0F, -48F, 0F);

		bodyModel[12].addShapeBox(-1.5F, -19F, -18F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core20
		bodyModel[12].setRotationPoint(0F, -48F, 0F);

		bodyModel[13].addShapeBox(-1.5F, -15F, -18F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core21
		bodyModel[13].setRotationPoint(0F, -48F, 0F);

		bodyModel[14].addShapeBox(-1.5F, -11F, -18F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core22
		bodyModel[14].setRotationPoint(0F, -48F, 0F);

		bodyModel[15].addShapeBox(31.5F, -18F, 4F, 6, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 0F); // Core3
		bodyModel[15].setRotationPoint(0F, -48F, 0F);

		bodyModel[16].addShapeBox(31.5F, -18F, -11F, 6, 9, 7, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Core4
		bodyModel[16].setRotationPoint(0F, -48F, 0F);

		bodyModel[17].addShapeBox(14.5F, -18F, -15F, 17, 11, 30, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Core5
		bodyModel[17].setRotationPoint(0F, -48F, 0F);

		bodyModel[18].addBox(-9.5F, -25F, -15F, 24, 18, 30, 0F); // Core6
		bodyModel[18].setRotationPoint(0F, -48F, 0F);

		bodyModel[19].addShapeBox(-27.5F, -25F, -15F, 18, 18, 30, 0F, -3F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Core7
		bodyModel[19].setRotationPoint(0F, -48F, 0F);

		bodyModel[20].addShapeBox(31.5F, -25F, -12F, 7, 7, 24, 0F, 4F, 3F, -2F, -1F, -4F, -8F, -1F, -4F, -8F, 4F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core8
		bodyModel[20].setRotationPoint(0F, -48F, 0F);

		bodyModel[21].addShapeBox(14.5F, -32F, -16F, 17, 14, 32, 0F, 0F, 0F, -2F, -4F, -4F, -6F, -4F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Core9
		bodyModel[21].setRotationPoint(0F, -48F, 0F);


		hipsModel = new ModelRendererTurbo[11];
		hipsModel[0] = new ModelRendererTurbo(this, 17, 210, textureX, textureY); // Hip1
		hipsModel[1] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip10
		hipsModel[2] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip11
		hipsModel[3] = new ModelRendererTurbo(this, 100, 204, textureX, textureY); // Hip2
		hipsModel[4] = new ModelRendererTurbo(this, 100, 204, textureX, textureY); // Hip3
		hipsModel[5] = new ModelRendererTurbo(this, 172, 209, textureX, textureY); // Hip4
		hipsModel[6] = new ModelRendererTurbo(this, 172, 192, textureX, textureY); // Hip5
		hipsModel[7] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip6
		hipsModel[8] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip7
		hipsModel[9] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip8
		hipsModel[10] = new ModelRendererTurbo(this, 202, 180, textureX, textureY); // Hip9

		hipsModel[0].addBox(-6.5F, -7F, -8.5F, 19, 5, 17, 0F); // Hip1
		hipsModel[0].setRotationPoint(0F, -48F, 0F);

		hipsModel[1].addShapeBox(-3F, -1F, 8F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip10
		hipsModel[1].setRotationPoint(0F, -48F, 0F);

		hipsModel[2].addShapeBox(-3F, 3F, 8F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Hip11
		hipsModel[2].setRotationPoint(0F, -48F, 0F);

		hipsModel[3].addShapeBox(-7F, -2F, -10F, 20, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip2
		hipsModel[3].setRotationPoint(0F, -48F, 0F);

		hipsModel[4].addShapeBox(-7F, 4F, -10F, 20, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Hip3
		hipsModel[4].setRotationPoint(0F, -48F, 0F);

		hipsModel[5].addShapeBox(11.5F, -4F, 5.2F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip4
		hipsModel[5].setRotationPoint(0F, -48F, 0F);
		hipsModel[5].rotateAngleZ = -0.78539816F;

		hipsModel[6].addShapeBox(11.5F, -4F, -10.2F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip5
		hipsModel[6].setRotationPoint(0F, -48F, 0F);
		hipsModel[6].rotateAngleZ = -0.78539816F;

		hipsModel[7].addShapeBox(-3F, -5F, -16F, 12, 4, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip6
		hipsModel[7].setRotationPoint(0F, -48F, 0F);

		hipsModel[8].addShapeBox(-3F, -1F, -16F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip7
		hipsModel[8].setRotationPoint(0F, -48F, 0F);

		hipsModel[9].addShapeBox(-3F, 3F, -16F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Hip8
		hipsModel[9].setRotationPoint(0F, -48F, 0F);

		hipsModel[10].addShapeBox(-3F, -5F, 8F, 12, 4, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hip9
		hipsModel[10].setRotationPoint(0F, -48F, 0F);


		leftArmModel = new ModelRendererTurbo[30];
		leftArmModel[0] = new ModelRendererTurbo(this, 19, 257, textureX, textureY); // LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // LeftArm10
		leftArmModel[2] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm11
		leftArmModel[3] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm12
		leftArmModel[4] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm13
		leftArmModel[5] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm14
		leftArmModel[6] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm15
		leftArmModel[7] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // LeftArm16
		leftArmModel[8] = new ModelRendererTurbo(this, 209, 222, textureX, textureY); // LeftArm17
		leftArmModel[9] = new ModelRendererTurbo(this, 209, 199, textureX, textureY); // LeftArm18
		leftArmModel[10] = new ModelRendererTurbo(this, 257, 203, textureX, textureY); // LeftArm19
		leftArmModel[11] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // LeftArm2
		leftArmModel[12] = new ModelRendererTurbo(this, 257, 203, textureX, textureY); // LeftArm20
		leftArmModel[13] = new ModelRendererTurbo(this, 257, 182, textureX, textureY); // LeftArm21
		leftArmModel[14] = new ModelRendererTurbo(this, 257, 182, textureX, textureY); // LeftArm22
		leftArmModel[15] = new ModelRendererTurbo(this, 223, 241, textureX, textureY); // LeftArm23
		leftArmModel[16] = new ModelRendererTurbo(this, 223, 252, textureX, textureY); // LeftArm24
		leftArmModel[17] = new ModelRendererTurbo(this, 223, 252, textureX, textureY); // LeftArm25
		leftArmModel[18] = new ModelRendererTurbo(this, 223, 241, textureX, textureY); // LeftArm26
		leftArmModel[19] = new ModelRendererTurbo(this, 223, 252, textureX, textureY); // LeftArm27
		leftArmModel[20] = new ModelRendererTurbo(this, 223, 241, textureX, textureY); // LeftArm28
		leftArmModel[21] = new ModelRendererTurbo(this, 223, 252, textureX, textureY); // LeftArm29
		leftArmModel[22] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // LeftArm3
		leftArmModel[23] = new ModelRendererTurbo(this, 223, 241, textureX, textureY); // LeftArm30
		leftArmModel[24] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // LeftArm4
		leftArmModel[25] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // LeftArm5
		leftArmModel[26] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // LeftArm6
		leftArmModel[27] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // LeftArm7
		leftArmModel[28] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // LeftArm8
		leftArmModel[29] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // LeftArm9

		leftArmModel[0].addShapeBox(-3.5F, -3.5F, -7F, 7, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // LeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.57079633F;

		leftArmModel[1].addShapeBox(10F, 6F, -5.5F, 14, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // LeftArm10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addShapeBox(6F, -3F, -5.5F, 4, 3, 12, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // LeftArm11
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addShapeBox(6F, 0F, -5.5F, 4, 6, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // LeftArm12
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addShapeBox(6F, 6F, -5.5F, 4, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F); // LeftArm13
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(24F, -3F, -5.5F, 4, 3, 12, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftArm14
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(24F, 0F, -5.5F, 4, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftArm15
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(24F, 6F, -5.5F, 4, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F); // LeftArm16
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addBox(12F, -0.5F, 6.5F, 11, 7, 4, 0F); // LeftArm17
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;

		leftArmModel[9].addBox(12F, -7F, -3F, 11, 4, 7, 0F); // LeftArm18
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.57079633F;

		leftArmModel[10].addBox(-3F, 0.5F, 3.5F, 9, 1, 1, 0F); // LeftArm19
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.57079633F;

		leftArmModel[11].addShapeBox(-0.5F, 1.5F, -3F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm2
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.57079633F;

		leftArmModel[12].addShapeBox(-4F, 0.5F, -7.5F, 1, 1, 12, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, .1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.1F, -1F); // LeftArm20
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.57079633F;

		leftArmModel[13].addShapeBox(-4F, -1F, -7.5F, 1, 1, 11, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, .2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -.2F, -1F); // LeftArm21
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = -1.57079633F;

		leftArmModel[14].addBox(-3F, -1F, 2.5F, 9, 1, 1, 0F); // LeftArm22
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -1.57079633F;

		leftArmModel[15].addBox(28F, 0F, 1.5F, 4, 2, 2, 0F); // LeftArm23
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = -1.57079633F;

		leftArmModel[16].addBox(32F, 0.5F, 2F, 1, 1, 1, 0F); // LeftArm24
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = -1.57079633F;

		leftArmModel[17].addBox(32F, 0.5F, -2F, 1, 1, 1, 0F); // LeftArm25
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -1.57079633F;

		leftArmModel[18].addBox(28F, 0F, -2.5F, 4, 2, 2, 0F); // LeftArm26
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -1.57079633F;

		leftArmModel[19].addBox(32F, 4.5F, -2F, 1, 1, 1, 0F); // LeftArm27
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = -1.57079633F;

		leftArmModel[20].addBox(28F, 4F, -2.5F, 4, 2, 2, 0F); // LeftArm28
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -1.57079633F;

		leftArmModel[21].addBox(32F, 4.5F, 2F, 1, 1, 1, 0F); // LeftArm29
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -1.57079633F;

		leftArmModel[22].addShapeBox(-0.5F, -0.5F, -3F, 7, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm3
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -1.57079633F;

		leftArmModel[23].addBox(28F, 4F, 1.5F, 4, 2, 2, 0F); // LeftArm30
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = -1.57079633F;

		leftArmModel[24].addShapeBox(-0.5F, 4.5F, -3F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LeftArm4
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -1.57079633F;

		leftArmModel[25].addShapeBox(-3.5F, 4.5F, 1F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // LeftArm5
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -1.57079633F;

		leftArmModel[26].addShapeBox(-3.5F, 1.5F, 1F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // LeftArm6
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = -1.57079633F;

		leftArmModel[27].addShapeBox(-3.5F, -0.5F, 1F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // LeftArm7
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -1.57079633F;

		leftArmModel[28].addShapeBox(10F, -3F, -5.5F, 14, 3, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm8
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -1.57079633F;

		leftArmModel[29].addShapeBox(10F, 0F, -5.5F, 14, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftArm9
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = -1.57079633F;


		rightArmModel = new ModelRendererTurbo[41];
		rightArmModel[0] = new ModelRendererTurbo(this, 305, 216, textureX, textureY); // RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm10
		rightArmModel[2] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm11
		rightArmModel[3] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // RightArm12
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // RightArm13
		rightArmModel[5] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // RightArm14
		rightArmModel[6] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // RightArm15
		rightArmModel[7] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // RightArm16
		rightArmModel[8] = new ModelRendererTurbo(this, 19, 257, textureX, textureY); // RightArm17
		rightArmModel[9] = new ModelRendererTurbo(this, 81, 240, textureX, textureY); // RightArm18
		rightArmModel[10] = new ModelRendererTurbo(this, 257, 182, textureX, textureY); // RightArm19
		rightArmModel[11] = new ModelRendererTurbo(this, 305, 216, textureX, textureY); // RightArm2
		rightArmModel[12] = new ModelRendererTurbo(this, 257, 182, textureX, textureY); // RightArm20
		rightArmModel[13] = new ModelRendererTurbo(this, 257, 203, textureX, textureY); // RightArm21
		rightArmModel[14] = new ModelRendererTurbo(this, 257, 203, textureX, textureY); // RightArm22
		rightArmModel[15] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // RightArm23
		rightArmModel[16] = new ModelRendererTurbo(this, 331, 175, textureX, textureY); // RightArm24
		rightArmModel[17] = new ModelRendererTurbo(this, 331, 198, textureX, textureY); // RightArm25
		rightArmModel[18] = new ModelRendererTurbo(this, 331, 216, textureX, textureY); // RightArm26
		rightArmModel[19] = new ModelRendererTurbo(this, 354, 192, textureX, textureY); // RightArm27
		rightArmModel[20] = new ModelRendererTurbo(this, 354, 192, textureX, textureY); // RightArm28
		rightArmModel[21] = new ModelRendererTurbo(this, 331, 229, textureX, textureY); // RightArm29
		rightArmModel[22] = new ModelRendererTurbo(this, 263, 227, textureX, textureY); // RightArm3
		rightArmModel[23] = new ModelRendererTurbo(this, 331, 229, textureX, textureY); // RightArm30
		rightArmModel[24] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // RightArm31
		rightArmModel[25] = new ModelRendererTurbo(this, 356, 210, textureX, textureY); // RightArm32
		rightArmModel[26] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // RightArm33
		rightArmModel[27] = new ModelRendererTurbo(this, 354, 210, textureX, textureY); // RightArm34
		rightArmModel[28] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // RightArm35
		rightArmModel[29] = new ModelRendererTurbo(this, 289, 202, textureX, textureY); // RightArm36
		rightArmModel[30] = new ModelRendererTurbo(this, 294, 223, textureX, textureY); // RightArm37
		rightArmModel[31] = new ModelRendererTurbo(this, 294, 223, textureX, textureY); // RightArm38
		rightArmModel[32] = new ModelRendererTurbo(this, 294, 223, textureX, textureY); // RightArm39
		rightArmModel[33] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // RightArm4
		rightArmModel[34] = new ModelRendererTurbo(this, 305, 216, textureX, textureY); // RightArm40
		rightArmModel[35] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // RightArm41
		rightArmModel[36] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm5
		rightArmModel[37] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm6
		rightArmModel[38] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm7
		rightArmModel[39] = new ModelRendererTurbo(this, 112, 241, textureX, textureY); // RightArm8
		rightArmModel[40] = new ModelRendererTurbo(this, 175, 241, textureX, textureY); // RightArm9

		rightArmModel[0].addShapeBox(22F, 2.5F, -8.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F); // RightArm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.57079633F;

		rightArmModel[1].addShapeBox(6F, -3F, -6.5F, 4, 3, 12, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // RightArm10
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.57079633F;

		rightArmModel[2].addShapeBox(6F, 6F, -6.5F, 4, 3, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F); // RightArm11
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.57079633F;

		rightArmModel[3].addShapeBox(10F, 6F, -6.5F, 14, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.57079633F;

		rightArmModel[4].addShapeBox(-0.5F, 1.5F, -4F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm13
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -1.57079633F;

		rightArmModel[5].addShapeBox(-3.5F, 1.5F, -4F, 3, 3, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm14
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -1.57079633F;

		rightArmModel[6].addShapeBox(-0.5F, 4.5F, -4F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightArm15
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -1.57079633F;

		rightArmModel[7].addShapeBox(-3.5F, 4.5F, -4F, 3, 2, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm16
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -1.57079633F;

		rightArmModel[8].addShapeBox(-3.5F, -3.5F, -1F, 7, 7, 8, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm17
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.57079633F;

		rightArmModel[9].addShapeBox(-0.5F, -0.5F, -4F, 7, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm18
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -1.57079633F;

		rightArmModel[10].addBox(-3F, -1F, -3.5F, 9, 1, 1, 0F); // RightArm19
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -1.57079633F;

		rightArmModel[11].addShapeBox(22F, 4.5F, -8.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F); // RightArm2
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -1.57079633F;

		rightArmModel[12].addShapeBox(-4F, -1F, -3.5F, 1, 1, 11, 0F, 0F, .2F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -.2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // RightArm20
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -1.57079633F;

		rightArmModel[13].addBox(-3F, 0.5F, -4.5F, 9, 1, 1, 0F); // RightArm21
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = -1.57079633F;

		rightArmModel[14].addShapeBox(-4F, 0.5F, -4.5F, 1, 1, 12, 0F, 0F, .1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -.1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // RightArm22
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -1.57079633F;

		rightArmModel[15].addShapeBox(-3.5F, -0.5F, -4F, 3, 2, 3, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm23
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = -1.57079633F;

		rightArmModel[16].addBox(10F, 9F, -3F, 14, 4, 5, 0F); // RightArm24
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
		rightArmModel[16].rotateAngleZ = -1.57079633F;

		rightArmModel[17].addBox(28F, -0.5F, -4F, 3, 3, 3, 0F); // RightArm25
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = -1.57079633F;

		rightArmModel[18].addBox(28F, 3F, -3F, 2, 2, 2, 0F); // RightArm26
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = -1.57079633F;

		rightArmModel[19].addBox(28F, 0F, 0F, 2, 2, 2, 0F); // RightArm27
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = -1.57079633F;

		rightArmModel[20].addBox(28F, 3F, 0F, 2, 2, 2, 0F); // RightArm28
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = -1.57079633F;

		rightArmModel[21].addBox(30F, 0.5F, 0.5F, 8, 1, 1, 0F); // RightArm29
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = -1.57079633F;

		rightArmModel[22].addShapeBox(12F, -3F, -7.5F, 11, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm3
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -1.57079633F;

		rightArmModel[23].addBox(30F, 3.5F, 0.5F, 5, 1, 1, 0F); // RightArm30
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = -1.57079633F;

		rightArmModel[24].addShapeBox(31F, 0.5F, 0.5F, 1, 4, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // RightArm31
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = -1.57079633F;

		rightArmModel[25].addShapeBox(32F, 0.5F, 0.5F, 3, 4, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // RightArm32
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = -1.57079633F;

		rightArmModel[26].addShapeBox(35F, 0.5F, 0.5F, 1, 4, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // RightArm33
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -1.57079633F;

		rightArmModel[27].addShapeBox(36F, 0.5F, 0.5F, 1, 4, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F); // RightArm34
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = -1.57079633F;

		rightArmModel[28].addBox(13F, 0F, -7F, 11, 6, 1, 0F); // RightArm35
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = -1.57079633F;

		rightArmModel[29].addBox(13F, 0F, -9F, 7, 6, 2, 0F); // RightArm36
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = -1.57079633F;

		rightArmModel[30].addShapeBox(13F, 0.5F, -8.5F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm37
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = -1.57079633F;

		rightArmModel[31].addShapeBox(13F, 2.5F, -8.5F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm38
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = -1.57079633F;

		rightArmModel[32].addShapeBox(13F, 4.5F, -8.5F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm39
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);
		rightArmModel[32].rotateAngleZ = -1.57079633F;

		rightArmModel[33].addShapeBox(10F, -3F, -6.5F, 14, 3, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm4
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);
		rightArmModel[33].rotateAngleZ = -1.57079633F;

		rightArmModel[34].addShapeBox(22F, 0.5F, -8.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F); // RightArm40
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);
		rightArmModel[34].rotateAngleZ = -1.57079633F;

		rightArmModel[35].addShapeBox(23F, 0F, -8F, 1, 6, 1, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm41
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);
		rightArmModel[35].rotateAngleZ = -1.57079633F;

		rightArmModel[36].addShapeBox(24F, -3F, -6.5F, 4, 3, 12, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightArm5
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);
		rightArmModel[36].rotateAngleZ = -1.57079633F;

		rightArmModel[37].addShapeBox(24F, 0F, -6.5F, 4, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // RightArm6
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);
		rightArmModel[37].rotateAngleZ = -1.57079633F;

		rightArmModel[38].addShapeBox(24F, 6F, -6.5F, 4, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F); // RightArm7
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);
		rightArmModel[38].rotateAngleZ = -1.57079633F;

		rightArmModel[39].addShapeBox(10F, 0F, -6.5F, 14, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm8
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
		rightArmModel[39].rotateAngleZ = -1.57079633F;

		rightArmModel[40].addShapeBox(6F, 0F, -6.5F, 4, 6, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // RightArm9
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);
		rightArmModel[40].rotateAngleZ = -1.57079633F;


		leftLegModel = new ModelRendererTurbo[41];
		leftLegModel[0] = new ModelRendererTurbo(this, 11, 293, textureX, textureY); // LegLeft1
		leftLegModel[1] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft10
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft11
		leftLegModel[3] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft12
		leftLegModel[4] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft13
		leftLegModel[5] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft14
		leftLegModel[6] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft15
		leftLegModel[7] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft16
		leftLegModel[8] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // LegLeft17
		leftLegModel[9] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // LegLeft18
		leftLegModel[10] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // LegLeft19
		leftLegModel[11] = new ModelRendererTurbo(this, 11, 293, textureX, textureY); // LegLeft2
		leftLegModel[12] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // LegLeft20
		leftLegModel[13] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // LegLeft21
		leftLegModel[14] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // LegLeft22
		leftLegModel[15] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // LegLeft23
		leftLegModel[16] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // LegLeft24
		leftLegModel[17] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // LegLeft25
		leftLegModel[18] = new ModelRendererTurbo(this, 66, 293, textureX, textureY); // LegLeft3
		leftLegModel[19] = new ModelRendererTurbo(this, 321, 263, textureX, textureY); // LegLeft34
		leftLegModel[20] = new ModelRendererTurbo(this, 222, 316, textureX, textureY); // LegLeft35
		leftLegModel[21] = new ModelRendererTurbo(this, 319, 257, textureX, textureY); // LegLeft36
		leftLegModel[22] = new ModelRendererTurbo(this, 257, 299, textureX, textureY); // LegLeft37
		leftLegModel[23] = new ModelRendererTurbo(this, 222, 299, textureX, textureY); // LegLeft38
		leftLegModel[24] = new ModelRendererTurbo(this, 319, 257, textureX, textureY); // LegLeft39
		leftLegModel[25] = new ModelRendererTurbo(this, 107, 293, textureX, textureY); // LegLeft4
		leftLegModel[26] = new ModelRendererTurbo(this, 371, 251, textureX, textureY); // LegLeft40
		leftLegModel[27] = new ModelRendererTurbo(this, 221, 263, textureX, textureY); // LegLeft41
		leftLegModel[28] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // LegLeft42
		leftLegModel[29] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // LegLeft43
		leftLegModel[30] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // LegLeft44
		leftLegModel[31] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // LegLeft45
		leftLegModel[32] = new ModelRendererTurbo(this, 155, 330, textureX, textureY); // LegLeft46
		leftLegModel[33] = new ModelRendererTurbo(this, 155, 305, textureX, textureY); // LegLeft47
		leftLegModel[34] = new ModelRendererTurbo(this, 347, 301, textureX, textureY); // LegLeft48
		leftLegModel[35] = new ModelRendererTurbo(this, 300, 301, textureX, textureY); // LegLeft49
		leftLegModel[36] = new ModelRendererTurbo(this, 142, 293, textureX, textureY); // LegLeft5
		leftLegModel[37] = new ModelRendererTurbo(this, 71, 269, textureX, textureY); // LegLeft6
		leftLegModel[38] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // LegLeft7
		leftLegModel[39] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // LegLeft8
		leftLegModel[40] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // LegLeft9

		leftLegModel[0].addShapeBox(-6.5F, -7.5F, 0F, 13, 4, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft1
		leftLegModel[0].setRotationPoint(3F, -46F, 16F);
		leftLegModel[0].rotateAngleZ = -0.78539816F;

		leftLegModel[1].addShapeBox(3F, 15.5F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft10
		leftLegModel[1].setRotationPoint(3F, -46F, 16F);
		leftLegModel[1].rotateAngleZ = -0.78539816F;

		leftLegModel[2].addShapeBox(5F, 15.5F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // LegLeft11
		leftLegModel[2].setRotationPoint(3F, -46F, 16F);
		leftLegModel[2].rotateAngleZ = -0.78539816F;

		leftLegModel[3].addShapeBox(-5F, 15.5F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft12
		leftLegModel[3].setRotationPoint(3F, -46F, 16F);
		leftLegModel[3].rotateAngleZ = -0.78539816F;

		leftLegModel[4].addShapeBox(-6F, 15.5F, 0F, 1, 2, 3, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // LegLeft13
		leftLegModel[4].setRotationPoint(3F, -46F, 16F);
		leftLegModel[4].rotateAngleZ = -0.78539816F;

		leftLegModel[5].addShapeBox(-5F, 15.5F, 5F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft14
		leftLegModel[5].setRotationPoint(3F, -46F, 16F);
		leftLegModel[5].rotateAngleZ = -0.78539816F;

		leftLegModel[6].addShapeBox(-6F, 15.5F, 5F, 1, 2, 3, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // LegLeft15
		leftLegModel[6].setRotationPoint(3F, -46F, 16F);
		leftLegModel[6].rotateAngleZ = -0.78539816F;

		leftLegModel[7].addShapeBox(3F, 15.5F, 5F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft16
		leftLegModel[7].setRotationPoint(3F, -46F, 16F);
		leftLegModel[7].rotateAngleZ = -0.78539816F;

		leftLegModel[8].addShapeBox(5F, 15.5F, 5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // LegLeft17
		leftLegModel[8].setRotationPoint(3F, -46F, 16F);
		leftLegModel[8].rotateAngleZ = -0.78539816F;

		leftLegModel[9].addShapeBox(-6.5F, 1.5F, 5F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft18
		leftLegModel[9].setRotationPoint(3F, -46F, 16F);
		leftLegModel[9].rotateAngleZ = -0.78539816F;

		leftLegModel[10].addShapeBox(-6F, 10.5F, 5.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft19
		leftLegModel[10].setRotationPoint(3F, -46F, 16F);
		leftLegModel[10].rotateAngleZ = -0.78539816F;

		leftLegModel[11].addShapeBox(-6.5F, -3.5F, 0F, 13, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft2
		leftLegModel[11].setRotationPoint(3F, -46F, 16F);
		leftLegModel[11].rotateAngleZ = -0.78539816F;

		leftLegModel[12].addShapeBox(-6F, 10.5F, 0.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft20
		leftLegModel[12].setRotationPoint(3F, -46F, 16F);
		leftLegModel[12].rotateAngleZ = -0.78539816F;

		leftLegModel[13].addShapeBox(-6.5F, 1.5F, 0F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft21
		leftLegModel[13].setRotationPoint(3F, -46F, 16F);
		leftLegModel[13].rotateAngleZ = -0.78539816F;

		leftLegModel[14].addShapeBox(4F, 10.5F, 0.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft22
		leftLegModel[14].setRotationPoint(3F, -46F, 16F);
		leftLegModel[14].rotateAngleZ = -0.78539816F;

		leftLegModel[15].addShapeBox(3.5F, 1.5F, 0F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft23
		leftLegModel[15].setRotationPoint(3F, -46F, 16F);
		leftLegModel[15].rotateAngleZ = -0.78539816F;

		leftLegModel[16].addShapeBox(3.5F, 1.5F, 5F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft24
		leftLegModel[16].setRotationPoint(3F, -46F, 16F);
		leftLegModel[16].rotateAngleZ = -0.78539816F;

		leftLegModel[17].addShapeBox(4F, 10.5F, 5.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // LegLeft25
		leftLegModel[17].setRotationPoint(3F, -46F, 16F);
		leftLegModel[17].rotateAngleZ = -0.78539816F;

		leftLegModel[18].addShapeBox(-3F, 1.5F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft3
		leftLegModel[18].setRotationPoint(3F, -46F, 16F);
		leftLegModel[18].rotateAngleZ = -0.78539816F;

		leftLegModel[19].addShapeBox(-32F, 26F, -3F, 14, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // LegLeft34
		leftLegModel[19].setRotationPoint(3F, -46F, 16F);
		leftLegModel[19].rotateAngleZ = 0.78539816F;

		leftLegModel[20].addShapeBox(-17F, 31.5F, 11F, 10, 5, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // LegLeft35
		leftLegModel[20].setRotationPoint(3F, -46F, 16F);
		leftLegModel[20].rotateAngleZ = 0.38397244F;

		leftLegModel[21].addShapeBox(-32F, 11F, -3F, 14, 15, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft36
		leftLegModel[21].setRotationPoint(3F, -46F, 16F);
		leftLegModel[21].rotateAngleZ = 0.78539816F;

		leftLegModel[22].addShapeBox(-18F, 17F, -2F, 4, 15, 12, 0F, 0F, 0F, -3F, -3F, -2F, -3F, -3F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // LegLeft37
		leftLegModel[22].setRotationPoint(3F, -46F, 16F);
		leftLegModel[22].rotateAngleZ = 0.78539816F;

		leftLegModel[23].addShapeBox(-17F, 31.5F, -5F, 10, 5, 2, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft38
		leftLegModel[23].setRotationPoint(3F, -46F, 16F);
		leftLegModel[23].rotateAngleZ = 0.38397244F;

		leftLegModel[24].addShapeBox(-32F, 7F, -3F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft39
		leftLegModel[24].setRotationPoint(3F, -46F, 16F);
		leftLegModel[24].rotateAngleZ = 0.78539816F;

		leftLegModel[25].addShapeBox(-3F, 7.5F, 1F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft4
		leftLegModel[25].setRotationPoint(3F, -46F, 16F);
		leftLegModel[25].rotateAngleZ = -0.78539816F;

		leftLegModel[26].addShapeBox(-20F, 7F, 0F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft40
		leftLegModel[26].setRotationPoint(3F, -46F, 16F);
		leftLegModel[26].rotateAngleZ = 0.78539816F;

		leftLegModel[27].addShapeBox(-32F, -5F, -3F, 13, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft41
		leftLegModel[27].setRotationPoint(3F, -46F, 16F);
		leftLegModel[27].rotateAngleZ = 0.78539816F;

		leftLegModel[28].addShapeBox(-31.5F, -25F, 6.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft42
		leftLegModel[28].setRotationPoint(3F, -46F, 16F);
		leftLegModel[28].rotateAngleZ = 0.78539816F;

		leftLegModel[29].addShapeBox(-31.5F, -25F, -2.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft43
		leftLegModel[29].setRotationPoint(3F, -46F, 16F);
		leftLegModel[29].rotateAngleZ = 0.78539816F;

		leftLegModel[30].addShapeBox(-24.5F, -25F, -2.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft44
		leftLegModel[30].setRotationPoint(3F, -46F, 16F);
		leftLegModel[30].rotateAngleZ = 0.78539816F;

		leftLegModel[31].addShapeBox(-24.5F, -25F, 6.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft45
		leftLegModel[31].setRotationPoint(3F, -46F, 16F);
		leftLegModel[31].rotateAngleZ = 0.78539816F;

		leftLegModel[32].addShapeBox(-32F, -26F, -3F, 12, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft46
		leftLegModel[32].setRotationPoint(3F, -46F, 16F);
		leftLegModel[32].rotateAngleZ = 0.78539816F;

		leftLegModel[33].addShapeBox(-32F, -29F, -3F, 12, 3, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft47
		leftLegModel[33].setRotationPoint(3F, -46F, 16F);
		leftLegModel[33].rotateAngleZ = 0.78539816F;

		leftLegModel[34].addShapeBox(-29F, 11F, -3.5F, 6, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft48
		leftLegModel[34].setRotationPoint(3F, -46F, 16F);
		leftLegModel[34].rotateAngleZ = 0.78539816F;

		leftLegModel[35].addShapeBox(-29F, 18F, -3.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LegLeft49
		leftLegModel[35].setRotationPoint(3F, -46F, 16F);
		leftLegModel[35].rotateAngleZ = 0.78539816F;

		leftLegModel[36].addShapeBox(-3F, 10.5F, 1.5F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft5
		leftLegModel[36].setRotationPoint(3F, -46F, 16F);
		leftLegModel[36].rotateAngleZ = -0.78539816F;

		leftLegModel[37].addShapeBox(-3F, 13.5F, 0F, 6, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft6
		leftLegModel[37].setRotationPoint(3F, -46F, 16F);
		leftLegModel[37].rotateAngleZ = -0.78539816F;

		leftLegModel[38].addShapeBox(-20F, -2.5F, -0.5F, 3, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft7
		leftLegModel[38].setRotationPoint(3F, -46F, 16F);
		leftLegModel[38].rotateAngleZ = 0.78539816F;

		leftLegModel[39].addShapeBox(-20F, -4.5F, -0.5F, 3, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft8
		leftLegModel[39].setRotationPoint(3F, -46F, 16F);
		leftLegModel[39].rotateAngleZ = 0.78539816F;

		leftLegModel[40].addShapeBox(-20F, 2.5F, -0.5F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LegLeft9
		leftLegModel[40].setRotationPoint(3F, -46F, 16F);
		leftLegModel[40].rotateAngleZ = 0.78539816F;


		rightLegModel = new ModelRendererTurbo[41];
		rightLegModel[0] = new ModelRendererTurbo(this, 11, 293, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // RightLeg10
		rightLegModel[2] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // RightLeg11
		rightLegModel[3] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // RightLeg12
		rightLegModel[4] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // RightLeg13
		rightLegModel[5] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // RightLeg14
		rightLegModel[6] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg15
		rightLegModel[7] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg16
		rightLegModel[8] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg17
		rightLegModel[9] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg18
		rightLegModel[10] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg19
		rightLegModel[11] = new ModelRendererTurbo(this, 11, 293, textureX, textureY); // RightLeg2
		rightLegModel[12] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg20
		rightLegModel[13] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg21
		rightLegModel[14] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // RightLeg22
		rightLegModel[15] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // RightLeg23
		rightLegModel[16] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // RightLeg24
		rightLegModel[17] = new ModelRendererTurbo(this, 181, 275, textureX, textureY); // RightLeg25
		rightLegModel[18] = new ModelRendererTurbo(this, 221, 263, textureX, textureY); // RightLeg26
		rightLegModel[19] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // RightLeg27
		rightLegModel[20] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // RightLeg28
		rightLegModel[21] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // RightLeg29
		rightLegModel[22] = new ModelRendererTurbo(this, 66, 293, textureX, textureY); // RightLeg3
		rightLegModel[23] = new ModelRendererTurbo(this, 293, 251, textureX, textureY); // RightLeg30
		rightLegModel[24] = new ModelRendererTurbo(this, 155, 330, textureX, textureY); // RightLeg31
		rightLegModel[25] = new ModelRendererTurbo(this, 155, 305, textureX, textureY); // RightLeg32
		rightLegModel[26] = new ModelRendererTurbo(this, 371, 251, textureX, textureY); // RightLeg33
		rightLegModel[27] = new ModelRendererTurbo(this, 319, 257, textureX, textureY); // RightLeg34
		rightLegModel[28] = new ModelRendererTurbo(this, 319, 257, textureX, textureY); // RightLeg35
		rightLegModel[29] = new ModelRendererTurbo(this, 300, 301, textureX, textureY); // RightLeg36
		rightLegModel[30] = new ModelRendererTurbo(this, 347, 301, textureX, textureY); // RightLeg37
		rightLegModel[31] = new ModelRendererTurbo(this, 257, 299, textureX, textureY); // RightLeg38
		rightLegModel[32] = new ModelRendererTurbo(this, 222, 316, textureX, textureY); // RightLeg39
		rightLegModel[33] = new ModelRendererTurbo(this, 107, 293, textureX, textureY); // RightLeg4
		rightLegModel[34] = new ModelRendererTurbo(this, 222, 299, textureX, textureY); // RightLeg40
		rightLegModel[35] = new ModelRendererTurbo(this, 142, 293, textureX, textureY); // RightLeg5
		rightLegModel[36] = new ModelRendererTurbo(this, 71, 269, textureX, textureY); // RightLeg6
		rightLegModel[37] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // RightLeg7
		rightLegModel[38] = new ModelRendererTurbo(this, 137, 269, textureX, textureY); // RightLeg8
		rightLegModel[39] = new ModelRendererTurbo(this, 161, 271, textureX, textureY); // RightLeg9
		rightLegModel[40] = new ModelRendererTurbo(this, 222, 263, textureX, textureY); // RightLeg49

		rightLegModel[0].addShapeBox(-6.5F, -7.5F, -8F, 13, 4, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(3F, -46F, -16F);
		rightLegModel[0].rotateAngleZ = -0.78539816F;

		rightLegModel[1].addShapeBox(-6F, 10.5F, -2.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg10
		rightLegModel[1].setRotationPoint(3F, -46F, -16F);
		rightLegModel[1].rotateAngleZ = -0.78539816F;

		rightLegModel[2].addShapeBox(3.5F, 1.5F, -8F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg11
		rightLegModel[2].setRotationPoint(3F, -46F, -16F);
		rightLegModel[2].rotateAngleZ = -0.78539816F;

		rightLegModel[3].addShapeBox(3.5F, 1.5F, -3F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg12
		rightLegModel[3].setRotationPoint(3F, -46F, -16F);
		rightLegModel[3].rotateAngleZ = -0.78539816F;

		rightLegModel[4].addShapeBox(4F, 10.5F, -7.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg13
		rightLegModel[4].setRotationPoint(3F, -46F, -16F);
		rightLegModel[4].rotateAngleZ = -0.78539816F;

		rightLegModel[5].addShapeBox(4F, 10.5F, -2.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg14
		rightLegModel[5].setRotationPoint(3F, -46F, -16F);
		rightLegModel[5].rotateAngleZ = -0.78539816F;

		rightLegModel[6].addShapeBox(5F, 15.5F, -8F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // RightLeg15
		rightLegModel[6].setRotationPoint(3F, -46F, -16F);
		rightLegModel[6].rotateAngleZ = -0.78539816F;

		rightLegModel[7].addShapeBox(3F, 15.5F, -8F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg16
		rightLegModel[7].setRotationPoint(3F, -46F, -16F);
		rightLegModel[7].rotateAngleZ = -0.78539816F;

		rightLegModel[8].addShapeBox(5F, 15.5F, -3F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // RightLeg17
		rightLegModel[8].setRotationPoint(3F, -46F, -16F);
		rightLegModel[8].rotateAngleZ = -0.78539816F;

		rightLegModel[9].addShapeBox(3F, 15.5F, -3F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg18
		rightLegModel[9].setRotationPoint(3F, -46F, -16F);
		rightLegModel[9].rotateAngleZ = -0.78539816F;

		rightLegModel[10].addShapeBox(-6F, 15.5F, -3F, 1, 2, 3, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // RightLeg19
		rightLegModel[10].setRotationPoint(3F, -46F, -16F);
		rightLegModel[10].rotateAngleZ = -0.78539816F;

		rightLegModel[11].addShapeBox(-6.5F, -3.5F, -8F, 13, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg2
		rightLegModel[11].setRotationPoint(3F, -46F, -16F);
		rightLegModel[11].rotateAngleZ = -0.78539816F;

		rightLegModel[12].addShapeBox(-5F, 15.5F, -3F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg20
		rightLegModel[12].setRotationPoint(3F, -46F, -16F);
		rightLegModel[12].rotateAngleZ = -0.78539816F;

		rightLegModel[13].addShapeBox(-5F, 15.5F, -8F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg21
		rightLegModel[13].setRotationPoint(3F, -46F, -16F);
		rightLegModel[13].rotateAngleZ = -0.78539816F;

		rightLegModel[14].addShapeBox(-6F, 15.5F, -8F, 1, 2, 3, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // RightLeg22
		rightLegModel[14].setRotationPoint(3F, -46F, -16F);
		rightLegModel[14].rotateAngleZ = -0.78539816F;

		rightLegModel[15].addShapeBox(-20F, -4.5F, -8.5F, 3, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg23
		rightLegModel[15].setRotationPoint(3F, -46F, -16F);
		rightLegModel[15].rotateAngleZ = 0.78539816F;

		rightLegModel[16].addShapeBox(-20F, -2.5F, -8.5F, 3, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg24
		rightLegModel[16].setRotationPoint(3F, -46F, -16F);
		rightLegModel[16].rotateAngleZ = 0.78539816F;

		rightLegModel[17].addShapeBox(-20F, 2.5F, -8.5F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // RightLeg25
		rightLegModel[17].setRotationPoint(3F, -46F, -16F);
		rightLegModel[17].rotateAngleZ = 0.78539816F;

		rightLegModel[18].addShapeBox(-32F, -5F, -11F, 13, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg26
		rightLegModel[18].setRotationPoint(3F, -46F, -16F);
		rightLegModel[18].rotateAngleZ = 0.78539816F;

		rightLegModel[19].addShapeBox(-31.5F, -25F, -1.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg27
		rightLegModel[19].setRotationPoint(3F, -46F, -16F);
		rightLegModel[19].rotateAngleZ = 0.78539816F;

		rightLegModel[20].addShapeBox(-24.5F, -25F, -1.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg28
		rightLegModel[20].setRotationPoint(3F, -46F, -16F);
		rightLegModel[20].rotateAngleZ = 0.78539816F;

		rightLegModel[21].addShapeBox(-24.5F, -25F, -10.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg29
		rightLegModel[21].setRotationPoint(3F, -46F, -16F);
		rightLegModel[21].rotateAngleZ = 0.78539816F;

		rightLegModel[22].addShapeBox(-3F, 1.5F, -8F, 6, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg3
		rightLegModel[22].setRotationPoint(3F, -46F, -16F);
		rightLegModel[22].rotateAngleZ = -0.78539816F;

		rightLegModel[23].addShapeBox(-31.5F, -25F, -10.5F, 4, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg30
		rightLegModel[23].setRotationPoint(3F, -46F, -16F);
		rightLegModel[23].rotateAngleZ = 0.78539816F;

		rightLegModel[24].addShapeBox(-32F, -26F, -11F, 12, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg31
		rightLegModel[24].setRotationPoint(3F, -46F, -16F);
		rightLegModel[24].rotateAngleZ = 0.78539816F;

		rightLegModel[25].addShapeBox(-32F, -29F, -11F, 12, 3, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg32
		rightLegModel[25].setRotationPoint(3F, -46F, -16F);
		rightLegModel[25].rotateAngleZ = 0.78539816F;

		rightLegModel[26].addShapeBox(-20F, 7F, -8F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg33
		rightLegModel[26].setRotationPoint(3F, -46F, -16F);
		rightLegModel[26].rotateAngleZ = 0.78539816F;

		rightLegModel[27].addShapeBox(-32F, 7F, -11F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg34
		rightLegModel[27].setRotationPoint(3F, -46F, -16F);
		rightLegModel[27].rotateAngleZ = 0.78539816F;

		rightLegModel[28].addShapeBox(-32F, 11F, -11F, 14, 15, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg35
		rightLegModel[28].setRotationPoint(3F, -46F, -16F);
		rightLegModel[28].rotateAngleZ = 0.78539816F;

		rightLegModel[29].addShapeBox(-29F, 18F, -11.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightLeg36
		rightLegModel[29].setRotationPoint(3F, -46F, -16F);
		rightLegModel[29].rotateAngleZ = 0.78539816F;

		rightLegModel[30].addShapeBox(-29F, 11F, -11.5F, 6, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg37
		rightLegModel[30].setRotationPoint(3F, -46F, -16F);
		rightLegModel[30].rotateAngleZ = 0.78539816F;

		rightLegModel[31].addShapeBox(-18F, 17F, -10F, 4, 15, 12, 0F, 0F, 0F, -3F, -3F, -2F, -3F, -3F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // RightLeg38
		rightLegModel[31].setRotationPoint(3F, -46F, -16F);
		rightLegModel[31].rotateAngleZ = 0.78539816F;

		rightLegModel[32].addShapeBox(-17F, 31.5F, 3F, 10, 5, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // RightLeg39
		rightLegModel[32].setRotationPoint(3F, -46F, -16F);
		rightLegModel[32].rotateAngleZ = 0.38397244F;

		rightLegModel[33].addShapeBox(-3F, 7.5F, -7F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg4
		rightLegModel[33].setRotationPoint(3F, -46F, -16F);
		rightLegModel[33].rotateAngleZ = -0.78539816F;

		rightLegModel[34].addShapeBox(-17F, 31.5F, -13F, 10, 5, 2, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg40
		rightLegModel[34].setRotationPoint(3F, -46F, -16F);
		rightLegModel[34].rotateAngleZ = 0.38397244F;

		rightLegModel[35].addShapeBox(-3F, 10.5F, -6.5F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg5
		rightLegModel[35].setRotationPoint(3F, -46F, -16F);
		rightLegModel[35].rotateAngleZ = -0.78539816F;

		rightLegModel[36].addShapeBox(-3F, 13.5F, -8F, 6, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg6
		rightLegModel[36].setRotationPoint(3F, -46F, -16F);
		rightLegModel[36].rotateAngleZ = -0.78539816F;

		rightLegModel[37].addShapeBox(-6.5F, 1.5F, -8F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg7
		rightLegModel[37].setRotationPoint(3F, -46F, -16F);
		rightLegModel[37].rotateAngleZ = -0.78539816F;

		rightLegModel[38].addShapeBox(-6.5F, 1.5F, -3F, 3, 9, 3, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg8
		rightLegModel[38].setRotationPoint(3F, -46F, -16F);
		rightLegModel[38].rotateAngleZ = -0.78539816F;

		rightLegModel[39].addShapeBox(-6F, 10.5F, -7.5F, 2, 6, 2, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // RightLeg9
		rightLegModel[39].setRotationPoint(3F, -46F, -16F);
		rightLegModel[39].rotateAngleZ = -0.78539816F;

		rightLegModel[40].addShapeBox(-32F, 26F, -11F, 14, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // RightLeg49
		rightLegModel[40].setRotationPoint(3F, -46F, -16F);
		rightLegModel[40].rotateAngleZ = 0.78539816F;


		leftFootModel = new ModelRendererTurbo[8];
		leftFootModel[0] = new ModelRendererTurbo(this, 118, 314, textureX, textureY); // LegLeft26
		leftFootModel[1] = new ModelRendererTurbo(this, 11, 311, textureX, textureY); // LegLeft27
		leftFootModel[2] = new ModelRendererTurbo(this, 53, 311, textureX, textureY); // LegLeft28
		leftFootModel[3] = new ModelRendererTurbo(this, 118, 314, textureX, textureY); // LegLeft29
		leftFootModel[4] = new ModelRendererTurbo(this, 11, 353, textureX, textureY); // LegLeft30
		leftFootModel[5] = new ModelRendererTurbo(this, 102, 351, textureX, textureY); // LegLeft31
		leftFootModel[6] = new ModelRendererTurbo(this, 55, 350, textureX, textureY); // LegLeft32
		leftFootModel[7] = new ModelRendererTurbo(this, 53, 335, textureX, textureY); // LegLeft33

		leftFootModel[0].addShapeBox(0F, 40F, -2F, 6, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft26
		leftFootModel[0].setRotationPoint(3F, -46F, 16F);

		leftFootModel[1].addShapeBox(-1F, 36F, 0F, 8, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft27
		leftFootModel[1].setRotationPoint(3F, -46F, 16F);

		leftFootModel[2].addShapeBox(-8F, 39F, 2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft28
		leftFootModel[2].setRotationPoint(3F, -46F, 16F);

		leftFootModel[3].addShapeBox(6F, 40F, 1F, 5, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft29
		leftFootModel[3].setRotationPoint(3F, -46F, 16F);

		leftFootModel[4].addShapeBox(9F, 38F, 0F, 8, 8, 8, 0F, 0F, 0F, 0F, -1F, -4F, -1.5F, -1F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // LegLeft30
		leftFootModel[4].setRotationPoint(3F, -46F, 16F);

		leftFootModel[5].addShapeBox(-1F, 38F, 10F, 9, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -1F, -2.5F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // LegLeft31
		leftFootModel[5].setRotationPoint(3F, -46F, 16F);

		leftFootModel[6].addShapeBox(-1F, 38F, -10F, 9, 8, 8, 0F, -2.5F, -4F, -1F, -3F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LegLeft32
		leftFootModel[6].setRotationPoint(3F, -46F, 16F);

		leftFootModel[7].addShapeBox(-8F, 43F, 1.5F, 7, 3, 5, 0F, -.5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // LegLeft33
		leftFootModel[7].setRotationPoint(3F, -46F, 16F);


		rightFootModel = new ModelRendererTurbo[8];
		rightFootModel[0] = new ModelRendererTurbo(this, 53, 311, textureX, textureY); // RightLeg41
		rightFootModel[1] = new ModelRendererTurbo(this, 53, 335, textureX, textureY); // RightLeg42
		rightFootModel[2] = new ModelRendererTurbo(this, 11, 311, textureX, textureY); // RightLeg43
		rightFootModel[3] = new ModelRendererTurbo(this, 118, 314, textureX, textureY); // RightLeg44
		rightFootModel[4] = new ModelRendererTurbo(this, 118, 314, textureX, textureY); // RightLeg45
		rightFootModel[5] = new ModelRendererTurbo(this, 11, 353, textureX, textureY); // RightLeg46
		rightFootModel[6] = new ModelRendererTurbo(this, 102, 351, textureX, textureY); // RightLeg47
		rightFootModel[7] = new ModelRendererTurbo(this, 55, 350, textureX, textureY); // RightLeg48

		rightFootModel[0].addShapeBox(-8F, 39F, -6F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg41
		rightFootModel[0].setRotationPoint(3F, -46F, -16F);

		rightFootModel[1].addShapeBox(-8F, 43F, -6.5F, 7, 3, 5, 0F, -.5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // RightLeg42
		rightFootModel[1].setRotationPoint(3F, -46F, -16F);

		rightFootModel[2].addShapeBox(-1F, 36F, -8F, 8, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg43
		rightFootModel[2].setRotationPoint(3F, -46F, -16F);

		rightFootModel[3].addShapeBox(0F, 40F, -10F, 6, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg44
		rightFootModel[3].setRotationPoint(3F, -46F, -16F);

		rightFootModel[4].addShapeBox(6F, 40F, -7F, 5, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg45
		rightFootModel[4].setRotationPoint(3F, -46F, -16F);

		rightFootModel[5].addShapeBox(9F, 38F, -8F, 8, 8, 8, 0F, 0F, 0F, 0F, -1F, -4F, -1.5F, -1F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // RightLeg46
		rightFootModel[5].setRotationPoint(3F, -46F, -16F);

		rightFootModel[6].addShapeBox(-1F, 38F, 2F, 9, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -1F, -2.5F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // RightLeg47
		rightFootModel[6].setRotationPoint(3F, -46F, -16F);

		rightFootModel[7].addShapeBox(-1F, 38F, -18F, 9, 8, 8, 0F, -2.5F, -4F, -1F, -3F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg48
		rightFootModel[7].setRotationPoint(3F, -46F, -16F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}