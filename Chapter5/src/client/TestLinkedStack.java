package client;

import adt.LinkedStack;
import adt.StackInterface;

public class TestLinkedStack {

    public static void main(String[] args) {
        StackInterface<Integer> s = new LinkedStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("\nStack contains: \n" + s);

        s.clear();
        System.out.println("\nAfter clear, Stack contains: \n" + s);

//        System.out.println("Stack is empty? " + s.isEmpty());
//        System.out.println("Pop an element: " + s.pop());
//        System.out.println("Pop an element: " + s.pop());
//        System.out.println("Pop an element: " + s.pop());
//        System.out.println("Pop an element: " + s.pop());
//        System.out.println("Stack is empty? " + s.isEmpty());
//        System.out.println("Pop an element: " + s.pop());
    }
}
