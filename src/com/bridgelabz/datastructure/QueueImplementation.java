package com.bridgelabz.datastructure;

public class QueueImplementation<K> {
    OrderedList<K> orderedList;

    public QueueImplementation()
    {
        orderedList=new OrderedList<>();
    }


    public void append(K item) {
        orderedList.append(item);
    }

    public void print() {
        orderedList.print();
    }

    public void delete() {
        orderedList.delete();
    }

    public void isEmpty() {
        orderedList.isEmpty();
    }

    public void size() {
        orderedList.size();
    }
}
