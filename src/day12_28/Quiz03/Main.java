package day12_28.Quiz03;

class Manufacturer {
    // 지시사항을 참고하여 코드를 작성해 보세요.
    public String procedure(){
        return "아무런 재료도 없습니다.";
    }
    public String procedure(String a){
        return "부품이 2개 부족합니다.";
    }
    public String procedure(String a, String b){
        return "부품이 1개 부족합니다.";
    }
    public String procedure(String a, String b, String c){
        return "부품 확인 완료! 제작에 들어가겠습니다.";
    }
}