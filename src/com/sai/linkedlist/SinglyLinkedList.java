package com.sai.linkedlist;

public class SinglyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int length = 0;

    public SinglyLinkedList() {
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public int addAtTheEnd(int data) {
        Node node=new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            length++;
        } else {
            tail.setNext(node);
            tail = node;
            length++;

        }
        return 1;
    }

}
