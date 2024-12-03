package stackandQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Palindrome {
public static boolean IsPalindrome(String input) {
    String clearString = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < clearString.length(); i++) {
        char c = clearString.charAt(i);
        queue.add(c);
        stack.push(c);
    }
    while (!queue.isEmpty()) {
        if (queue.poll() != stack.pop()) {
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
