import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.map.Map;

import gui.GameFrame;


public class Main {

	public static void main(String[] args) {
		Map map = new Map(40, 40);
		GameFrame gameFrame = new GameFrame();
	}
	

}
