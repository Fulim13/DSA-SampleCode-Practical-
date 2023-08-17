package client;

import adt.*;

public class TestSet {

    public static void main(String[] args) {
        SetInterface<Integer> setA = new ArraySet<>();
        System.out.println("Add 10: " + setA.add(10));
        System.out.println("Add 10: " + setA.add(20));
        System.out.println("Add 10: " + setA.add(30));
        System.out.println("Add 10: " + setA.add(40));
        System.out.println("Add 10: " + setA.add(50));

        System.out.println("Add 10: " + setA.add(10));
        System.out.println("Add 10: " + setA.add(30));
        System.out.println("Add 10: " + setA.add(50));

        System.out.println("\nsetA: " + setA);

        // Remove
        System.out.println("\nRemove 30: " + setA.remove(30));
        System.out.println("setA: " + setA);

        System.out.println("\nRemove 10: " + setA.remove(10));
        System.out.println("setA: " + setA);

        System.out.println("\nRemove 50: " + setA.remove(50));
        System.out.println("setA: " + setA);

        System.out.println("\nRemove 30: " + setA.remove(30));
        System.out.println("setA: " + setA);

        SetInterface<Integer> setB = new ArraySet<>();
        setB.add(20);
        setB.add(40);
        System.out.println("\nsetB: " + setB);

        SetInterface<Integer> setC = new ArraySet<>();
        setB.add(20);
        setB.add(30);
        setB.add(45);
        System.out.println("setC: " + setC);
        
        setB.union(setC);
        System.out.println("\nAfter union, setB: " + setB);

    }
}
