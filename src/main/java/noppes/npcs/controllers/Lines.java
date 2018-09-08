// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;
import java.util.Random;

public class Lines
{
    private static final Random random;
    private int lastLine;
    public HashMap<Integer, Line> lines;
    
    public Lines() {
        this.lastLine = -1;
        this.lines = new HashMap<Integer, Line>();
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        final NBTTagList nbttaglist = new NBTTagList();
        for (final int slot : this.lines.keySet()) {
            final Line line = this.lines.get(slot);
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setInteger("Slot", slot);
            nbttagcompound.setString("Line", line.text);
            nbttagcompound.setString("Song", line.sound);
            nbttaglist.appendTag((NBTBase)nbttagcompound);
        }
        compound.setTag("Lines", (NBTBase)nbttaglist);
        return compound;
    }
    
    public void readNBT(final NBTTagCompound compound) {
        final NBTTagList nbttaglist = compound.getTagList("Lines", 10);
        final HashMap<Integer, Line> map = new HashMap<Integer, Line>();
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            final Line line = new Line();
            line.text = nbttagcompound.getString("Line");
            line.sound = nbttagcompound.getString("Song");
            map.put(nbttagcompound.getInteger("Slot"), line);
        }
        this.lines = map;
    }
    
    public Line getLine(final boolean isRandom) {
        if (this.lines.isEmpty()) {
            return null;
        }
        if (isRandom) {
            final List<Line> lines = new ArrayList<Line>(this.lines.values());
            return lines.get(Lines.random.nextInt(lines.size()));
        }
        ++this.lastLine;
        Line line;
        while (true) {
            this.lastLine %= 8;
            line = this.lines.get(this.lastLine);
            if (line != null) {
                break;
            }
            ++this.lastLine;
        }
        return line;
    }
    
    public boolean isEmpty() {
        return this.lines.isEmpty();
    }
    
    static {
        random = new Random();
    }
}
