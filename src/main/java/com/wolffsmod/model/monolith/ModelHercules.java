//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelHercules extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelHercules() {
        this.textureX = 512;
        this.textureY = 256;
        this.turretModel = new ModelRendererTurbo[1];
        this.barrelModel = new ModelRendererTurbo[20];
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initturretModel_1() {
        (this.turretModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 113, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 150, 10, 24, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[0].setRotationPoint(-50.0f, 0.0f, -12.0f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 457, 1, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 233, 17, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 289, 33, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 137, 49, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 425, 25, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 265, 57, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 337, 57, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 113, 73, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 209, 81, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 113, 97, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(99.0f, -29.0f, -5.0f, 58, 10, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[0].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[1].addShapeBox(157.0f, -29.0f, -5.0f, 30, 10, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.8f, -4.8f, 0.0f, -4.8f, -4.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.8f, -4.8f, 0.0f, -4.8f, -4.8f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[1].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[2].addShapeBox(15.0f, -31.0f, -7.0f, 46, 6, 6, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[2].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[3].addShapeBox(-5.0f, -31.0f, -7.0f, 20, 14, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[3].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[4].addShapeBox(-7.0f, -51.5f, -28.0f, 24, 20, 1, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f);
        this.barrelModel[4].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[5].addShapeBox(-7.0f, -51.5f, 27.0f, 24, 20, 1, 0.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f);
        this.barrelModel[5].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[6].addShapeBox(-7.0f, -16.5f, 27.0f, 24, 20, 1, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[6].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[7].addShapeBox(-7.0f, -16.5f, -28.0f, 24, 20, 1, 0.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[8].addShapeBox(80.0f, -20.5f, -20.0f, 65, 16, 1, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[9].addShapeBox(80.0f, -43.5f, -20.0f, 65, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f);
        this.barrelModel[9].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[10].addShapeBox(80.0f, -43.5f, 19.0f, 65, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f);
        this.barrelModel[10].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[11].addShapeBox(80.0f, -20.5f, 19.0f, 65, 16, 1, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, -55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[11].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[12].addShapeBox(61.0f, -31.0f, -7.0f, 16, 14, 14, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[12].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[13].addShapeBox(77.0f, -29.0f, -5.0f, 22, 10, 10, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f);
        this.barrelModel[13].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[14].addShapeBox(15.0f, -31.0f, 1.0f, 46, 6, 6, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[14].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[15].addShapeBox(15.0f, -23.0f, 1.0f, 46, 6, 6, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[15].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[16].addShapeBox(15.0f, -23.0f, -7.0f, 46, 6, 6, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.barrelModel[16].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[17].addShapeBox(0.0f, -17.0f, -6.0f, 124, 8, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[17].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[18].addShapeBox(0.0f, -6.0f, -5.0f, 50, 5, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[18].setRotationPoint(-40.0f, 2.0f, 0.0f);
        this.barrelModel[19].addShapeBox(50.0f, -6.0f, -5.0f, 40, 5, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[19].setRotationPoint(-40.0f, 2.0f, 0.0f);
    }
}
