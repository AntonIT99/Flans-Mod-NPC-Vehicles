// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.IImageBuffer;
import noppes.npcs.client.ImageDownloadAlt;
import net.minecraft.client.resources.SkinManager;
import java.util.Map;
import java.io.File;
import java.security.MessageDigest;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.entity.AbstractClientPlayer;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.constants.EnumStandingType;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;

public class RenderNPCInterface extends RenderLiving
{
    public static long LastTextureTick;
    
    public RenderNPCInterface(final ModelBase model, final float f) {
        super(model, f);
    }
    
    protected void renderName(final EntityNPCInterface npc, final double d, final double d1, final double d2) {
        if (!this.func_110813_b((EntityLiving)npc)) {
            return;
        }
        final float f2 = npc.getDistanceToEntity((Entity)this.renderManager.livingPlayer);
        final float f3 = npc.isSneaking() ? 32.0f : 64.0f;
        if (f2 > f3) {
            return;
        }
        if (npc.messages != null) {
            final float height = npc.baseHeight / 5.0f * npc.display.modelSize;
            final float offset = npc.height * (1.2f + (npc.display.showName() ? (npc.display.title.isEmpty() ? 0.15f : 0.25f) : 0.0f));
            npc.messages.renderMessages(d, d1 + offset, d2, 0.666667f * height);
        }
        final float scale = npc.baseHeight / 5.0f * npc.display.modelSize;
        int height2 = 0;
        if (npc.display.showName()) {
            final String s = npc.getCommandSenderName();
            if (!npc.display.title.isEmpty()) {
                this.renderLivingLabel(npc, d, d1 + npc.height - 0.06f * scale, d2, 64, "<" + npc.display.title + ">", 0.6f, s, 1.0f);
                height2 = 2;
            }
            else {
                this.renderLivingLabel(npc, d, d1 + npc.height - 0.06f * scale, d2, 64, s, 1.0f);
                height2 = 1;
            }
        }
    }
    
    public void doRenderShadowAndFire(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        final EntityNPCInterface npc = (EntityNPCInterface)par1Entity;
        if (!npc.isKilled()) {
            super.doRenderShadowAndFire(par1Entity, par2, par4, par6, par8, par9);
        }
    }
    
    protected void renderLivingLabel(final EntityNPCInterface npc, final double d, final double d1, final double d2, int i, final Object... obs) {
        final FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
        i = npc.getBrightnessForRender(0.0f);
        int j = i % 65536;
        final int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, j / 1.0f, k / 1.0f);
        final float f1 = npc.baseHeight / 5.0f * npc.display.modelSize;
        final float f2 = 0.01666667f * f1;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.0f, (float)d1, (float)d2);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        final Tessellator tessellator = Tessellator.instance;
        float height = f1 / 6.5f;
        for (j = 0; j < obs.length; j += 2) {
            final float scale = (Float) obs[j + 1];
            height += f1 / 6.5f * scale;
            GL11.glPushMatrix();
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDisable(3553);
            final String s = obs[j].toString();
            GL11.glTranslatef(0.0f, height, 0.0f);
            GL11.glScalef(-f2 * scale, -f2 * scale, f2 * scale);
            tessellator.startDrawingQuads();
            final int size = fontrenderer.getStringWidth(s) / 2;
            tessellator.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
            tessellator.addVertex((double)(-size - 1), -1.0, 0.0);
            tessellator.addVertex((double)(-size - 1), 8.0, 0.0);
            tessellator.addVertex((double)(size + 1), 8.0, 0.0);
            tessellator.addVertex((double)(size + 1), -1.0, 0.0);
            tessellator.draw();
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            final int color = npc.faction.color;
            fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, 0, color);
            GL11.glPopMatrix();
        }
        GL11.glEnable(3008);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    protected void renderPlayerScale(final EntityNPCInterface npc, final float f) {
        GL11.glScalef(npc.scaleX / 5.0f * npc.display.modelSize, npc.scaleY / 5.0f * npc.display.modelSize, npc.scaleZ / 5.0f * npc.display.modelSize);
    }
    
    protected void renderPlayerSleep(final EntityNPCInterface npc, final double d, final double d1, final double d2) {
        this.shadowSize = npc.display.modelSize / 10.0f;
        float xOffset = 0.0f;
        float yOffset = (npc.currentAnimation == EnumAnimation.NONE) ? (npc.ai.bodyOffsetY / 10.0f - 0.5f) : 0.0f;
        float zOffset = 0.0f;
        if (npc.isEntityAlive()) {
            if (npc.isPlayerSleeping()) {
                xOffset = (float)(-Math.cos(Math.toRadians(180 - npc.ai.orientation)));
                zOffset = (float)(-Math.sin(Math.toRadians(npc.ai.orientation)));
                yOffset += 0.14f;
            }
            else if (npc.isRiding()) {
                yOffset -= 0.5f - ((EntityCustomNpc)npc).modelData.getLegsY() * 0.8f;
            }
        }
        this.renderLiving(npc, d, d1, d2, xOffset, yOffset, zOffset);
    }
    
    private void renderLiving(final EntityNPCInterface npc, final double d, final double d1, final double d2, float xoffset, float yoffset, float zoffset) {
        xoffset = xoffset / 5.0f * npc.display.modelSize;
        yoffset = yoffset / 5.0f * npc.display.modelSize;
        zoffset = zoffset / 5.0f * npc.display.modelSize;
        super.renderLivingAt((EntityLivingBase)npc, d + xoffset, d1 + yoffset, d2 + zoffset);
    }
    
    protected void rotateCorpse(final EntityLivingBase entity, final float f, final float f1, final float f2) {
        final EntityNPCInterface npc = (EntityNPCInterface)entity;
        if (npc.isEntityAlive() && npc.isPlayerSleeping()) {
            GL11.glRotatef((float)npc.ai.orientation, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(this.getDeathMaxRotation((EntityLivingBase)npc), 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        }
        else if (npc.isEntityAlive() && npc.currentAnimation == EnumAnimation.CRAWLING) {
            GL11.glRotatef(270.0f - f1, 0.0f, 1.0f, 0.0f);
            final float scale = ((EntityCustomNpc)npc).display.modelSize / 5.0f;
            GL11.glTranslated((double)(-scale + ((EntityCustomNpc)npc).modelData.getLegsY() * scale), 0.14000000059604645, 0.0);
            GL11.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            super.rotateCorpse((EntityLivingBase)npc, f, f1, f2);
        }
    }
    
    protected void passSpecialRender(final EntityLivingBase par1EntityLivingBase, final double par2, final double par4, final double par6) {
        this.renderName((EntityNPCInterface)par1EntityLivingBase, par2, par4, par6);
    }
    
    protected void preRenderCallback(final EntityLivingBase entityliving, final float f) {
        this.renderPlayerScale((EntityNPCInterface)entityliving, f);
    }
    
    public void doRender(final EntityLiving entityliving, final double d, final double d1, final double d2, final float f, final float f1) {
        final EntityNPCInterface npc = (EntityNPCInterface)entityliving;
        if (npc.isKilled() && npc.stats.hideKilledBody && npc.deathTime > 20) {
            return;
        }
        if ((npc.display.showBossBar == 1 || (npc.display.showBossBar == 2 && npc.isAttacking())) && !npc.isKilled() && npc.deathTime <= 20 && npc.canSee((Entity)Minecraft.getMinecraft().thePlayer)) {
            BossStatus.setBossStatus((IBossDisplayData)npc, true);
        }
        if (npc.ai.standingType == EnumStandingType.HeadRotation && !npc.isWalking() && !npc.isInteracting()) {
            final EntityNPCInterface entityNPCInterface = npc;
            final EntityNPCInterface entityNPCInterface2 = npc;
            final float n = npc.ai.orientation;
            entityNPCInterface2.renderYawOffset = n;
            entityNPCInterface.prevRenderYawOffset = n;
        }
        super.doRender(entityliving, d, d1, d2, f, f1);
    }
    
    protected void renderModel(final EntityLivingBase entityliving, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        super.renderModel(entityliving, par2, par3, par4, par5, par6, par7);
        final EntityNPCInterface npc = (EntityNPCInterface)entityliving;
        if (!npc.display.glowTexture.isEmpty()) {
            GL11.glDepthFunc(515);
            if (npc.textureGlowLocation == null) {
                npc.textureGlowLocation = new ResourceLocation(npc.display.glowTexture);
            }
            this.bindTexture(npc.textureGlowLocation);
            final float f1 = 1.0f;
            GL11.glEnable(3042);
            GL11.glBlendFunc(1, 1);
            GL11.glDisable(2896);
            if (npc.isInvisible()) {
                GL11.glDepthMask(false);
            }
            else {
                GL11.glDepthMask(true);
            }
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPushMatrix();
            GL11.glScalef(1.001f, 1.001f, 1.001f);
            if (this.mainModel instanceof ModelMPM) {
                ((ModelMPM)this.mainModel).isArmor = true;
                this.mainModel.render((Entity)entityliving, par2, par3, par4, par5, par6, par7);
                ((ModelMPM)this.mainModel).isArmor = false;
            }
            else {
                this.mainModel.render((Entity)entityliving, par2, par3, par4, par5, par6, par7);
            }
            GL11.glPopMatrix();
            GL11.glEnable(2896);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, f1);
            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
        }
    }
    
    protected float handleRotationFloat(final EntityLivingBase par1EntityLiving, final float par2) {
        final EntityNPCInterface npc = (EntityNPCInterface)par1EntityLiving;
        if (npc.isKilled() || npc.display.disableLivingAnimation) {
            return 0.0f;
        }
        return super.handleRotationFloat(par1EntityLiving, par2);
    }
    
    protected void renderLivingAt(final EntityLivingBase entityliving, final double d, final double d1, final double d2) {
        this.renderPlayerSleep((EntityNPCInterface)entityliving, d, d1, d2);
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final EntityNPCInterface npc = (EntityNPCInterface)entity;
        if (npc.textureLocation == null) {
            if (npc.display.skinType == 0) {
                npc.textureLocation = new ResourceLocation(npc.display.texture);
            }
            else {
                if (RenderNPCInterface.LastTextureTick < 5L) {
                    return AbstractClientPlayer.locationStevePng;
                }
                if (npc.display.skinType == 1 && npc.display.playerProfile != null) {
                    final Minecraft minecraft = Minecraft.getMinecraft();
                    final Map map = minecraft.func_152342_ad().func_152788_a(npc.display.playerProfile);
                    if (map.containsKey(MinecraftProfileTexture.Type.SKIN)) {
                        npc.textureLocation = minecraft.func_152342_ad().func_152792_a((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                    }
                    RenderNPCInterface.LastTextureTick = 0L;
                }
                else if (npc.display.skinType == 2) {
                    try {
                        final MessageDigest digest = MessageDigest.getInstance("MD5");
                        final byte[] hash = digest.digest(npc.display.url.getBytes("UTF-8"));
                        final StringBuilder sb = new StringBuilder(2 * hash.length);
                        for (final byte b : hash) {
                            sb.append(String.format("%02x", b & 0xFF));
                        }
                        this.func_110301_a(null, npc.textureLocation = new ResourceLocation("skins/" + sb.toString()), npc.display.url);
                        RenderNPCInterface.LastTextureTick = 0L;
                    }
                    catch (Exception ex) {}
                }
            }
        }
        if (npc.textureLocation == null) {
            return AbstractClientPlayer.locationStevePng;
        }
        return npc.textureLocation;
    }
    
    private void func_110301_a(final File file, final ResourceLocation resource, final String par1Str) {
        final TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
        final ITextureObject object = (ITextureObject)new ImageDownloadAlt(file, par1Str, SkinManager.field_152793_a, (IImageBuffer)new ImageBufferDownloadAlt());
        texturemanager.loadTexture(resource, object);
    }
    
    static {
        RenderNPCInterface.LastTextureTick = 0L;
    }
}
