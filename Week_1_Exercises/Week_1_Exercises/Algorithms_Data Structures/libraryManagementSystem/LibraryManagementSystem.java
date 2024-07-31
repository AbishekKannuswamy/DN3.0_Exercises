package com.example.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int fetchBookId() {
        return bookId;
    }

    public String fetchTitle() {
        return title;
    }

    public String fetchAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void insertBook(Book book) {
        books.add(book);
    }

    public Book searchBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.fetchTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void arrangeBooksByTitle() {
        Collections.sort(books, (b1, b2) -> b1.fetchTitle().compareToIgnoreCase(b2.fetchTitle()));
    }

    public Book searchBookByTitleBinary(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.fetchTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.insertBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.insertBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.insertBook(new Book(3, "1984", "George Orwell"));

        Book foundBook = library.searchBookByTitleLinear("1984");
        System.out.println("Linear Search Result: " + foundBook);

        library.arrangeBooksByTitle();
        Book foundBookBinary = library.searchBookByTitleBinary("1984");
        System.out.println("Binary Search Result: " + foundBookBinary);
    }
}
