package stackandQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Palindrome {
public static boolean IsPalindrome(String input) {
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        queue.add(c);
        stack.push(c);
    }
    while (!queue.isEmpty()) {
        if (queue.peek() != stack.pop()) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        String input = "able was i ere i saw elba";
        if (IsPalindrome(input)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
