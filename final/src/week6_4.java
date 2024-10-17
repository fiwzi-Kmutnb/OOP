public class week6_4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] numss = fix23(nums);
        for (int i = 0; i < 3; i++) {
            System.out.print(numss[i] + " ");
        }
    }
    public static int[] fix23(int[] nums) {
        if (nums.length == 3) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 2 && nums[i + 1] == 3) {
                    nums[i + 1] = 0;
                }
            }
        }
        return nums;
    }
}

