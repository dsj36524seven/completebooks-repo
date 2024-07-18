package modern.challenge;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    private static final String NOT_FOUND = "NOT FOUND";
    
    private static final List<Book> BOOKS
            = List.of(new Book(25, "Book2"), new Book(35, "Book3"),
            new Book(45, "Book4"));
    private static final Optional<Author> AUTHOR
            = Optional.of(new Author("Author", BOOKS));

    public static void main(String[] args) {

        //System.out.println(findFirstCheaperBookAvoid(30));
        //System.out.println(findFirstCheaperBookAlsoAvoid(30));
        System.out.println(findFirstCheaperBookPrefer(20));

        System.out.println();

        //validateAuthorOfBookAvoid(new Book(45, "Book4"));
        validateAuthorOfBookPrefer(new Book(55, "Book4"));
        //validateAuthorOfBookPrefer(new Book(45, "Book4"));
    }

    // Avoid
    public static String findFirstCheaperBookAvoid(int price) {

        Optional<Book> book = BOOKS.stream()
                .filter(b -> b.getPrice() < price)
                .findFirst();

        if (book.isPresent()) {
            return book.get().getName();
        } else {
            return NOT_FOUND;
        }
    }

    // Avoid
    public static String findFirstCheaperBookAlsoAvoid(int price) {

        Optional<Book> book = BOOKS.stream()
                .filter(b -> b.getPrice() < price)
                .findFirst();

        return book.map(Book::getName)
                .orElse(NOT_FOUND);
    }

    // Prefer
    public static String findFirstCheaperBookPrefer(int price) {

        return BOOKS.stream()
                .filter(b -> b.getPrice() < price)
                .findFirst()
                .map(Book::getName)
                .orElse(NOT_FOUND);
    }

    // Avoid
    public static void validateAuthorOfBookAvoid(Book book) {

        if (!AUTHOR.isPresent() || !AUTHOR.get().getBooks().contains(book)) {
            throw new NoSuchElementException();
        }
    }

    // Prefer
    public static void validateAuthorOfBookPrefer(Book book) {

        AUTHOR.filter(a -> a.getBooks().contains(book))
                .orElseThrow();
    }
}
