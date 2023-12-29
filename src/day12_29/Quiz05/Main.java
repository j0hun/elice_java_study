package day12_29.Quiz05;

// 여기에 Car, ElectricCar 클래스를 만들어 주세요.
class Car{
    protected String model;
    protected double fuel;
    public Car(String model){
        this.model = model;
        this.fuel = 100.0;
    }
    public void drive(){
        this.fuel -= 10;
        System.out.println("자동차를 운전합니다.");
    }
}

class ElectricCar extends Car{
    public ElectricCar(String model){
        super(model);
    }
    public void drive(){
        super.fuel -= 5;
        System.out.println("전기차를 운전합니다.");
    }
}


public class Main {
    public static void main(String args[]) {
        Car car = new Car("세단");
        car.drive();

        ElectricCar electricCar = new ElectricCar("전기차 세단");
        electricCar.drive();
    }
}
