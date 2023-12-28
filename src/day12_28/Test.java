package day12_28;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int pages = scanner.nextInt();
        Book book = new Book(name, pages);
        book.nextPage();
        book.nextPage();

        scanner.nextLine();
        String changeName = scanner.nextLine();
        book.changeName(changeName);
        System.out.println("바뀐 책이름은? " + book.name);

    }

}
