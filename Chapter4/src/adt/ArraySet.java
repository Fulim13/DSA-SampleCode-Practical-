package adt;

import java.util.Iterator;

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
        ArraySet<T> givenSet = (ArraySet<T>) anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
            if (this.indexOf(givenSet.array[i]) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void union(SetInterface anotherSet) {
        //Downcasting
        ArraySet<T> givenSet = (ArraySet<T>) anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
            this.add(givenSet.array[i]);
        }
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        SetInterface<T> resultSet = new ArraySet<>();
        ArraySet<T> givenSet = (ArraySet<T>) anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
//            if (this.indexOf(givenSet.array[i]) != -1) {
//                resultSet.add(givenSet.array[i]);
//            }
            T currentElement = givenSet.array[i];
            int index = indexOf(currentElement);
            if (index != -1) { // givenSet's current element is in this set
                resultSet.add(currentElement);
            }
        }
        return resultSet;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public Iterator<T> getIterator() {
        return new SetIterator();
    }
    
    private class SetIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < numberOfEntries;
        }

        @Override
        public T next() {
            T currentElement = null;
            if(hasNext()){
                currentElement = array[currentIndex++];
            }
            return currentElement;
        }
        
    }

}
