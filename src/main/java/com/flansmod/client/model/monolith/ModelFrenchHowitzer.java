//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFrenchHowitzer extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelFrenchHowitzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		barrelModel = new ModelRendererTurbo[9];
		leftBackWheelModel = new ModelRendererTurbo[13];
		rightBackWheelModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initbarrelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 156
		bodyModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 157
		bodyModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 158
		bodyModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 159
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 160
		bodyModel[5] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 161
		bodyModel[6] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 163

		bodyModel[0].addShapeBox(-33F, -2F, -3F, 42, 4, 6, 0F,0.5F, -0.6F, -0.5F, 3F, -0.3F, 0F, 3F, -0.3F, 0F, 0.5F, -0.6F, -0.5F, -1F, -1.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -1.5F, -0.5F); // Box 156
		bodyModel[0].setRotationPoint(-8F, -4.9F, 0F);
		bodyModel[0].rotateAngleZ = 0.41887902F;

		bodyModel[1].addShapeBox(0F, -2F, -4F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[1].setRotationPoint(-1F, -12.9F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 8F, -0.15F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 4F, 8F, -0.1F); // Box 158
		bodyModel[2].setRotationPoint(-3.5F, -14.5F, -3F);
		bodyModel[2].rotateAngleZ = -0.2443461F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 8F, -0.15F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 4F, 8F, -0.1F); // Box 159
		bodyModel[3].setRotationPoint(-3.5F, -14.5F, 1.95F);
		bodyModel[3].rotateAngleZ = -0.2443461F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,4F, 1.5F, -0.1F, 1.3F, 4.7F, 0F, 1.3F, 4.7F, 0F, 4F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[4].setRotationPoint(-4.5F, -1.5F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,4F, 1.5F, 0F, 1.3F, 4.7F, 0F, 1.3F, 4.7F, 0F, 4F, 1.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[5].setRotationPoint(-4.5F, -1.5F, 2F);

		bodyModel[6].addShapeBox(-1F, -1F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[6].setRotationPoint(-2.5F, -0.5F, -11F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 146
		barrelModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 148
		barrelModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 149
		barrelModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 150
		barrelModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 151
		barrelModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 152
		barrelModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 153
		barrelModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 154
		barrelModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 155

		barrelModel[0].addShapeBox(3F, -1F, -1F, 22, 2, 2, 0F,0F, 0.7F, 0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.7F, 0.7F); // Box 146
		barrelModel[0].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[1].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 1F, 1F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 1F, 1F); // Box 148
		barrelModel[1].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[2].addShapeBox(-13F, -2F, -2F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		barrelModel[2].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[3].addShapeBox(-15F, -2F, -2F, 2, 4, 4, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 150
		barrelModel[3].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[4].addShapeBox(-9F, -2F, -2F, 1, 4, 4, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 151
		barrelModel[4].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[5].addShapeBox(25F, -1F, -1F, 1, 2, 2, 0F,0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 152
		barrelModel[5].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[6].addShapeBox(-2F, -3F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 153
		barrelModel[6].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[7].addShapeBox(0.5F, -3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 154
		barrelModel[7].setRotationPoint(0F, -14.2F, 0F);

		barrelModel[8].addShapeBox(-2F, -4F, -0.5F, 3, 1, 1, 0F,-0.8F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F); // Box 155
		barrelModel[8].setRotationPoint(0F, -14.2F, 0F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 176
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 177
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 178
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 179
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 180
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 181
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 182
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 183
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 184
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 185
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 186
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 187
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 188

		leftBackWheelModel[0].addShapeBox(-6F, -5.5F, 0F, 12, 1, 1, 0F,-0.2F, 0.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 176
		leftBackWheelModel[0].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[1].addShapeBox(-0.5F, -7F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 177
		leftBackWheelModel[1].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[2].addShapeBox(-6F, -5.5F, 0F, 12, 1, 1, 0F,-0.2F, -10.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 10.3F, -0.2F); // Box 178
		leftBackWheelModel[2].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[3].addShapeBox(-8F, -0.5F, 0F, 16, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 179
		leftBackWheelModel[3].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[4].addShapeBox(7F, -4F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		leftBackWheelModel[4].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[5].addShapeBox(4F, -9F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 1F, 0F, 0F); // Box 181
		leftBackWheelModel[5].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[6].addShapeBox(-4F, -9F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftBackWheelModel[6].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[7].addShapeBox(-10F, -9F, 0F, 6, 2, 1, 0F,-1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -3F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F); // Box 183
		leftBackWheelModel[7].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[8].addShapeBox(-9F, -4F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftBackWheelModel[8].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[9].addShapeBox(-10F, 7F, 0F, 6, 2, 1, 0F,-3F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F); // Box 185
		leftBackWheelModel[9].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[10].addShapeBox(-4F, 7F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftBackWheelModel[10].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[11].addShapeBox(4F, 7F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F); // Box 187
		leftBackWheelModel[11].setRotationPoint(-2.5F, -0.5F, 9F);

		leftBackWheelModel[12].addShapeBox(-2F, -2F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftBackWheelModel[12].setRotationPoint(-2.5F, -0.5F, 9F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 162
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 164
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 165
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 166
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 167
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 168
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 169
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 170
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 171
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 172
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 173
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 174
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 175

		rightBackWheelModel[0].addShapeBox(-2F, -2F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		rightBackWheelModel[0].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[1].addShapeBox(-4F, 7F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightBackWheelModel[1].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[2].addShapeBox(-9F, -4F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		rightBackWheelModel[2].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[3].addShapeBox(7F, -4F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		rightBackWheelModel[3].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[4].addShapeBox(-4F, -9F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightBackWheelModel[4].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[5].addShapeBox(4F, -9F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 1F, 0F, 0F); // Box 168
		rightBackWheelModel[5].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[6].addShapeBox(-10F, -9F, 0F, 6, 2, 1, 0F,-1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -3F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F); // Box 169
		rightBackWheelModel[6].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[7].addShapeBox(-10F, 7F, 0F, 6, 2, 1, 0F,-3F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F); // Box 170
		rightBackWheelModel[7].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[8].addShapeBox(4F, 7F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F); // Box 171
		rightBackWheelModel[8].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[9].addShapeBox(-0.5F, -7F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 172
		rightBackWheelModel[9].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[10].addShapeBox(-8F, -0.5F, 0F, 16, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 173
		rightBackWheelModel[10].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[11].addShapeBox(-6F, -5.5F, 0F, 12, 1, 1, 0F,-0.2F, 0.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 174
		rightBackWheelModel[11].setRotationPoint(-2.5F, -0.5F, -10F);

		rightBackWheelModel[12].addShapeBox(-6F, -5.5F, 0F, 12, 1, 1, 0F,-0.2F, -10.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, -10.5F, -0.2F, -0.2F, 10.3F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 10.3F, -0.2F); // Box 175
		rightBackWheelModel[12].setRotationPoint(-2.5F, -0.5F, -10F);
	}
}