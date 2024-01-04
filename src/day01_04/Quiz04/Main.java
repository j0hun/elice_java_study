package day01_04.Quiz04;

import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        String complexLog = "UserActivity;user1;login, SystemAlert;Memory;Critical, UserActivity;user2;logout";

        // 쉼표 기준으로 1차 분리
        StringTokenizer logItems = new StringTokenizer(complexLog, ", ");

        System.out.println("활동 로그:");

        // 지시사항을 참고하여 코드를 작성해 주세요.
        while(logItems.hasMoreTokens()){
            StringTokenizer st = new StringTokenizer(logItems.nextToken(),";");
            while(st.hasMoreTokens()){
                String str = st.nextToken();
                if(str.equals("UserActivity")){
                    System.out.println("- Username: " + st.nextToken() + ", Action: " + st.nextToken());
                }
                else if(str.equals("SystemAlert")){
                    System.out.println("- Component: " + st.nextToken() + ", Status: " + st.nextToken());
                }
            }
        }
    }
}

