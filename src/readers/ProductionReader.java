package readers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.Model;
import model.Resource;
import model.buildings.BuildingPlan;
import model.buildings.HousePlan;
import model.buildings.ProductionPlan;
import model.civillians.CivillianType;

public class ProductionReader {
	
	public ProductionPlan read(String fileName,BuildingPlan buildingPlan, int i) {
		ProductionPlan productionPlan = null;
 		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(3);
			String type = sheet.getCell(0,i).getContents();
			Resource resource = Model.getInstance().getResource(sheet.getCell(1,i).getContents());
			double amountProduced = Double.parseDouble(sheet.getCell(2,i).getContents());
			productionPlan = new ProductionPlan(buildingPlan, resource, amountProduced);
			productionPlan = typeSwitch(fileName, type, productionPlan, i);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productionPlan;
	}
	
	public ProductionPlan typeSwitch(String fileName, String type, ProductionPlan productionPlan, int i ) {
		ProductionPlan plan = productionPlan;
		if (type.equals("FARM")) {
		}
		return plan;
	}

}
