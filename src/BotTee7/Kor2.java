package BotTee7;

import java.util.Scanner;

public class Kor2 {
	public static void main(String[] args) {
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
		charial /= 3;
		int count = 0;
		int[] median = new int[a * (a +1) / 2];
		int[] mode = new int[a * (a +1) / 2];
		double medianValue = 0;
		double modeValue = 0;
		for(int i = 0; i < a; i++) {
			for(int u = 0; u < i + 1; u++) {
				median[count++] = x[i][u];
			}
		}
		sort(median);
		if((count / 2) % 1 == 0) {
			medianValue = median[count / 2];
		} else {
			int tmp = Integer.valueOf((count / 2));
			medianValue = (double) (median[tmp] + median[tmp + 1]) / 2;
		}

		count = 0;
		for(int i = 0; i < a; i++) {
			for(int u = i; u < a; u++) {
				mode[count++] = x[i][u];
			}
		}
		sort(mode);

		System.out.println(Moded(mode,count));
		System.out.println(medianValue);
		System.out.printf("%.2f",charial);
	}
	static void sort(int[] A) {
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
	static int Moded(int a[], int n) {
	      int maxValue = 0, maxCount = 0, i, j;
	      for (i = 0; i < n; ++i) {
			  int b = a[i],f = 0;
			  for (int k = 0; k < n; k++) {
				  if(a[k] == b) {
					  f++;
				  }
			  }
			  if(f > maxCount) {
				  maxValue = a[i];
				  maxCount = f;
			  }
	      }
	      return maxValue;
	   }
}
