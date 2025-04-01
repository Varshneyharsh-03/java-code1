//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Book book1= new Book("Harry Potter",300);
    Book book2 = new Book("Atomic Habbits",200);
    Book book3= new Book("The wizard of oz",400);

    Book[] books = {book1,book2,book3};


    Library library = new Library("NYC Newyork Public",1878,books);
    library.displayInfo();


    }
}