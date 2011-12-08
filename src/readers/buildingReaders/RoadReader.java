package readers.buildingReaders;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import model.buildings.BuildingPlan;
import model.buildings.RoadPlan;

public class RoadReader {
	

	public RoadPlan read(String fileName,BuildingPlan buildingPlan, int i) {
		RoadPlan roadPlan = null;
 		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(2);
			roadPlan = new RoadPlan(buildingPlan);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return roadPlan;
		
	}
	

}
