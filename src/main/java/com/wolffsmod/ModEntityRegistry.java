package com.wolffsmod;

import net.minecraft.entity.EntityList;

import com.wolffsmod.Main;
import com.wolffsmod.entity.Entity105leFH18B2;
import com.wolffsmod.entity.EntityChaffee;
import com.wolffsmod.entity.EntityChiHa;
import com.wolffsmod.entity.EntityChiNu;
import com.wolffsmod.entity.EntityChurchill;
import com.wolffsmod.entity.EntityCromwell;
import com.wolffsmod.entity.EntityCrusader;
import com.wolffsmod.entity.EntityIS2;
import com.wolffsmod.entity.EntityKV1;
import com.wolffsmod.entity.EntityLuchs;
import com.wolffsmod.entity.EntityPanzerIV;
import com.wolffsmod.entity.EntitySdKfz251D;
import com.wolffsmod.entity.EntitySherman;
import com.wolffsmod.entity.EntityShermanFury;
import com.wolffsmod.entity.EntityStuGIV;
import com.wolffsmod.entity.EntityT34;
import com.wolffsmod.entity.EntityT3485;
import com.wolffsmod.entity.EntityTiger;
import com.wolffsmod.entity.EntityTiger131;
import com.wolffsmod.entity.EntityTigerII;
import com.wolffsmod.entity.EntityType4HoRo;

import cpw.mods.fml.common.registry.EntityRegistry;


public class ModEntityRegistry {
	public static void mainRegistry(){
		registerEntity();
	}
	public static void registerEntity(){
		createEntity(EntitySdKfz251D.class, "[Flan's mod] SdKfz251 Ausf. D", 0x356633, 0x0A8000);
		createEntity(EntityTiger.class, "[Flan's mod] Panzer VII Tiger", 0x356633, 0x0A8000);
		createEntity(EntitySherman.class, "[Flan's mod] M4A3E8 Sherman Easy Eight", 0x356633, 0x0A8000);
		createEntity(EntityChaffee.class, "[Flan's mod] M24 Chaffee", 0x356633, 0x0A8000);
		createEntity(Entity105leFH18B2.class, "[Flan's mod] 105 mm leFH 18 B2", 0x356633, 0x0A8000);
		createEntity(EntityCromwell.class, "[Flan's mod] Cromwell", 0x356633, 0x0A8000);
		createEntity(EntityChiHa.class, "[Flan's mod] Type 97 Chi-Ha", 0x356633, 0x0A8000);
		createEntity(EntityChiNu.class, "[Flan's mod] Type 3 Chi-Nu", 0x356633, 0x0A8000);
		createEntity(EntityChurchill.class, "[Flan's mod] Churchill Mk VII", 0x356633, 0x0A8000);
		createEntity(EntityCrusader.class, "[Flan's mod] Cruiser Mk. VI Crusader", 0x356633, 0x0A8000);
		createEntity(EntityIS2.class, "[Flan's mod] IS-2", 0x356633, 0x0A8000);
		//createEntity(EntityKV1.class, "[Flan's mod] KV-1", 0x356633, 0x0A8000);
		createEntity(EntityLuchs.class, "[Flan's mod] Panzer II Ausf.L Luchs", 0x356633, 0x0A8000);
		createEntity(EntityPanzerIV.class, "[Flan's mod] Panzer IV Ausf. H", 0x356633, 0x0A8000);
		createEntity(EntityShermanFury.class, "[Flan's mod] M4A3E8 Sherman Fury", 0x356633, 0x0A8000);
		createEntity(EntityStuGIV.class, "[Flan's mod] StuG IV", 0x356633, 0x0A8000);
		createEntity(EntityT34.class, "[Flan's mod] T-34/76", 0x356633, 0x0A8000);
		createEntity(EntityT3485.class, "[Flan's mod] T-34/85", 0x356633, 0x0A8000);
		createEntity(EntityTiger131.class, "[Flan's mod] Panzer VII Tiger 131", 0x356633, 0x0A8000);
		createEntity(EntityTigerII.class, "[Flan's mod] Panzer VII Tiger II", 0x356633, 0x0A8000);
		createEntity(EntityType4HoRo.class, "[Flan's mod] Type 4 Ho-Ro", 0x356633, 0x0A8000);
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