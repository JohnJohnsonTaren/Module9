package Module9;

public class MyHashMap<K, V> {
    /*
    Написати свій клас MyHashMap як аналог класу HashMap. +
    Потрібно робити за допомогою однозв'язної Node.
    Не може зберігати дві ноди з однаковими ключами.

    Методи
    * put(Object key, Object value) додає пару ключ + значення
    * remove(Object key) видаляє пару за ключем
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * get(Object key) повертає значення (Object value) за ключем +
    * */

    private static final int DEFAULT_CAPACITY = 16;

    public MyHashMap(Node[] buckets, int capacity) {
        this.capacity = capacity;
    }

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    private Node[] buckets;
    private int size;
    private final int capacity;

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node (K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    //_________________put______________________
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> current = buckets[bucketIndex];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K, V> newNode = new Node(key, value);
        newNode.next = buckets[bucketIndex];
        buckets[bucketIndex] = newNode;
        size++;
    }

    //_________________get______________________
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> current = buckets[bucketIndex];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    //________________remove____________________
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> current = buckets[bucketIndex];
        Node<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[bucketIndex] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    //_________________size_____________________
    public int size() {
        return size;
    }

    //________________clear_____________________
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < capacity; i++) {
            Node<K, V> current = buckets[i];
            while (current != null) {
                result.append(current.key).append("=").append(current.value).append(", ");
                current = current.next;
            }
        }
        if (result.length() > 1) {
            result.delete(result.length() - 2, result.length());
        }
        result.append("]");
        return result.toString();
    }
}
