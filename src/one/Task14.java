package one;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i]= random.nextInt(100) + 1;
        }
        double max = a[1];
        double min = a[0];
        for (int i=1;i<n;i+=2){
            if(max<a[i]) max = a[i];
        }
        for (int i=0;i<n;i+=2)
            if (min>a[i]) min = a[i];
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
