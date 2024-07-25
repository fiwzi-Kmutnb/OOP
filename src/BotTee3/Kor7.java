package BotTee3;

import java.util.Scanner;

public class Kor7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        if(a > 200 || b > 200 || a < 0 || b < 0) {
            System.out.println("Out of range");
            return;
        }
        System.out.println(pow(a,b));

    }
    public static int pow(int a, int b) {
        int sum = 1;
        for (int i = 0; i < b; i++) {
            sum *= a;
        }
        return sum;
    }

}
