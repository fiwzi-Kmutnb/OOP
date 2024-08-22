package BotTee7;
import java.util.Scanner;

public class Kor1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(),b = scan.nextInt(),c = scan.nextInt();
		if(a > 20 || a < 1)
			return;

		if(b > 10|| c > 10)
			return;
		
		int sum1 = b, sum2 = c;
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				b = b + c;
				sum1 += b;
			} else {
				c = b + c;
				sum2 += c;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
