package at.htl.exam01.document;

public class Book extends Document { // Subklasse von Document

    private String title; // Membervariable title

    public Book(String author, String title) { // Konstruktor mit Parametern author und title
        super(author); // Konstruktor der Superklasse wird aufgerufen
        this.title = title; // Die Membervariable title erhält den Wert des Parameters title
    }

    public String getTitle() { // Getter für title
        return title;
    }

    @Override
    public String toString() {
        return "'" + getTitle() + "' von '" + getAuthor() + "'";
    }

}
