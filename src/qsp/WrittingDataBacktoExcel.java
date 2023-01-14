package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDataBacktoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream fis = new FileInputStream("C:\\\\Users\\\\USER\\\\Desktop\\\\testdata1.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
     wb.getSheet("createcustomer").getRow(1).getCell(2).setCellValue("pass");
     FileOutputStream fos = new FileOutputStream("./data/testdata1.xlsx");
     wb.write(fos);
     wb.close();
     
     
     
	}

}
