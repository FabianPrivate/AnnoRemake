package model.map;

import java.util.ArrayList;
import java.util.Observable;

public class Map extends Observable{
	private ArrayList<ArrayList<Tile>> map = new ArrayList<ArrayList<Tile>>();
	private static Map instance;
	
	public Map(int width, int heigth) {
		instance = this;
		for ( int x = 0; x < width; x++) {
			ArrayList<Tile> row = new ArrayList<Tile>();
			for (int y = 0; y < heigth; y++) {
				row.add(new Tile(x, y));
			}
			map.add(row);
		}
	}
	
	public Tile getTile(int x,int y) {
		return map.get(x).get(y);
	}

	public static Map getInstance() {
		return instance;
	}
	
	public void update() {
		setChanged();
		notifyObservers();
	}
}
