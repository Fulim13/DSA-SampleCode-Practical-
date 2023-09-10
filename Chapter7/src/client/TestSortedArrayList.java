package client;

import adt.SortedArrayList;
import entity.Product;

public class TestSortedArrayList {

    public static void main(String[] args) {
        SortedArrayList<Product> pList = new SortedArrayList<>();
        pList.add(new Product(1234, "Durian"));
        pList.add(new Product(1024, "Mango"));
        pList.add(new Product(9082, "Apple"));
        pList.add(new Product(7013, "Orange"));
        pList.add(new Product(6666, "Watermelon"));
        pList.add(new Product(2781, "Banana"));
        System.out.println("\npList: \n" + pList);
        
        String fruit = "Durian";
        Product p = new Product(fruit);
        System.out.println("'\nRemove " + fruit + ": " + pList.remove(p));
        System.out.println("\npList: \n" + pList);
        
        fruit = "Avocado";
        p = new Product(fruit);
        System.out.println("'\nRemove " + fruit + ": " + pList.remove(p));
        System.out.println("\npList: \n" + pList);

        // Sorted by number
        // List: 
        // 1024	Mango
        // 1234	Durian
        // 2781	Banana
        // 6666	Watermelon
        // 7013	Orange
        // 9082	Apple
        // Sorted by name
        //List: 
        //9082	Apple
        //2781	Banana
        //1234	Durian
        //1024	Mango
        //7013	Orange
        //6666	Watermelon
        // When change 'A' to 'a', NOTE: A is 65, a is 97
        //        List: 
        //2781	Banana
        //1234	Durian
        //1024	Mango
        //7013	Orange
        //6666	Watermelon
        //9082	apple
    }
}
