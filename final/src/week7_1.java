public class week7_1 {
    public static void main(String[] args) {
        int data = gcd(2,5,8);
//        int data = lcm(50,44,90);
        System.out.println(data);
    }
    static int gcd(int v1,int v2,int v3) {
        return gcd(gcd(v1, v2), v3);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int v1,int v2,int v3) {
        return lcm(lcm(v1, v2), v3);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
