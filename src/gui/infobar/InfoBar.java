package gui.infobar;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import gui.GameFrame;
import gui.infobar.minimap.MiniMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Model;
import model.Selectable;
import model.buildings.Building;
import model.buildings.House;

public class InfoBar extends JPanel implements Observer{
	private static int heigth;
	private static int width;
	
	JLabel nameField;
	private static InfoBar instance;
	private Selectable selectable;
	private Component activePanel;
	
	private InfoBar (){
		Model.getInstance().addObserver(this);
		heigth = GameFrame.heigth;
		width = GameFrame.width / 5;
		setSize(heigth, width);
		BuildUI();
	}
	
	public static InfoBar getInstance() {
		if (instance == null) {
			instance = new InfoBar();
		}
		return instance;
		
		
	}
	
	private void BuildUI() {
		if (Model.getInstance().getSelected() != null) {
			if (Model.getInstance().getSelected() instanceof Building) {
				if (activePanel != null) {
					this.remove(activePanel);
				}
				this.activePanel = new BuildingPanel((Building) Model.getInstance().getSelected());
				this.add(activePanel);	
			}
		}
		revalidate();
		repaint();
	}

	@Override
	public void update(Observable o, Object arg) {
		BuildUI();
	}

}
