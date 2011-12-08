package model.civillians;

import java.util.ArrayList;
import java.util.HashMap;

import model.Resource;

public class CivillianType {
	private String name;
	private HashMap<Resource, Double> resourceConsumption = new HashMap<Resource, Double>();
	
	public CivillianType(String name, HashMap<Resource, Double> needs) {
		this.name = name;
		resourceConsumption = needs;
	}

	public String getName() {
		return name;
	}

}
