package API.ReusableMethods;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    /**
     * Reads data from the specified Excel file and sheet.
     * @param excelFilePath The path of the Excel file.
     * @param sheetName The name of the sheet to read.
     * @return A list of rows, where each row is a list of cell values.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static List<List<String>> readExcelData(String excelFilePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        List<List<String>> sheetData = new ArrayList<>();

        for (Row row : sheet) {
            List<String> rowData = new ArrayList<>();
            for (Cell cell : row) {
                rowData.add(cell.toString());  // Convert each cell to string
            }
            sheetData.add(rowData);
        }

        workbook.close();
        return sheetData;
    }

    /**
     * Reads data from a specific row and returns it as a List of Strings.
     * @param excelFilePath The path of the Excel file.
     * @param sheetName The name of the sheet to read.
     * @param rowIndex The index of the row to read (0-based).
     * @return A list of cell values for the specified row.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static List<String> readRowData(String excelFilePath, String sheetName, int rowIndex) throws IOException {
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Row row = sheet.getRow(rowIndex);
        List<String> rowData = new ArrayList<>();

        for (Cell cell : row) {
            rowData.add(cell.toString());  // Convert each cell to string
        }

        workbook.close();
        return rowData;
    }

    /**
     * Reads data from a specific column in a sheet.
     * @param excelFilePath The path of the Excel file.
     * @param sheetName The name of the sheet to read.
     * @param columnIndex The index of the column to read (0-based).
     * @return A list of cell values for the specified column.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static List<String> readColumnData(String excelFilePath, String sheetName, int columnIndex) throws IOException {
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        List<String> columnData = new ArrayList<>();

        for (Row row : sheet) {
            Cell cell = row.getCell(columnIndex);
            if (cell != null) {
                columnData.add(cell.toString());  // Convert each cell to string
            }
        }

        workbook.close();
        return columnData;
    }
}
