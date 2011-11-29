package model;

import java.util.ArrayList;
import java.util.HashMap;


import model.buildings.Building;
import model.buildings.ProductionBuilding;

public class Player {
	private HashMap<Resource, Integer> resources = new HashMap<Resource, Integer>();
	private ArrayList<Building> buildings = new ArrayList<Building>();
	
	public Player(int gold) {
		
	}
	
	public void update() {
		for (Building b : buildings) {
			if (b instanceof ProductionBuilding) {
				ProductionBuilding productionBuilding = (ProductionBuilding) b;
				productionBuilding.getProduction();
			}
		}
		for (Resource r : resources.keySet()) {
			System.out.println(r.getName() + resources.get(r));
		}
	}
	
	public void addBuilding(Building building) {
			
	}
	

}
