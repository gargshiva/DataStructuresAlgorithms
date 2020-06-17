package com.gargshiva.leetcode.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        System.out.println(vp.isValid("())"));
    }

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        boolean isBal = true;

        for (int i = 0; i < s.length(); ++i) {
            if (isOpening(arr[i])) {
                st.push(arr[i]);
            } else if (!st.isEmpty()) {
                char c = st.pop();
                boolean isMatched = true;
                switch (c) {
                    case '(':
                        if (arr[i] != ')') isMatched = false;
                        break;
                    case '{':
                        if (arr[i] != '}') isMatched = false;
                        break;
                    case '[':
                        if (arr[i] != ']') isMatched = false;
                        break;
                }

                if (!isMatched) {
                    isBal = false;
                    break;
                }
            } else {
                isBal = false;
                break;
            }
        }

        if (!st.isEmpty()) {
            isBal = false;
        }
        return isBal;
    }


    private boolean isOpening(char ch) {
        return (ch == '(' || ch == '{' || ch == '[');
    }


}
