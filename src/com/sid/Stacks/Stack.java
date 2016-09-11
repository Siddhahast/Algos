package com.sid.Stacks;

import root.sid.linkedlist.Node;

/**
 * Created by siddhahast on 11/9/16.
 */
public class Stack {

    private int elems = 0;
    private int size = 0;
    public Node top;

    public Stack(int size){
        this.size = size;

    }

    public void add(Node node){
        if(top == null){
            top = node;
        }

        else{
            Node curr = top;
            while(curr.next()!=null){
                curr = curr.next();
            }
            curr.setNext(node);
        }
        elems++;
    }

    /*
    API for adding an elemnt to a stack recurssively.
    Can be extended to any data-structure
     */
    public void addBottom(Node node, Node newNode){
        if(node.next() == null){
            node.setNext(newNode);
            return;
        }else{
            addBottom(node.next(), newNode);
        }

    }

    public void printStack(Node node){
        if(node==null){
            return;
        }else{
            System.out.println(node.get_data());
            printStack(node.next());
        }
    }

    /**
     * API for printing the stack in reverse order
     * Generic Recurssion for any datastructure
     * @param node
     */
    public void printreverse(Node node){
        if(node.next()== null){
            System.out.println(node.get_data());
        }else{
            printreverse(node.next());
            System.out.println(node.get_data());
        }
    }
}
