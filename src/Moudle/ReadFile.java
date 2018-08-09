package Moudle;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream; 
import jxl.Sheet;  
import jxl.Workbook;  
import jxl.read.biff.BiffException;

import java.util.*;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class ReadFile {
	public HashMap readExcelFile(int line) {
		try {
			HashMap m = new HashMap();
			InputStream in = new FileInputStream("C:\\work\\test\\MyTest\\src\\data\\api.xls");
			Workbook wb = Workbook.getWorkbook(in);
			int sheet_size = wb.getNumberOfSheets();
			Sheet sheet = wb.getSheet(0);
			int colunms = sheet.getColumns();	
			for(int j = 1;j<colunms;j++) {
				m.put(j, sheet.getCell(j, line).getContents());
//				System.out.println(m.get(j));
			}
			return m;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Properties readConfigFile() {
		try {
			File file = new File("C:\\work\\test\\MyTest\\src\\config\\config.properties");
			InputStream in = new FileInputStream(file);
			Properties pro = new Properties();
			pro.load(in);
//			System.out.println(pro.getProperty("ip"));
			return pro;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String args[]) {
		ReadFile r = new ReadFile();
		r.readConfigFile();
		Properties p = new Properties();
		p = r.readConfigFile();
//		System.out.println(p.getProperty("ip"));
	}
}
