package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import readers.BuildingReader;

import model.buildings.BuildingPlan;
import model.civillians.CivillianType;
import model.civillians.Need;
import model.civillians.Subneed;
import model.map.Map;

public class Model extends Observable {
	private Map map;
	private Selectable selected;
	private Player player = new Player(50000);
	
	private static Model instance;
	
	private HashMap<String, BuildingPlan> buildingPlans = new HashMap<String, BuildingPlan>();
	private HashMap<String, CivillianType> civillianTypes = new HashMap<String, CivillianType>();
	private HashMap<String, Resource> resources = new HashMap<String, Resource>();
	
	private Model() {
		resources.put("WOOD", new Resource("WOOD"));
		ArrayList<Need> needs = new ArrayList<Need>();
		ArrayList<Subneed> food = new ArrayList<Subneed>();
		food.add(new Subneed("Fish", 1));
		needs.add( new Need("Food",food));
		civillianTypes.put("COLONIST", new CivillianType("COLONIST", needs));
		Clock clock = new Clock();
		clock.start();
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

	public Resource getResource(String resourceName) {
		return resources.get(resourceName);
	}

	public Player getPlayer() {
		return player;
	}
	
}
