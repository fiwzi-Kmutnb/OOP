import java.util.Scanner;

public class week5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        maxEnd3(nums);
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
    }
}
