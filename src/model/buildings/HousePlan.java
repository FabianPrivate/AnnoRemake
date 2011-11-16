package model.buildings;

import java.awt.Color;

import model.civillians.CivillianType;

public class HousePlan extends BuildingPlan{
	private CivillianType civillianType;

	public HousePlan(String name, Color color, CivillianType civillianType) {
		super(name, color);
		this.setCivillianType(civillianType);
	}

	public void setCivillianType(CivillianType civillianType) {
		this.civillianType = civillianType;
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
