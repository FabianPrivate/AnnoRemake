package gui.infobar;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.jws.Oneway;
import javax.swing.JProgressBar;

import model.civillians.Need;
import model.civillians.Subneed;
import gui.components.FPanel;

public class NeedPanel extends FPanel implements MouseListener{
	private Need need;
	
	private boolean collapsed = false;
	
	public NeedPanel(Need need) {
		this.need = need;
		this.addMouseListener(this);
		buildUI();
	}
	
	public void buildUI() {
		this.removeAll();
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setValue(need.getSatisfactionlevel());
		progressBar.setStringPainted(true);
		progressBar.setString(need.getName());
		this.add(progressBar);
		if (collapsed) {
			for (Subneed s : need.getSubneeds()) {
				JProgressBar subProgressBar = new JProgressBar(0, 100);
				subProgressBar.setValue(s.getSatisfactionlevel());
				subProgressBar.setStringPainted(true);
				subProgressBar.setString(s.getName());
				this.add(subProgressBar);
			}
		}
		revalidate();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getModifiers() == 16 ) {
			collapsed = !collapsed;
		}
		buildUI();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
