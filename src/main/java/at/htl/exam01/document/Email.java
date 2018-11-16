package at.htl.exam01.document;

public class Email extends Document { // Subklasse von Document

    private String subject; // Membervariable subject
    private String to; // Membervariable to

    public Email(String author, String subject, String to) { // Konstruktor mit den Parametern author, subject und to
        super(author); // Konstruktor der Superklasse wird aufgerufen
        this.subject = subject; // Die Membervariable subject erhält den Wert des Parameters subject
        this.to = to;  // Die Membervariable to erhält den Wert des Parameters to
    }

    public String getSubject() { // Getter für subject
        return subject;
    }

    public String getTo() { // Getter für to
        return to;
    }

    @Override
    public String toString() {
        return "'" + getSubject() + "' von '" + getAuthor() + "' an '" + getTo() + "'";
    }
}
