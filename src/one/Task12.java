package one;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i]= random.nextInt(100) + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    sum+=a[i];
                }
            }
        }
        System.out.println(sum);
    }
}
