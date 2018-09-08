// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import noppes.npcs.NoppesUtilPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.blocks.tiles.TileBigSign;
import noppes.npcs.client.gui.SubGuiNpcTextArea;

public class GuiBigSign extends SubGuiNpcTextArea
{
    public TileBigSign tile;
    
    public GuiBigSign(final int x, final int y, final int z) {
        super("");
        this.tile = (TileBigSign)this.player.worldObj.getTileEntity(x, y, z);
        this.text = this.tile.getText();
    }
    
    @Override
    public void close() {
        super.close();
        NoppesUtilPlayer.sendData(EnumPlayerPacket.SignSave, this.tile.xCoord, this.tile.yCoord, this.tile.zCoord, this.text);
    }
}
