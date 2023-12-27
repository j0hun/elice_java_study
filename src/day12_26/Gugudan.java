package day12_26;

import java.util.Scanner;

public class Gugudan {
    // 구구단
    public static void printGugudan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단을 출력할 숫자를 입력하세요: ");

        int dan = scanner.nextInt();
        printGugudan(dan);

        scanner.close();
    }
}
