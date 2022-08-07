package com.bridgelabz.datastructure;

public class StackRunner {
    public static void main(String[] args) {

        StackImplementation<Integer> stackImplementation = new StackImplementation<>();
        stackImplementation.isEmpty();
        stackImplementation.push(70);
        stackImplementation.push(30);
        stackImplementation.push(56);
        stackImplementation.print();
        System.out.println();
        stackImplementation.pop();
        stackImplementation.print();
        System.out.println();
        stackImplementation.peek();
        stackImplementation.isEmpty();
        stackImplementation.size();
    }

}
