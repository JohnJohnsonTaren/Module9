package HomeWorkGO.ua.goit.Module9;

import java.util.ArrayList;
import java.util.Objects;

public class MyArrayList {
    /*
    Напишіть свій клас MyArrayList як аналог класу ArrayList. +

    Можна використовувати 1 масив для зберігання даних.

    Методи
    * add(Object value) додає елемент в кінець +
    * remove(int index) видаляє елемент із вказаним індексом +
    * clear() очищає колекцію +
    * size() повертає розмір колекції +
    * get(int index) повертає елемент за індексом +
    * */

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //______________add_______________________
        System.out.println("#############add################");
        list.add("Denis");
        list.add("Erica");
        list.add("Anastasia");
        list.add("Yaroslav");
        list.add("Igor");
        System.out.println("Add " + list);

        //_________________remove___________________
        System.out.println("##############remove###############");
        list.remove(1);
        System.out.println("Remove " + list.contains(1));

        //_________________get______________________
        System.out.println("###############get##############");
        System.out.println("Get " + list.get(1));

        //_________________size_____________________
        System.out.println("##############size###############");
        System.out.println("Size " + list.size() + " " + list);

        //_________________clear____________________
        System.out.println("##############clear###############");
        list.clear();
        System.out.println("Clear " + list);
    }
}
