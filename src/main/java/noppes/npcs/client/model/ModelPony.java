// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.entity.RenderManager;
import java.awt.image.BufferedImage;
import net.minecraft.client.resources.IResource;
import org.lwjgl.opengl.GL11;
import java.io.IOException;
import java.awt.Color;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import noppes.npcs.entity.EntityNpcPony;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.Entity;
import noppes.npcs.client.model.util.ModelPlaneRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelPony extends ModelBase
{
    private boolean rainboom;
    private float WingRotateAngleX;
    private float WingRotateAngleY;
    private float WingRotateAngleZ;
    private float TailRotateAngleY;
    public ModelRenderer Head;
    public ModelRenderer[] Headpiece;
    public ModelRenderer Helmet;
    public ModelRenderer Body;
    public ModelPlaneRenderer[] Bodypiece;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer unicornarm;
    public ModelPlaneRenderer[] Tail;
    public ModelRenderer[] LeftWing;
    public ModelRenderer[] RightWing;
    public ModelRenderer[] LeftWingExt;
    public ModelRenderer[] RightWingExt;
    public boolean isPegasus;
    public boolean isUnicorn;
    public boolean isFlying;
    public boolean isGlow;
    public boolean isSleeping;
    public boolean isSneak;
    public boolean aimedBow;
    public int heldItemRight;
    
    public ModelPony(final float f) {
        this.init(f, 0.0f);
    }
    
    public void init(final float strech, final float f) {
        final float f2 = 0.0f;
        final float f3 = 0.0f;
        final float f4 = 0.0f;
        (this.Head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 8, strech);
        this.Head.setRotationPoint(f2, f3 + f, f4);
        this.Headpiece = new ModelRenderer[3];
        (this.Headpiece[0] = new ModelRenderer((ModelBase)this, 12, 16)).addBox(-4.0f, -6.0f, -1.0f, 2, 2, 2, strech);
        this.Headpiece[0].setRotationPoint(f2, f3 + f, f4);
        (this.Headpiece[1] = new ModelRenderer((ModelBase)this, 12, 16)).addBox(2.0f, -6.0f, -1.0f, 2, 2, 2, strech);
        this.Headpiece[1].setRotationPoint(f2, f3 + f, f4);
        (this.Headpiece[2] = new ModelRenderer((ModelBase)this, 56, 0)).addBox(-0.5f, -10.0f, -4.0f, 1, 4, 1, strech);
        this.Headpiece[2].setRotationPoint(f2, f3 + f, f4);
        (this.Helmet = new ModelRenderer((ModelBase)this, 32, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 8, strech + 0.5f);
        this.Helmet.setRotationPoint(f2, f3, f4);
        final float f5 = 0.0f;
        final float f6 = 0.0f;
        final float f7 = 0.0f;
        (this.Body = new ModelRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 4.0f, -2.0f, 8, 8, 4, strech);
        this.Body.setRotationPoint(f5, f6 + f, f7);
        this.Bodypiece = new ModelPlaneRenderer[13];
        (this.Bodypiece[0] = new ModelPlaneRenderer(this, 24, 0)).addSidePlane(-4.0f, 4.0f, 2.0f, 8, 8, strech);
        this.Bodypiece[0].setRotationPoint(f5, f6 + f, f7);
        (this.Bodypiece[1] = new ModelPlaneRenderer(this, 24, 0)).addSidePlane(4.0f, 4.0f, 2.0f, 8, 8, strech);
        this.Bodypiece[1].setRotationPoint(f5, f6 + f, f7);
        (this.Bodypiece[2] = new ModelPlaneRenderer(this, 24, 0)).addTopPlane(-4.0f, 4.0f, 2.0f, 8, 8, strech);
        this.Bodypiece[2].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[3] = new ModelPlaneRenderer(this, 24, 0)).addTopPlane(-4.0f, 12.0f, 2.0f, 8, 8, strech);
        this.Bodypiece[3].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[4] = new ModelPlaneRenderer(this, 0, 20)).addSidePlane(-4.0f, 4.0f, 10.0f, 8, 4, strech);
        this.Bodypiece[4].setRotationPoint(f5, f6 + f, f7);
        (this.Bodypiece[5] = new ModelPlaneRenderer(this, 0, 20)).addSidePlane(4.0f, 4.0f, 10.0f, 8, 4, strech);
        this.Bodypiece[5].setRotationPoint(f5, f6 + f, f7);
        (this.Bodypiece[6] = new ModelPlaneRenderer(this, 24, 0)).addTopPlane(-4.0f, 4.0f, 10.0f, 8, 4, strech);
        this.Bodypiece[6].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[7] = new ModelPlaneRenderer(this, 24, 0)).addTopPlane(-4.0f, 12.0f, 10.0f, 8, 4, strech);
        this.Bodypiece[7].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[8] = new ModelPlaneRenderer(this, 24, 0)).addBackPlane(-4.0f, 4.0f, 14.0f, 8, 8, strech);
        this.Bodypiece[8].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[9] = new ModelPlaneRenderer(this, 32, 0)).addTopPlane(-1.0f, 10.0f, 8.0f, 2, 6, strech);
        this.Bodypiece[9].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[10] = new ModelPlaneRenderer(this, 32, 0)).addTopPlane(-1.0f, 12.0f, 8.0f, 2, 6, strech);
        this.Bodypiece[10].setRotationPoint(f2, f3 + f, f4);
        this.Bodypiece[11] = new ModelPlaneRenderer(this, 32, 0);
        this.Bodypiece[11].mirror = true;
        this.Bodypiece[11].addSidePlane(-1.0f, 10.0f, 8.0f, 2, 6, strech);
        this.Bodypiece[11].setRotationPoint(f2, f3 + f, f4);
        (this.Bodypiece[12] = new ModelPlaneRenderer(this, 32, 0)).addSidePlane(1.0f, 10.0f, 8.0f, 2, 6, strech);
        this.Bodypiece[12].setRotationPoint(f2, f3 + f, f4);
        (this.RightArm = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.RightArm.setRotationPoint(-3.0f, 8.0f + f, 0.0f);
        this.LeftArm = new ModelRenderer((ModelBase)this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.LeftArm.setRotationPoint(3.0f, 8.0f + f, 0.0f);
        (this.RightLeg = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.RightLeg.setRotationPoint(-3.0f, 0.0f + f, 0.0f);
        this.LeftLeg = new ModelRenderer((ModelBase)this, 40, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.LeftLeg.setRotationPoint(3.0f, 0.0f + f, 0.0f);
        (this.unicornarm = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, strech);
        this.unicornarm.setRotationPoint(-5.0f, 2.0f + f, 0.0f);
        final float f8 = 0.0f;
        final float f9 = 8.0f;
        final float f10 = -14.0f;
        final float f11 = 0.0f - f8;
        final float f12 = 10.0f - f9;
        final float f13 = 0.0f;
        this.Tail = new ModelPlaneRenderer[10];
        (this.Tail[0] = new ModelPlaneRenderer(this, 32, 0)).addTopPlane(-2.0f + f8, -7.0f + f9, 16.0f + f10, 4, 4, strech);
        this.Tail[0].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[1] = new ModelPlaneRenderer(this, 32, 0)).addTopPlane(-2.0f + f8, 9.0f + f9, 16.0f + f10, 4, 4, strech);
        this.Tail[1].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[2] = new ModelPlaneRenderer(this, 32, 0)).addBackPlane(-2.0f + f8, -7.0f + f9, 16.0f + f10, 4, 8, strech);
        this.Tail[2].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[3] = new ModelPlaneRenderer(this, 32, 0)).addBackPlane(-2.0f + f8, -7.0f + f9, 20.0f + f10, 4, 8, strech);
        this.Tail[3].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[4] = new ModelPlaneRenderer(this, 32, 0)).addBackPlane(-2.0f + f8, 1.0f + f9, 16.0f + f10, 4, 8, strech);
        this.Tail[4].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[5] = new ModelPlaneRenderer(this, 32, 0)).addBackPlane(-2.0f + f8, 1.0f + f9, 20.0f + f10, 4, 8, strech);
        this.Tail[5].setRotationPoint(f11, f12 + f, f13);
        this.Tail[6] = new ModelPlaneRenderer(this, 36, 0);
        this.Tail[6].mirror = true;
        this.Tail[6].addSidePlane(2.0f + f8, -7.0f + f9, 16.0f + f10, 8, 4, strech);
        this.Tail[6].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[7] = new ModelPlaneRenderer(this, 36, 0)).addSidePlane(-2.0f + f8, -7.0f + f9, 16.0f + f10, 8, 4, strech);
        this.Tail[7].setRotationPoint(f11, f12 + f, f13);
        this.Tail[8] = new ModelPlaneRenderer(this, 36, 0);
        this.Tail[8].mirror = true;
        this.Tail[8].addSidePlane(2.0f + f8, 1.0f + f9, 16.0f + f10, 8, 4, strech);
        this.Tail[8].setRotationPoint(f11, f12 + f, f13);
        (this.Tail[9] = new ModelPlaneRenderer(this, 36, 0)).addSidePlane(-2.0f + f8, 1.0f + f9, 16.0f + f10, 8, 4, strech);
        this.Tail[9].setRotationPoint(f11, f12 + f, f13);
        this.TailRotateAngleY = this.Tail[0].rotateAngleY;
        this.TailRotateAngleY = this.Tail[0].rotateAngleY;
        final float f14 = 0.0f;
        final float f15 = 0.0f;
        final float f16 = 0.0f;
        (this.LeftWing = new ModelRenderer[3])[0] = new ModelRenderer((ModelBase)this, 56, 16);
        this.LeftWing[0].mirror = true;
        this.LeftWing[0].addBox(4.0f, 5.0f, 2.0f, 2, 6, 2, strech);
        this.LeftWing[0].setRotationPoint(f14, f15 + f, f16);
        this.LeftWing[1] = new ModelRenderer((ModelBase)this, 56, 16);
        this.LeftWing[1].mirror = true;
        this.LeftWing[1].addBox(4.0f, 5.0f, 4.0f, 2, 8, 2, strech);
        this.LeftWing[1].setRotationPoint(f14, f15 + f, f16);
        this.LeftWing[2] = new ModelRenderer((ModelBase)this, 56, 16);
        this.LeftWing[2].mirror = true;
        this.LeftWing[2].addBox(4.0f, 5.0f, 6.0f, 2, 6, 2, strech);
        this.LeftWing[2].setRotationPoint(f14, f15 + f, f16);
        this.RightWing = new ModelRenderer[3];
        (this.RightWing[0] = new ModelRenderer((ModelBase)this, 56, 16)).addBox(-6.0f, 5.0f, 2.0f, 2, 6, 2, strech);
        this.RightWing[0].setRotationPoint(f14, f15 + f, f16);
        (this.RightWing[1] = new ModelRenderer((ModelBase)this, 56, 16)).addBox(-6.0f, 5.0f, 4.0f, 2, 8, 2, strech);
        this.RightWing[1].setRotationPoint(f14, f15 + f, f16);
        (this.RightWing[2] = new ModelRenderer((ModelBase)this, 56, 16)).addBox(-6.0f, 5.0f, 6.0f, 2, 6, 2, strech);
        this.RightWing[2].setRotationPoint(f14, f15 + f, f16);
        final float f17 = f2 + 4.5f;
        final float f18 = f3 + 5.0f;
        final float f19 = f4 + 6.0f;
        (this.LeftWingExt = new ModelRenderer[7])[0] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[0].mirror = true;
        this.LeftWingExt[0].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, strech + 0.1f);
        this.LeftWingExt[0].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[1] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[1].mirror = true;
        this.LeftWingExt[1].addBox(0.0f, 8.0f, 0.0f, 1, 6, 2, strech + 0.1f);
        this.LeftWingExt[1].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[2] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[2].mirror = true;
        this.LeftWingExt[2].addBox(0.0f, -1.2f, -0.2f, 1, 8, 2, strech - 0.2f);
        this.LeftWingExt[2].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[3] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[3].mirror = true;
        this.LeftWingExt[3].addBox(0.0f, 1.8f, 1.3f, 1, 8, 2, strech - 0.1f);
        this.LeftWingExt[3].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[4] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[4].mirror = true;
        this.LeftWingExt[4].addBox(0.0f, 5.0f, 2.0f, 1, 8, 2, strech);
        this.LeftWingExt[4].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[5] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[5].mirror = true;
        this.LeftWingExt[5].addBox(0.0f, 0.0f, -0.2f, 1, 6, 2, strech + 0.3f);
        this.LeftWingExt[5].setRotationPoint(f17, f18 + f, f19);
        this.LeftWingExt[6] = new ModelRenderer((ModelBase)this, 56, 19);
        this.LeftWingExt[6].mirror = true;
        this.LeftWingExt[6].addBox(0.0f, 0.0f, 0.2f, 1, 3, 2, strech + 0.2f);
        this.LeftWingExt[6].setRotationPoint(f17, f18 + f, f19);
        final float f20 = f2 - 4.5f;
        final float f21 = f3 + 5.0f;
        final float f22 = f4 + 6.0f;
        (this.RightWingExt = new ModelRenderer[7])[0] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[0].mirror = true;
        this.RightWingExt[0].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, strech + 0.1f);
        this.RightWingExt[0].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[1] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[1].mirror = true;
        this.RightWingExt[1].addBox(0.0f, 8.0f, 0.0f, 1, 6, 2, strech + 0.1f);
        this.RightWingExt[1].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[2] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[2].mirror = true;
        this.RightWingExt[2].addBox(0.0f, -1.2f, -0.2f, 1, 8, 2, strech - 0.2f);
        this.RightWingExt[2].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[3] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[3].mirror = true;
        this.RightWingExt[3].addBox(0.0f, 1.8f, 1.3f, 1, 8, 2, strech - 0.1f);
        this.RightWingExt[3].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[4] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[4].mirror = true;
        this.RightWingExt[4].addBox(0.0f, 5.0f, 2.0f, 1, 8, 2, strech);
        this.RightWingExt[4].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[5] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[5].mirror = true;
        this.RightWingExt[5].addBox(0.0f, 0.0f, -0.2f, 1, 6, 2, strech + 0.3f);
        this.RightWingExt[5].setRotationPoint(f20, f21 + f, f22);
        this.RightWingExt[6] = new ModelRenderer((ModelBase)this, 56, 19);
        this.RightWingExt[6].mirror = true;
        this.RightWingExt[6].addBox(0.0f, 0.0f, 0.2f, 1, 3, 2, strech + 0.2f);
        this.RightWingExt[6].setRotationPoint(f20, f21 + f, f22);
        this.WingRotateAngleX = this.LeftWingExt[0].rotateAngleX;
        this.WingRotateAngleY = this.LeftWingExt[0].rotateAngleY;
        this.WingRotateAngleZ = this.LeftWingExt[0].rotateAngleZ;
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        final EntityNPCInterface npc = (EntityNPCInterface)entity;
        this.isRiding = npc.isRiding();
        if (this.isSneak && (npc.currentAnimation == EnumAnimation.CRAWLING || npc.currentAnimation == EnumAnimation.LYING)) {
            this.isSneak = false;
        }
        this.rainboom = false;
        float f6;
        float f7;
        if (this.isSleeping) {
            f6 = 1.4f;
            f7 = 0.1f;
        }
        else {
            f6 = f3 / 57.29578f;
            f7 = f4 / 57.29578f;
        }
        this.Head.rotateAngleY = f6;
        this.Head.rotateAngleX = f7;
        this.Headpiece[0].rotateAngleY = f6;
        this.Headpiece[0].rotateAngleX = f7;
        this.Headpiece[1].rotateAngleY = f6;
        this.Headpiece[1].rotateAngleX = f7;
        this.Headpiece[2].rotateAngleY = f6;
        this.Headpiece[2].rotateAngleX = f7;
        this.Helmet.rotateAngleY = f6;
        this.Helmet.rotateAngleX = f7;
        this.Headpiece[2].rotateAngleX = f7 + 0.5f;
        float f8;
        float f9;
        float f10;
        float f11;
        if (!this.isFlying || !this.isPegasus) {
            f8 = MathHelper.cos(f * 0.6662f + 3.141593f) * 0.6f * f1;
            f9 = MathHelper.cos(f * 0.6662f) * 0.6f * f1;
            f10 = MathHelper.cos(f * 0.6662f) * 0.3f * f1;
            f11 = MathHelper.cos(f * 0.6662f + 3.141593f) * 0.3f * f1;
            this.RightArm.rotateAngleY = 0.0f;
            this.unicornarm.rotateAngleY = 0.0f;
            this.LeftArm.rotateAngleY = 0.0f;
            this.RightLeg.rotateAngleY = 0.0f;
            this.LeftLeg.rotateAngleY = 0.0f;
        }
        else {
            if (f1 < 0.9999f) {
                this.rainboom = false;
                f8 = MathHelper.sin(0.0f - f1 * 0.5f);
                f9 = MathHelper.sin(0.0f - f1 * 0.5f);
                f10 = MathHelper.sin(f1 * 0.5f);
                f11 = MathHelper.sin(f1 * 0.5f);
            }
            else {
                this.rainboom = true;
                f8 = 4.712f;
                f9 = 4.712f;
                f10 = 1.571f;
                f11 = 1.571f;
            }
            this.RightArm.rotateAngleY = 0.2f;
            this.LeftArm.rotateAngleY = -0.2f;
            this.RightLeg.rotateAngleY = -0.2f;
            this.LeftLeg.rotateAngleY = 0.2f;
        }
        if (this.isSleeping) {
            f8 = 4.712f;
            f9 = 4.712f;
            f10 = 1.571f;
            f11 = 1.571f;
        }
        this.RightArm.rotateAngleX = f8;
        this.unicornarm.rotateAngleX = 0.0f;
        this.LeftArm.rotateAngleX = f9;
        this.RightLeg.rotateAngleX = f10;
        this.LeftLeg.rotateAngleX = f11;
        this.RightArm.rotateAngleZ = 0.0f;
        this.unicornarm.rotateAngleZ = 0.0f;
        this.LeftArm.rotateAngleZ = 0.0f;
        for (int i = 0; i < this.Tail.length; ++i) {
            if (this.rainboom) {
                this.Tail[i].rotateAngleZ = 0.0f;
            }
            else {
                this.Tail[i].rotateAngleZ = MathHelper.cos(f * 0.8f) * 0.2f * f1;
            }
        }
        if (this.heldItemRight != 0 && !this.rainboom && !this.isUnicorn) {
            this.RightArm.rotateAngleX = this.RightArm.rotateAngleX * 0.5f - 0.3141593f;
        }
        float f12 = 0.0f;
        if (f5 > -9990.0f && !this.isUnicorn) {
            f12 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593f * 2.0f) * 0.2f;
        }
        this.Body.rotateAngleY = (float)(f12 * 0.2);
        for (int j = 0; j < this.Bodypiece.length; ++j) {
            this.Bodypiece[j].rotateAngleY = (float)(f12 * 0.2);
        }
        for (int k = 0; k < this.LeftWing.length; ++k) {
            this.LeftWing[k].rotateAngleY = (float)(f12 * 0.2);
        }
        for (int l = 0; l < this.RightWing.length; ++l) {
            this.RightWing[l].rotateAngleY = (float)(f12 * 0.2);
        }
        for (int i2 = 0; i2 < this.Tail.length; ++i2) {
            this.Tail[i2].rotateAngleY = f12;
        }
        final float f13 = MathHelper.sin(this.Body.rotateAngleY) * 5.0f;
        final float f14 = MathHelper.cos(this.Body.rotateAngleY) * 5.0f;
        float f15 = 4.0f;
        if (this.isSneak && !this.isFlying) {
            f15 = 0.0f;
        }
        if (this.isSleeping) {
            f15 = 2.6f;
        }
        if (this.rainboom) {
            this.RightArm.rotationPointZ = f13 + 2.0f;
            this.LeftArm.rotationPointZ = 0.0f - f13 + 2.0f;
        }
        else {
            this.RightArm.rotationPointZ = f13 + 1.0f;
            this.LeftArm.rotationPointZ = 0.0f - f13 + 1.0f;
        }
        this.RightArm.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.LeftArm.rotationPointX = f14 + 1.0f - f15;
        this.RightLeg.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.LeftLeg.rotationPointX = f14 + 1.0f - f15;
        final ModelRenderer rightArm = this.RightArm;
        rightArm.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer leftArm = this.LeftArm;
        leftArm.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer leftArm2 = this.LeftArm;
        leftArm2.rotateAngleX += this.Body.rotateAngleY;
        this.RightArm.rotationPointY = 8.0f;
        this.LeftArm.rotationPointY = 8.0f;
        this.RightLeg.rotationPointY = 4.0f;
        this.LeftLeg.rotationPointY = 4.0f;
        if (f5 > -9990.0f) {
            float f16 = 1.0f - f5;
            f16 *= f16 * f16;
            f16 = 1.0f - f16;
            final float f17 = MathHelper.sin(f16 * 3.141593f);
            final float f18 = MathHelper.sin(f5 * 3.141593f);
            final float f19 = f18 * -(this.Head.rotateAngleX - 0.7f) * 0.75f;
            if (this.isUnicorn) {
                final ModelRenderer unicornarm = this.unicornarm;
                unicornarm.rotateAngleX -= (float)(f17 * 1.2 + f19);
                final ModelRenderer unicornarm2 = this.unicornarm;
                unicornarm2.rotateAngleY += this.Body.rotateAngleY * 2.0f;
                this.unicornarm.rotateAngleZ = f18 * -0.4f;
            }
            else {
                final ModelRenderer unicornarm3 = this.unicornarm;
                unicornarm3.rotateAngleX -= (float)(f17 * 1.2 + f19);
                final ModelRenderer unicornarm4 = this.unicornarm;
                unicornarm4.rotateAngleY += this.Body.rotateAngleY * 2.0f;
                this.unicornarm.rotateAngleZ = f18 * -0.4f;
            }
        }
        if (this.isSneak && !this.isFlying) {
            final float f20 = 0.4f;
            final float f21 = 7.0f;
            final float f22 = -4.0f;
            this.Body.rotateAngleX = f20;
            this.Body.rotationPointY = f21;
            this.Body.rotationPointZ = f22;
            for (int i3 = 0; i3 < this.Bodypiece.length; ++i3) {
                this.Bodypiece[i3].rotateAngleX = f20;
                this.Bodypiece[i3].rotationPointY = f21;
                this.Bodypiece[i3].rotationPointZ = f22;
            }
            final float f23 = 3.5f;
            final float f24 = 6.0f;
            for (int i4 = 0; i4 < this.LeftWingExt.length; ++i4) {
                this.LeftWingExt[i4].rotateAngleX = (float)(f20 + 2.3561947345733643);
                this.LeftWingExt[i4].rotationPointY = f21 + f23;
                this.LeftWingExt[i4].rotationPointZ = f22 + f24;
                this.LeftWingExt[i4].rotateAngleX = 2.5f;
                this.LeftWingExt[i4].rotateAngleZ = -6.0f;
            }
            final float f25 = 4.5f;
            final float f26 = 6.0f;
            for (int i5 = 0; i5 < this.LeftWingExt.length; ++i5) {
                this.RightWingExt[i5].rotateAngleX = (float)(f20 + 2.3561947345733643);
                this.RightWingExt[i5].rotationPointY = f21 + f25;
                this.RightWingExt[i5].rotationPointZ = f22 + f26;
                this.RightWingExt[i5].rotateAngleX = 2.5f;
                this.RightWingExt[i5].rotateAngleZ = 6.0f;
            }
            final ModelRenderer rightLeg = this.RightLeg;
            rightLeg.rotateAngleX -= 0.0f;
            final ModelRenderer leftLeg = this.LeftLeg;
            leftLeg.rotateAngleX -= 0.0f;
            final ModelRenderer rightArm2 = this.RightArm;
            rightArm2.rotateAngleX -= 0.4f;
            final ModelRenderer unicornarm5 = this.unicornarm;
            unicornarm5.rotateAngleX += 0.4f;
            final ModelRenderer leftArm3 = this.LeftArm;
            leftArm3.rotateAngleX -= 0.4f;
            this.RightLeg.rotationPointZ = 10.0f;
            this.LeftLeg.rotationPointZ = 10.0f;
            this.RightLeg.rotationPointY = 7.0f;
            this.LeftLeg.rotationPointY = 7.0f;
            float f27;
            float f28;
            float f29;
            if (this.isSleeping) {
                f27 = 2.0f;
                f28 = -1.0f;
                f29 = 1.0f;
            }
            else {
                f27 = 6.0f;
                f28 = -2.0f;
                f29 = 0.0f;
            }
            this.Head.rotationPointY = f27;
            this.Head.rotationPointZ = f28;
            this.Head.rotationPointX = f29;
            this.Helmet.rotationPointY = f27;
            this.Helmet.rotationPointZ = f28;
            this.Helmet.rotationPointX = f29;
            this.Headpiece[0].rotationPointY = f27;
            this.Headpiece[0].rotationPointZ = f28;
            this.Headpiece[0].rotationPointX = f29;
            this.Headpiece[1].rotationPointY = f27;
            this.Headpiece[1].rotationPointZ = f28;
            this.Headpiece[1].rotationPointX = f29;
            this.Headpiece[2].rotationPointY = f27;
            this.Headpiece[2].rotationPointZ = f28;
            this.Headpiece[2].rotationPointX = f29;
            final float f30 = 0.0f;
            final float f31 = 8.0f;
            final float f32 = -14.0f;
            final float f33 = 0.0f - f30;
            final float f34 = 9.0f - f31;
            final float f35 = -4.0f - f32;
            final float f36 = 0.0f;
            for (int i6 = 0; i6 < this.Tail.length; ++i6) {
                this.Tail[i6].rotationPointX = f33;
                this.Tail[i6].rotationPointY = f34;
                this.Tail[i6].rotationPointZ = f35;
                this.Tail[i6].rotateAngleX = f36;
            }
        }
        else {
            final float f37 = 0.0f;
            final float f38 = 0.0f;
            final float f39 = 0.0f;
            this.Body.rotateAngleX = f37;
            this.Body.rotationPointY = f38;
            this.Body.rotationPointZ = f39;
            for (int j2 = 0; j2 < this.Bodypiece.length; ++j2) {
                this.Bodypiece[j2].rotateAngleX = f37;
                this.Bodypiece[j2].rotationPointY = f38;
                this.Bodypiece[j2].rotationPointZ = f39;
            }
            if (this.isPegasus) {
                if (!this.isFlying) {
                    for (int k2 = 0; k2 < this.LeftWing.length; ++k2) {
                        this.LeftWing[k2].rotateAngleX = (float)(f37 + 1.5707964897155762);
                        this.LeftWing[k2].rotationPointY = f38 + 13.0f;
                        this.LeftWing[k2].rotationPointZ = f39 - 3.0f;
                    }
                    for (int l2 = 0; l2 < this.RightWing.length; ++l2) {
                        this.RightWing[l2].rotateAngleX = (float)(f37 + 1.5707964897155762);
                        this.RightWing[l2].rotationPointY = f38 + 13.0f;
                        this.RightWing[l2].rotationPointZ = f39 - 3.0f;
                    }
                }
                else {
                    final float f40 = 5.5f;
                    final float f41 = 3.0f;
                    for (int j3 = 0; j3 < this.LeftWingExt.length; ++j3) {
                        this.LeftWingExt[j3].rotateAngleX = (float)(f37 + 1.5707964897155762);
                        this.LeftWingExt[j3].rotationPointY = f38 + f40;
                        this.LeftWingExt[j3].rotationPointZ = f39 + f41;
                    }
                    final float f42 = 6.5f;
                    final float f43 = 3.0f;
                    for (int j4 = 0; j4 < this.RightWingExt.length; ++j4) {
                        this.RightWingExt[j4].rotateAngleX = (float)(f37 + 1.5707964897155762);
                        this.RightWingExt[j4].rotationPointY = f38 + f42;
                        this.RightWingExt[j4].rotationPointZ = f39 + f43;
                    }
                }
            }
            this.RightLeg.rotationPointZ = 10.0f;
            this.LeftLeg.rotationPointZ = 10.0f;
            this.RightLeg.rotationPointY = 8.0f;
            this.LeftLeg.rotationPointY = 8.0f;
            final float f44 = MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
            final float f45 = MathHelper.sin(f2 * 0.067f) * 0.05f;
            final ModelRenderer unicornarm6 = this.unicornarm;
            unicornarm6.rotateAngleZ += f44;
            final ModelRenderer unicornarm7 = this.unicornarm;
            unicornarm7.rotateAngleX += f45;
            if (this.isPegasus && this.isFlying) {
                this.WingRotateAngleY = MathHelper.sin(f2 * 0.067f * 8.0f) * 1.0f;
                this.WingRotateAngleZ = MathHelper.sin(f2 * 0.067f * 8.0f) * 1.0f;
                for (int k3 = 0; k3 < this.LeftWingExt.length; ++k3) {
                    this.LeftWingExt[k3].rotateAngleX = 2.5f;
                    this.LeftWingExt[k3].rotateAngleZ = -this.WingRotateAngleZ - 4.712f - 0.4f;
                }
                for (int l3 = 0; l3 < this.RightWingExt.length; ++l3) {
                    this.RightWingExt[l3].rotateAngleX = 2.5f;
                    this.RightWingExt[l3].rotateAngleZ = this.WingRotateAngleZ + 4.712f + 0.4f;
                }
            }
            float f46;
            float f47;
            float f48;
            if (this.isSleeping) {
                f46 = 2.0f;
                f47 = 1.0f;
                f48 = 1.0f;
            }
            else {
                f46 = 0.0f;
                f47 = 0.0f;
                f48 = 0.0f;
            }
            this.Head.rotationPointY = f46;
            this.Head.rotationPointZ = f47;
            this.Head.rotationPointX = f48;
            this.Helmet.rotationPointY = f46;
            this.Helmet.rotationPointZ = f47;
            this.Helmet.rotationPointX = f48;
            this.Headpiece[0].rotationPointY = f46;
            this.Headpiece[0].rotationPointZ = f47;
            this.Headpiece[0].rotationPointX = f48;
            this.Headpiece[1].rotationPointY = f46;
            this.Headpiece[1].rotationPointZ = f47;
            this.Headpiece[1].rotationPointX = f48;
            this.Headpiece[2].rotationPointY = f46;
            this.Headpiece[2].rotationPointZ = f47;
            this.Headpiece[2].rotationPointX = f48;
            final float f49 = 0.0f;
            final float f50 = 8.0f;
            final float f51 = -14.0f;
            final float f52 = 0.0f - f49;
            final float f53 = 9.0f - f50;
            final float f54 = 0.0f - f51;
            final float f55 = 0.5f * f1;
            for (int k4 = 0; k4 < this.Tail.length; ++k4) {
                this.Tail[k4].rotationPointX = f52;
                this.Tail[k4].rotationPointY = f53;
                this.Tail[k4].rotationPointZ = f54;
                if (this.rainboom) {
                    this.Tail[k4].rotateAngleX = 1.571f + 0.1f * MathHelper.sin(f);
                }
                else {
                    this.Tail[k4].rotateAngleX = f55;
                }
            }
            for (int l4 = 0; l4 < this.Tail.length; ++l4) {
                if (!this.rainboom) {
                    final ModelPlaneRenderer modelPlaneRenderer = this.Tail[l4];
                    modelPlaneRenderer.rotateAngleX += f45;
                }
            }
        }
        this.LeftWingExt[2].rotateAngleX -= 0.85f;
        this.LeftWingExt[3].rotateAngleX -= 0.75f;
        this.LeftWingExt[4].rotateAngleX -= 0.5f;
        this.LeftWingExt[6].rotateAngleX -= 0.85f;
        this.RightWingExt[2].rotateAngleX -= 0.85f;
        this.RightWingExt[3].rotateAngleX -= 0.75f;
        this.RightWingExt[4].rotateAngleX -= 0.5f;
        this.RightWingExt[6].rotateAngleX -= 0.85f;
        this.Bodypiece[9].rotateAngleX += 0.5f;
        this.Bodypiece[10].rotateAngleX += 0.5f;
        this.Bodypiece[11].rotateAngleX += 0.5f;
        this.Bodypiece[12].rotateAngleX += 0.5f;
        if (this.rainboom) {
            for (int j5 = 0; j5 < this.Tail.length; ++j5) {
                this.Tail[j5].rotationPointY += 6.0f;
                ++this.Tail[j5].rotationPointZ;
            }
        }
        if (this.isSleeping) {
            this.RightArm.rotationPointZ += 6.0f;
            this.LeftArm.rotationPointZ += 6.0f;
            this.RightLeg.rotationPointZ -= 8.0f;
            this.LeftLeg.rotationPointZ -= 8.0f;
            this.RightArm.rotationPointY += 2.0f;
            this.LeftArm.rotationPointY += 2.0f;
            this.RightLeg.rotationPointY += 2.0f;
            this.LeftLeg.rotationPointY += 2.0f;
        }
        if (this.aimedBow) {
            if (this.isUnicorn) {
                final float f56 = 0.0f;
                final float f57 = 0.0f;
                this.unicornarm.rotateAngleZ = 0.0f;
                this.unicornarm.rotateAngleY = -(0.1f - f56 * 0.6f) + this.Head.rotateAngleY;
                this.unicornarm.rotateAngleX = 4.712f + this.Head.rotateAngleX;
                final ModelRenderer unicornarm8 = this.unicornarm;
                unicornarm8.rotateAngleX -= f56 * 1.2f - f57 * 0.4f;
                final ModelRenderer unicornarm9 = this.unicornarm;
                unicornarm9.rotateAngleZ += MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
                final ModelRenderer unicornarm10 = this.unicornarm;
                unicornarm10.rotateAngleX += MathHelper.sin(f2 * 0.067f) * 0.05f;
            }
            else {
                final float f58 = 0.0f;
                final float f59 = 0.0f;
                this.RightArm.rotateAngleZ = 0.0f;
                this.RightArm.rotateAngleY = -(0.1f - f58 * 0.6f) + this.Head.rotateAngleY;
                this.RightArm.rotateAngleX = 4.712f + this.Head.rotateAngleX;
                final ModelRenderer rightArm3 = this.RightArm;
                rightArm3.rotateAngleX -= f58 * 1.2f - f59 * 0.4f;
                final ModelRenderer rightArm4 = this.RightArm;
                rightArm4.rotateAngleZ += MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
                final ModelRenderer rightArm5 = this.RightArm;
                rightArm5.rotateAngleX += MathHelper.sin(f2 * 0.067f) * 0.05f;
                ++this.RightArm.rotationPointZ;
            }
        }
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final EntityNpcPony pony = (EntityNpcPony)entity;
        if (pony.textureLocation != pony.checked && pony.textureLocation != null) {
            try {
                final IResource resource = Minecraft.getMinecraft().getResourceManager().getResource(pony.textureLocation);
                final BufferedImage bufferedimage = ImageIO.read(resource.getInputStream());
                pony.isPegasus = false;
                pony.isUnicorn = false;
                final Color color = new Color(bufferedimage.getRGB(0, 0), true);
                final Color color2 = new Color(249, 177, 49, 255);
                final Color color3 = new Color(136, 202, 240, 255);
                final Color color4 = new Color(209, 159, 228, 255);
                final Color color5 = new Color(254, 249, 252, 255);
                if (color.equals(color2)) {}
                if (color.equals(color3)) {
                    pony.isPegasus = true;
                }
                if (color.equals(color4)) {
                    pony.isUnicorn = true;
                }
                if (color.equals(color5)) {
                    pony.isPegasus = true;
                    pony.isUnicorn = true;
                }
                pony.checked = pony.textureLocation;
            }
            catch (IOException ex) {}
        }
        this.isSleeping = pony.isPlayerSleeping();
        this.isUnicorn = pony.isUnicorn;
        this.isPegasus = pony.isPegasus;
        this.isSneak = pony.isSneaking();
        this.heldItemRight = ((pony.getHeldItem() != null) ? 1 : 0);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        if (this.isSleeping) {
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(0.0f, -0.5f, -0.9f);
        }
        this.Head.render(f5);
        this.Headpiece[0].render(f5);
        this.Headpiece[1].render(f5);
        if (this.isUnicorn) {
            this.Headpiece[2].render(f5);
        }
        this.Helmet.render(f5);
        this.Body.render(f5);
        for (int i = 0; i < this.Bodypiece.length; ++i) {
            this.Bodypiece[i].render(f5);
        }
        this.LeftArm.render(f5);
        this.RightArm.render(f5);
        this.LeftLeg.render(f5);
        this.RightLeg.render(f5);
        for (int j = 0; j < this.Tail.length; ++j) {
            this.Tail[j].render(f5);
        }
        if (this.isPegasus) {
            if (this.isFlying || this.isSneak) {
                for (int k = 0; k < this.LeftWingExt.length; ++k) {
                    this.LeftWingExt[k].render(f5);
                }
                for (int l = 0; l < this.RightWingExt.length; ++l) {
                    this.RightWingExt[l].render(f5);
                }
            }
            else {
                for (int i2 = 0; i2 < this.LeftWing.length; ++i2) {
                    this.LeftWing[i2].render(f5);
                }
                for (int j2 = 0; j2 < this.RightWing.length; ++j2) {
                    this.RightWing[j2].render(f5);
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    protected void renderGlow(final RenderManager rendermanager, final EntityPlayer entityplayer) {
        final ItemStack itemstack = entityplayer.inventory.getCurrentItem();
        if (itemstack == null) {
            return;
        }
        GL11.glPushMatrix();
        final double d = entityplayer.posX;
        final double d2 = entityplayer.posY;
        final double d3 = entityplayer.posZ;
        GL11.glEnable(32826);
        GL11.glTranslatef((float)d + 0.0f, (float)d2 + 2.3f, (float)d3);
        GL11.glScalef(5.0f, 5.0f, 5.0f);
        GL11.glRotatef(-rendermanager.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(rendermanager.playerViewX, 1.0f, 0.0f, 0.0f);
        final Tessellator tessellator = Tessellator.instance;
        final float f = 0.0f;
        final float f2 = 0.25f;
        final float f3 = 0.0f;
        final float f4 = 0.25f;
        final float f5 = 1.0f;
        final float f6 = 0.5f;
        final float f7 = 0.25f;
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0f, 1.0f, 0.0f);
        tessellator.addVertexWithUV(-1.0, -1.0, 0.0, 0.0, 1.0);
        tessellator.addVertexWithUV(-1.0, 1.0, 0.0, 1.0, 1.0);
        tessellator.addVertexWithUV(1.0, 1.0, 0.0, 1.0, 0.0);
        tessellator.addVertexWithUV(1.0, -1.0, 0.0, 0.0, 0.0);
        tessellator.draw();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }
}
