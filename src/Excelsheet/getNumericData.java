package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\30 apr\\30thApr.xlsx");
		double s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(s1);
		
	}
}

