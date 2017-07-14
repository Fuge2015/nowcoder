package com.fuge;

import a.k.T;

import java.util.List;
import java.util.Stack;

/**
 * Created by dongfu on 17-3-26.
 */
public class BiTree {
    private BiTreeNode<T> biTreeNode;
    public BiTree() {

    }


//    public void create(List)

    public boolean isEmpty() {
        return biTreeNode == null;
    }

    public void inOrderTraverse() {
        Stack<BiTreeNode> stack = new Stack<>();
        stack.push(biTreeNode);
        while(!stack.empty()) {
            while(stack.peek() != null){
                stack.push(stack.peek().getLeftChild());
            }
            stack.pop();
            if (!stack.empty()) {
                BiTreeNode biTreeNode1 = stack.pop();
                System.out.println(biTreeNode1.getData());        //visit
                stack.push(biTreeNode1.getRightChild());
            }
        }
    }

    public void inOderTraverse2() {
        inOderTraverse2(biTreeNode);
    }

    private void inOderTraverse2(BiTreeNode biTreeNode) {
        if (biTreeNode != null) {
            inOderTraverse2(biTreeNode.getLeftChild());
            System.out.println(biTreeNode.getData());
            inOderTraverse2(biTreeNode.getRightChild());
        }
    }
}
