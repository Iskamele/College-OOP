package practice_04;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public Book findMostPopularBook() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getIssueCount))
                .orElse(null);
    }
}