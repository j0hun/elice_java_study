package day12_28.Quiz01;

// [참고용] 기존 설계도
// class OldPlan {
//     public String wheel;
//     public String body;
//     public int code;
// }

// 지시사항 1번을 참고하여 코드를 작성해 주세요.
class NewPlan {
    String engine;
    String body;
    String wheel;
    int code;
}


public class Main {
    public static void main(String args[]) {

        // 지시사항 2번과 참고하여 코드를 작성해 주세요.
        NewPlan test1 = new NewPlan();
        NewPlan test2 = new NewPlan();
        NewPlan test3 = new NewPlan();

        // 지시사항 3번과 참고하여 코드를 작성해 주세요.
        test1.code = 1;
        test2.code = 2;
        test3.code = 3;

        // 아래 코드는 수정하지 말아주세요
        System.out.println(test1.code);
        System.out.println(test2.code);
        System.out.println(test3.code);
    }
}