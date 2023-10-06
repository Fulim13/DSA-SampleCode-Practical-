package client;

import entity.Name;

public class TestName {

    private final static int TABLE_SIZE = 11;

    private static int getHashIndex(Name name) {
        // the reason use % TABLE_SIZE; is to try to limit the answer to 0 - (arr.size - 1)

        int hashIndex = name.hashCode() % TABLE_SIZE;
        if (hashIndex < 0) {
            hashIndex = hashIndex + TABLE_SIZE;
        }
        return hashIndex;
    }

    public static void main(String[] args) {
        Name n1 = new Name("BEA", "ARTHUR");
        System.out.println("\nName: " + n1);
        System.out.println("HashCode: " + n1.hashCode());
        System.out.println("HashIndex: " + getHashIndex(n1));

        Name n2 = new Name("ABE", "LINCOLN");
        System.out.println("\nName: " + n2);
        System.out.println("HashCode: " + n2.hashCode());
        System.out.println("HashIndex: " + getHashIndex(n2));

        int num = Integer.MAX_VALUE;
        System.out.println("\nMax int: " + num);
        num += 10;
        System.out.println("num += 10: " + num);

        System.out.println("\n\n\n");
    }
}
