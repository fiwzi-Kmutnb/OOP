package BotTee4.test;

import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(fac(scan.nextInt()));
    }

    public static int fac(int x) {
        if (x == 2)
            return 2;
        return x * fac(x - 1);
    }
}
