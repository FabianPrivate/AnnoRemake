package model.buildings;

import java.util.HashMap;

import model.Resource;
import model.civillians.CivillianType;

public class House extends Building {
	private CivillianType civillianType;
	private HashMap<Resource, Double> storedResources = new HashMap<Resource, Double>();
		
	public House(int x, int y, HousePlan buildingPlan) { // this
		super(x, y, buildingPlan);
		this.civillianType = buildingPlan.getCivillianType();
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
