package com.bridgelabz.datastructure;

public class LinkedListRunner {
    public static void main(String[] args) {
       MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
       /* Node<Integer> node1= new Node<>(70);
        myLinkedList.addFirst(node1);
        Node<Integer> node2= new Node<>(30);
        myLinkedList.addFirst(node2);
        Node<Integer> node3= new Node<>(56);
        myLinkedList.addFirst(node3);
        myLinkedList.printData();

        */

        /*Node<Integer> node1= new Node<>(56);
        myLinkedList.addLast(node1);
        Node<Integer> node2= new Node<>(30);
        myLinkedList.addLast(node2);
        Node<Integer> node3= new Node<>(70);
        myLinkedList.addLast(node3);
        myLinkedList.printData();

         */
        Node<Integer> node1= new Node<>(56);
        myLinkedList.addLast(node1);
        Node<Integer> node2= new Node<>(30);
        myLinkedList.addLast(node2);
        Node<Integer> node3= new Node<>(70);
        myLinkedList.addLast(node3);
        myLinkedList.printData();
        System.out.println();
       // myLinkedList.deleteFirst();
       // myLinkedList.deleteLast();
        //myLinkedList.printData();
       /* if(myLinkedList.search(node3)==true)
        {
            System.out.println("node present in list");
        }
        else
        {
            System.out.println("node is not present in list");
        }*/
        Node<Integer> node4= new Node<>(40);
        myLinkedList.addAtPosition(2,node4);
        myLinkedList.printData();


    }
}
