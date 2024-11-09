package demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class Test8_DDT_excel {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle cs;
	
	public static int getrowcount(String xlfile, String xlsheet) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		// row = ws.getRow(rownum);
		// cell = row.getCell(colnum);
		int rowcount =ws.getLastRowNum();
		wb.close();
		fi.close();
		
		return rowcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
