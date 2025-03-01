package HomeWorkGO.ua.goit.Module9;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    /*
    Написати свій клас MyHashMap як аналог класу HashMap. +
    Потрібно робити за допомогою однозв'язної Node.
    Не може зберігати дві ноди з однаковими ключами.

    Методи
    * put(Object key, Object value) додає пару ключ + значення
    * remove(Object key) видаляє пару за ключем
    * clear() очищає колекцію
    * size() повертає розмір колекції
    * get(Object key) повертає значення (Object value) за ключем
    * */

    public static void main(String[] args) {
        Map names = new HashMap();

        //______________put_______________________
        System.out.println("#############put################");
        names.put("Denis", 29);
        names.put("Erica", 6);
        names.put("Anastasia", 31);
        names.put("Yaroslav", 1);
        names.put("Igor", 36);
        System.out.println("Put " + names);

        //_________________remove___________________
        System.out.println("##############remove############");
        names.remove("Denis");
        System.out.println("Remove Denis " + names);

        //_________________get______________________
        System.out.println("###############get##############");
        System.out.println("Get " + names.get("Erica"));
        System.out.println(names);

        //_________________size_____________________
        System.out.println("##############size###############");
        System.out.println("Size " + names.size()+ " " + names);

        //_________________clear_____________________
        System.out.println("##############clear###############");
        names.clear();
        System.out.println("Clear " + names);
    }
}
