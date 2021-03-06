package com.fuge;

import java.util.Stack;

/**
 * Created by dongfu on 17-3-27.
 */
public class QueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()) {
            return stack2.pop();
        }
        if (!stack1.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
