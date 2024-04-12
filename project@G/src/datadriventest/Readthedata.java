package datadriventest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readthedata {

	public static void main(String[] args) throws IOException {
		// ## single file read and print concosle script 
				//Object creation for work book
				XSSFWorkbook  wb=new XSSFWorkbook();
				//for the excel path creation
				File file=new File("C:\\Excel Book\\sheet8.xlsx");
				
				//Object creation for to open Excel file give to writen data	
				OutputStream inputStream = new FileOutputStream(file);
				
			    //Object creation for to create Sheet 
				XSSFSheet sheet1=wb.createSheet("Mummy");
				
				//Object creation for to create coloumn and in sheet1
				XSSFRow row2 = sheet1.createRow(5);
				
				//Object creation for to create cells and in sheet1 
				row2.createCell(2).setCellValue("Ramesh");
				
				 //Object creation for to Get the Sheet 	
				 XSSFSheet sheet2 = wb.getSheet("Mummy");
				//Object creation for to Get the row 
				 XSSFRow row3 = sheet2.getRow(5);
				//Object creation for to Get the coloumn
				 XSSFCell cell = row3.getCell(2);
				
				//To store the data by string in address
				 String address = cell.getStringCellValue();
				System.out.println("Address ="+ address );
				
				//Object creation for to open Excel file
				 OutputStream fileOut = new FileOutputStream(file);
				wb.write(fileOut);
				wb.write(inputStream);
				
	}

}
