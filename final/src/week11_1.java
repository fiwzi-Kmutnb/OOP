public class week11_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] numss = swapEnds(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(numss[i] + " ");
        }
    }
    public static int[] swapEnds(int[] nums) {
        if (nums.length >= 1) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
}
