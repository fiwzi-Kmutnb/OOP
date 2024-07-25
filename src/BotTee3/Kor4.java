package BotTee3;

import java.util.Scanner;

public class Kor4 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }

    public static boolean sum28(int[] a) {
        int sum = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i] == 2)
                sum += a[i];
        }
        return sum == 8;
    }
}
