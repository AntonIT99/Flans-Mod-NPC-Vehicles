// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import javax.script.Compilable;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.CompiledScript;
import java.util.List;

public class ScriptContainer
{
    public String fullscript;
    public String script;
    public String console;
    public boolean errored;
    public List<String> scripts;
    private long lastCreated;
    private CompiledScript compScript;
    private String currentScriptLanguage;
    public ScriptEngine engine;
    
    public ScriptContainer() {
        this.fullscript = "";
        this.script = "";
        this.console = "";
        this.errored = false;
        this.scripts = new ArrayList<String>();
        this.lastCreated = 0L;
        this.compScript = null;
        this.currentScriptLanguage = null;
        this.engine = null;
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        this.script = compound.getString("Script");
        this.console = compound.getString("ScriptConsole");
        this.scripts = NBTTags.getStringList(compound.getTagList("ScriptList", 10));
        this.lastCreated = 0L;
    }
    
    public void writeToNBT(final NBTTagCompound compound) {
        compound.setString("Script", this.script);
        compound.setString("ScriptConsole", this.console);
        compound.setTag("ScriptList", (NBTBase)NBTTags.nbtStringList(this.scripts));
    }
    
    public String getCode() {
        if (ScriptController.Instance.lastLoaded > this.lastCreated) {
            this.lastCreated = ScriptController.Instance.lastLoaded;
            this.fullscript = this.script;
            if (!this.fullscript.isEmpty()) {
                this.fullscript += "\n";
            }
            for (final String loc : this.scripts) {
                final String code = ScriptController.Instance.scripts.get(loc);
                if (code != null && !code.isEmpty()) {
                    this.fullscript = this.fullscript + code + "\n";
                }
            }
            this.compScript = null;
        }
        return this.fullscript;
    }
    
    public void run(final ScriptEngine engine) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);
        engine.getContext().setWriter(pw);
        engine.getContext().setErrorWriter(pw);
        try {
            if (this.compScript == null && engine instanceof Compilable) {
                this.compScript = ((Compilable)engine).compile(this.getCode());
            }
            if (this.compScript != null) {
                this.compScript.eval(engine.getContext());
            }
            else {
                engine.eval(this.getCode());
            }
        }
        catch (Exception e) {
            this.errored = true;
            this.appandConsole(e.getMessage());
        }
        this.appandConsole(sw.getBuffer().toString().trim());
    }
    
    public void appandConsole(final String message) {
        if (message == null || message.isEmpty()) {
            return;
        }
        this.console = message + "\n" + this.console;
    }
    
    public boolean hasCode() {
        return !this.getCode().isEmpty();
    }
    
    public void setEngine(final String scriptLanguage) {
        if (this.currentScriptLanguage != null && this.currentScriptLanguage.equals(scriptLanguage)) {
            return;
        }
        this.engine = ScriptController.Instance.getEngineByName(scriptLanguage);
        this.currentScriptLanguage = scriptLanguage;
    }
}
