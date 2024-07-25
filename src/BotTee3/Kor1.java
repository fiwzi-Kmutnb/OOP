package Botee3;

import java.util.Scanner;

public class Kor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(makes(scan.nextInt(),scan.nextInt()));

    }
    public static boolean makes(int a, int b) {
        if(a == 10 || b == 10)
            return true;
        return a + b == 10;
    }
}
