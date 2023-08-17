package adt;

public class ArraySet<T> implements SetInterface<T> {

    private int numberOfEntries;
    private T[] array;
    private final static int DEFAULT_CAPACItY = 100;

    public ArraySet() {
        numberOfEntries = 0;
        array = (T[]) new Object[DEFAULT_CAPACItY];
    }

//    ALT + INSERT to insert code
    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < numberOfEntries; i++) {
            str += array[i] + ", ";
        }
        str += "\b\b}";
        return str;
    }

    // private method, do not use in another location, only use here internally
    private int indexOf(T anElement) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (array[i].equals(anElement)) {
                return i; // anElement exists in the set
            }
        }
        return -1; // anElement does not exist in the set
    }

    @Override
    public boolean add(T newElement) {
        int index = indexOf(newElement);
        if (index == -1) {
            array[numberOfEntries++] = newElement;
            return true;
        }
        return false; // newElement already exists in the set
    }

    @Override
    public boolean remove(T anElement) {
        int index = indexOf(anElement);
        if (index != -1) { // anElment exists in the set
            for (int i = index; i < numberOfEntries - 1; i++) {
                array[i] = array[i + 1];
            }
            numberOfEntries--;
            return true;
        }
        return false;

    }

    @Override
    public boolean checkSubset(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void union(SetInterface anotherSet) {
        //Downcasting
        ArraySet<T> givenSet = (ArraySet<T>)anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
            this.add(givenSet.array[i]);
        }
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

}
