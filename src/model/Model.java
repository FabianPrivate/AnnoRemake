package model;

import model.map.Map;

public class Model {
	private Map map;
	private Selectable selected;
	
	private static Model instance;
	
	public static Model getInstance(){
		return instance;
	}

	public void setSelected(Selectable selected) {
		this.selected = selected;
	}

	public Selectable getSelected() {
		return selected;
	}
}
