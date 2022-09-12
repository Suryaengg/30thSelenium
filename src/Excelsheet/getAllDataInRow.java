package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInRow 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\30 apr\\30thApr.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastcell = sh.getRow(1).getLastCellNum()-1;
		
		for (int i = 0; i <=lastcell; i++) 
		{
			String s1 = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.print(s1+" ");
			
		}
	}
}
