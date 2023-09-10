package utility;

public class MathUtil {
    
    
    private static int[] fibArray = new int[100];
    
    public static int aFib(int n){
        if(n ==1 || n == 2)
            return 1;
        else if(fibArray[n] == 0){
            fibArray[n] = aFib(n-1) + aFib(n-2);
        }
        return fibArray[n];
    }

    public static void countUp(int n) {
        if (n > 1) {
            countUp(n-1);
        }
        System.out.println(n);
    }
    
    public static int fib(int n){
        if (n== 1 || n==2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    
    public static int iFib(int n){
        if(n==1 || n==2)
            return 1;
        else {
            int prevTwo = 1;
            int prevOne = 1;
            int current = 1;
            for (int i = 3; i <= n; i++) {
                current = prevTwo + prevOne;
                prevTwo = prevOne;
                prevOne = current;
            }
            return current;
        }
    }
   

    public static void main(String[] args) {
        System.out.println("Fibonacci");
        for (int n = 1; n <= 20; n++) {
            System.out.printf("fib(%d) = %d\n",n,fib(n));
        }
        System.out.println("Iterative Fibonacci");
        for (int n = 1; n <= 20; n++) {
            System.out.printf("fib(%d) = %d\n",n,iFib(n));
        }
        System.out.println("Array Fibonacci");
        for (int n = 1; n <= 20; n++) {
            System.out.printf("fib(%d) = %d\n",n,aFib(n));
        }
        System.out.println("Count up");
        countUp(5);
    }

}
