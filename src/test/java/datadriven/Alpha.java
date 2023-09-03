package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alpha {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Excel\\DataDrivenFromExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String sheetName = sheet.getSheetName();
		System.out.println("The name of the Sheet = " + sheetName);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getLastCellNum();
		// for (int i = 0; i < numberOfRows; i++) {
		for (int i = 1; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCells; j++) {
				String val = sheet.getRow(i).getCell(j).toString();
				System.out.print(val + "  ");
			}
			System.out.println();
		}
	}
}
