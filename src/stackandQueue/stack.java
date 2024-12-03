package stackandQueue;

import java.util.Stack;

public class stack {
    public  static  String decimalToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();
        if (decimalNumber  ==  0) {
            return "0";
        }
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }
        return binaryNumber.reverse().toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 50 ;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(binaryNumber);
    }
}
