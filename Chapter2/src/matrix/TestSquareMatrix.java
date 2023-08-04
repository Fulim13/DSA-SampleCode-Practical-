/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Asus
 */
public class TestSquareMatrix {

    public static void main(String[] args) {
        SquareMatrixInterface s1 = new SquareMatrix(3);
        System.out.println("s1:\n" + s1);

        s1.storeValue(1, 1, 1);
        s1.storeValue(1, 2, 2);
        s1.storeValue(1, 3, 3);
        s1.storeValue(2, 1, 4);
        s1.storeValue(2, 2, 5);
        s1.storeValue(2, 3, 6);
        s1.storeValue(3, 1, 7);
        s1.storeValue(3, 2, 8);
        s1.storeValue(3, 3, 9);
        System.out.println("After storeValue, s1:\n" + s1);

        s1.makeEmpty(2);
        System.out.println("After makeEmpty, s1:\n" + s1);
        // Test invalid case
        s1.makeEmpty(4);
        System.out.println("After makeEmpty, s1:\n" + s1);
        
        SquareMatrixInterface s2 = new SquareMatrix(3);
        s2.storeValue(1, 1, 7);
        s2.storeValue(1, 2, 2);
        s2.storeValue(1, 3, 4);
        s2.storeValue(2, 1, 5);
        s2.storeValue(2, 2, 3);
        s2.storeValue(2, 3, 2);
        s2.storeValue(3, 1, 1);
        s2.storeValue(3, 2, 0);
        s2.storeValue(3, 3, 1);
        System.out.println("s2:\n" + s2);
        
        SquareMatrixInterface s3 = s1.add(s2);
        System.out.println("s3:\n" + s3);
        
        // Copy
        s3.copy(s2);
        System.out.println("s2 after copy from s3:\n" + s2);
        
        

    }
}
