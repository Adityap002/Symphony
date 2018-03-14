package com.Symphony.master;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception {
		PropertiesModuleDrivenLiberary propLib = new PropertiesModuleDrivenLiberary();
		
		propLib.openApp();
		/*
		 * data driven for login
		*/
		String filepathLogin = "C:\\Users\\Aditya\\git\\Symphony\\src\\main\\java\\com\\Symphony\\testdata\\SymphonyData.xlsx";
		
		FileInputStream fis =new FileInputStream(filepathLogin);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheetNameLogin = workbook.getSheet("Login");
		int rowCount = sheetNameLogin.getLastRowNum();
		System.out.println("Total number of row is "+rowCount);
		
		for(int i = 1; i<= rowCount; i++)
		{
			XSSFRow wr = sheetNameLogin.getRow(i);
			XSSFCell wc = wr.getCell(0);
			XSSFCell wc1 = wr.getCell(1);
			
			String username = wc.getStringCellValue();
			String pwd = wc1.getStringCellValue();
			
			propLib.adminLogin(username, pwd);
			
		}
		
		
		XSSFSheet sheetNameBranch = workbook.getSheet("nBranch");
		int rowCount1 = sheetNameBranch.getLastRowNum();
		System.out.println("Total Number of row is in nBranch Sheet " +rowCount1);
		
		for(int j = 1; j <= rowCount1; j++){
			XSSFRow branchRow = sheetNameBranch.getRow(j);
			XSSFCell cell1 = branchRow.getCell(0);
			XSSFCell cell2 = branchRow.getCell(1);
			XSSFCell cell3 = branchRow.getCell(2);
			XSSFCell cell4 = branchRow.getCell(3);
			XSSFCell cell5 = branchRow.getCell(4);
			XSSFCell cell6 = branchRow.getCell(5);
			
			String branchName = cell1.getStringCellValue();
			String address = cell2.getStringCellValue();
			String zipCode = cell3.getStringCellValue();
			String country = cell4.getStringCellValue();
			String state = cell5.getStringCellValue();
			String city = cell6.getStringCellValue();
			
			propLib.addBranch(branchName, address, zipCode, country, state, city);
			
		}
		
		workbook.close();
		
		
		propLib.addNewRole("Admin1", "E");
		
		propLib.addEmp("anna", "anna@123", "Admin1", "Madhapur1");
		
		propLib.logoutAndQuitBrowser();

	}

}
