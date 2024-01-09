package day01_09;

import java.io.FileNotFoundException;

public class T7 {
    public static void main(String[] args) {

        try {
            test();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void test() throws Exception{
        throw new Exception("에러");
    }
}
