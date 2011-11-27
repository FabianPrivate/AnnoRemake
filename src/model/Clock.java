package model;

public class Clock extends Thread{
	
	public Clock() {
	
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			Model.getInstance().update();
		}
	}

}
