package com.wolffsmod.benchmark;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Locale;

/** Bounded per-run diagnostics, no Minecraft references retained. */
public final class SlowPathLog {
    private final Map<Long, double[]> recent = new LinkedHashMap<Long, double[]>();
    private final StringBuilder records = new StringBuilder();
    public int stored, dropped;
    public boolean nodesObserved;
    public String failure = "";
    public void record(long elapsed, long duration, int dimension, int id, String name,
                       double sx, double sy, double sz, double x, double y, double z,
                       int gx, int gy, int gz, float range, long nodes, String result, String endpoint) {
        long key = ((long)dimension << 32) ^ (id & 0xffffffffL);
        double[] last = recent.get(key);
        boolean repeat = last != null && elapsed - last[0] <= 5000000000L
                && last[1] == gx && last[2] == gy && last[3] == gz;
        if (last == null) {
            if (recent.size() >= 256) recent.remove(recent.keySet().iterator().next());
            last = new double[4]; recent.put(key, last);
        }
        last[0] = elapsed; last[1] = gx; last[2] = gy; last[3] = gz;
        if (duration <= 50000000L) return;
        if (stored >= 256) { dropped++; return; }
        stored++;
        records.append(String.format(Locale.ROOT,
                "t=%.3fs duration=%.3fms dim=%d NPC=%s id=%d start=(%.2f,%.2f,%.2f) destination=(%.2f,%.2f,%.2f) distance=%.2f range=%.1f nodes=%s result=%s endpoint=%s recentSameDestination=%s%n",
                elapsed / 1e9, duration / 1e6, dimension, name, id, sx, sy, sz, x, y, z,
                Math.sqrt((x-sx)*(x-sx)+(y-sy)*(y-sy)+(z-sz)*(z-sz)), range,
                nodesObserved ? Long.toString(nodes) : "unavailable", result, endpoint, repeat));
    }
    public String report() {
        return "\nSLOW GROUND PATH SEARCHES (>50 ms)\nStored: " + stored + "; omitted after cap: " + dropped
                + "\nNode hook observed: " + nodesObserved + "\nMetric error: " + failure
                + "\nNodes = dequeued search nodes, not unique blocks. Reached = final path point matches the pathfinder's normalized destination; not proof the NPC arrived. Repeat = immediately previous search for same dimension/entity ID and normalized destination within 5 measured wall-clock seconds; history limited to 256 NPCs. First 256 slow searches retained. Flying searches are not detailed.\n"
                + records;
    }
}
