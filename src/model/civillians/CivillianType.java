package model.civillians;

import java.util.ArrayList;
import java.util.HashMap;

import model.Resource;
import model.civillians.needs.Need;

public class CivillianType {
	private String name;
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
