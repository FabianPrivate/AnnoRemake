package model.civillians.needs;

import java.util.ArrayList;
import java.util.HashMap;

import model.Resource;

public class Need{	
	private int satisfactionlevel = 0;
		
	public Need() {
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
