package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import readers.BuildingReader;

import model.buildings.BuildingPlan;
import model.buildings.HousePlan;
import model.civillians.CivillianType;
import model.civillians.Need;
import model.civillians.Subneed;
import model.map.Map;

public class Model extends Observable {
	private Map map;
	private Selectable selected;
	private Player player;
	
	private static Model instance;
	
	private HashMap<String, BuildingPlan> buildingPlans = new HashMap<String, BuildingPlan>();
	private HashMap<String, CivillianType> civillianTypes = new HashMap<String, CivillianType>();
	
	private Model() {
		ArrayList<Need> needs = new ArrayList<Need>();
		ArrayList<Subneed> food = new ArrayList<Subneed>();
		food.add(new Subneed("Fish", 1));
		needs.add( new Need("Food",food));
		civillianTypes.put("COLONIST", new CivillianType("COLONIST", needs));
	}
	
	public void addTypes() {
		BuildingReader buildingReader = new BuildingReader();
		ArrayList<BuildingPlan> buildingPlans = buildingReader.read("Files\\Buildings.xls");
		for (BuildingPlan b : buildingPlans) {
			this.buildingPlans.put(b.getName(), b);
		}
	}
	
	public static Model getInstance(){
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void setSelected(Selectable selected) {
		this.selected = selected;
		setChanged();
		notifyObservers();
	}

	public Selectable getSelected() {
		return selected;
	}

	public HashMap<String, BuildingPlan> getBuildingPlans() {
		return buildingPlans;
	}

	public HashMap<String, CivillianType> getCivillianTypes() {
		return civillianTypes;
	}

	public void update() {
		player.update();
		
	}
	
}
