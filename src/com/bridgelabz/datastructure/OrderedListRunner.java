package com.bridgelabz.datastructure;

public class OrderedListRunner {

    public static void main(String[] args) {
        OrderedList<Integer> orderedList=new OrderedList<>();
        orderedList.isEmpty();
        orderedList.add(10);
        orderedList.add(50);
        orderedList.add(70);
        orderedList.add(20);
        orderedList.print();
        System.out.println();
        orderedList.remove(70);
        orderedList.print();
        System.out.println();
        if(orderedList.search(50))
            System.out.println("node present in linked lsit");
        else
            System.out.println("node is not present in linked list");
        orderedList.isEmpty();
        orderedList.size();
        orderedList.index(20);
        orderedList.pop();
        orderedList.size();
    }
}
