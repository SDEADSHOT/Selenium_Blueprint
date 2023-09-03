package datadriver_dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Foxtrott {
	@DataProvider
	public static String[][] dataProvider() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Excel\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String sheetName = sheet.getSheetName();
		// System.out.println("The name of the Sheet = " + sheetName);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[numberOfRows][numberOfCells];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCells; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
				// System.out.print(val + " ");
			}
			//System.out.println();
		}
//		for (String[] arr : data) {
//			System.out.println(Arrays.toString(arr));
//		}
		return data;
	}
}
