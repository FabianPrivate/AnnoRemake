package gui.infobar;

import gui.infobar.minimap.MiniMap;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoBar extends JPanel{
	JTextField nameField;
	
	public InfoBar (){
		nameField = new JTextField();
		this.add(nameField);
		MiniMap miniMap = new MiniMap();
		this.add(miniMap);
	}

}
