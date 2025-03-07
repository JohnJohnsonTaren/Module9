package Module9;

import java.util.StringJoiner;

public class MyStack<E> {
    /*
    Написати свій клас MyStack як аналог класу Stack,
    який працює за принципом LIFO (last-in-first-out). +

    Можна робити за допомогою Node або використати масив.

    Методи
    * push(Object value) додає елемент в кінець
    * remove(int index) видаляє елемент за індексом
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * peek() повертає перший елемент стеку
    * pop() повертає перший елемент стеку та видаляє його з колекції
    * */

    private Object[] data;
    private int size;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = 5;
        this.data = new Object[capacity];
        this.size = 0;
    }

    //______________push_______________________
    public void push(E value) {
        data[size++] = value;
    }

    //_________________remove___________________
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    //_________________size_____________________
    public int size() {
        return size;
    }

    //_________________peek_____________________
    public E peek() {
        if (size == 0) {
            return null;
        }
        return (E) data[size - 1];
    }

    //_________________pop_____________________
    public E pop() {
        if (size == 0) {
            return null;
        }
        E value = (E) data[--size];
        data[size] = null;
        return value;
    }

    //_________________clear_____________________
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(String.valueOf(data[i]));
        }
        return "[" + result + "]";
    }
}
