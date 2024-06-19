package lesson_26.linked_list;
/*
@date 19.06.2024
@author Sergey Bugaienko
*/

import lists.MyLinkedList;

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


        System.out.println(linkedList);


    }
}
