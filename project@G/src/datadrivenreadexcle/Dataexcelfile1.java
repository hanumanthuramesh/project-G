package datadrivenreadexcle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataexcelfile1 {
	XSSFWorkbook wb=new XSSFWorkbook();//Golabbaly variable declaration
	XSSFSheet sheet= wb.createSheet();//global variable declaration
	// method1 that for set excle path 
	public Dataexcelfile1(String Excele) throws IOException {
	// Object creation for excel file
	File filepath=new File ("C:\\Excel Book\\sheet8.xlsx");
		FileInputStream fis=new FileInputStream (filepath);// file path store here 
		wb= new XSSFWorkbook(fis);// Attach the file location to the workbook
	}
	public String getData(int sheetnumber, int row, int column) 
	{
		//Object creation for  Sheet creation
		// if you no sheets you can create like-->lly  sheet2= wb.getSheetAt(sheetnumber);
		sheet= wb.getSheetAt(sheetnumber);
		// for get values from rows and coloumn from sheet
		String data= sheet .getRow(row).getCell(column).getStringCellValue();
				
			return data;			
	}
	// for congigaration for  upto consideration 
	public int getRowCount(int sheetIndex) {
		
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();// up to last row
		row = row + 1;
		return row;
		
	}
	
	
	// here every method need to be attached with (or) link with   =wb
	
	
	
	
	
	
	
	
	
	
	
	
	

}
