package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.model.*;
import com.wolffsmod.render.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	@Override
	public void registerRenderers()
	{
		/*
		* When using RenderFlansModEntity, a default Y-translation of -2.1F is applied
		* The scale() method adapts automatically the translation to its scaled value.
		* Use setScale() and setTranslation() to override the values in OpenGL
		*
		* Scale Factor		Default Y-Translation
		* 	0.5					-1.05
		* 	0.75				-1.58
		*	0.80				-1.68
		*	0.90				-1.89
		*	1.00				-2.10
		* 	1.10				-2.31
		* 	1.20				-2.52
		* 	1.25				-2.63
		* 	1.30				-2.73
		* 	1.40				-2.94
		* 	1.5					-3.15
		* 	2.0					-4.20
		*
		* */

		RenderingRegistry.registerEntityRenderingHandler(EntitySdKfz251D.class, new RenderSdKfz251D(new ModelSdKfz251D(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntitySherman.class, new RenderFlansModEntity(new ModelSherman(), "M4A3E8Sherman/Sherman.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger.class, new RenderFlansModEntity(new ModelTiger()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(Entity105leFH18B2.class, new RenderFlansModEntity(new Model105leFH18B2()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChaffee.class, new RenderFlansModEntity(new ModelChaffee()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCromwell.class, new RenderFlansModEntity(new ModelCromwell()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrusader.class, new RenderFlansModEntity(new ModelCrusader()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiHa.class, new RenderFlansModEntity(new ModelChiHa()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiNu.class, new RenderFlansModEntity(new ModelChiNu()).setTranslation(0F, -2.5F, 0F).setScale(1.25F, 1.25F, 1.25F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChurchill.class, new RenderFlansModEntity(new ModelChurchill()).setTranslation(0F, -1.8F, 0F).setScale(0.8F, 0.8F, 0.8F));
		RenderingRegistry.registerEntityRenderingHandler(EntityIS2.class, new RenderFlansModEntity(new ModelIS2()).setTranslation(0F, -2.6F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKV1.class, new RenderFlansModEntity(new ModelKV1()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuchs.class, new RenderFlansModEntity(new ModelLuchs()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIV.class, new RenderFlansModEntity(new ModelPanzerIV()).setTranslation(0F, -2F, 0F).setScale(0.9F, 0.9F, 0.9F));
		RenderingRegistry.registerEntityRenderingHandler(EntityShermanFury.class, new RenderFlansModEntity(new ModelShermanFury(), "M4A3E8ShermanFury/Sherman_Fury.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityStuGIV.class, new RenderFlansModEntity(new ModelStuGIV()).setTranslation(0.3F, -1.9F, 0F).setScale(0.85F, 0.85F, 0.85F));
		RenderingRegistry.registerEntityRenderingHandler(EntityT3476.class, new RenderFlansModEntity(new ModelT3476()));
		RenderingRegistry.registerEntityRenderingHandler(EntityT3485.class, new RenderFlansModEntity(new ModelT3485()).setTranslation(0F, -2.6F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger131.class, new RenderFlansModEntity(new ModelTiger131()).setTranslation(0F, -2.4F, 0F).setScale(1.2F, 1.2F, 1.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerII.class, new RenderFlansModEntity(new ModelTigerII()).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(EntityType4HoRo.class, new RenderFlansModEntity(new ModelType4HoRo()).setTranslation(0F, -2.2F, 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityB1.class, new RenderFlansModEntity(new ModelB1()).setTranslation(0F, -2.2F, 0F).setScale(1.1F, 1.1F, 1.1F));

		RenderingRegistry.registerEntityRenderingHandler(EntityM113A1.class, new RenderM113A1(new ModelM113A1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT72A1979.class, new RenderT72A1979(new ModelT72A1979(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT55A.class, new RenderT55A(new ModelT55A(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType90KyuMaru.class, new RenderType90KyuMaru(new ModelType90KyuMaru(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT14Armata.class, new RenderT14Armata(new ModelT14Armata(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityK2.class, new RenderK2(new ModelK2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM60A1.class, new RenderM60A1(new ModelM60A1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM1Abrams.class, new RenderM1Abrams(new ModelM1Abrams(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A6.class, new RenderLeopard2A6(new ModelLeopard2A6(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT90.class, new RenderT90(new ModelT90(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityStuG3G.class, new RenderStuG3G(new ModelStuG3G(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIVJ.class, new RenderPanzerIVJ(new ModelPanzerIVJ(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzer.class, new RenderPanzer(new ModelPanzer(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerI.class, new RenderPanzerI(new ModelPanzerI(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkwI.class, new RenderSkwI(new ModelSkwI(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM4.class, new RenderM4(new ModelM4(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT34.class, new RenderT34(new ModelT34(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdpanzerIV.class, new RenderJagdpanzerIV(new ModelJagdpanzerIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdpanther.class, new RenderJagdpanther(new ModelJagdpanther(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdtiger.class, new RenderJagdtiger(new ModelJagdtiger(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPantherG.class, new RenderPantherG(new ModelPantherG(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIVG.class, new RenderPanzerIVG(new ModelPanzerIVG(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIVH.class, new RenderPanzerIVH(new ModelPanzerIVH(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerIE.class, new RenderTigerIE(new ModelTigerIE(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerIIB.class, new RenderTigerIIB(new ModelTigerIIB(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFlakpanzerIV.class, new RenderFlakpanzerIV(new ModelFlakpanzerIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHummel.class, new RenderHummel(new ModelHummel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM4A1.class, new RenderM4A1(new ModelM4A1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM4A1Calliope.class, new RenderM4A1Calliope(new ModelM4A1Calliope(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM4A3.class, new RenderM4A3(new ModelM4A3(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityRenaultFT17.class, new RenderRenaultFT17(new ModelRenaultFT17(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySU100.class, new RenderSU100(new ModelSU100(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySU122.class, new RenderSU122(new ModelSU122(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySU85.class, new RenderSU85(new ModelSU85(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT34_76.class, new RenderT34_76(new ModelT34_76(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT34_85.class, new RenderT34_85(new ModelT34_85(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity38t.class, new Render38t(new Model38t(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityA39.class, new RenderA39(new ModelA39(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityHetzer.class, new RenderHetzer(new ModelHetzer(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLVT2.class, new RenderLVT2(new ModelLVT2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLVTA1.class, new RenderLVTA1(new ModelLVTA1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMaus.class, new RenderMaus(new ModelMaus(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityML20.class, new RenderML20(new ModelML20(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw2.class, new RenderPzkpfw2(new ModelPzkpfw2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw3.class, new RenderPzkpfw3(new ModelPzkpfw3(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityStug3.class, new RenderStug3(new ModelStug3(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySturmtiger.class, new RenderSturmtiger(new ModelSturmtiger(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT35.class, new RenderT35(new ModelT35(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger1E.class, new RenderTiger1E(new ModelTiger1E(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS.class, new RenderTKS(new ModelTKS(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS20.class, new RenderTKS20(new ModelTKS20(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType95.class, new RenderType95(new ModelType95(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType97.class, new RenderType97(new ModelType97(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityZis3.class, new RenderZis3(new ModelZis3(), 0));

		//Price additions
		RenderingRegistry.registerEntityRenderingHandler(EntityM41.class, new RenderM41(new ModelM41(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityA6M1.class, new RenderA6M1(new ModelA6M1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityRomeoClassSub.class, new RenderRomeoClassSub(new ModelRomeoClassSub(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMirageF1.class, new RenderMirageF1(new ModelMirageF1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySupplies.class, new RenderSupplies(new ModelSupplies(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityHigginsBoat.class, new RenderHigginsBoat(new ModelHigginsBoat(), 0));			
		RenderingRegistry.registerEntityRenderingHandler(EntitySlava.class, new RenderSlava(new ModelSlava(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityA7V.class, new RenderA7V(new ModelA7V(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityEurocopterTigerHAP.class, new RenderEurocopterTigerHAP(new ModelEurocopterTigerHAP(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntityT26.class, new RenderT26(new ModelT26(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySandBags1.class, new RenderSandBags1(new ModelSandBags1(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntitySandBags2.class, new RenderSandBags2(new ModelSandBags2(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntityPak43.class, new RenderPak43(new ModelPak43(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySoDa.class, new RenderSoDa(new ModelSoDa(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTeKe.class, new RenderTeKe(new ModelTeKe(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTKlate.class, new RenderTKlate(new ModelTKlate(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109E3.class, new RenderBF109E3(new ModelBF109E3(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109G10.class, new RenderBF109G10(new ModelBF109G10(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityHawkerHurricane.class, new RenderHawkerHurricane(new ModelHawkerHurricane(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMilitaryCrate.class, new RenderMilitaryCrate(new ModelMilitaryCrate(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityOccupier.class, new RenderOccupier(new ModelOccupier(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityP51D.class, new RenderP51D(new ModelP51D(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityJihadBMP1.class, new RenderJihadBMP1(new ModelJihadBMP1(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityMCOMStation.class, new RenderMCOMStation(new ModelMCOMStation(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityRadioStation.class, new RenderRadioStation(new ModelRadioStation(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityRadioStationSmall.class, new RenderRadioStationSmall(new ModelRadioStationSmall(), 0));
		
		//2.2 stuff
		RenderingRegistry.registerEntityRenderingHandler(EntityBMWR75.class, new RenderBMWR75(new ModelBMWR75(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBofors.class, new RenderBofors(new ModelBofors(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBwTruck.class, new RenderBwTruck(new ModelBwTruck(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityFlak88.class, new RenderFlak88(new ModelFlak88(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityFlakvierling.class, new RenderFlakvierling(new ModelFlakvierling(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityGreyhound.class, new RenderGreyhound(new ModelGreyhound(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityHellcat.class, new RenderHellcat(new ModelHellcat(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityJeep.class, new RenderJeep(new ModelJeep(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityKubel.class, new RenderKubel(new ModelKubel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM10.class, new RenderM10(new ModelM10(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM157MM.class, new RenderM157MM(new ModelM157MM(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM3Halftrack.class, new RenderM3Halftrack(new ModelM3Halftrack(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityM45Quad.class, new RenderM45Quad(new ModelM45Quad(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPak40.class, new RenderFlansModEntity(new ModelPak40()).scale(1.1F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySASJeep.class, new RenderSASJeep(new ModelSASJeep(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySU112.class, new RenderSU112(new ModelSU112(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityUC2Pdr.class, new RenderUC2Pdr(new ModelUC2Pdr(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySentryGun.class, new RenderSentryGun(new ModelSentryGun(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntitySdkFz2.class, new RenderFlansModEntity(new ModelSdkFz2()).scale(0.9F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySdkFz222.class, new RenderFlansModEntity(new ModelSdkFz222()).setTranslation(0F, -2.5F, 0F).setScale(1.3F, 1.3F, 1.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySdkFz251.class, new RenderFlansModEntity(new ModelSdkFz251()).scale(0.9F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer1.class, new RenderFlansModEntity(new ModelBoxer1(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer2.class, new RenderFlansModEntity(new ModelBoxer2(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer3.class, new RenderFlansModEntity(new ModelBoxer3(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer4.class, new RenderFlansModEntity(new ModelBoxer4(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoxer5.class, new RenderFlansModEntity(new ModelBoxer5(), "Boxer/Boxer.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityBwTruck.class, new RenderFlansModEntity(new ModelBwTruck()));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV1.class, new RenderFlansModEntity(new ModelHMMWV1(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV2.class, new RenderFlansModEntity(new ModelHMMWV2(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV3.class, new RenderFlansModEntity(new ModelHMMWV3(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHMMWV4.class, new RenderFlansModEntity(new ModelHMMWV4(), "HMMWV/HMMWV.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopardIIA6.class, new RenderFlansModEntity(new ModelLeopardIIA6()));
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A7.class, new RenderFlansModEntity(new ModelLeopard2A7()));

		//WIP
		RenderingRegistry.registerEntityRenderingHandler(EntityMark3.class, new RenderMark3(new ModelMark3(), 0));
	}
}
