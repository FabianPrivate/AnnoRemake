package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import gui.constructionbar.ConstructionBar;
import gui.infobar.InfoBar;
import gui.mapframe.MapFrame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public static int heigth;
	public static int width;
	
	public GameFrame() {
		super("anno");
		Toolkit t = getToolkit();
		heigth = t.getScreenSize().height;
		width = t.getScreenSize().width;
		setSize(t.getScreenSize());
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = this.getContentPane();
		content.setLayout(new BorderLayout());
			
	    content.add(MapFrame.getInstance(),BorderLayout.CENTER);
		content.add(ConstructionBar.getInstance(), BorderLayout.SOUTH);
		content.add(InfoBar.getInstance(), BorderLayout.EAST);
	}
		
}
