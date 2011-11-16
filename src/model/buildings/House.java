package model.buildings;

import model.civillians.CivillianType;

public class House extends Building {
	private CivillianType civillianType;
		
	public House(int x, int y, HousePlan buildingPlan) { // this
		super(x, y, buildingPlan);
		this.civillianType = buildingPlan.getCivillianType();
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
