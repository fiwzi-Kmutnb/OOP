package BotTee2;

import java.util.Scanner;

public class Kor6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x < 0 || x > 1000) {
            System.out.println("Out of range");
            return;
        }
        scan.close();
        int p = 0;
        int divider = 10;
        while (x > 0) {
            p += x % divider;
            x = x / 10;
        }
        System.out.println(p);
    }
}