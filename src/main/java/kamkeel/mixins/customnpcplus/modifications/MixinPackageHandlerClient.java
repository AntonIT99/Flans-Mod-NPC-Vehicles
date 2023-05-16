package kamkeel.mixins.customnpcplus.modifications;

import noppes.npcs.client.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = PacketHandlerClient.class)
public abstract class MixinPackageHandlerClient  {


	// EXAMPLE of an OVERWRITE for a FULL METHOD
//	@Overwrite(remap = false)
//	private void client(ByteBuf buffer, EntityPlayer player, EnumPacketClient type) throws IOException {
//	// PASTE client() from PACKET HANDLER CLIENT
//		// WITH MODIFICATIONS
//	}

	// EXAMPLE of an INJECTION into a METHOD at a specific LINE / VALUE
//	@Inject(method = "renderWorld", at = @At(value = "RETURN"))
//	private void renderFirstPersonOverlays(float p_78476_1_, long p_78476_2_, CallbackInfo callbackInfo)
//	{
//		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
//		if (ClientEventHandler.hasOverlays(player)) {
//			GL11.glPushMatrix();
//			ClientEventHandler.renderCNPCPlayer.renderHand(p_78476_1_,0);
//			GL11.glPopMatrix();
//		}
//	}
}