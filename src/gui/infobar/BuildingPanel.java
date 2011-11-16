package gui.infobar;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import model.buildings.Building;
import model.buildings.House;
import model.civillians.Need;
import gui.components.FPanel;

public class BuildingPanel extends FPanel{
	protected Building selectedBuilding;
	
	protected JLabel nameLabel = new JLabel();
	protected JLabel inhabitantLabel = new JLabel();
	
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
			inhabitantLabel.setText(h.getCivillianType().getName());
			this.add(inhabitantLabel);
			for (Need n : h.getCivillianType().getNeeds()) {
				this.add(new NeedPanel(n));
			}

		}
		revalidate();
		repaint();
	}

}
