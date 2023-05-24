package com.example;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size++;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
