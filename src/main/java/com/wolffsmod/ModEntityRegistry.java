package com.wolffsmod;

import net.minecraft.entity.EntityList;

import com.wolffsmod.Main;
import com.wolffsmod.entity.Entity105leFH18B2;
import com.wolffsmod.entity.EntityB1;
import com.wolffsmod.entity.EntityChaffee;
import com.wolffsmod.entity.EntityChiHa;
import com.wolffsmod.entity.EntityChiNu;
import com.wolffsmod.entity.EntityChurchill;
import com.wolffsmod.entity.EntityCromwell;
import com.wolffsmod.entity.EntityCrusader;
import com.wolffsmod.entity.EntityFlakpanzerIV;
import com.wolffsmod.entity.EntityHummel;
import com.wolffsmod.entity.EntityIS2;
import com.wolffsmod.entity.EntityJagdpanther;
import com.wolffsmod.entity.EntityJagdpanzerIV;
import com.wolffsmod.entity.EntityJagdtiger;
import com.wolffsmod.entity.EntityK2;
import com.wolffsmod.entity.EntityKV1;
import com.wolffsmod.entity.EntityLeopard2A6;
import com.wolffsmod.entity.EntityLuchs;
import com.wolffsmod.entity.EntityM113A1;
import com.wolffsmod.entity.EntityM1Abrams;
import com.wolffsmod.entity.EntityM4;
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
import com.wolffsmod.entity.EntitySU100;
import com.wolffsmod.entity.EntitySU122;
import com.wolffsmod.entity.EntitySU85;
import com.wolffsmod.entity.EntitySdKfz251D;
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