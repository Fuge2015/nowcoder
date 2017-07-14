package com.fuge;

/**
 * Created by dongfu on 17-7-14.
 */
public class DeleteNode {
    public ListNode<Integer> deleteNode(ListNode<Integer> head, ListNode<Integer> p) {
        if (head == null || p == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        if (p.next == null) {
            ListNode<Integer> q = head;
            while (q.next != p) {
                q = q.next;
            }
            q.next = null;
        } else {
            p.val = p.next.val;
            p.next = p.next.next;
        }
        return head;
    }
}
