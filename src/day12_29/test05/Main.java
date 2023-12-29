package day12_29.test05;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }

    public static void solution(int N) {
        int cnt = 0;
        // 여기에 코드를 작성해주세요.
        for(int i=1;i<=N;i++){
            int sum = 0;
            for(int j=i;j<=N;j++){
                sum += j;
                if(sum > N){
                    break;
                }
                else if(sum == N){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
