package day12_26;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = "";
        // 지시사항을 참고하여 코드를 작성해 보세요.
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'b' || ch == 'c'){
                result += '*';
            }
            else{
                result += ch;
            }
        }

        System.out.println(result);
        input.close();
    }
}
