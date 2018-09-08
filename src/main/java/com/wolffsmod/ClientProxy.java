package com.wolffsmod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import com.wolffsmod.entity.Entity105leFH18B2;
import com.wolffsmod.entity.EntityB1;
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
import com.wolffsmod.model.Model105leFH18B2;
import com.wolffsmod.model.ModelB1;
import com.wolffsmod.model.ModelChaffee;
import com.wolffsmod.model.ModelChiHa;
import com.wolffsmod.model.ModelChiNu;
import com.wolffsmod.model.ModelChurchill;
import com.wolffsmod.model.ModelCromwell;
import com.wolffsmod.model.ModelCrusader;
import com.wolffsmod.model.ModelIS2;
import com.wolffsmod.model.ModelKV1;
import com.wolffsmod.model.ModelLuchs;
import com.wolffsmod.model.ModelPanzerIV;
import com.wolffsmod.model.ModelSdKfz251D;
import com.wolffsmod.model.ModelSherman;
import com.wolffsmod.model.ModelShermanFury;
import com.wolffsmod.model.ModelStuGIV;
import com.wolffsmod.model.ModelT34;
import com.wolffsmod.model.ModelT3485;
import com.wolffsmod.model.ModelTiger;
import com.wolffsmod.model.ModelTiger131;
import com.wolffsmod.model.ModelTigerII;
import com.wolffsmod.model.ModelType4HoRo;
import com.wolffsmod.render.Render105leFH18B2;
import com.wolffsmod.render.RenderB1;
import com.wolffsmod.render.RenderChaffee;
import com.wolffsmod.render.RenderChiHa;
import com.wolffsmod.render.RenderChiNu;
import com.wolffsmod.render.RenderChurchill;
import com.wolffsmod.render.RenderCromwell;
import com.wolffsmod.render.RenderCrusader;
import com.wolffsmod.render.RenderIS2;
import com.wolffsmod.render.RenderKV1;
import com.wolffsmod.render.RenderLuchs;
import com.wolffsmod.render.RenderPanzerIV;
import com.wolffsmod.render.RenderSdKfz251D;
import com.wolffsmod.render.RenderSherman;
import com.wolffsmod.render.RenderShermanFury;
import com.wolffsmod.render.RenderStuGIV;
import com.wolffsmod.render.RenderT34;
import com.wolffsmod.render.RenderT3485;
import com.wolffsmod.render.RenderTiger;
import com.wolffsmod.render.RenderTiger131;
import com.wolffsmod.render.RenderTigerII;
import com.wolffsmod.render.RenderType4HoRo;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	@Override
	public void registerRenderThings(){
		
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
		//RenderingRegistry.registerEntityRenderingHandler(EntityKV1.class, new RenderKV1(new ModelKV1(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuchs.class, new RenderLuchs(new ModelLuchs(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIV.class, new RenderPanzerIV(new ModelPanzerIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityShermanFury.class, new RenderShermanFury(new ModelShermanFury(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityStuGIV.class, new RenderStuGIV(new ModelStuGIV(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT34.class, new RenderT34(new ModelT34(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityT3485.class, new RenderT3485(new ModelT3485(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger131.class, new RenderTiger131(new ModelTiger131(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerII.class, new RenderTigerII(new ModelTigerII(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityType4HoRo.class, new RenderType4HoRo(new ModelType4HoRo(), 0));
	}

}
