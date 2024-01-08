package day01_05.Quiz02;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        calculateVolume(r);
    }

    public static void calculateVolume(double r) {
        // 여기에 코드를 작성하세요.
        double result = (4.0/3.0) * Math.PI * Math.pow(r,3);
        System.out.println(String.format("%.2f",result));


    }
}
