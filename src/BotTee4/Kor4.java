package BotTee4;

import java.util.Scanner;

public class Kor4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        recuu a = new recuu();
        System.out.println(a.recu(scan.nextInt()));
    }
}

class recuu {
    public int recu(int x) {
        if(x <= 0) 
            return x;
        return (x % 10) + recu(x / 10);
    }
}