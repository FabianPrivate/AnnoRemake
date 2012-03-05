package mapDatabase;

import java.util.ArrayList;

import model.map.Tile;

public class MapStore {
	private static String CREATE_MAP_DATABASE;
	private static String CREATE_MAP_TABLE = "CREATE TABLE MAP (X INT NOT NULL,Y INT NOT NULL,MAP_ID INT NOT NULL)";

	
	public static void addTile(int Map_id, int x, int y ) { }
	public static ArrayList<ArrayList<Tile>> getVisibleMap(int x, int y) {return null;}
	
}
