package at.htl.exam01.document;

public abstract class Document { // Abstrakte Klasse

    private String author; // Membervariable author

    protected Document(String author) { // Konstruktor mit Paramenter author
        this.author = author; // Die Membervariable author erhält den Wert des Parameters author
    }

    public String getAuthor() { // Getter für author
        return author;
    }

    @Override
    public abstract String toString(); // Abstrakte Methode

}
