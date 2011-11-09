package controllers;

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
	}

	public MapClickHandler getMapClickHandler() {
		return mapClickHandler;
	}
	
	
}
