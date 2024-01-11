package day01_08.Quiz04;

import java.util.Queue;
// 사용할 Queue 구현체를 import합니다.
import java.util.LinkedList;
class Customer {
    private static int counter = 1;
    private String name;
    private int customerNumber;

    public Customer(String name) {
        this.name = name;
        this.customerNumber = counter++;
    }

    public String getName() {
        return name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String toString() {
        return "Customer #" + customerNumber + ": " + name;
    }
}

// PostOfficeQueue 클래스를 작성합니다.
class PostOfficeQueue{
    private Queue<Customer> queue;

    public PostOfficeQueue(){
        queue = new LinkedList<>();
    }

    public void addCustomer(String name){
        Customer customer = new Customer(name);
        queue.offer(customer);
        System.out.println("대기열에 추가되었습니다.: " + customer);
    }

    public Customer serveNextCustomer(){
        return queue.poll();
    }
    public void printWaitingCustomers(){
        if(queue.isEmpty()){
            System.out.println("기다리는 손님이 없습니다.");
        }
        else{System.out.println("손님 대기열:");
            for(Customer s : queue){
                System.out.println(s);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PostOfficeQueue postOfficeQueue = new PostOfficeQueue();

        postOfficeQueue.printWaitingCustomers();

        postOfficeQueue.addCustomer("Alice");
        postOfficeQueue.addCustomer("Bob");
        postOfficeQueue.addCustomer("Charlie");

        postOfficeQueue.printWaitingCustomers();

        Customer served = postOfficeQueue.serveNextCustomer();
        System.out.println("다음 손님: " + served);

        postOfficeQueue.printWaitingCustomers();
    }
}