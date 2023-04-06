//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelST1 extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelST1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import TR.MainPart
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import TR.Center
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import TR.BackLeft
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import TR.Gun"Circle"
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import TR.Cupula
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 83
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 84
		bodyModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 85
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 86
		bodyModel[9] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 88
		bodyModel[10] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 89
		bodyModel[11] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 90
		bodyModel[12] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 91
		bodyModel[13] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 92
		bodyModel[14] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 93

		bodyModel[0].addBox(-21.5F, 0F, -15F, 30, 24, 30, 0F); // Import TR.MainPart
		bodyModel[0].setRotationPoint(0F, -83F, 0F);

		bodyModel[1].addShapeBox(8.5F, 0F, 0F, 9, 22, 14, 0F, 0F, 0F, 8F, -1F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, 8F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 8F); // Import TR.Center
		bodyModel[1].setRotationPoint(0F, -83F, -7F);

		bodyModel[2].addShapeBox(-25F, 0F, -15F, 4, 24, 15, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TR.BackLeft
		bodyModel[2].setRotationPoint(0F, -83F, 0F);

		bodyModel[3].addShapeBox(14.5F, 2F, -5F, 10, 5, 10, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TR.Gun"Circle"
		bodyModel[3].setRotationPoint(0F, -83.5F, 0F);

		bodyModel[4].addBox(-9.5F, 0F, 4F, 10, 2, 10, 0F); // Import TR.Cupula
		bodyModel[4].setRotationPoint(0F, -84.5F, 0F);

		bodyModel[5].addShapeBox(-25F, 0F, 15F, 4, 24, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 83
		bodyModel[5].setRotationPoint(0F, -83F, -15F);

		bodyModel[6].addShapeBox(16.5F, 2F, -5F, 10, 5, 10, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[6].setRotationPoint(0F, -78.5F, 0F);

		bodyModel[7].addShapeBox(15.5F, 2F, -5F, 10, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[7].setRotationPoint(0F, -73.5F, 0F);

		bodyModel[8].addShapeBox(15.5F, 2F, -5F, 7, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[8].setRotationPoint(0F, -68.5F, 0F);

		bodyModel[9].addShapeBox(8.5F, 0F, -15F, 6, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 88
		bodyModel[9].setRotationPoint(0F, -61F, 0F);

		bodyModel[10].addShapeBox(-15.5F, 0F, -15F, 6, 4, 30, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 89
		bodyModel[10].setRotationPoint(0F, -61F, 0F);

		bodyModel[11].addBox(-9.5F, 0F, -15F, 18, 2, 30, 0F); // Box 90
		bodyModel[11].setRotationPoint(0F, -59F, 0F);

		bodyModel[12].addShapeBox(8.5F, 0F, -14.5F, 5, 5, 29, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 91
		bodyModel[12].setRotationPoint(0F, -57F, 0F);

		bodyModel[13].addBox(-9.5F, 0F, -14.5F, 18, 5, 29, 0F); // Box 92
		bodyModel[13].setRotationPoint(0F, -57F, 0F);

		bodyModel[14].addShapeBox(-14.5F, 0F, -14.5F, 5, 5, 29, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 93
		bodyModel[14].setRotationPoint(0F, -57F, 0F);


		hipsModel = new ModelRendererTurbo[8];
		hipsModel[0] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import CR.BottomBeak
		hipsModel[1] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 96
		hipsModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 97
		hipsModel[3] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 119
		hipsModel[4] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 120
		hipsModel[5] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 121
		hipsModel[6] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 122
		hipsModel[7] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 123

		hipsModel[0].addShapeBox(0F, 0F, 0F, 14, 5, 32, 0F, 0F, 7F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import CR.BottomBeak
		hipsModel[0].setRotationPoint(14F, -45F, -16F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 32, 14, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		hipsModel[1].setRotationPoint(-18F, -52F, -16F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 16, 14, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		hipsModel[2].setRotationPoint(-32F, -49F, -10F);
		hipsModel[2].rotateAngleZ = 0.2443461F;

		hipsModel[3].addShapeBox(-3F, 0F, 0F, 3, 3, 16, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		hipsModel[3].setRotationPoint(-34F, -49F, -8F);
		hipsModel[3].rotateAngleZ = 0.2443461F;

		hipsModel[4].addShapeBox(-3F, 3F, 0F, 3, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F); // Box 120
		hipsModel[4].setRotationPoint(-34F, -49F, -8F);
		hipsModel[4].rotateAngleZ = 0.2443461F;

		hipsModel[5].addShapeBox(0F, 3F, 0F, 3, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F); // Box 121
		hipsModel[5].setRotationPoint(-34F, -49F, -8F);
		hipsModel[5].rotateAngleZ = 0.2443461F;

		hipsModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		hipsModel[6].setRotationPoint(-34F, -49F, -8F);
		hipsModel[6].rotateAngleZ = 0.2443461F;

		hipsModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		hipsModel[7].setRotationPoint(29.5F, -47F, -8F);
		hipsModel[7].rotateAngleZ = -0.2443461F;


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 98
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 99
		leftArmModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 100

		leftArmModel[0].addShapeBox(-7F, -9F, 0F, 14, 18, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Box 98
		leftArmModel[0].setRotationPoint(-4F, 0F, 15F);

		leftArmModel[1].addShapeBox(-5F, 7F, 0F, 10, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, 0F, -1F, -3F); // Box 99
		leftArmModel[1].setRotationPoint(-4F, 0F, 15F);

		leftArmModel[2].addShapeBox(-0.5F, 8.5F, 2F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftArmModel[2].setRotationPoint(-4F, 0F, 15F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import BL.Base
		rightArmModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import BL.Howitzer
		rightArmModel[2] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 87

		rightArmModel[0].addShapeBox(-12F, 5F, -3.5F, 11, 6, 7, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, -5F, 5F, 0F, -5F, 5F, 0F, 0F, 5F, 0F); // Import BL.Base
		rightArmModel[0].setRotationPoint(15.5F, 0F, 0F);

		rightArmModel[1].addShapeBox(-8F, 13F, -2F, 4, 18, 4, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import BL.Howitzer
		rightArmModel[1].setRotationPoint(15.5F, 0F, 0F);

		rightArmModel[2].addShapeBox(-6F, 5F, -3.5F, 11, 4, 7, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -7F, 7F, -2F, -7F, 7F, 0F, 0F, 7F, 0F); // Box 87
		rightArmModel[2].setRotationPoint(15.5F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 106
		leftLegModel[1] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 107
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 108
		leftLegModel[3] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 109

		leftLegModel[0].addShapeBox(-28F, 19F, 0F, 10, 20, 8, 0F, -1F, -1F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -1F, -1F, -0.5F, 1F, -2F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -2F, 1.5F); // Box 106
		leftLegModel[0].setRotationPoint(13F, -45F, 16F);

		leftLegModel[1].addShapeBox(-25F, -7F, -1F, 30, 11, 10, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -5F, 5F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -5F, 5F, 0F); // Box 107
		leftLegModel[1].setRotationPoint(13F, -45F, 16F);

		leftLegModel[2].addShapeBox(-35F, -3F, 0F, 14, 24, 8, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, -7F, 0F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -7F, 0F, 0F); // Box 108
		leftLegModel[2].setRotationPoint(13F, -45F, 16F);

		leftLegModel[3].addShapeBox(-23F, 14F, 0F, 6, 8, 8, 0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, -6F, 1F, 0F, 8F, -6F, 0F, 8F, -6F, 0F, -6F, 1F, 0F); // Box 109
		leftLegModel[3].setRotationPoint(13F, -45F, 16F);


		rightLegModel = new ModelRendererTurbo[7];
		rightLegModel[0] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 102
		rightLegModel[1] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 103
		rightLegModel[2] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 104
		rightLegModel[3] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 105
		rightLegModel[4] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 116
		rightLegModel[5] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 117
		rightLegModel[6] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 118

		rightLegModel[0].addShapeBox(-25F, -7F, -10F, 30, 11, 10, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -5F, 5F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -5F, 5F, 0F); // Box 102
		rightLegModel[0].setRotationPoint(13F, -45F, -16F);

		rightLegModel[1].addShapeBox(-35F, -3F, -9F, 14, 24, 8, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, -7F, 0F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -7F, 0F, 0F); // Box 103
		rightLegModel[1].setRotationPoint(13F, -45F, -16F);

		rightLegModel[2].addShapeBox(-23F, 14F, -9F, 6, 8, 8, 0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, -6F, 1F, 0F, 8F, -6F, 0F, 8F, -6F, 0F, -6F, 1F, 0F); // Box 104
		rightLegModel[2].setRotationPoint(13F, -45F, -16F);

		rightLegModel[3].addShapeBox(-28F, 19F, -9F, 10, 20, 8, 0F, -1F, -1F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -1F, -1F, -0.5F, 1F, -2F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -2F, 1.5F); // Box 105
		rightLegModel[3].setRotationPoint(13F, -45F, -16F);

		rightLegModel[4].addShapeBox(-34F, 9F, -5.5F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 116
		rightLegModel[4].setRotationPoint(13F, -45F, -16F);

		rightLegModel[5].addShapeBox(-34F, 9F, 3.5F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 117
		rightLegModel[5].setRotationPoint(13F, -45F, 16F);

		rightLegModel[6].addShapeBox(-34F, 9F, -5.5F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 118
		rightLegModel[6].setRotationPoint(13F, -45F, -16F);


		leftFootModel = new ModelRendererTurbo[3];
		leftFootModel[0] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 110
		leftFootModel[1] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 111
		leftFootModel[2] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 112

		leftFootModel[0].addShapeBox(-26F, 32F, 0F, 10, 13, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 10F, 0F, 4F, 10F, 0F, 4F, 0F, 0F, 8F); // Box 110
		leftFootModel[0].setRotationPoint(13F, -45F, 16F);

		leftFootModel[1].addShapeBox(-24F, 34F, 2F, 12, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 4F); // Box 111
		leftFootModel[1].setRotationPoint(13F, -45F, 16F);

		leftFootModel[2].addShapeBox(-29F, 34F, 2F, 8, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 12F, 0F, 0F); // Box 112
		leftFootModel[2].setRotationPoint(13F, -45F, 16F);


		rightFootModel = new ModelRendererTurbo[3];
		rightFootModel[0] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 113
		rightFootModel[1] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 114
		rightFootModel[2] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 115

		rightFootModel[0].addShapeBox(-29F, 34F, -7F, 8, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 12F, 0F, 0F); // Box 113
		rightFootModel[0].setRotationPoint(13F, -45F, -16F);

		rightFootModel[1].addShapeBox(-26F, 32F, -9F, 10, 13, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 10F, 0F, 4F, 10F, 0F, 4F, 0F, 0F, 8F); // Box 114
		rightFootModel[1].setRotationPoint(13F, -45F, -16F);

		rightFootModel[2].addShapeBox(-24F, 34F, -7F, 12, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 4F); // Box 115
		rightFootModel[2].setRotationPoint(13F, -45F, -16F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}