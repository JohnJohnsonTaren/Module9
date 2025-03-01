package HomeWorkGO.ua.goit.Module9;

import java.util.LinkedList;

public class MyLinkidList {
    /*
    Напишіть свій клас MyLinkedList як аналог класу LinkedList(Node).

    Не можна використовувати масив. Кожний елемент повинен бути
    окремим об'єктом-посередником (Node - нода), що зберігає посилання
    на попередній та наступний елемент колекції (двозв'язний список).

    Методи
    * add(Object value) додає елемент в кінець +
    * remove(int index) видаляє елемент із вказаним індексом +
    * clear() очищає колекцію +
    * size() повертає розмір колекції +
    * get(int index) повертає елемент за індексом +
    * */

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //______________add_______________________
        System.out.println("#############add################");
        linkedList.add("Denis");
        linkedList.add("Erica");
        linkedList.add("Anastasia");
        linkedList.add("Yaroslav");
        linkedList.add("Igor");
        System.out.println("Add " + linkedList);

        //_________________remove___________________
        System.out.println("##############remove###############");
        linkedList.remove(4);
        System.out.println("Remove " + linkedList.contains(4));

        //_________________get______________________
        System.out.println("###############get##############");
        System.out.println("Get " + linkedList.get(2));

        //_________________size_____________________
        System.out.println("##############size###############");
        System.out.println("Size " + linkedList.size() + " " + linkedList);

        //_________________clear____________________
        System.out.println("##############clear###############");
        linkedList.clear();
        System.out.println("Clear " + linkedList);
    }
}
