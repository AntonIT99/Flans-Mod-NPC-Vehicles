//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelTrebuchet extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelTrebuchet() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[23];
        this.bodyDoorOpenModel = new ModelRendererTurbo[10];
        this.bodyDoorCloseModel = new ModelRendererTurbo[11];
        this.initbodyModel_1();
        this.initbodyDoorOpenModel_1();
        this.initbodyDoorCloseModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 137, 41, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 153, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 169, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 193, 49, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 185, 49, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 129, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 177, 17, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 33, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 18, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(1.5f, -50.0f, -9.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 72, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.5f, -61.0f, -13.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 72, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.5f, -61.0f, 9.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.5f, -51.0f, -13.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.5f, -51.0f, 9.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(1.0f, -51.0f, -13.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.5f, -51.0f, 9.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f);
        this.bodyModel[7].setRotationPoint(1.0f, -51.0f, -13.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 62, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 18.0f, 0.0f, 0.0f, 18.0f);
        this.bodyModel[8].setRotationPoint(1.0f, -51.0f, 10.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 106, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(-62.5f, 7.0f, -13.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 106, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(-62.5f, 7.0f, 8.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 14, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(-49.5f, -7.0f, -13.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 14, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(-49.5f, -7.0f, 8.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-48.5f, -6.0f, -16.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(-48.0f, -11.0f, -15.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(-48.0f, -4.0f, -15.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(-46.5f, -5.5f, -15.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-53.5f, -5.5f, -15.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-48.0f, -11.0f, 14.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-48.0f, -4.0f, 14.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-46.5f, -5.5f, 14.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-53.5f, -5.5f, 14.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(-49.0f, -6.5f, -6.0f);
    }
    
    private void initbodyDoorOpenModel_1() {
        this.bodyDoorOpenModel[0] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[3] = new ModelRendererTurbo((ModelBase)this, 193, 100, this.textureX, this.textureY);
        this.bodyDoorOpenModel[4] = new ModelRendererTurbo((ModelBase)this, 209, 100, this.textureX, this.textureY);
        this.bodyDoorOpenModel[5] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyDoorOpenModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyDoorOpenModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorOpenModel[8] = new ModelRendererTurbo((ModelBase)this, 185, 9, this.textureX, this.textureY);
        this.bodyDoorOpenModel[9] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyDoorOpenModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 14, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(-1.5f, -4.0f, -7.0f);
        this.bodyDoorOpenModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 31, 9, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[1].setRotationPoint(-13.5f, -13.0f, -7.0f);
        this.bodyDoorOpenModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 12, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[2].setRotationPoint(-1.5f, -25.0f, -7.0f);
        this.bodyDoorOpenModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 3, 21, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[3].setRotationPoint(0.5f, -42.0f, -8.0f);
        this.bodyDoorOpenModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 21, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[4].setRotationPoint(0.5f, -42.0f, 7.0f);
        this.bodyDoorOpenModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 14, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyDoorOpenModel[5].setRotationPoint(1.5f, -50.0f, -7.0f);
        this.bodyDoorOpenModel[5].rotateAngleZ = -1.3962634f;
        this.bodyDoorOpenModel[6].addShapeBox(-75.0f, -11.0f, 0.0f, 88, 4, 4, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1.0f, -1.0f);
        this.bodyDoorOpenModel[6].setRotationPoint(4.0f, -52.0f, -2.0f);
        this.bodyDoorOpenModel[6].rotateAngleZ = -1.4137167f;
        this.bodyDoorOpenModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.bodyDoorOpenModel[7].setRotationPoint(0.5f, -152.0f, -0.5f);
        this.bodyDoorOpenModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f);
        this.bodyDoorOpenModel[8].setRotationPoint(0.5f, -156.0f, -0.5f);
        this.bodyDoorOpenModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 22, 1, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[9].setRotationPoint(0.5f, -148.0f, -0.5f);
    }
    
    private void initbodyDoorCloseModel_1() {
        this.bodyDoorCloseModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo((ModelBase)this, 193, 100, this.textureX, this.textureY);
        this.bodyDoorCloseModel[2] = new ModelRendererTurbo((ModelBase)this, 209, 100, this.textureX, this.textureY);
        this.bodyDoorCloseModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[5] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[6] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyDoorCloseModel[7] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.bodyDoorCloseModel[8] = new ModelRendererTurbo((ModelBase)this, 185, 9, this.textureX, this.textureY);
        this.bodyDoorCloseModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyDoorCloseModel[10] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 88, 4, 4, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1.0f, -1.0f);
        this.bodyDoorCloseModel[0].setRotationPoint(-73.0f, -63.0f, -2.0f);
        this.bodyDoorCloseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 3, 21, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[1].setRotationPoint(9.5f, -53.0f, -8.0f);
        this.bodyDoorCloseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 3, 21, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[2].setRotationPoint(9.5f, -53.0f, 7.0f);
        this.bodyDoorCloseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 12, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[3].setRotationPoint(7.5f, -36.0f, -7.0f);
        this.bodyDoorCloseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 31, 9, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[4].setRotationPoint(-4.5f, -24.0f, -7.0f);
        this.bodyDoorCloseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 14, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[5].setRotationPoint(7.5f, -15.0f, -7.0f);
        this.bodyDoorCloseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 14, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyDoorCloseModel[6].setRotationPoint(1.5f, -50.0f, -7.0f);
        this.bodyDoorCloseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 22, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.bodyDoorCloseModel[7].setRotationPoint(-72.0f, -60.0f, -0.5f);
        this.bodyDoorCloseModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f);
        this.bodyDoorCloseModel[8].setRotationPoint(-72.0f, -38.0f, -0.5f);
        this.bodyDoorCloseModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 3.0f, 0.0f, 3.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.bodyDoorCloseModel[9].setRotationPoint(-72.0f, -34.0f, -0.5f);
        this.bodyDoorCloseModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 52, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyDoorCloseModel[10].setRotationPoint(-47.0f, -6.5f, -0.5f);
        this.bodyDoorCloseModel[10].rotateAngleZ = 3.3161256f;
    }
}
