package day01_09;

public class T3 {

    public static void main(String[] args) {

        try {
            test();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void test() throws ArithmeticException{
        System.out.println(0 / 0);
    }
}
