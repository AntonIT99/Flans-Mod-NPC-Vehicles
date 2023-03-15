package com.wolffsmod;

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
import com.wolffsmod.render.Render105leFH18B2;
import com.wolffsmod.render.RenderB1;
import com.wolffsmod.render.RenderBMWR75;
import com.wolffsmod.render.RenderBofors;
import com.wolffsmod.render.RenderBwTruck;
import com.wolffsmod.render.RenderChaffee;
import com.wolffsmod.render.RenderChiHa;
import com.wolffsmod.render.RenderChiNu;
import com.wolffsmod.render.RenderChurchill;
import com.wolffsmod.render.RenderCromwell;
import com.wolffsmod.render.RenderCrusader;
import com.wolffsmod.render.RenderFlak88;
import com.wolffsmod.render.RenderFlakpanzerIV;
import com.wolffsmod.render.RenderFlakvierling;
import com.wolffsmod.render.RenderGreyhound;
import com.wolffsmod.render.RenderHellcat;
import com.wolffsmod.render.RenderHummel;
import com.wolffsmod.render.RenderIS2;
import com.wolffsmod.render.RenderJagdpanther;
import com.wolffsmod.render.RenderJagdpanzerIV;
import com.wolffsmod.render.RenderJagdtiger;
import com.wolffsmod.render.RenderJeep;
import com.wolffsmod.render.RenderK2;
import com.wolffsmod.render.RenderKV1;
import com.wolffsmod.render.RenderKubel;
import com.wolffsmod.render.RenderLeopard2A6;
import com.wolffsmod.render.RenderLeopard2A7;
import com.wolffsmod.render.RenderLeopardIIA6;
import com.wolffsmod.render.RenderLuchs;
import com.wolffsmod.render.RenderM10;
import com.wolffsmod.render.RenderM113A1;
import com.wolffsmod.render.RenderM157MM;
import com.wolffsmod.render.RenderM1Abrams;
import com.wolffsmod.render.RenderM3Halftrack;
import com.wolffsmod.render.RenderM4;
import com.wolffsmod.render.RenderM45Quad;
import com.wolffsmod.render.RenderM4A1;
import com.wolffsmod.render.RenderM4A1Calliope;
import com.wolffsmod.render.RenderM4A3;
import com.wolffsmod.render.RenderM60A1;
import com.wolffsmod.render.RenderPantherG;
import com.wolffsmod.render.RenderPanzer;
import com.wolffsmod.render.RenderPanzerI;
import com.wolffsmod.render.RenderPanzerIV;
import com.wolffsmod.render.RenderPanzerIVG;
import com.wolffsmod.render.RenderPanzerIVH;
import com.wolffsmod.render.RenderPanzerIVJ;
import com.wolffsmod.render.RenderRenaultFT17;
import com.wolffsmod.render.RenderSASJeep;
import com.wolffsmod.render.RenderSU100;
import com.wolffsmod.render.RenderSU112;
import com.wolffsmod.render.RenderSU122;
import com.wolffsmod.render.RenderSU85;
import com.wolffsmod.render.RenderSdKfz251D;
import com.wolffsmod.render.RenderSentryGun;
import com.wolffsmod.render.RenderSherman;
import com.wolffsmod.render.RenderShermanFury;
import com.wolffsmod.render.RenderSkwI;
import com.wolffsmod.render.RenderStuG3G;
import com.wolffsmod.render.RenderStuGIV;
import com.wolffsmod.render.RenderT14Armata;
import com.wolffsmod.render.RenderT34;
import com.wolffsmod.render.RenderT3476;
import com.wolffsmod.render.RenderT3485;
import com.wolffsmod.render.RenderT34_76;
import com.wolffsmod.render.RenderT34_85;
import com.wolffsmod.render.RenderT55A;
import com.wolffsmod.render.RenderT72A1979;
import com.wolffsmod.render.RenderT90;
import com.wolffsmod.render.RenderTiger;
import com.wolffsmod.render.RenderTiger131;
import com.wolffsmod.render.RenderTigerIE;
import com.wolffsmod.render.RenderTigerII;
import com.wolffsmod.render.RenderTigerIIB;
import com.wolffsmod.render.RenderType4HoRo;
import com.wolffsmod.render.RenderType90KyuMaru;
import com.wolffsmod.entity.Entity38t;
import com.wolffsmod.render.Render38t;
import com.wolffsmod.entity.EntityA39;
import com.wolffsmod.render.RenderA39;
import com.wolffsmod.entity.EntityHetzer;
import com.wolffsmod.render.RenderHetzer;
import com.wolffsmod.entity.EntityLVT2;
import com.wolffsmod.render.RenderLVT2;
import com.wolffsmod.entity.EntityLVTA1;
import com.wolffsmod.render.RenderLVTA1;
import com.wolffsmod.entity.EntityMaus;
import com.wolffsmod.entity.EntityPak40;
import com.wolffsmod.render.RenderMaus;
import com.wolffsmod.render.RenderPak40;
import com.wolffsmod.entity.EntityML20;
import com.wolffsmod.render.RenderML20;
import com.wolffsmod.entity.EntityPzkpfw2;
import com.wolffsmod.render.RenderPzkpfw2;
import com.wolffsmod.entity.EntityPzkpfw3;
import com.wolffsmod.render.RenderPzkpfw3;
import com.wolffsmod.entity.EntityStug3;
import com.wolffsmod.render.RenderStug3;
import com.wolffsmod.entity.EntitySturmtiger;
import com.wolffsmod.render.RenderSturmtiger;
import com.wolffsmod.entity.EntityT35;
import com.wolffsmod.render.RenderT35;
import com.wolffsmod.entity.EntityTiger1E;
import com.wolffsmod.render.RenderTiger1E;
import com.wolffsmod.entity.EntityTKS;
import com.wolffsmod.render.RenderTKS;
import com.wolffsmod.entity.EntityTKS20;
import com.wolffsmod.render.RenderTKS20;
import com.wolffsmod.entity.EntityType95;
import com.wolffsmod.render.RenderType95;
import com.wolffsmod.entity.EntityType97;
import com.wolffsmod.entity.EntityUC2Pdr;
import com.wolffsmod.render.RenderType97;
import com.wolffsmod.render.RenderUC2Pdr;
import com.wolffsmod.entity.EntityZis3;
import com.wolffsmod.model.Model105leFH18B2;
import com.wolffsmod.model.Model38t;
import com.wolffsmod.model.ModelA39;
import com.wolffsmod.model.ModelB1;
import com.wolffsmod.model.ModelChaffee;
import com.wolffsmod.model.ModelChiHa;
import com.wolffsmod.model.ModelChiNu;
import com.wolffsmod.model.ModelChurchill;
import com.wolffsmod.model.ModelCromwell;
import com.wolffsmod.model.ModelCrusader;
import com.wolffsmod.model.ModelFlakpanzerIV;
import com.wolffsmod.model.ModelHetzer;
import com.wolffsmod.model.ModelHummel;
import com.wolffsmod.model.ModelIS2;
import com.wolffsmod.model.ModelJagdpanther;
import com.wolffsmod.model.ModelJagdpanzerIV;
import com.wolffsmod.model.ModelJagdtiger;
import com.wolffsmod.model.ModelK2;
import com.wolffsmod.model.ModelKV1;
import com.wolffsmod.model.ModelLVT2;
import com.wolffsmod.model.ModelLVTA1;
import com.wolffsmod.model.ModelLeopard2A6;
import com.wolffsmod.model.ModelLuchs;
import com.wolffsmod.model.ModelM113A1;
import com.wolffsmod.model.ModelM1Abrams;
import com.wolffsmod.model.ModelM4;
import com.wolffsmod.model.ModelM4A1;
import com.wolffsmod.model.ModelM4A1Calliope;
import com.wolffsmod.model.ModelM4A3;
import com.wolffsmod.model.ModelM60A1;
import com.wolffsmod.model.ModelML20;
import com.wolffsmod.model.ModelMaus;
import com.wolffsmod.model.ModelPantherG;
import com.wolffsmod.model.ModelPanzer;
import com.wolffsmod.model.ModelPanzerI;
import com.wolffsmod.model.ModelPanzerIV;
import com.wolffsmod.model.ModelPanzerIVG;
import com.wolffsmod.model.ModelPanzerIVH;
import com.wolffsmod.model.ModelPanzerIVJ;
import com.wolffsmod.model.ModelPzkpfw2;
import com.wolffsmod.model.ModelPzkpfw3;
import com.wolffsmod.model.ModelRenaultFT17;
import com.wolffsmod.model.ModelSU100;
import com.wolffsmod.model.ModelSU122;
import com.wolffsmod.model.ModelSU85;
import com.wolffsmod.model.ModelSdKfz251D;
import com.wolffsmod.model.ModelSherman;
import com.wolffsmod.model.ModelShermanFury;
import com.wolffsmod.model.ModelSkwI;
import com.wolffsmod.model.ModelStuG3G;
import com.wolffsmod.model.ModelStuGIV;
import com.wolffsmod.model.ModelStug3;
import com.wolffsmod.model.ModelSturmtiger;
import com.wolffsmod.model.ModelT14Armata;
import com.wolffsmod.model.ModelT34;
import com.wolffsmod.model.ModelT3476;
import com.wolffsmod.model.ModelT3485;
import com.wolffsmod.model.ModelT34_76;
import com.wolffsmod.model.ModelT34_85;
import com.wolffsmod.model.ModelT35;
import com.wolffsmod.model.ModelT55A;
import com.wolffsmod.model.ModelT72A1979;
import com.wolffsmod.model.ModelT90;
import com.wolffsmod.model.ModelTKS;
import com.wolffsmod.model.ModelTKS20;
import com.wolffsmod.model.ModelTiger;
import com.wolffsmod.model.ModelTiger131;
import com.wolffsmod.model.ModelTiger1E;
import com.wolffsmod.model.ModelTigerIE;
import com.wolffsmod.model.ModelTigerII;
import com.wolffsmod.model.ModelTigerIIB;
import com.wolffsmod.model.ModelType4HoRo;
import com.wolffsmod.model.ModelType90KyuMaru;
import com.wolffsmod.model.ModelType95;
import com.wolffsmod.model.ModelType97;
import com.wolffsmod.model.ModelZis3;
import com.wolffsmod.render.RenderZis3;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	
	@Override
	public void registerRenderThings(){
		
		RenderingRegistry.registerEntityRenderingHandler(Entity105leFH18B2.class, new IRenderFactory<Entity105leFH18B2>()
		{
			@Override
			public Render<? super Entity105leFH18B2> createRenderFor(RenderManager manager) 
			{
				return new Render105leFH18B2(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(Entity38t.class, new IRenderFactory<Entity38t>()
		{
			@Override
			public Render<? super Entity38t> createRenderFor(RenderManager manager) 
			{
				return new Render38t(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityA39.class, new IRenderFactory<EntityA39>()
		{
			@Override
			public Render<? super EntityA39> createRenderFor(RenderManager manager) 
			{
				return new RenderA39(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityB1.class, new IRenderFactory<EntityB1>()
		{
			@Override
			public Render<? super EntityB1> createRenderFor(RenderManager manager) 
			{
				return new RenderB1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityChaffee.class, new IRenderFactory<EntityChaffee>()
		{
			@Override
			public Render<? super EntityChaffee> createRenderFor(RenderManager manager) 
			{
				return new RenderChaffee(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityChiHa.class, new IRenderFactory<EntityChiHa>()
		{
			@Override
			public Render<? super EntityChiHa> createRenderFor(RenderManager manager) 
			{
				return new RenderChiHa(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityChiNu.class, new IRenderFactory<EntityChiNu>()
		{
			@Override
			public Render<? super EntityChiNu> createRenderFor(RenderManager manager) 
			{
				return new RenderChiNu(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityChurchill.class, new IRenderFactory<EntityChurchill>()
		{
			@Override
			public Render<? super EntityChurchill> createRenderFor(RenderManager manager) 
			{
				return new RenderChurchill(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCromwell.class, new IRenderFactory<EntityCromwell>()
		{
			@Override
			public Render<? super EntityCromwell> createRenderFor(RenderManager manager) 
			{
				return new RenderCromwell(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCrusader.class, new IRenderFactory<EntityCrusader>()
		{
			@Override
			public Render<? super EntityCrusader> createRenderFor(RenderManager manager) 
			{
				return new RenderCrusader(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlakpanzerIV.class, new IRenderFactory<EntityFlakpanzerIV>()
		{
			@Override
			public Render<? super EntityFlakpanzerIV> createRenderFor(RenderManager manager) 
			{
				return new RenderFlakpanzerIV(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHetzer.class, new IRenderFactory<EntityHetzer>()
		{
			@Override
			public Render<? super EntityHetzer> createRenderFor(RenderManager manager) 
			{
				return new RenderHetzer(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHummel.class, new IRenderFactory<EntityHummel>()
		{
			@Override
			public Render<? super EntityHummel> createRenderFor(RenderManager manager) 
			{
				return new RenderHummel(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityIS2.class, new IRenderFactory<EntityIS2>()
		{
			@Override
			public Render<? super EntityIS2> createRenderFor(RenderManager manager) 
			{
				return new RenderIS2(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdpanther.class, new IRenderFactory<EntityJagdpanther>()
		{
			@Override
			public Render<? super EntityJagdpanther> createRenderFor(RenderManager manager) 
			{
				return new RenderJagdpanther(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdpanzerIV.class, new IRenderFactory<EntityJagdpanzerIV>()
		{
			@Override
			public Render<? super EntityJagdpanzerIV> createRenderFor(RenderManager manager) 
			{
				return new RenderJagdpanzerIV(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJagdtiger.class, new IRenderFactory<EntityJagdtiger>()
		{
			@Override
			public Render<? super EntityJagdtiger> createRenderFor(RenderManager manager) 
			{
				return new RenderJagdtiger(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityK2.class, new IRenderFactory<EntityK2>()
		{
			@Override
			public Render<? super EntityK2> createRenderFor(RenderManager manager) 
			{
				return new RenderK2(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKV1.class, new IRenderFactory<EntityKV1>()
		{
			@Override
			public Render<? super EntityKV1> createRenderFor(RenderManager manager) 
			{
				return new RenderKV1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A6.class, new IRenderFactory<EntityLeopard2A6>()
		{
			@Override
			public Render<? super EntityLeopard2A6> createRenderFor(RenderManager manager) 
			{
				return new RenderLeopard2A6(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLuchs.class, new IRenderFactory<EntityLuchs>()
		{
			@Override
			public Render<? super EntityLuchs> createRenderFor(RenderManager manager) 
			{
				return new RenderLuchs(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLVT2.class, new IRenderFactory<EntityLVT2>()
		{
			@Override
			public Render<? super EntityLVT2> createRenderFor(RenderManager manager) 
			{
				return new RenderLVT2(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLVTA1.class, new IRenderFactory<EntityLVTA1>()
		{
			@Override
			public Render<? super EntityLVTA1> createRenderFor(RenderManager manager) 
			{
				return new RenderLVTA1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM113A1.class, new IRenderFactory<EntityM113A1>()
		{
			@Override
			public Render<? super EntityM113A1> createRenderFor(RenderManager manager) 
			{
				return new RenderM113A1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM1Abrams.class, new IRenderFactory<EntityM1Abrams>()
		{
			@Override
			public Render<? super EntityM1Abrams> createRenderFor(RenderManager manager) 
			{
				return new RenderM1Abrams(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM4.class, new IRenderFactory<EntityM4>()
		{
			@Override
			public Render<? super EntityM4> createRenderFor(RenderManager manager) 
			{
				return new RenderM4(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM4A1.class, new IRenderFactory<EntityM4A1>()
		{
			@Override
			public Render<? super EntityM4A1> createRenderFor(RenderManager manager) 
			{
				return new RenderM4A1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM4A3.class, new IRenderFactory<EntityM4A3>()
		{
			@Override
			public Render<? super EntityM4A3> createRenderFor(RenderManager manager) 
			{
				return new RenderM4A3(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM60A1.class, new IRenderFactory<EntityM60A1>()
		{
			@Override
			public Render<? super EntityM60A1> createRenderFor(RenderManager manager) 
			{
				return new RenderM60A1(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMaus.class, new IRenderFactory<EntityMaus>()
		{
			@Override
			public Render<? super EntityMaus> createRenderFor(RenderManager manager) 
			{
				return new RenderMaus(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityML20.class, new IRenderFactory<EntityML20>()
		{
			@Override
			public Render<? super EntityML20> createRenderFor(RenderManager manager) 
			{
				return new RenderML20(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPantherG.class, new IRenderFactory<EntityPantherG>()
		{
			@Override
			public Render<? super EntityPantherG> createRenderFor(RenderManager manager) 
			{
				return new RenderPantherG(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzer.class, new IRenderFactory<EntityPanzer>()
		{
			@Override
			public Render<? super EntityPanzer> createRenderFor(RenderManager manager) 
			{
				return new RenderPanzer(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerI.class, new IRenderFactory<EntityPanzerI>()
		{
			@Override
			public Render<? super EntityPanzerI> createRenderFor(RenderManager manager) 
			{
				return new RenderPanzerI(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPanzerIV.class, new IRenderFactory<EntityPanzerIV>()
		{
			@Override
			public Render<? super EntityPanzerIV> createRenderFor(RenderManager manager) 
			{
				return new RenderPanzerIV(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw2.class, new IRenderFactory<EntityPzkpfw2>()
		{
			@Override
			public Render<? super EntityPzkpfw2> createRenderFor(RenderManager manager) 
			{
				return new RenderPzkpfw2(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPzkpfw3.class, new IRenderFactory<EntityPzkpfw3>()
		{
			@Override
			public Render<? super EntityPzkpfw3> createRenderFor(RenderManager manager) 
			{
				return new RenderPzkpfw3(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRenaultFT17.class, new IRenderFactory<EntityRenaultFT17>()
		{
			@Override
			public Render<? super EntityRenaultFT17> createRenderFor(RenderManager manager) 
			{
				return new RenderRenaultFT17(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySdKfz251D.class, new IRenderFactory<EntitySdKfz251D>()
		{
			@Override
			public Render<? super EntitySdKfz251D> createRenderFor(RenderManager manager) 
			{
				return new RenderSdKfz251D(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStug3.class, new IRenderFactory<EntityStug3>()
		{
			@Override
			public Render<? super EntityStug3> createRenderFor(RenderManager manager) 
			{
				return new RenderStug3(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStuG3G.class, new IRenderFactory<EntityStuG3G>()
		{
			@Override
			public Render<? super EntityStuG3G> createRenderFor(RenderManager manager) 
			{
				return new RenderStuG3G(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStuGIV.class, new IRenderFactory<EntityStuGIV>()
		{
			@Override
			public Render<? super EntityStuGIV> createRenderFor(RenderManager manager) 
			{
				return new RenderStuGIV(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySturmtiger.class, new IRenderFactory<EntitySturmtiger>()
		{
			@Override
			public Render<? super EntitySturmtiger> createRenderFor(RenderManager manager) 
			{
				return new RenderSturmtiger(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySU100.class, new IRenderFactory<EntitySU100>()
		{
			@Override
			public Render<? super EntitySU100> createRenderFor(RenderManager manager) 
			{
				return new RenderSU100(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySU122.class, new IRenderFactory<EntitySU122>()
		{
			@Override
			public Render<? super EntitySU122> createRenderFor(RenderManager manager) 
			{
				return new RenderSU122(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySU85.class, new IRenderFactory<EntitySU85>()
		{
			@Override
			public Render<? super EntitySU85> createRenderFor(RenderManager manager) 
			{
				return new RenderSU85(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT14Armata.class, new IRenderFactory<EntityT14Armata>()
		{
			@Override
			public Render<? super EntityT14Armata> createRenderFor(RenderManager manager) 
			{
				return new RenderT14Armata(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT34.class, new IRenderFactory<EntityT34>()
		{
			@Override
			public Render<? super EntityT34> createRenderFor(RenderManager manager) 
			{
				return new RenderT34(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT3476.class, new IRenderFactory<EntityT3476>()
		{
			@Override
			public Render<? super EntityT3476> createRenderFor(RenderManager manager) 
			{
				return new RenderT3476(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT3485.class, new IRenderFactory<EntityT3485>()
		{
			@Override
			public Render<? super EntityT3485> createRenderFor(RenderManager manager) 
			{
				return new RenderT3485(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT34_76.class, new IRenderFactory<EntityT34_76>()
		{
			@Override
			public Render<? super EntityT34_76> createRenderFor(RenderManager manager) 
			{
				return new RenderT34_76(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT34_85.class, new IRenderFactory<EntityT34_85>()
		{
			@Override
			public Render<? super EntityT34_85> createRenderFor(RenderManager manager) 
			{
				return new RenderT34_85(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT35.class, new IRenderFactory<EntityT35>()
		{
			@Override
			public Render<? super EntityT35> createRenderFor(RenderManager manager) 
			{
				return new RenderT35(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT55A.class, new IRenderFactory<EntityT55A>()
		{
			@Override
			public Render<? super EntityT55A> createRenderFor(RenderManager manager) 
			{
				return new RenderT55A(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT72A1979.class, new IRenderFactory<EntityT72A1979>()
		{
			@Override
			public Render<? super EntityT72A1979> createRenderFor(RenderManager manager) 
			{
				return new RenderT72A1979(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityT90.class, new IRenderFactory<EntityT90>()
		{
			@Override
			public Render<? super EntityT90> createRenderFor(RenderManager manager) 
			{
				return new RenderT90(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger.class, new IRenderFactory<EntityTiger>()
		{
			@Override
			public Render<? super EntityTiger> createRenderFor(RenderManager manager) 
			{
				return new RenderTiger(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger131.class, new IRenderFactory<EntityTiger131>()
		{
			@Override
			public Render<? super EntityTiger131> createRenderFor(RenderManager manager) 
			{
				return new RenderTiger131(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTiger1E.class, new IRenderFactory<EntityTiger1E>()
		{
			@Override
			public Render<? super EntityTiger1E> createRenderFor(RenderManager manager) 
			{
				return new RenderTiger1E(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerIE.class, new IRenderFactory<EntityTigerIE>()
		{
			@Override
			public Render<? super EntityTigerIE> createRenderFor(RenderManager manager) 
			{
				return new RenderTigerIE(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerII.class, new IRenderFactory<EntityTigerII>()
		{
			@Override
			public Render<? super EntityTigerII> createRenderFor(RenderManager manager) 
			{
				return new RenderTigerII(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTigerIIB.class, new IRenderFactory<EntityTigerIIB>()
		{
			@Override
			public Render<? super EntityTigerIIB> createRenderFor(RenderManager manager) 
			{
				return new RenderTigerIIB(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS.class, new IRenderFactory<EntityTKS>()
		{
			@Override
			public Render<? super EntityTKS> createRenderFor(RenderManager manager) 
			{
				return new RenderTKS(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTKS20.class, new IRenderFactory<EntityTKS20>()
		{
			@Override
			public Render<? super EntityTKS20> createRenderFor(RenderManager manager) 
			{
				return new RenderTKS20(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityType4HoRo.class, new IRenderFactory<EntityType4HoRo>()
		{
			@Override
			public Render<? super EntityType4HoRo> createRenderFor(RenderManager manager) 
			{
				return new RenderType4HoRo(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityType90KyuMaru.class, new IRenderFactory<EntityType90KyuMaru>()
		{
			@Override
			public Render<? super EntityType90KyuMaru> createRenderFor(RenderManager manager) 
			{
				return new RenderType90KyuMaru(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityType95.class, new IRenderFactory<EntityType95>()
		{
			@Override
			public Render<? super EntityType95> createRenderFor(RenderManager manager) 
			{
				return new RenderType95(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityType97.class, new IRenderFactory<EntityType97>()
		{
			@Override
			public Render<? super EntityType97> createRenderFor(RenderManager manager) 
			{
				return new RenderType97(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityZis3.class, new IRenderFactory<EntityZis3>()
		{
			@Override
			public Render<? super EntityZis3> createRenderFor(RenderManager manager) 
			{
				return new RenderZis3(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBMWR75.class, new IRenderFactory<EntityBMWR75>()
		{
			@Override
			public Render<? super EntityBMWR75> createRenderFor(RenderManager manager) 
			{
				return new RenderBMWR75(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBofors.class, new IRenderFactory<EntityBofors>()
		{
			@Override
			public Render<? super EntityBofors> createRenderFor(RenderManager manager) 
			{
				return new RenderBofors(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBwTruck.class, new IRenderFactory<EntityBwTruck>()
		{
			@Override
			public Render<? super EntityBwTruck> createRenderFor(RenderManager manager) 
			{
				return new RenderBwTruck(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlak88.class, new IRenderFactory<EntityFlak88>()
		{
			@Override
			public Render<? super EntityFlak88> createRenderFor(RenderManager manager) 
			{
				return new RenderFlak88(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlakvierling.class, new IRenderFactory<EntityFlakvierling>()
		{
			@Override
			public Render<? super EntityFlakvierling> createRenderFor(RenderManager manager) 
			{
				return new RenderFlakvierling(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGreyhound.class, new IRenderFactory<EntityGreyhound>()
		{
			@Override
			public Render<? super EntityGreyhound> createRenderFor(RenderManager manager) 
			{
				return new RenderGreyhound(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHellcat.class, new IRenderFactory<EntityHellcat>()
		{
			@Override
			public Render<? super EntityHellcat> createRenderFor(RenderManager manager) 
			{
				return new RenderHellcat(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJeep.class, new IRenderFactory<EntityJeep>()
		{
			@Override
			public Render<? super EntityJeep> createRenderFor(RenderManager manager) 
			{
				return new RenderJeep(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKubel.class, new IRenderFactory<EntityKubel>()
		{
			@Override
			public Render<? super EntityKubel> createRenderFor(RenderManager manager) 
			{
				return new RenderKubel(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard2A7.class, new IRenderFactory<EntityLeopard2A7>()
		{
			@Override
			public Render<? super EntityLeopard2A7> createRenderFor(RenderManager manager) 
			{
				return new RenderLeopard2A7(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopardIIA6.class, new IRenderFactory<EntityLeopardIIA6>()
		{
			@Override
			public Render<? super EntityLeopardIIA6> createRenderFor(RenderManager manager) 
			{
				return new RenderLeopardIIA6(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM10.class, new IRenderFactory<EntityM10>()
		{
			@Override
			public Render<? super EntityM10> createRenderFor(RenderManager manager) 
			{
				return new RenderM10(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM157MM.class, new IRenderFactory<EntityM157MM>()
		{
			@Override
			public Render<? super EntityM157MM> createRenderFor(RenderManager manager) 
			{
				return new RenderM157MM(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM3Halftrack.class, new IRenderFactory<EntityM3Halftrack>()
		{
			@Override
			public Render<? super EntityM3Halftrack> createRenderFor(RenderManager manager) 
			{
				return new RenderM3Halftrack(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM45Quad.class, new IRenderFactory<EntityM45Quad>()
		{
			@Override
			public Render<? super EntityM45Quad> createRenderFor(RenderManager manager) 
			{
				return new RenderM45Quad(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPak40.class, new IRenderFactory<EntityPak40>()
		{
			@Override
			public Render<? super EntityPak40> createRenderFor(RenderManager manager) 
			{
				return new RenderPak40(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySASJeep.class, new IRenderFactory<EntitySASJeep>()
		{
			@Override
			public Render<? super EntitySASJeep> createRenderFor(RenderManager manager) 
			{
				return new RenderSASJeep(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySentryGun.class, new IRenderFactory<EntitySentryGun>()
		{
			@Override
			public Render<? super EntitySentryGun> createRenderFor(RenderManager manager) 
			{
				return new RenderSentryGun(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySU112.class, new IRenderFactory<EntitySU112>()
		{
			@Override
			public Render<? super EntitySU112> createRenderFor(RenderManager manager) 
			{
				return new RenderSU112(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityUC2Pdr.class, new IRenderFactory<EntityUC2Pdr>()
		{
			@Override
			public Render<? super EntityUC2Pdr> createRenderFor(RenderManager manager) 
			{
				return new RenderUC2Pdr(manager);
			}
		});
	}
}
