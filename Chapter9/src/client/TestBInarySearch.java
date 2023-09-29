package client;

import adt.BinarySearchTree;
import java.util.Iterator;

public class TestBInarySearch {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bTree = new BinarySearchTree<>();
        bTree.add(50);
        bTree.add(80);
        bTree.add(20);
        bTree.add(40);
        bTree.add(90);
        bTree.add(10);
        bTree.add(70);
        bTree.add(60);
        bTree.add(30);
        System.out.println("\nInorder: ");
        Iterator<Integer> itIn = bTree.getInorderIterator();
        while(itIn.hasNext())
            System.out.print(itIn.next() + " ");
        System.out.println("");
        
        Iterator<Integer> itPre = bTree.getPreorderIterator();
        while(itPre.hasNext())
            System.out.print(itPre.next() + " ");
        System.out.println("");
        
        Iterator<Integer> itPost = bTree.getPostorderIterator();
        while(itPost.hasNext())
            System.out.print(itPost.next() + " ");
        System.out.println("");
        

    }
}
