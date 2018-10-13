package com.company.linkedlist;

import com.company.Stack;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E Peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args){

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();


        for (int i = 0 ; i < 5 ; i++){
            linkedListStack.push(i);
        }

        linkedListStack.pop();
        System.out.println(linkedListStack.toString());
    }
}
