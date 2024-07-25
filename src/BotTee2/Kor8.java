package BotTee2;

import java.util.Scanner;

public class Kor8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        if(x1 < -1000 || y1 < -1000 || x1 > 1000 || y1 > 1000) {
            return;
        }

        double m = scan.nextDouble();
        double n = scan.nextDouble();

        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();

        if (x1 <= x0 && x0 <= x1 + m && y1 <= y0 && y0 <= y1 + n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
