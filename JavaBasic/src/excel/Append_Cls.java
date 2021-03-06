package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Append_Cls {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver d=new FirefoxDriver();
		//String s=timestamp();
		//System.out.println(s);
		String exp="niwas";
		if (exp.equalsIgnoreCase("niwasr")){
			String[]  ar={"LeadCreate","Sales","name","Pass"} ;
			finalreport(ar);
		}else {
			
			String screenshotpath=snapshot(d, "loginpg");
			String[]  ar={"LeadCreate","Sales","name","Fail",screenshotpath} ;
			finalreport(ar);
		}
		
		//System.out.println('"');      
	}
	
	
	public static void appendm(String[] appendar) throws InvalidFormatException, IOException{
		FileInputStream fis= new FileInputStream(ExcelWrite.reportfilepath);
	      Workbook wbook       =WorkbookFactory.create(fis);
	  int    rcnt= wbook.getSheet("reportsheet").getLastRowNum();
	  rcnt=rcnt+1;
	Row rowobj=  wbook.getSheet("reportsheet").createRow(rcnt);
	CellStyle  styleobj=wbook.createCellStyle();
	
	short color_num=IndexedColors.RED.getIndex();
	styleobj.setFillForegroundColor(color_num);
	short pattrn_num=CellStyle.SOLID_FOREGROUND;
	
	styleobj.setFillPattern(pattrn_num);
	
	int l=  appendar.length;
	for (int i=0;i<l;i++){
		if (appendar[3]=="Fail"){
			if (i==4){
				
				Cell cellobj=	rowobj.createCell(i);
				cellobj.setCellFormula("HYPERLINK("+'"'+appendar[l-1]+'"'+","+'"'+"linkname"+'"'+")");
				
			}else {
			
				Cell cellobj=	rowobj.createCell(i);
				cellobj.setCellValue(appendar[i]);
				cellobj.setCellStyle(styleobj);
			}
			
			
			
		}else{
		
	Cell cellobj=	rowobj.createCell(i);
	cellobj.setCellValue(appendar[i]);
		}
	}
	
	FileOutputStream fos= new FileOutputStream(ExcelWrite.reportfilepath)  ;   
	wbook.write(fos);
	  
	}
	
	public static void finalreport(String[] apar ) throws IOException, InvalidFormatException{
		
		File fileobj=new File(ExcelWrite.reportfilepath);
		if (fileobj.exists()==false){
			String[] ar={"TCname","Modulename","Elementname","Status","Snapshot"};
			ExcelWrite.createreportsheet(ar);
			
		}
		
		appendm(apar);
		
		
		
		
		
	}
	
public static String timestamp(){
	String str=DateFormat.getDateTimeInstance().format(new Date());
	str=str.replaceAll(":", "_");
	return str;
		
	}
public static String snapshot(WebDriver d,String imagename) throws IOException{
	String ts=timestamp();
	String snappath="snap/"+ts+imagename+".jpeg";
	
	
	                      TakesScreenshot        screenshotobj=(TakesScreenshot) d;
	                      
	                     File  screenshot= screenshotobj.getScreenshotAs(OutputType.FILE);
	                     
	                     File      despath=       new File(snappath);
	                     snappath=     despath.getAbsolutePath();
	                     
	                     FileUtils.copyFile(screenshot, despath);
	                     
	return snappath;
	
	
	
}
	
	
	

}
