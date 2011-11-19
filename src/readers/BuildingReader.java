package readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import model.buildings.BuildingPlan;

import jxl.Sheet;

import jxl.Workbook;

public class BuildingReader {
	protected String name;
	
	protected InputStreamReader inputStreamReader;
	protected BufferedReader input;
	
	public BuildingPlan read(String fileName) {
		File inputWorkbook = new File(fileName);
        Workbook w;
        try {	
        	w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0); 
            name = sheet.getC
        } catch (Exception e) {
			// TODO: handle exception
		}
        
	}

}
