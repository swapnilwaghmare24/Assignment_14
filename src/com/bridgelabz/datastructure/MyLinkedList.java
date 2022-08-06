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


    public void addAtPosition(int index, Node<K> node) {
        Node<K> tempNode=head;
        for(int i=0;i<index-1;i++)
        {
            tempNode=tempNode.getNext();
        }
        if(tempNode!=null)
        {
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        else {
            System.out.println("you can not insert node at this position");
        }
    }

    public void deleteFirst() {
        Node<K> tempNode=head;
        head=tempNode.getNext();
        tempNode.setNext(null);
    }

    public void deleteLast() {
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else {
            Node<K> tempNode=head;
            while(tempNode.getNext().getNext()!=null)
            {
                tempNode=tempNode.getNext();
            }
            tail=tempNode;
            tempNode.setNext(null);
        }
    }

    public boolean search(Node<K> node) {
        Node<K> tempNode=head;
        while(tempNode!=null)
        {
            if(tempNode.getKey().equals(node.getKey()))
            {
                return true;
            }
            tempNode=tempNode.getNext();
        }
        return false;
    }


}
