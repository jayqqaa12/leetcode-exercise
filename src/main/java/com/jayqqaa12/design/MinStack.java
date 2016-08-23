package com.jayqqaa12.design;

import java.util.Stack;

/**
 *
 * 难度1星
 *
 */
public class MinStack {

    Stack<Integer>  stack = new Stack<>();
    Stack<Integer>  minStack = new Stack<>();


    public void push(int number) {
        stack.push(number);
        if (minStack.isEmpty() || number <= minStack.peek()) {
            minStack.push(number);
        }
    }

    public int pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return stack.pop();
    }
    
    public int min() {
        return minStack.peek();
    }

}