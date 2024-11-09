package loop;

public class hienthi20songuyento {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean Isprime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    Isprime = false;
                    break;
                }
            }
            if (Isprime) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
