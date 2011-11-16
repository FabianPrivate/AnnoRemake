package model.civillians;

public class Subneed {
	private String name;
	private int satisfactionLevel = 0;

	public Subneed(String name, int consumptionPerTime) {
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSatisfactionlevel() {
		return satisfactionLevel;
	}
}
