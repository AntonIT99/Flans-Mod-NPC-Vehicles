param([string]$Baseline = '../../outputs/Flans-NPC-Vehicles-Alpha-16-Source.zip')
$ErrorActionPreference = 'Stop'
Add-Type -AssemblyName System.IO.Compression.FileSystem
$allowed = @('WolffNPCMod.java','ClientProxy.java','StaticModelGroupCache.java','ModelFlanVehicle.java','BenchmarkRun.java','VehicleBenchmark.java','BenchmarkReport.java')
$archive = [IO.Compression.ZipFile]::OpenRead((Resolve-Path -LiteralPath $Baseline))
try {
    foreach ($entry in $archive.Entries) {
        if (-not $entry.FullName.StartsWith('src/') -or $entry.FullName.EndsWith('/')) { continue }
        $reader = [IO.StreamReader]::new($entry.Open())
        try { $before = $reader.ReadToEnd() } finally { $reader.Dispose() }
        $after = Get-Content -Raw -LiteralPath $entry.FullName
        if ($before.Replace("`r`n", "`n").TrimEnd() -eq $after.Replace("`r`n", "`n").TrimEnd()) { continue }
        if ([IO.Path]::GetFileName($entry.FullName) -notin $allowed) { throw "Unexpected change: $($entry.FullName)" }
        Write-Output $entry.FullName
    }
} finally { $archive.Dispose() }
Write-Output 'PASS: all other existing source files unchanged from Alpha 16, including AI, aiming, networking and model geometry.'
