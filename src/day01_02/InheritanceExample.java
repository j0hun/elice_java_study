package day01_02;

public class InheritanceExample {
    public static void main(String[] args) {
        Animal animal = new Animal("동물");
        Dog dog = new Dog("강아지","멍멍");
        dog.bark();
    }
}

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "이(가) 먹고 있습니다.");
    }

    public void sleep(){
        System.out.println(name + "이(가) 잠을 자고 있습니다.");
    }
}

class Dog extends Animal{
    String bow;

    public Dog(String name, String breed){
        super(name);
        this.bow = breed;
    }

    public void eat(){
        super.eat();
    }
    public void sleep(){
        super.sleep();
    }
    public void bark(){
        System.out.println(name + "이(가) " + bow + "짖고있습니다.");
    }
}