package datadriventest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiplesheets_creation {

	public static void main(String[] args) throws IOException {
	
		// ## method single sheet created script 
				//Object creation for work book
		  XSSFWorkbook  wb=new XSSFWorkbook();
		//for the excle file path creation
			File file=new File("C:\\Excel Book\\sheet6.xlsx");
			//Object creation for to open Excle file
			OutputStream fileOut = new FileOutputStream(file);
			
			//Object creation for to create Sheet 1	
				XSSFSheet sheet1=wb.createSheet("Amezon");
				XSSFSheet sheet2=wb.createSheet("Flipcart");
				XSSFSheet sheet3=wb.createSheet("google");
				XSSFSheet sheet4=wb.createSheet("Ramesh");
				
				System.out.println("Sheets Created");
				//For data writen in excle sheet
				wb.write(fileOut);
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
