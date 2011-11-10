package gui.infobar;

import gui.GameFrame;
import gui.infobar.minimap.MiniMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoBar extends JPanel{
	private static int heigth;
	private static int width;
	
	JLabel nameField;
	private static InfoBar instance;
	
	private InfoBar (){
		heigth = GameFrame.heigth;
		width = GameFrame.width / 5;
		setSize(heigth, width);
		nameField = new JLabel("Selected");
		this.add(nameField);
		MiniMap miniMap = new MiniMap();
		this.add(miniMap);
	}
	
	public static InfoBar getInstance() {
		if (instance == null) {
			instance = new InfoBar();
		}
		return instance;
		
		
	}

}
