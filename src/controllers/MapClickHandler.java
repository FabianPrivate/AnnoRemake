package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.map.Map;
import model.map.Tile;
import model.map.TileDimensions;

public class MapClickHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		getTile(e.getX(), e.getY());
		System.out.println(e.getModifiers());
	}

	@Override
	public void mouseEntered(MouseEvent e) {		
	}

	@Override
	public void mouseExited(MouseEvent e) {		
	}

	@Override
	public void mousePressed(MouseEvent e) {		
	}

	@Override
	public void mouseReleased(MouseEvent e) {		
	}
	
	public Tile getTile (int clickX, int clickY) {
		int x = clickX/ TileDimensions.Width;
		int y = clickY/ TileDimensions.Heigth;
		return Map.getInstance().getTile(x,y);
		
	}

}
