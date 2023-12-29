package day12_29.test03;

// 여기에 Book클래스를 작성해 주세요.
class Book{
    String title;
    String author;
    int publicationYear;
    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public void printDetails(){
        System.out.println("제목 : " + this.title);
        System.out.println("작가 : " + this.author);
        System.out.println("출판년도 : " + this.publicationYear);
    }
}

public class Main {
    public static void main(String args[]) {
        //  채점을 위한 코드이므로 수정하지 말아주세요

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        book.printDetails();
    }
}
