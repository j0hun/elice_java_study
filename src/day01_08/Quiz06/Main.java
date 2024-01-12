package day01_08.Quiz06;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int now = scanner.nextInt();
        int[] times = {10, 23, 9, 11, 12, 15, 20};

        // 탑승 가능한 놀이기구 개수를 출력하는 코드를 구현합니다.
        TreeSet<Integer> timeSet = new TreeSet<>();
        for(int time : times){
            timeSet.add(time);
        }
        System.out.println(timeSet.tailSet(now).size());
    }

}
