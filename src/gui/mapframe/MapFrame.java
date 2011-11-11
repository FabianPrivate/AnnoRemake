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


import model.Selectable;
import model.buildings.Building;
import model.map.Map;
import model.map.Tile;
import model.map.TileDimensions;

import gui.GameFrame;
import gui.components.FPanel;

public class MapFrame extends FPanel implements Observer {
	private static int heigth;
	private static int width;
	
	private static int startviewLocationX = 0;
	private static int startviewLocationY = 0;
	
	private static int tilesInScreenX ;
	private static int tilesInScreenY;
	
	private static int endviewLocationX;
	private static int endviewLocationY;
	
	private static MapFrame instance;


	private MapFrame() {
		heigth = GameFrame.heigth / 5 * 4;
		width = GameFrame.width / 5 * 4;
		this.setSize(width, heigth);
		tilesInScreenX = width/TileDimensions.Width;
		tilesInScreenY = heigth/TileDimensions.Heigth;
		endviewLocationX = startviewLocationX + tilesInScreenX; 
		endviewLocationY = startviewLocationY + tilesInScreenY;
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
				Selectable selectable = t.getSelectable();
				if (t.getSelectable() != null) {
					if (t.getSelectable() instanceof Building) {
						Building b = (Building) selectable;
						g2.setColor(b.getColor());
					}
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

	public void setMapClickHandler(MapClickHandler mapClickHandler) {
		removeMouseListener(getMouseListeners()[0]);
		addMouseListener(mapClickHandler);		
	}
	
	
}
