package com.nowcent.Expr3;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/26 15:28
 */
public class MyLinkedList<T> implements LinkedList<T>{



    private int maximumIndex = -1;
    private Node<T> firstNode = null;

    @Override
    public boolean listEmpty() {
        return maximumIndex == -1;
    }

    @Override
    public int listLength() {
        return maximumIndex + 1;
    }

    @Override
    public synchronized T getElement(int index) {
        if(maximumIndex < index){
            return null;
        }

        Node<T> node = firstNode;
        for(int i = 0; i < index; i++){
            node = node.nextNode;
        }

        return node.data;
    }

    @Override
    public synchronized int locateElem(T e) {
        assert e != null;
        Node<T> node = firstNode;
        for (int i = 0; i < maximumIndex; i++) {
            if(e.equals(node)){
                return i;
            }
            node = node.nextNode;
        }

        return -1;
    }

    @Override
    public synchronized void listInsert(int index, T e) {
        assert index >= 0;

        //第一个节点未建立的情形
        if(maximumIndex == -1){
            if(index == 0){
                firstNode = new Node<>(e);
                maximumIndex = 0;
            }
            else{
                firstNode = new Node<>(null);
                Node<T> node = firstNode;
                for (int i = 0; i < index - 1; i++) {
                    node.nextNode = new Node<>(null);
                    node = node.nextNode;
                }
                node.nextNode = new Node<>(e);
                maximumIndex = index;
            }
        }
        else{
            if(index > maximumIndex){
                Node<T> node = firstNode;
                for (int i = 0; i < maximumIndex; i++) {
                    node = node.nextNode;
                }
                for (int i = maximumIndex; i < index - 1; i++) {
                    node.nextNode = new Node<>(null);
                    node = node.nextNode;
                }
                node.nextNode = new Node<>(e);
                maximumIndex = index;
            }
            else if(index == 0){
                Node<T> node = firstNode;
                firstNode = new Node<>(e);
                firstNode.nextNode = node;
                maximumIndex++;
            }
            else{
                Node<T> node = firstNode;
                for (int i = 0; i < index - 1; i++) {
                    node = node.nextNode;
                }

                Node<T> nextNode = node.nextNode;
                node.nextNode = new Node<>(e);
                node.nextNode.nextNode = nextNode;
                maximumIndex++;

            }
        }

    }

    @Override
    public synchronized T listDelete(int index) {
        assert index >= 0 && index <= maximumIndex;

        Node<T> deleteNode;
        if(index == 0){
            Node<T> node = firstNode;
            firstNode = firstNode.nextNode;
            deleteNode = node;
        }
        else if(index == maximumIndex){
            Node<T> node = firstNode;
            for (int i = 0; i < maximumIndex - 1; i++) {
                node = node.nextNode;
            }

            deleteNode = node.nextNode;
            node.nextNode = null;
        }
        else{
            Node<T> preNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                preNode = preNode.nextNode;
            }

            deleteNode = preNode.nextNode;

            preNode.nextNode = deleteNode.nextNode;
        }

        maximumIndex--;
        return deleteNode.data;
    }

    @Override
    public synchronized void listUpdate(int index, T e) {
        assert index >= 0 && index <= maximumIndex;
        Node<T> node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }

        node.data = e;
    }

    @Override
    public synchronized void clearList() {
        firstNode = null;
        maximumIndex = -1;
    }

    public synchronized T getHead(){
        Node<T> node = firstNode;
        if(node == null){
            return null;
        }

        for (int i = 0; i < maximumIndex; i++) {
            node = node.nextNode;
        }
        return node.data;
    }

    public void showList(){
        if(firstNode == null){
            System.out.println("No data in the list");
            return;
        }

        Node<T> node = firstNode;
        while(node.nextNode != null){
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
        System.out.print(node.data + " \n");

    }
}

class Node<T>{
    T data;
    Node<T> nextNode;

    public Node(T data){
        this.data = data;
    }
}


