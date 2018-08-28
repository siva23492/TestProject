package sampleselenium.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLRead {

	public static void main(String[] args) throws IOException {
    File src=new File("D:\\SELENIUM\\SampleData.xlsx");
    FileInputStream fs=new FileInputStream(src);
    XSSFWorkbook wb=new XSSFWorkbook(fs);
   XSSFSheet st=wb.getSheetAt(0);
	int rowcount =st.getLastRowNum();
	System.out.println(rowcount);
	for(int i=0;i<rowcount;i++) {
		String data=st.getRow(1).getCell(1).getStringCellValue();
		System.out.println("data from row" +i+" is" + data);
		
	}
	
	}
	

}
