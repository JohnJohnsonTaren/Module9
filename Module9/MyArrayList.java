package Module9;

import java.util.StringJoiner;

public class MyArrayList<E> {
    /*
    Напишіть свій клас MyArrayList як аналог класу ArrayList. +
    Можна використовувати 1 масив для зберігання даних.

    Методи
    * add(Object value) додає елемент в кінець
    * remove(int index) видаляє елемент із вказаним індексом
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * get(int index) повертає елемент за індексом
    * */

    private Object[] array; // Масив для зберігання даних
    private int size; // Ініціалізація розмірності масиву

    // Ініціалізація змінних
    public MyArrayList() {
        array = new Object[10]; // Початковий розмір масиву
        size = 0;
    }

    public void add(E value) {
        if (size == array.length) {
            // Збільшуємо в 2 розмір масиву, якщо він заповнений
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        for (int i = index; i < this.size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[this.size - 1] = null;
        this.size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(String.valueOf(array[i]));
        }
        return "[" + result + "]";
    }
}

