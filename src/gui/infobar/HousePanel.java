package gui.infobar;

import java.util.ArrayList;

import javax.swing.JPanel;

import model.Model;
import model.buildings.Building;

public class HousePanel extends BuildingPanel {	
	
	public HousePanel(Building building) {
		super(building);
		Model.getInstance().getSelected();
	}

}
