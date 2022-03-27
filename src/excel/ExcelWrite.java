package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static String reportfilepath="";



	public static void main(String[] args) throws IOException {
		
		
		String[] ar={"TCname","Modulename","Elementname","Status","Snapshot"};
		System.out.println("+++++++++++++++++++++++++++++++");
	
        createreportsheet(ar);
	}
	
	
	
	public static void createreportsheet(String[] hdrarr) throws IOException{
		String ts=Append_Cls.timestamp();
		reportfilepath="Report/"+ts+"finalreport.xlsx";
		Workbook wbook     =   new XSSFWorkbook();
		Sheet sheetobj=	wbook.createSheet("reportsheet");
	Row rowbj=	sheetobj.createRow(0);
		int lenth=hdrarr.length;
		CellStyle  styleobj=wbook.createCellStyle();
		
		short color_num=IndexedColors.YELLOW.getIndex();
		styleobj.setFillForegroundColor(color_num);
		short pattrn_num=CellStyle.SOLID_FOREGROUND;
		
		styleobj.setFillPattern(pattrn_num);
		
		Font fontobj=wbook.createFont();
	
		fontobj.setFontHeightInPoints((short) 16);
	short 	bold_num=Font.BOLDWEIGHT_BOLD;
		fontobj.setBoldweight(bold_num);
		byte byte_num=Font.U_SINGLE;
		
		fontobj.setUnderline(byte_num);
		styleobj.setFont(fontobj);
		
		
		
		
		for (int i=0;i<lenth;i++){
			Cell cellobj=rowbj.createCell(i);
			
			cellobj.setCellValue(hdrarr[i]);
			cellobj.setCellStyle(styleobj);
		}
		
		 FileOutputStream fos= new FileOutputStream(reportfilepath);
		 wbook.write(fos);
		
		       
	}
	
	
public static void simplewrite() throws IOException{
	
	Workbook wbook     =   new XSSFWorkbook();
	Sheet sheetobj=	wbook.createSheet("tabledata");
	
	
	
	
	for (int i=0;i<=4;i++){
		Row rowobj=sheetobj.createRow(i);
		for (int j=0;j<=3;j++){
			 Cell cellobj=rowobj.createCell(j);
			 cellobj.setCellValue("ram");
		}
	}
	
	
	
	 
	 FileOutputStream fos= new FileOutputStream("data.xlsx");
	 wbook.write(fos);
	
		
	}
	
	
	
	
	
}
