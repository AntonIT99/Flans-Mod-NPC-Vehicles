//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelScorpio extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelScorpio() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[7];
        this.barrelModel = new ModelRendererTurbo[15];
        this.initbodyModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-0.5f, 0.0f, -0.5f, 1, 15, 1, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.bodyModel[1].addBox(-0.5f, 0.0f, -0.5f, 13, 1, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(-6.0f, 9.0f, 0.0f);
        this.bodyModel[2].addBox(-0.5f, 0.0f, -0.5f, 1, 1, 13, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 9.0f, -6.0f);
        this.bodyModel[3].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 9, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 3.0f, 0.0f);
        this.bodyModel[3].rotateAngleX = -0.80285144f;
        this.bodyModel[4].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 9, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 3.0f, 0.0f);
        this.bodyModel[4].rotateAngleX = -0.80285144f;
        this.bodyModel[4].rotateAngleY = -1.5707964f;
        this.bodyModel[5].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 9, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 3.0f, 0.0f);
        this.bodyModel[5].rotateAngleX = -0.80285144f;
        this.bodyModel[5].rotateAngleY = -3.1415927f;
        this.bodyModel[6].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 9, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 3.0f, 0.0f);
        this.bodyModel[6].rotateAngleX = -0.80285144f;
        this.bodyModel[6].rotateAngleY = -4.712389f;
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-22.5f, -3.0f, -1.0f, 32, 3, 2, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[1].addShapeBox(4.5f, -11.0f, 7.0f, 2, 13, 2, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[1].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[2].addShapeBox(4.5f, -11.0f, -9.0f, 2, 13, 2, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[2].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[3].addShapeBox(4.0f, -1.5f, 0.0f, 3, 2, 10, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, -1.0f, 0.2f);
        this.barrelModel[3].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[4].addShapeBox(4.0f, -1.5f, -10.0f, 3, 2, 10, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[4].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[5].addShapeBox(4.5f, -3.5f, 7.5f, 1, 1, 11, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f);
        this.barrelModel[5].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[6].addShapeBox(4.5f, -3.5f, -18.5f, 1, 1, 11, 0.0f, 6.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[6].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[7].addShapeBox(5.0f, -7.5f, 2.0f, 1, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[8].addShapeBox(5.0f, -7.5f, -8.0f, 1, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[9].addShapeBox(5.0f, -9.5f, -2.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[9].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[10].addShapeBox(5.0f, -8.5f, -2.99f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[10].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[11].addShapeBox(5.0f, -8.5f, 2.01f, 1, 1, 1, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[11].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[12].addBox(-21.5f, -3.5f, -3.0f, 4, 4, 2, 0.0f);
        this.barrelModel[12].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[13].addBox(-20.0f, -8.5f, -2.5f, 1, 14, 1, 0.0f);
        this.barrelModel[13].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[14].addBox(-26.5f, -2.0f, -2.5f, 14, 1, 1, 0.0f);
        this.barrelModel[14].setRotationPoint(0.0f, -5.0f, 0.0f);
    }
}
