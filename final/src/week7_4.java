public class week7_4 {
    public static void main(String[] args) {
        String str = "Hi";
        int n = 2;
        System.out.println(stringTimes(str, n));
    }
    public static String stringTimes(String str, int n) {
        if (n <= 0) {
            return "";
        }
        return str + stringTimes(str, n - 1);
    }
}
