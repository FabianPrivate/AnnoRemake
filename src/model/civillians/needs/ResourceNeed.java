package model.civillians.needs;

import model.Resource;

public class ResourceNeed extends Need {
	private Resource resource;
	private double amountConsumed;
	
	public ResourceNeed(Resource resource, double amountConsumed) {
		this.resource = resource;
		this.amountConsumed = amountConsumed;
	}
	
	public Resource getResource() {
		return resource;
	}
	
	public double getAmount(){
		return amountConsumed;
	}
	
	public void update() {
		
	}
	
	

}
