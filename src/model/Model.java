package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import model.buildings.BuildingPlan;
import model.map.Map;

public class Model extends Observable {
	private Map map;
	private Selectable selected;
	
	private static Model instance;
	
	private HashMap<String, BuildingPlan> buildingPlans = new HashMap<String, BuildingPlan>();
	
	private Model() {
		buildingPlans.put("House", new BuildingPlan("House", Color.red));
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
		
	}

	public Selectable getSelected() {
		return selected;
	}

	public HashMap<String, BuildingPlan> getBuildingPlans() {
		return buildingPlans;
	}

}
