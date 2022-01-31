
import javax.lang.model.util.ElementKindVisitor8;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String reference;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, int bookBorrowed, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = bookBorrowed;
        courseText = bookCourseText;
    }

    // Add the methods here ...

     
    //Crea getAutor y getTitle
    
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    //Crea printAuthor y PrintTitle

    public void printAuthor(){
        System.out.println(author);
    }
    public void printTitle(){
        System.out.println(title);
    }
    //Crea getPages
    public int getPages(){
        return pages;
    }
    //Crea un mutador de refNumber
    public void setRefNumber(String ref){
        if (ref.length() > 3)
        }reference = ref;
        }else{
            System.out.println("Error, no se ha podido modificar el campo")
        }
    //Crea un mutador de borrowed llamado borrow que incremente en 1 cada vez que es llamado y incluye un selector. getBorrowed que
    //devuelva como resultado el valor de borrow.
    public void borrow() {
        borrowed++;
    }
    public int getBorrowed(){
        return borrowed;
    }
    //Añade un método a la clase book. Este metodo debe imprimir toda la información de book.
    public void printDetails() {
    System.out.println("Autor: " + author);
    System.out.println("Título: " + title);
    System.out.println("Páginas: " + pages);
    System.out.println("");
}
}