//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: YourClassName
// Model Creator: 
// Created on: 04.10.2016 - 10:25:26
// Last changed on: 04.10.2016 - 10:25:26

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelIT1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelIT1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[109];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportbodyModel[0]
		bodyModel[1] = new ModelRendererTurbo(this, 0, 198, textureX, textureY); // Import ImportbodyModel[15]
		bodyModel[2] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Import ImportbodyModel[16]
		bodyModel[3] = new ModelRendererTurbo(this, 24, 99, textureX, textureY); // Import ImportbodyModel[17]
		bodyModel[4] = new ModelRendererTurbo(this, 0, 161, textureX, textureY); // Import ImportbodyModel[21]
		bodyModel[5] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import ImportbodyModel[22]
		bodyModel[6] = new ModelRendererTurbo(this, 94, 121, textureX, textureY); // Import ImportbodyModel[29]
		bodyModel[7] = new ModelRendererTurbo(this, 0, 184, textureX, textureY); // Import ImportbodyModel[44]
		bodyModel[8] = new ModelRendererTurbo(this, 30, 161, textureX, textureY); // Import ImportbodyModel[45]
		bodyModel[9] = new ModelRendererTurbo(this, 59, 161, textureX, textureY); // Import ImportbodyModel[46]
		bodyModel[10] = new ModelRendererTurbo(this, 90, 161, textureX, textureY); // Import ImportbodyModel[50]
		bodyModel[11] = new ModelRendererTurbo(this, 338, 54, textureX, textureY); // Import ImportbodyModel[63]
		bodyModel[12] = new ModelRendererTurbo(this, 372, 28, textureX, textureY); // Import ImportbodyModel[72]
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportShape4
		bodyModel[14] = new ModelRendererTurbo(this, 192, 1, textureX, textureY); // Import Box41
		bodyModel[15] = new ModelRendererTurbo(this, 55, 68, textureX, textureY); // Import Box42
		bodyModel[16] = new ModelRendererTurbo(this, 133, 61, textureX, textureY); // Import Box38
		bodyModel[17] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box46
		bodyModel[18] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box47
		bodyModel[19] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box48
		bodyModel[20] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box49
		bodyModel[21] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box50
		bodyModel[22] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box51
		bodyModel[23] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box52
		bodyModel[24] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box53
		bodyModel[25] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box54
		bodyModel[26] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box55
		bodyModel[27] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box56
		bodyModel[28] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box57
		bodyModel[29] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box58
		bodyModel[30] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box59
		bodyModel[31] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box60
		bodyModel[32] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box61
		bodyModel[33] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box62
		bodyModel[34] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box63
		bodyModel[35] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Import Box64
		bodyModel[36] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box65
		bodyModel[37] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box66
		bodyModel[38] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box67
		bodyModel[39] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box68
		bodyModel[40] = new ModelRendererTurbo(this, 24, 124, textureX, textureY); // Import Box69
		bodyModel[41] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box70
		bodyModel[42] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box71
		bodyModel[43] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box72
		bodyModel[44] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box73
		bodyModel[45] = new ModelRendererTurbo(this, 0, 117, textureX, textureY); // Import Box74
		bodyModel[46] = new ModelRendererTurbo(this, 77, 162, textureX, textureY); // Import Box110
		bodyModel[47] = new ModelRendererTurbo(this, 77, 154, textureX, textureY); // Import Box111
		bodyModel[48] = new ModelRendererTurbo(this, 45, 162, textureX, textureY); // Import Box112
		bodyModel[49] = new ModelRendererTurbo(this, 45, 154, textureX, textureY); // Import Box113
		bodyModel[50] = new ModelRendererTurbo(this, 372, 36, textureX, textureY); // Import Box106
		bodyModel[51] = new ModelRendererTurbo(this, 30, 256, textureX, textureY); // Import Box158
		bodyModel[52] = new ModelRendererTurbo(this, 58, 246, textureX, textureY); // Import Box159
		bodyModel[53] = new ModelRendererTurbo(this, 29, 246, textureX, textureY); // Import Box160
		bodyModel[54] = new ModelRendererTurbo(this, 88, 247, textureX, textureY); // Import Box161
		bodyModel[55] = new ModelRendererTurbo(this, 77, 255, textureX, textureY); // Import Box162
		bodyModel[56] = new ModelRendererTurbo(this, 77, 247, textureX, textureY); // Import Box163
		bodyModel[57] = new ModelRendererTurbo(this, 58, 258, textureX, textureY); // Import Box164
		bodyModel[58] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Import Box165
		bodyModel[59] = new ModelRendererTurbo(this, 14, 247, textureX, textureY); // Import Box166
		bodyModel[60] = new ModelRendererTurbo(this, 2, 247, textureX, textureY); // Import Box167
		bodyModel[61] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box168
		bodyModel[62] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box169
		bodyModel[63] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box170
		bodyModel[64] = new ModelRendererTurbo(this, 61, 75, textureX, textureY); // Import Box171
		bodyModel[65] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box172
		bodyModel[66] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box173
		bodyModel[67] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box174
		bodyModel[68] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box175
		bodyModel[69] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box176
		bodyModel[70] = new ModelRendererTurbo(this, 69, 88, textureX, textureY); // Import Box177
		bodyModel[71] = new ModelRendererTurbo(this, 60, 62, textureX, textureY); // Import Box179
		bodyModel[72] = new ModelRendererTurbo(this, 154, 6, textureX, textureY); // Import Box180
		bodyModel[73] = new ModelRendererTurbo(this, 154, 23, textureX, textureY); // Import Box181
		bodyModel[74] = new ModelRendererTurbo(this, 154, 6, textureX, textureY); // Import Box182
		bodyModel[75] = new ModelRendererTurbo(this, 154, 23, textureX, textureY); // Import Box183
		bodyModel[76] = new ModelRendererTurbo(this, 154, 6, textureX, textureY); // Import Box184
		bodyModel[77] = new ModelRendererTurbo(this, 154, 23, textureX, textureY); // Import Box185
		bodyModel[78] = new ModelRendererTurbo(this, 118, 58, textureX, textureY); // Import Box186
		bodyModel[79] = new ModelRendererTurbo(this, 118, 50, textureX, textureY); // Import Box187
		bodyModel[80] = new ModelRendererTurbo(this, 43, 88, textureX, textureY); // Import Box188
		bodyModel[81] = new ModelRendererTurbo(this, 223, 103, textureX, textureY); // Import Box189
		bodyModel[82] = new ModelRendererTurbo(this, 169, 104, textureX, textureY); // Import Box190
		bodyModel[83] = new ModelRendererTurbo(this, 210, 50, textureX, textureY); // Import Box191
		bodyModel[84] = new ModelRendererTurbo(this, 158, 50, textureX, textureY); // Import Box192
		bodyModel[85] = new ModelRendererTurbo(this, 134, 67, textureX, textureY); // Import Box193
		bodyModel[86] = new ModelRendererTurbo(this, 141, 225, textureX, textureY); // Import Box194
		bodyModel[87] = new ModelRendererTurbo(this, 279, 104, textureX, textureY); // Import Box195
		bodyModel[88] = new ModelRendererTurbo(this, 70, 247, textureX, textureY); // Import Box196
		bodyModel[89] = new ModelRendererTurbo(this, 130, 240, textureX, textureY); // Import Box197
		bodyModel[90] = new ModelRendererTurbo(this, 46, 287, textureX, textureY); // Import Box198
		bodyModel[91] = new ModelRendererTurbo(this, 2, 302, textureX, textureY); // Import Box200
		bodyModel[92] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Box201
		bodyModel[93] = new ModelRendererTurbo(this, 295, 285, textureX, textureY); // Import Box202
		bodyModel[94] = new ModelRendererTurbo(this, 170, 285, textureX, textureY); // Import Box203
		bodyModel[95] = new ModelRendererTurbo(this, 47, 285, textureX, textureY); // Import Box204
		bodyModel[96] = new ModelRendererTurbo(this, 50, 128, textureX, textureY); // Import Box205
		bodyModel[97] = new ModelRendererTurbo(this, 50, 120, textureX, textureY); // Import Box207
		bodyModel[98] = new ModelRendererTurbo(this, 58, 279, textureX, textureY); // Import Box212
		bodyModel[99] = new ModelRendererTurbo(this, 52, 279, textureX, textureY); // Import Box213
		bodyModel[100] = new ModelRendererTurbo(this, 2, 255, textureX, textureY); // Import Box214
		bodyModel[101] = new ModelRendererTurbo(this, 46, 279, textureX, textureY); // Import Box215
		bodyModel[102] = new ModelRendererTurbo(this, 40, 279, textureX, textureY); // Import Box216
		bodyModel[103] = new ModelRendererTurbo(this, 34, 279, textureX, textureY); // Import Box217
		bodyModel[104] = new ModelRendererTurbo(this, 2, 255, textureX, textureY); // Import Box218
		bodyModel[105] = new ModelRendererTurbo(this, 28, 273, textureX, textureY); // Import Box219
		bodyModel[106] = new ModelRendererTurbo(this, 34, 276, textureX, textureY); // Import Box220
		bodyModel[107] = new ModelRendererTurbo(this, 46, 273, textureX, textureY); // Import Box221
		bodyModel[108] = new ModelRendererTurbo(this, 34, 273, textureX, textureY); // Import Box222

		bodyModel[0].addBox(-25F, 0F, -18F, 58, 12, 36, 0F); // Import ImportbodyModel[0]
		bodyModel[0].setRotationPoint(-6F, -14F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 93, 1, 10, 0F); // Import ImportbodyModel[15]
		bodyModel[1].setRotationPoint(-52F, -11F, 18F);

		bodyModel[2].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Import ImportbodyModel[16]
		bodyModel[2].setRotationPoint(41F, -11F, 18F);
		bodyModel[2].rotateAngleZ = 1.18682389F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Import ImportbodyModel[17]
		bodyModel[3].setRotationPoint(-52F, -11F, 18F);
		bodyModel[3].rotateAngleZ = -0.9250245F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportbodyModel[21]
		bodyModel[4].setRotationPoint(46F, -9F, 18F);
		bodyModel[4].rotateAngleZ = -1.25663706F;

		bodyModel[5].addBox(-1.5F, -1.5F, 0.5F, 3, 3, 8, 0F); // Import ImportbodyModel[22]
		bodyModel[5].setRotationPoint(25F, 3F, 18F);

		bodyModel[6].addBox(0F, 0F, -26.5F, 2, 2, 53, 0F); // Import ImportbodyModel[29]
		bodyModel[6].setRotationPoint(39F, -4F, 0F);

		bodyModel[7].addBox(0F, 0F, -10F, 93, 1, 10, 0F); // Import ImportbodyModel[44]
		bodyModel[7].setRotationPoint(-52F, -11F, -18F);

		bodyModel[8].addShapeBox(-1F, 0F, -10F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Import ImportbodyModel[45]
		bodyModel[8].setRotationPoint(41F, -11F, -18F);
		bodyModel[8].rotateAngleZ = 1.18682389F;

		bodyModel[9].addBox(0F, 0F, -10F, 1, 5, 10, 0F); // Import ImportbodyModel[46]
		bodyModel[9].setRotationPoint(-52F, -11F, -18F);
		bodyModel[9].rotateAngleZ = -0.9250245F;

		bodyModel[10].addShapeBox(0F, 0F, -10F, 3, 1, 10, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportbodyModel[50]
		bodyModel[10].setRotationPoint(46F, -9F, -18F);
		bodyModel[10].rotateAngleZ = -1.25663706F;

		bodyModel[11].addBox(-1.5F, -1.5F, -28F, 3, 3, 56, 0F); // Import ImportbodyModel[63]
		bodyModel[11].setRotationPoint(-47F, -2F, 0F);

		bodyModel[12].addShapeBox(-22F, 0F, -4F, 24, 2, 4, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportbodyModel[72]
		bodyModel[12].setRotationPoint(10F, -14F, -18F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import ImportShape4
		bodyModel[13].setRotationPoint(-6F, 1F, 0F);

		bodyModel[14].addShapeBox(33F, 0F, -18F, 19, 12, 36, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[14].setRotationPoint(-6F, -14F, 0F);

		bodyModel[15].addShapeBox(-45F, 0F, -18F, 20, 12, 36, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[15].setRotationPoint(-6F, -14F, 0F);

		bodyModel[16].addShapeBox(-45F, 0F, -18F, 92, 5, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -2F, -5F, 0F, -2F); // Import Box38
		bodyModel[16].setRotationPoint(-6F, -2F, 0F);

		bodyModel[17].addBox(-1.5F, -1.5F, 0.5F, 3, 3, 8, 0F); // Import Box46
		bodyModel[17].setRotationPoint(11F, 3F, 18F);

		bodyModel[18].addBox(-1.5F, -1.5F, 0.5F, 3, 3, 8, 0F); // Import Box47
		bodyModel[18].setRotationPoint(-3F, 3F, 18F);

		bodyModel[19].addBox(-1.5F, -1.5F, 0.5F, 3, 3, 8, 0F); // Import Box48
		bodyModel[19].setRotationPoint(-19F, 3F, 18F);

		bodyModel[20].addBox(-1.5F, -1.5F, 0.5F, 3, 3, 8, 0F); // Import Box49
		bodyModel[20].setRotationPoint(-35F, 3F, 18F);

		bodyModel[21].addBox(-1.5F, -2.5F, 0F, 3, 4, 2, 0F); // Import Box50
		bodyModel[21].setRotationPoint(30F, 3F, 15F);

		bodyModel[22].addBox(-1.5F, -2.5F, 0F, 3, 4, 2, 0F); // Import Box51
		bodyModel[22].setRotationPoint(16F, 3F, 15F);

		bodyModel[23].addBox(-1.5F, -2.5F, 0F, 3, 4, 2, 0F); // Import Box52
		bodyModel[23].setRotationPoint(2F, 3F, 15F);

		bodyModel[24].addBox(-1.5F, -2.5F, 0F, 3, 4, 2, 0F); // Import Box53
		bodyModel[24].setRotationPoint(-14F, 3F, 15F);

		bodyModel[25].addBox(-1.5F, -2.5F, 0F, 3, 4, 2, 0F); // Import Box54
		bodyModel[25].setRotationPoint(-40F, 3F, 15F);

		bodyModel[26].addShapeBox(-6.5F, -1.5F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[26].setRotationPoint(30F, 3F, 17F);

		bodyModel[27].addShapeBox(-6.5F, -1.5F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[27].setRotationPoint(16F, 3F, 17F);

		bodyModel[28].addShapeBox(-6.5F, -1.5F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[28].setRotationPoint(2F, 3F, 17F);

		bodyModel[29].addShapeBox(-6.5F, -1.5F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[29].setRotationPoint(-14F, 3F, 17F);

		bodyModel[30].addShapeBox(-6.5F, -1.5F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[30].setRotationPoint(-35F, 3F, 17F);

		bodyModel[31].addBox(-1.5F, -2.5F, -2F, 3, 4, 2, 0F); // Import Box60
		bodyModel[31].setRotationPoint(30F, 3F, -15F);

		bodyModel[32].addBox(-1.5F, -2.5F, -2F, 3, 4, 2, 0F); // Import Box61
		bodyModel[32].setRotationPoint(16F, 3F, -15F);

		bodyModel[33].addBox(-1.5F, -2.5F, -2F, 3, 4, 2, 0F); // Import Box62
		bodyModel[33].setRotationPoint(2F, 3F, -15F);

		bodyModel[34].addBox(-1.5F, -2.5F, -2F, 3, 4, 2, 0F); // Import Box63
		bodyModel[34].setRotationPoint(-14F, 3F, -15F);

		bodyModel[35].addBox(-1.5F, -2.5F, -2F, 3, 4, 2, 0F); // Import Box64
		bodyModel[35].setRotationPoint(-40F, 3F, -15F);

		bodyModel[36].addShapeBox(-6.5F, -1.5F, -2F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[36].setRotationPoint(30F, 3F, -17F);

		bodyModel[37].addShapeBox(-6.5F, -1.5F, -2F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[37].setRotationPoint(16F, 3F, -17F);

		bodyModel[38].addShapeBox(-6.5F, -1.5F, -2F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[38].setRotationPoint(2F, 3F, -17F);

		bodyModel[39].addShapeBox(-6.5F, -1.5F, -2F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[39].setRotationPoint(-14F, 3F, -17F);

		bodyModel[40].addShapeBox(-6.5F, -1.5F, -2F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[40].setRotationPoint(-35F, 3F, -17F);

		bodyModel[41].addBox(-1.5F, -1.5F, -8.5F, 3, 3, 8, 0F); // Import Box70
		bodyModel[41].setRotationPoint(25F, 3F, -18F);

		bodyModel[42].addBox(-1.5F, -1.5F, -8.5F, 3, 3, 8, 0F); // Import Box71
		bodyModel[42].setRotationPoint(11F, 3F, -18F);

		bodyModel[43].addBox(-1.5F, -1.5F, -8.5F, 3, 3, 8, 0F); // Import Box72
		bodyModel[43].setRotationPoint(-3F, 3F, -18F);

		bodyModel[44].addBox(-1.5F, -1.5F, -8.5F, 3, 3, 8, 0F); // Import Box73
		bodyModel[44].setRotationPoint(-19F, 3F, -18F);

		bodyModel[45].addBox(-1.5F, -1.5F, -8.5F, 3, 3, 8, 0F); // Import Box74
		bodyModel[45].setRotationPoint(-35F, 3F, -18F);

		bodyModel[46].addShapeBox(0F, 0F, -1F, 6, 6, 1, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[46].setRotationPoint(41F, -11F, -17F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[47].setRotationPoint(41F, -11F, 17F);

		bodyModel[48].addShapeBox(0F, 0F, -1F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[48].setRotationPoint(31F, -11F, -17F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		bodyModel[49].setRotationPoint(31F, -11F, 17F);

		bodyModel[50].addShapeBox(-22F, 0F, 0F, 24, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, -2F); // Import Box106
		bodyModel[50].setRotationPoint(10F, -14F, 18F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Box158
		bodyModel[51].setRotationPoint(21F, -14.5F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box159
		bodyModel[52].setRotationPoint(25F, -14.5F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[53].setRotationPoint(16F, -14.5F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[54].setRotationPoint(27.5F, -14.5F, 11.5F);

		bodyModel[55].addShapeBox(0F, 0F, -3F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[55].setRotationPoint(27.5F, -14.5F, 11F);
		bodyModel[55].rotateAngleY = -0.34906585F;

		bodyModel[56].addShapeBox(11F, -2F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		bodyModel[56].setRotationPoint(27F, -14F, -17F);
		bodyModel[56].rotateAngleZ = -0.45378561F;

		bodyModel[57].addShapeBox(11F, -1F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[57].setRotationPoint(27F, -14F, -14F);
		bodyModel[57].rotateAngleZ = -0.45378561F;

		bodyModel[58].addShapeBox(11F, -2F, 0F, 1, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[58].setRotationPoint(27F, -14F, -7F);
		bodyModel[58].rotateAngleZ = -0.45378561F;

		bodyModel[59].addShapeBox(0F, -3F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[59].setRotationPoint(34F, -10F, -14F);

		bodyModel[60].addShapeBox(0F, -3F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[60].setRotationPoint(34F, -10F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, -10F, 1, 2, 10, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box168
		bodyModel[61].setRotationPoint(28F, -13F, -18F);

		bodyModel[62].addShapeBox(0F, 0F, -10F, 1, 2, 10, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box169
		bodyModel[62].setRotationPoint(11F, -13F, -18F);

		bodyModel[63].addShapeBox(0F, 0F, -10F, 1, 2, 10, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box170
		bodyModel[63].setRotationPoint(-4F, -13F, -18F);

		bodyModel[64].addShapeBox(0F, 0F, -9F, 1, 2, 9, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box171
		bodyModel[64].setRotationPoint(-15F, -13F, -18F);

		bodyModel[65].addShapeBox(0F, 0F, -10F, 1, 2, 10, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box172
		bodyModel[65].setRotationPoint(-32F, -13F, -18F);

		bodyModel[66].addShapeBox(0F, 0F, -10F, 1, 2, 10, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box173
		bodyModel[66].setRotationPoint(-49F, -13F, -18F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box174
		bodyModel[67].setRotationPoint(28F, -13F, 18F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box175
		bodyModel[68].setRotationPoint(11F, -13F, 18F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box176
		bodyModel[69].setRotationPoint(-1F, -13F, 18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		bodyModel[70].setRotationPoint(-30F, -14F, 18F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box179
		bodyModel[71].setRotationPoint(-49F, -13F, 18F);

		bodyModel[72].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[72].setRotationPoint(12F, -13F, -18F);

		bodyModel[73].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box181
		bodyModel[73].setRotationPoint(12F, -12F, -18F);

		bodyModel[74].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		bodyModel[74].setRotationPoint(-31F, -13F, -18F);

		bodyModel[75].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box183
		bodyModel[75].setRotationPoint(-31F, -12F, -18F);

		bodyModel[76].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		bodyModel[76].setRotationPoint(-48F, -13F, -18F);

		bodyModel[77].addShapeBox(0F, 0F, -10F, 16, 1, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box185
		bodyModel[77].setRotationPoint(-48F, -12F, -18F);

		bodyModel[78].addShapeBox(0F, 0F, -10F, 14, 2, 5, 0F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box186
		bodyModel[78].setRotationPoint(-3F, -13F, -18F);

		bodyModel[79].addShapeBox(0F, 0F, -10F, 14, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		bodyModel[79].setRotationPoint(-3F, -13.2F, -18F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Import Box188
		bodyModel[80].setRotationPoint(-30F, -12F, 21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box189
		bodyModel[81].setRotationPoint(12F, -13F, 18F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		bodyModel[82].setRotationPoint(12F, -13.2F, 18F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box191
		bodyModel[83].setRotationPoint(-21F, -13F, 23F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[84].setRotationPoint(-21F, -13.2F, 23F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box193
		bodyModel[85].setRotationPoint(-31F, -13.5F, 21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		bodyModel[86].setRotationPoint(-48F, -14F, 19F);

		bodyModel[87].addShapeBox(0F, 0F, -9F, 10, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[87].setRotationPoint(-31F, -14.2F, -8F);

		bodyModel[88].addShapeBox(-12F, -0.2F, 0F, 9, 1, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[88].setRotationPoint(-31F, -14F, -16F);
		bodyModel[88].rotateAngleZ = 0.05235988F;

		bodyModel[89].addShapeBox(0F, -0.2F, 0F, 6, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		bodyModel[89].setRotationPoint(-31F, -14F, -7F);

		bodyModel[90].addShapeBox(-19F, -0.2F, 0F, 5, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		bodyModel[90].setRotationPoint(-31F, -14F, 0F);
		bodyModel[90].rotateAngleZ = 0.05235988F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		bodyModel[91].setRotationPoint(-50F, -14F, -15F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box201
		bodyModel[92].setRotationPoint(-50F, -4F, -15F);

		bodyModel[93].addShapeBox(0F, 0F, -28F, 3, 1, 56, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		bodyModel[93].setRotationPoint(-54F, -9F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, -28F, 3, 1, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		bodyModel[94].setRotationPoint(-54F, -8F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, -28F, 3, 1, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box204
		bodyModel[95].setRotationPoint(-54F, -7F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -0.5F, -0.2F, 0F, 10F, -4F, 0F, 10F, -4F, -0.5F, -0.5F, -0.2F, -0.5F); // Import Box205
		bodyModel[96].setRotationPoint(-56F, -11F, 28F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -0.2F, -0.5F, 10F, -4F, -0.5F, 10F, -4F, 0F, -0.5F, -0.2F, 0F); // Import Box207
		bodyModel[97].setRotationPoint(-56F, -11F, -29F);

		bodyModel[98].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box212
		bodyModel[98].setRotationPoint(37F, -14F, -15F);

		bodyModel[99].addShapeBox(-1F, 0F, -1F, 1, 5, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box213
		bodyModel[99].setRotationPoint(37F, -14F, -6F);

		bodyModel[100].addShapeBox(-1F, 0F, 0F, 1, 1, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box214
		bodyModel[100].setRotationPoint(37F, -14F, -15F);

		bodyModel[101].addShapeBox(-1F, 0F, -0.25F, 1, 5, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box215
		bodyModel[101].setRotationPoint(37F, -14F, -10.5F);

		bodyModel[102].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box216
		bodyModel[102].setRotationPoint(34F, -14F, -15F);

		bodyModel[103].addShapeBox(-1F, 0F, -1F, 1, 5, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		bodyModel[103].setRotationPoint(34F, -14F, -6F);

		bodyModel[104].addShapeBox(-1F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box218
		bodyModel[104].setRotationPoint(34F, -14F, -15F);

		bodyModel[105].addShapeBox(-1F, 0F, -0.25F, 1, 5, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box219
		bodyModel[105].setRotationPoint(34F, -14F, -10.5F);

		bodyModel[106].addShapeBox(-4F, 0F, -0.25F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box220
		bodyModel[106].setRotationPoint(37F, -14F, -10.5F);

		bodyModel[107].addShapeBox(-4F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box221
		bodyModel[107].setRotationPoint(37F, -14F, -15F);

		bodyModel[108].addShapeBox(-4F, 0F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box222
		bodyModel[108].setRotationPoint(37F, -14F, -6F);


		turretModel = new ModelRendererTurbo[60];
		turretModel[0] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Import Box99
		turretModel[1] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box101
		turretModel[2] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Import Box102
		turretModel[3] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Import Box103
		turretModel[4] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import Box104
		turretModel[5] = new ModelRendererTurbo(this, 0, 554, textureX, textureY); // Import Box107
		turretModel[6] = new ModelRendererTurbo(this, 0, 603, textureX, textureY); // Import Box108
		turretModel[7] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Import Box109
		turretModel[8] = new ModelRendererTurbo(this, 0, 691, textureX, textureY); // Import Box110
		turretModel[9] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box111
		turretModel[10] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Box112
		turretModel[11] = new ModelRendererTurbo(this, 0, 822, textureX, textureY); // Import Box113
		turretModel[12] = new ModelRendererTurbo(this, 0, 864, textureX, textureY); // Import Box114
		turretModel[13] = new ModelRendererTurbo(this, 0, 896, textureX, textureY); // Import Box115
		turretModel[14] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Import Box116
		turretModel[15] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Import Box118
		turretModel[16] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Import Box119
		turretModel[17] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Import Box120
		turretModel[18] = new ModelRendererTurbo(this, 0, 989, textureX, textureY); // Import Box121
		turretModel[19] = new ModelRendererTurbo(this, 0, 989, textureX, textureY); // Import Box122
		turretModel[20] = new ModelRendererTurbo(this, 0, 989, textureX, textureY); // Import Box123
		turretModel[21] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Import Box124
		turretModel[22] = new ModelRendererTurbo(this, 0, 1003, textureX, textureY); // Import Box125
		turretModel[23] = new ModelRendererTurbo(this, 0, 1006, textureX, textureY); // Import Box126
		turretModel[24] = new ModelRendererTurbo(this, 125, 343, textureX, textureY); // Import Box127
		turretModel[25] = new ModelRendererTurbo(this, 125, 357, textureX, textureY); // Import Box128
		turretModel[26] = new ModelRendererTurbo(this, 125, 357, textureX, textureY); // Import Box129
		turretModel[27] = new ModelRendererTurbo(this, 125, 371, textureX, textureY); // Import Box130
		turretModel[28] = new ModelRendererTurbo(this, 125, 371, textureX, textureY); // Import Box131
		turretModel[29] = new ModelRendererTurbo(this, 125, 373, textureX, textureY); // Import Box132
		turretModel[30] = new ModelRendererTurbo(this, 125, 381, textureX, textureY); // Import Box133
		turretModel[31] = new ModelRendererTurbo(this, 125, 385, textureX, textureY); // Import Box134
		turretModel[32] = new ModelRendererTurbo(this, 125, 385, textureX, textureY); // Import Box135
		turretModel[33] = new ModelRendererTurbo(this, 125, 385, textureX, textureY); // Import Box136
		turretModel[34] = new ModelRendererTurbo(this, 125, 385, textureX, textureY); // Import Box137
		turretModel[35] = new ModelRendererTurbo(this, 125, 389, textureX, textureY); // Import Box143
		turretModel[36] = new ModelRendererTurbo(this, 125, 394, textureX, textureY); // Import Box147
		turretModel[37] = new ModelRendererTurbo(this, 125, 404, textureX, textureY); // Import Box148
		turretModel[38] = new ModelRendererTurbo(this, 125, 411, textureX, textureY); // Import Box149
		turretModel[39] = new ModelRendererTurbo(this, 125, 418, textureX, textureY); // Import Box150
		turretModel[40] = new ModelRendererTurbo(this, 125, 418, textureX, textureY); // Import Box151
		turretModel[41] = new ModelRendererTurbo(this, 125, 424, textureX, textureY); // Import Box155
		turretModel[42] = new ModelRendererTurbo(this, 125, 428, textureX, textureY); // Import Box156
		turretModel[43] = new ModelRendererTurbo(this, 125, 431, textureX, textureY); // Import Box209
		turretModel[44] = new ModelRendererTurbo(this, 125, 431, textureX, textureY); // Import Box210
		turretModel[45] = new ModelRendererTurbo(this, 125, 431, textureX, textureY); // Import Box211
		turretModel[46] = new ModelRendererTurbo(this, 125, 414, textureX, textureY); // Import Box219
		turretModel[47] = new ModelRendererTurbo(this, 125, 448, textureX, textureY); // Import Box220
		turretModel[48] = new ModelRendererTurbo(this, 125, 482, textureX, textureY); // Import Box221
		turretModel[49] = new ModelRendererTurbo(this, 125, 516, textureX, textureY); // Import Box222
		turretModel[50] = new ModelRendererTurbo(this, 129, 542, textureX, textureY); // Box 0
		turretModel[51] = new ModelRendererTurbo(this, 125, 568, textureX, textureY); // Box 1
		turretModel[52] = new ModelRendererTurbo(this, 125, 574, textureX, textureY); // Box 2
		turretModel[53] = new ModelRendererTurbo(this, 125, 568, textureX, textureY); // Box 3
		turretModel[54] = new ModelRendererTurbo(this, 125, 581, textureX, textureY); // Box 5
		turretModel[55] = new ModelRendererTurbo(this, 125, 588, textureX, textureY); // Box 6
		turretModel[56] = new ModelRendererTurbo(this, 125, 596, textureX, textureY); // Box 8
		turretModel[57] = new ModelRendererTurbo(this, 125, 602, textureX, textureY); // Box 9
		turretModel[58] = new ModelRendererTurbo(this, 125, 611, textureX, textureY); // Box 34
		turretModel[59] = new ModelRendererTurbo(this, 125, 617, textureX, textureY); // Box 38

		turretModel[0].addBox(-5F, 0F, -22F, 10, 1, 44, 0F); // Import Box99
		turretModel[0].setRotationPoint(0F, -15F, 0F);

		turretModel[1].addShapeBox(5F, 0F, -22F, 11, 1, 44, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box101
		turretModel[1].setRotationPoint(0F, -15F, 0F);

		turretModel[2].addShapeBox(-13F, 0F, -22F, 9, 1, 44, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box102
		turretModel[2].setRotationPoint(-1F, -15F, 0F);

		turretModel[3].addShapeBox(14F, 0F, -17F, 6, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Import Box103
		turretModel[3].setRotationPoint(2F, -15F, 0F);

		turretModel[4].addShapeBox(-22F, 0F, -17F, 8, 1, 34, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Import Box104
		turretModel[4].setRotationPoint(0F, -15F, 0F);

		turretModel[5].addShapeBox(-5F, -9F, -22F, 10, 4, 44, 0F, -1F, -2F, -2F, -1F, -2F, -2F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		turretModel[5].setRotationPoint(0F, -10F, 0F);

		turretModel[6].addShapeBox(5F, -8F, -22F, 11, 4, 44, 0F, 1F, -2F, -2F, -1F, -2F, -7F, -1F, -2F, -7F, 1F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box108
		turretModel[6].setRotationPoint(0F, -11F, 0F);

		turretModel[7].addShapeBox(14F, -8F, -17F, 6, 4, 34, 0F, 1F, -2F, -2F, -1F, -2F, -12F, -1F, -2F, -12F, 1F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Import Box109
		turretModel[7].setRotationPoint(2F, -11F, 0F);

		turretModel[8].addShapeBox(-14F, -9F, -22F, 9, 4, 44, 0F, -1F, -2F, -6F, 1F, -2F, -2F, 1F, -2F, -2F, -1F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box110
		turretModel[8].setRotationPoint(0F, -10F, 0F);

		turretModel[9].addShapeBox(-22F, -9F, -17F, 8, 4, 34, 0F, -1F, -2F, -12F, 1F, -2F, -1F, 1F, -2F, -1F, -1F, -2F, -12F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Import Box111
		turretModel[9].setRotationPoint(0F, -10F, 0F);

		turretModel[10].addShapeBox(-4F, -11F, -20F, 8, 1, 40, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import Box112
		turretModel[10].setRotationPoint(0F, -9F, 0F);

		turretModel[11].addShapeBox(4F, -11F, -20F, 11, 1, 40, 0F, 1F, 0F, -4F, -1F, -0.5F, -8F, -1F, -0.5F, -8F, 1F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 2F, 0F); // Import Box113
		turretModel[11].setRotationPoint(0F, -9F, 0F);

		turretModel[12].addShapeBox(14F, -12F, -15F, 6, 1, 30, 0F, 1F, -0.5F, -3F, -2F, -1.4F, -11F, -2F, -1.4F, -11F, 1F, -0.5F, -3F, 0F, 2F, 0F, 0F, 2F, -10F, 0F, 2F, -10F, 0F, 2F, 0F); // Import Box114
		turretModel[12].setRotationPoint(1F, -8F, 0F);

		turretModel[13].addShapeBox(-13F, -13F, -20F, 9, 1, 40, 0F, -1F, 0F, -8F, 1F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, -8F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -4F); // Import Box115
		turretModel[13].setRotationPoint(0F, -7F, 0F);

		turretModel[14].addShapeBox(-21F, -13F, -16F, 8, 1, 32, 0F, -4F, 0F, -13F, 1F, 0F, -4F, 1F, 0F, -4F, -4F, 0F, -13F, 0F, 2F, -11F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -11F); // Import Box116
		turretModel[14].setRotationPoint(0F, -7F, 0F);

		turretModel[15].addShapeBox(-10F, -14F, 4F, 5, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box118
		turretModel[15].setRotationPoint(4F, -7.5F, 0F);

		turretModel[16].addShapeBox(-9F, -14F, 4F, 4, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box119
		turretModel[16].setRotationPoint(8F, -7.5F, 0F);

		turretModel[17].addShapeBox(-14F, -14F, 4F, 4, 4, 13, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F); // Import Box120
		turretModel[17].setRotationPoint(4F, -7.5F, 0F);

		turretModel[18].addShapeBox(-5F, -14.5F, -13F, 3, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		turretModel[18].setRotationPoint(2F, -7.5F, -3F);

		turretModel[19].addShapeBox(-8F, -14.5F, -13F, 3, 4, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box122
		turretModel[19].setRotationPoint(2F, -7.5F, -3F);

		turretModel[20].addShapeBox(-2F, -14.5F, -13F, 3, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box123
		turretModel[20].setRotationPoint(2F, -7.5F, -3F);

		turretModel[21].addShapeBox(-9.5F, -14.8F, -12F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		turretModel[21].setRotationPoint(2F, -7.5F, -3F);

		turretModel[22].addShapeBox(-9.5F, -14.8F, -6F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		turretModel[22].setRotationPoint(2F, -7.5F, -3F);

		turretModel[23].addShapeBox(-9F, -14.6F, -12.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		turretModel[23].setRotationPoint(2F, -7.5F, -3F);

		turretModel[24].addShapeBox(-10F, -14F, 4.5F, 5, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		turretModel[24].setRotationPoint(4F, -8.5F, 0F);

		turretModel[25].addShapeBox(-9F, -15F, 4.5F, 4, 1, 12, 0F, 0F, 0F, -1F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F); // Import Box128
		turretModel[25].setRotationPoint(8F, -7.5F, 0F);

		turretModel[26].addShapeBox(-14F, -15F, 4.5F, 4, 1, 12, 0F, -1.5F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Import Box129
		turretModel[26].setRotationPoint(4F, -7.5F, 0F);

		turretModel[27].addShapeBox(-6.8F, -15.5F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		turretModel[27].setRotationPoint(5F, -7.5F, 0F);

		turretModel[28].addShapeBox(-6.8F, -15.5F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		turretModel[28].setRotationPoint(5F, -7.5F, 0F);

		turretModel[29].addShapeBox(-6F, -15.3F, 7.5F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		turretModel[29].setRotationPoint(5F, -7.5F, 0F);

		turretModel[30].addShapeBox(-4F, -16F, 9.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		turretModel[30].setRotationPoint(4F, -7.5F, 0F);

		turretModel[31].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		turretModel[31].setRotationPoint(0F, -22.5F, 14F);
		turretModel[31].rotateAngleY = 0.78539816F;

		turretModel[32].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		turretModel[32].setRotationPoint(0F, -22.5F, 7F);
		turretModel[32].rotateAngleY = -0.78539816F;

		turretModel[33].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		turretModel[33].setRotationPoint(-3F, -22.5F, 16F);
		turretModel[33].rotateAngleY = 1.57079633F;

		turretModel[34].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		turretModel[34].setRotationPoint(-3F, -22.5F, 5F);
		turretModel[34].rotateAngleY = -1.57079633F;

		turretModel[35].addShapeBox(6.5F, -15F, 12F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		turretModel[35].setRotationPoint(-2F, -6F, 0F);

		turretModel[36].addShapeBox(16F, -9F, -14F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box147
		turretModel[36].setRotationPoint(-5F, -9F, 30F);

		turretModel[37].addShapeBox(16F, -10F, -18F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		turretModel[37].setRotationPoint(-5F, -9F, 30F);

		turretModel[38].addShapeBox(17F, -16F, -17.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		turretModel[38].setRotationPoint(-5F, -6F, 30F);

		turretModel[39].addShapeBox(17F, -15F, -17.5F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		turretModel[39].setRotationPoint(-5F, -8F, 30F);

		turretModel[40].addShapeBox(17F, -12F, -17.5F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box151
		turretModel[40].setRotationPoint(-5F, -8F, 30F);

		turretModel[41].addShapeBox(18.4F, -4F, -15.8F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		turretModel[41].setRotationPoint(-3F, -15F, 22F);

		turretModel[42].addShapeBox(18F, -4F, -15.8F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box156
		turretModel[42].setRotationPoint(-1F, -15F, 22F);

		turretModel[43].addShapeBox(-5.5F, -14F, -13.5F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		turretModel[43].setRotationPoint(2F, -7.5F, -3F);

		turretModel[44].addShapeBox(-8.5F, -14F, -13.5F, 3, 4, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box210
		turretModel[44].setRotationPoint(2F, -7.5F, -3F);

		turretModel[45].addShapeBox(-5.5F, -13F, -13.5F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box211
		turretModel[45].setRotationPoint(6F, -8.5F, -3F);

		turretModel[46].addShapeBox(3F, -11F, -16F, 9, 1, 32, 0F, 0F, 0F, -5F, -1F, 0F, -9F, -1F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 2F, 0.5F, -4F, 2F, 0.5F, -4F, 0F, 0F, 0F); // Import Box219
		turretModel[46].setRotationPoint(0F, -10F, 0F);

		turretModel[47].addShapeBox(-3F, -11F, -16F, 6, 1, 32, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		turretModel[47].setRotationPoint(0F, -10F, 0F);

		turretModel[48].addShapeBox(-12F, -11F, -16F, 9, 1, 32, 0F, -1F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box221
		turretModel[48].setRotationPoint(0F, -10F, 0F);

		turretModel[49].addShapeBox(-13F, -11F, -12F, 1, 1, 24, 0F, 0F, 0F, -10F, 1F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, -10F, 4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -9F); // Import Box222
		turretModel[49].setRotationPoint(0F, -10F, 0F);

		turretModel[50].addShapeBox(3F, -11F, 0F, 5, 1, 24, 0F, 1F, 0.5F, -5F, -3F, 0.5F, -11F, -3F, 0.5F, -11F, 1F, 0.5F, -5F, -2F, 0F, 0F, 2F, 0.9F, -8F, 2F, 0.9F, -8F, -2F, 0F, 0F); // Box 0
		turretModel[50].setRotationPoint(9F, -9.5F, -12F);

		turretModel[51].addShapeBox(17F, -15F, -17.5F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[51].setRotationPoint(-16F, -12F, 25F);

		turretModel[52].addShapeBox(17F, -16F, -17.5F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[52].setRotationPoint(-16F, -10F, 25F);

		turretModel[53].addShapeBox(17F, -12F, -17.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		turretModel[53].setRotationPoint(-16F, -12F, 25F);

		turretModel[54].addShapeBox(-8F, -0.5F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[54].setRotationPoint(15F, -22F, -10F);

		turretModel[55].addShapeBox(-8F, -0.5F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[55].setRotationPoint(12F, -23F, -13F);

		turretModel[56].addShapeBox(6.5F, -15F, 12F, 1, 4, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 8
		turretModel[56].setRotationPoint(-1.5F, -10F, 0.5F);

		turretModel[57].addShapeBox(6.5F, -15F, 12F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[57].setRotationPoint(-1.5F, -17F, 0.5F);

		turretModel[58].addShapeBox(-8F, -0.5F, 0F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[58].setRotationPoint(-17F, -20F, -3F);
		turretModel[58].rotateAngleZ = -0.31415927F;

		turretModel[59].addShapeBox(-8F, -1F, -5.5F, 13, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[59].setRotationPoint(-4F, -21F, 0.5F);


		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape76

		rightFrontWheelModel[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape76
		rightFrontWheelModel[0].setRotationPoint(25F, 3F, -20F);


		leftTrackWheelModels = new ModelRendererTurbo[8];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 60, textureX, textureY); // Import Shape39
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape40
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape41
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape42
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape43
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape44
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Import Shape45
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Import Shape81

		leftTrackWheelModels[0].addShape3D(4F, -4F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 6, 8, 8, 28, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape39
		leftTrackWheelModels[0].setRotationPoint(40F, -3F, 20F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape40
		leftTrackWheelModels[1].setRotationPoint(25F, 3F, 20F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, -6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape41
		leftTrackWheelModels[2].setRotationPoint(11F, 3F, 20F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape42
		leftTrackWheelModels[3].setRotationPoint(-3F, 3F, 20F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape43
		leftTrackWheelModels[4].setRotationPoint(-19F, 3F, 20F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, -6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape44
		leftTrackWheelModels[5].setRotationPoint(-35F, 3F, 20F);

		leftTrackWheelModels[6].addShape3D(4F, -4F, -8.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 9, 8, 8, 28, 9, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape45
		leftTrackWheelModels[6].setRotationPoint(-47F, -2F, 19F);

		leftTrackWheelModels[7].addShape3D(4F, -4F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 9, 8, 8, 28, 9, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape81
		leftTrackWheelModels[7].setRotationPoint(-47F, -2F, -20F);


		rightTrackWheelModels = new ModelRendererTurbo[5];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 60, textureX, textureY); // Import Shape75
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape77
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape78
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape79
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Import Shape80

		rightTrackWheelModels[0].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 6, 8, 8, 28, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape75
		rightTrackWheelModels[0].setRotationPoint(40F, -3F, -20F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape77
		rightTrackWheelModels[1].setRotationPoint(11F, 3F, -20F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape78
		rightTrackWheelModels[2].setRotationPoint(-3F, 3F, -20F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape79
		rightTrackWheelModels[3].setRotationPoint(-19F, 3F, -20F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 6, 12, 12, 40, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape80
		rightTrackWheelModels[4].setRotationPoint(-35F, 3F, -20F);

		fancyTrackModel = new ModelRendererTurbo[4];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 150, 700, textureX, textureY); // Box 0
		fancyTrackModel[1] = new ModelRendererTurbo(this, 150, 711, textureX, textureY); // Box 1
		fancyTrackModel[2] = new ModelRendererTurbo(this, 150, 711, textureX, textureY); // Box 2
		fancyTrackModel[3] = new ModelRendererTurbo(this, 150, 720, textureX, textureY); // Box 3

		fancyTrackModel[0].addBox(0.5F, -1F, -4F, 1, 1, 8, 0F); // Box 0

		fancyTrackModel[1].addShapeBox(-1.5F, -1F, -4F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1

		fancyTrackModel[2].addShapeBox(-1.5F, -1F, 3F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		fancyTrackModel[3].addShapeBox(-1.5F, -1F, -1.5F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 3

		drakonDoorModel = new ModelRendererTurbo[3];
		drakonDoorModel[0] = new ModelRendererTurbo(this, 230, 342, textureX, textureY); // Import Box139
		drakonDoorModel[1] = new ModelRendererTurbo(this, 230, 352, textureX, textureY); // Import Box140
		drakonDoorModel[2] = new ModelRendererTurbo(this, 230, 352, textureX, textureY); // Import Box141

		drakonDoorModel[0].addShapeBox(-8F, -1F, -5.5F, 13, 1, 5, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Import Box139

		drakonDoorModel[1].addShapeBox(-3F, -1.2F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Import Box140

		drakonDoorModel[2].addShapeBox(-6F, -1.2F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Import Box141
		
		
		drakonArmModel = new ModelRendererTurbo[4];
		drakonArmModel[0] = new ModelRendererTurbo(this, 230, 356, textureX, textureY); // Box 7
		drakonArmModel[1] = new ModelRendererTurbo(this, 230, 359, textureX, textureY); // Box 10
		drakonArmModel[2] = new ModelRendererTurbo(this, 230, 359, textureX, textureY); // Box 11
		drakonArmModel[3] = new ModelRendererTurbo(this, 230, 356, textureX, textureY); // Box 26

		drakonArmModel[0].addShapeBox(0F, -0.5F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		drakonArmModel[1].addShapeBox(1F, -4.5F, 0F, 5, 4, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 10

		drakonArmModel[2].addShapeBox(1F, -4.5F, 4F, 5, 4, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11

		drakonArmModel[3].addShapeBox(0F, -0.5F, 4F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		
		drakonRailModel = new ModelRendererTurbo[3];
		drakonRailModel[0] = new ModelRendererTurbo(this, 230, 371, textureX, textureY); // Box 12
		drakonRailModel[1] = new ModelRendererTurbo(this, 230, 377, textureX, textureY); // Box 13
		drakonRailModel[2] = new ModelRendererTurbo(this, 230, 365, textureX, textureY); // Box 14

		drakonRailModel[0].addShapeBox(-3.5F, -1F, -1.5F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 12

		drakonRailModel[1].addShapeBox(-9.5F, -2F, -1.5F, 16, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13

		drakonRailModel[2].addShapeBox(2.5F, -1F, -1.5F, 2, 2, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14

		


		drakonModel = new ModelRendererTurbo[17];
		drakonModel[0] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 15
		drakonModel[1] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 16
		drakonModel[2] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 17
		drakonModel[3] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 18
		drakonModel[4] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 20
		drakonModel[5] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 21
		drakonModel[6] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 30
		drakonModel[7] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 32
		drakonModel[8] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 33
		drakonModel[9] = new ModelRendererTurbo(this, 230, 399, textureX, textureY); // Box 22
		drakonModel[10] = new ModelRendererTurbo(this, 230, 399, textureX, textureY); // Box 23
		drakonModel[11] = new ModelRendererTurbo(this, 230, 399, textureX, textureY); // Box 24
		drakonModel[12] = new ModelRendererTurbo(this, 230, 399, textureX, textureY); // Box 25
		drakonModel[13] = new ModelRendererTurbo(this, 230, 407, textureX, textureY); // Box 26
		drakonModel[14] = new ModelRendererTurbo(this, 230, 407, textureX, textureY); // Box 27
		drakonModel[15] = new ModelRendererTurbo(this, 230, 407, textureX, textureY); // Box 28
		drakonModel[16] = new ModelRendererTurbo(this, 230, 407, textureX, textureY); // Box 29

		drakonModel[0].addShapeBox(-9.5F, -3F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15

		drakonModel[1].addShapeBox(-9.5F, -4F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		drakonModel[2].addShapeBox(-9.5F, -5F, -1.5F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		drakonModel[3].addShapeBox(7.5F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F); // Box 18

		drakonModel[4].addShapeBox(7.5F, -4F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F); // Box 20

		drakonModel[5].addShapeBox(7.5F, -3F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F); // Box 21

		drakonModel[6].addShapeBox(9.5F, -4F, -1.5F, 1, 1, 3, 0F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F); // Box 30

		drakonModel[7].addShapeBox(9.5F, -5F, -1.5F, 1, 1, 3, 0F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F); // Box 32

		drakonModel[8].addShapeBox(9.5F, -3F, -1.5F, 1, 1, 3, 0F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F); // Box 33

		drakonModel[9].addShapeBox(-8F, -3F, -3.5F, 3, 1, 5, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 22
		drakonModel[9].rotateAngleX = 0.78539816F;

		drakonModel[10].addShapeBox(-8F, -3F, 3.5F, 3, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F); // Box 23
		drakonModel[10].rotateAngleX = 0.78539816F;

		drakonModel[11].addShapeBox(-8F, -3F, -1.5F, 3, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 2F, -0.3F, 0F); // Box 24
		drakonModel[11].rotateAngleX = -0.78539816F;

		drakonModel[12].addShapeBox(-8F, -3F, -8.5F, 3, 1, 5, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 25
		drakonModel[12].rotateAngleX = -0.78539816F;

		drakonModel[13].addShapeBox(2F, -3F, -1.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 26
		drakonModel[13].rotateAngleX = 0.78539816F;

		drakonModel[14].addShapeBox(2F, -3F, 3.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 27
		drakonModel[14].rotateAngleX = 0.78539816F;

		drakonModel[15].addShapeBox(2F, -3F, -1.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 28
		drakonModel[15].rotateAngleX = -0.78539816F;

		drakonModel[16].addShapeBox(2F, -3F, -6.5F, 3, 1, 3, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 29
		drakonModel[16].rotateAngleX = -0.78539816F;
		
		
		
		drakonReloadModel = new ModelRendererTurbo[11];
		drakonReloadModel[0] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 15
		drakonReloadModel[1] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 16
		drakonReloadModel[2] = new ModelRendererTurbo(this, 230, 382, textureX, textureY); // Box 17
		drakonReloadModel[3] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 18
		drakonReloadModel[4] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 20
		drakonReloadModel[5] = new ModelRendererTurbo(this, 230, 387, textureX, textureY); // Box 21
		drakonReloadModel[6] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 30
		drakonReloadModel[7] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 32
		drakonReloadModel[8] = new ModelRendererTurbo(this, 230, 393, textureX, textureY); // Box 33
		drakonReloadModel[9] = new ModelRendererTurbo(this, 230, 412, textureX, textureY); // Box 27
		drakonReloadModel[10] = new ModelRendererTurbo(this, 230, 422, textureX, textureY); // Box 28

		drakonReloadModel[0].addShapeBox(-9.5F, -3F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15

		drakonReloadModel[1].addShapeBox(-9.5F, -4F, -1.5F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		drakonReloadModel[2].addShapeBox(-9.5F, -5F, -1.5F, 17, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		drakonReloadModel[3].addShapeBox(7.5F, -5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F); // Box 18
		
		drakonReloadModel[4].addShapeBox(7.5F, -4F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F); // Box 20

		drakonReloadModel[5].addShapeBox(7.5F, -3F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, 0F, -1F); // Box 21

		drakonReloadModel[6].addShapeBox(9.5F, -4F, -1.5F, 1, 1, 3, 0F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, -0.33F, -1F, -0.5F, -0.33F, -1F, 0F, -0.1F, -0.2F); // Box 30

		drakonReloadModel[7].addShapeBox(9.5F, -5F, -1.5F, 1, 1, 3, 0F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F); // Box 32

		drakonReloadModel[8].addShapeBox(9.5F, -3F, -1.5F, 1, 1, 3, 0F, 0F, 0.1F, -0.2F, -0.5F, 0.33F, -1F, -0.5F, 0.33F, -1F, 0F, 0.1F, -0.2F, 0F, -0.2F, -1.1F, -0.5F, -1F, -1.33F, -0.5F, -1F, -1.33F, 0F, -0.2F, -1.1F); // Box 33

		drakonReloadModel[9].addShapeBox(-10F, -5F, -1.5F, 5, 3, 3, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 27

		drakonReloadModel[10].addShapeBox(9F, -5F, -1.5F, 2, 3, 3, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 28	
		
		drakonArmAttach = new Vector3f(5F/16F, 21F/16F, 5F/16F);
		drakonRailAttach = new Vector3f(9.5F/16F, 25F/16F, 2.5F/16F);
		
		drakonDoorAttach = new Vector3f(-4F/16F, 21F/16F, -0.5F/16F);
		

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}