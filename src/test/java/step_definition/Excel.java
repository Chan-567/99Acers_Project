package step_definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
 
public class Excel 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Excel(String filepath) {
		try {
		File f=new File(filepath);
		FileInputStream fis;
			fis = new FileInputStream(f);
			wb=new XSSFWorkbook(fis);
 
	        }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		public String getdata(int sheetno,int rowno,int cell) {
			sheet=wb.getSheetAt(sheetno);
		//	DataFormatter formatter = new DataFormatter();
			// Cell cell1 = sheet.getRow(rowno).getCell(cell);
			// String data0= cell1.getStringCellValue();
		//	 cell1.setCellType(Cell.CELL_TYPE_STRING);
			String data=new DataFormatter().formatCellValue(sheet.getRow(rowno).getCell(cell));	
			return data;
		}
		public int getRowCount(int sheetindex) {
			int row=wb.getSheetAt(sheetindex).getLastRowNum();
			//row=row+1;
			return row;
			}	
			/*
			 * public String[] getData() throws IOException { File excelFile = new
			 * File("./src/test/resources/Acres.xlsx");
			 * System.out.println(excelFile.exists()); FileInputStream fis = new
			 * FileInputStream(excelFile); XSSFWorkbook workbook = new XSSFWorkbook(fis);
			 * XSSFSheet sheet = workbook.getSheet("Sheet1"); int rows =
			 * sheet.getPhysicalNumberOfRows(); int cols = sheet.getRow(0).getLastCellNum();
			 * String[] data = new String[rows]; for(int i=0;i<rows-1;i++) { for(int
			 * j=0;j<cols;j++) { DataFormatter df = new DataFormatter(); data[i] =
			 * df.formatCellValue(sheet.getRow(i+1).getCell(j)); //
			 * sheet.getRow(i).getCell(j).getStringCellValue(); } } for(int
			 * i=0;i<rows-1;i++) { System.out.println(i); }
			 * 
			 * workbook.close(); fis.close(); return data;
			 * 
			 * 
			 * 
			 * }
			 */
 
}