package arraylistandlinkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    private MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        } else {
            elements = new Object[capacity];
        }
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i] = elements[i - 1];

            }
            elements[index] = element;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (size == elements.length) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> P = new MyList<>();
        P.elements = Arrays.copyOf(this.elements, this.size);
        P.size = this.size;
        return P;
    }
    public E remove(int index) {
        if (index < 0 || index > elements.length ) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        } else if (minCapacity < 0) {
            throw new IllegalArgumentException("minCapacity < 0");
        }
    }
}
