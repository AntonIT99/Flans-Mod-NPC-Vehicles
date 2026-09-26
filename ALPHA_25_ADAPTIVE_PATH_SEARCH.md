# Alpha 25 - Adaptive Ground Path Search

Alpha 25 builds on Alpha 24. Alpha 24 remains the rollback build.

## Why

The `alpha23compat` server benchmark recorded nearby destinations only 1-7 blocks away expanding 90,000-167,000 nodes. Individual searches took 150-426 ms because every request received the full 256-block navigation allowance, even when the destination was adjacent and vertically unreachable.

## Change

Ground path searches now use a destination-relative search sphere:

`effective radius = min(configured navigation allowance, max(minimum radius, destination distance + detour margin))`

Defaults:

- Minimum radius: 32 blocks
- Detour margin: 24 blocks
- Maximum remains the configured `NPCNavigationRange` (up to 512 in this build)

Examples with `NPCNavigationRange=256`:

- Target 5 blocks away -> search radius 32
- Target 40 blocks away -> search radius 64
- Target 100 blocks away -> search radius 124
- Target 240 blocks away -> search radius 256

This does not reduce combat detection range or the distance at which an NPC can navigate. A distant target still receives enough radius to include the NPC's starting point. Nearby unreachable targets can no longer make one search explore the entire configured world-scale radius.

## Configuration

Under `NPC Path Performance`:

- `Use adaptive NPC path search radius=true`
- `Minimum NPC path search radius=32` (allowed 8-256)
- `NPC path search detour margin=24` (allowed 4-256)

Set `Use adaptive NPC path search radius=false` and restart for exact legacy search-radius behavior.

## Scope

- Server-side CustomNPC ground pathfinder only.
- Applies to humanoids and Wolff vehicle NPCs.
- Flying pathfinding is unchanged.
- The configured navigation/combat/view distances are unchanged.
- No retry delay, route cache, asynchronous pathfinding, or AI task changes were added.
- Alpha 24 movement-facing, Alpha 23 terrain profiles, aiming, firing, and rendering remain included.

## Verification

The pure policy test passed all local, distant, disabled, and invalid-input cases. The full Minecraft 1.7.10 / Java 8 offline Gradle build completed successfully with only the eight existing overwrite warnings.

Repeat the same 120-second server benchmark. The report now records the adaptive settings and reports the effective radius in slow-path entries. For the earlier 1-7 block rifleman searches, expect `range=32.0`, far fewer dequeued nodes, fewer ticks over 50 ms, and much lower P99/worst server work. Also verify obstacle detours, stairs, hills, doors, tactical variants, long-range pursuit, and returning to a distant home position.
