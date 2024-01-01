package day12_29.test02;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        // main 메소드의 내용은 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        solution(arr);
    }
    public static void solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            System.out.println((arr[arr.length/2] + arr[arr.length/2 - 1]) / 2);
        }
        else{
            System.out.println(arr[arr.length / 2]);
        }
    }
}
