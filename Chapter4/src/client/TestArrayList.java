
package client;

import adt.*; // import on demand

public class TestArrayList {
    public static void main(String[] args) {
        ListInterface<Integer> aList = new ArrayList<>();
        for (int pos = 0; pos < 10; pos++) {
            int value = pos * 10;
            System.out.println("Adding " + value);
            aList.add(value);
        }
        System.out.println("\naList:\n" + aList);
        
        ListInterface<Integer> bList = new ArrayList<>();
        for (int pos = 0; pos < 10; pos++) {
            int value = pos * 10;
            System.out.println("Adding " + value);
            bList.add(value);
        }
        System.out.println("\nbList:\n" + bList);
    }
}
