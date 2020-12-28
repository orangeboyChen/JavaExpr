package com.nowcent.Expr4;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/26 17:15
 */
public class BTree<T extends Comparable<T>> {

    private BTNode<T> root;

    private int nodeTotal = 0;

    public void createBTree(T[] valueList){
        assert valueList != null && valueList.length > 0;
        root = new BTNode<T>(valueList[0]);

        for (int i = 1; i < valueList.length; i++) {
            T listData = valueList[i];
            BTNode<T> node = root;
            while(true){
                assert node.data.compareTo(listData) != 0;
                if(node.data.compareTo(listData) > 0){
                    if(node.leftChild != null){
                        node = node.leftChild;
                    }
                    else{
                        node.leftChild = new BTNode<>(listData);
                        break;
                    }
                }
                else{
                    if(node.rightChild != null){
                        node = node.rightChild;
                    }
                    else{
                        node.rightChild = new BTNode<>(listData);
                        break;
                    }
                }

            }
        }
        nodeTotal = valueList.length;

    }

    public void destroyBTree(){
        root = null;
    }

    public BTNode<T> findNode(T element){
        BTNode<T> node = root;

        if(node.data.equals(element)){
            return root;
        }

        while(node != null && !node.data.equals(element)){
            if(node.data.compareTo(element) > 0){
                node = node.leftChild;
            }
            else{
                node = node.rightChild;
            }
        }

        return node != null && node.data.equals(element) ? node : null;
    }

    public BTNode<T> findLChildNode(BTNode<T> node){
        return node.leftChild;
    }

    public BTNode<T> findRChildNode(BTNode<T> node){
        return node.rightChild;
    }

    public int getBTHeight(){
        return getBTHeight(root);
    }

    private int getBTHeight(BTNode<T> node){
        if(node == null){
            return 0;
        }

        int leftMax = getBTHeight(node.leftChild) + 1;
        int rightMax = getBTHeight(node.rightChild) + 1;

        return Math.max(leftMax, rightMax);
    }

    public String preOrder(){
        return preOrder(root);
    }

    private String preOrder(BTNode<T> node){
        if(node == null){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

//        System.out.print(node.data + " ");
        stringBuilder.append(node.data).append(" ");
        stringBuilder.append(preOrder(node.leftChild));
        stringBuilder.append(preOrder(node.rightChild));
        return stringBuilder.toString();
    }

    public String inOrder(){
        return inOrder(root);
    }

    private String inOrder(BTNode<T> node){
        if(node == null){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(inOrder(node.leftChild));
        stringBuilder.append(node.data).append(" ");
//        System.out.print(node.data + " ");
        stringBuilder.append(inOrder(node.rightChild));
        return stringBuilder.toString();
    }

    public String postOrder(){
        return postOrder(root);
    }

    private String postOrder(BTNode<T> node){
        if(node == null){
            return "";
        }

        //        System.out.print(node.data + " ");
        return postOrder(node.leftChild) +
                postOrder(node.rightChild) +
                node.data + " ";
    }

    public String levelOrder() {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<BTNode<T>> queue = new LinkedBlockingQueue<>(nodeTotal);
        queue.add(root);
        do{
            BTNode<T> targetNode = queue.poll();
            assert targetNode != null;
            stringBuilder.append(targetNode.data).append(" ");

            if(targetNode.leftChild != null){
                queue.add(targetNode.leftChild);
            }
            if(targetNode.rightChild != null){
                queue.add(targetNode.rightChild);
            }
        }while(queue.size() > 0);

        return stringBuilder.toString();
    }

}

class BTNode<T extends Comparable<T>>{
    T data;
    BTNode<T> leftChild;
    BTNode<T> rightChild;

    BTNode(T data, BTNode<T> leftChild, BTNode<T> rightChild){
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    BTNode(T data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "BTNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
