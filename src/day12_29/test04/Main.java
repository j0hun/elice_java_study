package day12_29.test04;

// 여기에 Book클래스와 AudioBook클래스를 작성해 주세요.
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
class AudioBook extends Book{
    int playTime;
    public AudioBook(String title, String author, int publicationYear, int playTime){
        super(title, author, publicationYear);
        this.playTime = playTime;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("재생 시간 : " + this.playTime);
    }
}
public class Main {
    public static void main(String args[]) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee", 1960, 745);

        book.printDetails();
        audiobook.printDetails();
    }
}
