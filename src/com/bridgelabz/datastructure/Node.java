package com.bridgelabz.datastructure;

public class Node<K>{

    private K key;
    private Node<K> next;

    public Node(K key) {
        this.key=key;
    }

    public K getKey() {
        return key;
    }

    public Node<K> getNext() {
        return next;
    }



    public void setNext(Node<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }


}
