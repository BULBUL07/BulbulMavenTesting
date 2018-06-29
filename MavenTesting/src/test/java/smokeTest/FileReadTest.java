package smokeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FileReadTest {
  @Test
  public void ReadExcel() {
	  
	  try {
		  // Specify the path of file
		  File src=new File("C:\\Users\\USER\\Desktop\\Automation\\TestData.xlsx");
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheet only
		      XSSFSheet sh1= wb.getSheetAt(0);
		 
		  // getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		 System.out.println(sh1.getLastRowNum());
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		// System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());

		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
	  
	  
	  
	  
  }
}
