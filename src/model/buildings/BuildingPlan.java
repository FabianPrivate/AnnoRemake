package model.buildings;

import java.awt.Color;

public class BuildingPlan {
	private String name;
	private Color color;
	
	public BuildingPlan(String name, Color color) {
		this.name = name;
		this.color = color;
	}
	
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}
}
