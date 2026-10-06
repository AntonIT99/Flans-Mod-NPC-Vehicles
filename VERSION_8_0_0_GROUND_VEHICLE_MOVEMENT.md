# Version 8.0.0 - Ground Vehicle Driving

Version 8.0.0 introduces an opt-in, server-authoritative driving controller for NPCs using the **Ground** terrain profile. It is disabled on existing NPCs by default.

## Enabling it

Open the NPC movement editor and select:

`Movement -> Terrain... -> Ground -> Ground Driving...`

Set **Driving Controller** to **Yes**, or select a non-Custom preset. Presets populate editable values; they do not lock them.

## Included behavior

- Forward/reverse movement along the hull heading instead of NPC strafing.
- Smoothed steering and body yaw.
- Minimum turn radius and speed-dependent widening of turns.
- Acceleration, braking and coasting rather than instant speed changes.
- Path lookahead, straight-node combining and obstruction-safe corner smoothing.
- Predictive slowdown for current and upcoming corners.
- Configurable stop distance.
- Short-distance reversing when a path target is behind the vehicle.
- Simplified reverse-and-retry recovery when blocked or stuck.
- Wheeled, Tracked and Heavy Tracked modes.
- Low-speed pivot turns for tracked vehicles when explicitly enabled.
- Staggered lightweight separation/follow-speed checks for nearby Ground vehicles.
- Optional once-per-second server debug logging.

Presets are provided for Car, Truck, Bus, Light Tank, Heavy Tank and APC.

## Compatibility and isolation

- Legacy, Watercraft and Amphibious profiles are unchanged.
- Ground NPCs keep their previous behavior until **Driving Controller** is enabled.
- CustomNPC targeting, path creation and terrain rules remain authoritative; the controller only converts an existing path into vehicle-like steering and speed.
- Turret/head aiming remains independent from hull steering.
- No Flan's Mod class is modified and no Flan vehicle physics are replaced.
- No new packets are used. Vanilla entity synchronization carries server position and yaw.
- Existing saves remain valid. Missing NBT keys use disabled/default values.

## New classes

- `GroundVehicleController`
- `GroundVehicleState`
- `GroundVehiclePreset`
- `GroundVehicleType`
- `VehicleSteeringController`
- `VehiclePathFollower`
- `SubGuiGroundVehicleSettings`
- `MixinEntityMoveHelperGroundVehicle`

## Modified classes

- `IMixinDataAI` exposes the saved settings.
- `MixinDataAI` reads/writes the new Wolff NBT fields.
- `SubGuiVehicleMobility` opens the Ground Driving submenu.
- `MixinEntityNPCInterface` runs the controller after normal grounded movement and keeps the old handling for all other profiles.
- `wolffsmod.mixins.json` registers the move-helper hook.

## Runtime hook

The vanilla `EntityMoveHelper.onUpdateMoveHelper` rotation is cancelled only for an enabled Ground driving NPC. This prevents the normal mob controller from snapping the hull toward individual path nodes. Vertical jump requests for reachable one-block path changes are preserved. The dedicated controller then updates horizontal motion and heading on the server.

## Deliberately deferred

Individual wheel steering animation, route-history convoys, explicit slope-angle path costs, and world-space debug lines are not included in this first controller release. Those require renderer or pathfinder expansion and should be added after the core steering behavior is validated in real vehicle scenes.

## Recommended testing

Test each preset on straight roads, 45/90-degree turns, S-curves, dead ends and one-block terrain changes. Also test two or more vehicles following the same target. Keep 7.1.0 available as the rollback build while tuning presets.
