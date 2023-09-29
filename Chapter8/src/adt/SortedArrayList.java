package adt;

/**
 * SortedArrayList - Implements the ADT Sorted List using an array. - Note: Some
 * methods are not implemented yet and have been left as practical exercises
 *
 * @param <T>
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedListInterface<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public SortedArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

//    @Override
//    public boolean add(T newEntry) {
//        int i = 0;
//        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0) {
//            i++;
//        }
//        makeRoom(i + 1);
//        array[i] = newEntry;
//        numberOfEntries++;
//        return true;
//    }
    
    public boolean add(T newEntry) {
        int i = Math.abs(binarySearchIterative(newEntry));
        makeRoom(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;
    }

    public boolean remove(T anEntry) {
        int index = binarySearchIterative(anEntry);
        if(index >= 0){
            removeGap(index +1);
            numberOfEntries--;
            return true;
        }
        return false;
    }

    public void clear() {
        numberOfEntries = 0;
    }

//    public boolean contains(T anEntry) {
//        boolean found = false;
//        for (int index = 0; index < numberOfEntries && anEntry.compareTo(array[index]) >= 0; index++) { //P8Q1
//            if (anEntry.equals(array[index])) {
//                found = true;
//            }
//        }
//        return found;
//    }
    public boolean contains(T anEntry) {
        return binarySearchIterative(anEntry) >= 0;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfEntries; ++index) {
            outputStr += array[index] + "\n";
        }

        return outputStr;
    }

    private boolean isArrayFull() {
        return numberOfEntries == array.length;
    }

    private void doubleArray() {
        T[] oldList = array;
        int oldSize = oldList.length;

        array = (T[]) new Object[2 * oldSize];

        for (int index = 0; index < oldSize; index++) {
            array[index] = oldList[index];
        }
    }

    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = lastIndex; index >= newIndex; index--) {
            array[index + 1] = array[index];
        }
    }

    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    private int binarySearchIterative(T target) {
        int left = 0;
        int right = numberOfEntries - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            int comparison = target.compareTo(array[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Target entry not found, return the insertion point as a negative value
        return -(right + 1);
    }

    public static void main(String[] args) {
        SortedArrayList<Integer> aList = new SortedArrayList<>();
        aList.add(30);
        aList.add(20);
        aList.add(50);
        aList.add(10);
        aList.add(40);
        int index = aList.binarySearchIterative(30);
        System.out.println("Index of 30: " + index);
        System.out.println("Contains 30:" + aList.contains(30));
        index = aList.binarySearchIterative(45);
        System.out.println("Index of 45: " + index);
        System.out.println("Contains 45:" + aList.contains(45));
        
        System.out.println("Removed 20: " +aList.remove(20));
        System.out.print("Sorted ArrayList: \n" + aList);
        

    }

}
