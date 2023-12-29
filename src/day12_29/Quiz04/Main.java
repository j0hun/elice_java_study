package day12_29.Quiz04;

// 여기에 Animal 클래스와 Dog 클래스를 만들어주세요.
class Animal{
    public String name;
    public void printAction(){
        System.out.println("동물이 움직입니다.");
    }
}
class Dog extends Animal{
    public void printAction(){
        System.out.println("멍멍이가 달립니다.");
    }
}
public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.name = "동물";

        Dog dog = new Dog();
        dog.name = "멍멍이";

        animal.printAction();
        dog.printAction();
    }
}
