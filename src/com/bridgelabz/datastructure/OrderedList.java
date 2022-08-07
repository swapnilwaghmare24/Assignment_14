package com.bridgelabz.datastructure;

import java.util.LinkedList;

public class OrderedList<K> {

    MyLinkedList<K> linkedList;

    public OrderedList()
    {
        linkedList=new MyLinkedList<>();
    }

    public void add(K item)
    {
        Node<K> node=new Node<K>(item);
        linkedList.addFirst(node);

    }

    public void print() {
        linkedList.printData();
    }

    public void remove(K item) {
        Node<K> node=new Node<>(item);
        linkedList.remove(node);
    }

    public boolean search(K item) {
        Node<K> node=new Node<>(item);
        return linkedList.search(node);
    }

    public void isEmpty() {
        if(linkedList.isEmpty())
            System.out.println("list is empty");
        else
            System.out.println("list is not empty");
    }

    public void size() {
        int size=linkedList.size();
        System.out.println("list size is "+size);
    }

    public void index(K item) {
        Node<K> node=new Node<>(item);
        System.out.println(linkedList.index(node));
    }

    public void pop() {
        System.out.println("popped out node is "+linkedList.deleteLast());
    }

    public void peek() {
        System.out.println("top of stack is "+linkedList.peek());
    }


    public void append(K item) {
        Node<K> node = new Node<>(item);
        linkedList.addLast(node);
    }

    public void delete() {
        linkedList.deleteFirst();
    }
}
