package com.fuge;

/**
 * Created by dongfu on 17-7-14.
 */
public class ListNode<T extends Comparable<T>> {
    public T val;
    public ListNode<T> next = null;

    public ListNode(T val) {
        this.val = val;
    }
}
