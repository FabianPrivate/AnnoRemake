

import model.Model;
import model.map.Map;

import gui.GameFrame;


public class Main {

	public static void main(String[] args) {
		Model model = Model.getInstance();
		model.addTypes();
		Map map = new Map(1000, 1000);
		GameFrame gameFrame = new GameFrame();
		
	}
	

}
