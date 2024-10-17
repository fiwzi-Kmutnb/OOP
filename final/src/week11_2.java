import java.util.Scanner;

public class week11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("The maximum product is " + maxProduct(S) + ".");
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = 0;
        int currentMax = 1;
        int currentMin = 1;

        for (int num : nums) {
            if (num == 0) {
                currentMax = 1;
                currentMin = 1;
                continue;
            }

            int temp = currentMax * num;
            currentMax = Math.max(num, Math.max(temp, currentMin * num));
            currentMin = Math.min(num, Math.min(temp, currentMin * num));

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}