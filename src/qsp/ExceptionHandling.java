package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionHandling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis= new FileInputStream("C:\\Users\\USER\\Desktop\\testdata1.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("createcustomer").getRow(2).getCell(3).getStringCellValue();
		  System.out.println(data);
	}

}
