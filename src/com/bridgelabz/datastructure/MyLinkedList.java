package com.bridgelabz.datastructure;

public class MyLinkedList<K>{

    Node<K> head;
    Node<K> tail;


    public void addLast(Node<K> node) {
        if(head==null)
            head=node;
        if (tail==null)
            tail=node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public void printData() {
        Node<K> tempNode=head;
        while(tempNode!=null)
        {
            System.out.print(tempNode+"-->");
            tempNode=tempNode.getNext();
        }
    }

    public void addFirst(Node<K> node)
    {
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.setNext(head);
            head=node;
        }
    }
}
