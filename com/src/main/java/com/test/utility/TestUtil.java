package com.test.utility;

import java.util.ArrayList;

public class TestUtil {
	static Xls_Reader reader;
	public static ArrayList<Object> getExcelData(){
		ArrayList<Object> myData=new ArrayList<Object>();
		try {
		reader=new Xls_Reader("D:\\SELENIUM\\com\\src\\main\\java\\com\\test\\data\\RegistrationformData.xlsx");
		}
		catch(Exception e){
			e.printStackTrace();
						
		}
		for(int rowCount=2;rowCount<=reader.getRowCount("regdata");rowCount++ ){
		String firstName=reader.getCellData("regdata","firstname", rowCount);	
		String lastName=reader.getCellData("regdata","lastname", rowCount);	
		String address=reader.getCellData("regdata","address", rowCount);	
		String email=reader.getCellData("regdata","email", rowCount);	
		String phone=reader.getCellData("regdata","phone", rowCount);	
		Object ob[]={firstName,lastName,address,email,phone};
		myData.add(ob);
			
		}
		return myData;
		
	}

}
