package readers;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.buildings.BuildingPlan;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BuildingReader {
	 	
	protected InputStreamReader inputStreamReader;
	protected BufferedReader input;
	

	public ArrayList<BuildingPlan> read(String fileName) {
		ArrayList<BuildingPlan> buildingPlans = new ArrayList<BuildingPlan>();
		BuildingPlan buildingPlan = null;
		File inputWorkbook = new File(fileName);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			Sheet sheet = w.getSheet(0);
			for (int i = 1; i < sheet.getRows(); i++) {
				String type = sheet.getCell(0, i).getContents();
				String name = sheet.getCell(1, i).getContents();
				System.out.println(name);
				String[] colorValues = sheet.getCell(2,i).getContents().split(",");
				int [] values = {Integer.parseInt(colorValues[0]),Integer.parseInt(colorValues[1]), Integer.parseInt(colorValues[2])};
				Color color = new Color(values[0], values[1], values[2]);
				int width = Integer.parseInt(sheet.getCell(3,i).getContents());
				int height = Integer.parseInt(sheet.getCell(4,i).getContents());
				buildingPlan = new BuildingPlan(name, color, width, height);
				buildingPlan = typeSwitch(fileName,type, buildingPlan, i);
				buildingPlans.add(buildingPlan);	
			}

		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buildingPlans;
	}
	
	public BuildingPlan typeSwitch(String fileName, String type, BuildingPlan buildingPlan, int i ) {
		BuildingPlan plan = buildingPlan;
		if (type.equals("HOUSE")) {
			HouseReader houseReader = new HouseReader();
			plan = houseReader.read(fileName, buildingPlan,  i);
		} else if (type.equals("ROAD")) {
			RoadReader roadReader = new RoadReader();
			plan  = roadReader.read(fileName, buildingPlan, i);
		}
		return plan;
	}
	

}
