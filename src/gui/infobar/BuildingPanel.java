package gui.infobar;

import javax.swing.JLabel;

import model.buildings.Building;
import model.buildings.House;
import gui.components.FPanel;

public class BuildingPanel extends FPanel{
	private Building selectedBuilding;
	
	private JLabel nameLabel = new JLabel();
	
	public BuildingPanel(Building b) {
		selectedBuilding = b;
		BuildUI();
	}
	
	public void BuildUI(){
		System.out.println(selectedBuilding.getName());
		nameLabel.setText(selectedBuilding.getName());
		this.add(nameLabel);
		if (selectedBuilding instanceof House){
			House h = (House) selectedBuilding;
			nameLabel.setText(h.getCivillianType().getName());
			this.add(nameLabel);
		}
		
		revalidate();
		repaint();
	}

}
