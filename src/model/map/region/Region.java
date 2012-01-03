package model.map.region;

import java.util.ArrayList;

import model.map.Area;
import model.map.Map;

public class Region {
	private ArrayList<ArrayList<Map>> maps = new ArrayList<ArrayList<Map>>();
	private Area parentArea;
	
	private int heightLevel; // int * 25 + area height = height in meters
	private int regionType;

}
