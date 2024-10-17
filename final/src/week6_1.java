import java.util.Arrays;
public class week6_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(no23(nums));
    }
    public static boolean no23(int[] nums) {
        Arrays.stream(nums).filter(n -> n == 2 || n == 3).toArray();
        return nums.length == 0;
    }
}
