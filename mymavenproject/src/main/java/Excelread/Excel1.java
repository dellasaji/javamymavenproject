package Excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;//XSSFCell- Represents a cell in the excel sheet. 
import org.apache.poi.xssf.usermodel.XSSFRow;//represents a row in teh excel sheet 
import org.apache.poi.xssf.usermodel.XSSFSheet;//represents a sheet in teh excel sheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook;//represents the entireworkbook in teh excel sheet

public class Excel1 
{
   static FileInputStream f;//A static variable to hold the file input stream object.
   static XSSFWorkbook w;//A static variable to hold the Workbook object 
   static XSSFSheet s;//A static variable to hold the sheet object .
   
   public static String getstringdata(int a, int b) throws IOException//reads string value from excel (row,col)
   {
	   f = new FileInputStream("C:\\Users\\della\\Downloads\\Excelsheet1.xlsx");
	   w = new XSSFWorkbook(f); 
	   s =w.getSheet("Sheet1");
	   XSSFRow r = s.getRow(a);
	   XSSFCell c =r.getCell(b);
	   return c.getStringCellValue();
   }
   
   public static String getintegerdata(int a, int b) throws IOException
   {
	   f = new FileInputStream("C:\\Users\\della\\Downloads\\Excelsheet1.xlsx");
	   w = new XSSFWorkbook(f);
	   s =w.getSheet("Sheet1");
	   XSSFRow r = s.getRow(a);
	   XSSFCell c =r.getCell(b);
	   //return c.getStringCellValue();
	   int x = (int) c.getNumericCellValue();
	   return String.valueOf(x);
   }
}
