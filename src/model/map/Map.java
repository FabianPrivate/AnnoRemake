package model.map;

import java.util.ArrayList;
import java.util.Observable;

import mapDatabase.MapStore;

public class Map extends Observable{ // 10 km x 10 km
	private ArrayList<ArrayList<Tile>> map = new ArrayList<ArrayList<Tile>>();
	private static Map current;
	
	private final int width;
	private final int heigth;
	
	public Map(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
		current = this;
		for ( int x = 0; x < width; x++) {
			ArrayList<Tile> row = new ArrayList<Tile>();
			for (int y = 0; y < heigth; y++) {
				row.add(new Tile(x, y));
				//MapStore
			}
			map.add(row);
		}
	}
	
	public Tile getTile(int x,int y) {
		if (x >= 0 && x < width && y >= 0 && y < heigth) {
			return map.get(x).get(y);
		}
		return null;
	}
	
	

	private Tile[] getSurroundingTiles(int x, int y) {
		Tile[] surroundingTiles = new Tile[4];
		surroundingTiles[0] = getTile(x-1,y);
		surroundingTiles[1] = getTile(x,y-1);
		surroundingTiles[2] = getTile(x+1,y);
		surroundingTiles[3] = getTile(x,y+1);
		return surroundingTiles;
	}
	
	public static Map getCurrent() {
		return current;
	}
	
	public void update() {
		setChanged();
		notifyObservers();
	}
}
