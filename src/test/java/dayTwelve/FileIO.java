package dayTwelve;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIO {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\khale\\IdeaProjects\\MayAutomation\\src\\test\\java\\dayTwelve\\testData.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("TestData");
            Row row = sheet.getRow(1);
            Cell cell = row.getCell(0);

            System.out.println(cell);

            System.out.println(sheet.getLastRowNum());
            System.out.println(row.getLastCellNum());

            wb.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("couldn't read the file");
            System.out.println("file location may have been changed");
        }


    }
}
