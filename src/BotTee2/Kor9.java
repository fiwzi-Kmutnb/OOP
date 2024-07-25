package BotTee2;

import java.util.Scanner;

public class Kor9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] data  = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }
        int[] position = {
                scan.nextInt(),
                scan.nextInt()
        };
        for (int i = 0; i < n; i++) {
            switch (data[i] % 4) {
                case 1:
                    position[1] += 1;
                    break;
                case 2:
                    position[0] -= 1;
                    break;
                case 3:
                    position[0] += 1;
                    break;
                case 0:
                    position[1] -= 1;
                    break;
            }
        }
        System.out.println(position[0] + " " + position[1]);
    }
}
