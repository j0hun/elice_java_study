package day01_09.Quiz01;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String args[]) {

        // 아래 Random 인스턴스의 시드 값(0)을 변경하지 말아주세요.
        Random random = new Random(0);
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();
        Integer[] lotteryList = new Integer[num];

        // 여기에 코드를 작성해 주세요.
        if(num > 45) {
            System.out.println("잘못된 범위입니다.");
            return;
        }
        for(int i=0;i<num;i++){
            int r = random.nextInt(45) + 1;
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(lotteryList[j] == r){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                i--;
                continue;
            }
            lotteryList[i] = r;
        }
        for(int lottery : lotteryList){
            System.out.println(lottery);
        }
        input.close();

    }
}