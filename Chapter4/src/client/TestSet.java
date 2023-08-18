package client;

import adt.*;
import java.util.Iterator;

public class TestSet {

    public static void main(String[] args) {
        SetInterface<Integer> setA = new ArraySet<>();
        System.out.println("Add 10: " + setA.add(10));
        System.out.println("Add 20: " + setA.add(20));
        System.out.println("Add 30: " + setA.add(30));
        System.out.println("Add 40: " + setA.add(40));
        System.out.println("Add 50: " + setA.add(50));

        int sum = 0;
        Iterator<Integer> it = setA.getIterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println("\nSum of setA's elements: " + sum);

        System.out.println("Add 10: " + setA.add(10));
        System.out.println("Add 30: " + setA.add(30));
        System.out.println("Add 50: " + setA.add(50));

        System.out.println("\nsetA: " + setA);

//        // Remove
//        System.out.println("\nRemove 30: " + setA.remove(30));
//        System.out.println("setA: " + setA);
//
//        System.out.println("\nRemove 10: " + setA.remove(10));
//        System.out.println("setA: " + setA);
//
//        System.out.println("\nRemove 50: " + setA.remove(50));
//        System.out.println("setA: " + setA);
//
//        System.out.println("\nRemove 30: " + setA.remove(30));
//        System.out.println("setA: " + setA);
        SetInterface<Integer> setB = new ArraySet<>();
        setB.add(20);
        setB.add(40);
        System.out.println("\nsetB: " + setB);

        SetInterface<Integer> setC = new ArraySet<>();
        setC.add(20);
        setC.add(30);
        setC.add(45);
        System.out.println("setC: " + setC);

//        setB.union(setC);
//        System.out.println("\nAfter union, setB: " + setB);
        System.out.println("SET A: " + setA);
        System.out.println("SET B: " + setB);
        System.out.println("SET C: " + setC);

        System.out.println("Set B C SetA " + setA.checkSubset(setB));
        System.out.println("Set C C SetA " + setA.checkSubset(setC));

        SetInterface<Integer> setD = new ArraySet<>();
        setD = setA.intersection(setC);
        System.out.println("Set D: Set A U Set C" + setD);

        setD = setA.intersection(setB);
        System.out.println("Set D: Set A U Set B " + setD);
    }
}
