package day12_26;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        int size;
        int spaceCnt;
        int starCnt=1;
        int i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("트리 높이: ");
        size=sc.nextInt();
        spaceCnt=size-1;// 공백 갯수

        for(i=0; i<size; i++){
            for(j=0; j<spaceCnt; j++){
                System.out.print(" ");
            }
            spaceCnt--;

            for(j=0; j<starCnt; j++){
                System.out.print("*");
            }
            starCnt+=2;
            System.out.println();
        }

        for(i=0; i<size/2; i++){
            for(j=0; j<size-2; j++){
                System.out.print(" ");
            }
            System.out.println("|||");
        }


    }
}
