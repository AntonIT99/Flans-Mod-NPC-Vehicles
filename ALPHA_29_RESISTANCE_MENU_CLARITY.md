# Alpha 29 - Resistance Menu Clarity

Alpha 29 reorganizes the CustomNPC resistance sub-menu so its controls are
readable and accurately describe their existing behavior.

## Display changes

- `DisableDamage` is now displayed as `Disable All Damage`.
- Its Yes/No button is placed directly beside that label.
- Hovering the button explains that Yes makes the NPC immune to all damage.
- `Damage Vulnerabilities` is replaced by `Minimum Hit Damage`.
- The lower controls are arranged under `Damage Type` and
  `Required (0 = Off)` headings.
- The unsupported Unicode greater-than-or-equal symbol was removed.
- Arrow, Melee and Explosion fields have hover text explaining that hits below
  the entered amount are ignored and that zero disables the threshold.
- The dialog is slightly taller and the Done button is moved down to prevent
  overlapping labels and fields.

## Behavior preserved

This is a presentation-only change. Resistance calculations, slider behavior,
networking and NBT keys are unchanged:

- Disable All Damage = Yes still makes the NPC completely invulnerable.
- A minimum value of 10 still ignores hits below 10 and accepts a hit of exactly
  10 or more.
- A minimum value of 0 still disables that minimum-hit threshold.
- Existing NPC values and saved worlds remain compatible.

## Test

Open Stats -> Resistance and confirm:

1. No labels overlap.
2. The Yes/No control clearly belongs to Disable All Damage.
3. All three minimum-hit fields and the Done button are visible.
4. Hover text appears on the invulnerability button and threshold fields.
5. The layout remains usable at the smallest GUI scale normally supported by
   the modpack.

## Rollback

Remove Alpha 29 and restore the Alpha 28 jar. Do not install both versions.
