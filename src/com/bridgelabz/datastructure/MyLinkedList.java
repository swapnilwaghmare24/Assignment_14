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

    public Node<K> deleteLast() {
        Node<K> deletedNode=null;
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
            deletedNode=tempNode.getNext();
            tail=tempNode;

            tempNode.setNext(null);

        }
        return deletedNode;
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


    public int size() {
        Node<K> tempNode= head;
        int count=0;
        while (tempNode!=null)
        {
            count++;
            tempNode=tempNode.getNext();
        }
        return count;
    }

    public void remove(Node<K> node) {

        Node<K> tempNode=head;
        if(tempNode.getKey().equals(node.getKey()))
        {
            deleteFirst();
        }
        else {
            while(tempNode!=null)
            {
                if(tempNode.getNext()!=null && tempNode.getNext().getKey().equals(node.getKey()))
                {
                    Node<K> deletedNode=tempNode.getNext();
                    tempNode.setNext(tempNode.getNext().getNext());
                    deletedNode.setNext(null);
                }
                tempNode=tempNode.getNext();
            }
        }

    }

    public boolean isEmpty() {
        if(head==null)
            return true;
        return false;
    }

    public int index(Node<K> node) {
        Node<K> tempNode=head;
        int count=0;
        while (tempNode!=null)
        {
            if(tempNode.getKey().equals(node.getKey()))
                count++;
            tempNode=tempNode.getNext();

        }
        return count;
    }

    public Node<K> peek()
    {
        Node<K> tempNode=head;
        while(tempNode.getNext()!=null)
        {
            tempNode=tempNode.getNext();
        }
        return tempNode;
    }
}
