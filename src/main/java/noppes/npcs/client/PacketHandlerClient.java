// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.stats.Achievement;
import noppes.npcs.client.gui.player.GuiBook;
import net.minecraft.item.ItemStack;
import noppes.npcs.ServerEventsHandler;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.IGuiClose;
import noppes.npcs.client.gui.util.IGuiError;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;
import noppes.npcs.client.gui.util.GuiNPCInterface;
import noppes.npcs.client.gui.GuiNpcMobSpawnerAdd;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.CustomNpcs;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.entity.Entity;
import noppes.npcs.client.controllers.MusicController;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityDialogNpc;
import java.util.HashMap;
import noppes.npcs.controllers.RecipeController;
import noppes.npcs.controllers.RecipeCarpentry;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.gui.achievement.GuiAchievement;
import net.minecraft.util.StatCollector;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.Server;
import noppes.npcs.entity.EntityNPCInterface;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import java.io.IOException;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import noppes.npcs.PacketHandlerServer;

public class PacketHandlerClient extends PacketHandlerServer
{
    @SubscribeEvent
    public void onPacketData(final FMLNetworkEvent.ClientCustomPacketEvent event) {
        final EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
        final ByteBuf buffer = event.packet.payload();
        try {
            this.client(buffer, player, EnumPacketClient.values()[buffer.readInt()]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void client(final ByteBuf buffer, final EntityPlayer player, final EnumPacketClient type) throws IOException {
        if (type == EnumPacketClient.CHATBUBBLE) {
            final Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            final EntityNPCInterface npc = (EntityNPCInterface)entity;
            if (npc.messages == null) {
                npc.messages = new RenderChatMessages();
            }
            final String text = NoppesStringUtils.formatText(Server.readString(buffer), player, npc);
            npc.messages.addMessage(text, npc);
            if (buffer.readBoolean()) {
                player.addChatMessage((IChatComponent)new ChatComponentTranslation(npc.getCommandSenderName() + ": " + text, new Object[0]));
            }
        }
        else if (type == EnumPacketClient.CHAT) {
            String message = "";
            String str;
            while ((str = Server.readString(buffer)) != null && !str.isEmpty()) {
                message += StatCollector.translateToLocal(str);
            }
            player.addChatMessage((IChatComponent)new ChatComponentTranslation(message, new Object[0]));
        }
        else if (type == EnumPacketClient.MESSAGE) {
            final String description = StatCollector.translateToLocal(Server.readString(buffer));
            final String message2 = Server.readString(buffer);
            final Achievement ach = new QuestAchievement(message2, description);
            Minecraft.getMinecraft().guiAchievement.func_146256_a(ach);
            ObfuscationReflectionHelper.setPrivateValue((Class)GuiAchievement.class, (Object)Minecraft.getMinecraft().guiAchievement, (Object)ach.getDescription(), 4);
        }
        else if (type == EnumPacketClient.SYNCRECIPES_ADD) {
            final NBTTagList list = Server.readNBT(buffer).getTagList("recipes", 10);
            if (list == null) {
                return;
            }
            for (int i = 0; i < list.tagCount(); ++i) {
                final RecipeCarpentry recipe = RecipeCarpentry.read(list.getCompoundTagAt(i));
                RecipeController.syncRecipes.put(recipe.id, recipe);
            }
        }
        else if (type == EnumPacketClient.SYNCRECIPES_WORKBENCH) {
            RecipeController.reloadGlobalRecipes(RecipeController.syncRecipes);
            RecipeController.syncRecipes = new HashMap<Integer, RecipeCarpentry>();
        }
        else if (type == EnumPacketClient.SYNCRECIPES_CARPENTRYBENCH) {
            RecipeController.instance.anvilRecipes = RecipeController.syncRecipes;
            RecipeController.syncRecipes = new HashMap<Integer, RecipeCarpentry>();
        }
        else if (type == EnumPacketClient.DIALOG) {
            final Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            NoppesUtil.openDialog(Server.readNBT(buffer), (EntityNPCInterface)entity, player);
        }
        else if (type == EnumPacketClient.DIALOG_DUMMY) {
            final EntityDialogNpc npc2 = new EntityDialogNpc(player.worldObj);
            npc2.display.name = Server.readString(buffer);
            EntityUtil.Copy((EntityLivingBase)player, (EntityLivingBase)npc2);
            NoppesUtil.openDialog(Server.readNBT(buffer), npc2, player);
        }
        else if (type == EnumPacketClient.QUEST_COMPLETION) {
            NoppesUtil.guiQuestCompletion(player, Server.readNBT(buffer));
        }
        else if (type == EnumPacketClient.EDIT_NPC) {
            final Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            NoppesUtil.setLastNpc((EntityNPCInterface)entity);
        }
        else if (type == EnumPacketClient.PLAY_MUSIC) {
            MusicController.Instance.playMusic(Server.readString(buffer), (Entity)player);
        }
        else if (type == EnumPacketClient.PLAY_SOUND) {
            MusicController.Instance.playSound(Server.readString(buffer), buffer.readFloat(), buffer.readFloat(), buffer.readFloat());
        }
        else if (type == EnumPacketClient.UPDATE_NPC) {
            final NBTTagCompound compound = Server.readNBT(buffer);
            final Entity entity2 = Minecraft.getMinecraft().theWorld.getEntityByID(compound.getInteger("EntityId"));
            if (entity2 == null || !(entity2 instanceof EntityNPCInterface)) {
                return;
            }
            ((EntityNPCInterface)entity2).readSpawnData(compound);
        }
        else if (type == EnumPacketClient.ROLE) {
            final NBTTagCompound compound = Server.readNBT(buffer);
            final Entity entity2 = Minecraft.getMinecraft().theWorld.getEntityByID(compound.getInteger("EntityId"));
            if (entity2 == null || !(entity2 instanceof EntityNPCInterface)) {
                return;
            }
            ((EntityNPCInterface)entity2).advanced.setRole(compound.getInteger("Role"));
            ((EntityNPCInterface)entity2).roleInterface.readFromNBT(compound);
            NoppesUtil.setLastNpc((EntityNPCInterface)entity2);
        }
        else if (type == EnumPacketClient.GUI) {
            final EnumGuiType gui = EnumGuiType.values()[buffer.readInt()];
            CustomNpcs.proxy.openGui(NoppesUtil.getLastNpc(), gui, buffer.readInt(), buffer.readInt(), buffer.readInt());
        }
        else if (type == EnumPacketClient.PARTICLE) {
            NoppesUtil.spawnParticle(buffer);
        }
        else if (type == EnumPacketClient.DELETE_NPC) {
            final Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            ((EntityNPCInterface)entity).delete();
        }
        else if (type == EnumPacketClient.SCROLL_LIST) {
            NoppesUtil.setScrollList(buffer);
        }
        else if (type == EnumPacketClient.SCROLL_DATA) {
            NoppesUtil.setScrollData(buffer);
        }
        else if (type == EnumPacketClient.SCROLL_DATA_PART) {
            NoppesUtil.addScrollData(buffer);
        }
        else if (type == EnumPacketClient.SCROLL_SELECTED) {
            final GuiScreen gui2 = Minecraft.getMinecraft().currentScreen;
            if (gui2 == null || !(gui2 instanceof IScrollData)) {
                return;
            }
            final String selected = Server.readString(buffer);
            ((IScrollData)gui2).setSelected(selected);
        }
        else if (type == EnumPacketClient.GUI_REDSTONE) {
            NoppesUtil.saveRedstoneBlock(player, Server.readNBT(buffer));
        }
        else if (type == EnumPacketClient.GUI_WAYPOINT) {
            NoppesUtil.saveWayPointBlock(player, Server.readNBT(buffer));
        }
        else if (type == EnumPacketClient.CLONE) {
            final NBTTagCompound compound = Server.readNBT(buffer);
            NoppesUtil.openGUI(player, new GuiNpcMobSpawnerAdd(compound));
        }
        else if (type == EnumPacketClient.GUI_DATA) {
            GuiScreen gui2 = Minecraft.getMinecraft().currentScreen;
            if (gui2 == null) {
                return;
            }
            if (gui2 instanceof GuiNPCInterface && ((GuiNPCInterface)gui2).hasSubGui()) {
                gui2 = ((GuiNPCInterface)gui2).getSubGui();
            }
            else if (gui2 instanceof GuiContainerNPCInterface && ((GuiContainerNPCInterface)gui2).hasSubGui()) {
                gui2 = ((GuiContainerNPCInterface)gui2).getSubGui();
            }
            if (gui2 instanceof IGuiData) {
                ((IGuiData)gui2).setGuiData(Server.readNBT(buffer));
            }
        }
        else if (type == EnumPacketClient.GUI_ERROR) {
            final GuiScreen gui2 = Minecraft.getMinecraft().currentScreen;
            if (gui2 == null || !(gui2 instanceof IGuiError)) {
                return;
            }
            final int i = buffer.readInt();
            final NBTTagCompound compound2 = Server.readNBT(buffer);
            ((IGuiError)gui2).setError(i, compound2);
        }
        else if (type == EnumPacketClient.GUI_CLOSE) {
            final GuiScreen gui2 = Minecraft.getMinecraft().currentScreen;
            if (gui2 == null) {
                return;
            }
            if (gui2 instanceof IGuiClose) {
                final int i = buffer.readInt();
                final NBTTagCompound compound2 = Server.readNBT(buffer);
                ((IGuiClose)gui2).setClose(i, compound2);
            }
            final Minecraft mc = Minecraft.getMinecraft();
            mc.displayGuiScreen((GuiScreen)null);
            mc.setIngameFocus();
        }
        else if (type == EnumPacketClient.VILLAGER_LIST) {
            final MerchantRecipeList merchantrecipelist = MerchantRecipeList.func_151390_b(new PacketBuffer(buffer));
            ServerEventsHandler.Merchant.setRecipes(merchantrecipelist);
        }
        else if (type == EnumPacketClient.OPEN_BOOK) {
            final int x = buffer.readInt();
            final int y = buffer.readInt();
            final int z = buffer.readInt();
            NoppesUtil.openGUI(player, new GuiBook(player, ItemStack.loadItemStackFromNBT(Server.readNBT(buffer)), x, y, z));
        }
        else if (type == EnumPacketClient.CONFIG) {
            final int config = buffer.readInt();
            if (config == 0) {
                final String font = Server.readString(buffer);
                final int size = buffer.readInt();
                if (!font.isEmpty()) {
                    CustomNpcs.FontType = font;
                    CustomNpcs.FontSize = size;
                    ClientProxy.Font = new ClientProxy.FontContainer(CustomNpcs.FontType, CustomNpcs.FontSize);
                    CustomNpcs.Config.updateConfig();
                    player.addChatMessage((IChatComponent)new ChatComponentTranslation("Font set to %s", new Object[] { ClientProxy.Font.getName() }));
                }
                else {
                    player.addChatMessage((IChatComponent)new ChatComponentTranslation("Current font is %s", new Object[] { ClientProxy.Font.getName() }));
                }
            }
        }
    }
}
