package Managers;

import utils.Xls_Reader;

public class ExcelFileReader {
	
	static Xls_Reader reader;
	
	public static String getData(String fileName, String sheetName, String colName, int rowNum) {
		reader = new Xls_Reader("src\\test\\resources\\excelFiles\\"+fileName+".xlsx");
		return reader.getCellData(sheetName, colName, rowNum);
	}
	
	public static String getData(String fileName, String colName, int rowNum) {
		reader = new Xls_Reader("src\\test\\resources\\excelFiles\\"+fileName+".xlsx");
		return reader.getCellData("Sheet1", colName, rowNum);
	}
	
	public static String getData(String fileName, int rowNum) {
		reader = new Xls_Reader("src\\test\\resources\\excelFiles\\"+fileName+".xlsx");
		return reader.getCellData("Sheet1", "Name", rowNum);
	}
	
	
	
//	public static String getData(String fileName, String colName, int startRowNum, int endRowNum) {
//		reader = new Xls_Reader("src\\test\\resources\\excelFiles\\"+fileName+".xlsx");
//		for(int i=startRowNum;i<=endRowNum;i++) {
//			
//		}
//	}
	
	
	
	
	
	//Overloading
	


}
