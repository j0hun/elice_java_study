package day12_27.ms02;

import java.util.Scanner;

public class Main {

    public static int f(int n) {
        String str = String.valueOf(n);
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // 입력받을 값
        int num = input.nextInt();

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        while(num >= 10){
            num = f(num);
        }
        System.out.println(num);
    }
}
