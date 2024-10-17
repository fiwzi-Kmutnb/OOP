import java.util.Scanner;

public class week5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        rotateLeft3(nums);
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotateLeft3(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;

    }
}
