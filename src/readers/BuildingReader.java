package readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import fileReaders.Sheet;

import jxl.Workbook;

public class BuildingReader {
	protected String name;
	
	protected InputStreamReader inputStreamReader;
	protected BufferedReader input;
	
	public void read(String fileName) {
		File inputWorkbook = new File(fileName);
        Workbook w;
        try {	
			  w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0); 
        }
        
	}

}
