package Module9;

public class Main {
    public static void main(String[] args) {
        // MyArrayList
        System.out.println("__________________________MyArrayList_________________________");
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Denis");
        list.add("Erica");
        list.add("Anastasia");
        list.add("Yaroslav");
        list.add("Igor");

        System.out.println("#############add&size################");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());

        System.out.println("###########remove&size###############");
        list.remove(1);
        System.out.println("Remove: " + list);
        System.out.println("Size: " + list.size());


        System.out.println("##############get&size###############");
        list.get(3);
        System.out.println("Get: " + list);
        System.out.println("Size: " + list.size());

        System.out.println("##############clear&size###############");
        list.clear();
        System.out.println("Clear: " + list);
        System.out.println("Size: " + list.size());


        // MyLinkedList
        System.out.println("__________________________________MyLinkedList_______________________________");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Denis");
        linkedList.add("Erica");
        linkedList.add("Anastasia");
        linkedList.add("Yaroslav");
        linkedList.add("Igor");

        //______________add_______________________
        System.out.println("#############add################");
        System.out.println("Add " + linkedList);

        //_________________remove___________________
        System.out.println("#############remove#############");
        linkedList.remove(2);
        System.out.println("Remove " + linkedList);

        //_________________get______________________
        System.out.println("###############get##############");
        System.out.println("Get " + linkedList.get(4));

        //_________________size_____________________
        System.out.println("##############size###############");
        linkedList.size();
        System.out.println("Size " + linkedList);

        //_________________clear____________________
        System.out.println("##############clear###############");
        linkedList.clear();
        System.out.println("Clear " + linkedList);


        // MyQueue
        System.out.println("___________________________________MyQueue_________________________________");
        MyQueue<String> queue = new MyQueue<>(10);
        queue.add("Denis");
        queue.add("Erica");
        queue.add("Anastasia");
        queue.add("Yaroslav");
        queue.add("Igor");

        //______________add_______________________
        System.out.println("#############offer################");
        System.out.println("Offer " + queue);

        //_________________size_____________________
        System.out.println("##############size###############");
        queue.size();
        System.out.println("Size " + queue);

        //_________________peek_____________________
        System.out.println("##############peek###############");
        System.out.println("Peek " + queue.peek());
        System.out.println("Peek " + queue);

        //_________________poll_____________________
        System.out.println("##############poll###############");
        System.out.println("Poll " + queue.poll());
        System.out.println("Poll " + queue);

        //_________________clear____________________
        System.out.println("##############clear###############");
        queue.clear();
        System.out.println("Clear " + queue);


        // MyStack
        System.out.println("________________________________MyStack___________________________________");
        MyStack<String> stack = new MyStack<>(10);
        stack.push("Denis");
        stack.push("Erica");
        stack.push("Anastasia");
        stack.push("Yaroslav");
        stack.push("Igor");

        //______________push_______________________
        System.out.println("#############push################");
        System.out.println("Push " + stack);

        //_________________remove___________________
        System.out.println("##############remove###############");
        stack.remove(2);
        System.out.println("Remove " + stack);

        //_________________size_____________________
        System.out.println("##############size###############");
        stack.size();
        System.out.println("Size " + stack);

        //_________________peek_____________________
        System.out.println("##############peek###############");
        System.out.println("Peek " + stack.peek());

        //_________________pop_____________________
        System.out.println("##############pop###############");
        System.out.println("Pop " + stack.pop());

        //_________________clear_____________________
        System.out.println("##############clear###############");
        stack.clear();
        System.out.println("Clear " + stack);


        // MyHashMap
        System.out.println("________________________________MyHashMap__________________________________");
        MyHashMap<String, Integer> map = new MyHashMap<>(16);
        map.put("Denis", 1);
        map.put("Erica", 2);
        map.put("Anastasia", 3);
        map.put("Yaroslav", 4);
        map.put("Igor", 5);

        //______________put_______________________
        System.out.println("#############put################");
        System.out.println("Put " + map);

        //_________________remove___________________
        System.out.println("##############remove############");
        map.remove("Igor");
        System.out.println("Remove " + map);

        //_________________get______________________
        System.out.println("###############get##############");
        System.out.println("Get " + map.get("Erica"));

        //_________________size_____________________
        System.out.println("##############size###############");
        map.size();
        System.out.println("Size " + map);

        //_________________clear_____________________
        System.out.println("##############clear###############");
        map.clear();
        System.out.println("Clear " + map);
    }
}

