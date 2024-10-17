public class week5_6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        makeEnds(nums);
        for (int i = 0; i < 2; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void makeEnds(int[] nums) {
        int[] ends = new int[2];
        ends[0] = nums[0];
        ends[1] = nums[nums.length - 1];
        for (int i = 0; i < 2; i++) {
            nums[i] = ends[i];
        }
    }
}
