package com.hfr.render.block;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.model.obj.Face;
import net.minecraftforge.client.model.obj.GroupObject;
import net.minecraftforge.client.model.obj.TextureCoordinate;
import net.minecraftforge.client.model.obj.Vertex;
import net.minecraftforge.client.model.obj.WavefrontObject;

public class ObjUtil {
	
    public static void renderWithIcon(WavefrontObject model, IIcon icon, Tessellator tes, float rot, boolean shadow)
    {
        for(GroupObject go : model.groupObjects)
        {
            for(Face f : go.faces) {
            	
                Vertex n = f.faceNormal;
                tes.setNormal(n.x, n.y, n.z);
                
                if(shadow) {
	                float brightness = (n.y + 1) * 0.65F;
	                
	                if(brightness < 0.45F)
	                	brightness = 0.45F;
	                
	                tes.setColorOpaque_F(brightness, brightness, brightness);
                }
                
                for(int i = 0; i < f.vertices.length; i++) {
                	
                    Vertex v = f.vertices[i];
                    
                    Vec3 vec = Vec3.createVectorHelper(v.x, v.y, v.z);
                    vec.rotateAroundY(rot);

                    double x = vec.xCoord;
                    double y = vec.yCoord;
                    double z = vec.zCoord;
                    
                    TextureCoordinate t = f.textureCoordinates[i];
                    tes.addVertexWithUV(x, y, z, icon.getInterpolatedU(t.u * 16D), icon.getInterpolatedV(t.v * 16D));
                    
                    //The shoddy way of rendering a tringulated model with a quad tessellator
                    if(i % 3 == 2)
                        tes.addVertexWithUV(x, y, z, icon.getInterpolatedU(t.u * 16D), icon.getInterpolatedV(t.v * 16D));
                }
            }
        }
    }
}
