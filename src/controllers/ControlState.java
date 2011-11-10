package controllers;

import gui.mapframe.MapFrame;

public class ControlState {
	private MapClickHandler mapClickHandler;
	private static ControlState instance;
	
	private ControlState() {
		mapClickHandler = new MapClickHandler();
	}
	
	public static ControlState getInstance() {
		if (instance == null) {
			instance = new ControlState();
		}
		return instance;
	}

	public void setMapClickHandler(MapClickHandler mapClickHandler) {
		this.mapClickHandler = mapClickHandler;
		MapFrame mapFrame = MapFrame.getInstance();
		mapFrame.setMapClickHandler(mapClickHandler);
	}

	public MapClickHandler getMapClickHandler() {
		return mapClickHandler;
	}
	
	
}
