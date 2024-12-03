package stackandQueue;

import java.util.Stack;

public class DaoNguocStack {
    public static void DaoNguoc(int[] index) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < index.length; i++) {
            stack.push(index[i]);
        }
        for (int i = 0; i < index.length; i++) {
            index[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] index = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("array before reverser");
   for (int num : index) {
       System.out.print(num + " ");
   }
   DaoNguoc(index);
   System.out.println("\narray after reverser");
   for (int num : index) {
       System.out.print(num + " ");
   }
    }
}
