# Alpha 28 - One-Shot Inventory Stat Imports

The four Inventory-tab toggles are now explicit one-shot import controls.

## New rule

- Switching Melee, Ranged, Armor, or Vehicle from No to Yes imports that
  category's equipment-derived stats once.
- Leaving a toggle on Yes does not continuously synchronize or reset stats.
- Changing equipment, spawning, loading, saving, or reopening the NPC GUI does
  not re-import stats.
- After importing, the normal CustomNPC Stats GUI is authoritative.
- To intentionally restore the current equipment defaults, switch the category
  to No and then back to Yes.

The existing four NBT booleans are preserved. There is no save-format migration
and existing NPCs keep their displayed toggle states. An existing NPC whose
toggle is already Yes will not import again until it is deliberately cycled to
No and back to Yes.

## Runtime consistency

Ranged Flan firing now uses the NPC's editable projectile damage, speed,
accuracy, shot count, and fire sound. Vehicle/AA firing likewise uses the
editable NPC projectile values after the Vehicle button performs its one-time
import. The Alpha 27 ballistic solver uses the same editable projectile speed as
the launched bullet, so manually changing speed cannot desynchronize aim from
the projectile.

The Vehicle Yes state still enables the non-stat vehicle integration that needs
to remain active, including the Wolff vehicle representation and appropriate
vehicle sound/animation behavior. This change only removes repeated stat
overwrites and firing-time stat substitution.

Vehicle and AA imports now include the selected Flan projectile's speed
multiplier in the imported projectile speed. Changing the ammunition later does
not silently change the stat; cycle Vehicle No -> Yes when a fresh import is
wanted.

## Recommended test

For each of Melee, Ranged, Armor, and Vehicle:

1. Set the toggle to No, then Yes, and record the imported values.
2. Edit relevant values in the normal Stats tab and save.
3. Reopen the NPC, spawn it, reload the world, and restart the server/client.
4. Confirm the custom values remain unchanged.
5. For Ranged and Vehicle, confirm custom damage, accuracy, projectile speed,
   shot count, and sound are used while firing.
6. Change equipment while the toggle remains Yes and confirm stats do not reset.
7. Toggle No and Yes and confirm the new equipment defaults import once.
8. Test both supported Flan forks on a dedicated server as well as singleplayer.

## Rollback

Remove Alpha 28 and restore the Alpha 27 jar. Do not install both versions.
