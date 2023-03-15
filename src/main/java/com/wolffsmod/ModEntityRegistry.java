package com.wolffsmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ResourceLocation;

import com.wolffsmod.Main;
import com.wolffsmod.entity.Entity105leFH18B2;
import com.wolffsmod.entity.EntityB1;
import com.wolffsmod.entity.EntityBMWR75;
import com.wolffsmod.entity.EntityBofors;
import com.wolffsmod.entity.EntityBwTruck;
import com.wolffsmod.entity.EntityChaffee;
import com.wolffsmod.entity.EntityChiHa;
import com.wolffsmod.entity.EntityChiNu;
import com.wolffsmod.entity.EntityChurchill;
import com.wolffsmod.entity.EntityCromwell;
import com.wolffsmod.entity.EntityCrusader;
import com.wolffsmod.entity.EntityFlak88;
import com.wolffsmod.entity.EntityFlakpanzerIV;
import com.wolffsmod.entity.EntityFlakvierling;
import com.wolffsmod.entity.EntityGreyhound;
import com.wolffsmod.entity.EntityHellcat;
import com.wolffsmod.entity.EntityHummel;
import com.wolffsmod.entity.EntityIS2;
import com.wolffsmod.entity.EntityJagdpanther;
import com.wolffsmod.entity.EntityJagdpanzerIV;
import com.wolffsmod.entity.EntityJagdtiger;
import com.wolffsmod.entity.EntityJeep;
import com.wolffsmod.entity.EntityK2;
import com.wolffsmod.entity.EntityKV1;
import com.wolffsmod.entity.EntityKubel;
import com.wolffsmod.entity.EntityLeopard2A6;
import com.wolffsmod.entity.EntityLeopard2A7;
import com.wolffsmod.entity.EntityLeopardIIA6;
import com.wolffsmod.entity.EntityLuchs;
import com.wolffsmod.entity.EntityM10;
import com.wolffsmod.entity.EntityM113A1;
import com.wolffsmod.entity.EntityM157MM;
import com.wolffsmod.entity.EntityM1Abrams;
import com.wolffsmod.entity.EntityM3Halftrack;
import com.wolffsmod.entity.EntityM4;
import com.wolffsmod.entity.EntityM45Quad;
import com.wolffsmod.entity.EntityM4A1;
import com.wolffsmod.entity.EntityM4A1Calliope;
import com.wolffsmod.entity.EntityM4A3;
import com.wolffsmod.entity.EntityM60A1;
import com.wolffsmod.entity.EntityPantherG;
import com.wolffsmod.entity.EntityPanzer;
import com.wolffsmod.entity.EntityPanzerI;
import com.wolffsmod.entity.EntityPanzerIV;
import com.wolffsmod.entity.EntityPanzerIVG;
import com.wolffsmod.entity.EntityPanzerIVH;
import com.wolffsmod.entity.EntityPanzerIVJ;
import com.wolffsmod.entity.EntityRenaultFT17;
import com.wolffsmod.entity.EntitySASJeep;
import com.wolffsmod.entity.EntitySU100;
import com.wolffsmod.entity.EntitySU112;
import com.wolffsmod.entity.EntitySU122;
import com.wolffsmod.entity.EntitySU85;
import com.wolffsmod.entity.EntitySdKfz251D;
import com.wolffsmod.entity.EntitySentryGun;
import com.wolffsmod.entity.EntitySherman;
import com.wolffsmod.entity.EntityShermanFury;
import com.wolffsmod.entity.EntitySkwI;
import com.wolffsmod.entity.EntityStuG3G;
import com.wolffsmod.entity.EntityStuGIV;
import com.wolffsmod.entity.EntityT14Armata;
import com.wolffsmod.entity.EntityT34;
import com.wolffsmod.entity.EntityT3476;
import com.wolffsmod.entity.EntityT3485;
import com.wolffsmod.entity.EntityT34_76;
import com.wolffsmod.entity.EntityT34_85;
import com.wolffsmod.entity.EntityT55A;
import com.wolffsmod.entity.EntityT72A1979;
import com.wolffsmod.entity.EntityT90;
import com.wolffsmod.entity.EntityTiger;
import com.wolffsmod.entity.EntityTiger131;
import com.wolffsmod.entity.EntityTigerIE;
import com.wolffsmod.entity.EntityTigerII;
import com.wolffsmod.entity.EntityTigerIIB;
import com.wolffsmod.entity.EntityType4HoRo;
import com.wolffsmod.entity.EntityType90KyuMaru;
import com.wolffsmod.entity.Entity38t;
import com.wolffsmod.entity.EntityA39;
import com.wolffsmod.entity.EntityHetzer;
import com.wolffsmod.entity.EntityLVT2;
import com.wolffsmod.entity.EntityLVTA1;
import com.wolffsmod.entity.EntityMaus;
import com.wolffsmod.entity.EntityPak40;
import com.wolffsmod.entity.EntityML20;
import com.wolffsmod.entity.EntityPzkpfw2;
import com.wolffsmod.entity.EntityPzkpfw3;
import com.wolffsmod.entity.EntityStug3;
import com.wolffsmod.entity.EntitySturmtiger;
import com.wolffsmod.entity.EntityT35;
import com.wolffsmod.entity.EntityTiger1E;
import com.wolffsmod.entity.EntityTKS;
import com.wolffsmod.entity.EntityTKS20;
import com.wolffsmod.entity.EntityType95;
import com.wolffsmod.entity.EntityType97;
import com.wolffsmod.entity.EntityUC2Pdr;
import com.wolffsmod.entity.EntityZis3;

import net.minecraftforge.fml.common.registry.EntityRegistry;


public class ModEntityRegistry {
	
	static int id = 200;
	
	public static void mainRegistry() {
		registerEntities();
	}
	
	public static void registerEntities() {
		registerEntity(Entity105leFH18B2.class, "[FlansMod] 105 mm leFH 18 B2 (Official Pack)");
		registerEntity(EntitySdKfz251D.class, "[FlansMod] SdKfz251 Ausf. D (Wolff's Pack)");
		registerEntity(EntityTiger.class, "[FlansMod] Panzer VII Tiger (Official Pack)");
		registerEntity(EntitySherman.class, "[FlansMod] M4A3E8 Sherman Easy Eight (Official Pack)");
		registerEntity(EntityChaffee.class, "[FlansMod] M24 Chaffee (Official Pack)");
		registerEntity(EntityCromwell.class, "[FlansMod] Cromwell (Official Pack)");
		registerEntity(EntityChiHa.class, "[FlansMod] Type 97 Chi-Ha (Official Pack)");
		registerEntity(EntityChiNu.class, "[FlansMod] Type 3 Chi-Nu (Official Pack)");
		registerEntity(EntityChurchill.class, "[FlansMod] Churchill Mk VII (Official Pack)");
		registerEntity(EntityCrusader.class, "[FlansMod] Cruiser Mk. VI Crusader (Official Pack)");
		registerEntity(EntityIS2.class, "[FlansMod] IS-2 (Official Pack)");
		registerEntity(EntityKV1.class, "[FlansMod] KV-1 (Official Pack)");
		registerEntity(EntityLuchs.class, "[FlansMod] Panzer II Ausf.L Luchs (Official Pack)");
		registerEntity(EntityPanzerIV.class, "[FlansMod] Panzer IV Ausf. H (Official Pack)");
		registerEntity(EntityShermanFury.class, "[FlansMod] M4A3E8 Sherman Fury (Official Pack)");
		registerEntity(EntityStuGIV.class, "[FlansMod] StuG IV (Official Pack)");
		registerEntity(EntityT3476.class, "[FlansMod] T-34/76 (Official Pack)");
		registerEntity(EntityT3485.class, "[FlansMod] T-34/85 (Official Pack)");
		registerEntity(EntityTiger131.class, "[FlansMod] Panzer VII Tiger 131 (Official Pack)");
		registerEntity(EntityTigerII.class, "[FlansMod] Panzer VII Tiger II (Official Pack)");
		registerEntity(EntityType4HoRo.class, "[FlansMod] Type 4 Ho-Ro (Official Pack)");
		registerEntity(EntityB1.class, "[FlansMod] B1 (Official Pack)");
		
		registerEntity(EntityM113A1.class, "[FlansMod] M113A1 APC");
		registerEntity(EntityT72A1979.class, "[FlansMod] T-72A 1979");
		registerEntity(EntityT55A.class, "[FlansMod] T-55A (Lizard)");
		registerEntity(EntityType90KyuMaru.class, "[FlansMod] Type 90 Kyu-maru (Monolith Pack)");
		registerEntity(EntityT14Armata.class, "[FlansMod] T-14 Armata");
		registerEntity(EntityK2.class, "[FlansMod] K2 Black Panther (Monolith Pack)");
		registerEntity(EntityM60A1.class, "[FlansMod] M60A1 Patton");
		registerEntity(EntityM1Abrams.class, "[FlansMod] M1 Abrams");
		registerEntity(EntityLeopard2A6.class, "[FlansMod] Leopard 2 A6");
		registerEntity(EntityT90.class, "[FlansMod] T-90");
		
		registerEntity(EntityPanzerIVJ.class, "[FlansMod] Panzer IV Ausf. J (Wolff's Pack)");
		registerEntity(EntityPanzer.class, "[FlansMod] Panzer IV");
		registerEntity(EntityM4.class, "[FlansMod] M4 Sherman");
		registerEntity(EntityT34.class, "[FlansMod] T-34");
		registerEntity(EntityPanzerI.class, "[FlansMod] Panzer I Ausf. A (Kikkoceccato)");
		registerEntity(EntitySkwI.class, "[FlansMod] Sanitatskraftwagen I Ausf. A (Kikkoceccato)");
		
		registerEntity(EntityJagdpanther.class, "[FlansMod] Jagdpanzer V Jagdpanther (Manus Pack)");
		registerEntity(EntityJagdpanzerIV.class, "[FlansMod] Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
		registerEntity(EntityJagdtiger.class, "[FlansMod] Jagdpanzer VI Jagdtiger (Manus Pack)");
		registerEntity(EntityPantherG.class, "[FlansMod] Panzer V Panther Ausf. G (Manus Pack)");
		registerEntity(EntityPanzerIVG.class, "[FlansMod] Panzer IV Ausf. G (Manus Pack)");
		registerEntity(EntityPanzerIVH.class, "[FlansMod] Panzer IV Ausf. H (Manus Pack)");
		registerEntity(EntityTigerIE.class, "[FlansMod] Panzer VII Tiger Ausf. E (Manus Pack)");
		registerEntity(EntityTigerIIB.class, "[FlansMod] Panzer VII Tiger II Ausf. B (Manus Pack)");
		
		registerEntity(EntityFlakpanzerIV.class, "[FlansMod] Flakpanzer IV Wirbelwind (Manus Pack)");
		registerEntity(EntityHummel.class, "[FlansMod] Panzerhaubitze Hummel (Manus Pack)");
		registerEntity(EntityM4A1.class, "[FlansMod] M4A1 Sherman (Manus Pack)");
		registerEntity(EntityM4A1Calliope.class, "[FlansMod] M4A1 Sherman with T-34 Calliope (Manus Pack)");
		registerEntity(EntityM4A3.class, "[FlansMod] M4A3 Sherman (Manus Pack)");
		registerEntity(EntityRenaultFT17.class, "[FlansMod] Renault FT-17 (Manus Pack)");
		registerEntity(EntitySU100.class, "[FlansMod] SU-100 (Manus Pack)");
		registerEntity(EntitySU122.class, "[FlansMod] SU-122 (Manus Pack)");
		registerEntity(EntitySU85.class, "[FlansMod] SU-85 (Manus Pack)");
		registerEntity(EntityT34_76.class, "[FlansMod] T-34/76 (Manus Pack)");
		registerEntity(EntityT34_85.class, "[FlansMod] T-34/85 (Manus Pack)");
		
		registerEntity(EntityStuG3G.class, "[FlansMod] StuG III Ausf. G (Warfare 44)");
		
		registerEntity(Entity38t.class, "[FlansMod] Panzer 38(t) (Extra Zero 8)");
		registerEntity(EntityA39.class, "[FlansMod] A39 Tortoise (Extra Zero 8)");
		registerEntity(EntityHetzer.class, "[FlansMod] Jagdpanzer 38(t) Hetzer (Extra Zero 8)");
		registerEntity(EntityLVT2.class, "[FlansMod] LVT-2 (Extra Zero 8)");
		registerEntity(EntityLVTA1.class, "[FlansMod] LVT(A)-1 (Extra Zero 8)");
		registerEntity(EntityMaus.class, "[FlansMod] Panzer VIII Maus (Extra Zero 8)");
		registerEntity(EntityML20.class, "[FlansMod] 152mm ML-20 (Extra Zero 8)");
		registerEntity(EntityPzkpfw2.class, "[FlansMod] Panzer II Ausf. F (Extra Zero 8)");
		registerEntity(EntityPzkpfw3.class, "[FlansMod] Panzer III Ausf. N (Extra Zero 8)");
		registerEntity(EntityStug3.class, "[FlansMod] StuG III Ausf. F (Extra Zero 8)");
		registerEntity(EntitySturmtiger.class, "[FlansMod] Sturmpanzer VI Sturmtiger (Extra Zero 8)");
		registerEntity(EntityT35.class, "[FlansMod] T-35 (Extra Zero 8)");
		registerEntity(EntityTiger1E.class, "[FlansMod] Panzer VII Tiger Ausf. E (Extra Zero 8)");
		registerEntity(EntityTKS.class, "[FlansMod] TKS MG (Extra Zero 8)");
		registerEntity(EntityTKS20.class, "[FlansMod] TKS 20mm (Extra Zero 8)");
		registerEntity(EntityType95.class, "[FlansMod] Type 95 Ha-Go (Extra Zero 8)");
		registerEntity(EntityType97.class, "[FlansMod] Type 97 Chi-Ha (Extra Zero 8)");
		registerEntity(EntityZis3.class, "[FlansMod] 76.2mm ZiS-3 (Extra Zero 8)");
		
        registerEntity(EntityBMWR75.class, "[FlansMod] BMW R 75 Gespann (Official Pack)");
        registerEntity(EntityBofors.class, "[FlansMod] 40mm Bofors (Official Pack)");
        registerEntity(EntityFlak88.class, "[FlansMod] 88mm Flak 36 (Official Pack)");
        registerEntity(EntityFlakvierling.class, "[FlansMod] 20mm Flakvierling 38 (Official Pack)");
        registerEntity(EntityGreyhound.class, "[FlansMod] M8 Greyhound (Official Pack)");
        registerEntity(EntityHellcat.class, "[FlansMod] M18 Hellcat (Official Pack)");
        registerEntity(EntityJeep.class, "[FlansMod] Jeep (Official Pack)");
        registerEntity(EntityKubel.class, "[FlansMod] K\u00fcbelwagen (Official Pack)");
        registerEntity(EntityM10.class, "[FlansMod] M10 Wolverine (Official Pack)");
        registerEntity(EntityM157MM.class, "[FlansMod] 57mm M1 (Official Pack)");
        registerEntity(EntityM3Halftrack.class, "[FlansMod] M3 Halftrack (Official Pack)");
        registerEntity(EntityM45Quad.class, "[FlansMod] M45 Quadmount (Official Pack)");
        registerEntity(EntityPak40.class, "[FlansMod] 75mm PaK 40 (Official Pack)");
        registerEntity(EntitySASJeep.class, "[FlansMod] SAS Jeep (Official Pack)");
        registerEntity(EntitySU112.class, "[FlansMod] SU-1-12 (Official Pack)");
        registerEntity(EntityUC2Pdr.class, "[FlansMod] Universal Carrier 2Pdr (Official Pack)");
        registerEntity(EntityBwTruck.class, "[FlansMod] German Bundeswehr Truck (Manus Pack)");
        registerEntity(EntityLeopard2A7.class, "[FlansMod] Leopard 2 A6 (Manus Pack)");
        registerEntity(EntityLeopardIIA6.class, "[FlansMod] Leopard 2 A7+ PSO (Manus Pack)");
        registerEntity(EntitySentryGun.class, "[FlansMod] Sentry Gun (Manus Pack)");
	}
	
	private static void registerEntity(Class<? extends Entity> entity, String name) {
		id++;
		EntityRegistry.registerModEntity(new ResourceLocation(Strings.MODID + ":" + entity.toString()), entity, name, id, Main.instance, 64, 1, true);
	}
	
	/*
	 * 
	 *public static void registerEntity(Class<? extends Entity> entity, String name){
	 *	id++;
	 *	EntityRegistry.registerModEntity(new ResourceLocation(Strings.MODID + ":" + entity.toString()), entity, name, id, Main.instance, 64, 1, true, 000000, 000000);
	}*/
}