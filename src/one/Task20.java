package one;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("Input n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input [" + i + "]");
            myArray[i] = in.nextInt();
        }
        for (int i=0;i<n;i++){
            if(i%2!=0) myArray[i]= 0;
            System.out.println("Out [" +i+"] ["+ myArray[i] + "]");
        }
    }
}
