package day01_05.Quiz03;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        double degree = scanner.nextDouble();
        calculateTan(degree);
    }

    public static void calculateTan(double degree) {
        // 여기에 코드를 작성하세요.
        if(degree == 90){
            System.out.println("Infinity");
            return;
        }
        double tan = Math.sin(Math.toRadians(degree)) / Math.cos(Math.toRadians(degree));
        System.out.printf("%.2f",tan);
    }
}
