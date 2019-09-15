package com.sai.linkedlist;

public class TestLinkedList {
    public static void main(String args[]) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.addAtTheEnd(10);
        s.addAtTheEnd(20);
        s.addAtTheEnd(30);
        s.addAtTheBegining(15);
        s.addAfter(20,25);
        s.addBefore(20,5);
        s.delete(10);
        System.out.println("The first element was " + s.deleteFirst());
        System.out.println("The length of the linked list is " + s.getLength());

        System.out.println("The Linked List has the following elements "+s);

        System.out.println("The last element was " + s.deleteLast());
        System.out.println("The length of the linked list is " + s.getLength());

        System.out.println("The Linked List has the following elements "+s);

    }
}
