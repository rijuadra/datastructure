package com.sai.linkedlist;

public class TestLinkedList {
    public static void main(String args[]){
        SinglyLinkedList s=new SinglyLinkedList();
        s.addAtTheEnd(10);
        s.addAtTheEnd(20);
        s.addAtTheEnd(30);
        System.out.println(s.getLength());
    }
}
