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
import model.civillians.needs.Need;
import model.civillians.needs.ResourceNeed;

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
				ArrayList<Need> needs = new ArrayList<Need>();
				for (String s : needsString ) {
					String values[] = s.split(",");
					Resource resource = Model.getInstance().getResource(values[0]);
					Double amount = Double.valueOf(values[1]);
					ResourceNeed resourceNeed = new ResourceNeed(resource, amount);
					needs.add(resourceNeed);
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