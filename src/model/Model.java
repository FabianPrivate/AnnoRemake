package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import model.buildings.BuildingPlan;
import model.buildings.HousePlan;
import model.civillians.CivillianType;
import model.map.Map;

public class Model extends Observable {
	private Map map;
	private Selectable selected;
	
	private static Model instance;
	
	private HashMap<String, BuildingPlan> buildingPlans = new HashMap<String, BuildingPlan>();
	private HashMap<String, CivillianType> civillianTypes = new HashMap<String, CivillianType>();
	
	private Model() {
		civillianTypes.put("Colonist", new CivillianType("Colonist"));
		buildingPlans.put("House", new HousePlan("House", Color.red, civillianTypes.get("Colonist")));
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

}
