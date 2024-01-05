package day01_03.Quiz04;

class BankAccount {


    // 지시사항 1번을 참고하여 코드를 작성해 보세요.
    private String accountNumber;
    private double balance;

    // 지시사항 2번을 참고하여 코드를 작성해 보세요.
    public double getBalance(){
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        if(balance < 0){
            return;
        }
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    // 지시사항 3번을 참고하여 코드를 작성해 보세요.
    public String toString(){
        String result = "";
        result = "계좌번호: " + this.accountNumber + ", 잔액: " + this.balance;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        // 계좌번호와 초기 잔액을 설정
        myAccount.setAccountNumber("12345678");
        myAccount.setBalance(1000.00);

        // 계좌 정보 출력
        System.out.println(myAccount);

    }
}
