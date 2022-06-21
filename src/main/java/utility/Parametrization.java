package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
public static String getData(int row,int cell)throws EncryptedDocumentException, IOException { 
		FileInputStream fileInputStream = new FileInputStream("S:\\automation\\Kite3695\\src\\test\\resources\\Get data.xlsx");
		String value = WorkbookFactory.create(fileInputStream).getSheet("credential").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
