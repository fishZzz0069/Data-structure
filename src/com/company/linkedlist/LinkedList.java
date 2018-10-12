package com.company.linkedlist;

public class LinkedList<E> {

    private class Node{

        public E e;
        public Node next;

        public Node(E e , Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this.e = e;
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node dummyHead;
    private int size;

    public LinkedList(){

        dummyHead = new Node();
        size = 0;

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 在链表头添加新的元素e
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        add(0,e);
    }

    // add element in linkedlist
    public void add(int index , E e){

        if (index > size || index <0)
            throw new IllegalArgumentException("add failed");

        if(index == 0)
            addFirst(e);
        else {
            Node prev = dummyHead;
            for (int i = 0; i < index ; i++)
                prev = prev.next;


            prev.next = new Node(e,prev.next);
            size ++;
        }


    }

    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size, e);
    }

}
