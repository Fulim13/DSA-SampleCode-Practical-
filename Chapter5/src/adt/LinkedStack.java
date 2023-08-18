package adt;

public class LinkedStack<T> implements StackInterface<T> {
    private Node topNode;

    public LinkedStack() {
        topNode = null;
    }
    
    @Override
    public String toString() {
        String str = "";
        Node currentNode = topNode;
        while(currentNode != null){
            str += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return str;
    }

    
    private class Node {
        T data;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        
    }

    
    @Override
    public void push(T newEntry) {
        //1. Create a new ndoe with the given value
        Node newNode = new Node(newEntry);
        
        //2. Link the new node to the topNode
        newNode.next = topNode;
        
        //3. Update topNode to point to the new node
        topNode = newNode;
    }

    @Override
    public T pop() {
        T topElement = null;
        if(!isEmpty()){
            topElement = topNode.data;
            topNode = topNode.next;
        }
        return topElement;
    }

    @Override
    public T peek() {
        T topElement = null;
        if(!isEmpty()){
            topElement = topNode.data;
        }
        return topElement;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }
    
}
