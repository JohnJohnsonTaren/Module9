package HomeWorkGO.ua.goit.Module9;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    /*
    Написати свій клас MyQueue як аналог класу Queue,
    який буде працювати за принципом FIFO (first-in-first-out).

    Можна робити за допомогою Node або використати масив.

    Методи
    * add(Object value) додає елемент в кінець
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * peek() повертає перший елемент з черги
    * poll() повертає перший елемент з черги і видаляє його з колекції
    * */

    public static void main(String[] args) {
        Queue queue = new LinkedList();

        //______________offer_______________________
        System.out.println("#############offer################");
        queue.offer("Denis");
        queue.offer("Erica");
        queue.offer("Anastasia");
        queue.offer("Yaroslav");
        queue.offer("Igor");
        System.out.println("Offer " + queue);

        //_________________size_____________________
        System.out.println("##############size###############");
        System.out.println("Size " + queue.size() + " " + queue);

        //_________________peek_____________________
        System.out.println("##############peek###############");
        Object peek = queue.peek();
        System.out.println("Peek " + peek);
        System.out.println(queue);

        //_________________remove___________________
        System.out.println("##############remove###############");
        queue.remove(3);
        System.out.println("Remove " + queue.remove());

        //_________________poll_____________________
        System.out.println("##############poll###############");
        Object poll = queue.poll();
        System.out.println("Poll " + poll);
        System.out.println(queue);

    }
}
