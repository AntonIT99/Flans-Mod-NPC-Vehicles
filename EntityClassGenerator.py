import os
from pathlib import Path

planes_folder = "planes"
vehicles_folder = "vehicles"


class Config:
    def __init__(self):
        self.turn_speed = 1
        self.driver = ""
        self.rotated_offset = ""
        self.driver_aim_speed = ""
        self.driver_gun_origin = ""
        self.passenger = []
        self.passenger_aim_speed = []
        self.vehicle_gun_model_scale = 1
        self.shoot_point_primary = []
        self.shoot_point_secondary = []
        self.bomb_position = []
        self.barrel_position = []
        self.guns = []
        self.guns_origin = []
        self.shoot_particles_primary = []
        self.shoot_particles_secondary = []
        self.left_link_point = []
        self.right_link_point = []
        self.rotate_wheels = True
        self.track_link_length = 0
        self.fix_track_link = 5
        self.turret_origin = ""
        self.model_name = ""
        self.model_prefix = ""
        self.model_scale = 1
        self.full_name = ""


def read_config(file_path) -> Config:
    config = Config()
    line_tracker = "0"
    try:
        with open(file_path, 'r', encoding="utf-8") as file:
            for line in file:
                line_tracker = line
                if "//" in line:
                    continue
                split = line.split(' ', 1)
                if len(split) <= 1:
                    continue
                param = split[0]
                data = split[1].strip()
                if "TurnLeftSpeed" in param or "TurnRightSpeed" in param:
                    config.turn_speed = float(data)
                if ("Driver" == param or "Pilot" == param) and "YawBeforePitch" not in data:
                    config.driver = data
                if "RotatedDriverOffset" in param:
                    config.rotated_offset = data
                if "DriverAimSpeed" in param:
                    config.driver_aim_speed = data
                if "DriverGunOrigin" in param:
                    config.driver_gun_origin = data
                if "Passenger" == param:
                    config.passenger.append(data)
                if "PassengerAimSpeed" in param:
                    config.passenger_aim_speed.append(data)
                if "VehicleGunModelScale" in param:
                    config.vehicle_gun_model_scale = float(data)
                if "ShootPointPrimary" in param:
                    config.shoot_point_primary.append(data)
                if "ShootPointSecondary" in param:
                    config.shoot_point_secondary.append(data)
                if "BombPosition" in param:
                    config.bomb_position.append(data)
                if "BarrelPosition" in param:
                    config.barrel_position.append(data)
                if "AddGun" == param:
                    config.guns.append(data)
                if "GunOrigin" == param:
                    config.guns_origin.append(data)
                if "ShootParticlesPrimary" in param:
                    config.shoot_particles_primary.append(data)
                if "ShootParticlesSecondary" in param:
                    config.shoot_particles_secondary.append(data)
                if "LeftLinkPoint" in param:
                    config.left_link_point.append(data)
                if "RightLinkPoint" in param:
                    config.right_link_point.append(data)
                if "RotateWheels" in param:
                    config.rotate_wheels = False if "false" in data.lower() else True
                if "TrackLinkLength" in param:
                    config.track_link_length = float(data)
                if "FixTrackLink" in param:
                    config.fix_track_link = int(data)
                if "TurretOrigin" in param:
                    config.turret_origin = data
                if "ModelScale" == param:
                    config.model_scale = float(data)
                if "Model" == param:
                    model = data.split(".")
                    if len(model) > 1:
                        config.model_prefix = model[0].lower()
                        config.model_name = model[1]
                    else:
                        config.model_name = model[0]
                if "Name" == param:
                    config.full_name = data
    except:
        print("Errored reading file " + file_path + " at line: " + line_tracker)
    return config


def get_config_code(config: Config) -> str:
    new_line = "\n        "
    code = ""
    if config.turn_speed != 1:
        code += "setTurnSpeed(" + str(config.turn_speed) + "F);" + new_line
    if config.driver:
        code += "setDriver(\"" + config.driver + "\");" + new_line
    if config.rotated_offset:
        code += "setRotatedDriverOffset(\"" + config.rotated_offset + "\");" + new_line
    if config.driver_aim_speed:
        code += "setDriverAimSpeed(\"" + config.driver_aim_speed + "\");" + new_line
    if config.driver_gun_origin:
        code += "addDriverGunOrigin(\"" + config.driver_gun_origin + "\");" + new_line
    for i in config.passenger:
        code += "setPassenger(\"" + i + "\");" + new_line
    for i in config.passenger_aim_speed:
        code += "setPassengerAimSpeed(\"" + i + "\");" + new_line
    if config.vehicle_gun_model_scale != 1:
        code += "setVehicleGunModelScale(" + str(config.vehicle_gun_model_scale) + "F);" + new_line
    for i in config.shoot_point_primary:
        code += "addShootPointPrimary(\"" + i + "\");" + new_line
    for i in config.shoot_point_secondary:
        code += "addShootPointSecondary(\"" + i + "\");" + new_line
    for i in config.bomb_position:
        code += "addBombPosition(\"" + i + "\");" + new_line
    for i in config.barrel_position:
        code += "addBarrelPosition(\"" + i + "\");" + new_line
    for i in config.guns:
        code += "addGun(\"" + i + "\");" + new_line
    for i in config.guns_origin:
        code += "addGunOrigin(\"" + i + "\");" + new_line
    for i in config.shoot_particles_primary:
        code += "addShootParticlesPrimary(\"" + i + "\");" + new_line
    for i in config.shoot_particles_secondary:
        code += "addShootParticlesSecondary(\"" + i + "\");" + new_line
    for i in config.left_link_point:
        code += "addLeftLinkPoint(\"" + i + "\");" + new_line
    for i in config.right_link_point:
        code += "addRightLinkPoint(\"" + i + "\");" + new_line
    if not config.rotate_wheels:
        code += "setRotateWheels(false);" + new_line
    if config.track_link_length != 0:
        code += "setTrackLinkLength(" + str(config.track_link_length) + "F);" + new_line
    if config.fix_track_link != 5:
        code += "setFixTrackLink(" + str(config.fix_track_link) + ");" + new_line
    if config.turret_origin:
        code += "setTurretOrigin(\"" + config.turret_origin + "\");" + new_line
    return code


def create_java_class(name, package, is_plane, config_code):
    extended_class = "EntityFlanPlaneNPC" if is_plane else "EntityFlanVehicleNPC"
    java_code = f"""package com.wolffsmod.entity.{package};

import com.wolffsmod.entity.{extended_class};

import net.minecraft.world.World;

public class {name} extends {extended_class}
{{
    public {name}(World w)
    {{
        super(w);
        setSize(3.5F, 2.5F);
    }}

    @Override
    public void setupConfig()
    {{
        {config_code}
    }}
}}
"""
    if not os.path.exists(package):
        os.makedirs(package)
    with open(os.path.join(package, class_name + ".java"), "w", encoding = "utf-8") as f:
        f.write(java_code)


def create_rendering_and_registry_list(configs: dict):
    with open(os.path.join(".", "ClientProxy.txt"), "w", encoding = "utf-8") as f:
        for prefix_and_name in sorted(configs.keys()):
            scaling = f".scale({configs[prefix_and_name].model_scale}F)" if configs[prefix_and_name].model_scale != 1 else ""
            f.write(f"RenderingRegistry.registerEntityRenderingHandler(com.wolffsmod.entity.{prefix_and_name}.class, new RenderFlansModEntity(new com.wolffsmod.model.{configs[prefix_and_name].model_prefix}.Model{configs[prefix_and_name].model_name}()){scaling});\n")

    with open(os.path.join(".", "EntityRegistry.txt"), "w", encoding = "utf-8") as f:
        for prefix_and_name in sorted(configs.keys()):
            f.write(f"createEntity(com.wolffsmod.entity.{prefix_and_name}.class, \"{configs[prefix_and_name].full_name}\");\n")


entity_configs = {}

planes_path = Path(planes_folder)
if planes_path.exists() and planes_path.is_dir():
    for file_name in os.listdir(planes_folder):
        if file_name.endswith(".txt"):
            class_name = "Entity" + os.path.splitext(file_name)[0].replace("-", "").replace(" ", "")
            config = read_config(os.path.join(planes_folder, file_name))
            entity_configs[config.model_prefix + "." + class_name] = config
            create_java_class(class_name, config.model_prefix, True, get_config_code(config))

vehicles_path = Path(vehicles_folder)
if vehicles_path.exists() and vehicles_path.is_dir():
    for file_name in os.listdir(vehicles_folder):
        if file_name.endswith(".txt"):
            class_name = "Entity" + os.path.splitext(file_name)[0].replace("-", "").replace(" ", "")
            config = read_config(os.path.join(vehicles_folder, file_name))
            entity_configs[config.model_prefix + "." + class_name] = config
            create_java_class(class_name, config.model_prefix, False, get_config_code(config))

create_rendering_and_registry_list(entity_configs)
