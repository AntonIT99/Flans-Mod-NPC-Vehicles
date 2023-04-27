package com.wolffsmod;

import com.wolffsmod.entity.*;
import com.wolffsmod.entity.monolith.EntityKimJongSub;
import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.entity.Entity;


public class ModEntityRegistry {
	private ModEntityRegistry() {}

	private static int EntityID = 0;

	public static void registerEntities()
	{
		//WW2 Official Pack
		createEntity(com.wolffsmod.entity.official.ww2.Entity105leFH18B2.class, "105mm leFH 18 B2 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityB1.class, "Renault Char B1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBF109.class, "Messerschmitt Bf 109 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBMWR75.class, "BMW R 75 Gespann (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityBofors.class, "40mm Bofors (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCamel.class, "Sopwith Camel (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChaffee.class, "M24 Chaffee (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChiHa.class, "Type 97 Chi-Ha (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChiNu.class, "Type 3 Chi-Nu (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityChurchill.class, "Churchill Mk VII (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCromwell.class, "Cromwell (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityCrusader.class, "Cruiser Mk. VI Crusader (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFlak88.class, "88mm Flak 36 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFokker.class, "Fokker Dr.I (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityFury.class, "M4A3E8 Sherman Fury (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityGreyhound.class, "M8 Greyhound (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityHellcat.class, "M18 Hellcat (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityIS2.class, "IS-2 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityJeep.class, "M38 Willys Jeep (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityKubel.class, "VW Type 82 Kubelwagen (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityKV1.class, "KV-1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityLancaster.class, "Avro Lancaster (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityLuchs.class, "Panzer II Ausf. L Luchs (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM3Halftrack.class, "M3 Halftrack (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM10.class, "M10 Wolverine (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM45QuadMount.class, "M45 Quadmount (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityM157mm.class, "57mm M1 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityMustang.class, "North American P-51 Mustang (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityPak40.class, "75mm PaK 40 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityPanzerIV.class, "Panzer IV Ausf. H (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityS100.class, "S-100 Schnellboot (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySASJeep.class, "SAS Jeep (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz2.class, "SdKfz 2 Kettenkrad (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz222.class, "SdKfz 222 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySdkFz251.class, "SdKfz 251 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySherman.class, "M4A3E8 Sherman Easy Eight (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySpitfire.class, "Supermarine Spitfire (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityStuG.class, "StuG IV (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntitySU112.class, "SU-1-12 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityT3476.class, "T-34/76 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityT3485.class, "T-34/85 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTiger.class, "Panzer VI Tiger (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTiger131.class, "Panzer VI Tiger 131 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityTigerII.class, "Panzer VI Tiger II (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityType4HoRo.class, "Type 4 Ho-Ro (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityUC2Pdr.class, "Universal Carrier 2Pdr (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityYak9.class, "Yakovlev Yak-9 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.ww2.EntityZero.class, "Mitsubishi A6M Zero (Official Pack)");

		//WW2 Official Pack Legacy
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityBF109.class, "Messerschmitt Bf 109 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityBofors.class, "40mm Bofors (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityFlakvierling.class, "20mm Flakvierling 38 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityJeep.class, "M38 Willys Jeep (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityKubel.class, "VW Type 82 Kubelwagen (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityM4Sherman.class, "M4 Sherman (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityM157mm.class, "57mm M1 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityMustang.class, "North American P-51 Mustang (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPak40.class, "75mm PaK 40 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIIL.class, "Panzer II Ausf. L Luchs (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIV.class, "Panzer IV Ausf. H (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzerIVOld.class, "Panzer IV (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityPanzer.class, "Panzer (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntitySherman.class, "Sherman (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityYak9.class, "Yakovlev Yak-9 (Official Pack Legacy)");
		createEntity(com.wolffsmod.entity.official.ww2.legacy.EntityZero.class, "Mitsubishi A6M Zero (Official Pack Legacy)");

		//Ye Olde Official Pack
		createEntity(com.wolffsmod.entity.official.yeolde.EntityBiplane.class, "Biplane (Official Pack)");
		createEntity(com.wolffsmod.entity.official.yeolde.EntityTwoSeatBiplane.class, "Two Seat Biplane (Official Pack)");

		//World at War Pack
		createEntity(com.wolffsmod.entity.waw.EntityB24.class, "Consolidated B-24 Liberator (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityB71.class, "Avia B-71 (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityBlackPrince.class, "Black Prince (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityC202.class, "Macchi C.202 Folgore (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityCarro.class, "Carro Armato M15 (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityDo17.class, "Dornier Do 17 (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityFokker.class, "Fokker Dr.I (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityLA7.class, "Lavochkin La-7 (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityLusac.class, "LUSAC-11 (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityRenault.class, "AMC-35 Renault (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntitySopwith.class, "Sopwith Camel (World at War Pack)");
		createEntity(com.wolffsmod.entity.waw.EntityType4.class, "Type 4 Chi-To (World at War Pack)");

		//Modern Warfare Official Pack
		createEntity(com.wolffsmod.entity.official.mw.EntityA10.class, "Fairchild Republic A-10 Thunderbolt II (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityAbrams.class, "M1A2 Abrams (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityApache.class, "Boeing AH-64D Apache (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityB52.class, "Boeing B-52 Stratofortress (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityBlackHawk.class, "UH-60 Black Hawk (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityChallyIISimple.class, "FV4034 Challenger 2 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityChinook.class, "Boeing CH-47 Chinook (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityCobra.class, "Bell AH-1 Cobra (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityF22.class, "Lockheed Martin F-22 Raptor (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityHind.class, "Mil Mi-24 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityHumvee.class, "HMMWV Humvee (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityLeopard2A6.class, "Leopard 2 A6 (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityLittleBird.class, "MH-6 Little Bird (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityMIM23.class, "MIM-23 HAWK (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntitySentryGun.class, "Sentry Gun (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntitySU25.class, "Sukhoi Su-25 Grach (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityT90.class, "T-90MS (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityTiger.class, "Eurocopter EC665 Tiger (Official Pack)");
		createEntity(com.wolffsmod.entity.official.mw.EntityTornado.class, "Panavia Tornado GR4 (Official Pack)");

		//Utility Pack
		createEntity(com.wolffsmod.entity.official.utility.EntityTunnelBore.class, "Tunnel Bore (Utility Pack)");

		//Wolff's Pack
		createEntity(com.wolffsmod.entity.wolff.EntityPanzerIVJ.class, "Panzer IV Ausf. J (Wolff's Pack)");
		createEntity(com.wolffsmod.entity.wolff.EntitySdKfz251D.class, "SdKfz 251 Ausf. D (Wolff's Pack)");
		createEntity(com.wolffsmod.entity.wolff.EntitySdKfz251DManned.class, "SdKfz 251 Ausf. D - Manned (Wolff's Pack)");

		//Kikkoceccato
		createEntity(com.wolffsmod.entity.kikkoceccato.EntityPanzerI.class, "Panzer I Ausf. A (Kikkoceccato)");
		createEntity(com.wolffsmod.entity.kikkoceccato.EntitySkwI.class, "Sanitaetskraftwagen I Ausf. A (Kikkoceccato)");

		//Manus WW2 Pack
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_1A.class, "20mm Flakvierling 38 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_2A.class, "20mm Flakvierling 38 without shield (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_3A.class, "20mm Flakvierling 38 - Manned (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak20mmVierling_4A.class, "20mm Flakvierling 38 without shield - Manned (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_1A.class, "88mm Flak 36 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_2A.class, "88mm Flak 36 Anti tank (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_3A.class, "88mm Flak 36 Anti tank - cover East/West (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_AAGun_Flak88_4A.class, "88mm Flak 36 Anti tank - cover North/South (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_A6M_1A.class, "Mitsubishi A6M Zero (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Arado196_1A.class, "Arado Ar 196 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_B17G_1A.class, "Boeing B-17G Flying Fortress (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Bf109E_1A.class, "Messerschmitt Bf 109 E-3 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_1A.class, "F4U-4 Corsair VMF-214 Black Sheep (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_F4U_2A.class, "F4U-4 Corsair VBF-10 The Twilight Warriors (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Fw190_1A.class, "Focke-Wulf Fw 190 A-4 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_HE111_1A.class, "Heinkel He 111 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Hurricane_1A.class, "Hawker Hurricane (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_1A.class, "Ilyushin Il-2 - Missiles (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2_3A.class, "Ilyushin Il-2 - Bombs (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_1A.class, "Ilyushin Il-2M - Missiles (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_3A.class, "Ilyushin Il-2M - Bombs (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_4A.class, "Ilyushin Il-2M 6. GvShAP - Missiles (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_IL2M_6A.class, "Ilyushin Il-2M 6. GvShAP - Bombs  (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_1A.class, "Junker Ju 87 Stuka (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_JU87_2A.class, "Junker Ju 87 Kanonenvogel (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_ME262A_1A.class, "Messerschmitt Me 262A Schwalbe (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P38_1A.class, "P-38 Lightning (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_P51_1A.class, "North American P-51 Mustang (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_Spitfire_1A.class, "Supermarine Spitfire (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_SpitFireMkVB_1A.class, "Supermarine Spitfire Mk VB (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1A.class, "Yakovlev Yak-3 (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Plane_YAK3_1Aneu.class, "Yakovlev Yak-3 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_FlakpanzerIV_1A.class, "Flakpanzer IV Wirbelwind (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_1A.class, "GMC Truck (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_GMCTruck_2A.class, "GMC Truck open Back (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_HigginsBoat_1A.class, "LCVP 2 Higgins Boat (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdpanther_1A.class, "Jagdpanzer V Jagdpanther (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_JagdpanzerIV_1A.class, "Jagdpanzer IV/70 Guderian Ente (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Jagdtiger_1A.class, "Jagdpanzer VI Jagdtiger (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_1A.class, "M4A1 Sherman (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A1_2A.class, "M4A1 Sherman with T-34 Calliope (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_M4A3_1A.class, "M4A3 Sherman (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_1A.class, "Opel Blitz (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_OpelBlitz_2A.class, "Opel Blitz Afrikakorps (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_Panther_1A.class, "Panzer V Panther Ausf. G (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerhaubitzeHummel_1A.class, "Panzerhaubitze Hummel (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_1A.class, "Panzer IV Ausf. G (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_PanzerIV_2A.class, "Panzer IV Ausf. H (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_RenaultFT17_1A.class, "Renault FT-17 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU85_1A.class, "SU-85 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU100_1A.class, "SU-100 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_SU122_1A.class, "SU-122 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_1A.class, "T-34/76 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_T34_2A.class, "T-34/85 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerI_1A.class, "Panzer VI Tiger Ausf. E (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_TigerII_1A.class, "Panzer VI Tiger II Ausf. B (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_VWType82_1A.class, "VW Type 82 Kubelwagen (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.ww2.EntityWW2_Vehicle_WillyJeep_1A.class, "M38 Willys Jeep (Manus Pack)");

		//Manus WW2 Pack Legacy
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityM4.class, "M4 Sherman (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityME109.class, "Messerschmitt Bf 109 (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityME262.class, "Messerschmitt Me 262 (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4G.class, "Panzer IV Ausf. G (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityPanzer4H.class, "Panzer IV Ausf. H (Manus Pack Legacy)");
		createEntity(com.wolffsmod.entity.manus.ww2.legacy.EntityT34.class, "T-34/85 (Manus Pack Legacy)");

		//Manus Modern Warfare Pack
		createEntity(com.wolffsmod.entity.manus.mw.EntityA10.class, "Fairchild Republic A-10 Thunderbolt II (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityAC130A.class, "Lockheed AC-130A Spectre (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityAH1Z.class, "Bell AH-1Z Viper (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer1.class, "GTK Boxer (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer2.class, "GTK Boxer with HK Grenade Machine Gun (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer3.class, "GTK Boxer with Cal. 50 Gun (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer4.class, "GTK Boxer with with 20mm Cannon (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBoxer5.class, "GTK Boxer with Skyranger AD (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityBwTruck.class, "German Bundeswehr Truck (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityC130H.class, "Lockheed C-130H Hercules (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityE3D.class, "Boeing E-3D Sentry (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityF22.class, "Lockheed Martin F-22 Raptor (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV1.class, "M998 HMMWV (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV2.class, "M998 HMMWV with open load area (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV3.class, "M998 HMMWV with Cal. 50 Gun (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityHMMWV4.class, "M998 HMMWV with M134 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityLeopard2A6.class, "Leopard 2 A6 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityLeopard2A7.class, "Leopard 2 A7+ PSO (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityMIG15.class, "Mikoyan-Gurevich MiG 15 (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntitySkyshield.class, "35mm Oerlikon Skyshield (Manus Pack)");
		createEntity(com.wolffsmod.entity.manus.mw.EntityTU22M.class, "Tupolev Tu-22M (Manus Pack)");

		//Extra Zero 8
		createEntity(com.wolffsmod.entity.ez8.Entity2B9Vasilek.class, "82mm 2B9 Vasilek (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.Entity38t.class, "Panzer 38(t) (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityA39Tortoise.class, "A39 Tortoise (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityAH1G.class, "Bell AH-1G Cobra (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBM21.class, "BM-21 Grad (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBMD1.class, "BMD-1 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBMD2.class, "BMD-1 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBMP1.class, "BMP-1 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBMP2.class, "BMP-2 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBTR80.class, "BTR-80 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBTRRD.class, "BTR-RD Robot (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityBTRZD.class, "BTR-ZD Skrezhet (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityDzhighit.class, "Dzhighit (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityJagdpanzer38t.class, "Jagdpanzer 38(t) Hetzer (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityLeopard1A1.class, "Leopard 1 A1 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityLVT2.class, "LVT-2 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityLVTA1.class, "LVT(A)-1 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityM1.class, "M1 Abrams (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityM48A3.class, "M48A3 Patton (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityM551.class, "M551 Sheridan (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityMi24P.class, "Mil Mi-24P (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityML20.class, "152mm ML-20 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityPz2.class, "Panzer II Ausf. F (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityPz3.class, "Panzer III Ausf. N (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityPz6.class, "Panzer VI Tiger Ausf. E (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityPz8.class, "Panzer VIII Maus (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityStug3.class, "StuG III Ausf. F (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntitySturmtiger.class, "Sturmpanzer VI Sturmtiger (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityT35.class, "T-35 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityT62.class, "T-62 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityT62MV.class, "T-62MV (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityT64A.class, "T-64A (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityTKS.class, "TKS MG (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityTKS20mm.class, "TKS 20mm (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityType95HaGo.class, "Type 95 Ha-Go (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityType97ChiHa.class, "Type 97 Chi-Ha (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityUH1B.class, "Bell UH-1B Iroquois (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityUH1C.class, "Bell UH-1C Iroquois (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityUral4320.class, "Ural-4320 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityZiS3.class, "76.2mm ZiS-3 (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityZSU234.class, "ZSU-23-4 Shilka (Extra Zero 8)");
		createEntity(com.wolffsmod.entity.ez8.EntityZU232.class, "23mm ZU-23-2 (Extra Zero 8)");

		//Lizard
		createEntity(com.wolffsmod.entity.lizard.EntityM113A1.class, "M113A1 (Lizard)");
		createEntity(com.wolffsmod.entity.lizard.EntityM113A3.class, "M113A3 (Lizard)");
		createEntity(com.wolffsmod.entity.lizard.EntityM41.class, "M41 Walker Bulldog (Lizard)");
		createEntity(com.wolffsmod.entity.lizard.EntityT55A.class, "T-55A (Lizard)");
		createEntity(com.wolffsmod.entity.lizard.EntityT72A.class, "T-72A 1979 (Lizard)");

		//Tankcraft
		createEntity(com.wolffsmod.entity.tankcraft.EntityM60A1.class, "M60A1 Patton RISE 1975 (Tankcraft)");

		//TaP & Monolith Pack
		createEntity(com.wolffsmod.entity.monolith.EntityA7V.class, "A7V (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityK2BlackPanther.class, "K2 Black Panther (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityKimJongSub.class, "Type 033 Class Submarine (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityRomeoSub.class, "Project 633 Class Submarine (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntitySlava.class, "Project 1164 Atlant Slava Class Cruiser (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityT14Armata.class, "T-14 Armata (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityT26.class, "T-26 1933 (TaP)");
		createEntity(com.wolffsmod.entity.monolith.EntityType90.class, "Type 90 Kyu-maru (TaP)");

		//Other TaP
		createEntity(com.wolffsmod.entity.baf.EntityHurricane.class, "Hawker Hurricane Mk.I (TaP)");
		createEntity(com.wolffsmod.entity.newage.EntityBF109E3.class, "Messerschmitt Bf 109 E-3 (TaP)");
		createEntity(com.wolffsmod.entity.newage.EntityHurricaneMk2c.class, "Hawker Hurricane Mk.II C (TaP)");
		createEntity(com.wolffsmod.entity.newage.EntityHurricaneMk2d.class, "Hawker Hurricane Mk.II D (TaP)");
		createEntity(com.wolffsmod.entity.newage.EntityMirageF1.class, "Dassault Mirage F1 (TaP)");

		//Price additions
		createEntity(com.wolffsmod.entity.price.EntityMCOMStation.class, "MCOM Station (Price)");
		createEntity(com.wolffsmod.entity.price.EntityMilitaryCrate.class, "Military Crate (Somberfob)");
		createEntity(com.wolffsmod.entity.price.EntityRadioStation.class, "Radio Station (Price)");
		createEntity(com.wolffsmod.entity.price.EntityRadioStationSmall.class, "Radio Station Small (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySandBags1.class, "SandBags (low res) (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySandBags2.class, "SandBags (high res) (Price)");
		createEntity(com.wolffsmod.entity.price.EntitySupplies.class, "Supplies (Price)");

		createEntity(EntityEurocopterTigerHAP.class, "EurocopterTigerHAP");
		createEntity(EntityPak43.class, "Pak-43");
		createEntity(EntitySoDa.class, "So-Da");
		createEntity(EntityTeKe.class, "Te-Ke");
		createEntity(EntityTKlate.class, "TKlate");
		createEntity(EntityBF109G10.class, "BF-109 G10");
		createEntity(EntityOccupier.class, "Occupier");
		createEntity(EntityP51D.class, "P-51D");
		createEntity(EntityJihadBMP1.class, "Jihad BMP-1D");

		//Warfare 44
		createEntity(com.wolffsmod.entity.w44.EntityPanzerIVF1.class, "Panzer IV Ausf. F1 (Warfare 44)");
		createEntity(com.wolffsmod.entity.w44.EntityJu87D3.class, "Junker Ju 87 D-3 (Warfare 44)");
		createEntity(com.wolffsmod.entity.w44.EntityStuG3G.class, "StuG III Ausf. G (Warfare 44)");
		createEntity(com.wolffsmod.entity.w44.EntityTiger1H.class, "Panzer VI Tiger Ausf. H (Warfare 44)");

		//Exufo's cop cars
		createEntity(com.wolffsmod.entity.exufo.EntityCopvic.class, "Ford Crown Victoria Police (brlanyangxdd)");
		createEntity(com.wolffsmod.entity.exufo.EntityCV.class, "Ford Crown Victoria (brlanyangxdd)");

		//Prototype
		createEntity(com.wolffsmod.entity.prototype.EntityRatte.class, "Landkreuzer P.1000 Ratte (Prototype)");
	}

	public static void createEntity(Class<? extends Entity> entityClass, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, EntityID++, WolffNPCMod.INSTANCE, 64, 1, true);
	}
}