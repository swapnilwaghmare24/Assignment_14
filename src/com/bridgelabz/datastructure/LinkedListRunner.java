package com.bridgelabz.datastructure;

public class LinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        Node<Integer> node1= new Node<>(70);
        myLinkedList.addFirst(node1);
        Node<Integer> node2= new Node<>(30);
        myLinkedList.addFirst(node2);
        Node<Integer> node3= new Node<>(56);
        myLinkedList.addFirst(node3);
        myLinkedList.printData();
    }
}
