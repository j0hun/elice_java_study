package day01_05.Quiz05;

// 여기에 Day enum을 작성해주세요.
enum Day{
    SUNDAY("즐거운 일요일입니다."),
    MONDAY("월요일입니다. 힘내세요!"),
    TUESDAY("화요일입니다. 계속 힘내세요!"),
    WEDNESDAY("수요일입니다. 주중의 절반을 향해 가고 있어요!"),
    THURSDAY("목요일입니다. 조금만 더 힘내세요!"),
    FRIDAY("금요일입니다. 주말이 얼마 남지 않았어요!"),
    SATURDAY("행복한 토요일입니다.");

    private String message;

    private Day(String message){
        this.message = message;
    }
    public String whatIsTheDay(){
        return this.message;
    }
}



public class Main {
    public static void main(String args[]) {
        Day day = Day.MONDAY;
        System.out.println(day.whatIsTheDay());
    }
}
