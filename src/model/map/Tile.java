package model.map;

import model.Selectable;
import model.buildings.Building;

public class Tile {
	private final int x;
	private final int y;
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


	
	public Selectable getSelectable() {
		return selectable;
	}
}
