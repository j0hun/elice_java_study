package day12_26;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {

            // 지시사항 4번을 참고하여 코드를 작성해 보세요.
            arr[i] = input.nextInt();
        }

        // 지시사항 5번을 참고하여 코드를 작성해 보세요.
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }

    }
}
