package smokeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import utilities.CommanUtilities;

public class FileWriteTest {
	@Test
	  public void ReadExcel() {
	try {
		  
		  // Specify the file path which you want to create or write
		 
		  File src=new File("C:\\Users\\USER\\Desktop\\Automation\\TestData.xlsx");
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		 
		 // getRow specify which row we want to read and getCell which column
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 
		 
		// here createCell will create column
		 
		// and setCellvalue will set the value
		 
		 sh1.getRow(0).createCell(2).setCellValue("Bhopal");
		 
		 sh1.getRow(1).createCell(2).setCellValue("Indore");
		 
		 sh1.getRow(2).createCell(2).setCellValue("Dewas");
		 
		 sh1.getRow(3).createCell(2).setCellValue("Vidisha");
		 
		 //set user name value from random string email generator Method
		 sh1.getRow(1).createCell(0).setCellValue(CommanUtilities.getRandomEmail());
		 sh1.getRow(2).createCell(0).setCellValue(CommanUtilities.getRandomEmail());
		 
		 
		 
		 
		// here we need to specify where you want to save file
		 
		 FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\USER\\Desktop\\Automation\\TestData.xlsx"));
		 
		 
		// finally write content 
		 
		 wb.write(fout);
		 
		// close the file
		 
		 fout.close();
		 
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }

}
}
