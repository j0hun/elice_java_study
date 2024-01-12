package day01_08.Quiz07;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);

        // 여기에 코드를 작성해 주세요.
        HashSet<String> set = new HashSet<>();
        String nickname = scanner.nextLine();
        for(int i=0;i<10;i++){
            String input = scanner.nextLine();
            set.add(input);
        }
        if(set.contains(nickname)){
            System.out.println("이미 사용 중인 닉네임입니다.");
        }
        else{
            System.out.println("사용 가능한 닉네임입니다.");
        }

    }
}
