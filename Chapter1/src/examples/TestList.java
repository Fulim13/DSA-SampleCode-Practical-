/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;
import java.util.ArrayList;

/**
 *
 * @author taruc
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("apple");
        groceryList.add("banana");
        groceryList.add("durian");
        groceryList.add("orange");
        System.out.println("\nGrocery List:");
        displayList(groceryList);
        
        // remove
        String removedItem = groceryList.remove(2);
        System.out.println("Removed item: " + removedItem);
        System.out.println("Grocery List updated");
        
        displayList(groceryList);
    }

    public static void displayList(ArrayList<String> groceryList) {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
        System.out.println("Total items: " + groceryList.size());
    }
}
