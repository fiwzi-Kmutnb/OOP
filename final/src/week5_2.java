import java.util.Scanner;

public class week5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        revsere(nums);
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
        }
        public static void revsere(int[] nums) {
            int[] reversed = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                reversed[i] = nums[nums.length - 1 - i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reversed[i];
            }
        }
    }
