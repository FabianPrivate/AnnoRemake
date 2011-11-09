package gui.infobar;

import java.util.ArrayList;

import javax.swing.JPanel;

import model.Model;

public class CitizenPanel extends JPanel {	
	
	public CitizenPanel() {
		Model.getInstance().getSelected();
	}

}
