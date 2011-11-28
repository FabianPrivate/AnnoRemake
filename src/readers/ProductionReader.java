package readers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.Model;
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
			HashMap<String, CivillianType> civillianTypes = Model.getInstance().getCivillianTypes();
			CivillianType civillianType = civillianTypes.get(sheet.getCell(0,i).getContents());
			int numberOfInhabitants = Integer.parseInt(sheet.getCell(1,i).getContents());
			productionPlan = new ProductionPlan(buildingPlan);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productionPlan;
		
	}

}
