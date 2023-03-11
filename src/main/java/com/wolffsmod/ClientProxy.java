package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.model.*;
import com.wolffsmod.render.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	@Override
	public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySdKfz251D.class, new RenderSdKfz251D(new ModelSdKfz251D(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntitySherman.class, new RenderSherman(new ModelSherman(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger.class, new RenderTiger(new ModelTiger(), 0));
		RenderingRegistry.registerEntityRenderingHandler(Entity105leFH18B2.class, new Render105leFH18B2(new Model105leFH18B2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChaffee.class, new RenderChaffee(new ModelChaffee(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityCromwell.class, new RenderCromwell(new ModelCromwell(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrusader.class, new RenderCrusader(new ModelCrusader(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityB1.class, new RenderB1(new ModelB1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiHa.class, new RenderChiHa(new ModelChiHa(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiNu.class, new RenderChiNu(new ModelChiNu(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChurchill.class, new RenderChurchill(new ModelChurchill(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityIS2.class, new RenderIS2(new ModelIS2(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityKV1.class, new RenderKV1(new ModelKV1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuchs.class, new RenderLuchs(new ModelLuchs(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIV.class, new RenderPanzerIV(new ModelPanzerIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityShermanFury.class, new RenderShermanFury(new ModelShermanFury(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityStuGIV.class, new RenderStuGIV(new ModelStuGIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT3476.class, new RenderT3476(new ModelT3476(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT3485.class, new RenderT3485(new ModelT3485(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger131.class, new RenderTiger131(new ModelTiger131(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerII.class, new RenderTigerII(new ModelTigerII(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType4HoRo.class, new RenderType4HoRo(new ModelType4HoRo(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityB1.class, new RenderB1(new ModelB1(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityM113A1.class, new RenderM113A1(new ModelM113A1(), 0));
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
		RenderingRegistry.registerEntityRenderingHandler(EntityPak40.class, new RenderPak40(new ModelPak40(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntitySandBags1.class, new RenderSandBags1(new ModelSandBags1(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntitySandBags2.class, new RenderSandBags2(new ModelSandBags2(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntityPak43.class, new RenderPak43(new ModelPak43(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySoDa.class, new RenderSoDa(new ModelSoDa(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTeKe.class, new RenderTeKe(new ModelTeKe(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityTKlate.class, new RenderTKlate(new ModelTKlate(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109E3.class, new RenderBF109E3(new ModelBF109E3(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityBF109G10.class, new RenderBF109G10(new ModelBF109G10(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityHawkerHurricane.class, new RenderHawkerHurricane(new ModelHawkerHurricane(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityMark3.class, new RenderMark3(new ModelMark3(), 0));	
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
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A7.class, new RenderLeopard2A7(new ModelLeopard2A7(), 0));		
		RenderingRegistry.registerEntityRenderingHandler(EntityM3Halftrack.class, new RenderM3Halftrack(new ModelM3Halftrack(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityM10.class, new RenderM10(new ModelM10(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityM45Quad.class, new RenderM45Quad(new ModelM45Quad(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityM157MM.class, new RenderM157MM(new ModelM157MM(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySASJeep.class, new RenderSASJeep(new ModelSASJeep(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySentryGun.class, new RenderSentryGun(new ModelSentryGun(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntitySU112.class, new RenderSU112(new ModelSU112(), 0));	
		RenderingRegistry.registerEntityRenderingHandler(EntityUC2Pdr.class, new RenderUC2Pdr(new ModelUC2Pdr(), 0));
	}
}
