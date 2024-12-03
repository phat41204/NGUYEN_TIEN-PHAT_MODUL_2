package stackandQueue;

import java.util.Stack;

public class practiceStack {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);
            if (sym == '(' || sym == '{' || sym == '[') {
                stack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
            }
            char left = stack.pop();

            if ((sym == ')' && left != '(') || (sym == '}' && left != '{') || (sym == ']' && left != '[')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
