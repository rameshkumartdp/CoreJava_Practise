import java.util.*;

/**
 * Created by Ramesh on 006 06.Jun.21.
 */
public class Java8Comparator {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Ashok", "McGrawHill");
        Book book2 = new Book(2, "Yashwanth", "Spectrum");
        Book book3 = new Book(3, "Bala", "Boon");
        Book book4 = new Book(4, "Chaitanya", "Chai");
        //List<Book> bookList = Arrays.asList(book1, book2, book3, book4);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        Comparator<Book> comparator1 = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
        Collections.sort(bookList, comparator1);
        bookList.forEach((Book book) -> System.out.print(book.getAuthor() + " \t"));
        System.out.println("\n");

        Comparator<Book> comparator2 = (o1, o2) -> o1.getCompany().compareTo(o2.getCompany());
        Collections.sort(bookList, comparator2);
        bookList.forEach((Book book) -> System.out.print(book.getCompany() + " \t"));
        System.out.println("\n");

        bookList.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
        bookList.forEach((Book book) -> System.out.print(book.getAuthor() + " \t"));
        System.out.println("\n");

        Comparator<Book> comparator3 = Comparator.comparing(Book::getCompany);
        bookList.sort(comparator3);
        bookList.forEach((Book book) -> System.out.print(book.getCompany() + "\t"));
        System.out.println("\n");

        Comparator<Book> comparator4 = Comparator.comparing(Book::getAuthor).thenComparing(Book::getCompany);
        bookList.sort(comparator4);
        bookList.forEach((Book book) -> System.out.print(book.getAuthor() + "-" + book.getCompany()+ "\t"));
        System.out.println("\n");

        Comparator<Book> comparator5 = Comparator.comparing(Book::getAuthor);
        bookList.sort(comparator5.reversed());
        bookList.forEach((Book book) -> System.out.print(book.getAuthor() + "\t"));
        System.out.println("\n");

        bookList.add(null);
        Comparator<Book> comparator6 = Comparator.comparing(Book::getCompany);
        bookList.sort(Comparator.nullsFirst(comparator6));
        bookList.forEach((Book book) -> System.out.print(book+ "\t"));
        System.out.println("\n");
    }
}

class Book {
    private int bookId;
    private String author;
    private String company;

    public Book(int bookId, String author, String company) {
        this.bookId = bookId;
        this.author = author;
        this.company = company;
    }

    public int getBookId() {
        return bookId;
    }

    public String getCompany() {
        return company;
    }

    public String getAuthor() {
        return author;
    }
}
