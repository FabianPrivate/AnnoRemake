package model.civillians;

import java.util.ArrayList;

public class CivillianType {
	private final String name;
	private ArrayList<Need> needs;
	
	public CivillianType(String name, ArrayList<Need> needs) {
		this.name = name;
		this.needs = needs;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Need> getNeeds() {
		return needs;
	}

}
