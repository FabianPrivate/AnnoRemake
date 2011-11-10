package model.buildings;

import java.awt.Color;

import model.Selectable;

public class Building extends Selectable{

	private String name;
	private int leftTopX;
	private int leftTopY;
	
	private int heigth;
	private int width;
	private Color color;
	
	public Building(int x, int y, BuildingPlan buildingPlan){
		this.name = buildingPlan.getName();
		leftTopX = x;
		leftTopY = y;
		this.color = buildingPlan.getColor();
	}

	public Color getColor() {
		return color;
	}
	
}
