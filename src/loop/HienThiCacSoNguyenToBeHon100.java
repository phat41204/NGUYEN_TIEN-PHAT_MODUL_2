package loop;

public class HienThiCacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố bé hơn 100 là:  ");
        for (int num = 2; num < 100; num++) {
            if (Isprime(num)) {
                System.out.println(num);
            }
        }

    }

    public static boolean Isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



