package BotTee2;

import java.util.Scanner;

public class Kor12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] tiles = new int[N][3];
        for (int i = 0; i < N; i++) {
            tiles[i][0] = scanner.nextInt(); // xi
            tiles[i][1] = scanner.nextInt(); // yi
            tiles[i][2] = scanner.nextInt(); // ri
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isOverlapping(tiles[i], tiles[j])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static double distance(int[] tile1, int[] tile2) {
        int x1 = tile1[0], y1 = tile1[1];
        int x2 = tile2[0], y2 = tile2[1];
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static boolean isOverlapping(int[] tile1, int[] tile2) {
        int r1 = tile1[2], r2 = tile2[2];
        return distance(tile1, tile2) <= r1 + r2;
    }
}