package one;

import java.util.Scanner;

public class Task16 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double[] a = new double[1000];
        double max;
        System.out.println("Input n");
        int n = in.nextInt();
        System.out.println("Input "+n+"element array");
        for (int i=0;i<n;i++) a[i]=in.nextInt();
            max=a[0]+a[n-1];
        for (int i=1;i<n/2;i++)
            if ((a[i]+a[n-i-1])>max)  max=a[i]+a[n-i-1];
        System.out.println("max="+max);
    }
}
