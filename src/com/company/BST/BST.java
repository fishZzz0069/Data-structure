package com.company.BST;

import com.company.linkedlist.LinkedListQueue;

public class BST<E extends Comparable<E>> {

    private class Node{

        public E e;
        public BST.Node left , right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }

    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    //向以node为根的二分搜索树中插入元素e，递归算法
    public void addElements(Node node,E e){

        if (e.equals(node.e))
            return;

        if (e.compareTo(node.e)<0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e)>0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e)<0)
            addElements(node.left,e);
        if (e.compareTo(node.e)>0)
            addElements(node.right,e);

    }


}
