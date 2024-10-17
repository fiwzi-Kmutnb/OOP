public class week7_5 {
    public static void main(String[] args) {
        String str = "Chocolate";
        int n = 2;
        System.out.println(frontTimes(str, n));
    }

    public static String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        if (n <= 0) {
            return "";
        }
        return front + frontTimes(str, n - 1);
    }
}
