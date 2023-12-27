package day12_26;

public class Ternary {
    public static void main(String[] args){
        // 삼항연산자로 바꾸기
        int a = 10;
        int b = 20;
        boolean isGreater = a > b ? true : false;

        /*
        if (a > b) {

            isGreater = true;
        } else {
            isGreater = false;
        }
        */

        System.out.println(isGreater);

    }
}
