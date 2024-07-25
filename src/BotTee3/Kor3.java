package BotTee3;

import java.util.Scanner;

public class Kor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(diff21(scan.nextInt()));
    }
    public static int diff21(int x){
        int a = x > 21 ? x - 21 : 21 - x;
        return x > 21 ? a * 2 : a;
    }
}
