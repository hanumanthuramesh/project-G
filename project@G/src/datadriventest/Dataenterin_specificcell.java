package datadriventest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataenterin_specificcell {

	public static void main(String[] args) throws IOException {
		// ## method Data enter into multiplecells script 
		//Object creation for work book
		XSSFWorkbook  wb=new XSSFWorkbook();
		//for the excle file path creation
			File file=new File("C:\\Excel Book\\sheet6.xlsx");
			//Object creation for to open Excle file
			OutputStream fileOut = new FileOutputStream(file);
			//Object creation for to create Sheet 1	
			XSSFSheet sheet1=wb.createSheet("Rameshfile");
			//Object creation for to create row 1 and in sheet1 
			XSSFRow row1=sheet1.createRow(17);
			//Object creation for to create cell 1 and in sheet1 
			row1.createCell(4).setCellValue("H.Ramesh");
			
			
			
			
			//For data writen in excle sheet
			wb.write(fileOut);
		
		
		
		
		
		
		
		
		
	}

}
