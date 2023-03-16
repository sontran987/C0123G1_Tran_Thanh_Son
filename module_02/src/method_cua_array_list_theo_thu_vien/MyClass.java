package method_cua_array_list_theo_thu_vien;

import java.util.Arrays;

public class MyClass<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    protected Object[] element;

    public MyClass() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyClass(int size) {
        element = new Object[size];
    }

    protected void ensureCapacity() {
        if (size > element.length) {
            int biggerSize = size * 2 + 1;
            element = Arrays.copyOf(element, biggerSize);
        }
    }

    protected void add(E e) {
        size++;
        ensureCapacity();
        element[size - 1] = e;
    }

    protected void add(int index, E e) {
        if (index >= 0 && index <= size) {
            size++;
            ensureCapacity();
            for (int i = size - 2; i >= index; i--) {
                element[i + 1] = element[i];
            }
            element[index] = e;
        }
    }

    protected boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    protected int size() {
        return size;
    }

    protected MyClass clone() {
        MyClass<Object> clone = new MyClass<>(element.length);
        for (Object x : element) {
            clone.add(x);
        }
        return clone;
    }

    protected boolean contains(E o) {
        for (Object x : element) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }

    protected int indexOf(E e) {
        for (int i = 0; i < element.length; i++) {
            if (element[i].equals(e)) {
                return i;
            }
            return -1;
        }
        return -1;
    }

    protected Object get(int i) {
        if (i >= 0 && i < size) {
            return element[i];
        }
        return null;
    }

    protected void clear() {
        element = (Object[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object[] getElement() {
        return this.element;
    }
}
