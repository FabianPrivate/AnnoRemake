package model.civillians;

import java.util.ArrayList;

public class CivillianType {
	private final String name;
	private ArrayList<Need> needs;
	
	public CivillianType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
