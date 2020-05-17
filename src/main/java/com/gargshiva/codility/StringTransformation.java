package com.gargshiva.codility;


import java.util.Stack;

public class StringTransformation {
    public static void main(String[] args) {
        StringTransformation st = new StringTransformation();
        String op = st.solution("ABA");
        System.out.println(op);

        st.solution2("ABA");
    }

    public static void solution2(String str) {

        int len = str.length();
        Stack<Character> st = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char curr = str.charAt(i);
//if stack is empty then we simply add the character to stack
            if (st.isEmpty()) {
                st.push(curr);
            }
// if stack is not empty and we have 'A' as curr character we check the last
// top of stack which gives us last element and if it's 'B' then they cancel out
// so we pop the 'B' and we don't push 'A'
// but if it's not B then we have to push as they don't cancel out.
            else if (curr == 'A') {
                if (st.peek() == 'B') {
                    st.pop();
                } else {
                    st.push(curr);
                }
            } else if (curr == 'B') {
                if (st.peek() == 'A') {
                    st.pop();
                } else {
                    st.push(curr);
                }
            } else if (curr == 'C') {
                if (st.peek() == 'D') {
                    st.pop();
                } else {
                    st.push(curr);
                }
            } else if (curr == 'D') {
                if (st.peek() == 'C') {
                    st.pop();
                } else {
                    st.push(curr);
                }
            }
        }
        while (!st.isEmpty()) {
            result = result.append(st.peek());
            st.pop();
        }
        result.reverse();
        System.out.println(result);
    }

    public String solution(String s) {
        char[] arr = s.toCharArray();
        char previousChar = 'q';
        int previousCharIndex = -1;

        for (int i = 0; i < arr.length; ) {
            switch (arr[i]) {
                case 'A':
                    if (previousChar == 'B') {
                        arr[previousCharIndex] = 'n';
                        arr[i] = 'n';
                        i++;
                    } else {
                        if (i + 1 < arr.length && arr[i + 1] == 'B') {
                            arr[i] = 'n';
                            arr[i + 1] = 'n';

                            i = i + 2;
                        } else {
                            previousChar = arr[i];
                            previousCharIndex = i;
                            ++i;
                        }
                    }
                    break;


                case 'B':
                    if (previousChar == 'A') {
                        arr[previousCharIndex] = 'n';
                        arr[i] = 'n';
                        i++;
                    } else {
                        if (i + 1 < arr.length && arr[i + 1] == 'A') {
                            arr[i] = 'n';
                            arr[i + 1] = 'n';

                            i = i + 2;
                        } else {
                            previousChar = arr[i];
                            previousCharIndex = i;
                            ++i;
                        }
                    }
                    break;

                case 'C':
                    if (previousChar == 'D') {
                        arr[previousCharIndex] = 'n';
                        arr[i] = 'n';
                        i++;
                    } else {
                        if (i + 1 < arr.length && arr[i + 1] == 'D') {
                            arr[i] = 'n';
                            arr[i + 1] = 'n';

                            i = i + 2;
                        } else {
                            previousChar = arr[i];
                            previousCharIndex = i;
                            ++i;
                        }
                    }
                    break;

                case 'D':
                    if (previousChar == 'C') {
                        arr[previousCharIndex] = 'n';
                        arr[i] = 'n';
                        i++;
                    } else {
                        if (i + 1 < arr.length && arr[i + 1] == 'C') {
                            arr[i] = 'n';
                            arr[i + 1] = 'n';

                            i = i + 2;
                        } else {
                            previousChar = arr[i];
                            previousCharIndex = i;
                            ++i;
                        }
                    }
                    break;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; ++k) {
            if (arr[k] != 'n') {
                sb.append(arr[k]);
            }
        }
        return sb.toString();
    }
}
