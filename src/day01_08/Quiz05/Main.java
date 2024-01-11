package day01_08.Quiz05;

import java.util.ArrayDeque;
import java.util.Deque;

// Rider 클래스에 해당 승객이 VIP인지 여부를 확인하는 멤버 변수와 메소드를 작성합니다.
class Rider {
    private String name;
    private boolean isVIP;

    public boolean isVIP(){
        return isVIP;
    }

    public Rider(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (VIP: " + isVIP + ")";
    }
}

class RollerCoasterDeque {
    private Deque<Rider> deque;

    public RollerCoasterDeque() {
        deque = new ArrayDeque<>();
    }

    // addRider 메소드를 작성하세요.
    public void addRider(Rider rider){
        if(rider.isVIP()){
            deque.offerFirst(rider);
        }
        else{
            deque.offerLast(rider);
        }
    }

    // callNextRider 메소드를 작성하세요.
    public Rider callNextRider(){
        return deque.poll();
    }

    // printWaitingRiders 메소드를 작성하세요.
    public void printWaitingRiders(){
        System.out.println("대기중인 승객들:");
        for(Rider rider : deque){
            System.out.println(rider);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        RollerCoasterDeque deque = new RollerCoasterDeque();

        deque.addRider(new Rider("Alice", false));
        deque.addRider(new Rider("Bob", true));
        deque.addRider(new Rider("Charlie", false));
        deque.addRider(new Rider("Dave", true));

        deque.printWaitingRiders();

        Rider nextRider = deque.callNextRider();
        System.out.println("다음 차례: " + nextRider);

        deque.printWaitingRiders();
    }
}