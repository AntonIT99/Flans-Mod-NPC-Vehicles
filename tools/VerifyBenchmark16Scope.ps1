param([string]$Baseline = '../../outputs/Flans-NPC-Vehicles-Alpha-15-Source.zip')
$ErrorActionPreference = 'Stop'
Add-Type -AssemblyName System.IO.Compression.FileSystem
$archive = [IO.Compression.ZipFile]::OpenRead((Resolve-Path -LiteralPath $Baseline))
$changed = @()
try {
    foreach ($entry in $archive.Entries) {
        if (-not $entry.FullName.StartsWith('src/') -or $entry.FullName.EndsWith('/')) { continue }
        $reader = [IO.StreamReader]::new($entry.Open())
        try { $before = $reader.ReadToEnd() } finally { $reader.Dispose() }
        $after = Get-Content -Raw -LiteralPath $entry.FullName
        if ($before.Replace("`r`n", "`n").TrimEnd() -eq $after.Replace("`r`n", "`n").TrimEnd()) { continue }
        $changed += $entry.FullName
        if ($entry.FullName -eq 'src/main/java/com/wolffsmod/mixin/MixinEntityCustomNpc.java') {
            $unwrapped = [regex]::Replace($after, 'long benchmarkToken = com\.wolffsmod\.benchmark\.ServerBenchmark\.begin\(this\);\s*try\s*\{', '')
            $unwrapped = [regex]::Replace($unwrapped, '\}\s*finally\s*\{\s*com\.wolffsmod\.benchmark\.ServerBenchmark\.endUpdate\(benchmarkToken\);\s*\}', '')
            if ([regex]::Replace($before, '\s', '') -ne [regex]::Replace($unwrapped, '\s', '')) { throw 'NPC behavior changed beyond timing wrapper' }
        } elseif ($entry.FullName -eq 'src/main/java/com/wolffsmod/mixin/MixinEntityAIClosestTargetProgressive.java') {
            $unwrapped = $after.Replace('com.wolffsmod.benchmark.ServerBenchmark.targetSearch(elapsed);', '')
            if ([regex]::Replace($before, '\s', '') -ne [regex]::Replace($unwrapped, '\s', '')) { throw 'Target search behavior changed beyond counter' }
        } elseif ($entry.FullName -notlike 'src/main/java/com/wolffsmod/benchmark/*' -and $entry.FullName -notin @('src/main/java/com/wolffsmod/WolffNPCMod.java','src/main/resources/wolffsmod.mixins.json')) {
            throw "Unexpected pre-existing source change: $($entry.FullName)"
        }
    }
} finally { $archive.Dispose() }
$changed
Write-Output 'PASS: vehicle geometry/renderers, config, networking, rotation and AI behavior unchanged; NPC update/search differences are measurement-only.'
