import java.math.BigInteger;
public class week10_1 {

        public static void main(String[] args) {
            BigInteger a = new BigInteger("10");
            BigInteger b = new BigInteger("100");
            System.out.println(countFibsInRange(a, b));

            a = new BigInteger("1234567890");
            b = new BigInteger("9876543210");
            System.out.println(countFibsInRange(a, b));
        }

        public static int countFibsInRange(BigInteger a, BigInteger b) {
            BigInteger f1 = BigInteger.ONE;
            BigInteger f2 = new BigInteger("2");
            int count = 0;
            while (f1.compareTo(b) <= 0) {
                if (f1.compareTo(a) >= 0) {
                    count++;
                }
                BigInteger next = f1.add(f2);
                f1 = f2;
                f2 = next;
            }
            return count;
        }
}
