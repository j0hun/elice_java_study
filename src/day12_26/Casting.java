package day12_26;

public class Casting {
    public static void main(String[] args){
        //long을 선언하고 int로 캐스팅
        long longNum = 100L;
        int intNum = (int)(longNum);
        System.out.println(intNum);
    }
}
