import java.util.Scanner;

public class week5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = scan.nextInt();
            }
        }
        middleWay(nums);
    }
    public static void middleWay(int[][] nums) {
        int len = nums.length;
        int[] middle = new int[len];
        for (int i = 0; i < len; i++) {
            int middleKey = nums[i].length / 2;
                middle[i] = nums[i][middleKey];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(middle[i] + " ");
        }
    }
}
