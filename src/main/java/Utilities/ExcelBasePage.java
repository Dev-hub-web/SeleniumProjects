package Utilities;

import Pages.basePage;
import Pages.loginPage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelBasePage extends basePage{
    private WebDriver driver;

    public ExcelBasePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public static List<Object[]> getTestData(String filePath, String sheetName) {
        List<Object[]> testData = new ArrayList<>();

        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            int maxRows = Math.min(1, sheet.getLastRowNum());  // ✅ Limit to 2 rows

            for (int rowNum = 1; rowNum <= maxRows; rowNum++) {  // ✅ Start from row 1, stop at row 2
                Row row = sheet.getRow(rowNum);
                if (row != null) {  // ✅ Prevent NullPointerException if a row is empty
                    String firstName = row.getCell(0).getStringCellValue(); // Column 1
                    String surName = row.getCell(1).getStringCellValue();// Column 2
                    String email = row.getCell(2).getStringCellValue();// Column 1
                    String psw = row.getCell(3).getStringCellValue();// Column 2
                    testData.add(new Object[]{firstName, surName, email, psw});
                }
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData;
    }

    public void readExceldata() {
        String filePath = "/Users/hamza/Library/CloudStorage/OneDrive-Personal/Documents/LoginData.xlsx";
        String sheetName = "loginData";
        List<Object[]> testData = ExcelBasePage.getTestData(filePath, sheetName);

        for (Object[] data : testData) {
            String firstName = (String) data[0];
            String surName = (String) data[1];
            String email = (String) data[2];
            String psw = (String) data[3];

            loginPage homepage = new loginPage(driver);
            homepage.setFirstNameNsurName(firstName, surName, email, psw);


            System.out.println("Test executed with firstName: " + firstName);
            System.out.println("Test executed with surName: " + surName);
            System.out.println("Test executed with email: " + email);
            System.out.println("Test executed with password: " + psw);

        }
    }
    public void setData(String firstname, String surname, String email, String psw){

    }
}
