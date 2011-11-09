package model.map;

import model.buildings.Building;

public class Tile {
	private final int x;
	private final int y;
	private Building building;
	
	public Tile (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Building getBuilding() {
		return building;
	}
}
