# Version 8.0.1 - Modern TAP Old-Gun Render Fix

Modern TAP's `RenderGun.preRenderAttachment` assumes every resolved attachment type has a matching non-null attachment `ItemStack`. Guns saved by older Flan/TAP versions can violate that assumption. Rendering such a gun in first person crashes before the world finishes displaying.

Version 8.0.1 adds optional client mixin guards to TAP's attachment pre/post render helpers. A malformed or incomplete attachment is skipped while the base gun continues rendering.

The injections use exact modern-TAP descriptors with `require = 0`. Flan forks that do not contain these helper signatures ignore the hooks, preserving compatibility with older TAP and Flan's Mod Ultimate.

No gun NBT is rewritten, no attachment is deleted, and server behavior is unchanged.
