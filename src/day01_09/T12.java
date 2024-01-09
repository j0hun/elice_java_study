package day01_09;

import java.util.Scanner;

public class T12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
        }catch(Exception e){
            System.out.println("숫자를 입력하시오.");
        }finally {
            sc.close();
        }
    }
}