package day01_09.Quiz03;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);

        Map<String, String> loginInfo = new HashMap<>();
        loginInfo.put("abc", "abc123");
        loginInfo.put("elice", "1234");
        loginInfo.put("cheshire", "erihsehc");

        // 여기에 코드를 작성해 주세요.
        String id = scanner.nextLine();
        String pw = scanner.nextLine();
        if(loginInfo.containsKey(id)){
            if(loginInfo.get(id).equals(pw)){
                System.out.println("로그인에 성공했습니다.");
            }
            else{
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }
        else{
            System.out.println("회원가입이 필요합니다.");
        }
    }

}
