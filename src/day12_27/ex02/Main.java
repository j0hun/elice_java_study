package day12_27.ex02;
class Cafe {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String menu = "수박주스";
    public int price = 8000;

    // 여기에 메서드를 작성해 주세요.
    public void printMenuInfo(){
        System.out.println(menu + "는 " + price + "원입니다.");
    }

    public void printIncreasedPrice(int pastPrice){
        System.out.println("인상 가격은 " + (price - pastPrice) + "원입니다.");
    }
}

// Main 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
public class Main {
    public static void main(String args[]) {

        Cafe cafe = new Cafe();
        int pastPrice = 5000;

        cafe.printMenuInfo();
        cafe.printIncreasedPrice(pastPrice);
    }
}
