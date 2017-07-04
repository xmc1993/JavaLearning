package com.xmc.jianzhiOffer;

import java.util.Stack;

/**
 *
 * 包含min函数的栈
 * Created by xmc1993 on 2017/7/4.
 */
public class Q21 {

    public static void main(String[] args) {
        Q21 q21 = new Q21();
        q21.push(2);
        q21.push(4);
        q21.push(5);
        q21.push(6);
        q21.push(7);
        q21.push(1);
        System.out.println("min val: " + q21.min());
        q21.pop();
        System.out.println("min val: " + q21.min());
    }

    //主数据栈
    Stack<Integer> mStack = new Stack();
    //辅助数据栈
    Stack<Integer> aStack = new Stack();

    public int pop(){
        aStack.pop();
        return mStack.pop();
    }

    public void push(int val){
        mStack.push(val);
        if (aStack.isEmpty()) {
            aStack.push(val);
        }else {
            if (val < aStack.peek()) {
                aStack.push(val);
            }else {
                aStack.push(aStack.peek());
            }
        }
    }

    public int min(){
        return aStack.peek();
    }

}
