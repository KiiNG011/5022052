import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Book1", "Author1"),
                new Book(2, "Book2", "Author2"),
                new Book(3, "Book3", "Author3")
        };

        Library library = new Library(books);

//        Linear Search
        Book foundBook = library.linearSearchByTitle("Book2");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found");
        }
//        Binary Search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        foundBook = library.binarySearchByTitle("Book2");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found");
        }
    }
}
