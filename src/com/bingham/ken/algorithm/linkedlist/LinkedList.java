package com.bingham.ken.algorithm.linkedlist;

public class LinkedList  {

    private Node head;
    private Node tail;

    class Node {

        int data;
        Node previous;
        Node next;

        Node(int data){

            this.data = data;
            previous = null;
            next = null;
        }
    }

    public Node newNode(int data){

        Node node = new Node(data);
        return node;
    }

    public void addNode(int data){

        Node newNode = newNode(data);

        if( head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display(){

         Node currentNode = head;

         if(currentNode == null){

             System.out.println("List is empty");
             return;
         }

         while(currentNode != null){

             System.out.println( currentNode.data + " ");
             currentNode = currentNode.next;
         }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);

        list.display();

        System.out.println("head = " + list.head.data);
        System.out.println("tail = " + list.tail.data);
    }
}
