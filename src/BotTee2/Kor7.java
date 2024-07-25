package BotTee2;

import java.util.Scanner;

public class Kor7 {
    public static void main(String[] args) {
        int[] monthA = {31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        int monthS = 0;
        int year = 2566;
        int yearC = year - 2567;
        Scanner scan = new Scanner(System.in);
        int monthStart = scan.nextInt();
        if(monthStart < 0)
            return;
        int monthInput = scan.nextInt();
        for(int i = 0; i < monthStart + monthInput; i++) {
            day++;
            if(monthS == 1 && yearC % 4 == 0) {
                monthA[1] = 29;
            } else {
                monthA[1] = 28;
            }
            if(day > monthA[monthS]) {
                monthS++;
                day = 1;
            }
            if(monthS >= 12) {
                monthS = 0;
                year++;
                yearC++;
            }
        }
        System.out.println(day);
        System.out.println(monthS + 1);
        System.out.println(year);
    }
}
