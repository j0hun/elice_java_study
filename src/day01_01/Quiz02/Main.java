package day01_01.Quiz02;

// 여기에 Animal 클래스를 구현해 주세요.
abstract class Animal{
    abstract String say();
}
// 여기에 Duck 클래스를 구현해 주세요.
class Duck extends Animal{
    String say(){
        return "꽥꽥";
    }
}

// Main 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
public class Main {
    public static void main(String args[]) {

        Duck duck = new Duck();

        System.out.println("오리는 " + duck.say());
    }
}
