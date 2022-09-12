package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInCol 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
FileInputStream file = new FileInputStream("C:\\30 apr\\30thApr.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	}
}
