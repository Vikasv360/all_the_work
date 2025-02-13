package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestValidationsData {

	// Working
	// Identify TC's column by scanning the 1st row
	// Once column is identified then scan entire TC's column to identify difference
	// TC row(ex: Purchase)
	// After you grab purchase TC row, Pull all the data of that row and feed into
	// test

	public ArrayList<String> getData(String testCaseName) throws IOException {

		ArrayList<String> arr = new ArrayList<String>();

		// This requires a fileInputStream for accessing the file
		FileInputStream fil = new FileInputStream("C:\\Users\\vikasv\\Downloads\\TestDataExcel.xlsx");

		// To perform excel actions we have to create an object of XSSFWorkbook class
		XSSFWorkbook workbook = new XSSFWorkbook(fil);

		// To get the count of sheets present in excel
		int sheetCount = workbook.getNumberOfSheets();

		for (int i = 0; i < sheetCount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify the TC column by scanning the entire 1st row

				Iterator<Row> rows = sheet.rowIterator(); // sheet is a collection of rows
				Row firstRow = rows.next();

				Iterator<Cell> ce = firstRow.cellIterator();// Row is collection of cells

				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell cellValue = ce.next();
					if (cellValue.getStringCellValue().equalsIgnoreCase("Testcases")) {

						column = k;
					}
					k++;
				}

				System.out.println(column);

				// Once column is identified then scan entire TC's column to identify difference
				// TC row(ex: Purchase)
				while (rows.hasNext()) {

					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						// After you grab purchase TC row, Pull all the data of that row and feed into
						// test

						Iterator<Cell> cv = r.cellIterator();

						while (cv.hasNext()) {

							Cell c = cv.next();

							if (c.getCellType() == CellType.STRING) {
								arr.add(c.getStringCellValue());
							} else {

								arr.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}

						}

					}

				}

			}
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {

	}

}
