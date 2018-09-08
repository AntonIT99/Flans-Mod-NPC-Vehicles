// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLiving;
import java.lang.reflect.Method;
import net.minecraft.entity.EntityList;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.controllers.PixelmonHelper;
import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.model.ModelNPCMale;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.util.ModelRenderPassHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;

public class RenderCustomNpc extends RenderNPCHumanMale
{
    private RendererLivingEntity renderEntity;
    private EntityLivingBase entity;
    private ModelRenderPassHelper renderpass;
    
    public RenderCustomNpc() {
        super(new ModelMPM(0.0f), new ModelMPM(1.0f), new ModelMPM(0.5f));
        this.renderpass = new ModelRenderPassHelper();
    }
    
    @Override
    public void renderPlayer(final EntityNPCInterface npcInterface, final double d, final double d1, final double d2, final float f, final float f1) {
        final EntityCustomNpc npc = (EntityCustomNpc)npcInterface;
        this.entity = npc.modelData.getEntity(npc);
        ModelBase model = null;
        this.renderEntity = null;
        if (this.entity != null) {
            this.renderEntity = (RendererLivingEntity)RenderManager.instance.getEntityRenderObject((Entity)this.entity);
            model = NPCRendererHelper.getMainModel(this.renderEntity);
            if (PixelmonHelper.isPixelmon((Entity)this.entity)) {
                try {
                    final Class c = Class.forName("com.pixelmonmod.pixelmon.entities.pixelmon.Entity2HasModel");
                    final Method m = c.getMethod("getModel", (Class[])new Class[0]);
                    model = (ModelBase)m.invoke(this.entity, new Object[0]);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (EntityList.getEntityString((Entity)this.entity).equals("doggystyle.Dog")) {
                try {
                    Method i = this.entity.getClass().getMethod("getBreed", (Class<?>[])new Class[0]);
                    final Object breed = i.invoke(this.entity, new Object[0]);
                    i = breed.getClass().getMethod("getModel", (Class<?>[])new Class[0]);
                    model = (ModelBase)i.invoke(breed, new Object[0]);
                    model.getClass().getMethod("setPosition", Integer.TYPE).invoke(model, 0);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.renderPassModel = this.renderpass;
            this.renderpass.renderer = this.renderEntity;
            this.renderpass.entity = this.entity;
        }
        ((ModelMPM)this.modelArmor).entityModel = model;
        ((ModelMPM)this.modelArmor).entity = this.entity;
        ((ModelMPM)this.modelArmorChestplate).entityModel = model;
        ((ModelMPM)this.modelArmorChestplate).entity = this.entity;
        ((ModelMPM)this.mainModel).entityModel = model;
        ((ModelMPM)this.mainModel).entity = this.entity;
        super.renderPlayer(npc, d, d1, d2, f, f1);
    }
    
    @Override
    protected void renderEquippedItems(final EntityLivingBase entityliving, final float f) {
        if (this.renderEntity != null) {
            NPCRendererHelper.renderEquippedItems(this.entity, f, this.renderEntity);
        }
        else {
            super.renderEquippedItems(entityliving, f);
        }
    }
    
    @Override
    protected int shouldRenderPass(final EntityLivingBase par1EntityLivingBase, final int par2, final float par3) {
        if (this.renderEntity != null) {
            return NPCRendererHelper.shouldRenderPass(this.entity, par2, par3, this.renderEntity);
        }
        return this.func_130006_a((EntityLiving)par1EntityLivingBase, par2, par3);
    }
    
    @Override
    protected void preRenderCallback(final EntityLivingBase entityliving, final float f) {
        if (this.renderEntity != null) {
            final EntityNPCInterface npc = (EntityNPCInterface)entityliving;
            final int size = npc.display.modelSize;
            if (this.entity instanceof EntityNPCInterface) {
                ((EntityNPCInterface)this.entity).display.modelSize = 5;
            }
            NPCRendererHelper.preRenderCallback(this.entity, f, this.renderEntity);
            npc.display.modelSize = size;
            GL11.glScalef(0.2f * npc.display.modelSize, 0.2f * npc.display.modelSize, 0.2f * npc.display.modelSize);
        }
        else {
            super.preRenderCallback(entityliving, f);
        }
    }
    
    @Override
    protected float handleRotationFloat(final EntityLivingBase par1EntityLivingBase, final float par2) {
        if (this.renderEntity != null) {
            return NPCRendererHelper.handleRotationFloat(this.entity, par2, this.renderEntity);
        }
        return super.handleRotationFloat(par1EntityLivingBase, par2);
    }
}
