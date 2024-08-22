package BotTee4;

import java.util.Scanner;

public class Kor7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n > 1000000 || n < 0) 
            return ;    
        double[] data = new double[n];
        recuuccc p = new recuuccc();
        int i,x;
        for (i= 0; i < n; i++) {
            x = scan.nextInt();
            if(x > 1000 || x < 0) 
                return;
            data[i] = x;
        }
        System.out.printf("%.2f",p.recu(data, 0));
    }
}

class recuuccc {
     double recu(double[] x,int index) {
        if(x.length - 1 == index)
            return x[index] / x.length;
        return x[index] / x.length + recu(x, index + 1);
    }
}