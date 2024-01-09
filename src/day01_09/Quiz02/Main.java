package day01_09.Quiz02;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random(0L);
        Deque<String> line = new ArrayDeque<>(); // 실제 사람들이 서 있는 줄을 의미
        Stack<String> cmdHistory = new Stack<>(); // 명령의 기록을 의미

        for(int i = 0; i < 5; i++) {
            int cmd = input.nextInt();

            // 여기에 코드를 작성해 주세요.
            switch(cmd){
                case 1:
                    System.out.println(line);
                    cmdHistory.push("peek");
                    break;
                case 2:
                    String s = "c" + Integer.toString(rand.nextInt(100));
                    line.offer(s);
                    cmdHistory.push("in : " + s);
                    break;
                case 3:
                    cmdHistory.push("out : " + line.poll());
                    break;
            }
        }
        System.out.println(line);
        System.out.println(cmdHistory);

        input.close();

    }
}
