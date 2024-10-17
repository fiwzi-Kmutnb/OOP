public class week6_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] numss = makeLast(nums);
        for (int i = 0; i < nums.length * 2; i++) {
            System.out.print(numss[i] + " ");
        }
    }
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
}
