public class week6_5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        System.out.println(start1(a, b));
    }
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }
}
