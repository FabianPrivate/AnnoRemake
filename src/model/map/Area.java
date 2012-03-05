package model.map;

import model.Model;

public class Area { //150 km * 150 km
	
	private int heightLevel;// 1 : 0 - 200m;2 : 200 - 500 m; 3 : 500 - 1000m; 4 : 1000 - 2000; 5: 2000 - 5000
	
	public Area(int x, int y){
	

	}

	
	public void determineHeightLevel(int x, int y) {
		int temp = 0;
		int westHeight = 0;
		int northHeight = 0;
		int eastHeight = 0;
		int southHeight = 0;
		if (Model.getInstance().getWorld().get(x -1).get(y) != null) {
			westHeight = Model.getInstance().getWorld().get(x -1).get(y).getHeightLevel();
			temp++;
		} if (Model.getInstance().getWorld().get(x).get(y-1) != null) {
			northHeight = Model.getInstance().getWorld().get(x).get(y-1).getHeightLevel();
			temp++;
		} if (Model.getInstance().getWorld().get(x +1).get(y) != null ) {
			eastHeight = Model.getInstance().getWorld().get(x +1).get(y).getHeightLevel();
			temp ++;
		} if (Model.getInstance().getWorld().get(x ).get(y + 1) != null) {
			southHeight = Model.getInstance().getWorld().get(x ).get(y + 1).getHeightLevel();
			temp++;
		}
		heightLevel = (int) ((westHeight + northHeight + eastHeight + southHeight) /temp);
	}
	
	
	
	public void setHeightLevel(int heightLevel) {
		this.heightLevel = heightLevel;
	}

	public int getHeightLevel() {
		return heightLevel;
	}
	
}
