package client;

import entity.Student;

public class TestStudent {
    public static void main(String[] args) {
        //3215210011113224 is literal contants/values
        // int name is define literal
        // put L in the back, tell this is long literal contants 
        Student s1 = new Student(3215210011113224L,"Kermit",3.2);
        System.out.println("\ns1: " + s1);
        System.out.println("HashCode: "+ s1.hashCode());
    }
}
