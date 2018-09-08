/*    */ package com.flansmod.client.model.monolith;
/*    */ 
/*    */ import com.flansmod.client.model.ModelCustomArmour;
/*    */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*    */ 
/*    */ public class Model3DArmorBody
/*    */   extends ModelCustomArmour
/*    */ {
/* 14 */   int textureX = 128;
/* 15 */   int textureY = 64;
/*    */   
/*    */   public Model3DArmorBody()
/*    */   {
/* 19 */     this.bodyModel = new ModelRendererTurbo[1];
/* 20 */     this.bodyModel[0] = new ModelRendererTurbo(this, 32, 32, this.textureX, this.textureY);
/*    */     
/* 22 */     this.bodyModel[0].addShapeBox(-8.0F, -0.1F, -4.0F, 16, 24, 8, 0.0F, -3.9F, 0.0F, -1.9F, -3.9F, 0.0F, -1.9F, -3.9F, 0.0F, -1.9F, -3.9F, 0.0F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F);
/* 23 */     this.bodyModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
/*    */     
/*    */ 
/* 26 */     this.rightArmModel = new ModelRendererTurbo[1];
/* 27 */     this.rightArmModel[0] = new ModelRendererTurbo(this, 80, 32, this.textureX, this.textureY);
/*    */     
/*    */ 
/* 30 */     this.rightArmModel[0].addShapeBox(-5.0F, -2.1F, -4.0F, 8, 24, 8, 0.0F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F);
/* 31 */     this.rightArmModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
/*    */     
/* 33 */     this.leftArmModel = new ModelRendererTurbo[1];
/* 34 */     this.leftArmModel[0] = new ModelRendererTurbo(this, 80, 32, this.textureX, this.textureY);
/*    */     
/*    */ 
/* 37 */     this.leftArmModel[0].addShapeBox(-3.0F, -2.1F, -4.0F, 8, 24, 8, 0.0F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F);
/* 38 */     this.leftArmModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
/*    */     
/*    */ 
/* 41 */     this.leftLegModel = new ModelRendererTurbo[1];
/* 42 */     this.leftLegModel[0] = new ModelRendererTurbo(this, 0, 32, this.textureX, this.textureY);
/*    */     
/* 44 */     this.leftLegModel[0].addShapeBox(-4.0F, 0.1F, -4.0F, 8, 24, 8, 0.0F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F);
/* 45 */     this.leftLegModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
/*    */     
/*    */ 
/* 48 */     this.rightLegModel = new ModelRendererTurbo[1];
/* 49 */     this.rightLegModel[0] = new ModelRendererTurbo(this, 0, 32, this.textureX, this.textureY);
/*    */     
/* 51 */     this.rightLegModel[0].addShapeBox(-4.0F, 0.1F, -4.0F, 8, 24, 8, 0.0F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, 0.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F, -1.9F, -12.0F, -1.9F);
/* 52 */     this.rightLegModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
/*    */   }
/*    */ }


/* Location:           C:\Users\anthony\Desktop\
 * Qualified Name:     com.flansmod.client.model.monolith.Model3DArmorBody
 * JD-Core Version:    0.7.0.1
 */