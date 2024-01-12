package day01_08.Quiz10;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", written by " + author + " in " + yearOfPublication;
    }
}

// TitleComparator 클래스를 구현합니다.
class TitleComparator implements Comparator<Book>{
    public int compare(Book o1, Book o2){
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
// AuthorComparator 클래스를 구현합니다.
class AuthorComparator implements Comparator<Book>{
    public int compare(Book o1, Book o2){
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
// PublicationYearComparator 클래스를 구현합니다.
class PublicationYearComparator implements Comparator<Book>{
    public int compare(Book o1, Book o2){
        return Integer.compare(o1.getYearOfPublication(),o2.getYearOfPublication());
    }
}
class Library {
    public static void sortAndPrint(List<Book> books, Comparator<Book> comparator) {
        // sortAndPrint 메소드를 작성합니다.
        Collections.sort(books,comparator);
        for(Book book : books){
            System.out.println(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Hobbit", "J.R.R. Tolkien", 1937),
                new Book("1984", "George Orwell", 1949),
                new Book("Brave New World", "Aldous Huxley", 1932)
        );

        System.out.println("제목으로 정렬:");
        Library.sortAndPrint(books, new TitleComparator());

        System.out.println("\n저자명으로 정렬:");
        Library.sortAndPrint(books, new AuthorComparator());

        System.out.println("\n출판년도로 정렬:");
        Library.sortAndPrint(books, new PublicationYearComparator());
    }
}