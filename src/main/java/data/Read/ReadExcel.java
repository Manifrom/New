package data.Read;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

    @Test
    public String[][] readExcel(String sheetName) throws IOException {
        
        XSSFWorkbook wbook = new XSSFWorkbook("./data/"+sheetName+".xlsx");
        XSSFSheet sheet = wbook.getSheet("Sheet1");
        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);
        XSSFRow row = sheet.getRow(0);
        
        int lastCellNum = row.getLastCellNum();
        System.out.println(lastCellNum);
        
        String [][] data = new String[lastRowNum][lastCellNum];
        
        for (int i = 1; i <= lastRowNum; i++) {
            XSSFRow row2 = sheet.getRow(i);
            
            for (int j = 0; j < lastCellNum; j++) {
                XSSFCell cell = row2.getCell(j);
                String cellValue = cell.getStringCellValue();
                System.out.println(cellValue);
                
                data[i-1][j] = cellValue;
                
            }
            
        }
        wbook.close();
        return data;
    }


}