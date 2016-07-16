package com.jayqqaa12.statck;


import java.util.Stack;

/**
 *实现Queue 使用stack
 *
 * 难度1星
 */
class Solution232 {

    Stack<Integer> input     =new Stack();
    Stack<Integer> output = new Stack();


    public void push(int x) {
        input.push(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        peek();
        output.pop();
    }

    // Get the front element.
    public int peek() {

        if(output.isEmpty())
        while (!input.isEmpty())
            output.push(input.pop());
        return  output.peek();
    }

    public int top() {
        return  output.peek();
    }
    public boolean empty() {
        return input.isEmpty()&&output.isEmpty();
    }
}