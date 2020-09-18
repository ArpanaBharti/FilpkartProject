package annotationFrameBrowser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchDatafromExcel1 {

public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("H:\\AB_handlingFile\\TestCaseData.xlsx.xls");
		Workbook book= WorkbookFactory.create(file);
		Sheet sh=book.getSheet("MyData");
		Row row=sh.getRow(1);
		Cell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		double numericValue = cell.getNumericCellValue();
		System.out.println("Value from excel is:"+ value);
		System.out.println("Value from excel is:"+ numericValue);

	}
}
