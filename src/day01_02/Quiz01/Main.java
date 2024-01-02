package day01_02.Quiz01;

import java.util.Scanner;

class BusinessAccount {
    protected double balance;

    BusinessAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}


// 지시사항을 참고하여 코드를 작성해 보세요.
class FamilyBusinessAccount extends BusinessAccount{

    FamilyBusinessAccount(double balance){
        super(balance);
    }

    public void displayBalance(){
        System.out.println("가족 비즈니스 계정 잔액: " + balance + "원");
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = scanner.nextDouble();

        FamilyBusinessAccount familyAccount = new FamilyBusinessAccount(initialBalance);

        familyAccount.displayBalance();

        scanner.close();
    }
}