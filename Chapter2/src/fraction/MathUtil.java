
package fraction;

public class MathUtil {
    public static int gcd(int a, int b){
        if(a < b)
            return gcd(b,a);
        else if (a % b == 0)
            return b;
        else
            return gcd(b,a%b);
    }
    
    public static void main(String[] args) {
        int a= 45;
        int b = 15;
        System.out.printf("gcd(%d, %d) = %d\n",a,b,gcd(a,b));
    }
}
