package Botee3;

public class Kor6 {
    public static void main(String[] args) {
        int[] a = {18,3,48,2,18,78,9};
        int[] b = {9,18,3,18,48,2,78};
        a = sort(a);
        b = sort(b);
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
    public static int[] sort(int[] a) {
        int temp = 0, i,k;
        for (i = 0; i < a.length; i++) {
            for (k = 0; k < i; k++) {
                if(a[i] < a[k]) {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        return a;
    }
}
