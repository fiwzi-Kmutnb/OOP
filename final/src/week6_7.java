public class week6_7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] numss = makeMiddle(nums);
        for (int i = 0; i < 2; i++) {
            System.out.print(numss[i] + " ");
        }
    }
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }
}
