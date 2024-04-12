package datadriventest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataenterintomulplecells {

	public static void main(String[] args) throws IOException {
		// ## method  data entered multiple cells script 
		//Object creation for work book
		 XSSFWorkbook  wb=new XSSFWorkbook();
		//for the excel path creation
		 File file=new File("C:\\Excel Book\\sheet8.xlsx");
		//Object creation for to open Excel file	
			OutputStream fileOut = new FileOutputStream(file);
			//Object creation for to create Sheet 
			XSSFSheet sheet1=wb.createSheet("Rameshfile");
			//print statement
			System.out.println("Sheet Created");
			//Object creation for to create rows and in sheet1 
			XSSFRow row1=sheet1.createRow(1);
			XSSFRow row2=sheet1.createRow(5);
			XSSFRow row3=sheet1.createRow(8);
			//Object creation for to create cells and in sheet1 
			row1.createCell(8).setCellValue("H.Ramesh");
			row1.createCell(1).setCellValue("H.Raj");
			row1.createCell(5).setCellValue("H.Raj");
			//For data writen in excle sheet
			wb.write(fileOut);
			
			
			
			
			
			
			

	}

}
