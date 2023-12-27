package day12_27.ex03;

class Cafe {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String[] menuList = {"아메리카노", "카페라떼", "아이스크림", "와플"};

    // 여기에 메서드를 작성해 주세요.
    public String getMostPopularMenu(){
        return menuList[0];
    }

    public boolean isPossibleMenu(String checkMenu){
        for(String menu : menuList){
            if (menu.equals(checkMenu)) return true;
        }
        return false;
    }

}

// Main 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
public class Main {
    public static void main(String args[]) {

        Cafe cafe = new Cafe();
        String checkMenu1 = "바닐라라떼";
        String checkMenu2 = "아이스크림";

        System.out.println(cafe.getMostPopularMenu());
        System.out.println(cafe.isPossibleMenu(checkMenu1));
        System.out.println(cafe.isPossibleMenu(checkMenu2));

    }
}
