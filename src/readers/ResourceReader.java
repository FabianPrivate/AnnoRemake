package readers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.Resource;
import model.buildings.BuildingPlan;

public class ResourceReader {
	
	public HashMap<String, Resource> read(String fileName) {
		HashMap<String, Resource> resources = new HashMap<String, Resource>();
		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(0);
			for (int i = 1; i < sheet.getRows(); i++) {
				String name = sheet.getCell(0, i).getContents();
				String type = sheet.getCell(1, i).getContents();
				Resource resource = new Resource(name, type);
				resources.put(name, resource);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resources;
	}
	


}
