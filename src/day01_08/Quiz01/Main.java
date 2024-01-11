package day01_08.Quiz01;

import java.util.*;

class MyStack {
    // 여기에 코드를 작성하세요.
    ArrayList<String> stackList = new ArrayList<>();
    void push(String s){
        stackList.add(s);
    }
    String pop(){
        if(stackList.size() == 0){
            return "-1";
        }
        String s = stackList.get(stackList.size() - 1);
        stackList.remove(s);
        return s;
    }
    int size(){
        return stackList.size();
    }
    boolean isEmpty(){
        return stackList.size() == 0;
    }
}

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        MyStack myStack = new MyStack();
        if (myStack.isEmpty())   System.out.println("스택이 비어있습니다.");
        myStack.push("3");
        myStack.push("5");
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}