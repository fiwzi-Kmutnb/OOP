package Botee3;

public class Kor5 {
    public static void main(String[] args) {
        System.out.println(more14(new int[]{1,4,1,4}));
    }

    public static boolean more14(int[] a) {
        int count1 = 0, count4 = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i] == 1)
                count1++;
            if(a[i] == 4)
                count4++;
        }
        return count1 > count4;
    }
}
