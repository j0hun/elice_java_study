package day12_28.Quiz02;

class NewPlan {
    public String engine;
    public String body;
    public String wheel;
    public int code;

    // 지시사항을 참고하여 코드를 작성해 보세요.

    NewPlan() {
        System.out.println("방금 생산된 차량에 코드가 부여되지 않았습니다.");
    }

    NewPlan(int newst_code) {
        this.code = newst_code + 1;
    }

    public void turnOn(String state) {
        if(state.equals("on")){
            this.engine = "on";
            this.wheel = "spin";
        }
    }

    public void selectTheColor(String color) {
        this.body = color;
    }
}


public class Main {
    public static void main(String args[]) {
        // 아래 코드는 검사용으로 수정하지 말아주세요

        int oldCode = 5;
        String popularColor = "black";

        NewPlan test = new NewPlan();

        test.turnOn("on");
        test.selectTheColor(popularColor);


        System.out.println("=======시제품 테스트 결과=======");
        System.out.println("차량 코드 : " + test.code);
        System.out.println("전원 상태 : " + test.engine);
        System.out.println("바퀴 상태 : " + test.wheel);
        System.out.println("도색 상태 : " + test.body);

    }
}