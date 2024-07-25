package BotTee3;

import java.util.Scanner;

public class Kor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(sumDouble(scan.nextInt(),scan.nextInt()));
    }
    public static int sumDouble(int a, int b){
        if(a == b)
            return (a + b) * 2;
        return a + b;
    }
}
