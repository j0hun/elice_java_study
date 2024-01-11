package day01_08.Quiz02;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(solution(s));
    }


    public static boolean solution(String s) {
        // 지시사항에 따라 코드를 작성해 주세요.
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
