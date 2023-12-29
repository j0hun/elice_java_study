package day12_29.test06;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        solution(matrix);
    }

    public static void solution(int[][] matrix) {
        // 여기에 코드를 작성해주세요.
        int sum1 = 0;
        int sum2 = 0;
        int n = matrix.length;
        int j = n-1;
        for(int i=0;i<n;i++){
            sum1 += matrix[i][i];
            sum2 += matrix[i][j--];
        }
        System.out.println(Math.max(sum1,sum2));
    }
}

