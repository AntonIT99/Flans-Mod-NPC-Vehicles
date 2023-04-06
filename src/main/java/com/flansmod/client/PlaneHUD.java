package com.flansmod.client;


import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class PlaneHUD extends Gui {

	static double roll, pitch, yaw, w, h, y;
	static int kirmizi,yesil,mavi,renk;

	@SubscribeEvent
	public void asd(RenderGameOverlayEvent.Post event) {
	//	System.out.println("is it fucking working???");
		if(event.isCancelable()) event.setCanceled(true);
		if(event.type==ElementType.HELMET&&Minecraft.getMinecraft().gameSettings.thirdPersonView==0) {
			EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			if(p.ridingEntity!=null&&p.ridingEntity instanceof EntitySeat) {
				EntitySeat seat = (EntitySeat) p.ridingEntity;
				if(seat.driveable instanceof EntityPlane) {
					EntityPlane plane = ((EntityPlane)seat.driveable);
					double croll = plane.axes.getRoll();
					double proll = plane.prevAxes.getRoll();
					double cpitch = plane.axes.getPitch();
					double ppitch = plane.prevAxes.getPitch();
					double cyaw = plane.axes.getYaw();
					double pyaw = plane.prevAxes.getYaw();
					roll = proll+(croll-proll)*event.partialTicks;
					pitch = -(ppitch+(cpitch-ppitch)*event.partialTicks);
					yaw = -(pyaw+(cyaw-pyaw)*event.partialTicks);
					w = event.resolution.getScaledWidth_double();
					h = event.resolution.getScaledHeight_double();
					y = plane.posY;
					float dx = (float) (plane.posX - plane.lastTickPosX);
					float dy = (float) (plane.posY - plane.lastTickPosY);
					float dz = (float) (plane.posZ - plane.lastTickPosZ);
					//	                float hiz = (float) Math.sqrt(dx * dx + dy * dy + dz * dz) * 20F;

					Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
					float speed  =  (float) (forwards.x * (float)plane.motionX)*(forwards.x * (float)plane.motionX) + (forwards.y * (float)plane.motionY)*(forwards.y * (float)plane.motionY) + (forwards.z * (float)plane.motionZ)*(forwards.z * (float)plane.motionZ);

					float advancedSpeed = (float) Math.sqrt(speed);
					float cringedUniversalBuff = 1.0f;
					float Mach = (float) (plane.control.V*2.23694);
					float hiz = Mach;
					double cizgiicinyatay = MathHelper.floor_double(yaw);
					double cizgiicindikey = MathHelper.floor_double(pitch);
					FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
					double oran = h/353;



					GL11.glPushMatrix();
					GL11.glEnable(GL11.GL_BLEND);
					GL11.glColor4d(1,1,1, 1);
					//					Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/aaaaaaaaaaaaaaaaaa.png"));
					Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
					GL11.glTranslated(w/2.0, h/2.0, 0);
					GL11.glScaled(oran*0.8, oran*0.8, 1);

					double playerpitch = p.prevRotationPitch+(p.rotationPitch-p.prevRotationPitch)*event.partialTicks;
					double playeryaw = p.prevRotationYaw+(p.rotationYaw-p.prevRotationYaw)*event.partialTicks;
					playerpitch = -playerpitch;
					playeryaw = -playeryaw+90;
					double planepitch = pitch;
					double planeyaw = yaw+180;
					double yawdifference = planeyaw-playeryaw;
					double angleclosesttozero = yawdifference;
					if(Math.abs(planeyaw+360-playeryaw)<angleclosesttozero) angleclosesttozero = planeyaw+360-playeryaw;
					if(Math.abs(planeyaw-360-playeryaw)<angleclosesttozero) angleclosesttozero = planeyaw-360-playeryaw;
					if(Math.abs(planeyaw-playeryaw+360)<angleclosesttozero) angleclosesttozero = planeyaw-playeryaw+360;
					if(Math.abs(planeyaw-playeryaw-360)<angleclosesttozero) angleclosesttozero = planeyaw-playeryaw-360;
					yawdifference = angleclosesttozero;
					double actualplayerpitch = (90-playerpitch)*2*(1-(Math.cos(Math.toRadians(yawdifference))/2.0+0.5)+1-(Math.cos(Math.toRadians(roll))/2.0+0.5))+playerpitch;
					double actualplanepitch = (90-planepitch)*2*(1-(Math.cos(Math.toRadians(roll))/2.0+0.5))+planepitch;
					double pitchdifference = actualplanepitch-actualplayerpitch;
					double pitchfactor = Math.cos(Math.toRadians(roll))*pitchdifference;
					double yawfactor = Math.sin(Math.toRadians(roll))*yawdifference;
					double sum = pitchfactor + yawfactor;
					//					System.out.println();
					//					System.out.println(actualplanepitch);
					//					System.out.println(actualplayerpitch);
					//					System.out.println(pitchdifference);
					//					System.out.println(planeyaw);
					//					System.out.println(playeryaw);
					//					System.out.println(yawdifference);
					GL11.glTranslated(0, -sum*3+120, 0);
					double aralik = 20;
					double yaricap = 60;
					//					GL11.glTranslated(-aralik-yaricap*2, 0, 0);
					//					yuvarlak(360, yaricap);
					//					GL11.glTranslated(yaricap*2+aralik, 0, 0);
					//					yuvarlak(360, yaricap);
					//					GL11.glTranslated(yaricap*2+aralik, 0, 0);
					//					yuvarlak(360, yaricap);
					//					GL11.glTranslated(-aralik*2-yaricap*4, yaricap*2+aralik, 0);
					//					yuvarlak(360, yaricap);
					//					GL11.glTranslated(yaricap*2+aralik, 0, 0);
					//					yuvarlak(360, yaricap);
					//					GL11.glTranslated(yaricap*2+aralik, 0, 0);
					//					yuvarlak(360, yaricap);


					GL11.glPopMatrix();

					//System.out.println("doe sit meet condition? " + seat.seatInfo.hasHUD);
					if(seat.seatInfo.hasHUD) {
						
						//System.out.println("it wants to work");


						kirmizi = seat.seatInfo.hudColorR;
						yesil = seat.seatInfo.hudColorG;
						mavi = seat.seatInfo.hudColorB;

					//	kirmizi = 0;
					//	yesil = 255;
					//	mavi = 0;
						//					int re = Color.HSBtoRGB((float) ((Minecraft.getSystemTime()/1000.0)%1000000), 1, 1);
						//					Color co = Color.decode(re+"");
						//					kirmizi = co.getRed();
						//					yesil = co.getGreen();
						//					mavi = co.getBlue();
						renk = (kirmizi<<16)+(yesil<<8)+mavi;

						//burda ba�l�yor
						GL11.glPushMatrix();
						GL11.glEnable(GL11.GL_BLEND);
						GL11.glColor4d(kirmizi/255.0*1, yesil/255.0*1, mavi/255.0*1, 0.8);
						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						GL11.glTranslated(w/2.0, h/2.0, 0);
						GL11.glScaled(oran*0.8, oran*0.8, 1);

						//					GL11.glPushMatrix();
						//					GL11.glScaled(0.5, 0.5, 0.5);
						//					GL11.glColor4d(1, 1, 1, 1);
						//											Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/aaaaaaaaaaaaaaaaaa.png"));
						//					drawTexturedModalRect(-112, -112, 0, 0, 224, 224);
						//					GL11.glPopMatrix();


						nisangah(0);
						yukseklik(0);
						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));

						//YAW
						while(yaw<0) yaw+=360;
						while(yaw>0) yaw-=360;
						GL11.glPushMatrix();
						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						GL11.glTranslated(0, -135, 0);
						GL11.glRotated(60, 0, 0, 1);
						dortgen(15, 2, -1, 0);
						GL11.glRotated(60, 0, 0, 1);
						dortgen(15, 2, -1, 0);
						GL11.glPopMatrix();
						for(double i = -15; i<=20; i+=5) {
							GL11.glPushMatrix();
							GL11.glTranslated(0, -133, 0);					
							double fark = i+yaw%5;
							GL11.glTranslated(fark*6, 0, 0);
							GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
							Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
							int pi = (int)MathHelper.floor_double(yaw-yaw%5-i);
							dortgen(1, 10, 0, 1);
							int yatay = (int)MathHelper.floor_double(yaw-yaw%5-i);
							while(yatay<360) yatay+=360;
							while(yatay>360) yatay-=360;
							String s = yatay+"";
							boolean yon = false;
							if(s.equals("0")||s.equals("360")) {
								s = "E"; yon = true;
							}
							
							if(s.equals("-90")||s.equals("270")) {
								s = "S"; yon = true;
							}
							if(s.equals("-180")||s.equals("180")) {
								s = "W"; yon = true;
							}
							if(s.equals("90")||s.equals("-270")) {
								s = "N"; yon = true;
							}
							if(yon) {
								GL11.glTranslated(0, -12, 0);
								GL11.glScaled(2, 2, 0);
							}
							GL11.glTranslated(-fr.getStringWidth(s)/2.0, 12, 0);
							fr.drawString(s, 0, 0, renk);
							GL11.glPopMatrix();
						}
						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));

						//ROLL
						GL11.glPushMatrix();
						GL11.glRotated(-roll, 0, 0, 1);
						GL11.glPushMatrix();
						GL11.glTranslated(0, -15, 0);;
						dortgen(1, 20, 0, -1);
						GL11.glPopMatrix();
						GL11.glTranslated(-15, 0, 0);
						dortgen(20, 1, -1, 0);
						GL11.glTranslated(30, 0, 0);
						dortgen(20, 1, 1, 0);
						GL11.glPopMatrix();
						for(int i = -90; i<120; i+=30) {
							GL11.glPushMatrix();
							GL11.glRotated(i, 0, 0, 1);
							GL11.glTranslated(0, 40, 0);
							dortgen(1, 10, 0, 1);
							GL11.glPopMatrix();
						}

						//ALT
						GL11.glPushMatrix();
						GL11.glTranslated(65, 0, 0);
						GL11.glTranslated(30, 0, 0);
						dortgen(42.5, 1, 1, 0);
						GL11.glTranslated(42.5, -1, 0);
						dortgen(1, 12, 1, 0);
						GL11.glPushMatrix();
						GL11.glTranslated(1+fr.getStringWidth(String.format("%.2f", y))+2, 0, 0);
						dortgen(1, 12, 1, 0);
						GL11.glPopMatrix();
						GL11.glTranslated(0, -6.5, 0);
						dortgen(2+fr.getStringWidth(String.format("%.2f", y))+2, 1, 1, 0);
						GL11.glTranslated(0, 12.5, 0);
						dortgen(2+fr.getStringWidth(String.format("%.2f", y))+2, 1, 1, 0);
						GL11.glPopMatrix();
						GL11.glPushMatrix();
						GL11.glTranslated(fr.getStringWidth(String.format("%.2f", y))/2.0, 0, 0);
						yazi(String.format("%.2f", y), renk, 140, 0, 1);
						GL11.glPopMatrix();
						for(double i = -80; i<=80; i+=10) {
							GL11.glPushMatrix();
							GL11.glTranslated(30, 0, 0);
							GL11.glTranslated(70, 0, 0);
							double fark = i+y%10;
							if(-50<fark&&fark<50) {
								GL11.glTranslated(0, fark*2, 0);
								GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
								Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
								dortgen(10, 1, 0, 0);
								String s = (int)MathHelper.floor_double(y-y%10-i)+"";
								GL11.glTranslated(fr.getStringWidth(s)+2, 0, 0);
								yazi(s, renk, 0, 0, 1);
							}
							GL11.glPopMatrix();
						}

						//SPEED
						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						GL11.glPushMatrix();
						GL11.glTranslated(-30, 0, 0);
						GL11.glTranslated(-65, 0, 0);
						dortgen(42.5, 1, -1, 0);
						GL11.glTranslated(-42.5, -1, 0);
						dortgen(1, 12, -1, 0);
						GL11.glPushMatrix();
						double genislik = fr.getStringWidth(String.format("%.2f", hiz)); 
						GL11.glTranslated(-genislik-4, 0, 0);
						dortgen(1, 12, -1, 0);
						GL11.glPopMatrix();
						GL11.glTranslated(0, -6.5, 0);
						dortgen(genislik+5, 1, -1, 0);
						GL11.glTranslated(0, 12.5, 0);
						dortgen(genislik+5, 1, -1, 0);
						GL11.glPopMatrix();
						GL11.glPushMatrix();
						GL11.glTranslated(-genislik/2.0, 0, 0);
						yazi(String.format("%.2f", hiz), renk, -140, 0, 1);
						GL11.glPopMatrix();
						GL11.glPushMatrix();
						GL11.glTranslated(-fr.getStringWidth((int)(plane.throttle*100.0/1f)+"%")/2.0, 0, 0);
						yazi((int)(plane.throttle*100.0/1f)+"%", renk, -140, 12, 1);
						GL11.glPopMatrix();
						for(double i = -50; i<50; i+=10) {
							GL11.glPushMatrix();		
							GL11.glTranslated(-30, 0, 0);				
							double fark = i+hiz%10;
							GL11.glTranslated(-70, fark*2, 0);
							if(hiz-i>=0&&-50<fark&&fark<50) {
								GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
								Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
								dortgen(10, 1, 0, 0);
								String shiz = MathHelper.floor_double(hiz-hiz%10-i)+"";
								fr.drawString(shiz, -(int)(10)-fr.getStringWidth(shiz)+4, -4, renk);
							}
							GL11.glPopMatrix();
						}


						GL11.glPopMatrix();


						//					double b = h<w ? h*0.5 : w*0.5;
						//					b*=0.75;
						//					GL11.glPushMatrix();
						//					GL11.glEnable(GL11.GL_BLEND);
						//					GL11.glPushMatrix();
						//					GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//					Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//					//donen cizgiler
						//					GL11.glPushMatrix();
						//					GL11.glTranslated(w/2.0, h/2.0, 0);
						//					for(double i = -5; i<25; i+=5) {
						//						GL11.glPushMatrix();
						//						GL11.glRotated(roll, 0, 0, 1);
						//						double fark = i+pitch%5;
						//						GL11.glTranslated(0, fark*5, 0);
						//						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//						boolean kisa = false;
						//						boolean sifir = false;
						//						int pi = (int)MathHelper.floor_double(pitch-pitch%5-i);
						//						if(MathHelper.floor_double(pitch-pitch%5-i)==0) {
						//							sifir = true;
						//							GL11.glPushMatrix();
						//							GL11.glTranslated(b*0.3, 0, 0);
						//							dortgen(b*0.5, 2);
						//							GL11.glPopMatrix();
						//							GL11.glPushMatrix();
						//							GL11.glTranslated(-b*0.3, 0, 0);
						//							dortgen(b*0.5, 2);
						//							GL11.glPopMatrix();
						//						} else if(pi%10!=0) {
						//							kisa = true;
						//							dortgen(b*0.3, 1);
						//						} else {
						//							dortgen(b*0.5, 1);
						//						}
						//						GL11.glTranslated(kisa ? (int)(b*0.17)+fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0 : sifir ? b*0.6 : (int)(b*0.27)+fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0, 0, 0);
						//						GL11.glRotated(-roll, 0, 0, 1);
						//						fr.drawString((int)MathHelper.floor_double(pitch-pitch%5-i)+"", (int)(-fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0), -4, renk);
						//						GL11.glPopMatrix();
						//					}
						//					GL11.glPopMatrix();
						//
						//					//sag sol cizgiler
						//					GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//					Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//					GL11.glPushMatrix();
						//					GL11.glTranslated((w-b)/2.0, h/2.0, 0);
						//					dortgen(2, b);
						//					GL11.glTranslated(w-(w-b), 0, 0);
						//					dortgen(2, b);
						//					GL11.glTranslated(b*0.15, 0, 0);
						//					dortgen(b*0.3, 2);
						//					GL11.glTranslated(-b-b*0.3, 0, 0);
						//					dortgen(b*0.3, 2);
						//					GL11.glPopMatrix();
						//					for(double i = -50; i<50; i+=10) {
						//						GL11.glPushMatrix();
						//						GL11.glTranslated(w/2.0, h/2.0, 0);						
						//						double fark = i+y%10;
						//						if(-30<fark&&fark<30) {
						//							GL11.glTranslated(b/2.0+b*0.05, fark*2, 0);
						//							GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//							Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//							dortgen(b*0.1, 1);
						//							fr.drawString((int)MathHelper.floor_double(y-y%10-i)+"", (int)(b*0.1), -4, renk);
						//						}
						//						GL11.glPopMatrix();
						//					}
						//					for(double i = -50; i<50; i+=10) {
						//						GL11.glPushMatrix();
						//						GL11.glTranslated(w/2.0, h/2.0, 0);						
						//						double fark = i+hiz%10;
						//						GL11.glTranslated(-b/2.0-b*0.05, fark*2, 0);
						//						if(hiz-i>=0&&-30<fark&&fark<30) {
						//							GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//							Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//							dortgen(b*0.1, 1);
						//							String shiz = MathHelper.floor_double(hiz-hiz%10-i)+"";
						//							fr.drawString(shiz, -(int)(b*0.1)-fr.getStringWidth(shiz)+4, -4, renk);
						//						}
						//						GL11.glPopMatrix();
						//					}
						//
						//
						//					//yatay
						//					GL11.glPushMatrix();
						//					GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//					Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//					GL11.glTranslated(w/2.0, h/2.0-b*0.5, 0);
						//					dortgen(b*0.8, 2);
						//					dortgen(1, b*0.1);
						//					GL11.glPopMatrix();
						//					for(double i = -20; i<25; i+=5) {
						//						GL11.glPushMatrix();
						//						GL11.glTranslated(w/2.0, h/2.0-b*0.5, 0);					
						//						double fark = i+yaw%5;
						//						GL11.glTranslated(fark*2, 0, 0);
						//						GL11.glColor4d(kirmizi/255.0*0.85, yesil/255.0*0.85, mavi/255.0*0.85, 0.8);
						//						Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
						//						boolean kisa = false;
						//						int pi = (int)MathHelper.floor_double(yaw-yaw%5-i);
						//						if(pi%10!=0) {
						//							kisa = true;		
						//							GL11.glTranslated(0, -b*0.05, 0);
						//							dortgen(1, b*0.1);
						//						} else {
						//							GL11.glTranslated(0, -b*0.075, 0);
						//							dortgen(1, b*0.15);
						//						}
						//						int yatay = (int)MathHelper.floor_double(yaw-yaw%5-i);
						//						while(yatay<360) yatay+=360;
						//						while(yatay>360) yatay-=360;
						//						String s = yatay+"";
						//						boolean yon = false;
						//						if(s.equals("0")||s.equals("360")) {
						//							s = "E"; yon = true;
						//						}
						//						if(s.equals("-90")||s.equals("270")) {
						//							s = "S"; yon = true;
						//						}
						//						if(s.equals("-180")||s.equals("180")) {
						//							s = "W"; yon = true;
						//						}
						//						if(s.equals("90")||s.equals("-270")) {
						//							s = "N"; yon = true;
						//						}
						//						if(yon) {
						//							GL11.glTranslated(0, 12, 0);
						//							GL11.glScaled(2, 2, 0);
						//						}
						//						GL11.glTranslated(-fr.getStringWidth(s)/2.0, kisa ? -(int)(b*0.1) : -(int)(b*0.15), 0);
						//						fr.drawString(s, 0, 0, renk);
						//						GL11.glPopMatrix();
						//					}
						//
						//
						//
						//					fr.drawString("ALT", (int)((w+b)/2.0+b*0.35), (int)(h/2.0-b*0.05), renk);
						//					fr.drawString(String.format("%.2f", y), (int)((w+b)/2.0+b*0.35), (int)(h/2.0-b*0.05+9), renk);
						//					
						//					fr.drawString("SPEED", (int)((w-b)/2.0-b*0.35)-fr.getStringWidth("SPEED"), (int)(h/2.0-b*0.125), renk);
						//					String shiz = String.format("%.2f", hiz);
						//					fr.drawString(shiz, (int)((w-b)/2.0-b*0.35)-fr.getStringWidth(shiz), (int)(h/2.0-b*0.125+9), renk);
						//					
						//					if(plane.gearDown()) {
						//						fr.drawString("GEARS DOWN", (int)((w+b)/2.0), (int)((h+b)/2.0+b*0.2), renk);
						//					}
						//					
						//					String t = (int)(100*plane.throttle/1f)+"";
						//					fr.drawString("THROTTLE", (int)((w-b)/2.0-b*0.35)-fr.getStringWidth("THROTTLE"), (int)(h/2.0+b*0.05), renk);
						//					fr.drawString(""+t, (int)((w-b)/2.0-b*0.35)-fr.getStringWidth(""+t), (int)(h/2.0+b*0.05+9), renk);
						//
						//					int c = (int) (plane.getDriveableData().parts.get(EnumDriveablePart.core).health / plane.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth * 100);
						//					int kir = (int)(255-255*c/100.0);
						//					int yes = (int)(255*c/100.0);
						//					while(kir<255&&yes<255) {
						//						kir++;
						//						yes++;
						//					}
						//					int r = (kir<<16)+(yes<<8)+0;
						//					fr.drawString("Health : "+c, (int)((w+b)/2.0), (int)((h+b)/2.0+b*0.05), r);
						//
						//					float yakit = plane.driveableData.fuelInTank / plane.getDriveableType().fuelTankSize * 100;
						//					kir = (int)(255-255*yakit/100.0);
						//					yes = (int)(255*yakit/100.0);
						//					while(kir<255&&yes<255) {
						//						kir++;
						//						yes++;
						//					}
						//					r = (kir<<16)+(yes<<8)+0;
						//					fr.drawString("Fuel : "+(int)yakit+"%", (int)((w+b)/2.0), (int)((h+b)/2.0+b*0.05)+10, r);
						//
						//					ItemStack[] a = plane.driveableData.ammo;
						//					int son = 0;
						//					for(ItemStack is : a) {
						//						if(is!=null) {
						//							fr.drawString(is.getDisplayName()+" : "+(is.getMaxDamage()-is.getItemDamage()+(is.stackSize-1)*is.getMaxDamage()), (int)((w-b)/2.0)-fr.getStringWidth(is.getDisplayName()+" :"), (int)((h+b)/2.0+b*0.15+son*10), renk);
						//							son++;
						//						}
						//					}
						//
						//					GL11.glPopMatrix();
						//					GL11.glDisable(GL11.GL_BLEND);
						//					GL11.glPopMatrix();

					}
				}
			}
		}
	}

	public static void dortgen(double x, double y, int xhiza, int yhiza) {
		Tessellator t = Tessellator.instance;
		t.startDrawingQuads();
		double solx = -x/2.0+xhiza*x/2.0;
		double sagx = x/2.0+xhiza*x/2.0;
		double usty = -y/2.0+yhiza*y/2.0;
		double alty = y/2.0+yhiza*y/2.0;
		t.addVertex(solx, alty, 0);
		t.addVertex(sagx, alty, 0);
		t.addVertex(sagx, usty, 0);
		t.addVertex(solx, usty, 0);
		t.draw();
	}

	public static void yuvarlak(int i, double yaricap) {
		Tessellator t = Tessellator.instance;
		t.startDrawing(GL11.GL_POLYGON);
		while(i>0) {
			double c = Math.cos(Math.toRadians(i));
			double s = Math.sin(Math.toRadians(i));
			t.addVertexWithUV(c*yaricap, s*yaricap, 0, (c+1)/2.0, (s+1)/2.0);
			i--;
		}
		t.draw();
	}

	public static void yazi(String s, int renk, double x, double y, double b) {
		FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, 0);
		GL11.glScaled(b, b, 1);
		fr.drawString(s, -fr.getStringWidth(s)/2, -fr.FONT_HEIGHT/2, renk);
		GL11.glPopMatrix();
	}

	public static void nisangah(int tur) {
		switch(tur) {
		case 0:
			double nisangahgenislik = 6;
			GL11.glPushMatrix();
			GL11.glTranslated(0, -nisangahgenislik, 0);
			dortgen(1.5, 6, 0, 0);
			GL11.glTranslated(0, nisangahgenislik*2, 0);
			dortgen(1.5, 6, 0, 0);
			GL11.glTranslated(nisangahgenislik, -nisangahgenislik, 0);
			dortgen(6, 1.5, 0, 0);
			GL11.glTranslated(-nisangahgenislik*2, 0, 0);
			dortgen(6, 1.5, 0, 0);
			GL11.glPopMatrix();
			break;
		case 1:
			nisangahgenislik = 8;
			GL11.glPushMatrix();
			GL11.glTranslated(-nisangahgenislik, 0, 0);
			dortgen(1.5, 8, 0, 0);
			GL11.glTranslated(nisangahgenislik*2, 0, 0);
			dortgen(1.5, 8, 0, 0);
			GL11.glTranslated(-nisangahgenislik, nisangahgenislik, 0);
			dortgen(8, 1.5, 0, 0);
			GL11.glTranslated(0, -nisangahgenislik*2, 0);
			dortgen(8, 1.5, 0, 0);
			GL11.glPopMatrix();
			break;
		}
	}

	public static void yukseklik(int tur) {
		switch(tur) {
		case 0:
			for(double i = -15; i<25; i+=5) {
				GL11.glPushMatrix();
				GL11.glRotated(roll, 0, 0, 1);
				double fark = i+pitch%5;
				GL11.glTranslated(0, fark*5, 0);
				GL11.glColor4d(kirmizi/255.0, yesil/255.0, mavi/255.0, 0.8);
				Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("flansmod:gui/renk.png"));
				boolean kisa = false;
				boolean sifir = false;
				int pi = (int)MathHelper.floor_double(pitch-pitch%5-i);
				FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
				if(pi==0) {
					sifir = true;
					GL11.glPushMatrix();
					GL11.glTranslated(13, 0, 0);
					dortgen(80, 1.5, 1, 0);
					GL11.glPopMatrix();
					GL11.glPushMatrix();
					GL11.glTranslated(-13, 0, 0);
					dortgen(80, 1.5, -1, 0);
					GL11.glPopMatrix();
				} else if(pi%10!=0) {
//					kisa = true;
//					dortgen(30, 1, 0, 0);
//					yazi(pi+"", renk, fr.getStringWidth(pi+"")+15, 0, 1);
				} else {
					dortgen(80, 1, 0, 0);
					yazi(pi+"", renk, fr.getStringWidth(pi+"")+40, 0, 1);
				}
				//				GL11.glTranslated(kisa ? (int)(b*0.17)+fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0 : sifir ? b*0.6 : (int)(b*0.27)+fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0, 0, 0);
				//				GL11.glRotated(-roll, 0, 0, 1);
				//				fr.drawString((int)MathHelper.floor_double(pitch-pitch%5-i)+"", (int)(-fr.getStringWidth((int)MathHelper.floor_double(pitch-pitch%5-i)+"")/2.0), -4, renk);
				GL11.glPopMatrix();
			}
			break;
		}
	}

}
