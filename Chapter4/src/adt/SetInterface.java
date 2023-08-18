package adt;

import java.util.Iterator;

public interface SetInterface<T> {
    
    Iterator<T> getIterator();
    
    // can add in front public abstract , but public abstract is already auto add to every method in the interface
    boolean add(T newElement);

    boolean remove(T anElement);

    boolean checkSubset(SetInterface anotherSet);

    void union(SetInterface anotherSet);

    SetInterface intersection(SetInterface anotherSet);

    boolean isEmpty();
}
