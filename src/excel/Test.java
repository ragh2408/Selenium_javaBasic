package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		String current_path = System.getProperty("user.dir");
		File file1 = new File(current_path + "\\report.xlsx");
		FileInputStream fis = new FileInputStream(file1);
		Workbook excelbook = WorkbookFactory.create(fis);
		Sheet sheet = excelbook.getSheetAt(0);
		int lst_row = sheet.getLastRowNum();
		
		System.out.println("-----"+lst_row);
		
		FileOutputStream fos = new FileOutputStream(file1);
		excelbook.write(fos);
		excelbook.close();

	}

}
