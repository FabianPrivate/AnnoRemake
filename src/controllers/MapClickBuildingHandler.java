package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;

import model.buildings.Building;
import model.buildings.BuildingPlan;
import model.map.Map;
import model.map.Tile;

public class MapClickBuildingHandler extends MapClickHandler {
	private BuildingPlan buildingPlan;
	
	public MapClickBuildingHandler(BuildingPlan buildingPlan) {
		this.buildingPlan = buildingPlan;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getModifiers());
		Tile t = getTile(e.getX(), e.getY());
		if (e.getModifiers() == 16 ){
			t.setBuilding(new Building((int) e.getX(), (int) e.getY(), buildingPlan));
		} if (e.getModifiers() == 8) {
			// scroll
		} else {
			ControlState.getInstance().setMapClickHandler(new MapClickHandler());
		}
		Map.getInstance().update();
	}
	


}
