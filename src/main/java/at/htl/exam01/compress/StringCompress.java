package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {

        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader(fileName))) { // Initialisierung eines Scanners, der Dokumente einlesen kann
            while (scanner.hasNextLine()) { // Während das Dokument eine nächste Zeile hat,
                sb.append(scanner.nextLine() + "\n"); // wird diese an sb angehängt
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return sb.toString().split("\n"); // sb wird in einen String umgewandelt. Dieser wird beim Zeichen '\n' getrennt und das resultierende Array wird zurückgegeben.
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {

        for (int i = 0; i < lines.length; i++) { // Das ganze Array lines wird durchlaufen

            int number = Integer.valueOf(lines[i].substring(1)); // Alle Zeichen von lines[i] außer dem Ersten werden in einer int-Variable gespeichert

            for (int j = 0; j < number; j++) {
                System.out.print(lines[i].charAt(0)); // Der erste char in lines[i] wird ausgegeben
            }

            System.out.println(); // Nach einer Zeile an Buchstaben wird ein Zeilenumbruch ausgegeben

        }

    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    //todo: Der Verwendete Lösungsweg benötigt keine getNoOfLines-Methode
    /*
    public int getNoOfLines(String fileName) {

        int lines = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                lines++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return lines;
    }*/
}
