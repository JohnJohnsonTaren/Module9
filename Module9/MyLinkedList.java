package Module9;


public class MyLinkedList<E> {
    /*
    Напишіть свій клас MyLinkedList як аналог класу LinkedList(Node). +

    Не можна використовувати масив. Кожний елемент повинен бути
    окремим об'єктом-посередником (Node - нода), що зберігає посилання
    на попередній та наступний елемент колекції (двозв'язний список).

    Методи
    * add(Object value) додає елемент в кінець +
    * remove(int index) видаляє елемент із вказаним індексом +
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * get(int index) повертає елемент за індексом +
    * */

    private Node<E> head; // Перший елемент списку
    private Node<E> tail; // Останній елемент списку
    int size;   // Розмір списку

    // Ініціалізація змінних
    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    //______________add_______________________
    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    private Node<E> getNode(int index) {
        Node<E> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i--) {
                current = current.prev;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    //_________________get______________________
    public E get(int index) {
        return (E) getNode(index).data;
    }

    //_________________remove___________________
    public void remove(int index) {
        Node current = getNode(index);
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
    }

    //_________________clear____________________
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    //_________________size_____________________
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
