import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        // Ensure books are sorted by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = title.compareToIgnoreCase(books[mid].getTitle());
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
}
