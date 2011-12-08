package readers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.Model;
import model.Resource;
import model.buildings.BuildingPlan;
import model.civillians.CivillianType;

public class CivilianReader {
	
	public HashMap<String, CivillianType> read(String fileName) {
		HashMap<String, CivillianType> civilianTypes = new HashMap<String, CivillianType>();
		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(0);
			for (int i = 1; i < sheet.getRows(); i++) {
				String name = sheet.getCell(0, i).getContents();
				String needsString[] = sheet.getCell(1, i).getContents().split(";");
				HashMap<Resource, Double> needs = new HashMap<Resource, Double>();
				for (String s : needsString ) {
					String values[] = s.split(",");
					Resource resource = Model.getInstance().getResource(values[0]);
					Double amount = Double.valueOf(values[1]);
					needs.put(resource, amount);
				}
				CivillianType civillianType = new CivillianType(name, needs);
				civilianTypes.put(name, civillianType);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return civilianTypes;
	}
}