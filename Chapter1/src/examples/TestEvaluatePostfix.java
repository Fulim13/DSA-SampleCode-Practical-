package examples;

public class TestEvaluatePostfix {
    public static void main(String[] args) {
        String expr1 = "62+53*/";
        
        System.out.println(expr1 + "= " + MathUtil.evaluatePostfix(expr1));
        System.out.printf("%s = %.7f\n",expr1,MathUtil.evaluatePostfix(expr1));
    }
}
