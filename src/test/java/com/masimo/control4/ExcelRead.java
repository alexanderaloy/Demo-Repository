package com.masimo.control4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;
	
	public static String readStringData(int row , int coloumn) throws Exception {
	fis = new FileInputStream("D:\\ExcelReadFrom\\EmployeeDetails.xlsx");    // Reading file from local directory 
	workbook = new XSSFWorkbook(fis);                                		// Create Workbook instance holding reference to .xlsx file
	sheet = workbook.getSheet("Sheet1");                             	   // Get first(desired) sheet from the workbook
	XSSFRow r = sheet.getRow(row);                                            // Getting the Row Index space of sheet
	XSSFCell c = r.getCell(coloumn);                                         // Getting Column Index space of sheet
	return c.getStringCellValue();		                                // Return Value from that Space
	}
    
	public static double readNumericData(int row , int column) throws Exception {
	fis = new FileInputStream("D:\\ExcelReadFrom\\EmployeeDetails.xlsx");
    workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheet("Sheet1");
	XSSFRow r = sheet.getRow(row);
	XSSFCell c = r.getCell(column);
	return c.getNumericCellValue();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.out.println(ExcelRead.readStringData(1,0));
	double d = ExcelRead.readNumericData(1,1);
    System.out.println(d);
	}

}
