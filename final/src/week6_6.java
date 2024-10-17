public class week6_6 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] result = biggerTwo(a, b);
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }
    }
}
