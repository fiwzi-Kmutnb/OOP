package Botee3;

import java.util.Scanner;

public class Kor8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x > 1000 || x < 0) {
            System.out.println("Out of range");
            return;
        }
        System.out.println(sumAt(x));
    }
    public static int sumAt(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
