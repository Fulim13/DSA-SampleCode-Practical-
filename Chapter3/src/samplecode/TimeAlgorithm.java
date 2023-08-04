package samplecode;

public class TimeAlgorithm {

    // O(n) - linear
    public static int algorithmA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // O(n^2) - quadratic 
    public static int algorithmB(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
            }
        }
        return sum;
    }

//    O(1) - constant 
    public static int algorithmC(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        String outputStr = String.format("%10s %12s %12s %12s\n", "n", "Algorithm A", "Algorithm B", "Algorithm C");
        for (int n = 10; n < 1000000; n *= 10) {
            // Algorithm A
            long totalTimeA = 0;
            for (int i = 0; i < 10; i++) {
                long startTime = System.nanoTime();
                algorithmA(n);
                totalTimeA += System.nanoTime() - startTime;
            }
            long avgTimeA = totalTimeA / 10;

            // Algorithm B
            long totalTimeB = 0;
            for (int i = 0; i < 10; i++) {
                long startTime = System.nanoTime();
                algorithmB(n);
                totalTimeB += System.nanoTime() - startTime;
            }
            long avgTimeB = totalTimeB / 10;

            // Algorithm C
            long totalTimeC = 0;
            for (int i = 0; i < 10; i++) {
                long startTime = System.nanoTime();
                algorithmC(n);
                totalTimeC += System.nanoTime() - startTime;
            }
            long avgTimeC = totalTimeC / 10;
            outputStr += String.format("%10d %12d %12d %12d\n", n, avgTimeA, avgTimeB, avgTimeC);

            System.out.printf("\nalgorithmsA(%d) = %d", n, algorithmA(n));
            System.out.printf("\nalgorithmsB(%d) = %d", n, algorithmB(n));
            System.out.printf("\nalgorithmsC(%d) = %d", n, algorithmC(n));
            System.out.println("");

        }
        System.out.println(outputStr);

    }
}
