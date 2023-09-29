package client;

import adt.BinaryTree;
import java.util.Stack;

public class TestExprTree {
    
    public BinaryTree<String> buildTree(String postfix){
        Stack<BinaryTree<String>> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if(ch == '+' || ch == '-' ||ch == '*' ||ch == '/' ){
                BinaryTree<String> rightTree = stack.pop();
                BinaryTree<String> leftTree = stack.pop();
                BinaryTree<String> subTree = new BinaryTree<>(ch + "",leftTree,rightTree);
                stack.push(subTree);
            } else {
                stack.push(new BinaryTree<>(ch+""));
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args) {
        TestExprTree test = new TestExprTree();
        String postfix = "abc*+";
        BinaryTree<String> exprTree = test.buildTree(postfix);
        System.out.println("\n Expression in postfix form: ");
        exprTree.postorderTraverse();
        exprTree.preorderTraverse();
        exprTree.inorderTraverse();
    }
}
