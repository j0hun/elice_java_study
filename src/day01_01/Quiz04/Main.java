package day01_01.Quiz04;

// Student 클래스와 name 멤버 변수의 제어자를 올바르게 수정합니다.
class Student {

    public String name = "Elice";

    public void sayName() {
        System.out.println("제 이름은 " + this.name + "입니다.");
    }
}

public class Main {
    public static void main(String args[]) {

        Student student = new Student();

        student.sayName();

    }
}
