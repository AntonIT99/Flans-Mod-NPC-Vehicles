//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTornado extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelTornado()
	{

// Nose
		noseModel = new ModelRendererTurbo[2];
		noseModel[0] = new ModelRendererTurbo(this,  0,  45, textureX, textureY); // Nose1
		noseModel[1] = new ModelRendererTurbo(this,  0,  85, textureX, textureY); // Nose2

		noseModel[0].addShapeBox(0F, 0F, 0F, 35, 18, 18, 0F, 0F, -8.5F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -8.5F, 0F, -8.5F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -8.5F); //Test
		noseModel[0].setRotationPoint(-81F, -28F, -9F);

		noseModel[1].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Nose2
		noseModel[1].setRotationPoint(-91F, -19.5F, -0.5F);



// Body
		bodyModel = new ModelRendererTurbo[32];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import Body4
		bodyModel[2] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Body7
		bodyModel[3] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Body9
		bodyModel[4] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Body10
		bodyModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Body11
		bodyModel[6] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Body12HUD
		bodyModel[7] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Body13
		bodyModel[8] = new ModelRendererTurbo(this, 20, 350, textureX, textureY); // Import Body14
		bodyModel[9] = new ModelRendererTurbo(this, 20, 350, textureX, textureY); // Import Body15
		bodyModel[10] = new ModelRendererTurbo(this, 35, 350, textureX, textureY); // Import Body16
		bodyModel[11] = new ModelRendererTurbo(this, 50, 350, textureX, textureY); // Import Body17
		bodyModel[12] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import Body18
		bodyModel[13] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body19
		bodyModel[14] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Body24
		bodyModel[15] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // Import Body25
		bodyModel[16] = new ModelRendererTurbo(this, 120, 30, textureX, textureY); // Import Body26
		bodyModel[17] = new ModelRendererTurbo(this, 120, 50, textureX, textureY); // Import Body27
		bodyModel[18] = new ModelRendererTurbo(this, 120, 65, textureX, textureY); // Import Body28
		bodyModel[19] = new ModelRendererTurbo(this, 120, 50, textureX, textureY); // Import Body28
		bodyModel[20] = new ModelRendererTurbo(this, 120, 30, textureX, textureY); // Import Body29
		bodyModel[21] = new ModelRendererTurbo(this, 120, 50, textureX, textureY); // Import Body30
		bodyModel[22] = new ModelRendererTurbo(this, 120, 50, textureX, textureY); // Import Body31
		bodyModel[23] = new ModelRendererTurbo(this, 120, 65, textureX, textureY); // Import Body32
		bodyModel[24] = new ModelRendererTurbo(this, 120, 160, textureX, textureY); // Import Body33
		bodyModel[25] = new ModelRendererTurbo(this, 120, 210, textureX, textureY); // Import Body34
		bodyModel[26] = new ModelRendererTurbo(this, 120, 270, textureX, textureY); // Import Body35
		bodyModel[27] = new ModelRendererTurbo(this, 120, 300, textureX, textureY); // Import Body36
		bodyModel[28] = new ModelRendererTurbo(this, 120, 120, textureX, textureY); // Import Body37
		bodyModel[29] = new ModelRendererTurbo(this, 120, 140, textureX, textureY); // Import Body38
		bodyModel[30] = new ModelRendererTurbo(this, 120, 120, textureX, textureY); // Import Body39
		bodyModel[31] = new ModelRendererTurbo(this, 120, 140, textureX, textureY); // Import Body40

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 20, 22, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Body1
		bodyModel[0].setRotationPoint(-46F, -30F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body4
		bodyModel[1].setRotationPoint(-24F, -38F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 34, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Body7
		bodyModel[2].setRotationPoint(-22F, -30F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 34, 20, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body9
		bodyModel[3].setRotationPoint(-22F, -30F, 7F);

		bodyModel[4].addBox(0F, 0F, 0F, 34, 4, 14, 0F); // Import Body10
		bodyModel[4].setRotationPoint(-22F, -14F, -7F);

		bodyModel[5].addBox(-4F, 0F, 0F, 4, 20, 14, 0F); // Import Body11
		bodyModel[5].setRotationPoint(-21F, -30F, -7F);
		bodyModel[5].rotateAngleZ = 0.5235988F;

		bodyModel[6].addBox(0F, -3F, -3F, 0, 6, 6, 0F); // Import Body12HUD
		bodyModel[6].setRotationPoint(-15F, -34F, 0F);

		bodyModel[7].addBox(0F, 2F, 0F, 2, 6, 6, 0F); // Import Body13
		bodyModel[7].setRotationPoint(-21F, -30F, -3F);
		bodyModel[7].rotateAngleZ = 0.5235988F;

		bodyModel[8].addBox(0F, 8F, 5F, 1, 4, 4, 0F); // Import Body14
		bodyModel[8].setRotationPoint(-21F, -30F, -3F);
		bodyModel[8].rotateAngleZ = 0.5235988F;

		bodyModel[9].addBox(0F, 8F, -3F, 1, 4, 4, 0F); // Import Body15
		bodyModel[9].setRotationPoint(-21F, -30F, -3F);
		bodyModel[9].rotateAngleZ = 0.5235988F;

		bodyModel[10].addBox(0F, 0F, 0F, 4, 6, 3, 0F); // Import Body16
		bodyModel[10].setRotationPoint(-15F, -21F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Import Body17
		bodyModel[11].setRotationPoint(-14.5F, -26F, -0.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Import Body18
		bodyModel[12].setRotationPoint(-4F, -16F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 18, 10, 0F); // Import Body19
		bodyModel[13].setRotationPoint(6F, -32F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 14, 46, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Body24
		bodyModel[14].setRotationPoint(24F, -30F, -23F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 10, 15, 0F, 0F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Body25
		bodyModel[15].setRotationPoint(12F, -40F, -7.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 22, 4, 12, 0F); // Import Body26
		bodyModel[16].setRotationPoint(2F, -30F, -23F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Body27
		bodyModel[17].setRotationPoint(2F, -26F, -13F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Import Body28
		bodyModel[18].setRotationPoint(14F, -18F, -23F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Body28
		bodyModel[19].setRotationPoint(2F, -26F, -23F);

		bodyModel[20].addBox(0F, 0F, 0F, 22, 4, 12, 0F); // Import Body29
		bodyModel[20].setRotationPoint(2F, -30F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Body30
		bodyModel[21].setRotationPoint(2F, -26F, 11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Body31
		bodyModel[22].setRotationPoint(2F, -26F, 21F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Import Body32
		bodyModel[23].setRotationPoint(14F, -18F, 11F);

		bodyModel[24].addBox(0F, 0F, 0F, 12, 20, 22, 0F); // Import Body33
		bodyModel[24].setRotationPoint(12F, -30F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 44, 14, 36, 0F); // Import Body34
		bodyModel[25].setRotationPoint(49F, -30F, -18F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 69, 9, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body35
		bodyModel[26].setRotationPoint(24F, -39F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 69, 6, 22, 0F); // Import Body36
		bodyModel[27].setRotationPoint(24F, -16F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 28, 6, 11, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body37
		bodyModel[28].setRotationPoint(39F, -29F, -29F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body38
		bodyModel[29].setRotationPoint(19F, -29F, -29F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 28, 6, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Body39
		bodyModel[30].setRotationPoint(39F, -29F, 18F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Body40
		bodyModel[31].setRotationPoint(19F, -29F, 18F);




// Tail
		tailModel = new ModelRendererTurbo[10];
		tailModel[0] = new ModelRendererTurbo(this,  120,  330, textureX, textureY); // Tail1
		tailModel[1] = new ModelRendererTurbo(this,  120,  380, textureX, textureY); // Tail2
		tailModel[2] = new ModelRendererTurbo(this,  120,  400, textureX, textureY); // Tail3
		tailModel[3] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Tail4
		tailModel[4] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Tail5
		tailModel[5] = new ModelRendererTurbo(this,  240,  0, textureX, textureY); // Tail6
		tailModel[6] = new ModelRendererTurbo(this,  240,  20, textureX, textureY); // Tail7
		tailModel[7] = new ModelRendererTurbo(this,  240,  40, textureX, textureY); // Tail8
		tailModel[8] = new ModelRendererTurbo(this,  240,  140, textureX, textureY); // Tail10
		tailModel[9] = new ModelRendererTurbo(this,  240,  140, textureX, textureY); // Tail12


		tailModel[0].addShapeBox(0F, 0F, 0F, 41, 14, 32, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
		tailModel[0].setRotationPoint(93F, -30F, -16F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 41, 6, 10, 0F, 0F, 3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
		tailModel[1].setRotationPoint(93F, -36F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 41, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); //Test
		tailModel[2].setRotationPoint(93F, -16F, -11F);

		tailModel[3].addBox(0F, 0F, 0F, 14, 12, 12, 0F); // Tail4
		tailModel[3].setRotationPoint(134F, -29F, -15F);

		tailModel[4].addBox(0F, 0F, 0F, 14, 12, 12, 0F); // Tail5
		tailModel[4].setRotationPoint(134F, -29F, 3F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 52, 8, 6, 0F, -18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[5].setRotationPoint(61F, -44F, -3F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); //Test
		tailModel[6].setRotationPoint(79F, -50F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 47, 43, 2, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[7].setRotationPoint(87F, -79F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 47, 2, 34, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[8].setRotationPoint(93F, -22F, -50F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 47, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F); //Test
		tailModel[9].setRotationPoint(93F, -22F, 16F);




		// Yaw Flap
				yawFlapModel = new ModelRendererTurbo[1];
				yawFlapModel[0] = new ModelRendererTurbo(this,  240,  90, textureX, textureY); // Tail9

				yawFlapModel[0].addShapeBox(0F, 0F, -1F, 27, 43, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F); //Test
				yawFlapModel[0].setRotationPoint(134F, -79F, 0F);



		// Pitch Flap Left
				pitchFlapLeftModel = new ModelRendererTurbo[1];
				pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  300,  200, textureX, textureY); // Tail11

				pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 16, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); //Test
				pitchFlapLeftModel[0].setRotationPoint(140F, -21F, -50F);



		// Pitch Flap Right
				pitchFlapRightModel = new ModelRendererTurbo[1];
				pitchFlapRightModel[0] = new ModelRendererTurbo(this,  300,  200, textureX, textureY); // Tail13

				pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 16, 2, 34, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				pitchFlapRightModel[0].setRotationPoint(140F, -21F, 16F);
				
				
				bodyAnimWheelModel = new ModelRendererTurbo[8];
				bodyAnimWheelModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import CoreWheel1
				bodyAnimWheelModel[1] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Import CoreWheel2
				bodyAnimWheelModel[2] = new ModelRendererTurbo(this, 400, 45, textureX, textureY); // Import CoreWheel3
				bodyAnimWheelModel[3] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import CoreWheel4
				bodyAnimWheelModel[4] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import CoreWheel5
				bodyAnimWheelModel[5] = new ModelRendererTurbo(this, 400, 45, textureX, textureY); // Import CoreWheel6
				bodyAnimWheelModel[6] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import CoreWheel7
				bodyAnimWheelModel[7] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import CoreWheel8

				bodyAnimWheelModel[0].addBox(0F, 0F, -3F, 10, 6, 6, 0F); // Import CoreWheel1
				bodyAnimWheelModel[0].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[1].addBox(2F, 6F, 0F, 6, 10, 2, 0F); // Import CoreWheel2
				bodyAnimWheelModel[1].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[2].addBox(0F, 12F, -3F, 10, 6, 2, 0F); // Import CoreWheel3
				bodyAnimWheelModel[2].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[3].addShapeBox(0F, 10F, -3F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel4
				bodyAnimWheelModel[3].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[4].addShapeBox(0F, 18F, -3F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel5
				bodyAnimWheelModel[4].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[5].addBox(0F, 12F, 1F, 10, 6, 2, 0F); // Import CoreWheel6
				bodyAnimWheelModel[5].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[6].addShapeBox(0F, 10F, 1F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel7
				bodyAnimWheelModel[6].setRotationPoint(0F, 0F, 0F);

				bodyAnimWheelModel[7].addShapeBox(0F, 18F, 1F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel8
				bodyAnimWheelModel[7].setRotationPoint(0F, 0F, 0F);
				
				bodyWheelAttach = new Vector3f(-17F / 16F, 10F / 16F, 0F / 16F);


				leftAnimWingWheelModel = new ModelRendererTurbo[5];
				leftAnimWingWheelModel[0] = new ModelRendererTurbo(this, 400, 80, textureX, textureY); // Import LeftAnimWingWheel1
				leftAnimWingWheelModel[1] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Import LeftAnimWingWheel2
				leftAnimWingWheelModel[2] = new ModelRendererTurbo(this, 400, 45, textureX, textureY); // Import LeftAnimWingWheel3
				leftAnimWingWheelModel[3] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import LeftAnimWingWheel4
				leftAnimWingWheelModel[4] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import LeftAnimWingWheel5

				leftAnimWingWheelModel[0].addBox(0F, 0F, 0F, 10, 12, 6, 0F); // Import LeftAnimWingWheel1
				leftAnimWingWheelModel[0].setRotationPoint(0F, 0F, 0F);

				leftAnimWingWheelModel[1].addBox(2F, 12F, 2F, 6, 10, 2, 0F); // Import LeftAnimWingWheel2
				leftAnimWingWheelModel[1].setRotationPoint(0F, 0F, 0F);

				leftAnimWingWheelModel[2].addBox(0F, 18F, 0F, 10, 6, 2, 0F); // Import LeftAnimWingWheel3
				leftAnimWingWheelModel[2].setRotationPoint(0F, 0F, 0F);

				leftAnimWingWheelModel[3].addShapeBox(0F, 16F, 0F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftAnimWingWheel4
				leftAnimWingWheelModel[3].setRotationPoint(0F, 0F, 0F);

				leftAnimWingWheelModel[4].addShapeBox(0F, 24F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import LeftAnimWingWheel5
				leftAnimWingWheelModel[4].setRotationPoint(0F, 0F, 0F);
				
				leftWingWheelAttach = new Vector3f(73F / 16F, 16F / 16F, -17F / 16F);


				rightAnimWingWheelModel = new ModelRendererTurbo[5];
				rightAnimWingWheelModel[0] = new ModelRendererTurbo(this, 400, 80, textureX, textureY); // Import RightAnimWingWheel1
				rightAnimWingWheelModel[1] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Import RightAnimWingWheel2
				rightAnimWingWheelModel[2] = new ModelRendererTurbo(this, 400, 45, textureX, textureY); // Import RightAnimWingWheel3
				rightAnimWingWheelModel[3] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import RightAnimWingWheel4
				rightAnimWingWheelModel[4] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Import RightAnimWingWheel5

				rightAnimWingWheelModel[0].addBox(0F, 0F, -6F, 10, 12, 6, 0F); // Import RightAnimWingWheel1
				rightAnimWingWheelModel[0].setRotationPoint(0F, 0F, 0F);

				rightAnimWingWheelModel[1].addBox(2F, 12F, -4F, 6, 10, 2, 0F); // Import RightAnimWingWheel2
				rightAnimWingWheelModel[1].setRotationPoint(0F, 0F, 0F);

				rightAnimWingWheelModel[2].addBox(0F, 18F, -2F, 10, 6, 2, 0F); // Import RightAnimWingWheel3
				rightAnimWingWheelModel[2].setRotationPoint(0F, 0F, 0F);

				rightAnimWingWheelModel[3].addShapeBox(0F, 16F, -2F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightAnimWingWheel4
				rightAnimWingWheelModel[3].setRotationPoint(0F, 0F, 0F);

				rightAnimWingWheelModel[4].addShapeBox(0F, 24F, -2F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import RightAnimWingWheel5
				rightAnimWingWheelModel[4].setRotationPoint(0F, 0F, 0F);

				rightWingWheelAttach = new Vector3f(73F / 16F, 16F / 16F, 17F / 16F);
				
				
				

						leftAnimWingModel = new ModelRendererTurbo[1];
						leftAnimWingModel[0] = new ModelRendererTurbo(this, 240, 300, textureX, textureY); // Import LeftWing2

						leftAnimWingModel[0].addShapeBox(-14F, 0F, -74F, 40, 3, 83, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftWing2
						leftAnimWingModel[0].setRotationPoint(0F, 0F, 0F);


						rightAnimWingModel = new ModelRendererTurbo[1];
						rightAnimWingModel[0] = new ModelRendererTurbo(this, 240, 300, textureX, textureY); // Import LeftWing1

						rightAnimWingModel[0].addShapeBox(-14F, 0F, -9F, 40, 3, 83, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F); // Import LeftWing1
						rightAnimWingModel[0].setRotationPoint(0F, 0F, 0F);

						
						leftWingAttach = new Vector3f(52F / 16F, 28F / 16F, -27F / 16F);
						rightWingAttach = new Vector3f(52F / 16F, 28F / 16F, 27F / 16F);
						
						
						doorAnimModel = new ModelRendererTurbo[9];
						doorAnimModel[0] = new ModelRendererTurbo(this, 0, 135, textureX, textureY); // Import Body2
						doorAnimModel[1] = new ModelRendererTurbo(this, 0, 165, textureX, textureY); // Import Body3
						doorAnimModel[2] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Import Body5
						doorAnimModel[3] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Import Body6
						doorAnimModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Body8
						doorAnimModel[5] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Body20
						doorAnimModel[6] = new ModelRendererTurbo(this, 30, 410, textureX, textureY); // Import Body21
						doorAnimModel[7] = new ModelRendererTurbo(this, 30, 410, textureX, textureY); // Import Body22
						doorAnimModel[8] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Body23

						doorAnimModel[0].addShapeBox(-48F, 2F, -6F, 12, 10, 12, 0F, 0F, -8F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Body2
						doorAnimModel[0].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[1].addShapeBox(-36F, 1F, -4F, 2, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body3
						doorAnimModel[1].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[2].addShapeBox(-36F, 2F, 6F, 2, 10, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body5
						doorAnimModel[2].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[3].addShapeBox(-36F, 2F, -7F, 2, 10, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body6
						doorAnimModel[3].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[4].addShapeBox(-34F, 0F, -7F, 19, 10, 14, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Body8
						doorAnimModel[4].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[5].addShapeBox(-17F, -1F, -4F, 2, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body20
						doorAnimModel[5].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[6].addShapeBox(-17F, 0F, 7F, 2, 10, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body21
						doorAnimModel[6].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[7].addShapeBox(-17F, 0F, -8F, 2, 10, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body22
						doorAnimModel[7].setRotationPoint(0F, 0F, 0F);

						doorAnimModel[8].addShapeBox(-15F, 1F, -7F, 15, 9, 14, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body23
						doorAnimModel[8].setRotationPoint(0F, 0F, 0F);
						
						doorAttach = new Vector3f(12F/16F, 40F/16F, 0F/16F);
						

		translateAll(0, 0, 0);


		// Propeller
				propellerModels = new ModelRendererTurbo[1][1];
		        propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
		        propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
		        propellerModels[0][0].setRotationPoint(65F, -23F, -1F);
				
				
				flipAll();
			}

			// Replace with your propeller function
			private static ModelRendererTurbo[] makeProp(int i, int j, int k)
			{
				ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
				return prop;
			}
}