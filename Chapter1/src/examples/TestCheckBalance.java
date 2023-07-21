package examples;

public class TestCheckBalance {

    public static void main(String[] args) {
        String expr1 = "(a+b)*{[c-d]/e}";
        String expr2 = "(a+b";
        String expr3 = "a+b)";
        String expr4 = "(a+b}";

        System.out.println(expr1 + ": " + MathUtil.checkbalance(expr1));
        System.out.println(expr2 + ": " + MathUtil.checkbalance(expr2));
        System.out.println(expr3 + ": " + MathUtil.checkbalance(expr3));
        System.out.println(expr4 + ": " + MathUtil.checkbalance(expr4));

    }
}
