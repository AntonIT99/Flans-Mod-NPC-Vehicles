// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import org.lwjgl.opengl.GL11;
import noppes.npcs.client.ClientProxy;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.ModelPartData;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.client.model.part.tails.ModelSquirrelTail;
import noppes.npcs.client.model.part.tails.ModelDragonTail;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.client.model.util.ModelScaleRenderer;

public class ModelTail extends ModelScaleRenderer
{
    private EntityCustomNpc entity;
    private ModelMPM base;
    private ModelRenderer tail;
    private ModelRenderer dragon;
    private ModelRenderer squirrel;
    private ModelRenderer horse;
    private int color;
    private ResourceLocation location;
    
    public ModelTail(final ModelMPM base) {
        super((ModelBase)base);
        this.color = 16777215;
        this.location = null;
        this.base = base;
        this.rotationPointY = 11.0f;
        (this.tail = new ModelRenderer((ModelBase)base, 56, 21)).addBox(-1.0f, 0.0f, 0.0f, 2, 9, 2);
        this.tail.setRotationPoint(0.0f, 0.0f, 1.0f);
        this.setRotation(this.tail, 0.8714253f, 0.0f, 0.0f);
        this.addChild(this.tail);
        (this.horse = new ModelRenderer((ModelBase)base)).setTextureSize(32, 32);
        this.horse.setRotationPoint(0.0f, -1.0f, 1.0f);
        this.addChild(this.horse);
        final ModelRenderer tailBase = new ModelRenderer((ModelBase)base, 0, 26);
        tailBase.setTextureSize(32, 32);
        tailBase.addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
        this.setRotation(tailBase, -1.134464f, 0.0f, 0.0f);
        this.horse.addChild(tailBase);
        final ModelRenderer tailMiddle = new ModelRenderer((ModelBase)base, 0, 13);
        tailMiddle.setTextureSize(32, 32);
        tailMiddle.addBox(-1.5f, -2.0f, 3.0f, 3, 4, 7);
        this.setRotation(tailMiddle, -1.134464f, 0.0f, 0.0f);
        this.horse.addChild(tailMiddle);
        final ModelRenderer tailTip = new ModelRenderer((ModelBase)base, 0, 0);
        tailTip.setTextureSize(32, 32);
        tailTip.addBox(-1.5f, -4.5f, 9.0f, 3, 4, 7);
        this.setRotation(tailTip, -1.40215f, 0.0f, 0.0f);
        this.horse.addChild(tailTip);
        this.horse.rotateAngleX = 0.5f;
        this.addChild(this.dragon = new ModelDragonTail(base));
        this.addChild(this.squirrel = new ModelSquirrelTail(base));
    }
    
    public void setData(final EntityCustomNpc entity) {
        this.initData(this.entity = entity);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        this.rotateAngleY = MathHelper.cos(par1 * 0.6662f) * 0.3f * par2;
        this.rotateAngleX = MathHelper.sin(par3 * 0.067f) * 0.05f;
        if (this.entity.modelData.legParts.type == 2) {
            this.rotationPointY = 13.0f;
            this.rotationPointZ = 14.0f * this.entity.modelData.legs.scaleZ;
            if (this.base.isSleeping(entity) || this.entity.currentAnimation == EnumAnimation.CRAWLING) {
                this.rotationPointY = 12.0f + 16.0f * this.entity.modelData.legs.scaleZ;
                this.rotationPointZ = 1.0f * this.entity.modelData.legs.scaleY;
                this.rotateAngleX = -0.7853982f;
            }
        }
        else if (this.entity.modelData.legParts.type == 3) {
            this.rotationPointY = 8.6f;
            this.rotationPointZ = 19.0f * this.entity.modelData.legs.scaleZ;
        }
        else {
            this.rotationPointY = 11.0f;
            this.rotationPointZ = -1.0f;
        }
        this.rotationPointZ += this.base.bipedRightLeg.rotationPointZ + 0.5f;
    }
    
    public void setLivingAnimations(final ModelPartData data, final EntityLivingBase entity, final float par2, final float par3, final float par4) {
    }
    
    public void initData(final EntityCustomNpc data) {
        final ModelPartData config = data.modelData.getPartData("tail");
        if (config == null) {
            this.isHidden = true;
            return;
        }
        this.color = config.color;
        this.isHidden = false;
        this.tail.isHidden = (config.type != 0);
        this.dragon.isHidden = (config.type != 1);
        this.horse.isHidden = (config.type != 2);
        this.squirrel.isHidden = (config.type != 3);
        if (!config.playerTexture) {
            this.location = config.getResource();
        }
        else {
            this.location = null;
        }
    }
    
    @Override
    public void render(final float par1) {
        if (this.isHidden) {
            return;
        }
        if (!this.base.isArmor) {
            if (this.location != null) {
                ClientProxy.bindTexture(this.location);
                this.base.currentlyPlayerTexture = false;
            }
            else if (!this.base.currentlyPlayerTexture) {
                ClientProxy.bindTexture(this.entity.textureLocation);
                this.base.currentlyPlayerTexture = true;
            }
        }
        final boolean bo = this.entity.hurtTime <= 0 && this.entity.deathTime <= 0;
        if (bo) {
            final float red = (this.color >> 16 & 0xFF) / 255.0f;
            final float green = (this.color >> 8 & 0xFF) / 255.0f;
            final float blue = (this.color & 0xFF) / 255.0f;
            GL11.glColor4f(red, green, blue, this.base.alpha);
        }
        super.render(par1);
        if (bo) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, this.base.alpha);
        }
    }
}
