package day01_08.Quiz03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LunchQueue {
    private Queue<String> queue;

    public LunchQueue() {
        queue = new LinkedList<>();
    }

    public void addStudent(String student) {
        // 학생 이름을 대기열에 추가하는 코드를 작성해 주세요.
        queue.offer(student)		;
        System.out.println(student + "(이)가 대기열에 추가되었습니다.");
    }

    // serveStudent 메소드를 작성합니다.
    public void serveStudent(){
        if(queue.size() == 0){
            System.out.println("대기열에 남아있는 학생이 없습니다.");
            return;
        }
        System.out.println(queue.poll() + "(이)가 점심을 받았습니다.");
    }

    public static void main(String[] args) {
        LunchQueue lunchQueue = new LunchQueue();
        Scanner scanner = new Scanner(System.in);

        System.out.print("점심 대기열에 추가할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();
        lunchQueue.addStudent(name);

        System.out.print("점심 대기열에 추가할 학생 이름을 입력하세요: ");
        name = scanner.nextLine();
        lunchQueue.addStudent(name);

        lunchQueue.serveStudent();
        lunchQueue.serveStudent();
        lunchQueue.serveStudent();

        scanner.close();
    }
}