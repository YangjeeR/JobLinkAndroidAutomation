package plentyofJobsAutomationbase;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelDataProvider {
	
	public String email;
	public String newPassword;
	public String confirmPassword;

	public ExcelDataProvider() throws IOException{
	
		
	String projectPath=System.getProperty("user.dir");
	FileInputStream fis = new FileInputStream(projectPath+"/src/main/resources/file/POJ_dataset.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
	                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	
	int rowcount = sheet.getLastRowNum();
	int colNum = row.getLastCellNum();
	System.out.println(rowcount);
	System.out.println(colNum);
	/*int j=0;
	for(int i=1;i<=rowcount;i++)
	{
	  for(j=0;j<=i+1;j++)
	  {
	
		System.out.println(sheet.getRow(i).getCell(j));

	  }
	  
	
	}*/
	
	XSSFRow row1=sheet.getRow(1);
	
	//Create a cell object to retreive cell at index 5
	XSSFCell cell1=row1.getCell(0);
    
    //Get the address in a variable
     email= cell1.getStringCellValue();
	
	XSSFRow row2=sheet.getRow(1);
	
	//Create a cell object to retreive cell at index 5
	XSSFCell cell2=row2.getCell(1);
    
    //Get the address in a variable
     newPassword= cell2.getStringCellValue();
    
    
	XSSFRow row3=sheet.getRow(1);
	
	//Create a cell object to retreive cell at index 5
	XSSFCell cell3=row3.getCell(2);
    
    //Get the address in a variable
     confirmPassword= cell3.getStringCellValue();
	
		/*System.out.println(sheet.getRow(1).getCell(1));
		   newPassword=sheet.getRow(1).getCell(2).toString();
		   confirmPassword=sheet.getRow(1).getCell(3).toString();*/
		   System.out.println(email);
		   System.out.println(newPassword);
		   System.out.println(confirmPassword);

	
	}
	

	
	 // Get email
	  public String getEmail() {
	    return email;
	  }
	  
	  // set email
	  public void setEmail(String email) {
	    this.email = email;
	  }
	  
	  // Get newPassword
	  public String getnewPassword() {
	    return newPassword;
	  }
	  
	  // Set newPassword
	  public void setnewPassword(String newPassword) {
	    this.newPassword = newPassword;
	  }
	  
	  
	  // Get confirmPassword
	  public String getconfirmPassword() {
	    return confirmPassword;
	  }
	  
	  // set confirmPasword
	  public void setconfirmPassword(String confirmPassword) {
	    this.confirmPassword = confirmPassword;
	  }
	
}
