package lesson_26.linked_list;
/*
@date 19.06.2024
@author Sergey Bugaienko
*/

import lists.MyLinkedList;

import java.util.Arrays;

public class ListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
//        linkedList.add(1);

        System.out.println("getFirst(): " + linkedList.getFirst());

        System.out.println("getLast(): " + linkedList.getLast());

        linkedList.addAll(0, 1, 2, 3, 4, 5, 6);

        linkedList.set(7, 10);
        System.out.println(linkedList.remove());
        System.out.println(linkedList.remove());

        System.out.println(linkedList.removeFirst());

        System.out.println("removeLast: " + linkedList.removeLast());


        System.out.println("Удаление по несуществующему индексу: " + linkedList.remove(5));
        System.out.println(linkedList);

        System.out.println("Удаление по  индексу: " + linkedList.remove(0));

        System.out.println(linkedList);

        System.out.println("\n ======================== \n");

        linkedList.addAll(100, 200, 300);

        System.out.println("linkedList.remove(Integer.valueOf(1000)): " + linkedList.remove(Integer.valueOf(1000)));
        System.out.println("linkedList.remove(Integer.valueOf(100)): " + linkedList.remove(Integer.valueOf(100)));

        System.out.println(linkedList);

//        linkedList = new MyLinkedList<>();

        Integer[] array = linkedList.toArray();
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }



    }
}
