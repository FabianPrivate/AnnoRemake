package gui.constructionbar;

import gui.GameFrame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.ControlState;
import controllers.MapClickBuildingHandler;

import model.Model;
import model.buildings.BuildingPlan;

public class ConstructionBar extends JPanel{
	private static ConstructionBar instance;
	private static int height;
	private static int width;
	
	private ConstructionBar(){
		height = GameFrame.heigth /5;
		width = GameFrame.width / 5 *4;
		setSize(width, height);
		setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.BLACK);
		for (BuildingPlan b : Model.getInstance().getBuildingPlans().values()) {
			JButton button = new JButton(b.getName());
			button.addActionListener(new ConstructionButtonClickListener());
			this.add(button);
		}
	}
	
	public static ConstructionBar getInstance() {
		if (instance == null) {
			instance = new ConstructionBar();
		}
		return instance;
	}

	private class ConstructionButtonClickListener implements ActionListener{
		
		public ConstructionButtonClickListener() {
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String name = button.getText();
			BuildingPlan b = Model.getInstance().getBuildingPlans().get(name);
			ControlState.getInstance().setMapClickHandler(new MapClickBuildingHandler(b));
		}
	}
}
