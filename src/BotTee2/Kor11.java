package BotTee2;

import java.util.Scanner;

public class Kor11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 0 || n > 1000000)
            return;
        int sum = 0;
        int[] array = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            p = scan.nextInt();
            if(p < 0 || p > 1000)
                return;
            array[i] = p;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("%.2f",AVG(sum,n));
    }
    public static float AVG(float sum,float base) {
        if(base <= 0)
            return 0;
        return sum / base;
    }
}
