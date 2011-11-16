package model.civillians;

import java.util.ArrayList;

public class Need{	
	private String name;
	private ArrayList<Subneed> subneeds;
	
	private int satisfactionlevel = 0;
		
	public Need(String name, ArrayList<Subneed> subneeds) {
		this.setName(name);
		this.setSubneeds(subneeds);
	
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSubneeds(ArrayList<Subneed> subneeds) {
		this.subneeds = subneeds;
	}

	public ArrayList<Subneed> getSubneeds() {
		return subneeds;
	}

	public void setSatisfactionlevel(int satisfactionlevel) throws Exception {
		if (satisfactionlevel >= 0 && satisfactionlevel <= 100) {
			this.satisfactionlevel = satisfactionlevel;
		} else {
			throw new Exception("Satisfaction not between 0 and 100");
		}
	}

	public int getSatisfactionlevel() {
		return satisfactionlevel;
	}
}
