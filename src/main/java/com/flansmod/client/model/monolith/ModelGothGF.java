
package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGothGF extends ModelCustomArmour 
{
	int textureX = 128;
	int textureY = 128;

	public ModelGothGF() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];
		bodyModel = new ModelRendererTurbo[69];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 6
		headModel[1] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 59
		headModel[2] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 65
		headModel[3] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 66
		headModel[4] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 67
		headModel[5] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 68
		headModel[6] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 72
		headModel[7] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 75
		headModel[8] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 76
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 77
		headModel[10] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 78
		headModel[11] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 79
		headModel[12] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 87
		headModel[13] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 57
		headModel[14] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 61
		headModel[15] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 85
		headModel[16] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 86
		headModel[17] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 111
		headModel[18] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 130
		headModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 133
		headModel[20] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 134
		headModel[21] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 135
		headModel[22] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 136
		headModel[23] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 137
		headModel[24] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 138
		headModel[25] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 139
		headModel[26] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 140
		headModel[27] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 141
		headModel[28] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 142
		headModel[29] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 161

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -0.5F, 3.5F, 8, 1, 1, 0F,0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 59
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -2F, 3.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -8F, 3.5F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3.5F, -9F, 3.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 67
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -9F, -4.5F, 7, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -1.7F, 4F, 10, 2, 1, 0F,-0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0.4F, -1F, -0.6F, -0.4F, -1F, -0.6F, -0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 72
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -9.01F, -2.5F, 1, 1, 2, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -9F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -9F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 77
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -8F, 3.5F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 78
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -2F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 79
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -8.5F, -1.5F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -8.6F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.5F, -8.6F, -4.5F, 4, 3, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F); // Box 61
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.5F, -3.5F, -4.5F, 1, 2, 7, 0F,0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0F, -1F, -0.5F, -0.2F, -1F, -0.5F, 0F, 1.3F, 1F, 0F, 1.3F, 1F); // Box 85
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -8.5F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 86
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -5.5F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 111
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.5F, -6.5F, -4.5F, 1, 2, 8, 0F,0.3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3.5F, -9F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 133
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.5F, -9F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3.5F, -9.01F, -2.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(3.5F, -8.5F, -4.5F, 1, 2, 8, 0F,0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 136
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.5F, -6.5F, -4.5F, 1, 2, 8, 0F,0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.5F, -5.5F, -4.5F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 138
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.5F, -3.5F, -4.5F, 1, 2, 7, 0F,0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 1F, 0F, 0F, 1F, -0.2F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1.3F, 1F, 0F, 1.3F, 1F); // Box 139
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.5F, -2F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F); // Box 140
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3.5F, -8F, 3.5F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 141
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-0.5F, -8.6F, -4.5F, 4, 3, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.4F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 142
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.5F, -8.5F, -1.5F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		headModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 71
		bodyModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 72
		bodyModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 88
		bodyModel[19] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 90
		bodyModel[20] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 97
		bodyModel[21] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 64
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 78
		bodyModel[26] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 69
		bodyModel[27] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 70
		bodyModel[28] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 72
		bodyModel[30] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 73
		bodyModel[31] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 75
		bodyModel[32] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 76
		bodyModel[33] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 77
		bodyModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 118
		bodyModel[35] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 122
		bodyModel[36] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 123
		bodyModel[37] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 124
		bodyModel[38] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 125
		bodyModel[39] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 126
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 127
		bodyModel[41] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 130
		bodyModel[44] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 144
		bodyModel[46] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 145
		bodyModel[47] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 146
		bodyModel[48] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 147
		bodyModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 148
		bodyModel[50] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 149
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 150
		bodyModel[52] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 151
		bodyModel[53] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 155
		bodyModel[54] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 159
		bodyModel[55] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 160
		bodyModel[56] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		bodyModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		bodyModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		bodyModel[60] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 25
		bodyModel[61] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 26
		bodyModel[62] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 129
		bodyModel[66] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 130
		bodyModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 131
		bodyModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 132

		bodyModel[0].addShapeBox(-4F, 2F, -2F, 8, 3, 4, 0F,-0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0.5F, -1.8F, -1.5F, 0.5F, -1.8F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 2, 4, 0F,-1.2F, -0.4F, 1F, -1.2F, -0.4F, 1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -1.5F, -0.5F, 1F, -1.5F, -0.5F, 1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 5F, -3F, 7, 4, 4, 0F,-1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, -0.7F, 0.4F, 0F, -0.7F, 0.4F, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 11F, -2F, 6, 2, 4, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 3, 4, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.8F, -0.2F, -0.7F, -0.8F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 8.8F, -2F, 4, 1, 5, 0F,-1.5F, 2F, -1F, -1F, 0F, -0.5F, -1.3F, 0.2F, -1.3F, -0.8F, 1.5F, -1.6F, -0.5F, -0.3F, 0.5F, -0.8F, 0.3F, 0.2F, -0.4F, 0F, 0.5F, 0F, -0.8F, 0F); // Box 7
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 0.2F, -2.19F, 4, 2, 2, 0F,-0.2F, -0.7F, -0.9F, -0.3F, -1.5F, -0.3F, -1.5F, -0.5F, -0.8F, 0.5F, 0F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 19
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 2F, -2F, 8, 3, 4, 0F,-0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0.8F, -1.5F, 0F, 0.8F, -1.5F, 0.5F, -1.5F, -1.5F, 0.5F, -1.5F); // Box 0
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 2.7F, -2.21F, 4, 2, 2, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.7F, 0.4F, 0F, -1.5F, 0.4F, 0F, -1.2F, -2F, -0.5F, -1.2F, -2F); // Box 18
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 3F, -3.4F, 3, 1, 1, 0F,0.1F, -0.6F, -0.2F, 0.1F, -0.8F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0.6F, -0.2F, 0.3F, 0.6F, -0.2F, 0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 20
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.3F, 2.9F, -4.19F, 3, 1, 1, 0F,0.3F, -2.1F, 0.5F, -0.4F, -2.2F, 0.5F, -0.1F, -0.9F, 0F, 0.3F, -0.7F, 0F, 0.7F, 1.9F, 0.5F, -0.1F, 1.9F, 0.5F, 0.1F, 0.7F, 0F, 0.7F, 0.7F, 0F); // Box 21
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.3F, 4.89F, -4.2F, 3, 2, 1, 0F,0.7F, -0.9F, 0.5F, -0.1F, -0.9F, 0.5F, 0.1F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.5F, 1.1F, 0.8F, -0.6F, 1F, 0.8F, -0.5F, 0.9F, 0F, 0.6F, 1F, 0F); // Box 22
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 3.79F, -3.4F, 3, 3, 1, 0F,0.5F, -0.8F, -0.2F, 0.3F, -0.8F, -0.2F, 0.5F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.4F, 1.1F, -0.2F, -0.3F, 1F, -0.2F, 0.5F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 23
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.3F, 3.4F, -5.7F, 3, 1, 1, 0F,-0.5F, -3.4F, 0F, -2.2F, -3.4F, 0F, -0.4F, -1.7F, 0F, 0.3F, -1.6F, 0F, -0.4F, 2.7F, 0F, -2F, 2.7F, 0F, -0.1F, 1.4F, 0F, 0.7F, 1.4F, 0F); // Box 24
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.3F, 6.79F, -5.7F, 3, 2, 1, 0F,-0.4F, -0.3F, 0F, -2F, -0.3F, 0F, -0.1F, 1F, 0F, 0.7F, 1F, 0F, -0.5F, -1.4F, 0F, -2.2F, -1.4F, 0F, -0.6F, -0.9F, -0.3F, 0.5F, -0.8F, -0.3F); // Box 25
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 3.79F, -2F, 3, 2, 1, 0F,0F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.3F, 1F, 0.5F, 0F, 1.1F, 0.8F, 0.3F, 1.5F, 0.2F, 0.5F, 1.5F, 0.2F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 26
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 5F, -3F, 7, 2, 4, 0F,-0.5F, -2.5F, 1F, -0.5F, -2.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, -0.6F, 1.5F, 0F, -0.6F, 1.5F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 71
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 7F, -3F, 3, 4, 4, 0F,-0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0.7F, 0F, 0.3F, -0.3F, 0F, 0.3F, 1.6F, 0F, 0.3F, 1.6F, 0F, 0.3F, 0.6F, -1F, 3.7F, 1.6F, -1F, 2.9F); // Box 72
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 3F, -2F, 1, 2, 3, 0F,0.5F, -0.2F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1.3F, 1F, 0.4F, -1.3F, 1F); // Box 88
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 3F, 0F, 4, 2, 1, 0F,0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, -1.3F, 1F); // Box 90
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, 0F, 0F, 7, 2, 1, 0F,1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0F, 0.1F, 0.7F, 0F, 0.1F, 0.7F, 0.2F, 0.85F, 0.5F, 0.2F, 0.85F, 0.5F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 1F); // Box 97
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.01F, 5F, -5F, 1, 2, 2, 0F,0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 1.2F, 1.2F, 0F, 1F, 1.2F, 0F, 1F, 1.5F, -0.2F, 1F, 1.5F, -0.2F); // Box 55
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 6F, -5F, 1, 1, 1, 0F,-0.9F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0.2F, 0.2F, -0.7F, 0.3F, 1.2F, 0F, -1F, 1.2F, 0F, -1F, 1.1F, -1F, 0.3F, 1.1F, -1F); // Box 56
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, 5F, -5F, 1, 2, 2, 0F,0.5F, -2.5F, 1F, 0.5F, -2F, 0.5F, 0.5F, 1.5F, 1F, 0F, 1.5F, 1F, -0.5F, 1.2F, 0F, 0.5F, 0.9F, 0F, 0.5F, 1F, -0.2F, -0.5F, 1.5F, -0.2F); // Box 62
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.01F, 6F, -5F, 1, 2, 5, 0F,0.2F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 4F, 0F, -0.4F, 4F, 0F, 0.3F, 0.2F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, -0.5F, 1.5F, 1F); // Box 64
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.5F, 7F, -2.9F, 7, 1, 4, 0F,0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 1F, 1.5F, 0.5F, 1F, 1.5F, 0.5F, 0.3F, -0.4F, 0.8F, 0.3F, -0.4F, 0.8F); // Box 78
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.01F, 5F, -5F, 3, 1, 2, 0F,-0.4F, -0.2F, 0F, 0.2F, -0.4F, 0F, 1F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, 0.2F, -0.2F, -0.3F, 1.5F, 0F, 0F, 2F, -2F, 0F, 0F, -1.58F, 0F); // Box 69
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.01F, 5F, -7F, 3, 1, 2, 0F,-1.2F, -2.2F, -1F, -1.2F, -2.2F, -1F, 0.19F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.9F, 1.5F, -1F, -1F, 1.5F, -1F, 0F, 0F, 0F, 0.2F, -0.2F, 0.3F); // Box 70
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.01F, 5F, -7F, 1, 1, 2, 0F,1.2F, -2.2F, -1F, -1F, -1.5F, -1.3F, -0.75F, -0.4F, 0F, -0.1F, -0.4F, 0F, 1F, 1.5F, -1F, 0F, 1F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.01F, 5F, -3F, 3, 1, 2, 0F,-0.5F, 1.5F, 0.5F, 1F, 1.5F, 0.5F, 1.2F, 3.5F, -0.9F, 0.2F, 3.5F, -0.8F, 0F, -1.58F, 0F, 2F, -2F, 0F, 2.5F, -4F, -1F, -0.2F, -3.5F, 0.7F); // Box 72
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2.5F, -1F, -1F, 3, 3, 3, 0F,-0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-7F, -0.5F, -1F, 4, 2, 3, 0F,-1F, -0.2F, -0.2F, 0.8F, 0.2F, 0.5F, 1F, 0.2F, 0.2F, -1F, -0.2F, 0.2F, -2F, 1.3F, 1F, 0.8F, 0.3F, 2.5F, 0.4F, 0.8F, 0.3F, -1.5F, 0.3F, 0.5F); // Box 75
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1.01F, 1.5F, -2.6F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F); // Box 76
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.01F, -0.5F, -1.6F, 2, 3, 1, 0F,-0.3F, -0.8F, 0.2F, -1F, -0.8F, 0F, -1F, -0.7F, 0.2F, -0.3F, -0.7F, 0.2F, -2.3F, -0.3F, 1F, 0.7F, -0.3F, 1F, 0.7F, 0.4F, 0F, -2.3F, 0.4F, 0F); // Box 77
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 8.8F, -2F, 4, 1, 5, 0F,-1F, 0F, -0.5F, -1.5F, 2F, -1F, -0.8F, 1.5F, -1.6F, -1.3F, 0.2F, -1.3F, -0.8F, 0.3F, 0.2F, -0.5F, -0.3F, 0.5F, 0F, -0.8F, 0F, -0.4F, 0F, 0.5F); // Box 118
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 0.2F, -2.19F, 4, 2, 2, 0F,-0.3F, -1.5F, -0.3F, -0.2F, -0.7F, -0.9F, 0.5F, 0F, -0.5F, -1.5F, -0.5F, -0.8F, 0F, 0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 122
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 2.7F, -2.21F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.4F, -0.5F, -1.7F, 0.4F, -0.5F, -1.2F, -2F, 0F, -1.2F, -2F); // Box 123
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.5F, 3F, -3.4F, 3, 1, 1, 0F,0.1F, -0.8F, -0.2F, 0.1F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0.3F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F); // Box 124
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(0.5F, 3.79F, -2F, 3, 2, 1, 0F,0.5F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1.1F, 0.8F, 0.3F, 1F, 0.5F, 0.5F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, -0.2F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 125
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.5F, 3.79F, -3.4F, 3, 3, 1, 0F,0.3F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, 0F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, -0.3F, 1F, -0.2F, 0.4F, 1.1F, -0.2F, 0.3F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 126
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0.3F, 4.89F, -4.2F, 3, 2, 1, 0F,-0.1F, -0.9F, 0.5F, 0.7F, -0.9F, 0.5F, 0.7F, 0.3F, 0F, 0.1F, 0.3F, 0F, -0.6F, 1F, 0.8F, 0.5F, 1.1F, 0.8F, 0.6F, 1F, 0F, -0.5F, 0.9F, 0F); // Box 127
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.3F, 2.9F, -4.19F, 3, 1, 1, 0F,-0.4F, -2.2F, 0.5F, 0.3F, -2.1F, 0.5F, 0.3F, -0.7F, 0F, -0.1F, -0.9F, 0F, -0.1F, 1.9F, 0.5F, 0.7F, 1.9F, 0.5F, 0.7F, 0.7F, 0F, 0.1F, 0.7F, 0F); // Box 128
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.3F, 3.4F, -5.7F, 3, 1, 1, 0F,-2.2F, -3.4F, 0F, -0.5F, -3.4F, 0F, 0.3F, -1.6F, 0F, -0.4F, -1.7F, 0F, -2F, 2.7F, 0F, -0.4F, 2.7F, 0F, 0.7F, 1.4F, 0F, -0.1F, 1.4F, 0F); // Box 129
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0.3F, 6.79F, -5.7F, 3, 2, 1, 0F,-2F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.7F, 1F, 0F, -0.1F, 1F, 0F, -2.2F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0.5F, -0.8F, -0.3F, -0.6F, -0.9F, -0.3F); // Box 130
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1.01F, 5F, -3F, 3, 1, 2, 0F,1F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.2F, 3.5F, -0.8F, 1.2F, 3.5F, -0.9F, 2F, -2F, 0F, 0F, -1.58F, 0F, -0.2F, -3.5F, 0.7F, 2.5F, -4F, -1F); // Box 143
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.01F, 5F, -5F, 3, 1, 2, 0F,0.2F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.5F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1.5F, 0F, 0F, 0.2F, -0.2F, -0.3F, 0F, -1.58F, 0F, 2F, -2F, 0F); // Box 144
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-0.01F, 5F, -7F, 1, 1, 2, 0F,-1F, -1.5F, -1.3F, 1.2F, -2.2F, -1F, -0.1F, -0.4F, 0F, -0.75F, -0.4F, 0F, 0F, 1F, -1.5F, 1F, 1.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 145
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(0.99F, 5F, -7F, 3, 1, 2, 0F,-1.2F, -2.2F, -1F, -1.2F, -2.2F, -1F, -0.4F, -0.2F, 0F, 0.19F, -0.4F, 0F, -1F, 1.5F, -1F, -0.9F, 1.5F, -1F, 0.2F, -0.2F, 0.3F, 0F, 0F, 0F); // Box 146
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(3.01F, 6F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0.2F, -0.3F, -0.4F, 4F, 0F, 0F, 4F, 0F, 1F, 0F, 0F, 0.3F, 0.2F, 0F, -0.5F, 1.5F, 1F, 1F, 1.5F, 0F); // Box 147
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3F, 6F, -5F, 1, 1, 1, 0F,0F, -1.5F, 1F, -0.9F, -1.5F, 1F, 0.2F, 0.2F, -0.7F, 0F, 0F, 0F, -1F, 1.2F, 0F, 0.3F, 1.2F, 0F, 0.3F, 1.1F, -1F, -1F, 1.1F, -1F); // Box 148
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0.5F, 5F, -5F, 1, 2, 2, 0F,0.5F, -2F, 0.5F, 0.5F, -2.5F, 1F, 0F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 0.9F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.5F, -0.2F, 0.5F, 1F, -0.2F); // Box 149
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(2.01F, 5F, -5F, 1, 2, 2, 0F,0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 1F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1F, 1.5F, -0.2F, 1F, 1.5F, -0.2F); // Box 150
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(2F, 3F, -2F, 1, 2, 3, 0F,0F, -0.5F, -1F, 0.5F, -0.2F, 0F, 0.7F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.4F, -1.3F, 1F, 0F, -1.3F, 1F); // Box 151
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-0.5F, -1F, -1F, 3, 3, 3, 0F,-1F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(3F, -0.5F, -1F, 4, 2, 3, 0F,0.8F, 0.2F, 0.7F, -1F, -0.2F, 0F, -1F, -0.2F, 0.2F, 1F, 0.2F, 0.2F, 0.8F, 0.3F, 2.5F, -2F, 1.3F, 1.3F, -1.5F, 0.3F, 0.5F, 0.4F, 0.8F, 0.3F); // Box 159
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(0.99F, -0.5F, -1.6F, 2, 3, 1, 0F,-1F, -0.8F, 0F, -0.3F, -0.8F, 0.2F, -0.3F, -0.7F, 0.2F, -1F, -0.7F, 0.2F, 0.7F, -0.3F, 1F, -2.3F, -0.3F, 1F, -2.3F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 160
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-4F, 10.8F, -2F, 3, 3, 5, 0F,1F, -0.3F, 1F, 0.5F, -0.3F, 1F, -0.6F, 0F, 1.3F, 1F, 0.8F, 0.1F, 1.1F, 0F, 1.4F, 0.9F, -1.5F, 1.4F, 0.1F, 0.3F, 1F, 1.5F, -0.5F, 0F); // Box 5
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4F, 13.8F, -2F, 3, 3, 5, 0F,1.1F, 0F, 1.4F, 0.9F, 1.5F, 1.4F, 0.1F, -0.3F, 1F, 1.5F, 0.5F, 0F, 0.2F, -0.5F, 0.9F, 0.8F, -0.5F, 0.9F, 0.8F, -0.5F, -1F, 0.2F, -0.5F, -1F); // Box 8
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4F, 9.8F, -2F, 4, 1, 5, 0F,-0.5F, 0.3F, 0.5F, -1F, 0F, 0F, -0.4F, 0F, 0.2F, 0F, 0.8F, 0F, 1F, 0.3F, 1F, -0.5F, 0.3F, 1F, -1.6F, 0F, 1.3F, 1F, -0.8F, 0.1F); // Box 76
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-1.2F, 10.8F, -2F, 1, 3, 5, 0F,0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.2F, 0F, 0.1F, 0.4F, 0F, 1.3F, 0.9F, -1.5F, 0.4F, -0.1F, -1.5F, 0.4F, 0.2F, 0F, 0F, -0.3F, 0.3F, 1F); // Box 24
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-1.2F, 13.8F, 1F, 1, 3, 2, 0F,0.9F, 1F, 2.4F, -0.1F, 1F, 2.4F, 0.2F, 0F, 0F, -0.3F, -0.3F, 1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.1F, -0.5F, -1F, -1F, -0.5F, -1F); // Box 25
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1.2F, 9.81F, 1F, 1, 1, 2, 0F,0.9F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.19F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0.2F, 0F, 0.1F, 0.4F, 0F, 1.3F); // Box 26
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(0.2F, 13.8F, 1F, 1, 3, 2, 0F,-0.1F, 1F, 2.4F, 0.9F, 1F, 2.4F, -0.3F, -0.3F, 1F, 0.2F, 0F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -1F, -0.5F, -1F, 0.1F, -0.5F, -1F); // Box 126
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(0.2F, 10.8F, -2F, 1, 3, 5, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.4F, 0F, 1.3F, 0.2F, 0F, 0.1F, -0.1F, -1.5F, 0.4F, 0.9F, -1.5F, 0.4F, -0.3F, 0.3F, 1F, 0.2F, 0F, 0F); // Box 127
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(0.2F, 9.81F, 1F, 1, 1, 2, 0F,-0.1F, -0.5F, 0.4F, 0.9F, -0.5F, 0.4F, -0.8F, 0F, 0.2F, -0.19F, 0F, 0.2F, -0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.4F, 0F, 1.3F, 0.2F, 0F, 0.1F); // Box 128
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0F, 9.8F, -2F, 4, 1, 5, 0F,-1F, 0F, 0F, -0.5F, 0.3F, 0.5F, 0F, 0.8F, 0F, -0.4F, 0F, 0.2F, -0.5F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, -0.8F, 0.1F, -1.6F, 0F, 1.3F); // Box 129
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(1F, 10.8F, -2F, 3, 3, 5, 0F,0.5F, -0.3F, 1F, 1F, -0.3F, 1F, 1F, 0.8F, 0.1F, -0.6F, 0F, 1.3F, 0.9F, -1.5F, 1.4F, 1.1F, 0F, 1.4F, 1.5F, -0.5F, 0F, 0.1F, 0.3F, 1F); // Box 130
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(1F, 13.8F, -2F, 3, 3, 5, 0F,0.9F, 1.5F, 1.4F, 1.1F, 0F, 1.4F, 1.5F, 0.5F, 0F, 0.1F, -0.3F, 1F, 0.8F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, -0.5F, -1F, 0.8F, -0.5F, -1F); // Box 131
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(0.5F, 7F, -3F, 3, 4, 4, 0F,-0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 1.6F, 0F, 0.3F, 1.6F, 0F, 0.3F, 1.6F, -1F, 2.9F, 0.6F, -1F, 3.7F); // Box 132
		bodyModel[68].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 104
		leftArmModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 131
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 132
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 156
		leftArmModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 157
		leftArmModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 158

		leftArmModel[0].addShapeBox(-0.8F, 8.5F, -1.6F, 3, 1, 3, 0F,0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 104
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -1F, 3, 7, 3, 0F,0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 131
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, 0F, -1.8F, -0.6F, 0F, -1.8F); // Box 132
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2F, -1F, 3, 6, 3, 0F,1F, -1F, 1F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 156
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 4F, -1F, 3, 4, 4, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.2F, 0F, -0.7F, -0.2F, -0.5F, 0.7F, 0.5F, -0.5F, 0.5F, 0.5F, 0.5F, -1.2F, -0.2F, 0.7F, -1.2F); // Box 157
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -1.99F, -1F, 3, 1, 3, 0F,0.5F, 0.2F, 0.5F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.99F, 0F, 1.01F, -1.5F, -0.8F, 0F, -1.5F, -0.8F, -0.7F, 0.2F, 0F, -0.7F); // Box 158
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 11
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 8
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 12
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 93

		rightArmModel[0].addShapeBox(-2F, -2F, -1F, 3, 7, 3, 0F,-1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.5F, 0.8F, -0.6F, -0.5F, 0.8F, -0.6F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 11
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2F, -2F, -1F, 3, 6, 3, 0F,-1F, 0F, -0.2F, 1F, -1F, 1F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 8
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2F, -1.99F, -1F, 3, 1, 3, 0F,-1F, 0F, -0.2F, 0.5F, 0.2F, 0.5F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, -1.5F, -0.8F, 0F, 0.99F, 0F, 1.01F, 0.2F, 0F, -0.7F, -1.5F, -0.8F, -0.7F); // Box 12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2F, 4F, -1F, 3, 4, 4, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, -0.5F, 0.5F, -0.2F, -0.5F, 0.7F, -0.2F, 0.7F, -1.2F, 0.5F, 0.5F, -1.2F); // Box 93
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 121
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 152
		leftLegModel[2] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 153
		leftLegModel[3] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 154
		leftLegModel[4] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 162

		leftLegModel[0].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.8F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, 0.2F, -0.8F, 0F, 0.2F); // Box 121
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.9F, 9.8F, -2F, 4, 2, 4, 0F,-0.5F, -0.9F, -0.2F, -0.1F, -0.9F, -0.2F, -0.1F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.4F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F); // Box 152
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 6F, -2F, 3, 3, 3, 0F,0.3F, 0F, 0.6F, 1.7F, 0F, 0.6F, 2.1F, 0.7F, 2.6F, 0.3F, 0.7F, 2.6F, 0.3F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, -0.5F, 2.5F, 0.3F, -0.5F, 2.5F); // Box 153
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2.3F, 2F, -3F, 4, 5, 4, 0F,0.3F, 0F, 0.6F, 1.7F, 0F, 0.6F, 2.1F, 0.7F, 2.6F, -0.4F, 0.7F, 3.6F, 0.3F, 0F, -0.4F, 1.6F, 0F, -0.4F, 1.6F, -0.5F, 3F, -0.4F, -0.5F, 3F); // Box 154
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, -1F, -3F, 3, 3, 4, 0F,1.6F, 0F, 0.3F, 1.6F, 0F, 0.3F, 1.6F, 1F, 2.9F, 0.6F, 1F, 3.7F, 2F, 0F, 0.6F, 2F, 0F, 0.6F, 2.4F, -0.7F, 2.6F, 0.4F, -0.7F, 3.6F); // Box 162
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 9
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 86
		rightLegModel[2] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 52
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 53
		rightLegModel[4] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 66

		rightLegModel[0].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,0.2F, 0.5F, 0.7F, -0.2F, 0.5F, 0.7F, -0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.7F, 0F, -1.2F, -0.8F, 0F, -1.2F, -0.8F, 0F, 0.2F, -0.7F, 0F, 0.2F); // Box 9
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.3F, 9.8F, -2F, 4, 2, 4, 0F,-0.5F, -0.9F, -0.2F, -0.1F, -0.9F, -0.2F, -0.1F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.4F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F); // Box 86
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1.5F, -1F, -3F, 3, 3, 4, 0F,1.6F, 0F, 0.3F, 1.6F, 0F, 0.3F, 0.6F, 1F, 3.7F, 1.6F, 1F, 2.9F, 2F, 0F, 0.6F, 2F, 0F, 0.6F, 0.4F, -0.7F, 3.6F, 2.4F, -0.7F, 2.6F); // Box 52
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-1.7F, 2F, -3F, 4, 5, 4, 0F,1.7F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.4F, 0.7F, 3.6F, 2.1F, 0.7F, 2.6F, 1.6F, 0F, -0.4F, 0.3F, 0F, -0.4F, -0.4F, -0.5F, 3F, 1.6F, -0.5F, 3F); // Box 53
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-1.2F, 6F, -2F, 3, 3, 3, 0F,1.7F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0.7F, 2.6F, 2.1F, 0.7F, 2.6F, 1.6F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 2.5F, 1.6F, -0.5F, 2.5F); // Box 66
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}