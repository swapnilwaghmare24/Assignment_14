package com.bridgelabz.datastructure;

public class StackImplementation<K> {
    OrderedList<K> orderedList;

    public StackImplementation()
    {
        orderedList=new OrderedList<>();
    }


    public void push(K item) {
        orderedList.add(item);
    }

    public void print() {
        orderedList.print();
    }

    public void pop() {
        orderedList.pop();
    }

    public void peek() {
        orderedList.peek();
    }

    public void isEmpty() {
        orderedList.isEmpty();
    }

    public void size() {
        orderedList.size();
    }
}
