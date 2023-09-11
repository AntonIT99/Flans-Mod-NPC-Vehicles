//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelPolybolos extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelPolybolos() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[7];
        this.barrelModel = new ModelRendererTurbo[26];
        this.initbodyModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-0.5f, 0.0f, -0.5f, 1, 15, 1, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.bodyModel[1].addBox(-0.5f, 0.0f, -0.5f, 17, 1, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(-8.0f, 9.0f, 0.0f);
        this.bodyModel[2].addBox(-0.5f, 0.0f, -0.5f, 1, 1, 17, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 9.0f, -8.0f);
        this.bodyModel[3].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 11, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.bodyModel[3].rotateAngleX = -0.80285144f;
        this.bodyModel[4].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 11, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.bodyModel[4].rotateAngleX = -0.80285144f;
        this.bodyModel[4].rotateAngleY = -1.5707964f;
        this.bodyModel[5].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 11, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.bodyModel[5].rotateAngleX = -0.80285144f;
        this.bodyModel[5].rotateAngleY = -3.1415927f;
        this.bodyModel[6].addShapeBox(-0.5f, 0.0f, 0.5f, 1, 1, 11, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.bodyModel[6].rotateAngleX = -0.80285144f;
        this.bodyModel[6].rotateAngleY = -4.712389f;
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.barrelModel[20] = new ModelRendererTurbo((ModelBase)this, 57, 73, this.textureX, this.textureY);
        this.barrelModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.barrelModel[22] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.barrelModel[23] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.barrelModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 89, this.textureX, this.textureY);
        this.barrelModel[25] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-22.5f, -3.0f, -1.0f, 32, 3, 2, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[1].addShapeBox(4.5f, -11.0f, 7.0f, 2, 12, 2, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[1].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[2].addShapeBox(4.5f, -11.0f, -9.0f, 2, 12, 2, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[2].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[3].addShapeBox(4.0f, -1.5f, 0.0f, 3, 2, 10, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, -1.0f, 0.2f);
        this.barrelModel[3].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[4].addShapeBox(4.0f, -1.5f, -10.0f, 3, 2, 10, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, -1.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[4].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[5].addShapeBox(4.5f, -3.5f, 7.5f, 1, 1, 11, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f);
        this.barrelModel[5].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[6].addShapeBox(4.5f, -3.5f, -18.5f, 1, 1, 11, 0.0f, 6.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 6.2f, 0.0f, 0.2f, -5.8f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.barrelModel[6].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[7].addShapeBox(4.0f, -10.5f, -8.0f, 2, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[8].addBox(-21.5f, -3.5f, -3.0f, 4, 4, 2, 0.0f);
        this.barrelModel[8].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[9].addBox(-20.0f, -8.5f, -2.5f, 1, 14, 1, 0.0f);
        this.barrelModel[9].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[10].addBox(-26.5f, -2.0f, -2.5f, 14, 1, 1, 0.0f);
        this.barrelModel[10].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[11].addBox(-20.5f, -7.0f, -0.5f, 26, 1, 1, 0.0f);
        this.barrelModel[11].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[12].addBox(-20.5f, -10.5f, -1.0f, 5, 4, 2, 0.0f);
        this.barrelModel[12].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[13].addBox(0.5f, -10.5f, -1.0f, 5, 4, 2, 0.0f);
        this.barrelModel[13].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[14].addBox(-20.5f, -6.5f, -0.5f, 2, 4, 1, 0.0f);
        this.barrelModel[14].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[15].addShapeBox(-21.5f, -3.5f, -3.0f, 26, 1, 1, 0.0f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f);
        this.barrelModel[15].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[16].addShapeBox(-21.5f, -0.5f, -3.0f, 26, 1, 1, 0.0f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f);
        this.barrelModel[16].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[17].addBox(0.5f, -3.5f, -3.0f, 4, 4, 2, 0.0f);
        this.barrelModel[17].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[18].addShapeBox(-20.5f, -8.5f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[18].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[19].addShapeBox(-20.5f, -9.0f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[19].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[20].addShapeBox(-20.5f, -9.5f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[20].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[21].addShapeBox(-20.5f, -10.0f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[21].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[22].addShapeBox(-20.5f, -10.5f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[22].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[23].addShapeBox(-20.5f, -8.0f, -0.5f, 26, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[23].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[24].addShapeBox(-20.5f, -4.0f, -0.5f, 24, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.barrelModel[24].setRotationPoint(0.0f, -5.0f, 0.0f);
        this.barrelModel[25].addShapeBox(3.5f, -4.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.barrelModel[25].setRotationPoint(0.0f, -5.0f, 0.0f);
    }
}
