package model;

public class Clock extends Thread{
	
	public Clock() {
	
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			System.out.println("Tick");
			Model.getInstance().update();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
