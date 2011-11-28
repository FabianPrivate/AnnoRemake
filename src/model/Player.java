package model;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import model.buildings.Building;
import model.buildings.ProductionBuilding;

public class Player {
	private HashMap<Resource, Integer> resources = new HashMap<Resource, Integer>();
	private ArrayList<Building> buildings = new ArrayList<Building>();
	
	public Player() {
		
	}
	
	public void update() {
		for (Building b : buildings) {
			if (b instanceof ProductionBuilding) {
				ProductionBuilding productionBuilding = (ProductionBuilding) b;
				productionBuilding.getProduction();
			}
		}
	}
	
	public void addBuilding(Building building) {
		
	}
	

}
