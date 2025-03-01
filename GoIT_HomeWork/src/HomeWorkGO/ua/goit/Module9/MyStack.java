package HomeWorkGO.ua.goit.Module9;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {
    /*
    Написати свій клас MyStack як аналог класу Stack,
    який працює за принципом LIFO (last-in-first-out).

    Можна робити за допомогою Node або використати масив.

    Методи
    * push(Object value) додає елемент в кінець
    * remove(int index) видаляє елемент за індексом
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * peek() повертає перший елемент стеку
    * pop() повертає перший елемент стеку та видаляє його з колекції
    * */

    public static void main(String[] args) {
        Deque deque = new LinkedList();

        //______________push_______________________
        System.out.println("#############push################");
        deque.offer("Denis");
        deque.addFirst("Erica");
        deque.offer("Anastasia");
        deque.offer("Yaroslav");
        deque.offerLast("Igor");
        System.out.println("Push " + deque);

        //_________________remove___________________
        System.out.println("##############remove###############");
        System.out.println("Remove " + deque.remove(3));

        //_________________size_____________________
        System.out.println("##############size###############");
        System.out.println("Size " + deque.size() + " " + deque);

        //_________________peek_____________________
        System.out.println("##############peek###############");
        Object peek = deque.peek();
        System.out.println("Peek " + peek);
        System.out.println(deque);

        //_________________pop_____________________
        System.out.println("##############pop###############");
        System.out.println("Pop " + deque.pop());
        System.out.println(deque);

        //_________________clear_____________________
        System.out.println("##############clear###############");
        deque.clear();
        System.out.println("Clear " + deque);

    }
}
