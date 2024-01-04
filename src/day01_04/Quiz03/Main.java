package day01_04.Quiz03;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        convertString(s);
    }


    public static void convertString(String s) {
        // 여기에 코드를 작성하세요.
        s = s.toUpperCase();
        StringBuilder result = new StringBuilder(s);
        result.insert(0,"#");
        result.append("#");
        System.out.println(result);

    }
}
