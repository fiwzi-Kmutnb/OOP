import java.util.Scanner;

public class week5_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        sum2(nums);
    }
    public static void sum2(int[] num) {
        if (num.length == 0) {
            System.out.println(0);
        } else if (num.length == 1) {
            System.out.println(num[0]);
        } else {
            System.out.println(num[0] + num[1]);
        }
    }
}
