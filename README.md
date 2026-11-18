# Better Loading Screen — NeoForge

A NeoForge port of [Better Loading Screen](https://github.com/isHuaMouRen/better-loading-screen-mod)
(original Fabric mod by **HuaMouRen**).

Enjoy a more beautiful loading screen when you load into a world — a custom
animated loading screen with a progress bar and percentage, replacing the vanilla
chunk-grid screen.

## Details

| | |
|---|---|
| Mod ID | `betterloadingscreen` |
| Version | 1.3.0 |
| Loader | **NeoForge** |
| Minecraft | **1.21.x** (`[1.21,1.22)`) |
| License | GPL-3.0 (inherited from the original) |

This port targets the mod's upstream `1.21-fabric` branch and keeps the Minecraft
rendering code untouched. Only the loader integration was changed
(`ModInitializer` → `@Mod`, `fabric.mod.json` → `neoforge.mods.toml`). The
`LevelLoadingScreenMixin` injects into the standard 1.21 `render` pipeline, which
is identical between Fabric and NeoForge.

## Building

```bash
./gradlew build
```

Output: `build/libs/betterloadingscreen-1.3.0.jar`

## Credits

- Original mod & art: [HuaMouRen](https://github.com/isHuaMouRen)
- NeoForge port: U4PLUS

Licensed under the GNU GPL v3. See [LICENSE](LICENSE).
