package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import model.Model;
import model.map.Map;
import model.map.Tile;
import model.map.TileDimensions;

public class MapClickHandler implements MouseListener , MouseMotionListener{
	protected Tile hoveringAboveTile = null;

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Tile t = getTile(e.getX(), e.getY());
		if (e.getModifiers() == 16) {
			Model.getInstance().setSelected(t.getSelectable());
		} else if (e.getModifiers() == 4) {
			Model.getInstance().setSelected(null);
		}
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
		return Map.getCurrent().getTile(x,y);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Tile getHoveringAboveTile() {
		return hoveringAboveTile;
	}

}
