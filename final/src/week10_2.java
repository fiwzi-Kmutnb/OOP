import java.util.Scanner;

public class week10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();
        System.out.println(S(p, q));
    }

    public static int F(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        if (digit > 0) {
            return digit;
        }
        return F(n / 10);
    }

    public static int S(int p, int q) {
        int sum = 0;
        for (int i = p; i <= q; i++) {
            sum += F(i);
        }
        return sum;
    }
}
