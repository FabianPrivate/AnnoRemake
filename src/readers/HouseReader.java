package readers;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.Model;
import model.buildings.BuildingPlan;
import model.buildings.HousePlan;
import model.civillians.CivillianType;

public class HouseReader {

	public HousePlan read(String fileName,BuildingPlan buildingPlan, int i) {
		HousePlan housePlan = null;
 		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(1);
			CivillianType civillianType = Model.getInstance().getCivillianTypes().get(sheet.getCell(0,i).getContents());
			int numberOfInhabitants = Integer.parseInt(sheet.getCell(2,i).getContents());
			housePlan = new HousePlan(buildingPlan, civillianType, numberOfInhabitants);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return housePlan;
		
	}

}
