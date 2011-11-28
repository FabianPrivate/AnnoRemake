package model.buildings;

import model.Resource;

public class ProductionBuilding extends Building{
	private Resource producedResource;
	private double currentAmount;
	private double amountProducedPerTick;

	public ProductionBuilding(int x, int y, BuildingPlan buildingPlan, Resource producedResource, double amountProducedPerTick) {
		super(x, y, buildingPlan);
		this.producedResource = producedResource;
		this.amountProducedPerTick = amountProducedPerTick;
	}

	//TODO efficiency....
	public ProductionAmountSet getProduction() {
		String currentAmount = String.valueOf(this.currentAmount);
		String[] values = currentAmount.split(".");
		int amount = Integer.parseInt(values[0]);
		this.currentAmount = Double.parseDouble(("0." + values[1]));
		return new ProductionAmountSet(amount);
	}
	
	public class ProductionAmountSet {
		private Resource resource;
		private int amount;
		
		public ProductionAmountSet(int amount) {
			this.resource = producedResource;
			this.amount = amount;
		}

		public Resource getResource() {
			return resource;
		}

		public int getAmount() {
			return amount;
		}
		
	}
		
		

}
