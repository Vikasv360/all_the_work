package testNGIntegration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Excel {

	public void getData() throws IOException {
		
		FileInputStream fil = new FileInputStream("C:\\Users\\vikasv\\Downloads\\TestDataProvider.xlsx");
		XSSFWorkbook workBook =  new XSSFWorkbook(fil);
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
	
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=0;i<rowCount-1;i++) {
			
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				
				System.out.println(row.getCell(j));
			}
		}
	}
}
