package sampleselenium.com;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLWrite {

	public static void main(String[] args) throws InterruptedException, IOException {
   File src=new File("D:\\SELENIUM\\Siva.xlsx");
   FileInputStream fs=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fs);
   XSSFSheet sheet1=wb.getSheetAt(0);
   sheet1.getRow(0).createCell(2).setCellValue("pass");
   sheet1.getRow(1).createCell(2).setCellValue("fail");
   FileOutputStream fout=new FileOutputStream(src);
   wb.write(fout);
   String sht=sheet1.getRow(0).getCell(0).getStringCellValue();
   System.out.println("Data From Sheet is" +sht);

   
   
   
	}

}
