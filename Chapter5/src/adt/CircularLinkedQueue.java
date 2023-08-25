package adt;

import java.util.Iterator;

public class CircularLinkedQueue<T> implements QueueInterface<T> {

    private Node lastNode;

    public CircularLinkedQueue() {
        lastNode = null;
    }

    @Override
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        if (!isEmpty()) {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        } else { // When the linked list is empty
            newNode.next = newNode;
        }
        lastNode = newNode;

    }

    @Override
    public T dequeue() {
        T frontElement = null;
        if (!isEmpty()) {
            frontElement = lastNode.next.data;
            if (lastNode.next == lastNode) { // only 1 node
                clear();
            } else { // > 1 node
                lastNode.next = lastNode.next.next;
            }

        }

        return frontElement;

    }

    @Override
    public T getFront() {
        T frontElement = null;

        if (!isEmpty()) {
            frontElement = lastNode.next.data;
        }

        return frontElement;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public void clear() {
        // JVM only garbage collect when there is not thing point to that things, but the circular all point to it next,
        // in linear do not have this problem ,because firstNode does not have any pointer to point to
        // firstNode will return to system heap since no one point to, after the  firstNode garbage collector, secondNode do not have pointer point to itself
        // heat overflow error (finite error)
        // if have accosicative assignment, Right to Left, 
        // lastNode.next = null; lastNode = null(lastNode.next);
        lastNode = lastNode.next = null;
    }

    @Override
    public String toString() {
        String str = "";
        if (!isEmpty()) {
            Node currentNode = lastNode.next;
            do {
                str += currentNode.data + " ";
                currentNode = currentNode.next;
            } while (currentNode != lastNode.next);
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

}
