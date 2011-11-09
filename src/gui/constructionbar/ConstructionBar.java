package gui.constructionbar;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;

public class ConstructionBar extends JPanel{
	private static ConstructionBar instance;

	
	private ConstructionBar(){
		this.setLocation(1800, 20*50);
		this.add(new Button());
		this.setBackground(Color.BLACK);
	}
	
	public static ConstructionBar getInstance() {
		if (instance == null) {
			instance = new ConstructionBar();
		}
		return instance;
	}

}
