package com.wnswdwy.niuke.stack;

import java.util.Stack;

/**
 * @author yycstart
 * @create 2021-02-05 13:18
 */
public class _30_IncludeMinFunctionStack {




        /** initialize your data structure here. */

        Stack<Integer> A,B;
        public _30_IncludeMinFunctionStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            //判断当前元素和栈内最小元素对比
            A.add(x);
            if(B.empty() || B.peek() >= x)
                B.add(x);
        }

        public void pop() {
            //栈顶元素是不是最小的
            if(A.pop().equals(B.peek()))
                B.pop();
        }

        public int top() {
            //直接写
            return A.peek();
        }

        public int min() {
            //找到栈内最小的元素， 直接写
            return B.peek();
        }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
