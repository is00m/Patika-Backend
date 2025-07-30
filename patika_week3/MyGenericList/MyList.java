package MyGenericList;

import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int size;

    public MyList() {
        array = new Object[10];
        size = 0;
    }

    public MyList(int capacity) {
        if (capacity <= 0) {
            System.out.println("Kapasiteniz pozitif olmalı !");
        }
        array = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (size == array.length) {
            grow();
        }
        array[size++] = data;
    }

    private void grow() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) array[index];
        } else {
            return null;
        }
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        array[index] = data;
        return data;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return (T[]) Arrays.copyOf(array, size);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null;
        }

        MyList<T> sub = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add((T) array[i]);
        }
        return sub;
    }
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}