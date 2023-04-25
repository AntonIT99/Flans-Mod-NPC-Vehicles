//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SentryGun
// Model Creator:
// Created on: 15.05.2020 - 15:37:14
// Last changed on: 15.05.2020 - 15:37:14

package com.wolffsmod.model.official.mw; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.wolffsmod.model.ModelFlanVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanAAGun;

import net.minecraft.entity.Entity;

    public class ModelSentryGun extends ModelFlanAAGun //Same as Filename
    {
        int textureX = 64;
        int textureY = 64;

        public ModelSentryGun() //Same as Filename
        {
            baseModel = new ModelRendererTurbo[18];
            baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Base
            baseModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Base
            baseModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Base
            baseModel[3] = new ModelRendererTurbo(this, 48, 0, textureX, textureY); // Base
            baseModel[4] = new ModelRendererTurbo(this, 56, 0, textureX, textureY); // Base
            baseModel[5] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Turret Part 1
            baseModel[6] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Turret Part 1
            baseModel[7] = new ModelRendererTurbo(this, 16, 19, textureX, textureY); // Turret Part 1
            baseModel[8] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Turret Part 1
            baseModel[9] = new ModelRendererTurbo(this, 17, 27, textureX, textureY); // Turret Part 1
            baseModel[10] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Turret Part 1
            baseModel[11] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Turret Part 1
            baseModel[12] = new ModelRendererTurbo(this, 12, 49, textureX, textureY); // Turret Part 2
            baseModel[13] = new ModelRendererTurbo(this, 24, 49, textureX, textureY); // Turret Part 2
            baseModel[14] = new ModelRendererTurbo(this, 34, 18, textureX, textureY); // Turret Part 2
            baseModel[15] = new ModelRendererTurbo(this, 34, 20, textureX, textureY); // Turret Part 2
            baseModel[16] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Turret Part 2
            baseModel[17] = new ModelRendererTurbo(this, 34, 24, textureX, textureY); // Turret Part 2

            baseModel[0].addBox(-4F, -8F, -4F, 8, 2, 8, 0F); // Import
            baseModel[0].setRotationPoint(0F, -13.8F, 0F);
            baseModel[0].rotateAngleY = -3.14159265F;
            baseModel[0].rotateAngleZ = 3.12413936F;

            baseModel[1].addShapeBox(-4F, -24F, -4F, 2, 16, 2, 0F, 4F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, -4F, 4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
            baseModel[1].setRotationPoint(0F, -13.8F, 0F);
            baseModel[1].rotateAngleY = -3.14159265F;
            baseModel[1].rotateAngleZ = 3.12413936F;

            baseModel[2].addShapeBox(2F, -24F, -4F, 2, 16, 2, 0F, -4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
            baseModel[2].setRotationPoint(0F, -13.8F, 0F);
            baseModel[2].rotateAngleY = -3.14159265F;
            baseModel[2].rotateAngleZ = 3.12413936F;

            baseModel[3].addShapeBox(2F, -24F, 2F, 2, 16, 2, 0F, -4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
            baseModel[3].setRotationPoint(0F, -13.8F, 0F);
            baseModel[3].rotateAngleY = -3.14159265F;
            baseModel[3].rotateAngleZ = 3.12413936F;

            baseModel[4].addShapeBox(-4F, -24F, 2F, 2, 16, 2, 0F, 4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 4F, 4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import
            baseModel[4].setRotationPoint(0F, -13.8F, 0F);
            baseModel[4].rotateAngleY = -3.14159265F;
            baseModel[4].rotateAngleZ = 3.12413936F;

            baseModel[5].addBox(-4F, -6F, -4F, 8, 1, 8, 0F); // Import Base
            baseModel[5].setRotationPoint(0F, -13.8F, 0F);
            baseModel[5].rotateAngleY = -3.14159265F;
            baseModel[5].rotateAngleZ = 3.12413936F;

            baseModel[6].addBox(-2F, -5F, -4F, 4, 7, 1, 0F); // Import Sidebit
            baseModel[6].setRotationPoint(0F, -13.8F, 0F);
            baseModel[6].rotateAngleY = -3.14159265F;
            baseModel[6].rotateAngleZ = 3.12413936F;

            baseModel[7].addBox(-2F, -5F, 3F, 4, 7, 1, 0F); // Import Sidebit
            baseModel[7].setRotationPoint(0F, -13.8F, 0F);
            baseModel[7].rotateAngleY = -3.14159265F;
            baseModel[7].rotateAngleZ = 3.12413936F;

            baseModel[8].addBox(-3F, -6F, 4F, 6, 6, 2, 0F); // Import Ammobox
            baseModel[8].setRotationPoint(0F, -13.8F, 0F);
            baseModel[8].rotateAngleY = -3.14159265F;
            baseModel[8].rotateAngleZ = 3.12413936F;

            baseModel[9].addBox(-3F, -5F, -9F, 6, 5, 5, 0F); // Import Camera
            baseModel[9].setRotationPoint(0F, -13.8F, 0F);
            baseModel[9].rotateAngleY = -3.14159265F;
            baseModel[9].rotateAngleZ = 3.12413936F;

            baseModel[10].addBox(-4F, -3F, -3F, 8, 6, 6, 0F); // Import
            baseModel[10].setRotationPoint(0F, -13.8F, 0F);

            baseModel[11].addBox(4F, -1F, -2F, 2, 4, 4, 0F); // Import
            baseModel[11].setRotationPoint(0F, -13.8F, 0F);

            baseModel[12].addBox(8F, -1F, -2F, 2, 4, 4, 0F); // Import
            baseModel[12].setRotationPoint(0F, -13.8F, 0F);

            baseModel[13].addBox(14F, -1F, -2F, 4, 4, 4, 0F); // Import
            baseModel[13].setRotationPoint(0F, -13.8F, 0F);

            baseModel[14].addBox(6F, 1.5F, 0.5F, 14, 1, 1, 0F); // Import
            baseModel[14].setRotationPoint(0F, -13.8F, 0F);

            baseModel[15].addBox(6F, 1.5F, -1.5F, 14, 1, 1, 0F); // Import
            baseModel[15].setRotationPoint(0F, -13.8F, 0F);

            baseModel[16].addBox(6F, -0.5F, -1.5F, 14, 1, 1, 0F); // Import
            baseModel[16].setRotationPoint(0F, -13.8F, 0F);

            baseModel[17].addBox(6F, -0.5F, 0.5F, 14, 1, 1, 0F); // Import
            baseModel[17].setRotationPoint(0F, -13.8F, 0F);


            flipAll();
        }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        for (ModelRendererTurbo modelRendererTurbo : baseModel)
            modelRendererTurbo.render(f5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        for (int i = 5; i < 18; i++)
        {
            baseModel[i].rotateAngleY = - f3 / (180F / (float)Math.PI) + ((i <= 9) ? -3.14159265F : 0F);
            baseModel[i].rotateAngleZ = ((i <= 9) ? 1F : -1F) * (f4 / (180F / (float)Math.PI) + ((i <= 9) ? 3.12413936F : 0F));
        }
    }
}
