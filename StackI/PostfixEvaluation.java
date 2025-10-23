package StackI;

import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args) {

    }
    class Solution {
        public int evaluatePostfix(String[] arr) {
            Stack<Integer> st = new Stack<>();

            for (String token : arr) {
                if (isOperator(token)) {
                    int b = st.pop();
                    int a = st.pop();
                    int res = 0;

                    switch (token) {
                        case "^":
                            res = (int) Math.pow(a, b);
                            break;
                        case "+":
                            res = a + b;
                            break;
                        case "-":
                            res = a - b;
                            break;
                        case "*":
                            res = a * b;
                            break;
                        case "/":
                            int div = a / b;
                            if (a * b < 0 && a % b != 0) div--;  // floor division
                            res = div;
                            break;
                    }

                    st.push(res);
                } else {
                    st.push(Integer.parseInt(token));
                }
            }

            return st.pop();
        }

        private static boolean isOperator(String s) {
            return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
        }
    }

}
