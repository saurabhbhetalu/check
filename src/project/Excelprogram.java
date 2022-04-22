package project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelprogram 
{
	public static void main(String[] agsr) throws IOException
	{
		String excelpath = "G:\\Velocity Classes\\javaexcel.xlsx";
		
		//read excel file
		FileInputStream file = new FileInputStream(excelpath);
		
		//workbook read ---> apache poi
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//sheet read
		XSSFSheet sheet = workbook.getSheet("batch");
		
		//row read
		
		XSSFRow row = sheet.getRow(1);
		
		//cell read
		XSSFCell cell  = row.getCell(0);
		
		//value read--string value --word data
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		//to get the numric value
//		double data1 = cell.getNumericCellValue();
//		
//		//console print
//		System.out.println(data1);
		
	}
	

}
