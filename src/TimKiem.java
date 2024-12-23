import java.util.*;

public class TimKiem {
    public void Searching(String word) {
        Set<Character> Uniquechars = new TreeSet<>();
        for (char c : word.toCharArray()) {
            Uniquechars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character c : Uniquechars) {
            result.append(c);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        TimKiem tim = new TimKiem();
        tim.Searching(word);
    }
}

