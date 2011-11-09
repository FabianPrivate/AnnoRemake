package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;

import model.buildings.Building;
import model.map.Map;
import model.map.Tile;

public class MapClickBuildingHandler extends MapClickHandler {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getModifiers());
		Tile t = getTile(e.getX(), e.getY());
		Building b;
		if (e.getModifiers() == 16) {
			 b = new Building(t.getX(), t.getY(), Color.red);
		}  else if (e.getModifiers() == 8) {
			b = new Building(t.getX(), t.getY(), new Color(160, 82, 45));
		}	else {
			b = new Building(t.getX(), t.getY(), Color.yellow);
		}
		t.setBuilding(b);
		Map.getInstance().update();
	}
	


}
