package BotTee4;

import java.util.Scanner;

public class Kor5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hj = scan.nextInt();
        int[] a = new int[hj];
        recuus h = new recuus();
        for (int i = 0; i < hj; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(h.recu(a,0,0 ));
    }
}

class recuus {
    int recu(int[] x, int index,int big) {
        if(x.length - 1 == index)
            return big >= x[index] ? big : x[index];
        return x[index] >= big ? recu(x, index + 1, x[index]) : recu(x, index + 1, big);
        
    }
}