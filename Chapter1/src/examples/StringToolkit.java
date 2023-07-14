package examples;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class StringToolkit {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
//        queue is a interface,cannot instantiate(new Queue)
//use one of the concrete class that implement the queue
        Queue<Character> queue = new ArrayBlockingQueue<>(100);
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                stack.push(ch);
                queue.offer(ch);
            }
        }
        while(!stack.empty()){
            if(stack.pop() != queue.poll()){
                return false;
            }
        }
        return true;
    }

    public static String reverse(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); ++i) {
            stack.push(inputString.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.empty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

}
