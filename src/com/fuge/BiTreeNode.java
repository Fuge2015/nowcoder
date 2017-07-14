package com.fuge;

/**
 * Created by dongfu on 17-3-26.
 */
public class BiTreeNode<T> {
    private T data;
    private BiTreeNode<T> leftChild;
    private BiTreeNode<T> rightChild;

    public BiTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BiTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BiTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BiTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BiTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
