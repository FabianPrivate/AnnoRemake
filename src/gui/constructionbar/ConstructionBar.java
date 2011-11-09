package gui.constructionbar;

import java.awt.Component;

import javax.swing.JPanel;

public class ConstructionBar extends JPanel{
	private static ConstructionBar instance;

	
	private ConstructionBar(){
		
	}
	
	public static ConstructionBar getInstance() {
		if (instance == null) {
			instance = new ConstructionBar();
		}
		return instance;
	}

}
