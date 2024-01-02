package day01_01.Quiz05;

class Vehicle {

    private int wheel;

    // 여기에 Car 내부 클래스를 구현합니다.
    class Car{
        Car(){
            wheel = 4;
        }
        void printWheels(){
            System.out.println("자동차의 바퀴 수는 " + wheel + "개입니다.");
        }
    }
    // 여기에 Bicycle 내부 클래스를 구현합니다.
    class Bicycle{
        Bicycle(){
            wheel = 2;
        }
        void printWheels(){
            System.out.println("자전거의 바퀴 수는 " + wheel + "개입니다.");
        }
    }
    public void printWheels() {
        Car car = new Car();
        car.printWheels();

        Bicycle bicycle = new Bicycle();
        bicycle.printWheels();
    }
}

public class Main {
    public static void main(String args[]) {

        Vehicle vehicle = new Vehicle();
        vehicle.printWheels();
    }
}
