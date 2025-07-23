// Base class
public class Book {
    protected String title;
    protected String author;
    protected int pages;
    protected boolean isAvailable;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book has been borrowed");
        }
        else{
            System.out.println("Book is not available");
        }
    }
    public void returnBook(){
        if (isAvailable){
            isAvailable = true;
            System.out.println("Has been returned");
        }
    }
    public void displayInfo(){
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Availability: " + isAvailable);
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public boolean getIsAvailable() { return isAvailable; }
}
//child class
class Textbook extends Book {
    private String subject;
    private int edition;

    public Textbook(String title, String author, int pages , String subject, int edition){
        super(title, author, pages);
        this.subject = subject;
        this.edition = edition;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Book Subject: "+ subject);
        System.out.println("Book Edition: " + edition);
    }
    public String getSubject(){return subject;}
    public int getEdition(){return edition;}

}

class MainLibrary{
    public static void main (String[] args){

        Book b1 = new Book("The Alchemist", "Paulo Coelho", 197);
        Book b2 = new Book("1984", "George Orwell", 328);

        Textbook textbook = new Textbook("Java Programming", "Herbert Schildt", 700, "Computer Science", 9);
        b1.borrowBook();
        b2.borrowBook();
        b1.returnBook();

        System.out.println("Book Info: ");
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        textbook.displayInfo();

    }}
