package Utilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLdata {

    @DataProvider(name="testData")

    public Object[][] getData(Method m) throws EncryptedDocumentException,IOException
    {
        String excelSheetName=m.getName();
        //create an object of File class to open Excel file
        File file=new File("C:\\Users\\express\\IdeaProjects\\Facebook_Automation_Task\\resources\\testData.xlsx");
        //create an object of FileInputStream class to read Excel file
        FileInputStream inputStream=new FileInputStream(file);
        // Factory for creating the appropriate kind of Workbook(HSSF or XSSF)
        Workbook wb= WorkbookFactory.create(inputStream);
        Sheet sheetName=wb.getSheet(excelSheetName);
        //to know the number of rows and columns
        int totalRowCount=sheetName.getLastRowNum();
        Row rowCells=sheetName.getRow(0);
        int totalColCount=rowCells.getLastCellNum();
        //to format the data to store it as we need (Ex. string)
        DataFormatter format=new DataFormatter();

        String testData[][]=new String [totalRowCount][totalColCount];
        for(int i=1;i<=totalRowCount;i++)
        {
            for(int j=0;j<totalColCount;j++)
            {
                testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
            }
        }
        return testData;


    }

}
