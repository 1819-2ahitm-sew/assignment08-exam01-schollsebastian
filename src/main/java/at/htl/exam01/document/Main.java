package at.htl.exam01.document;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Document[] documents = { // Initialisierung eines Document-Array
                new Book("Rowlings", "Harry Potter und der Stein der Weisen"), // neues Objekt der Klasse Book
                new Email("Susi", "Bewerbung", "CoolCompany"), // neues Objekt der Klasse Email
                new Book("Tolkien", "lordOfTheRings") // neues Objekt der Klasse Book
        };

        print(documents); // Aufruf der Methode print() mit dem aktuellen Parameter documents

    }

    private static void print(Document[] documents) {

        int books = 0; // Anzahl der Bücher im Array documents
        int emails = 0; // Anzahl der Emails im Array documents

        for (int i = 0; i < documents.length; i++) { // Das ganze Array documents wird durchlaufen

            if (documents[i] instanceof Book) { // Wenn documents[i] eine Instanz der Klasse Book ist,
                System.out.println("Book: " + documents[i].toString()); // wird die toString() Methode aufgerufen
                books++; // und die Anzahl der Bücher um 1 erhöht
            } else if (documents[i] instanceof Email) { // Wenn documents[i] eine Instanz der Klasse Email ist,
                System.out.println("Email: " + documents[i].toString()); // wird die toString() Methode aufgerufen
                emails++; // und die Anzahl der Emails um 1 erhöht
            }

        }

        System.out.println("\nAnzahl Books: " + books); // Ausgabe der Anzahl der Bücher
        System.out.println("Anzahl Email: " + emails); // Ausgabe der Anzahl der Emails

    }

}
