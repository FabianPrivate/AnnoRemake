package model.map;

import model.Selectable;
import model.buildings.Building;

public class Tile {
	private final int x;
	private final int y;
	
	private int heigth;
	private TileType type;
	
	private Selectable selectable;
	
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

	public void setSelectable(Selectable selectable) {
		this.selectable = selectable;
	}

	public void determineHeigth() {
		
	}
	
	public void determineType() {
		
	}

	
	public Selectable getSelectable() {
		return selectable;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setType(TileType type) {
		this.type = type;
	}

	public TileType getType() {
		return type;
	}
}
