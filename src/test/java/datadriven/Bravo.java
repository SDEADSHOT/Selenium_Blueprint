package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Bravo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Excel\\DataDrivenFromExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String sheetName = sheet.getSheetName();
		System.out.println("The name of the Sheet = " + sheetName);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCells; j++) {
				if (i > 0 && j == 0) {
					int val = (int) sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(val + "  ");
				}

				else if (i > 0 && j == 4) {
					double val = sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(val + "  ");
				}

				else {
					String val = sheet.getRow(i).getCell(j).toString();
					System.out.print(val + "  ");
				}
			}
			System.out.println();
		}
	}
}
