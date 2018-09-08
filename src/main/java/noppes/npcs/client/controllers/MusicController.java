// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.controllers;

import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.audio.PositionedSoundRecord;

public class MusicController
{
    public static MusicController Instance;
    public PositionedSoundRecord playing;
    public ResourceLocation playingResource;
    public Entity playingEntity;
    
    public MusicController() {
        MusicController.Instance = this;
    }
    
    public void stopMusic() {
        final SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
        if (this.playing != null) {
            handler.stopSound((ISound)this.playing);
        }
        handler.stopSounds();
        this.playingResource = null;
        this.playingEntity = null;
        this.playing = null;
    }
    
    public void playStreaming(final String music, final Entity entity) {
        if (this.isPlaying(music)) {
            return;
        }
        this.stopMusic();
        this.playingEntity = entity;
        this.playingResource = new ResourceLocation(music);
        final SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
        handler.playSound((ISound)(this.playing = PositionedSoundRecord.func_147675_a(this.playingResource, (float)entity.posX, (float)entity.posY, (float)entity.posZ)));
    }
    
    public void playMusic(final String music, final Entity entity) {
        if (this.isPlaying(music)) {
            return;
        }
        this.stopMusic();
        this.playingResource = new ResourceLocation(music);
        this.playingEntity = entity;
        final SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
        handler.playSound((ISound)(this.playing = PositionedSoundRecord.func_147673_a(this.playingResource)));
    }
    
    public boolean isPlaying(final String music) {
        final ResourceLocation resource = new ResourceLocation(music);
        return this.playingResource != null && this.playingResource.equals((Object)resource) && Minecraft.getMinecraft().getSoundHandler().isSoundPlaying((ISound)this.playing);
    }
    
    public void playSound(final String music, final float x, final float y, final float z) {
        Minecraft.getMinecraft().theWorld.playSound((double)x, (double)y, (double)z, music, 1.0f, 1.0f, false);
    }
}
