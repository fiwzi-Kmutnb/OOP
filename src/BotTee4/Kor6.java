package BotTee4;

import java.util.Scanner;

public class Kor6 {
    public static void main(String[] args) {
        recuuss a = new recuuss();
        a.recu(new int[]{10,3,6,7,5,3,5,6,2,9,1},0,5);
    }

}

class recuuss {
     int recu(int[] x, int index,int search) {
        if(x.length - 1 == index)
            return 0;
        if(x[index] == search) 
            System.out.print("Key found at position: " + index + " ");
        return recu(x, index + 1, search);
    }
}