/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author Asus
 */
public class TestPalindrome {

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "modem";
        String s3 = "Race car";
        String s4 = "A man, a plan, a canal: Panama!";
        System.out.printf("isPalindrome(%s): %b\n",s1,StringToolkit.isPalindrome(s1));
        System.out.printf("isPalindrome(%s): %b\n",s2,StringToolkit.isPalindrome(s2));
        System.out.printf("isPalindrome(%s): %b\n",s3,StringToolkit.isPalindrome(s3));
        System.out.printf("isPalindrome(%s): %b\n",s4,StringToolkit.isPalindrome(s4));

    }
}
