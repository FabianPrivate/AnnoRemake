package model.buildings;

import java.awt.Color;

public class BuildingPlan {
	private String name;
	private Color color;
	private int width;
	private int height;
	
	public BuildingPlan(String name, Color color, int width, int height) {
		this.name = name;
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	public BuildingPlan(BuildingPlan buildingPlan) {
		this.name = buildingPlan.getName();
		this.color = buildingPlan.getColor();
		this.width = buildingPlan.getWidth();
		this.height = buildingPlan.getHeight();
	}
	
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
