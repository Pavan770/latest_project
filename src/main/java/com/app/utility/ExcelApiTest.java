package com.app.utility;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
public class ExcelApiTest
{
    public FileInputStream fis = null;
    public FileOutputStream fos = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    String xlFilePath;
 
    public ExcelApiTest(String xlFilePath) throws Exception
    {
        this.xlFilePath = xlFilePath;
        fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }
 
    public boolean setCellData(String sheetName, String string, int rowNum, String value)
    {
        try
        {
            int col_Num = -1;
            sheet = workbook.getSheet(sheetName);
             row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(string))
                {
                    col_Num = i;
                }
            }
 
            sheet.autoSizeColumn(col_Num);
            row = sheet.getRow(rowNum - 1);
            if(row==null)
                row = sheet.createRow(rowNum - 1);
 
            cell = row.getCell(col_Num);
            if(cell == null)
                cell = row.createCell(col_Num);
 
            cell.setCellValue(value);
 
            fos = new FileOutputStream(xlFilePath);
            workbook.write(fos);
            fos.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return  false;
        }
        return true;
    }
    
    public static String generateRandomString2(String data) throws Throwable {
    	// static String getAlphaNumericString(int n)
    	// {



    	// chose a Character random from this String
    	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";



    	// create StringBuffer size of AlphaNumericString
    	StringBuilder sb = new StringBuilder(data);



    	for (int i = 0; i < Integer.parseInt(data); i++) {



    	// generate a random number between
    	// 0 to AlphaNumericString variable length
    	int index = (int) (AlphaNumericString.length() * Math.random());



    	// add Character one by one in end of sb
    	sb.append(AlphaNumericString.charAt(index));
    	}
    	System.out.println(sb.toString());
    	// String random =sb.toString();
    	// System.out.println("variable data ="+" "+random);
    	return sb.toString();
    	// }
    }
  
    }