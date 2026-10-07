# Version 8.0.3 - Ground Vehicle Path Debug

Version 8.0.3 adds an in-world navigation-path preview for NPCs using the Ground Driving controller.

## Using it

Open the NPC with the CustomNPC wand, then select:

`Movement -> Terrain... -> Ground -> Ground Driving... -> General -> Path debug: Yes`

The preview uses:

- red dust for the remaining navigation path;
- green particles for the controller's current steering/lookahead target;
- flame for the final path endpoint.

The existing once-per-second Ground Driving diagnostic log remains enabled by the same switch.

## Performance and behavior

- Path debug is disabled by default and saved per NPC.
- Particles are sent by the server, so they work in singleplayer and multiplayer.
- Rendering is client-side, but no persistent benchmark or navigation data is sent.
- The preview updates twice per second rather than every tick.
- Long routes are sampled and capped at 48 path markers per update.
- Enabling the preview does not change pathfinding, steering, targeting or movement.
- Existing `WolffGroundDebug` saved settings remain compatible.
