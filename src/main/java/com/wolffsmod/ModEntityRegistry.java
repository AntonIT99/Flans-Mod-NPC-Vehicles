package com.wolffsmod;

import com.wolffsmod.entity.*;

import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.entity.Entity;


public class ModEntityRegistry {
	private ModEntityRegistry() {}

	private static int EntityID = 0;

	public static void registerEntities()
	{
		createEntity(EntitySdKfz251D.class, "[FlansMod] SdKfz251 Ausf. D (Wolff's Pack)");

		createEntity(EntityTiger.class, "[FlansMod] Panzer VII Tiger (Official Pack)");
		createEntity(EntitySherman.class, "[FlansMod] M4A3E8 Sherman Easy Eight (Official Pack)");
		createEntity(EntityChaffee.class, "[FlansMod] M24 Chaffee (Official Pack)");
		createEntity(Entity105leFH18B2.class, "[FlansMod] 105 mm leFH 18 B2 (Official Pack)");
		createEntity(EntityCromwell.class, "[FlansMod] Cromwell (Official Pack)");
		createEntity(EntityChiHa.class, "[FlansMod] Type 97 Chi-Ha (Official Pack)");
		createEntity(EntityChiNu.class, "[FlansMod] Type 3 Chi-Nu (Official Pack)");
		createEntity(EntityChurchill.class, "[FlansMod] Churchill Mk VII (Official Pack)");
		createEntity(EntityCrusader.class, "[FlansMod] Cruiser Mk. VI Crusader (Official Pack)");
		createEntity(EntityIS2.class, "[FlansMod] IS-2 (Official Pack)");
		createEntity(EntityKV1.class, "[FlansMod] KV-1 (Official Pack)");
		createEntity(EntityLuchs.class, "[FlansMod] Panzer II Ausf.L Luchs (Official Pack)");
		createEntity(EntityPanzerIV.class, "[FlansMod] Panzer IV Ausf. H (Official Pack)");
		createEntity(EntityShermanFury.class, "[FlansMod] M4A3E8 Sherman Fury (Official Pack)");
		createEntity(EntityStuGIV.class, "[FlansMod] StuG IV (Official Pack)");
		createEntity(EntityT3476.class, "[FlansMod] T-34/76 (Official Pack)");
		createEntity(EntityT3485.class, "[FlansMod] T-34/85 (Official Pack)");
		createEntity(EntityTiger131.class, "[FlansMod] Panzer VII Tiger 131 (Official Pack)");
		createEntity(EntityTigerII.class, "[FlansMod] Panzer VII Tiger II (Official Pack)");
		createEntity(EntityType4HoRo.class, "[FlansMod] Type 4 Ho-Ro (Official Pack)");
		createEntity(EntityB1.class, "[FlansMod] B1 (Official Pack)");
		
		createEntity(EntityM113A1.class, "[FlansMod] M113A1 APC");
		createEntity(EntityT72A1979.class, "[FlansMod] T-72A 1979");
		createEntity(EntityT55A.class, "[FlansMod] T-55A (Lizard)");
		createEntity(EntityType90KyuMaru.class, "[FlansMod] Type 90 Kyu-maru (Monolith Pack)");
		createEntity(EntityT14Armata.class, "[FlansMod] T-14 Armata");
		createEntity(EntityK2.class, "[FlansMod] K2 Black Panther (Monolith Pack)");
		createEntity(EntityM60A1.class, "[FlansMod] M60A1 Patton");
		createEntity(EntityM1Abrams.class, "[FlansMod] M1 Abrams");
		createEntity(EntityLeopard2A6.class, "[FlansMod] Leopard 2 A6");
		createEntity(EntityT90.class, "[FlansMod] T-90");
		
		createEntity(EntityPanzerIVJ.class, "[FlansMod] Panzer IV Ausf. J (Wolff's Pack)");
		createEntity(EntityPanzer.class, "[FlansMod] Panzer IV");
		createEntity(EntityM4.class, "[FlansMod] M4 Sherman");
		createEntity(EntityT34.class, "[FlansMod] T-34");
		createEntity(EntityPanzerI.class, "[FlansMod] Panzer I Ausf. A (Kikkoceccato)");
		createEntity(EntitySkwI.class, "[FlansMod] Sanitätskraftwagen I Ausf. A (Kikkoceccato)");

		createEntity(EntityJagdpanther.class, "[FlansMod] Jagdpanzer V Jagdpanther (Manus Pack)");
		createEntity(EntityJagdpanzerIV.class, "[FlansMod] Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
		createEntity(EntityJagdtiger.class, "[FlansMod] Jagdpanzer VI Jagdtiger (Manus Pack)");
		createEntity(EntityPantherG.class, "[FlansMod] Panzer V Panther Ausf. G (Manus Pack)");
		createEntity(EntityPanzerIVG.class, "[FlansMod] Panzer IV Ausf. G (Manus Pack)");
		createEntity(EntityPanzerIVH.class, "[FlansMod] Panzer IV Ausf. H (Manus Pack)");
		createEntity(EntityTigerIE.class, "[FlansMod] Panzer VII Tiger Ausf. E (Manus Pack)");
		createEntity(EntityTigerIIB.class, "[FlansMod] Panzer VII Tiger II Ausf. B (Manus Pack)");

		createEntity(EntityFlakpanzerIV.class, "[FlansMod] Flakpanzer IV Wirbelwind (Manus Pack)");
		createEntity(EntityHummel.class, "[FlansMod] Panzerhaubitze Hummel (Manus Pack)");
		createEntity(EntityM4A1.class, "[FlansMod] M4A1 Sherman (Manus Pack)");
		createEntity(EntityM4A1Calliope.class, "[FlansMod] M4A1 Sherman with T-34 Calliope (Manus Pack)");
		createEntity(EntityM4A3.class, "[FlansMod] M4A3 Sherman (Manus Pack)");
		createEntity(EntityRenaultFT17.class, "[FlansMod] Renault FT-17 (Manus Pack)");
		createEntity(EntitySU100.class, "[FlansMod] SU-100 (Manus Pack)");
		createEntity(EntitySU122.class, "[FlansMod] SU-122 (Manus Pack)");
		createEntity(EntitySU85.class, "[FlansMod] SU-85 (Manus Pack)");
		createEntity(EntityT34_76.class, "[FlansMod] T-34/76 (Manus Pack)");
		createEntity(EntityT34_85.class, "[FlansMod] T-34/85 (Manus Pack)");

		createEntity(EntityStuG3G.class, "[FlansMod] StuG III Ausf. G (Warfare 44)");

		createEntity(Entity38t.class, "[FlansMod] Panzer 38(t) (Extra Zero 8)");
		createEntity(EntityA39.class, "[FlansMod] A39 Tortoise (Extra Zero 8)");
		createEntity(EntityHetzer.class, "[FlansMod] Jagdpanzer 38(t) Hetzer (Extra Zero 8)");
		createEntity(EntityLVT2.class, "[FlansMod] LVT-2 (Extra Zero 8)");
		createEntity(EntityLVTA1.class, "[FlansMod] LVT(A)-1 (Extra Zero 8)");
		createEntity(EntityMaus.class, "[FlansMod] Panzer VIII Maus (Extra Zero 8)");
		createEntity(EntityML20.class, "[FlansMod] 152mm ML-20 (Extra Zero 8)");
		createEntity(EntityPzkpfw2.class, "[FlansMod] Panzer II Ausf. F (Extra Zero 8)");
		createEntity(EntityPzkpfw3.class, "[FlansMod] Panzer III Ausf. N (Extra Zero 8)");
		createEntity(EntityStug3.class, "[FlansMod] StuG III Ausf. F (Extra Zero 8)");
		createEntity(EntitySturmtiger.class, "[FlansMod] Sturmpanzer VI Sturmtiger (Extra Zero 8)");
		createEntity(EntityT35.class, "[FlansMod] T-35 (Extra Zero 8)");
		createEntity(EntityTiger1E.class, "[FlansMod] Panzer VII Tiger Ausf. E (Extra Zero 8)");
		createEntity(EntityTKS.class, "[FlansMod] TKS MG (Extra Zero 8)");
		createEntity(EntityTKS20.class, "[FlansMod] TKS 20mm (Extra Zero 8)");
		createEntity(EntityType95.class, "[FlansMod] Type 95 Ha-Go (Extra Zero 8)");
		createEntity(EntityType97.class, "[FlansMod] Type 97 Chi-Ha (Extra Zero 8)");
		createEntity(EntityZis3.class, "[FlansMod] 76.2mm ZiS-3 (Extra Zero 8)");
	
		//Price additions
		createEntity(EntityM41.class, "[FlansMod] M41");
		createEntity(EntityA6M1.class, "[FlansMod] A6M1");
		createEntity(EntityRomeoClassSub.class, "[FlansMod] Romeo Class Sub");	
		createEntity(EntityMirageF1.class, "[FlansMod] Mirage F1");
		createEntity(EntitySupplies.class, "[FlansMod] Supplies (Price)");		
		createEntity(EntityHigginsBoat.class, "[FlansMod] HigginsBoat ");	
		createEntity(EntitySlava.class, "[FlansMod] Slava ");	
		createEntity(EntityA7V.class, "[FlansMod] A7V (Monolith Pack)?");	
		createEntity(EntityEurocopterTigerHAP.class, "[FlansMod] EurocopterTigerHAP");	
		createEntity(EntityT26.class, "[FlansMod] T-26 (Monolith Pack)?");	
		createEntity(EntityPak40.class, "[FlansMod] Pak-40");	
		createEntity(EntitySandBags1.class, "[FlansMod] SandBags (low res) (Price)");	
		createEntity(EntitySandBags2.class, "[FlansMod] SandBags (high res) (Price)");	
		createEntity(EntityPak43.class, "[FlansMod] Pak-43");	
		createEntity(EntitySoDa.class, "[FlansMod] So-Da");		
		createEntity(EntityTeKe.class, "[FlansMod] Te-Ke");		
		createEntity(EntityTKlate.class, "[FlansMod] TKlate");		
		createEntity(EntityBF109E3.class, "[FlansMod] BF-109E3");		
		createEntity(EntityBF109G10.class, "[FlansMod] BF-109G10");			
		createEntity(EntityHawkerHurricane.class, "[FlansMod] Hawker Hurricane");		
		createEntity(EntityMark3.class, "[FlansMod] Mark 3");			
		createEntity(EntityMilitaryCrate.class, "[FlansMod] Military Crate (Somberfob)");		
		createEntity(EntityOccupier.class, "[FlansMod] Occupier");	
		createEntity(EntityP51D.class, "[FlansMod] P-51D");	
		createEntity(EntityJihadBMP1.class, "[FlansMod] Jihad BMP-1D");		
		createEntity(EntityMCOMStation.class, "[FlansMod] MCOM Station (Price)");		
		createEntity(EntityRadioStation.class, "[FlansMod] Radio Station (Price)");		
		createEntity(EntityRadioStationSmall.class, "[FlansMod] Radio Station Small (Price)");		
		
		//2.2 stuff
		createEntity(EntityBMWR75.class, "[FlansMod] BMW R 75 Gespann (Official Pack)");
		createEntity(EntityBofors.class, "[FlansMod] 40mm Bofors (Official Pack)");
		createEntity(EntityBwTruck.class, "[FlansMod] German Bundeswehr Truck (Manus Pack)");
		createEntity(EntityFlak88.class, "[FlansMod] 88mm Flak 36 (Official Pack)");
		createEntity(EntityFlakvierling.class, "[FlansMod] 20mm Flakvierling 38 (Official Pack)");
		createEntity(EntityGreyhound.class, "[FlansMod] M8 Greyhound (Official Pack)");
		createEntity(EntityHellcat.class, "[FlansMod] M18 Hellcat (Official Pack");
		createEntity(EntityJeep.class, "[FlansMod] Jeep (Official Pack)");
		createEntity(EntityKubel.class, "[FlansMod] Kubelwagen (Official Pack)");
		createEntity(EntityLeopard2A7.class, "[FlansMod] Leopard 2 A7 (Manus Pack)");
		createEntity(EntityM3Halftrack.class, "[FlansMod] M3 Halftrack (Official Pack)");
		createEntity(EntityM10.class, "[FlansMod] M10 Wolverine (Official Pack)");
		createEntity(EntityM45Quad.class, "[FlansMod] M45 Quadmount (Official Pack)");
		createEntity(EntityM157MM.class, "[FlansMod] 57mm M1 (Official Pack)");
		createEntity(EntitySASJeep.class, "[FlansMod] SAS Jeep (Official Pack)");
		createEntity(EntitySentryGun.class, "[FlansMod] Sentry Gun (Manus Pack)");
		createEntity(EntitySU112.class, "[FlansMod] SU-1-12 (Official Pack)");
		createEntity(EntityUC2Pdr.class, "[FlansMod] Universal Carrier 2Pdr (Official Pack)");
		
		
	}
	public static void createEntity(Class<? extends Entity> entityClass, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, EntityID++, WolffNPCMod.modInstance, 64, 1, true);
	}
}