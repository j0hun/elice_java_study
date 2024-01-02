package day01_01.Quiz03;

class Music {
    // 멤버 변수 genre와 recommend 메서드의 제어자를 작성해 주세요.
    static String genre = "Rock";
    static void recommend() {
        System.out.println("AC/DC");
    }
}

public class Main {
    public static void main(String args[]) {

        // genre를 참조하고 recommend를 호출하는 코드를 작성해 주세요.
        System.out.println(Music.genre);
        Music.recommend();
    }
}
