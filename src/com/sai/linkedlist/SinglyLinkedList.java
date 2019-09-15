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
        Node node = new Node(data);
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

    public int addAtTheBegining(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        length++;
        return 1;

    }

    public int deleteFirst() {
        Integer i = (Integer) head.getData();
        head = head.getNext();
        length--;
        return i;
    }

    public int deleteLast() {
        Integer i = 1;
        Node node = head;
        Node nodePrev = head;
        while (node != tail) {
            nodePrev = node;
            node = node.getNext();
        }
        i = (Integer) node.getData();
        nodePrev.setNext(null);
        length--;
        return i;
    }

    @Override
    public String toString() {
        String data = "";
        Node node = new Node();
        node = head;
        while (node != null) {
            data = data + ((data == "") ? "" : ",") + node.getData();
            node = node.getNext();
        }
        return data;
    }

    public void addAfter(int positionData, int data) {
        Node node = new Node(data);
        Node nd = head;
        boolean flag = true;
        while (nd != null) {
            if (nd.getData().equals(positionData)) {
                node.setNext(nd.getNext());
                nd.setNext(node);
                flag = false;
                length++;
                break;
            }
            nd = nd.getNext();
        }
        if (flag) {
            System.out.println("position element not found");
        }
    }

    public void addBefore(int positionData, int data) {
        Node node = new Node(data);
        Node nd = head;
        Node prev = head;
        boolean flag = true;
        while (nd != null) {
            if (nd.getData().equals(positionData)) {
                node.setNext(nd);
                prev.setNext(node);
                flag = false;
                length++;
                break;
            }
            prev = nd;
            nd = nd.getNext();
        }
        if (flag) {
            System.out.println("position element not found");
        }
    }
}
