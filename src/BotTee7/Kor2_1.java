package BotTee7;


import java.util.Arrays;
import java.util.Scanner;

class as {
	int Moded(int[][] x, int n,int hc) {
		int maxCount = 0;
	    int mode = 0, b = 0, a = x.length;
	    int[] count = new int[1000]; 
		int[] mode1 = new int[hc];

		for(int i = 0; i < a; i++) {
			for(int u = 0; u < i + 1; u++) {
				mode1[b++] = x[i][u];
			}
		}
		sort(mode1);

	    for (int i = 0; i < n; i++) {
	        count[mode1[i]] += 1;
	    }

	    for (int i = 0; i < count.length; i++) {
	        if (count[i] > maxCount) {
	            maxCount = count[i];
	            mode = i;
	        }
	    }

	    return mode;
	   }
		double Median(int[][] x, int hc) {
			int[] median = new int[hc];
			double medianValue = 0, hch = 0;
			int a = x.length;
			int count = 0;
					for(int i = 0; i < a; i++) {
						for(int u = i; u < a; u++) {
					median[count++] = x[i][u];
				}
			}
			sort(median);
			hch = ((double)hc /(double) 2) % 1;
			if(hch <= 0) {
				medianValue = (double)(median[(hc / 2) -1] + median[(hc / 2) ]) / 2;
			} else {
				int tmp = Integer.valueOf((hc / 2));
				medianValue = median[tmp];
			}
			return medianValue;
		}

		void sort(int[] A) {
		int n = A.length;
		for(int i = 0; i < n; i++) {
			for(int u = i + 1; u < n; u++) {
				if(A[i] > A[u])
	            {
	                int temp = A[i];
	                A[i] = A[u];
	                A[u] = temp;
	            }
			}
		}
	} 
}

public class Kor2_1 {
	public static void main(String[] args) {
		as AS = new as();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a > 100 || a < 2)
			return;
		int[][] x = new int[a][a];
		double charial = 0;
		for(int i = 0; i < a; i++) {
			for(int u = 0; u < a; u++) {
				x[i][u] = scan.nextInt();
				if(i == u)
					charial += x[i][u];
			}
		}	
		charial /= a;
		int hc = a * (a + 1) / 2;
		double medianValue = AS.Median(x, hc);
		double modeValue = AS.Moded(x,a,hc);

		System.out.println(modeValue);
		System.out.println(medianValue);
		System.out.printf("%.2f",charial);
	}
}
