// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.MinecraftServer;
import noppes.npcs.util.ValueUtil;
import java.util.UUID;
import net.minecraft.util.StringUtils;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Random;
import com.mojang.authlib.GameProfile;
import noppes.npcs.entity.EntityNPCInterface;

public class DataDisplay
{
    EntityNPCInterface npc;
    public String name;
    public String title;
    public byte skinType;
    public String url;
    public GameProfile playerProfile;
    public String texture;
    public String cloakTexture;
    public String glowTexture;
    public int visible;
    public int modelSize;
    public int showName;
    public boolean disableLivingAnimation;
    public byte showBossBar;
    
    public DataDisplay(final EntityNPCInterface npc) {
        this.title = "";
        this.skinType = 0;
        this.url = "";
        this.texture = "customnpcs:textures/entity/humanmale/Steve.png";
        this.cloakTexture = "";
        this.glowTexture = "";
        this.visible = 0;
        this.modelSize = 5;
        this.showName = 0;
        this.disableLivingAnimation = false;
        this.showBossBar = 0;
        this.npc = npc;
        final String[] names = { "Noppes", "Noppes", "Noppes", "Noppes", "Atesson", "Rothcersul", "Achdranys", "Pegato", "Chald", "Gareld", "Nalworche", "Ineald", "Tia'kim", "Torerod", "Turturdar", "Ranler", "Dyntan", "Oldrake", "Gharis", "Elmn", "Tanal", "Waran-ess", "Ach-aldhat", "Athi", "Itageray", "Tasr", "Ightech", "Gakih", "Adkal", "Qua'an", "Sieq", "Urnp", "Rods", "Vorbani", "Smaik", "Fian", "Hir", "Ristai", "Kineth", "Naif", "Issraya", "Arisotura", "Honf", "Rilfom", "Estz", "Ghatroth", "Yosil", "Darage", "Aldny", "Tyltran", "Armos", "Loxiku", "Burhat", "Tinlt", "Ightyd", "Mia", "Ken", "Karla", "Lily", "Carina", "Daniel", "Slater", "Zidane", "Valentine", "Eirina", "Carnow", "Grave", "Shadow", "Drakken", "Kaoz", "Silk", "Drake", "Oldam", "Lynxx", "Lenyx", "Winter", "Seth", "Apolitho", "Amethyst", "Ankin", "Seinkan", "Ayumu", "Sakamoto", "Divina", "Div", "Magia", "Magnus", "Tiakono", "Ruin", "Hailinx", "Ethan", "Wate", "Carter", "William", "Brion", "Sparrow", "Basrrelen", "Gyaku", "Claire", "Crowfeather", "Blackwell", "Raven", "Farcri", "Lucas", "Bangheart", "Kamoku", "Kyoukan", "Blaze", "Benjamin", "Larianne", "Kakaragon", "Melancholy", "Epodyno", "Thanato", "Mika", "Dacks", "Ylander", "Neve", "Meadow", "Cuero", "Embrera", "Eldamore", "Faolan", "Chim", "Nasu", "Kathrine", "Ariel", "Arei", "Demytrix", "Kora", "Ava", "Larson", "Leonardo", "Wyrl", "Sakiama", "Lambton", "Kederath", "Malus", "Riplette", "Andern", "Ezall", "Lucien", "Droco", "Cray", "Tymen", "Zenix", "Entranger", "Saenorath", "Chris", "Christine", "Marble", "Mable", "Ross", "Rose", "Xalgan ", "Kennet" };
        this.name = names[new Random().nextInt(names.length)];
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setString("Name", this.name);
        nbttagcompound.setString("Title", this.title);
        nbttagcompound.setString("SkinUrl", this.url);
        nbttagcompound.setString("Texture", this.texture);
        nbttagcompound.setString("CloakTexture", this.cloakTexture);
        nbttagcompound.setString("GlowTexture", this.glowTexture);
        nbttagcompound.setByte("UsingSkinUrl", this.skinType);
        if (this.playerProfile != null) {
            final NBTTagCompound nbttagcompound2 = new NBTTagCompound();
            NBTUtil.func_152460_a(nbttagcompound2, this.playerProfile);
            nbttagcompound.setTag("SkinUsername", (NBTBase)nbttagcompound2);
        }
        nbttagcompound.setInteger("Size", this.modelSize);
        nbttagcompound.setInteger("ShowName", this.showName);
        nbttagcompound.setInteger("NpcVisible", this.visible);
        nbttagcompound.setBoolean("NoLivingAnimation", this.disableLivingAnimation);
        nbttagcompound.setByte("BossBar", this.showBossBar);
        return nbttagcompound;
    }
    
    public void readToNBT(final NBTTagCompound nbttagcompound) {
        this.name = nbttagcompound.getString("Name");
        this.title = nbttagcompound.getString("Title");
        this.url = nbttagcompound.getString("SkinUrl");
        final int prevSkinType = this.skinType;
        this.skinType = nbttagcompound.getByte("UsingSkinUrl");
        this.playerProfile = null;
        if (this.skinType == 1) {
            if (nbttagcompound.hasKey("SkinUsername", 10)) {
                this.playerProfile = NBTUtil.func_152459_a(nbttagcompound.getCompoundTag("SkinUsername"));
            }
            else if (nbttagcompound.hasKey("SkinUsername", 8) && !StringUtils.isNullOrEmpty(nbttagcompound.getString("SkinUsername"))) {
                this.playerProfile = new GameProfile((UUID)null, nbttagcompound.getString("SkinUsername"));
            }
            this.loadProfile();
        }
        final String prevTexture = this.texture;
        this.texture = nbttagcompound.getString("Texture");
        this.cloakTexture = nbttagcompound.getString("CloakTexture");
        this.glowTexture = nbttagcompound.getString("GlowTexture");
        this.modelSize = ValueUtil.CorrectInt(nbttagcompound.getInteger("Size"), 1, 30);
        this.showName = nbttagcompound.getInteger("ShowName");
        this.visible = nbttagcompound.getInteger("NpcVisible");
        this.disableLivingAnimation = nbttagcompound.getBoolean("NoLivingAnimation");
        this.showBossBar = nbttagcompound.getByte("BossBar");
        if (prevSkinType != this.skinType || !this.texture.equals(prevTexture)) {
            this.npc.textureLocation = null;
        }
        this.npc.textureGlowLocation = null;
        this.npc.textureCloakLocation = null;
        this.npc.updateHitbox();
    }
    
    public void loadProfile() {
        if (this.playerProfile != null && !StringUtils.isNullOrEmpty(this.playerProfile.getName()) && MinecraftServer.getServer() != null && (!this.playerProfile.isComplete() || !this.playerProfile.getProperties().containsKey((Object)"textures"))) {
            GameProfile gameprofile = MinecraftServer.getServer().func_152358_ax().func_152655_a(this.playerProfile.getName());
            if (gameprofile != null) {
                final Property property = (Property)Iterables.getFirst((Iterable)gameprofile.getProperties().get((String)"textures"), (Object)null);
                if (property == null) {
                    gameprofile = MinecraftServer.getServer().func_147130_as().fillProfileProperties(gameprofile, false);
                }
                this.playerProfile = gameprofile;
            }
        }
    }
    
    public boolean showName() {
        return !this.npc.isKilled() && (this.showName == 0 || (this.showName == 2 && this.npc.isAttacking()));
    }
}
