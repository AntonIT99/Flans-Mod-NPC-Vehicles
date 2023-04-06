package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelRotateTool extends ModelBase
{
    public ModelRendererTurbo[] rotateTool = new ModelRendererTurbo[0];
    int textureX = 128;
    int textureY = 128;

    public ModelRotateTool() {
        rotateTool = new ModelRendererTurbo[3];
        rotateTool[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 584
        rotateTool[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 585
        rotateTool[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2

        rotateTool[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 33F, 0F, 0F, 33F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 33F, 0F, 0F, 33F, 0F, 0F, 24F, 0F, 0F, 24F); // Box 584
        rotateTool[0].setRotationPoint(0F, 0F, 0F);

        rotateTool[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 5, 9, 0F, 0F, 87F, 0.5F, 0F, 87F, 0.5F, 0F, 87F, -8.5F, 0F, 87F, -8.5F, 0F, 60F, 0.5F, 0F, 60F, 0.5F, 0F, 60F, -8.5F, 0F, 60F, -8.5F); // Box 585
        rotateTool[1].setRotationPoint(0F, 0F, 0F);

        rotateTool[2].addShapeBox(-26.5F, -0.5F, -0.5F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        rotateTool[2].setRotationPoint(0F, 0F, 0F);

        flipAll();
    }

    public void renderRotateTool(float f)
    {
            render(rotateTool, f);
    }

    public void render(ModelRendererTurbo[] flash, float f)
    {
        for(ModelRendererTurbo model : flash)
            if(model != null)
                model.render(f);
    }

    protected void flipAll()
    {
        for(ModelRendererTurbo model : rotateTool)
        {
            model.doMirror(false, true, true);
            model.setRotationPoint(model.rotationPointX, -model.rotationPointY, -model.rotationPointZ);
        }
    }
}
