package noppes.npcs.client.gui.global;

import java.util.HashMap;
import java.util.Vector;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.Client;
import noppes.npcs.client.gui.GuiNpcMobSpawnerSelector;
import noppes.npcs.client.gui.SubGuiNpcBiomes;
import noppes.npcs.client.gui.SubGuiSpawningOptions;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.GuiNPCInterface2;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.controllers.data.SpawnData;
import noppes.npcs.entity.EntityNPCInterface;

public class GuiNpcNaturalSpawns extends GuiNPCInterface2 implements IGuiData, IScrollData, ITextfieldListener, ICustomScrollListener, ISliderListener{

	private GuiCustomScroll scroll;
	private HashMap<String, Integer> data = new HashMap<String, Integer>();

	private SpawnData spawn = new SpawnData();
	private int slotSelected;
	
	public GuiNpcNaturalSpawns(EntityNPCInterface npc) {
		super(npc);
    	Client.sendData(EnumPacketServer.NaturalSpawnGetAll);
	}
	
	@Override
	public void initGui(){
		super.initGui();
        if(scroll == null){
	        scroll = new GuiCustomScroll(this,0);
	        scroll.setSize(143, 208);
        }
        scroll.guiLeft = guiLeft + 214;
        scroll.guiTop = guiTop + 4;
        this.addScroll(scroll);

       	this.addButton(new GuiNpcButton(1,guiLeft + 358, guiTop + 38, 58, 20, "gui.add"));
    	this.addButton(new GuiNpcButton(2,guiLeft + 358, guiTop + 61, 58, 20, "gui.remove"));
    	
    	if(spawn.id >= 0)
    		showSpawn();
    	
	}
	
	private void showSpawn() {
		addLabel(new GuiNpcLabel(1,"gui.title", guiLeft + 4, guiTop + 8));
		addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, guiLeft + 60, guiTop + 3, 140, 20, spawn.name));

		int y = guiTop + 30;
		addLabel(new GuiNpcLabel(3,"spawning.biomes", guiLeft + 4, y));
    	addButton(new GuiNpcButton(3, guiLeft + 120, y - 5, 50, 20, "selectServer.edit"));

		addLabel(new GuiNpcLabel(4,"spawning.options", guiLeft + 4, y += 22));
		addButton(new GuiNpcButton(4, guiLeft + 120, y - 5, 50, 20, "selectServer.edit"));

        addSlider(new GuiNpcSlider(this, 5, guiLeft + 4, y += 17, 180, 20, (float)spawn.itemWeight / 100));

    	this.addButton(new GuiNpcButton(25, guiLeft + 14, y += 23,20,20, "X"));
        addLabel(new GuiNpcLabel(6, "1:", guiLeft + 4, y + 5));
    	this.addButton(new GuiNpcButton(6, guiLeft + 36, y, 170, 20, getTitle(spawn.compound1)));

		this.addButton(new GuiNpcButton(26, guiLeft + 14, y += 22,20,20, "X"));
		addLabel(new GuiNpcLabel(7, "2:", guiLeft + 4, y + 5));
		this.addButton(new GuiNpcButton(7, guiLeft + 36, y, 170, 20, getTitle(spawn.compound2)));

		this.addButton(new GuiNpcButton(27, guiLeft + 14, y += 22,20,20, "X"));
		addLabel(new GuiNpcLabel(8, "3:", guiLeft + 4, y + 5));
		this.addButton(new GuiNpcButton(8, guiLeft + 36, y, 170, 20, getTitle(spawn.compound3)));

		this.addButton(new GuiNpcButton(28, guiLeft + 14, y += 22,20,20, "X"));
		addLabel(new GuiNpcLabel(9, "4:", guiLeft + 4, y + 5));
		this.addButton(new GuiNpcButton(9, guiLeft + 36, y, 170, 20, getTitle(spawn.compound4)));

		this.addButton(new GuiNpcButton(29, guiLeft + 14, y += 22,20,20, "X"));
		addLabel(new GuiNpcLabel(10, "5:", guiLeft + 4, y + 5));
		this.addButton(new GuiNpcButton(10, guiLeft + 36, y, 170, 20, getTitle(spawn.compound5)));
	}
    private String getTitle(NBTTagCompound compound) {
		if(compound != null && compound.hasKey("ClonedName"))
			return compound.getString("ClonedName");
		
		return "gui.selectnpc";
	}

    @Override
	public void buttonEvent(GuiButton guibutton){
		int id = guibutton.id;
        if(id == 1){
        	save();
        	String name = "New";
        	while(data.containsKey(name))
        		name += "_";
        	
        	SpawnData spawn = new SpawnData();
        	spawn.name = name;
        	Client.sendData(EnumPacketServer.NaturalSpawnSave, spawn.writeNBT(new NBTTagCompound()));
        	
        }
        if(id == 2){
        	if(data.containsKey(scroll.getSelected())) {
				Client.sendData(EnumPacketServer.NaturalSpawnRemove, spawn.id);
				spawn = new SpawnData();
        		scroll.clear();
        	}
        }
        if(id == 3){
        	setSubGui(new SubGuiNpcBiomes(spawn));
        }
		if(id == 4){
			setSubGui(new SubGuiSpawningOptions(spawn));
		}

        if(id >= 6 && id <= 10){
			slotSelected = id - 5;
    		setSubGui(new GuiNpcMobSpawnerSelector());
        }

        if(id == 25){
    		spawn.compound1 = new NBTTagCompound();
    		initGui();
        }
		if(id == 26){
			spawn.compound2 = new NBTTagCompound();
			initGui();
		}
		if(id == 27){
			spawn.compound3 = new NBTTagCompound();
			initGui();
		}
		if(id == 28){
			spawn.compound4 = new NBTTagCompound();
			initGui();
		}
		if(id == 29){
			spawn.compound5 = new NBTTagCompound();
			initGui();
		}
    }


	@Override
	public void unFocused(GuiNpcTextField guiNpcTextField) {
		String name = guiNpcTextField.getText();
		if(name.isEmpty() || data.containsKey(name)){
			guiNpcTextField.setText(spawn.name);
		}
		else{
			String old = spawn.name;
			data.remove(old);
			spawn.name = name;
			data.put(spawn.name, spawn.id);
			scroll.replace(old, spawn.name);
		}
	}
	
	@Override
	public void setData(Vector<String> list, HashMap<String, Integer> data) {
		String name = scroll.getSelected();
		this.data = data;
		scroll.setList(list);
		
		if(name != null)
			scroll.setSelected(name);
		initGui();
	}

	@Override
	public void customScrollClicked(int i, int j, int k, GuiCustomScroll guiCustomScroll) {
		if(guiCustomScroll.id == 0){
			save();
			String selected = scroll.getSelected();
			spawn = new SpawnData();
			Client.sendData(EnumPacketServer.NaturalSpawnGet, data.get(selected));
		}
	}

	@Override
	public void save() {
    	GuiNpcTextField.unfocus();
		if(spawn.id >= 0)
			Client.sendData(EnumPacketServer.NaturalSpawnSave, spawn.writeNBT(new NBTTagCompound()));
	}

	@Override
	public void setSelected(String selected) {
		
	}

	public void closeSubGui(SubGuiInterface gui) {
		super.closeSubGui(gui);
		if(gui instanceof GuiNpcMobSpawnerSelector){
			GuiNpcMobSpawnerSelector selector = (GuiNpcMobSpawnerSelector) gui;
			NBTTagCompound compound = selector.getCompound();
			if (compound != null) {
				switch (slotSelected) {
					case 1:
						spawn.compound1 = compound;
						break;
					case 2:
						spawn.compound2 = compound;
						break;
					case 3:
						spawn.compound3 = compound;
						break;
					case 4:
						spawn.compound4 = compound;
						break;
					case 5:
						spawn.compound5 = compound;
						break;
				}
			}
			initGui();
		}
	}
	
	@Override
	public void setGuiData(NBTTagCompound compound) {
		spawn.readNBT(compound);
		setSelected(spawn.name);
		initGui();
	}

	@Override
	public void mouseDragged(GuiNpcSlider guiNpcSlider) {
		guiNpcSlider.displayString = StatCollector.translateToLocal("spawning.weightedChance") + ": "  + (int) (guiNpcSlider.sliderValue * 100);
	}

	@Override
	public void mousePressed(GuiNpcSlider guiNpcSlider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(GuiNpcSlider guiNpcSlider) {
		spawn.itemWeight = (int) (guiNpcSlider.sliderValue * 100);
	}

}
