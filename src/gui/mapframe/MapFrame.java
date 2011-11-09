package gui.mapframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;

import javax.sound.sampled.Control;
import javax.swing.JButton;

import controllers.ControlState;
import controllers.MapClickBuildingHandler;
import controllers.MapClickHandler;


import model.map.Map;
import model.map.Tile;
import model.map.TileDimensions;

import gui.components.FPanel;

public class MapFrame extends FPanel implements Observer {

	private static int startviewLocationX = 0;
	private static int startviewLocationY = 0;
	
	private static final int tilesInScreenX = 31;
	private static final int tilesInScreenY = 17;
	
	private static int endviewLocationX = startviewLocationX + tilesInScreenX;
	private static int endviewLocationY =  startviewLocationY + tilesInScreenY;
	
	private static MapFrame instance;


	private MapFrame() {
		this.setSize(tilesInScreenX * TileDimensions.Width, tilesInScreenY * TileDimensions.Heigth)
		this.addMouseListener(ControlState.getInstance().getMapClickHandler());
		Map.getInstance().addObserver(this);
	}
	
	public static MapFrame getInstance() {
		if (instance == null) {
			instance = new MapFrame();
		}		
		return instance;
	}

	public void paintComponents(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (int x = startviewLocationX; x < endviewLocationX; x++ ) {
			for (int y = startviewLocationY; y < endviewLocationY; y++) {
				Tile t = Map.getInstance().getTile(x, y);
				if (t.getBuilding() != null) {
					g2.setColor(t.getBuilding().getColor());
				} else {
					g2.setColor(Color.green);
				}
				g2.fillRect(x * TileDimensions.Width, y * TileDimensions.Width, TileDimensions.Width, TileDimensions.Heigth);
				g2.setColor(Color.white);
				g2.drawRect(x * TileDimensions.Width, y * TileDimensions.Width, TileDimensions.Width, TileDimensions.Heigth);
				g2.drawString( x + "," + y  , x * TileDimensions.Width + 5, y * TileDimensions.Heigth + TileDimensions.Heigth/2	);
			}
		}
	}
	
	@Override
	public void update(Graphics g) {
		paintComponents(g);
	}
	
	@Override
	public void paint(Graphics g) {
		paintComponents(g);
	}

	@Override
	public void update(Observable o, Object arg) {
		revalidate();
		repaint();
		
	}
	
	
}
