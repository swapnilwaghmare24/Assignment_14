package com.bridgelabz.datastructure;

public class QueueRunner {
    public static void main(String[] args) {
        QueueImplementation<Integer> queueImplementation=new QueueImplementation<>();
        queueImplementation.isEmpty();
        queueImplementation.append(56);
        queueImplementation.append(30);
        queueImplementation.append(70);
        queueImplementation.print();
        System.out.println();
        queueImplementation.delete();
        queueImplementation.print();
        System.out.println();
        queueImplementation.isEmpty();
        queueImplementation.size();


    }
}
