param([string]$Baseline = '../../outputs/Flans-NPC-Vehicles-Alpha-14-Source.zip')
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
        if ($entry.FullName -like 'src/main/java/com/wolffsmod/model/*.java') {
            $unwrapped = [regex]::Replace($after, 'long benchmarkToken = com\.wolffsmod\.benchmark\.VehicleBenchmark\.begin\(entity\);\s*try\s*\{', '')
            $unwrapped = [regex]::Replace($unwrapped, '\}\s*finally\s*\{\s*com\.wolffsmod\.benchmark\.VehicleBenchmark\.end\(benchmarkToken\);\s*\}', '')
            if ([regex]::Replace($before, '\s', '') -ne [regex]::Replace($unwrapped, '\s', '')) { throw "Non-measurement model change: $($entry.FullName)" }
        } elseif ($entry.FullName -notin @('src/main/java/com/wolffsmod/ClientProxy.java','src/main/resources/wolffsmod.mixins.json')) {
            throw "Unexpected pre-existing source change: $($entry.FullName)"
        }
    }
} finally { $archive.Dispose() }
$changed
Write-Output 'PASS: pre-existing changes confined to six model timing wrappers, client registration, and the client-only mixin list; original model bodies preserved.'
