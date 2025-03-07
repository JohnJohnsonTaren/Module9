package Module9;

import java.util.StringJoiner;

public class MyQueue<E> {
    /*
    Написати свій клас MyQueue як аналог класу Queue,
    який буде працювати за принципом FIFO (first-in-first-out). +

    Можна робити за допомогою Node або використати масив.

    Методи
    * add(Object value) додає елемент в кінець +
    * clear() очищає колекцію +
    * size() повертає розмір колекції +
    * peek() повертає перший елемент з черги +
    * poll() повертає перший елемент з черги і видаляє його з колекції +
    * */

    private Object[] data;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    public MyQueue(int capacity) {
        this.data = new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        this.capacity = 5;
    }

    //______________add_______________________
    public void add(E value) {
        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
    }

    //_________________clear____________________
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            data[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
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
        return (E) data[head];
    }

    //_________________poll_____________________
    public E poll() {
        if (size == 0) {
            return null;
        }
        E value = (E) data[head];
        head = (head + 1) % data.length;
        size--;
        return value;
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
