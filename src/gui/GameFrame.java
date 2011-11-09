package gui;

import java.awt.Container;
import java.awt.GraphicsEnvironment;

import gui.constructionbar.ConstructionBar;
import gui.mapframe.MapFrame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	
	public GameFrame() {
		super("anno");
		setVisible(true);
		setResizable(false);
 		GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = this.getContentPane();
	    content.add(MapFrame.getInstance());
		content.add(ConstructionBar.getInstance());
	}
}
