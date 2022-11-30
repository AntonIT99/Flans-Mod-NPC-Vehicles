package com.wolffsmod;

import net.minecraft.entity.EntityList;

import com.wolffsmod.Main;
import com.wolffsmod.entity.*;

import cpw.mods.fml.common.registry.EntityRegistry;


public class ModEntityRegistry {
	public static void mainRegistry(){
		registerEntity();
	}
	public static void registerEntity(){
		createEntity(EntitySdKfz251D.class, "[FlansMod] SdKfz251 Ausf. D (Wolff's Pack)", 0x356633, 0x0A8000);
		createEntity(EntityTiger.class, "[FlansMod] Panzer VII Tiger (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySherman.class, "[FlansMod] M4A3E8 Sherman Easy Eight (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityChaffee.class, "[FlansMod] M24 Chaffee (Official Pack)", 0x356633, 0x0A8000);
		createEntity(Entity105leFH18B2.class, "[FlansMod] 105 mm leFH 18 B2 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityCromwell.class, "[FlansMod] Cromwell (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityChiHa.class, "[FlansMod] Type 97 Chi-Ha (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityChiNu.class, "[FlansMod] Type 3 Chi-Nu (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityChurchill.class, "[FlansMod] Churchill Mk VII (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityCrusader.class, "[FlansMod] Cruiser Mk. VI Crusader (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityIS2.class, "[FlansMod] IS-2 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityKV1.class, "[FlansMod] KV-1 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityLuchs.class, "[FlansMod] Panzer II Ausf.L Luchs (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityPanzerIV.class, "[FlansMod] Panzer IV Ausf. H (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityShermanFury.class, "[FlansMod] M4A3E8 Sherman Fury (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityStuGIV.class, "[FlansMod] StuG IV (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityT3476.class, "[FlansMod] T-34/76 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityT3485.class, "[FlansMod] T-34/85 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityTiger131.class, "[FlansMod] Panzer VII Tiger 131 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityTigerII.class, "[FlansMod] Panzer VII Tiger II (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityType4HoRo.class, "[FlansMod] Type 4 Ho-Ro (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityB1.class, "[FlansMod] B1 (Official Pack)", 0x356633, 0x0A8000);
		
		createEntity(EntityM113A1.class, "[FlansMod] M113A1 APC", 0x356633, 0x0A8000);
		createEntity(EntityT72A1979.class, "[FlansMod] T-72A 1979", 0x356633, 0x0A8000);
		createEntity(EntityT55A.class, "[FlansMod] T-55A (Lizard)", 0x356633, 0x0A8000);
		createEntity(EntityType90KyuMaru.class, "[FlansMod] Type 90 Kyu-maru (Monolith Pack)", 0x356633, 0x0A8000);
		createEntity(EntityT14Armata.class, "[FlansMod] T-14 Armata", 0x356633, 0x0A8000);
		createEntity(EntityK2.class, "[FlansMod] K2 Black Panther (Monolith Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM60A1.class, "[FlansMod] M60A1 Patton", 0x356633, 0x0A8000);
		createEntity(EntityM1Abrams.class, "[FlansMod] M1 Abrams", 0x356633, 0x0A8000);
		createEntity(EntityLeopard2A6.class, "[FlansMod] Leopard 2 A6", 0x356633, 0x0A8000);
		createEntity(EntityT90.class, "[FlansMod] T-90", 0x356633, 0x0A8000);
		
		createEntity(EntityPanzerIVJ.class, "[FlansMod] Panzer IV Ausf. J (Wolff's Pack)", 0x356633, 0x0A8000);
		createEntity(EntityPanzer.class, "[FlansMod] Panzer IV", 0x356633, 0x0A8000);
		createEntity(EntityM4.class, "[FlansMod] M4 Sherman", 0x356633, 0x0A8000);
		createEntity(EntityT34.class, "[FlansMod] T-34", 0x356633, 0x0A8000);
		createEntity(EntityPanzerI.class, "[FlansMod] Panzer I Ausf. A (Kikkoceccato)", 0x356633, 0x0A8000);
		createEntity(EntitySkwI.class, "[FlansMod] Sanitätskraftwagen I Ausf. A (Kikkoceccato)", 0x356633, 0x0A8000);
		
		createEntity(EntityJagdpanther.class, "[FlansMod] Jagdpanzer V Jagdpanther (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityJagdpanzerIV.class, "[FlansMod] Jagdpanzer IV/70 Guderian Ente (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityJagdtiger.class, "[FlansMod] Jagdpanzer VI Jagdtiger (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityPantherG.class, "[FlansMod] Panzer V Panther Ausf. G (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityPanzerIVG.class, "[FlansMod] Panzer IV Ausf. G (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityPanzerIVH.class, "[FlansMod] Panzer IV Ausf. H (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityTigerIE.class, "[FlansMod] Panzer VII Tiger Ausf. E (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityTigerIIB.class, "[FlansMod] Panzer VII Tiger II Ausf. B (Manus Pack)", 0x356633, 0x0A8000);
		
		createEntity(EntityFlakpanzerIV.class, "[FlansMod] Flakpanzer IV Wirbelwind (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityHummel.class, "[FlansMod] Panzerhaubitze Hummel (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM4A1.class, "[FlansMod] M4A1 Sherman (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM4A1Calliope.class, "[FlansMod] M4A1 Sherman with T-34 Calliope (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM4A3.class, "[FlansMod] M4A3 Sherman (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityRenaultFT17.class, "[FlansMod] Renault FT-17 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySU100.class, "[FlansMod] SU-100 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySU122.class, "[FlansMod] SU-122 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySU85.class, "[FlansMod] SU-85 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityT34_76.class, "[FlansMod] T-34/76 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityT34_85.class, "[FlansMod] T-34/85 (Manus Pack)", 0x356633, 0x0A8000);
		
		createEntity(EntityStuG3G.class, "[FlansMod] StuG III Ausf. G (Warfare 44)", 0x356633, 0x0A8000);
		
		createEntity(Entity38t.class, "[FlansMod] Panzer 38(t) (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityA39.class, "[FlansMod] A39 Tortoise (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityHetzer.class, "[FlansMod] Jagdpanzer 38(t) Hetzer (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityLVT2.class, "[FlansMod] LVT-2 (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityLVTA1.class, "[FlansMod] LVT(A)-1 (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityMaus.class, "[FlansMod] Panzer VIII Maus (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityML20.class, "[FlansMod] 152mm ML-20 (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityPzkpfw2.class, "[FlansMod] Panzer II Ausf. F (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityPzkpfw3.class, "[FlansMod] Panzer III Ausf. N (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityStug3.class, "[FlansMod] StuG III Ausf. F (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntitySturmtiger.class, "[FlansMod] Sturmpanzer VI Sturmtiger (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityT35.class, "[FlansMod] T-35 (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityTiger1E.class, "[FlansMod] Panzer VII Tiger Ausf. E (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityTKS.class, "[FlansMod] TKS MG (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityTKS20.class, "[FlansMod] TKS 20mm (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityType95.class, "[FlansMod] Type 95 Ha-Go (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityType97.class, "[FlansMod] Type 97 Chi-Ha (Extra Zero 8)", 0x356633, 0x0A8000);
		createEntity(EntityZis3.class, "[FlansMod] 76.2mm ZiS-3 (Extra Zero 8)", 0x356633, 0x0A8000);
	
//Price additions 
		
		createEntity(EntityM41.class, "[FlansMod] M41", 0x356633, 0x0A8000);
		createEntity(EntityA6M1.class, "[FlansMod] A6M1", 0x356633, 0x0A8000);
		createEntity(EntityRomeoClassSub.class, "[FlansMod] Romeo Class Sub", 0x356633, 0x0A8000);	
		createEntity(EntityMirageF1.class, "[FlansMod] Mirage F1", 0x356633, 0x0A8000);
		createEntity(EntitySupplies.class, "[FlansMod] Supplies (Price)", 0x356633, 0x0A8000);		
		createEntity(EntityHigginsBoat.class, "[FlansMod] HigginsBoat ", 0x356633, 0x0A8000);	
		createEntity(EntitySlava.class, "[FlansMod] Slava ", 0x356633, 0x0A8000);	
		createEntity(EntityA7V.class, "[FlansMod] A7V (Monolith Pack)?", 0x356633, 0x0A8000);	
		createEntity(EntityEurocopterTigerHAP.class, "[FlansMod] EurocopterTigerHAP", 0x356633, 0x0A8000);	
		createEntity(EntityT26.class, "[FlansMod] T-26 (Monolith Pack)?", 0x356633, 0x0A8000);	
		createEntity(EntityPak40.class, "[FlansMod] Pak-40", 0x356633, 0x0A8000);	
		createEntity(EntitySandBags1.class, "[FlansMod] SandBags (low res) (Price)", 0x356633, 0x0A8000);	
		createEntity(EntitySandBags2.class, "[FlansMod] SandBags (high res) (Price)", 0x356633, 0x0A8000);	
		createEntity(EntityPak43.class, "[FlansMod] Pak-43", 0x356633, 0x0A8000);	
		createEntity(EntitySoDa.class, "[FlansMod] So-Da", 0x356633, 0x0A8000);		
		createEntity(EntityTeKe.class, "[FlansMod] Te-Ke", 0x356633, 0x0A8000);		
		createEntity(EntityTKlate.class, "[FlansMod] TKlate", 0x356633, 0x0A8000);		
		createEntity(EntityBF109E3.class, "[FlansMod] BF-109E3", 0x356633, 0x0A8000);		
		createEntity(EntityBF109G10.class, "[FlansMod] BF-109G10", 0x356633, 0x0A8000);			
		createEntity(EntityHawkerHurricane.class, "[FlansMod] Hawker Hurricane", 0x356633, 0x0A8000);		
		createEntity(EntityMark3.class, "[FlansMod] Mark 3", 0x356633, 0x0A8000);			
		createEntity(EntityMilitaryCrate.class, "[FlansMod] Military Crate (Somberfob)", 0x356633, 0x0A8000);		
		createEntity(EntityOccupier.class, "[FlansMod] Occupier", 0x356633, 0x0A8000);	
		createEntity(EntityP51D.class, "[FlansMod] P-51D", 0x356633, 0x0A8000);	
		createEntity(EntityJihadBMP1.class, "[FlansMod] Jihad BMP-1D", 0x356633, 0x0A8000);		
		createEntity(EntityMCOMStation.class, "[FlansMod] MCOM Station (Price)", 0x356633, 0x0A8000);		
		createEntity(EntityRadioStation.class, "[FlansMod] Radio Station (Price)", 0x356633, 0x0A8000);		
		createEntity(EntityRadioStationSmall.class, "[FlansMod] Radio Station Small (Price)", 0x356633, 0x0A8000);		
		
//2.2 stuff
		createEntity(EntityBMWR75.class, "[FlansMod] BMW R 75 Gespann (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityBofors.class, "[FlansMod] 40mm Bofors (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityBwTruck.class, "[FlansMod] German Bundeswehr Truck (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityFlak88.class, "[FlansMod] 88mm Flak 36 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityFlakvierling.class, "[FlansMod] 20mm Flakvierling 38 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityGreyhound.class, "[FlansMod] M8 Greyhound (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityHellcat.class, "[FlansMod] M18 Hellcat (Official Pack", 0x356633, 0x0A8000);
		createEntity(EntityJeep.class, "[FlansMod] Jeep (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityKubel.class, "[FlansMod] Kubelwagen (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityLeopard2A7.class, "[FlansMod] Leopard 2 A7 (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM3Halftrack.class, "[FlansMod] M3 Halftrack (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM10.class, "[FlansMod] M10 Wolverine (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM45Quad.class, "[FlansMod] M45 Quadmount (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityM157MM.class, "[FlansMod] 57mm M1 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySASJeep.class, "[FlansMod] SAS Jeep (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySentryGun.class, "[FlansMod] Sentry Gun (Manus Pack)", 0x356633, 0x0A8000);
		createEntity(EntitySU112.class, "[FlansMod] SU-1-12 (Official Pack)", 0x356633, 0x0A8000);
		createEntity(EntityUC2Pdr.class, "[FlansMod] Universal Carrier 2Pdr (Official Pack)", 0x356633, 0x0A8000);
		
		
	}
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.modInstance, 64, 1, true);
		//createEgg(randomId,  solidColour,  spotColour);
	}
	private static void createEgg(int randomId, int solidColour, int spotColour){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId,  solidColour,  spotColour));
	}

}