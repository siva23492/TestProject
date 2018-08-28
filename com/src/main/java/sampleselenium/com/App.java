package sampleselenium.com;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class App {

	
	public static String s1;
	public static void main(String[] args) throws IOException, InvalidFormatException {

		InputStream fis= new FileInputStream("D:\\Siva.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int st = wb.getSheetIndex("Sheet1");
		//System.out.println(st);
		Sheet s=wb.getSheetAt(st);
		int rowcount=s.getLastRowNum();
		for (int i=1;i<rowcount+1;i++)
		{
			Row r = s.getRow(i);
			int cellcount = r.getLastCellNum();
			for (int j=0;j<cellcount;j++)
			{
				Cell c=r.getCell(j);
				if(c.getCellType()==c.CELL_TYPE_STRING)
				{
					s1=c.getStringCellValue();
					System.out.println(s1);
				}
				else if(c.getCellType()==c.CELL_TYPE_NUMERIC)
				{
					s1=String.valueOf(c.getNumericCellValue());
					System.out.println(s1);
				}
				
			}
		}
			
	}

}



