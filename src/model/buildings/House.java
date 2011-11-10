package model.buildings;

import java.awt.Color;

import model.civillians.CivillianType;

public class House extends Building {
	private CivillianType civillianType;
		
	public House(int x, int y, BuildingPlan buildingPlan) { // this
		super(x, y, buildingPlan);
		this.civillianType = civillianType;
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
