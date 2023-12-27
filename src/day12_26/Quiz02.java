package day12_26;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i += 1) {


            // 지시사항을 참고하여 코드를 작성해 보세요.
            if(i % (num / 2) == 0){
                break;
            }
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println(num);
    }
}
