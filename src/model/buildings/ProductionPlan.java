package model.buildings;

import model.Resource;

public class ProductionPlan extends BuildingPlan{
	private Resource resource;
	private double amountProduced;

	public ProductionPlan(BuildingPlan buildingPlan, Resource resource, double amountProduced ) {
		super(buildingPlan);
		this.setResource(resource);
		this.setAmountProduced(amountProduced);
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Resource getResource() {
		return resource;
	}

	public void setAmountProduced(double amountProduced) {
		this.amountProduced = amountProduced;
	}

	public double getAmountProduced() {
		return amountProduced;
	}

}
