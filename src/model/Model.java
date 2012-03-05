package model;

import java.util.HashMap;
import java.util.Observable;

import readers.CivilianReader;
import readers.ResourceReader;
import readers.buildingReaders.BuildingReader;

import model.buildings.BuildingPlan;
import model.civillians.CivillianType;
import model.map.Area;
import model.map.Map;

public class Model extends Observable {
	private Map map;
	private Selectable selected;
	private Player player = new Player(50000);
	private HashMap<Integer, HashMap<Integer, Area>> world = new HashMap<Integer, HashMap<Integer, Area>>();
	
	private static Model instance;
	
	private HashMap<String, BuildingPlan> buildingPlans = new HashMap<String, BuildingPlan>();
	private HashMap<String, CivillianType> civillianTypes = new HashMap<String, CivillianType>();
	private HashMap<String, Resource> resources = new HashMap<String, Resource>();
	
	private Model() {
		Clock clock = new Clock();
		clock.start();
	}
	
	public void addTypes() {
		ResourceReader resourceReader = new ResourceReader();
		resources = resourceReader.read("Files\\Resources.xls");
		CivilianReader civilianReader = new CivilianReader();
		civillianTypes = civilianReader.read("Files\\Civillians.xls");
		BuildingReader buildingReader = new BuildingReader();
		buildingPlans = buildingReader.read("Files\\Buildings.xls");	
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

	public Resource getResource(String resourceName) {
		return resources.get(resourceName);
	}

	public Player getPlayer() {
		return player;
	}
	
	public HashMap<Integer, HashMap<Integer, Area>> getWorld() {
		return world;
	}
	
}
