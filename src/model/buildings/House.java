package model.buildings;

import java.awt.Color;

import model.civillians.CivillianType;

public class House extends Building {
	private CivillianType civillianType;
		
	public House(int x, int y, Color color, // extended from building
			CivillianType civillianType, int maximumNumberOfInhabitants) { // this
		super(x, y, color);
		this.civillianType = civillianType;
	}

	public CivillianType getCivillianType() {
		return civillianType;
	}

}
