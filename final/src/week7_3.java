import java.util.Scanner;
public class week7_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double result = sum(x, n, 1);
        System.out.println("Sum(" + x + ", " + n + ") = " + result);
    }

    public static double sum(int x, int n, int i) {
        if (i > n) {
            return 0;
        }
        return Math.pow(x, i) / i + sum(x, n, i + 1);
    }
}
