package controllers;

import gui.mapframe.MapFrame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import model.buildings.Building;
import model.buildings.BuildingPlan;
import model.buildings.House;
import model.buildings.HousePlan;
import model.map.Map;
import model.map.Tile;

public class MapClickBuildingHandler extends MapClickHandler  {
	private BuildingPlan buildingPlan;
	
	public MapClickBuildingHandler(BuildingPlan buildingPlan) {
		this.buildingPlan = buildingPlan;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Tile t = getTile(e.getX(), e.getY());
		if (e.getModifiers() == 16 ){
			if (buildingPlan instanceof HousePlan) {
				t.setSelectable(new House((int) e.getX(), (int) e.getY(),(HousePlan) buildingPlan));
			} else {
				t.setSelectable(new Building((int) e.getX(), (int) e.getY(), buildingPlan));
			}
			ControlState.getInstance().setMapClickHandler(new MapClickHandler());
		} if (e.getModifiers() == 8) {
			// scroll
		} else if (e.getModifiers() == 4){
			ControlState.getInstance().setMapClickHandler(new MapClickHandler());
		}
		Map.getInstance().update();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Tile t = getTile(e.getX(), e.getY());
		hoveringAboveTile = t;
		MapFrame.getInstance().updateUI();
	}
	

	


}
