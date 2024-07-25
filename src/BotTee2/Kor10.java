package BotTee2;

import java.util.Scanner;

public class Kor10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int hour = 0,minute = 0;
            String time;
            time = scan.nextLine();
            String[] timeS = time.split(":");
            if(timeS.length != 2) {
                return;
            }
            hour = Integer.valueOf(timeS[0]);
            minute = Integer.valueOf(timeS[1]);
            if(hour > 24 || hour < 0) {
                return;
            }
            if(minute > 60 || minute < 0) {
                return;
            }
            double d = hour % 12 * 5 + (minute / 12.0);
            System.out.println(String.format("%.0f",d) );
            System.out.println(minute);
        }
    }
