package Hummel_Klausur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A simplified spreadsheet class for the PR1 exam at Hochschule Mannheim.
 * One aspect worth mentioning is that it only supports long numbers, not doubles.
 *
 * @author  Oliver Hummel
 */
public class Spreadsheet {
    Cell[][] cells;

    /**
     * Constructor that creates a Spreadsheet of size rows * cols.
     * @param rows number of rows
     * @param cols number of columns
     */
    public Spreadsheet(int rows, int cols) {
        cells = new Cell[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                cells[i][j] = new Cell();
    }

    // -----
    // retrieve or change values of cells

    private String get(int row, int col) {
        return cells[row][col].getValue();
    }

    public String get(String cellName) {
        cellName = cellName.toUpperCase();
        return get(getRow(cellName), getCol(cellName));
    }

    private void put(int row, int col, String value) {
        if (!value.startsWith("="))
            cells[row][col].setValue(value);
        else {
            cells[row][col].setFormula(value);
            evaluateCell(row, col);
        }
    }

    public void put(String cellName, String value) {
        cellName = cellName.toUpperCase();
        put(getRow(cellName), getCol(cellName), value);
    }

    private int getCol(String cellName) {
        return cellName.charAt(0) - 'A';
    }

    private int getRow(String cellName) {
        return Character.getNumericValue(cellName.charAt(0)-1);
    }


    // -----
    // business logic

    /*
     * A method for reading in data from a CSV file.
     * @param path The file to read.
     * @param separator The char used to split up the input, e.g. a comma or a semicolon.
     * @param starCellName The upper left cell where data from the CSV file should be inserted.
     * @return Nothing.
     * @exception IOException If path does not exist.
     */
    public void readCsv(String path, char separator, String startCellName) throws FileNotFoundException {
        startCellName = startCellName.toUpperCase();

        File file = new File(path);
        Scanner reader = new Scanner(file);

        int startRow = getRow(startCellName);
        int startColumn = getCol(startCellName);
        String[] readLine = new String[0];
        while (reader.hasNextLine()) {
            readLine = reader.nextLine().split("" + separator);
            for (int i = 0; i < readLine.length; i++)
                cells[startRow][startColumn + i].setFormula(readLine[i]);
            startRow++;
        }
        System.out.println(Arrays.toString(readLine));

        // TODO: Rest der Methode implementieren! -> 9 Punkte
    }

    /*
     * This method does the actual evaluation/calcluation of a specific cell
     * @param cellName the name of the cell to be evaluated
     * @return Nothing.
     */
    private void evaluateCell(int row, int col) {
        String formula = cells[row][col].getFormula();
        String result = "";

        if (formula.startsWith("SUMME("))  // e.g. SUMME(A3:A8)
            result = "" + sum(formula.substring(6, 8), formula.substring(9, 11));
        else if (!formula.isEmpty())
            result = "" + calculate(formula);

        cells[row][col].setValue("" + result);
    }

    /**
     * Method for calculating the sum of a rectangular block of cells, such as from B1 to C3,
     * which yields: B1 + B2 + B3 + C1 + C2 + C3
     * @param startCellName The name of the cell in the upper left corner of the rectangle.
     * @param endCellName The name of the cell in the lower right corner of the rectangle.
     * @return The sum calculated.
     */
    private long sum(String startCellName, String endCellName) {
        // TODO: Hier implementieren! -> 9 Punkte

        long sum = 0;
        int startRow = getRow(startCellName);
        int startCol = getCol(startCellName);
        for (int i = 0; i <= startRow; i++)
            for (int j = 0; j < startCol; j++)
                if (!cells[i][j].isEmpty())
                    sum +=  Integer.parseInt(cells[i][j].getValue());

        return sum;
    }

    /**
     * This method calculates the result of a "normal" algebraic expression. It only needs to support
     * expressions like =B4 or =2+A3-B2, i.e. only with int numbers and other cells and with plus and
     * minus only. An expression always starts with either a number or a cell name. If it continues, it
     * is guaranteed that this is followed by an operator (plus or minus) and either a number or a
     * cell name again.
     * @param formula The expression to be evaluated.
     * @return The result calculated.
     */
    private long calculate(String formula) {
        Matcher m = Pattern.compile("([A-Z][0-9]*)|[-\\+]|[0-9]*").matcher(formula);

        long res = 0;

        // Beispiel für den Zugriff auf die einzelnen Elemente einer Formel; kann entfernt werden
        while (m.find()) {        // m.find() must always be used before m.group()
            String s = m.group();
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        }

        // TODO: Methode implementieren! -> 13 Punkte

        return res;
    }

    // -----

    public String toString() {
        // TODO: sei die Anzahl der Zeilen = n und die Anzahl der Spalten = m.
        // Wie groß ist dann die Komplexität der Methode in der O-Notation? -> 6 Punkte //

        StringBuilder sb = new StringBuilder();

        sb.append("   ");
        for (int i = 0; i < cells.length; i++) {
            sb.append("  ").append((char) ('A' + i)).append("  | ");
        }

        int rc = 1;
        for (Cell[] r : cells) {
            sb.append(System.lineSeparator());
            sb.append(rc++ + ": ");

            for (Cell c : r) {
                if (c == null || c.isEmpty())
                    c.setValue(" ");
                sb.append(c + " | ");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        
    }

}
