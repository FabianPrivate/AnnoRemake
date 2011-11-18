package model.buildings;

import java.awt.Color;

import model.civillians.CivillianType;

public class HousePlan extends BuildingPlan{
	private CivillianType civillianType;
	private int numberOfInhabitants;

	public HousePlan(BuildingPlan buildingPlan, CivillianType civillianType, int numberOfInhabitants) {
		super(buildingPlan);
		this.numberOfInhabitants = numberOfInhabitants;
		this.setCivillianType(civillianType);
	}

	public void setCivillianType(CivillianType civillianType) {
		this.civillianType = civillianType;
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
