package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;
	
    public static String excelFilePath = System.getProperty("user.dir")+"/src/test/resources/Data/TryEditorData.xlsx";
	
	
	public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
		
//		String path = System.getProperty("user.dir")+"/src/test/resources/Data/TryEditorData.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		 workbook = new XSSFWorkbook(fis);
		 sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		String cellValue = cell.getStringCellValue();
//		System.out.println(cellValue);
	}
		
		public String getCellData(int rowNum, int cellNum) {
			
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String cellData = cell.getStringCellValue();
			return cellData;
			
		}
		
		 public int getRowCountInSheet(){
             int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
             return rowcount;
          }
		
		
//		 public String getCellData(int rowNumber,int cellNumber){
//             //getting the cell value from rowNumber and cell Number
//              cell =sheet.getRow(rowNumber).getCell(cellNumber);
//              
//              //returning the cell value as string
//              return cell.getStringCellValue();
//          }


	public static void main(String[] args) {
		
		
		
	}
}